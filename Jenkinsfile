pipeline {
    agent any
    tools {
        maven 'localMaven'
    }
    stages {
        stage('Init') {
            steps{
                echo "Init step just for testing..."
            }
        }

        stage('Build') {
            steps {
                echo "Building..."
                sh 'mvn clean package'
            }
            post {
                success {
                    echo 'Now archiving...'
                    archiveArtifacts artifacts: '**/target/*.war'
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Code deployed'
            }
        }
    }
}