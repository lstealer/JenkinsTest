pipeline {
    agent any

    stages {
        stage('Build Jar') {
            steps {
                echo 'Jar Building..'
                sh 'mvn clean package'
            }
        }
        stage('Test Jar') {
            steps {
                echo 'Jar Testing..'
                sh 'docker ps'
            }
        }
        stage('Deploy Jar') {
            steps {
                echo 'Jar Deploying....'
            }
        }
    }
}
