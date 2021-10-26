fun main(args: Array<String>) {

    var idad = 0
    var ingr = 18.0
    var desc = 0.0
    var quant = 0
    var tot = 0.0
    var totInt = 0.0

    println("Digite a sua idade: ")
    idad = readLine()!!.toInt()

    if (idad > 0 && idad <=4) {
        desc = ingr * 0.6
        ingr = ingr - desc
        println("O valor do ingresso custará R$$ingr")

    }else if (idad > 60){
        desc = ingr * 0.55
        tot = ingr - desc
        println("O valor do ingresso custará R$$tot")

    }else{
        println("Digite a quantidade de igressos que você irá comprar: ")
        quant = readLine()!!.toInt()
        if (quant >1){
            totInt = quant * ingr
            desc = totInt * 0.3
            ingr = totInt - desc
            tot = ingr / quant
            println("O valor de cada um dos ingressos será R$$tot")

        }else if(quant < 1){
            println("A quantidade selecionado está invélida!")

        }else{
            println("O valor do seu ingresso será R$$ingr.")
        }
    }
}