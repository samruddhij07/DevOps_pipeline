pipeline{
	agent { label 'slave_agent1' }

	stages{
		stage('Checkout'){
			steps{
				checkout scm
			}
		}

		stage('Clean'){
			steps{
				bat "ant -f office.xml clean"
			}
		}
	
		stage('Compile'){
			steps{
				bat "ant -f office.xml compile"
			}
		}

		stage('Package'){
			steps{
				bat "ant -f office.xml jar"
			}
		}

		stage('Test'){
			steps{
				bat "ant -f office.xml test"
			}
		}

		stage('Run'){
			steps{
				bat "ant -f office.xml run"
			}
		}

		stage('SonarQube Analysis'){
			steps{
				withSonarQubeEnv('SonarQube'){
					bat "ant -f office.xml sonar"
				}
			}
		}	
	
	}
	
	post{
		success{
			echo "Build successfully!"
		}
		failure{
			echo "Build failed. Check console for errors."
		}
	}
}














