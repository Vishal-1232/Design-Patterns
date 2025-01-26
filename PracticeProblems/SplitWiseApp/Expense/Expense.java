package Expense;
import java.util.ArrayList;
import java.util.List;
import Split.Split;
import Split.SplitType;
import User.User;

public class Expense {
    String id;
    String name;
    String description;
    double amount;
    User paidByUser;
    SplitType splitType;
    List<Split> splits = new ArrayList<>();


    public Expense(String expenseId, double expenseAmount, String description,
                   User paidByUser, SplitType splitType, List<Split> splitDetails) {

        this.id = expenseId;
        this.amount = expenseAmount;
        this.description = description;
        this.paidByUser = paidByUser;
        this.splitType = splitType;
        this.splits.addAll(splitDetails);

    }

}
