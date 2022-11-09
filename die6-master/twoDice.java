public class twoDice
{
  Die6 die1;
  Die6 die2;
  public twoDice() {
    die1 = new Die6();
    die2 = new Die6();
    this.roll();
  }
  public int getValue() {
    return die1.getValue() + die2.getValue();
        }
  public void roll() {
    die1.roll();
    die2.roll();
  }
  public int rollAndGetValue() {
    roll();
    return getValue();
  }
}