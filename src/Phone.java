public abstract class Phone implements Printable {
    String Model;
    int AKB;

    public Phone(String model, int AKB) {
        this.Model = model;
        this.AKB = AKB;
    }

    public String getModel() {
        return Model;
    }

    public int getAKB() {
        return AKB;
    }
}


