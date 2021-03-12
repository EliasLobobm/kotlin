package testes

import Cliente

fun main(){
    val jose = Cliente(
        nome =  "Elias Lobo",
        cpf = "65465456",
        clienteTipo = ClienteTipo.PJ,
        senha = "1234"
    )
    println(jose)
    TesteAutenticacao().autentica()
}