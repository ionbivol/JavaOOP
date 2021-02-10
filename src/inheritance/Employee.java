package inheritance;

public class Employee {

    private String name;
    private int age;
    private String address;
    private double salary;
    private double bonus;

    public Employee(String name, int age, String address, double salary, double bonus) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


    public void workHard(){
        System.out.println("You did great");
    }

    public void lazy(){
        System.out.println("You are very lazy");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
