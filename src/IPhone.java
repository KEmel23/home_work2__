public class IPhone extends Phone implements Printable {
    String name;

    public IPhone(int AKB, String Model, String name) {
        super(Model,AKB);
        this.name = name;

    }





    @Override
    public void print() {
        System.out.println("Model" + this.getModel() + " Akb" + this.getAKB());
    }
}
