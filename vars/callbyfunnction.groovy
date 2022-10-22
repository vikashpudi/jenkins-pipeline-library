def call(){
pipeline{
agent { label 'any' }
stages{
stage('sample'){
  steps {
                echo 'Hello World'
            }
    }
}

}
}
