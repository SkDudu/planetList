package mobile.unifor.planetlist.model

data class Planets(
    val id:Int,
    val picture:Int,
    val name:String,
    val diameter:Int,
    val distanceSun: Long,
    val aboutPlanet:String
)
