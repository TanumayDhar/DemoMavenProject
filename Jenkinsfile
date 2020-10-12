pipeline{

	agent any
	
		stages{
		
			stage('Build')
		{
			
				steps
			{
				git 'https://github.com/TanumayDhar/DemoMavenProject.git'
			}
		}
		
			stage('Test')
			{
				steps
				{
					bat 'mvn clean install'
				}
				
				
			}
			
			stage('Deploy')
			{
		
				steps
				{
				
				echo 'Deploy on test env'
				}
			}

}
}

