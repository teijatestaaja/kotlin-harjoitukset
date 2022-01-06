fun append(arr: Array<String>, element: String): Array<String> {
    val list: MutableList<String> = arr.toMutableList()
    list.add(element)
    return list.toTypedArray()
}

fun main() {
    // Tehtävä 2
    var arrayOfStrings = arrayOf("omena", "päärynä", "banaani")
    arrayOfStrings = append(arrayOfStrings, "vesimeloni")
    for (item in arrayOfStrings)
      println(item)
    
    // Tehtävä 3
    var isSorted = if (arrayOfStrings.asList() == arrayOfStrings.asList().sorted()) true else false
    println(isSorted)
    
    val arrayOfIntegers = arrayOf(1, 2, 3, 1)
    isSorted = if (arrayOfIntegers.asList() == arrayOfIntegers.asList().sorted()) true else false
    println(isSorted)

    // Tehtävä 4
    if (arrayOfStrings.size != arrayOfStrings.distinct().count())
        println("taulukossa oli toistuvia elementtejä")
    else
        println("taulukossa ei ollut toistuvia elementtejä")
        
    if (arrayOfIntegers.size != arrayOfIntegers.distinct().count())
        println("taulukossa oli toistuvia elementtejä")
    else
        println("taulukossa ei ollut toistuvia elementtejä")
}