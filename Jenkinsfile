pipeline {
    agent any
    tools {
        maven 'Maven'
    }

    stages {
        stage('CheckOut') {
            steps {
                    echo 'Checkout code'
                    checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/shashikantrangwar/cucumberTestFramework.git']]])
                  }
        }
        stage('Build') {
            steps {
                echo 'Build code'
                powershell 'mvn clean install -f pom.xml -s settings.xml'
            }
        }
		 stage('Test') {
            steps {
                echo 'Test code'
                powershell 'mvn clean test -f pom.xml -s settings.xml'
            }
        }
         stage('Cucumber Reports') {
            steps {
                echo 'cucumber Reports'
                cucumber buildStatus: "UNSTABLE",
                fileIncludePattern: "**/cucumber-reports/Cucumber.json",
                jsonReportDirectory: 'target'
            }
        }
        
    }
}
