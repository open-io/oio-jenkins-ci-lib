#!/usr/bin/env groovy

def getContentUTF8(String path) {
  String fileContents = new File(path).getText('UTF-8')
}
