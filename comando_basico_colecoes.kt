/**
 * Trabalhando com coleções
 * Adiconando novos elementos na lista, 
 * utilizando o mutableListOf, para colocar novos elementos na lista
 */
fun main() {
    val nomes = listOf("Daniel", "Domingos", "Akira")
    println(nomes)
    println(nomes[2])
    val sobrenomes = mutableListOf("Silva", "Lima", "Pereira")
    println(sobrenomes)
    sobrenomes.add("Fagundes")
    println(sobrenomes)    
}