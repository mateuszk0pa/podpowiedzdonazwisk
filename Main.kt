fun main()
{
    //zmienne
    var imie: String = "" //imie
    var nazwisko: String = "" //nazwisko
    var imie1: String = "Wstaw imie" //podpowiedz imienia 1
    var imie2: String = "Wstaw imie" //podpowiedz imienia 2
    var imie3: String = "Wstaw imie" //podpowiedz imienia 3
    var nazwisko1: String = "Wstaw nazwisko" //podpowiedz nazwiska 1
    var nazwisko2: String = "Wstaw nazwisko" //podpowiedz nazwiska 2
    var nazwisko3: String = "Wstaw nazwisko" //podpowiedz nazwiska 3
    //program
    print("Podaj imie: ")
    imie = readLine().toString()
    if (imie != "")
    {
        if (imie == "$imie1")
        {
            println("Czy chodzi o $imie1 $nazwisko1? (odpowiedz tak lub nie)")
            var odpowiedz: String = ""
            odpowiedz = readLine().toString()
            if (odpowiedz == "tak")
            {
                nazwisko = "$nazwisko1"
                println("Imie twojego nauczyciela to: $imie $nazwisko")
            }
            if (odpowiedz == "Tak")
            {
                nazwisko = "$nazwisko1"
                println("Imie twojego nauczyciela to: $imie $nazwisko")

            }
        }
        if (imie == "$imie2")
        {
            println("Czy chodzi o $imie2 $nazwisko2? (odpowiedz tak lub nie)")
            var odpowiedz: String = ""
            odpowiedz = readLine().toString()
            if (odpowiedz == "tak")
            {
                nazwisko = "$nazwisko2"
                println("Imie twojego nauczyciela to: $imie $nazwisko")
            }
            if (odpowiedz == "Tak")
            {
                nazwisko = "$nazwisko2"
                println("Imie twojego nauczyciela to: $imie $nazwisko")

            }
        }
        if (imie == "$imie3")
        {
            println("Czy chodzi o $imie3 $nazwisko3? (odpowiedz tak lub nie)")
            var odpowiedz: String = ""
            odpowiedz = readLine().toString()
            if (odpowiedz == "tak")
            {
                nazwisko = "$nazwisko3"
                println("Imie twojego nauczyciela to: $imie $nazwisko")
            }
            if (odpowiedz == "Tak")
            {
                nazwisko = "$nazwisko3"
                println("Imie twojego nauczyciela to: $imie $nazwisko")

            }
        }else
        {
            print("Podaj nazwisko: ")
            nazwisko = readLine().toString()
            println("Imie twojego człowieka to: $imie $nazwisko")
        }
    }
}
