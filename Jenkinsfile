pipeline {
    agent {
        docker {
            image 'openjdk:11' // Use an OpenJDK 11 image
        }
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the Git repository
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                // Compile and run tests for the Java code
                script {
                    sh 'javac src/Calculator.java'
                    sh 'java -cp src org.junit.runner.JUnitCore CalculatorTest'
                }
            }
        }

        stage('Deploy') {
            steps {
                // You can add deployment steps here
                // For a simple Java application, deployment may involve copying the compiled classes to a specific location
                // or creating a JAR file
            }
        }
    }

    post {
        success {
            // This block will be executed if the pipeline is successful
            echo 'Pipeline succeeded!'

            // You can add additional actions here, such as sending notifications or triggering other jobs
        }

        failure {
            // This block will be executed if the pipeline fails
            echo 'Pipeline failed!'

            // You can add actions to take in case of failure, such as sending notifications or rolling back deployments
        }
    }
}
