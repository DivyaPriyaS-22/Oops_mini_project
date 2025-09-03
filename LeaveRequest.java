package LeaveManagementSystem;

public class LeaveRequest {
    private Employee employee;
    private int days;
    private String type;

    public LeaveRequest(Employee employee, int days, String type) {
        this.employee = employee;
        this.days = days;
        this.type = type;
    }

    public Employee getEmployee() {
        return employee;
    }

    public int getDays() {
        return days;
    }

    public String getType() {
        return type;
    }
}
