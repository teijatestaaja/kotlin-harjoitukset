fun append(arr: Array<String>, element: String): Array<String> {
    val list: MutableList<String> = arr.toMutableList()
    list.add(element)
    return list.toTypedArray()
}

fun main() {
    var arrayOfStrings = arrayOf("omena", "päärynä", "banaani")
    arrayOfStrings = append(arrayOfStrings, "vesimeloni")
    for (item in arrayOfStrings)
      println(item)
}