pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/jglick/simple-maven-project-with-tests.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }

                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    mail to: 'garci877@cougars.csusm.edu, mendo229@cougars.csusm.edu, ferna185@cougars.csusm.edu',
                    subject: 'The pipeline succeeded: ('
                }

                failure {
                    mail to: 'garci877@cougars.csusm.edu, mendo229@cougars.csusm.edu, ferna185@cougars.csusm.edu',
                    subject: 'The pipeline failed: ('
                }
            }
        }
    }
}
