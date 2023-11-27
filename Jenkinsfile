pipeline {
    agent any

    stages {
        stage('Build and Run') {
            steps {
                script {
                    // Compile and run Java code
                    sh 'javac src/Calculator.java'
                    sh 'java -cp src Calculator'
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
