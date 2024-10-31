public class Main {

    public static void main(String[] args) {
        try {
            EmployeeDao employeeTableObj = new EmployeeDaoProxy();
            employeeTableObj.create("User", employeeTableObj);
            System.out.println("Operation Successful");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
