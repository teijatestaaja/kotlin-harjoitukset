fun append(arr: Array<String>, element: String): Array<String> {
    val list: MutableList<String> = arr.toMutableList()
    list.add(element)
    return list.toTypedArray()
}

fun main() {
    // Tehtävä 2.1
    var arrayOfStrings = arrayOf("omena", "päärynä", "banaani")
    arrayOfStrings = append(arrayOfStrings, "vesimeloni")
    for (item in arrayOfStrings)
      println(item)
    
    // Tehtävä 2.2
    var isSorted = if (arrayOfStrings.asList() == arrayOfStrings.asList().sorted()) true else false
    println(isSorted)
    
    val arrayOfIntegers = arrayOf(1, 2, 3, 1)
    isSorted = if (arrayOfIntegers.asList() == arrayOfIntegers.asList().sorted()) true else false
    println(isSorted)

    // Tehtävä 2.3
    if (arrayOfStrings.size != arrayOfStrings.distinct().count())
        println("taulukossa oli toistuvia elementtejä")
    else
        println("taulukossa ei ollut toistuvia elementtejä")

    if (arrayOfIntegers.size != arrayOfIntegers.distinct().count())
        println("taulukossa oli toistuvia elementtejä")
    else
        println("taulukossa ei ollut toistuvia elementtejä")
        
    // Tehtävä 2.4
    val hedelma1 = "omena"
    val hedelma2 = "granaattiomena"
    println(arrayOfStrings.contains(hedelma1))            // true
    println(arrayOfStrings.contains(hedelma2))            // false
    println(arrayOfStrings.asList().contains(hedelma1))   // true
    println(arrayOfStrings.asList().contains(hedelma2))   // false
    println(arrayOfStrings.indexOf(hedelma1))             // palauttaa  0 eli paikan taulukossa
    println(arrayOfStrings.indexOf(hedelma2))             // palauttaa -1 koska ei ole taulukossa
    println(hedelma1 in arrayOfStrings)                   // true
    println(hedelma2 in arrayOfStrings)                   // false
    println(arrayOfStrings.filter { x: String -> x == hedelma1 }.count() > 0)  // true
    println(arrayOfStrings.filter { x: String -> x == hedelma2 }.count() > 0)  // false
}