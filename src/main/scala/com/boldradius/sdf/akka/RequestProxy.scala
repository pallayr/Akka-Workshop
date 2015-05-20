package com.boldradius.sdf.akka

import akka.actor.{Props, Actor, ActorLogging}

object RequestProxy {
  def props = Props[RequestProxy]
}

class RequestProxy extends Actor with ActorLogging {
  override def receive: Receive = ???
}
