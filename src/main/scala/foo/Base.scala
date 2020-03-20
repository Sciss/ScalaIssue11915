package foo

import scala.tools.nsc.interpreter.{IMain, Results}

trait Base {
  _: IMain =>

  def test(): Unit = {
    val run1 = eval("1234")
    val run2 = eval("5678")
    println(s"run1: $run1, run2: $run2")
  }

  def eval(source: String): Any = {
    reset()
    val res: Results.Result = interpret(source)

    res match {
      case Results.Success =>
        val n = mostRecentVar
        valueOfTerm(n).getOrElse(sys.error(s"No value for term $n"))

      case Results.Error      => sys.error("failed")
      case Results.Incomplete => sys.error("incomplete")
    }
  }
}
