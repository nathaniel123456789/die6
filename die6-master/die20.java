
/**
 * Write a description of class die20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class die20
{
    private int value; 
    
    public die20() {
        this.roll();
    }
    public int getValue() {
        return value;
    }
    public void roll() {
        this.value = (int)(Math.random() * 20) + 1;
    }
    public int rollAndGetValue() {
        roll();
        return getValue();
    }
}
