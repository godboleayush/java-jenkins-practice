pipeline {
    agent any
    tools {
        maven 'Maven 3' // Ensure you have Maven set up in Jenkins' Global Tool Configuration
    }
    stages {
        stage('Build') {
            steps {
                script {
                    echo 'Building the Java project with Maven'
                    sh 'mvn clean install'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    echo 'Running tests'
                    sh 'mvn test'
                }
            }
        }
    }
    post {
        success {
            echo 'Build and tests were successful!'
        }
        failure {
            echo 'Build or tests failed.'
        }
    }
}
