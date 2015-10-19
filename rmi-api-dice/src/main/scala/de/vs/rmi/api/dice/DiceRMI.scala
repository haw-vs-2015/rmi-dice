package de.vs.rmi.api.dice

import java.rmi.RemoteException
import java.rmi.Remote

trait DiceRMI extends Remote {
  @throws(classOf[RemoteException])
  def roll(): Roll
}

case class Roll(number: Int)

//object tessst extends App {
//  println(Roll(1).toJson())
//  //  println(Roll.toObj("{\"number\":1}"))
//}
