public class Person {
    
    private String name;
    private Integer age;
    private String gender;
    private String address;

    public Person(String name, Integer age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String... args) {
        Person person = new Person("Aakash", 20,"Male", "Delhi");

        System.out.println("Accessing details by dot operator:: \n");
        System.out.println("Name:: " + person.name + "\n"
                + "Age:: " + person.age + "\n"
                + "Gender:: " + person.gender + "\n"
                + "Address:: " + person.address);

        System.out.println("Accessing by getter:: \n");
        System.out.println("Name:: " + person.getName() + "\n"
                + "Age:: " + person.getAge() + "\n"
                + "Gender:: " + person.getGender() + "\n"
                + "Address:: " + person.getAddress());

        System.out.println("Using toString()::\n");
        System.out.println("Person details:: \n"+ person);
    }
}

