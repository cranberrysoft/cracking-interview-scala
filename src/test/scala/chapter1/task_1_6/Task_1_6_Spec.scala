package chapter1.task_1_6

import chapter1.task_1_6.Tak_1_6.compress
import org.scalatest.funsuite.AnyFunSuite

class Task_1_6_Spec extends AnyFunSuite {

  test("should compress string with the same letters") {
    //given
    val input = "aaa";

    //when
    val compressed = compress(input);

    //then
    assert(compressed === "a3")
  }

  test("should compress string with different letters letters") {
    //given
    val input = "aaabbb";

    //when
    val compressed = compress(input);

    //then
    assert(compressed === "a3b3")
  }

  test("should return original string if compressed string is not smaller"){
    //given
    val input1 = "a";
    val input2 = "ab";

    //when
    val compressed1 = compress(input1);
    val compressed2 = compress(input2);

    //then
    assert(compressed1 === "a")
    assert(compressed2 === "ab")
  }

  test("should return original string if compressed string is same size") {
    //given
    val input = "aab";
    //when
    val compressed = compress(input);

    //then
    assert(compressed === "aab")
  }

  test("should return empty string for empty input") {
    //given
    val input = "";

    //when
    val compressed = compress(input);

    //then
    assert(compressed === "")
  }

  test("should compress string when duplicated characters in different position"){
    //given
    val input = "aaabbaa";

    //when
    val compressed = compress(input);

    //then
    assert(compressed === "a3b2a2")
  }
}
