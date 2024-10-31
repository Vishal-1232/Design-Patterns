import java.util.concurrent.ThreadLocalRandom;

public class Dice {
    int diceCount;
    int minNum;
    int maxNum;

    public Dice(int diceCount){
        this.diceCount = diceCount;
        minNum = 1;
        maxNum = 6;
    }

    public int rollDice(){
        int diceUsed = 0;
        int totalSum = 0;

        while (diceUsed < diceCount) {
            totalSum += ThreadLocalRandom.current().nextInt(minNum,maxNum+1);
            diceUsed++;
        }
        return totalSum;
    }
}
