def  call(String ImageTage, String DockerHubUser) {
sh " docker build -t ${DockerHubUser}/${ProjectName}:${ImageTage} ."
}
