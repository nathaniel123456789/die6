public class Yahtzee
{
    private Die6 die1;
    private Die6 die2;
    private Die6 die3;
    private Die6 die4;
    private Die6 die5;
    public Yahtzee() {
        this.die1 = new Die6();
        this.die2 = new Die6();
        this.die3 = new Die6();
        this.die4 = new Die6();
        this.die5 = new Die6();
        this.roll();
    }

    public void roll() {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();
    }

    public void roll(int dieNumber) {
        if (dieNumber == 1) {
            die1.roll();
        }
        if (dieNumber == 2) {
            die2.roll();
        }
        if (dieNumber == 3) {
            die3.roll();
        }
        if (dieNumber == 4) {
            die4.roll();
        }
        if (dieNumber == 5) {
            die5.roll();
        }
    }

    public String toString() {
        String string = "Dice Values: " + die1.getValue() + " " + die2.getValue() + " " + die3.getValue() + " " 
        + die4.getValue() + " " + die5.getValue();
        return string;
    }

    public String summarize() {
        int a = 0;
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        String summer = "";
        int[] dice = new int[5];
        dice[0] = die1.getValue();
        dice[1] = die2.getValue();
        dice[2] = die3.getValue();
        dice[3] = die4.getValue();
        dice[4] = die5.getValue();
        while (a < 5) {
            if (dice[a] == 1) {
                one++;
            }
            else if (dice[a] == 2) {
                two++;
            }
            else if (dice[a] == 3) {
                three++;
            }
            else if (dice[a] == 4) {
                four++;
            }
            else if (dice[a] == 5) {
                five++;
            }
            else {
                six++;
            }
            a++;
        }
        summer = "1-" + one + "; 2-" + two + "; 3-" + three + "; 4-" + four + "; 5-" + five + "; 6-" + six;
        return summer;
    }
}