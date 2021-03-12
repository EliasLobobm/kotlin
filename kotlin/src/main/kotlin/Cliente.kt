class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
): Pessoa(nome, cpf), Logavel{
    override fun login(): Boolean = "12457" == senha

    override fun tostring(): String = """
    nome: $nome
    cpf: $cpf
    tipo: ${ClienteTipo.PJ.descricao}
    """.trimIndent()

}