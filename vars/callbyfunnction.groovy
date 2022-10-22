def printmyname(name labelparam){
pipeline{
agent { label '${labelparam}' }
stages{
stage('sample'){
  steps {
                echo "i am ${name}"
        }
    }
}

}
}
