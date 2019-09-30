class Employee {
    String name
    int age
    long salary

    static void main(String[] args) {

        Employee employee1 = new Employee(name: "John", age: 23, salary: 32000)
        Employee employee2 = new Employee(name: "Joe", age: 24, salary: 2000)
        Employee employee3 = new Employee(name: "Jack", age: 25, salary: 3000)
        Employee employee4 = new Employee(name: "Jammie", age: 23, salary: 4000)
        Employee employee5 = new Employee(name: "Joden", age: 25, salary: 38000)
        Employee employee6 = new Employee(name: "Jok", age: 26, salary: 42000)
        Employee employee7 = new Employee(name: "Jash", age: 27, salary: 52000)
        Employee employee8 = new Employee(name: "Jriden", age: 28, salary: 35000)
        Employee employee9 = new Employee(name: "Jolen", age: 29, salary: 30000)
        Employee employee10 = new Employee(name: "Jae", age: 30, salary: 31000)

        List<Employee> employees = [employee1, employee2, employee3, employee4, employee5,
                                    employee6, employee7, employee8, employee9, employee10]

        println("Employees with sal < 5000:: \n")
        employees.each {
            if (it.salary < 5000)
                println(it.name +"  "  + it.age + "   " + it.salary)
        }

        employees.sort({it.age})
        println("Youngest and oldest employees:: \n")

        println("youngest employee::\n ")
        println(employees.first().name +"  "  + employees.first().age + "   " + employees.first().salary)

        print( "Oldest Employee:::\n")
        println(employees.last().name +"  "  + employees.last().age + "   " + employees.last().salary)

        employees.sort({
            it.salary
        })

        print("Employee with max salary::\n ")
        println(employees.last().name +"  "  + employees.last().age + "   " + employees.last().salary)

        List names = []
        employees.each {
            names.add(it.name)
        }

        println("name of employees:: \n")
        names.each {
            println "${it}"
        }
    }
}
