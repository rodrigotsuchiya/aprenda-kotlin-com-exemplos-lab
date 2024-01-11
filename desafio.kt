// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }


data class ConteudoEducacional(var nome: String, var duracao: Int)

data class Usuario(var nome:String)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        
        inscritos += listOf(usuario)
    }
}

fun main() {    
    var matematica = ConteudoEducacional("matematica", 40)
    val materia = listOf(matematica)
    var formacao = Formacao("Exatas", materia)
    val aluno1 = Usuario("Aluno1")
    val alunoMatricula = formacao.matricular(aluno1)
    
 }
