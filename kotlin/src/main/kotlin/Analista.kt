class Analista(nome: String,
               cpf: String,
               salario: Double): Funcionario(nome, cpf, salario) {
    override fun calculoAuxilio() = salario +((salario*10)/100)
}