pipeline {
    agent any

    stages {
        stage('Build Jar') {
            steps {
                echo 'Jar Building..'
                sh 'mvn clean package'
                sh 'mkdir -p dockerimage && cd dockerimage && cat <<EOF >Dockerfile'
                sh 'FROM openjdk:11'
                sh 'EXPOSE 8080'
                sh 'ADD sptest.jar sptest.jar'
                sh 'ENTRYPOINT ["java","-jar","sptest.jar"]'
                sh 'EOF'
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
