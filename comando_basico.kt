/**
 * Aqui podemos ver como concatenar string
 * atribuir valores para as variaves utilizando a função Pair
 */

fun main() {
    println("hello, world!!!")
    println("Este text \"quebra\" em \nduas linhas")
    println("nota:\t 10")
    
    val (endereco, numero) = Pair("Paulista", 1162)
    println(endereco)
    println(numero)
}