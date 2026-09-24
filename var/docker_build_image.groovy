def  call(String ImageTage, String DockerHubUser, String ProjectName) {
sh " docker build -t ${DockerHubUser}/${ProjectName}:${ImageTage} ."
}
