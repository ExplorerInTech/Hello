pipeline {
   agent {
      label 'maven'
  }
	
    stages {
    stage('Build App') {
      steps {
        sh "mvn clean package -P docker-image"
      }
    }
}
