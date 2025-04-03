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
        stage('Deploy') {
            steps {
                // Deploy the jar (replace this with your local deployment method)
                script {
                    sh "java -jar target/demoProject-0.0.1-SNAPSHOT.jar"
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
