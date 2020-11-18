pipeline {
    agent any

    stages {
        stage('Build Jar') {
            steps {
                echo 'Jar Building..'
                sh 'mvn clean package'
                sh 'cp Dockerfile target/'
                sh 'cp deployment.yaml target/'
                sh 'cp service.yaml target/'
                sh 'cd target && sudo docker build -t sptest . && sudo kubectl apply -f deployment.yaml'
                script {
                    try {
                        sh 'cd target && sudo kubectl apply -f service.yaml'
                    } catch (Exception e) {
                        echo 'service created'
                    }
                }
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
