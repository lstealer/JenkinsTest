pipeline {
    agent any

    stages {
        stage('Build Jar') {
            steps {
                echo 'Jar Building..'
                sh 'mvn build clean'
            }
        }
        stage('Test Jar') {
            steps {
                echo 'Jar Testing..'
            }
        }
        stage('Deploy Jar') {
            steps {
                echo 'Jar Deploying....'
            }
        }
    }
}
