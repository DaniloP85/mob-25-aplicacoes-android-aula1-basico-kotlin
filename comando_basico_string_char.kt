/**
 * Mostrando como trabalhar com algumas função da String
 * como recuperar um caracter
 * verificar o tamanho da String
 * verificar se a String está vazia
 * Como fazer interpolação de String
 */
fun main() {
    val minhaString = "KOTLIN"
    println(minhaString[0])
    println(minhaString[5])
    println(minhaString.isEmpty())
    println(minhaString.length)
    println(minhaString.substring(2,4))
    println("Minha String é: $minhaString")
}