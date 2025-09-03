package LeaveManagementSystem;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Divya", 101);
        Manager mgr = new Manager("Ravi", 201, "Engineering");

        mgr.addTeamMember(emp1);

        LeaveRequest request1 = new LeaveRequest(emp1, 3, "Casual");
        LeaveRequest request2 = new LeaveRequest(emp1, 2, "Sick");

        LeaveHandler casualHandler = new CasualLeave();
        LeaveHandler sickHandler = new SickLeave();

        casualHandler.processLeave(request1);
        sickHandler.processLeave(request2);

        mgr.approveLeave(emp1, request1.getDays());
        mgr.approveLeave(emp1, request2.getDays());
    }
}
