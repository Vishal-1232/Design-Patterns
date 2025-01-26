package User;

public class User {
    String id;
    String name;
    UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        this.userExpenseBalanceSheet = new UserExpenseBalanceSheet();
    }

    public String getUserId() {
        return id;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return userExpenseBalanceSheet;
    }

}
