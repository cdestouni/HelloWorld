#!groovy
pipeline {
	agent any
	stages {
		stage ('Download') {
			steps {
				echo "Running Download phase..."
				deleteDir()
				git url: 'https://github.com/cdestouni/HelloWorld.git'
			}
		}
		stage ('Build') {
			steps {
				echo "Running build phase..."
				sh 'mvn -B -DskipTests clean package'
			}
		}
		stage ('Test') {
			steps {
				echo "Running Test phase..."
				sh 'mvn test'
			}
			post {
				always {
					junit 'target/surefire-reports/*.xml'
				}
			}
		}
		stage ('Deploy') {
			steps {
				echo "Running Deploy phase..."
			}
		}
	}
}