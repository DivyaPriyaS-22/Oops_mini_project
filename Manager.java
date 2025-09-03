package LeaveManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private String department;
    private List<Employee> team;

    public Manager(String name, int id, String department) {
        super(name, id);
        this.department = department;
        this.team = new ArrayList<>();
    }

    public void approveLeave(Employee employee, int days) {
        System.out.println("Manager " + getName() + " approved " + days + " days of leave for " + employee.getName());
    }

    public void addTeamMember(Employee employee) {
        team.add(employee);
    }

    public List<Employee> getTeam() {
        return team;
    }
}
