public class Samsung extends Phone implements Printable{
    String Criminal;

    public Samsung(String model, int AKB, String criminal) {
        super(model, AKB);
        Criminal = criminal;
    }

    public String getCriminal() {
        return Criminal;
    }

    @Override
    public void print() {
        System.out.println("Model " + this.getModel() + "  Akb " + this.getAKB() + " Criminal " + this.getCriminal() ); }
}
