public class BlackSharke extends Phone implements Printable{

    String color;

    public BlackSharke(int AKB, String Model, String color) {
        super(Model,AKB);
        this.color = color;

    }


    @Override
    public void print(){

        System.out.println("Model" + this.getModel() + " Akb" + this.getAKB());}
}
