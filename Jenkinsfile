pipeline {
    agent any
    
    tools {
        // Using the specific tool names configured in this Jenkins instance
        jdk 'jdk17'  // Matches your JDK 17 installation
        maven 'maven3' // Matches your Maven installation
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
