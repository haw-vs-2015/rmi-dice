package de.vs.rmi.server.dice

import de.vs.rmi.api.dice._
import de.vs.rmi.framework.ServerFramework
import de.vs.rmi.framework.Settings
import scala.util.Random

/**
 * Created by alex on 14.10.15.
 */

object RollServerService extends App with DiceRMI {
  
  ServerFramework.init[DiceRMI](Settings(), this)
  roll()
  def roll(): Roll = {
    Roll((new Random().nextInt(6)+1))
  }
}