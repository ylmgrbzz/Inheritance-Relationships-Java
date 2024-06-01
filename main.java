import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Yalım", 30);
        Employee employee = new Employee("Gürbüz", 25, 1001, "Receptionist");
        Manager manager = new Manager("Necati", 40, 1002, "Manager", "Front Office");
        Receptionist receptionist = new Receptionist("Leyla", 28, 1003, "Receptionist", Arrays.asList("English", "French"));
       

        System.out.println("Person Name: " + person.getName() + ", Age: " + person.getAge());
        System.out.println("Employee Name: " + employee.getName() + ", Age: " + employee.getAge() + ", ID: " + employee.getEmployeeId() + ", Position: " + employee.getPosition());
        System.out.println("Manager Name: " + manager.getName() + ", Age: " + manager.getAge() + ", ID: " + manager.getEmployeeId() + ", Position: " + manager.getPosition() + ", Department: " + manager.getDepartment());
        System.out.println("Receptionist Name: " + receptionist.getName() + ", Age: " + receptionist.getAge() + ", ID: " + receptionist.getEmployeeId() + ", Position: " + receptionist.getPosition() + ", Languages: " + receptionist.getLanguages());
       
    }
}
