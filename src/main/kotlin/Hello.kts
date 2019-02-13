import java.util.Calendar

println("Hello\n")

data class Company(val name: String, val year: Long)

val myCompany = Company(name = "Bhinneka", year = 1993)
for (i in 1 until 10) {
    println("I love ${myCompany.name} since ${myCompany.year}")
}

val today = Calendar.getInstance().time
println("\nToday is $today")