pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the Git repository
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Compile the Java code
                sh 'javac src/Calculator.java'
            }
        }

        stage('Test') {
            steps {
                // Run unit tests (if you have any)
                // You may need to modify this step based on your testing framework
                sh 'java -cp src org.junit.runner.JUnitCore CalculatorTest'
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
