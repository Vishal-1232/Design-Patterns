package Split;

import java.util.List;

public class EqualExpenseSplit implements ExpenseSplit {
    @Override
    public void validateSplitRequest(List<Split> splits, double totalAmount) {
        double totalSplitAmount = 0;
        for (Split split : splits) {
            totalSplitAmount += split.amountOwe;
        }
        if (totalSplitAmount != totalAmount) {
            throw new IllegalArgumentException("The total split amount is not equal to the total amount");
        }
    }

}
