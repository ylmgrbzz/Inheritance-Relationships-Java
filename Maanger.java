public class Manager extends Employee {
    private String department;

    public Manager(String name, int age, int employeeId, String position, String department) {
        super(name, age, employeeId, position);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}
