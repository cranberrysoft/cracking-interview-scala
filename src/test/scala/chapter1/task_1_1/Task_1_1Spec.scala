package chapter1.task_1_1

import org.scalatest.funsuite.AnyFunSuite

class Task_1_1Spec extends AnyFunSuite {

  test("An empty String should be unique") {

    val unique = new Task_1_1().isUnique("")

    assert(unique == true)
  }

  test("When two the same characters it should not be unique") {

    val unique = new Task_1_1().isUnique("aa")

    assert(unique == false)
  }

  test("When two the same characters and one other character it should not be unique") {

    val unique = new Task_1_1().isUnique("aaB")

    assert(unique == false)
  }

  test("When two different characters it should be unique") {

    val unique = new Task_1_1().isUnique("ab")

    assert(unique == true)
  }
}
