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

fun mostrarDados(conta: Conta) {
    println("Titular: ${conta.titular}")
    println("Número: ${conta.numero}")
    println("Saldo: ${conta.saldo}")
    println()

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

