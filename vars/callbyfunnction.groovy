def printmyname(name,labelparam){
pipeline{
agent { label 'bs1' }
stages{
stage('sample'){
  steps {
                echo "i am ${name}"
        }
    }
}

}
}
