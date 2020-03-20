package foo

import java.io.File

import scala.tools.nsc

object Main {
  def main(args: Array[String]): Unit = {
    val cSet = new nsc.Settings()
    cSet.classpath.value += File.pathSeparator + sys.props("java.class.path")
    new Impl(cSet).test()
  }
}