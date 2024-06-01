import java.util.List;

public class Receptionist extends Employee {
    private List<String> languages;

    public Receptionist(String name, int age, int employeeId, String position, List<String> languages) {
        super(name, age, employeeId, position);
        this.languages = languages;
    }

    public List<String> getLanguages() {
        return languages;
    }
}
