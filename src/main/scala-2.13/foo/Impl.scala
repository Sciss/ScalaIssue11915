package foo

import scala.tools.nsc
import scala.tools.nsc.interpreter.IMain
import scala.tools.nsc.interpreter.shell.ReplReporterImpl
import scala.tools.nsc.{ConsoleWriter, NewLinePrintWriter}

class Impl(cSet: nsc.Settings)
    extends IMain(cSet, {
      val writer = new NewLinePrintWriter(new ConsoleWriter, autoFlush = true)
      new ReplReporterImpl(cSet, writer)
    }) with Base {

  initializeCompiler()
}