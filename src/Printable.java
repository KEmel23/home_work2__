public interface Printable {
    void printInfo();

    void print ();
    class IPhone implements Printable {
        private int property1;
        private String property2;

        // Конструктор класса Class2 и прочие методы

        @Override
        public void printInfo() {
            System.out.println("Class2 properties:");
            System.out.println("Property1: " + property1);
            System.out.println("Property2: " + property2);
            // Здесь можно добавить вывод других свойств объекта класса Class2
        }

        @Override
        public void print() {

        }
    }

    // Класс 3й, реализующий интерфейс Printable
    class Class3 implements Printable {
        private double property1;
        private boolean property2;

        // Конструктор класса Class3 и прочие методы

        @Override
        public void printInfo() {
            System.out.println("Class3 properties:");
            System.out.println("Property1: " + property1);
            System.out.println("Property2: " + property2);
            // Здесь можно добавить вывод других свойств объекта класса Class3
        }

        @Override
        public void print() {

        }
    }

    // Класс 4й, реализующий интерфейс Printable
    class Class4 implements Printable {
        private String property1;
        private int property2;
        private boolean property3;

        // Конструктор класса Class4 и прочие методы

        @Override
        public void printInfo() {
            System.out.println("Class4 properties:");
            System.out.println("Property1: " + property1);
            System.out.println("Property2: " + property2);
            System.out.println("Property3: " + property3);
            // Здесь можно добавить вывод других свойств объекта класса Class4
        }

        @Override
        public void print() {

        }
    }
}
