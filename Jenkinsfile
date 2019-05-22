pipeline {
   agent {
	docker {
            image 'maven:3-alpine' 
            args '-v /root/.m2:/root/.m2' 
        }
  }
	
    stages {
	    stage('Build App') {
		      steps {
			sh "mvn clean package -P docker-image"
		      }
    	   }
    }
}
