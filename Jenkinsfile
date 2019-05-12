pipeline {
    agent any
	
	
	
    stages {
	    	
			
		stage("Dev: Build Tasks") {
			steps{
			openshiftBuild bldCfg: 'hello', buildName: '', checkForTriggeredDeployments: 'false', commitID: '', namespace: 'hello', showBuildLogs: 'true', verbose: 'false', waitTime: '', waitUnit: 'sec'
			openshiftVerifyBuild bldCfg: 'hello', checkForTriggeredDeployments: 'false', namespace: 'hello', verbose: 'false'
			}
		}
	    	stage('Dev: Tag Image') {
			steps {
				openshiftTag alias: 'false', destStream: 'hello', destTag: 'latest', destinationAuthToken: '', destinationNamespace: 'hello', namespace: 'hello', srcStream: 'hello', srcTag: 'latest', verbose: 'false'
			}
		}
		stage('Dev: Deploy new image') {
	           steps {
	              openshiftDeploy depCfg: 'jenkins', namespace: 'hello', verbose: 'false', waitTime: '', waitUnit: 'sec'
	              openshiftVerifyDeployment depCfg: 'jenkins', namespace: 'hello', replicaCount: '1', verbose: 'false', verifyReplicaCount: 'true', waitTime: '', waitUnit: 'sec'
	              openshiftVerifyService namespace: 'hello', svcName: 'hello', verbose: 'false', retryCount: '5'
	           }
	     	}
	 }
}
