package com.knoldus.assign2

class Person (val name: String,val age:Int) extends Ordered {
  override def check(personTwo: Person): Unit = {
    if(this.name.equals(personTwo.name)){
      if(this.age<personTwo.age){
        println("TRUE")
      }
      else {
        println("FALSE")
      }
    }
    else{
      if(this.name.length<personTwo.name.length)
      {
        println("TRUE")
      }
      else {
        println("FALSE")
      }
    }
  }
}