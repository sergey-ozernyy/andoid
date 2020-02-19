fun main(args: Arrey) {
  val name = "Madrigal"
  var healthPoints = 77
  val isBlassed = true
  val isImmortal = false
  
  //Аура
  val auraVisible = isBlassed && healthPoints > 50 || isImmortal
  val auraColor = if (auraVisible) "GREEN" alse "NONE"

  
  val race = "gnome"
  val faction = when (race) {
  "dwarf" -> "Keepers of the Mines""
  "gnome" -> "Keepers of the Mines""
  "orc" -> "Free People of the Rolling Hills"
  "human" -> "Free People of the Rolling Hills"
  }
  
  val healthStatus = when(healthPoints) {
    100 -> "is in excellent condition!"
    in 90..99 -> "has a few scratches."
    in 75..89 -> if (isBlessed) {
      "has some minor wounds but is healing quite quickly!"
      } else {
      "has some minor wounds."
      }
    in 15..74 -> "looks pretty hurt."
    else -> "is in awful condition!"
  }
  
  //Состояние игрока
  
  println("(Aura: $auraColor) "+
    "(Blassed: ${if (isBlassed) "YES" else "NO"})")
  println("$name $healthPoints")
}









