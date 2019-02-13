import kotlinx.cinterop.*
import platform.posix.*

fun main(args: Array<String>) {
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