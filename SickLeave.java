package LeaveManagementSystem;

public class SickLeave implements LeaveHandler {
    @Override
    public void processLeave(LeaveRequest request) {
        if (request.getType().equalsIgnoreCase("Sick")) {
            System.out.println("Sick Leave approved for " + request.getEmployee().getName() + " for " + request.getDays() + " days.");
        }
    }
}
