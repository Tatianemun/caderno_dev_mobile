fun main() {
  println("Olá, qual é seu nome?")
  var nome: String = readLine()!!
  println("Seja bem Vindo")
  println(nome)
  println("Qual a sua idade?")
  var idade: String = readLine()!!
  var idadeint: Int = 0
  idadeint = idade.toInt()
  println("Sua idade é:")
  println(idade)
  
}