import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Employee {
    int id;
    String name;
    double salary;
    String city;
    public Employee(int id, String name, double salary, String city) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.city = city;
    }
    public double getSalary() {
        return salary;
    }
    public String getCity() {
        return city;
    }   
    public String getName() {
        return name;
    }  
     public int getId() {
        return id;
}

public static Optional<Employee> findSecondHighestSalary(List<Employee> employees,String cityName){
    return employees.stream()
    .filter(e->e.getCity().equalsIgnoreCase(cityName))
    .sorted((e1,e2)->Double.compare(e2.getSalary(), e1.getSalary()))
    .skip(1)
    .distinct()
    .findFirst();
}

public static void main(String[] args) {
    // Example usage can be added here
    List<Employee> employee = Arrays.asList(
        new Employee(1, "Alice", 70000, "New York"),
        new Employee(2, "Bob", 80000, "New York"),
        new Employee(3, "Charlie", 60000, "Los Angeles"),
        new Employee(4, "David", 90000, "New York"),
        new Employee(5, "Eve", 75000, "Los Angeles")
    );
    Optional<Employee> secondHighest = findSecondHighestSalary(employee, "New York");
    secondHighest.ifPresent(e -> System.out.println("Second highest salary in New York: " + e.getSalary()));


}









}
