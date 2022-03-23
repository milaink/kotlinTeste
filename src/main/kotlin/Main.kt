fun main() {
    println("Bem vindo ao ByteBank!")

    val contaCamila = Conta()
    contaCamila.titular = "Camila"
    contaCamila.numero = 256
    contaCamila.saldo = 350.0

    val contaPedro = Conta()
    contaPedro.titular = "Pedro"
    contaPedro.numero = 652
    contaPedro.saldo = 450.0

    mostrarDados(contaCamila)
    mostrarDados(contaPedro)

    contaPedro.deposita(50.0)
    testaCondicoes(contaPedro.saldo)
    println()
    contaCamila.deposita(70.0)
    testaCondicoes(contaCamila.saldo)

    println()
    contaPedro.saca(50.0)

    println()
    contaPedro.transferencia(contaCamila, 800.0)

    println()
    mostrarDados(contaCamila)

    if(contaCamila.transferencia(contaPedro,100.0)){
        println("Transferência feita com sucesso!")
    } else{
        println("Transferência falhou!")
    }

}

fun mostrarDados(conta: Conta) {
    println("Titular: ${conta.titular}")
    println("Número: ${conta.numero}")
    println("Saldo: ${conta.saldo}")
    println()

}

class Conta {
    var titular = ""
    var numero = 0
    var saldo = 0.0

    fun deposita(valor: Double) {
        println("Saldo anterior: $saldo")
        saldo += valor
        println("Foi depositado na conta do(a) titular $titular a quantia de $valor reais.")
        println("Saldo atual: $saldo")
    }

    fun saca(valor: Double) {
        println("Sacando $valor da conta do(a) titular $titular")
        if (saldo >= valor) {
            saldo -= valor
            println("Saldo atual: $saldo")
        } else {
            println("Você não tem saldo suficiente.")
            println("Saldo atual: $saldo")
        }
    }

    fun transferencia(conta: Conta, valor: Double): Boolean {
        println("Sacando $valor da conta do(a) titular $titular")
        if (saldo >= valor) {
            saldo -= valor
            println("Depositando $valor da conta do(a) titular ${conta.titular}")
            conta.saldo += valor
            println("Saldo atual: $saldo")
            return true
        }
        println("Você não tem saldo suficiente.")
        println("Saldo atual: $saldo")
        return false

    }
}

fun testaLacos() {
    var i = 0
    while (i <= 5) {

        val titular: String = "Camila $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        //variáveis: mutáveis (var) imutáveis (val)
        println("Titular $titular")
        println("O número da conta é $numeroConta")
        println("Saldo: $saldo")
        testaCondicoes(saldo)
        println()
        i++

    }
}

fun testaCondicoes(saldo: Double) {
    if (saldo > 0.0) {
        println("a conta é positiva")
    } else if (saldo == 0.0) {
        println("a conta é neutra")
    } else {
        println("a conta é negativa")
    }
}

/*usando o método when
when {
    saldo > 0.0 -> println("a conta é positiva")
    saldo < 0.0 -> println("a conta é negativa")
    else -> println("a conta é neutra")
}

contagem invertida: for (i in 5 downTo 1 step 2) step: pular tantos

for (i in 1..5) { }

if(i == 4){
    break : para
    continue : pule o 4
}

 loop@ for (i in 1..100) {
   println("i $i")
  for (j in 1..100) {
       println("j $j")
       if (j == 5) break@loop
   }
}

val numeroX = 10
var numeroY = numeroX
numeroY++

val contaJoao = Conta()
contaJoao.titular = "João"
val contaMaria = Conta()
contaMaria.titular = "Maria"

println("titular conta João: ${contaJoao.titular}")
println("titular conta Maria: ${contaMaria.titular}")

println("numeroX $numeroX")
println("numeroY $numeroY")*/