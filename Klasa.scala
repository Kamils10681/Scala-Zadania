

object Klasa{

def main(args: Array[String]){

  var listaDniTygonia = List("Poniedziałek", "Wtorek", "Sroda", "Czwartek", "Piatek", "Sobota", "Niedziela")

  //Zadanie 1

  //a
  println("Zadanie 1a")
  for (dzien <- listaDniTygonia){
    println(dzien)
  }

  //b
  println("Zadanie 1b")
  for (dzien <- listaDniTygonia if dzien.startsWith("P")){
    println(dzien)
  }

  //c
  println("Zadanie 1c")
  listaDniTygonia.foreach{
    println
  }

  //d
  println("Zadanie 1d")
  var i=0;
  while(i<listaDniTygonia.length){
    println(listaDniTygonia(i))
    i+=1;
  }

  //e
  println("Zadanie 1e")
  def funkcjaR[Dni](list: List[Dni]){
    println(list.head)
    if (!list.tail.isEmpty)
      funkcjaR(list.tail)
  }

  println(funkcjaR(listaDniTygonia))

  //f
  println("Zadanie 1f")
  def funkcjaR2[Dni](list: List[Dni]){
    println(list.last)
    if (!list.tail.isEmpty)
      funkcjaR2(list.dropRight(1))
  }

  println(funkcjaR2(listaDniTygonia))

  //g
  println("Zadanie 1g")
  listaDniTygonia.foldLeft(listaDniTygonia.head)((_, n) => n+println(n))

  listaDniTygonia.foldRight(listaDniTygonia.last)((a,b) => a+println(a))

  //g
  println("Zadanie 1g")

  listaDniTygonia.foldLeft(listaDniTygonia.head)((_, n) => n+ (if(n.startsWith("P")) println(n)))

  //Zadanie 2
  println("Zadanie 2")
  val produkty = Map("chleb" -> 3.0, "maslo" -> 5.0, "cytryna" ->2.0)
  val prodPoObnizce = produkty.mapValues(_ /1.1)

  prodPoObnizce.foreach(p => println(p))


  //Zadanie 3
  println("Zadanie 3")
  val krotki = new Tuple3(3, "Hello", 4.5)

  def funkcjaTuple(t: Tuple3[Int, String, Double]){
    println(t)
  }

  funkcjaTuple(krotki)

  //Zadanie 4
  println("Zadanie 4")
  val auta = Map("ASTRA" -> "OPEL", "PANDA" -> "FIAT", "MASTER" -> "RENAULT")

  println(auta.get("ASTRA"));
  println(auta.get("MASTER"));

  //Zadanie 5
  println("Zadanie 5")
  def jakiDzien(dzien: String) = dzien match {
    case "Poniedziałek" | "Wtorek" | "Sroda" | "Czwartek" | "Piątek" => dzien+" - Praca"
    case "Sobota" | "Niedziela" => dzien+" - Weekend"
    case _ => " - Nie ma takiego dnia"
  }

  println(jakiDzien("Wtorek"))
  println(jakiDzien("Sobota"))
  println(jakiDzien("jakisdzien"))

  //Zadanie 6
  println("Zadanie 6")

  val konto1 = new KontoBankowe(3000)
  println("początowy stan konta1 "+ konto1.StanKonta)

  val konto2 = new KontoBankowe()
  println("pocztątkowy stan konta2 "+konto2.StanKonta)

  konto1.wyplata(1000)
  konto2.wplata(1000)

  println("Stan konta1 "+ konto1.StanKonta)
  println("Stan konta2 "+ konto2.StanKonta)


  //Zadanie 7
  println("Zadanie 7")

  val osoba1 = new Osoba("Jan", "Kowalski")
  val osoba2 = new Osoba("Jan", "Malarz")
  val osoba3 = new Osoba("Andrzej", "Nowak")
  val osoba4 = new Osoba("Jakub", "Brzoza")
  val osoba5 = new Osoba("Wiesław", "Mis")

  def przwitaj(o: Osoba) = o match {
    case o if o.nazwisko == "Kowalski" => println("Hej "+ o.nazwisko)
    case o if o.nazwisko == "Malarz" => println("Hello "+ o.nazwisko)
    case o if o.nazwisko == "Mis" => println("Siema "+ o.nazwisko)
    case default => println("Dzień dobry "+ o.nazwisko)
  }
  przwitaj(osoba1)
  przwitaj(osoba2)
  przwitaj(osoba3)
  przwitaj(osoba4)
  przwitaj(osoba5)

  //Zadanie 8
  println("Zadanie 8")

  val wartosci: List[Int] = List(0,1,2,0,3,4,7,0,5,10)

  def usunZero(list: List[Int]): List[Int] = {
    return list.filter((_.!=(0)))
  }
  val wartosciBezZer: List[Int] = usunZero(wartosci)
  println("Lista z zerami")
  wartosci.foreach(i => println(i))
  println("Lista bez zer")
  wartosciBezZer.foreach(i => println(i))

  //Zadanie 9
  println("Zadanie 9")

  val listaWartosci: List[Int] = List(0,14,20,34,41,100)
  def dodajJeden(list: List[Int]): List[Int] = {
    return list.map(x => x+1)
  }
  val listaWartosci2 = dodajJeden(listaWartosci)
  listaWartosci2.foreach(x => println(x))

  //Zadanie 10
  println("Zadanie 10")

  val listaW: List[Int] = List(-6,-10,-5,-2,-1,0,2,4,8,12,15,20)

  def przefiltrujDaneListy(lista: List[Int]): List[Int] = {
    return lista.filter(x => x >= -5 && x <= 12).map(x=>x.abs)
  }

  val listaW2: List[Int] = przefiltrujDaneListy(listaW)
  listaW2.foreach(i => println(i))

}
}