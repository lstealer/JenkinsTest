pipeline {
    agent any

    stages {
        stage('Build Jar') {
            steps {
                echo 'Jar Building..'
                sh 'mvn clean package'
                sh 'mkdir -p dockerimage && cd dockerimage && cat <<EOF >Dockerfile
                FROM openjdk:11
                EXPOSE 8080
                ADD sptest.jar sptest.jar
                ENTRYPOINT ["java","-jar","sptest.jar"]
                EOF'
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
