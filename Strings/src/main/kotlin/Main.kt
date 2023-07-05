fun main(args: Array<String>) {

    val city = "Kampala"
    println(city[0])
    println(city[1])
    println(city[2])
    println(city[3])
    println(city[4])
    println(city[5])
    println(city[6])

    val fare= 1500
    val destination="Kisumu"
    val currency= "kes"
    val stmt= "The fare to "+destination + " is "+ fare  +""+currency
    println(stmt)

    val stmt2= "The fare to $destination is $fare $currency"
    println(stmt2)

    val place1 = "San francisco"
    val place2 = "San francisco"
    println(place1.equals(place2))

    val place3 = "San francisco"
    val place4 = "San francisco"
    place1.length
    println(place3.length>8)

    val fruit = "banana"
    println( fruit.uppercase())
    println( fruit.lowercase())

    val singer = "billie Eilish"
    println(singer.replaceFirst('b','B'))

    val artist = "santan dave"
    println(artist.replace('s','S').replace('d','D'))
    println(artist.replace('d','D'))

    var a = ""
    var b = " "
    println(a.isEmpty())
    println(a.isBlank())
    println(b.isEmpty())
    println(b.isBlank())

    val hair = " mohark "
    println("mohark")
    println(hair.trimStart())
    println(hair.trimEnd())
    println(hair.trim())

    val sentence = "Adam ate the apple Eve gave him"
    println(sentence.split(""))


    val sentence1= "Adam ate the apple Eve gave him"
    var x = sentence1.split(" ")
    println(x)


    val sentence2= "Adam ate the apple Eve gave him"
    var h = sentence2.split(" h ")

    println(h)
















































}

