public class Yahtzee
{
    private int[] dice = new int[5];
    private Die6 die;
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
}
