#!/usr/bin/env groovy

def createVirtualEnv(String name, String reqFile = "requirements.pip") {
    sh "virtualenv ${name}"
    if (fileExists(reqFile)) {
        sh "pip install -r ${reqFile}"
    }
}
 
def executeIn(String environment, String script) {
    sh "source ${environment}/bin/activate && " + script
}
