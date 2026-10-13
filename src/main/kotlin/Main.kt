package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    // Prints a message to request input
    println("Enter any word: ")

// Reads and stores the user input. For example: Happiness
    val yourWord = readln()

// Prints a message with the input
    print("You entered the word: ")
    print(yourWord)
    print("sum of 3 and 5 is ")
    println(sum(3, 5))
// You entered the word: Happiness

}
fun sum(a: Int, b: Int): Int {
    return a + b
}