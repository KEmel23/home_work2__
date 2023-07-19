public class Samsung extends Phone{
    String Criminal;

    public Samsung(String model, int AKB, String criminal) {
        super(model, AKB);
        Criminal = criminal;
    }

    public Samsung(String model, int AKB) {
        super(model, AKB);
    }

    @Override
    public void printInfo() {

    }

    @Override
    public void print() {
        System.out.println("Model" + this.getModel() + " Akb" + this.getAKB() + "Criminal" + this.Criminal ); }
}
