package chapter1.task_1_1

class Task_1_1() {

  def isUnique(text: String): Boolean = {
    //simple(text)
      simple2(text)

  }

  def simple(text: String): Boolean = {
    val characters = new Array[Boolean](128);
    for (i <- 0 to text.length - 1) {
      if (characters(text.charAt(i))) {
        return false;
      }
      characters(text.charAt(i)) = true;
    }
    true;
  }

  def simple2(text: String): Boolean = {

    val characters = new Array[Boolean](128);
    for (character <- text) {
      if ( characters(character) ) {
        return false;
      };
      characters(character) = true;
    }
    true
  }


}
