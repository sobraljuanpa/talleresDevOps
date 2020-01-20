node {

    properties([pipelineTriggers([pollSCM('* * * * *')])])
    
    stage('Pull changes'){
            git url: 'https://github.com/sobraljuanpa/talleresDevOps.git', credentialsId: 'github'
        }
    
        stage('Setup environment'){
            sh 'chmod 777 deploy.sh && ./deploy.sh'
            try{
                sh 'python3 manage.py shell -c "from django.contrib.auth.models import User; User.objects.create_superuser(\'admin\', \'admin@example.com\', \'admin\')"'    
            } catch(error) {
                
            }
        }
    
        stage('Run unit tests'){
            sh ''
        }
    
        stage('Deploy app locally'){
            sh ''
        }
    
        stage('Run automated UI tests'){
            sh ''
        }
    
        stage('Run performance tests'){
            sh ''
        }

        stage('Stop running application'){
            sh ''
        }

}