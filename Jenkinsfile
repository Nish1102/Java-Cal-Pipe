pipeline {
    agent {
        docker {
            image 'openjdk:11' // Use an OpenJDK 11 image
        }
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                script {
                    // Compile and run tests for the Java code
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
            echo 'Pipeline succeeded!'
            // Add additional actions here for a successful build
        }

        failure {
            echo 'Pipeline failed!'
            // Add actions to take in case of failure, such as sending notifications or rolling back deployments
        }
    }
}

