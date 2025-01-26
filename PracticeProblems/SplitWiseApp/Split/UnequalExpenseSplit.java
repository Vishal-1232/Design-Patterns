package Split;

import java.util.List;

public class UnequalExpenseSplit implements ExpenseSplit {
    @Override
    public void validateSplitRequest(List<Split> splits, double totalAmount) {
        double sum = 0;
        for (Split split : splits) {
            sum += split.amountOwe;
        }
        if (sum != totalAmount) {
            throw new IllegalArgumentException("The total amount provided does not match the sum of the splits");
        }
    }
    
}
