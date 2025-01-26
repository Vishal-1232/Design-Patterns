package Split;

public class SplitFactory {
    public static ExpenseSplit getSplitObject(SplitType splitType) {
        switch (splitType) {
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            case EQUAL:
                return new EqualExpenseSplit();
            case EXACT:
                return new UnequalExpenseSplit();
        }
        return null;
    }
}
