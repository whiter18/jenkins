pipeline {
  agent any

  environment {
      repository = "whiter018/frontend"  // repository name of your docker hub
      MONGOIP = credentials('mongoip');
      MONGODBNAME = credentials('mongodbname');
      MONGOID = credentials('mongoid');
      MONGOPW = credentials('mongopw');
      dockerImage = ' '
  }
  stages {
      stage('Cloning front-end Git') {
            steps {
		checkout changelog: false, poll: false, scm: [$class: 'GitSCM', branches: [[name: '*/main']], extensions: [],
		userRemoteConfigs: [[url: 'https://github.com/whiter18/jenkins']]]
            }
        }

      stage('Build an image') {
          steps {
              script {
                  sh 'docker build -t $repository:v$BUILD_NUMBER --build-arg mongoip=$MONGOIP --build-arg mongoid=$MONGOID --build-arg mongopw=$MONGOPW --build-arg mongodbname=$MONGODBNAME .'
                  // docker image build
              }
          }
      }
  }
}