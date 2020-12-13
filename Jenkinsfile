pipeline {
    agent any

    stages {
        stage('clean') {
            steps {
                sh 'mvn clean'
            }
        }
        stage('package') {
            steps {
                sh 'mvn package'
            }
        }
        stage('deploy'){
        	steps{
        		sh 'cp /root/.jenkins/workspace/project1-backend-api/target/TriviaAPI.war /home/ubuntu/apache-tomcat-8.5.60/webapps'
        	}
        }
    }
}
