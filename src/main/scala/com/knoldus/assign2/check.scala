package com.knoldus.assign2

object check {
  def main(args: Array[String]): Unit = {
    var personOne = new Person("Test", 24)
    var personTwo = new Person("Test", 25)
    personOne.check(personTwo)
    //var personOne =new Person( name="TestAgain", age=24)
    //var personTwo=new Person(name="Test",age=25)
    //Output: FALSE
  }
}
