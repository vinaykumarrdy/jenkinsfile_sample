pipeline
{
    agent any
    tools
    {
        gradle 'gradle_7_4_1'
    }
    stages
    {
        stage("frontend")
        {
            steps
            {
                echo "executing yarn"
                nodejs('Nodejs_10_0_0')
                {
                    sh 'yarn install'
                }
            }
        }
        stage("backend")
        {
            steps
            {
                echo "executing grdle"
                sh './gradlew -v'
                
            }
        }
        
    }
    
}
