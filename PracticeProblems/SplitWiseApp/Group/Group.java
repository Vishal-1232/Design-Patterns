package Group;

import java.util.ArrayList;
import java.util.List;

import Expense.Expense;
import Expense.ExpenseController;
import Split.Split;
import Split.SplitType;
import User.User;

public class Group {

    String groupId;
    String groupName;
    List<User> groupMembers;
    List<Expense> expenseList;
    ExpenseController expenseController;

    public Group() {
        groupMembers = new ArrayList<>();
        expenseList = new ArrayList<>();
        this.expenseController = new ExpenseController();
    }

    public void addMember(User user) {
        groupMembers.add(user);
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
            List<Split> splitDetails, SplitType splitType, User paidByUser) {

        Expense expense = expenseController.createExpense(expenseId, description, expenseAmount, splitDetails,
                splitType, paidByUser);
        expenseList.add(expense);
        return expense;
    }

}
