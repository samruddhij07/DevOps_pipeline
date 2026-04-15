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
				bat "ant -f office.xml package"
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
				withSonarQubeEnv('SonarServer'){
					bat "ant -f office.xml sonar"
				}
			}
		}

		stage('Docker'){
			steps{
				bat "docker-compose down"
				bat "docker-compose up -d --build"
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














