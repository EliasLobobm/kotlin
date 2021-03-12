package testes

import Analista
import Funcionario

fun main() {
    val elias = Analista(nome = "Elias Lobo", cpf = "65454654", salario = 4587.23)
   println(elias.nome)
   println(elias.cpf)
   println(elias.salario)
   imprimirRelatorioFuncionarios.imprimir(elias)
}
