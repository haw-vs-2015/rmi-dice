package de.vs.rmi.client.dice

import de.vs.rmi.api.dice.DiceRMI

import de.vs.rmi.framework.Settings
import de.vs.rmi.framework.ClientFramework

/**
 * Created by alex on 14.10.15.
 */



object Dice extends App {

  def apply() = ClientFramework.init[DiceRMI](Settings())
  
}


//nur ein client objekt erzeugen fehlt, nicht jdesmal...
  
//  ClientFramework.init[DiceRMI](Settings(), logic)
//  .roll()
  
//  def logic(request: DiceRMI) = {
//    var response = request.roll()
//    println(response)
//  }
//}

//object Client extends App {
////  new ClientService()
//  Dice().roll()
//}