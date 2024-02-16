// vars/mvnTest.groovy

def call(String directory = '.') {
    // Add the 'directory' parameter to change to the specified directory
    dir(directory) {
        // Run Maven test
        sh 'mvn -f path/to/maven/project/pom.xml test'
    }
}