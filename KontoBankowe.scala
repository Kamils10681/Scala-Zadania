/**
  * Created by Kamil on 15.04.2018.
  */
class KontoBankowe(var StanKonta: Int = 0) {


  def this(){
    this(0)
  }

  def wplata(kwota: Int){
    StanKonta+=kwota
  }

  def wyplata(kwota: Int){
    StanKonta-=kwota
  }

}
