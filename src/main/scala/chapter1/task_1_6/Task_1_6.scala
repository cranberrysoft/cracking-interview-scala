package chapter1.task_1_6

/**
 * Compress characters a-Z (only letters small and capital letters)
 *
 * aaa -> a3
 * aaabbaaaa -> a3b2a4
 *
 * If size of the compressed text is the same or bigger than original text, return original text
 *
 * a -> a
 * aa -> aa
 *
 */
object Tak_1_6 {

  def compress(text: String): String = {
    return text
      .map(character => Group(character.toString))
      .reduceLeftOption(
        (a, b) => if (a.last() == b.last()) Group(a.character, a.count + b.count) else Group(a.result() + b.character, b.count)
      )
      .filter(_.resultSize() < text.length)
      .map(_.result())
      .getOrElse(text)
  }
}

case class Group(character: String, count: Int = 1) {

  def last(): String = character.last.toString

  def result(): String = character + count

  def resultSize() = character.length
}
