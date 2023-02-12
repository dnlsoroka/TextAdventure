public class Gold extends Item{
    private int amt;

    public Gold(int amt){
        super("Gold", String.format("a round coin with %s stamped on the front.", String.valueOf(amt)), amt);
        this.amt = amt;

    }


}
