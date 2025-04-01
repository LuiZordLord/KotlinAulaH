var pontos = 0
var jogadores = mutableListOf<String>() //Aqui vai os nicks
var pontosJogadores = mutableListOf<Int>()  //Aqui vai os pontos

fun main() {
    do{
        println("1 - JOGAR")
        println("2 - PLACAR")
        println("3 - SAIR")
        val opcao: String = readln() //Leitura do teclado
        when(opcao.toInt()){
            1 -> jogar()
            2 -> placar()
            3 -> println("SAINDO...")
        }
    }while(opcao.toInt() != 3)
}

fun jogar(){
    print("Digite seu nickname: ")
    val nickname = readln()

    println("QUE OS JOGOS COMECEM!")
    var rodadas = 1
    do {
        println("FAÇA A SUA JOGADA")
        println("PEDRA, PAPEL OU TESOURA")
        var movimento = readln().uppercase()
        var movimentoPc = pc()
        println("O COMPUTADOR JOGOU: $movimentoPc")
        when(movimento) {
            "PEDRA" -> {
                var pedra = Pedra()
               pontos = pedra.luta(pc())

            }

            "PAPEL" -> {

                var papel = Papel()
                pontos = papel.luta(pc())
        }

            "TESOURA" -> {
                var tesoura = Tesoura()
                pontos = tesoura.luta(pc())
        }

        }
        rodadas++
        println("NOVA RODADA!")
    }while (rodadas <= 3)
    jogadores.add(nickname)
    pontosJogadores.add(pontos)

}

fun pc(): String{
    //O intervalo se escreve assim? (NumeroInicial..NumeroFinal) no caso 1 e 3. Usamos a função random para pegar um numero aleatório desse intervalo
    val movimento = (1..3).random()
    when(movimento){
        1 ->return "PEDRA"
        2 ->return "PAPEL"
        3 ->return "TESOURA"
        else ->return ""
    }
}

fun placar(){
    println("JOGADORES: ")
    jogadores.forEach{
        println(it)
    }
    println("PONTOS: ")
    pontosJogadores.forEach{
        println(it)
    }
}

class Tesoura {

    fun luta(elemento: String): Int {
        if (elemento == "PEDRA") {
            //pontos a remover
            return -1
            println("Você perdeu")
        }

        if (elemento == "PAPEL") {
            //ponto a ganhar
            return 1
            println("Você ganhou!")
        }

        return 0
        println("Empate!")
    }
}

class Papel {

    fun luta(elemento: String): Int{
        if(elemento == "TESOURA"){
            //pontos a remover
            return -1
            println("Você perdeu")
        }

        if (elemento == "PEDRA"){
            //ponto a ganhar
            return 1
            println("Você ganhou!")
        }

        return 0
        println("Empate!")
    }
}


class Pedra {

    fun luta(elemento: String): Int {
        if (elemento == "PAPEL") {
            //pontos a remover
            return -1
            println("Você perdeu")
        }

        if (elemento == "TESOURA") {
            //ponto a ganhar
            return 1
            println("Você ganhou!")
        }

        return 0
        println("Empate!")
    }
}
