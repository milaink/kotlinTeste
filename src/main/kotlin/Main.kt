fun main() {
    println("Bem vindo ao ByteBank!")

    //contagem invertida: for (i in 5 downTo 1 step 2) step: pular tantos

    //for (i in 1..5) { }

        //if(i == 4){
        //    break : para
        //    continue : pule o 4
        //}

   // loop@ for (i in 1..100) {
    //    println("i $i")
     //   for (j in 1..100) {
    //        println("j $j")
    //        if (j == 5) break@loop
    //    }
    //}

var i = 0
    while (i <= 5){

        val titular: String = "Alex $i"
        val numeroConta: Int = 1000 + i
        var saldo = i + 10.0

        //variáveis: mutáveis (var) imutáveis (val)
        println("Titular $titular")
        println("O número da conta é $numeroConta")
        println("Saldo: $saldo")
        testaCondicoes(saldo)
        println()
        i++


        //usando o método when
        //when {
        //    saldo > 0.0 -> println("a conta é positiva")
        //    saldo < 0.0 -> println("a conta é negativa")
        //    else -> println("a conta é neutra")
        //}
    }
}



fun testaCondicoes(saldo: Double){
    if (saldo > 0.0){
        println("a conta é positiva")
    } else if (saldo == 0.0){
        println("a conta é neutra")
    } else {
        println("a conta é negativa")
    }
}
