fun main() {
    print("Состояние\t\t\t\t\t")
    State.values().forEach {
        print("\t${it.name}")
    }
    println()
    print("Состояние на следующем такте")
    State.values().forEach {
        print("\t${State.values()[it.next].name}")
    }
    println()
    print("Выходной сигнал\t\t\t\t")
    State.values().forEach {
        print("\t${it.signal}")
    }
    println()
    println("Введите номер начального состояния (1-7): ")
    var state = readln().toIntOrNull()?.takeIf { it in 1..7 }?.let { State.values()[it - 1] } ?: run {
        println("Некорректный ввод!")
        return
    }
    println("Введите q, чтобы остановить работу. Иначе автомат перейдёт на следующий такт")
    do {
        print("Состояние\t\t\t\t\t")
        print("\t${state.name}")
        println()
        print("Выходной сигнал\t\t\t\t")
        print("\t${state.signal}")
        state = State.values()[state.next]
        println()
    } while (readln() != "q")
}