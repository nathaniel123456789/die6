public class Yahtzee
{
    private int[] dice = new int[5];
    private Die6 die;
    private String string;
    private String summer;
    private int one;
    private int two;
    private int three;
    private int four;
    private int five;
    private int six;
    public Yahtzee() {
        this.roll();
    }
    public void roll() {
        die = new Die6();
        for (int i = 0; i < 5; i++) {
            die.roll();
            this.dice[i] = die.getValue();
        }
    }
    public void roll(int dieNumber) {
        this.dice[dieNumber - 1] = die.rollAndGetValue();
    }
    public String toString() {
        string = "Dice Values: " + dice[0] +" " + dice[1] +" " + dice[2] +" " +  dice[3] +" " + dice[4];
        return string;
    }
    public String summarize() {
        summer = "";
        one = 0;
        two = 0;
        three = 0;
        four = 0;
        five = 0;
        int a = 0;
        while (a > 5) {
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
            else
                six++;
            a++;
            }
        summer = "1-" + one + "; 2-" + two + "; 3-" + three + "; 4-" + four + "; 5-" + five + "; 6-" + six;
        return summer;
        }
    }