
/**
 * Write a description of class die20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class dieN
{
    private int value; 
    private int sides;
    public dieN(int n) {
        this.sides = n;
        this.roll();
    
    }
    public int getValue() {
        return value;
    }
    public void roll() {
        this.value = (int)(Math.random() * this.sides) + 1;
    }
    public int rollAndGetValue() {
        roll();
        return getValue();
    }
}