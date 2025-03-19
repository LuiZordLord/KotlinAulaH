Main.kt
fun main() {
    
    //List só leitura mutableList você pode editar
    var listaDeConvidados = mutableListOf<Convidado>()
    
    do{

        println("1 - Criar")
        println("2 - Listar")
        println("3 - Editar")
        println("4 - Excluir")
        println("0 - Sair")
        val op = readln()
        when(op.toInt()){
            1-> {

                extracted(listaDeConvidados)

            }
            2-> print("Listar")
            3-> print("Editar")
            4-> print("Excluir")
            0-> print("Saindo...")
        }

    }while(op.toInt() !=0)
}

private fun extracted(listaDeConvidados: MutableList<Convidado>) {
    println("Criar")
    println("Nome do convidado: ")
    val nome = readln()

    println("Qual o seu presente: ")
    val presente = readln()

    println("Alguma restrição alimentar? ")
    val alimentar = readln()

    println("Sexo M ou F")
    val sexo = readln()
    when (sexo) {

        "M" -> {

            var homem: Homem = Homem()
            homem.nome = nome
            homem.restricao = alimentar
            homem.presente = presente

            listaDeConvidados.add()

        }

        "F" -> {

            var mulher: Mulher = Mulher()
            mulher.nome = nome
            mulher.restricao = alimentar
            mulher.presente = presente
            listaDeConvidados.add()


        }
    }
}


Convidado.kt
open class Convidado() {
    var presente: String = ""
    var restricao: String = ""
    var nome: String = ""
    var presenca: Boolean = false

}

Homem.kt
class Homem : Convidado() {

    var vestuario: String = ""

}

Mulher.kt
class Mulher : Convidado() {

    var brinquedo: String= ""


}
