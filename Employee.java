public class Employee extends Person {
    private int employeeId;
    private String position;

    public Employee(String name, int age, int employeeId, String position) {
        super(name, age);
        this.employeeId = employeeId;
        this.position = position;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getPosition() {
        return position;
    }
}
