/**
 * Trabalhando com funções
 * passagem de parametros e executando funções sem parametros
 */

fun novaFuncao(){
    println("Oi, tudo bem?")
}

private fun novaFuncao2(nome: String){
    println("Oi, $nome")
}

fun main() {
    novaFuncao()
    novaFuncao2("Daniel")
}