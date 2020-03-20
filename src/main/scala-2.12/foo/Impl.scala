package foo

import scala.tools.nsc
import scala.tools.nsc.interpreter.IMain
import scala.tools.nsc.{ConsoleWriter, NewLinePrintWriter}

class Impl(cSet: nsc.Settings)
  extends IMain(cSet, new NewLinePrintWriter(new ConsoleWriter, autoFlush = true)) with Base {

  initializeSynchronous()
}
