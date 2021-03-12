package testes

import Analista
import Funcionario
import Gerente

fun main() {
    val lobo = Gerente(nome = "Elias Lobo", cpf = "65454654", salario = 4587.23)
   println(lobo.nome)
   println(lobo.cpf)
   println(lobo.salario)
   imprimirRelatorioFuncionarios.imprimir(lobo)
}
