import groovy.transform.InheritConstructors
import groovy.transform.ToString

@ToString
@InheritConstructors
class Child extends Person {

    String empId
    String company
    long salary

    Child(String name, Integer age, String gender, String address, String empId, String company, long salary) {
        super(name, age, gender, address)
        this.empId = empId
        this.company = company
        this.salary = salary
    }

    @Override
    public String toString() {
        return "${name} is a man aged ${age} who lives at ${address}. He works for ${company} with employee id ${empId} and draws ${salary} lots of money !!!!."
    }


    public static void main(String[] args) {
        def child = new Child("John", 30, "Male", "USA", "OO08", "Amazon", 1000000l)

        System.out.println("Accessing details by dot operator:: \n")
        System.out.println("Name:: " + child.name + "\n"
                + "Age:: " + child.age + "\n"
                + "Gender:: " + child.gender + "\n"
                + "Address:: " + child.address + "\n"
                + "empId:: " + child.empId + "\n"
                + "Company:: " + child.company + "\n"
                + "Salary:: " + child.salary)

        System.out.println("\nAccessing by getter:: ")
        System.out.println("Name:: " + child.getName() + "\n"
                + "Age:: " + child.getAge() + "\n"
                + "Gender:: " + child.getGender() + "\n"
                + "Address:: " + child.getAddress() + "\n"
                + "empId:: " + child.getEmpId() + "\n"
                + "Company:: " + child.getCompany() + "\n"
                + "Salary:: " + child.getSalary())

        System.out.println("\nUsing toString()::")
        System.out.println(">>> \n" + child)
    }
}
