def docker-build(String ProjectName, String ImageTag, String DockerHubUser){
  echo "Building Docker image"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo "Successfully Build Docker image"
}
