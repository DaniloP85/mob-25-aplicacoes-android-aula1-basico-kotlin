/**
 * Para que uma variável contenha um valor nullé necessário o uso do sufixo ? no tipo
 * podemos ver na linha 10 que dessa forma podemos atribuir o valor nulle para a variavel
 */
fun main() {
    var driverLicense: String? = null
    println(driverLicense)
    driverLicense= "6789877"
    println(driverLicense)
    driverLicense= null// agora compila
    println(driverLicense)
}