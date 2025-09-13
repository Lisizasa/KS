package lesson2

fun main(){
    val numberOfWorkers: Int = 50
    val salaryOfWorkers: Int = 30000
    val numberOfIntern: Int = 30
    val salaryOfIntern: Int = 20000

    val constantCost: Int = numberOfWorkers * salaryOfWorkers
    val allCost: Int = constantCost + numberOfIntern * salaryOfIntern
    val averageSalary: Int = allCost / (numberOfWorkers + numberOfIntern)

    println(numberOfWorkers)
    println(numberOfIntern)
    println(salaryOfWorkers)
    println(salaryOfIntern)
    println(constantCost)
    println(allCost)
    println(averageSalary)

}
