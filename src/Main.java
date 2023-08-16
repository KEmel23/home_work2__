class Main{
    public static void main(String[] args) {
        Phone[] phone = new Phone[3];
        for (int i = 0; i < phone.length; i++) {
            phone[0] = creatObjecct("IPhone");
            phone[1] = creatObjecct("Samsung");
            phone[2] = creatObjecct("BlackShark");
            phone[i].print();
        }


    }
    public static Phone creatObjecct(String className){
        Phone phone = null;
        if (className.equals("IPhone")){
            phone = new IPhone(2848,"IPhone Xr","made in chine");
        } else if (className.equals("Samsung")) {
            phone = new Samsung("a4S",4000,"copy");
        } else if (className.equals("BlackShark")) {
            phone = new BlackSharke(6000,"Ryzen3","gray");
        }
        return phone;
    }

}