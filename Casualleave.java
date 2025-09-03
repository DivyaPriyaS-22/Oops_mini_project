package LeaveManagementSystem;

public class CasualLeave implements LeaveHandler {
    @Override
    public void processLeave(LeaveRequest request) {
        if (request.getType().equalsIgnoreCase("Casual")) {
            System.out.println("Casual Leave approved for " + request.getEmployee().getName() + " for " + request.getDays() + " days.");
        }
    }
}
