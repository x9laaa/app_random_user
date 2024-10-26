package cl.bootcamp.apprandomuser.modal

data class ApiResponse(
    val results: List<Results> = emptyList()
)

data class Results(
    val name: UserName?,
    val location: UserLocation?,
    val picture: UserPicture?
)