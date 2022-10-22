def call(){
pipeline{
agent { label 'bs1' }
stages{
stage('sample'){
  steps {
                echo 'Hello World'
            }
    }
}

}
}
