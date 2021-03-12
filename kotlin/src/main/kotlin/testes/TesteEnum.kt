package testes

fun main(){
    ClienteTipo.values().forEach { elements ->
        println("$(elements.nome) ${elements.descricao}")
    }

    ClienteTipo.values().forEach {
        println("$it.nome) ${it.descricao}")
    }

    val PF = ClienteTipo.PF
    println("==> $PF.nome) ${PF.descricao}")

    val PJ = ClienteTipo.PJ
    println("==> $PJ.nome) ${PJ.descricao}")
}