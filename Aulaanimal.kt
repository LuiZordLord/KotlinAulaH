Cachorro
class Cachorro : Animal() {

    override fun somAnimal() : String {
        return("Au au")
    }

}

Gato
class Gato : Animal() {

    override fun somAnimal() : String{
        return("Miau miau")
    }

}

Raposa
class Raposa : Animal() {

    override fun somAnimal() : String {
        return("Papapapapow")
    }

}

Animal
open class Animal(){
    var nome: String = ""
    var especie: String = ""
    var dieta: String = ""
    var habitat: String = ""

    //Metodos ou funções são comportamentos
    open fun somAnimal() : String{
        println("Som do animal!")
    }

}

ExemploAula
fun main() {
    var gato = Gato()
    gato.nome = "Gato"
    gato.dieta = "Peixe"
    gato.habitat = "Apartamento"
    gato.especie = "Felino"

//    val gato: Gato = gato as Gato // Não recomendado

    println(gato.nome)
    println(gato.somAnimal())
    gato.somAnimal()

    var cachorro = Cachorro()
    cachorro.nome = "Cachorro"
    cachorro.dieta = "Ração"
    cachorro.habitat = "Casa"
    cachorro.especie = "Canino"

//    val cachorro: Cachorro = cachorro as Cachorro // Não recomendado

    println(cachorro.nome)
    println(cachorro.somAnimal())
    cachorro.somAnimal()

    //Salvar animais em uma lista (Gato, Cachorro e Animal)

    var raposa = Raposa()
    raposa.nome = "Raposa"
    raposa.dieta = "Ovo"
    raposa.habitat = "Floresta"
    raposa.especie = "Canino"

//    val raposa: Raposa = raposa as Raposa // Não recomendado

    println(raposa.nome)
    println(raposa.somAnimal())
    raposa.somAnimal()

    val lista = listOf<Animal>(gato, cachorro, raposa)
    println("Lista: ${lista.first().somAnimal()}")

}

