pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Run') {
            steps {
                script {
                    def isWindows = isUnix() ? false : true

                    if (isWindows) {
                        bat 'javac Calculator.java'
                        bat 'java Calculator'
                    } else {
                        sh 'javac Calculator.java'
                        sh 'java Calculator'
                    }
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline succeeded!'
            // Add additional actions here for a successful build
        }

        failure {
            echo 'Pipeline failed!'
            // Add actions to take in case of failure, such as sending notifications or rolling back deployments
        }
    }
}
