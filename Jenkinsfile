pipeline {
    agent any

    stages {
        stage('Build Jar') {
            steps {
                echo 'Jar Building..'
                sh 'mvn clean package'
                sh 'cp Dockerfile target/'
                sh 'cp deployment.yaml target/'
                sh 'cd target && sudo docker build -t sptest . && sudo kubeadm apply -f deployment.yaml'
            }
        }
        stage('Test Jar') {
            steps {
                echo 'Jar Testing..'
                sh 'sudo docker ps'
            }
        }
        stage('Deploy Jar') {
            steps {
                echo 'Jar Deploying....'
            }
        }
    }
}
