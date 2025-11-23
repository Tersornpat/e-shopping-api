pipeline{
    agent any

    stages {
        stage('Build') {
            steps {
            sh  '''
                echo "Starting build"
                echo "Build Completed"
                '''
            }
        }
        stage('Test') {
            steps {
                sh  'echo Test'
            }
        }
        stage('Push') {
            steps {
                sh  'echo Push'
            }
        }
        stage('Deploy') {
            steps {
            sh  '''
                echo "Starting Deploy"
                echo "Deploy Completed"
                '''
            }
        }
    }
}