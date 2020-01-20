node {

    properties([pipelineTriggers([pollSCM('* * * * *')])])
    
    try{
    
        stage('Pull changes'){
            git url: 'https://github.com/sobraljuanpa/tallerJenkins.git', credentialsId: 'github'
        }
    
        stage('Setup environment'){
            sh 'chmod 777 deploy.sh && ./deploy.sh'
            try{
                sh 'python3 manage.py shell -c "from django.contrib.auth.models import User; User.objects.create_superuser(\'admin\', \'admin@example.com\', \'admin\')"'    
            } catch(error) {
                
            }
        }
    
        stage('Run unit tests'){
            sh 'python3 manage.py test'
        }
    
        stage('Deploy app locally'){
            sh 'python3 manage.py runserver 0.0.0.0:7000 &'
        }
    
        stage('Run automated UI tests'){
            sh 'echo runningUITests'
        }
    
        stage('Run performance tests'){
            sh 'bzt perfTests.yml'
            perfReport filterRegex: '', sourceDataFiles: 'taurusResults.xml'
        }
        
    } catch(error){
        
        throw e
        
    } finally{
        
        stage('Stop running application'){
            sh 'killall python3'
        }
    
        stage('Notify recipients'){
            emailext attachLog: true, 
             attachmentsPattern: '**/allure-report/data/behaviors.json',
             body: 'Job ${JOB_NAME} build ${BUILD_NUMBER}\n More info at: ${BUILD_URL}',
             subject: 'Commit ${CHANGES_SINCE_LAST_BUILD}', 
             to: 'juan.sobral@abstracta.com.uy'
        }
    }

}