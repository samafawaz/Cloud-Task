pipeline {
    agent any
    
    tools {
        // Make sure to configure these tools in Jenkins Global Tool Configuration
        jdk 'jdk17'  // Update this to match your JDK installation name in Jenkins
        maven 'maven3' // Update this to match your Maven installation name in Jenkins
    }
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout code from GitHub
                git branch: 'master',
                    url: 'https://github.com/samafawaz/Cloud-Task.git'
            }
        }
        
        stage('Build') {
            steps {
                // Clean and build the project
                sh 'mvn clean package -DskipTests'
            }
        }
        
        stage('Test') {
            steps {
                // Run tests
                sh 'mvn test'
            }
            post {
                always {
                    // Publish JUnit test results
                    junit '**/target/surefire-reports/*.xml'
                    
                    // Optional: Archive test results
                    archiveArtifacts 'target/surefire-reports/*.xml'
                }
            }
        }
    }
    
    post {
        always {
            // Clean up workspace after build
            cleanWs()
        }
        success {
            echo 'Pipeline completed successfully!'
        }
        failure {
            echo 'Pipeline failed. Check the console output for details.'
        }
    }
}
