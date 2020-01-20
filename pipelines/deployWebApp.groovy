node {
    
    stage('Pull changes'){
        git url: 'https://github.com/sobraljuanpa/talleresDevOps.git', credentialsId: 'github'
    }

    stage('Setup environment'){
        sh 'chmod 777 deploy.sh && ./deploy.sh'
    }
    
    stage('Deploy app locally'){
        sh 'echo deployandoApp'
    }
    
    stage('Stop running application'){
        input 'Stop server?'
        sh 'killall python3'
    }
    
}