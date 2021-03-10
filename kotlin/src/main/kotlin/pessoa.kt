class pessoa {
    var nome:String = "Elias"
    var cpf:String = "009632444705"
    private set
}

fun main(){
    var elias = pessoa()
    println(elias)
    //elias.cpf = "0731402790"
    println(elias.nome)
    println(elias.cpf)
}