package script

import kotlinx.cinterop.pointed
import kotlinx.cinterop.toKString
import platform.posix.closedir
import platform.posix.opendir
import platform.posix.readdir

fun main() {
  println("Hello")
  showCurrentDirectory("/Users/budioktaviyan/")
}

fun showCurrentDirectory(currentDirectory: String) {
  val directory = opendir(currentDirectory)

  if (null != directory) {
    try {
      var result = readdir(directory)
      println("List of current directory:")

      while (null != result) {
        println(result.pointed.d_name.toKString())
        result = readdir(directory)
      }
    } finally {
      closedir(directory)
    }
  }
}