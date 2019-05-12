pipeline {
    agent any
	
	
	
    stages {
	    	
			
		stage("Dev: Build Tasks") {
			steps{
			openshiftBuild bldCfg: 'hello', buildName: '', checkForTriggeredDeployments: 'false', commitID: '', namespace: 'testservice', showBuildLogs: 'true', verbose: 'false', waitTime: '', waitUnit: 'sec'
			openshiftVerifyBuild bldCfg: 'hello', checkForTriggeredDeployments: 'false', namespace: 'testservice', verbose: 'false'
			}
		}
	    	stage('Dev: Tag Image') {
			steps {
				openshiftTag alias: 'false', destStream: 'explore', destTag: 'hello', destinationAuthToken: '', destinationNamespace: 'testservice', namespace: 'testservice', srcStream: 'explore', srcTag: 'hello', verbose: 'false'
			}
		}
		stage('Dev: Deploy new image') {
	           steps {
	              openshiftDeploy depCfg: 'explore', namespace: 'testservice', verbose: 'false', waitTime: '', waitUnit: 'sec'
	              openshiftVerifyDeployment depCfg: 'explore', namespace: 'testservice', replicaCount: '1', verbose: 'false', verifyReplicaCount: 'true', waitTime: '', waitUnit: 'sec'
	              openshiftVerifyService namespace: 'testservice', svcName: 'explore', verbose: 'false', retryCount: '5'
	           }
	     	}
	 }
}
