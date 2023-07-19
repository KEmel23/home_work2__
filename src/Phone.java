public abstract class Phone implements Printable  {
    String Model ;
    int AKB;

    public String getModel() {
        return Model;
    }

    public Phone(String model, int AKB) {
        Model = model;
        this.AKB = AKB;
    }

    public static int getAKB() {
        return getAKB();

    }
}
