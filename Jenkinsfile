pipeline {
    agent any
	
	
	
    stages {
	    	
			
		stage("Dev: Build Tasks") {
			steps{
			openshiftBuild 
				bldCfg: 'hello', buildName: '', checkForTriggeredDeployments: 'false', commitID: '', 
				namespace: 'hello', showBuildLogs: 'true', verbose: 'false', waitTime: '', waitUnit: 'sec'
			openshiftVerifyBuild 
				bldCfg: 'oc get bc', checkForTriggeredDeployments: 'false', namespace: 'hello', verbose: 'false', waitTime: ''
			}
		}
		
            
        
    }
}