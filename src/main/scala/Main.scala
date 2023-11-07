object ListMapFilterProgram {
  def main(args: Array[String]): Unit = {
    val myList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)                          //creating a list

    println("Original list:")
    myList.foreach(println)

    val mappedList = myList.map(_ * 2)                                        // Double each element using map
    println("\nList after mapping (doubling each element):")
    mappedList.foreach(println)

    val filteredList = myList.filter(_ % 2 == 0)                              // Filter even elements using filter
    println("\nList after filtering (keeping only even elements):")
    filteredList.foreach(println)
  }
}
