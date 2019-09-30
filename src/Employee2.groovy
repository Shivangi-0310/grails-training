import groovy.transform.ToString

@ToString
class Employee2 {
    String name
    int age
    int deptNumber
    int employeeNumber
    long salary

    static void main(String[] args) {
        Employee2 employee1 = new Employee2(name: "John", age: 23, deptNumber: 21, employeeNumber: 101, salary: 32000)
        Employee2 employee2 = new Employee2(name: "Joe", age: 24, deptNumber: 22, employeeNumber: 102, salary: 2000)
        Employee2 employee3 = new Employee2(name: "Jack", age: 25, deptNumber: 21, employeeNumber: 103, salary: 3000)
        Employee2 employee4 = new Employee2(name: "Jammie", age: 23, deptNumber: 22, employeeNumber: 104, salary: 4000)
        Employee2 employee5 = new Employee2(name: "Joden", age: 25, deptNumber: 23, employeeNumber: 105, salary: 38000)
        Employee2 employee6 = new Employee2(name: "Jok", age: 26, deptNumber: 24, employeeNumber: 106, salary: 42000)
        Employee2 employee7 = new Employee2(name: "Jash", age: 27, deptNumber: 25, employeeNumber: 107, salary: 52000)
        Employee2 employee8 = new Employee2(name: "Jriden", age: 28, deptNumber: 25, employeeNumber: 108, salary: 35000)
        Employee2 employee9 = new Employee2(name: "Jolen", age: 44, deptNumber: 25, employeeNumber: 109, salary: 30000)
        Employee2 employee10 = new Employee2(name: "aron", age: 37, deptNumber: 26, employeeNumber: 110, salary: 31000)

        List<Employee2> employees = [employee1, employee2, employee3, employee4, employee5,
                                     employee6, employee7, employee8, employee9, employee10]

        println "grouping employee on basis of salary::\n"
        Map map = employees.groupBy {
            it.salary > 5000
        }

        println(map)


        println "get the count of employee in each department:: \n"

        Map<Integer, List> map1 = employees.groupBy {
            it.deptNumber
        }

        map1.each {
            print("dept number:: " + it.getKey() + ",")
            println(" number of employee(s):: " + it.getValue().size())
        }

        List<Employee2> age = []
        Map map3 = employees.groupBy {
            it.age > 18 && it.age < 35
        }.each {
            age.add(it.value)
        }
        println("employees of age 18-35")
        println(age.name)


        Map map4 = employees.groupBy {
            it.name.startsWith('a')
        }
        println(map4)

        Map map5 = employees.groupBy {
            it.deptNumber
        }
        println(map5)

    }
}
