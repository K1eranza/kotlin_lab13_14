fun main() {
    val solarSystem = mutableListOf(
        "Mercury" to 0, "Venus" to 0, "Earth" to 1, "Mars" to 2,
        "Jupiter" to 79, "Saturn" to 82, "Uranus" to 27, "Neptune" to 14
    )
    println(solarSystem.size)
    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("Earth"))
    println(solarSystem.indexOf("Pluto"))
    for (planet in solarSystem) {
        println(planet)
    }
    solarSystem.add("Pluto")
    solarSystem.add(index = 3, element = "Theia")
    solarSystem[3] = "Future Moon"
    println(solarSystem[3])
    println(solarSystem[9])
    solarSystem.removeAt(index = 9)
    println(solarSystem.contains("Pluto"))
    println("Future moon" in solarSystem)
    println(solarSystem.size)
    println(solarSystem.contains("Pluto"))
    println(solarSystem.size)
    solarSystem["Pluto"] = 5
    println(solarSystem.size)
    println(solarSystem["Pluto"])
    println(solarSystem.get("Theia"))
    solarSystem.remove(key = "Pluto")
    println(solarSystem.size)
    solarSystem["Jupiter"] = 78
    println(solarSystem["Jupiter"])//ll;
}