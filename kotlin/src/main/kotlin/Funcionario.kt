import java.math.BigDecimal

abstract class Funcionario (
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {
    protected abstract fun calculoAuxilio() : Double

    //override fun tostring(): String = """
    //nome: $nome
   // cpf: $cpf
    //salario: $salario
    //auxilio: ${calculoAuxilio()}

    //""".trimIndent()
}