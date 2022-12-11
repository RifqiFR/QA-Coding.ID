package smartPhone;

import java.util.ArrayList;

class Smartphone{
    private String merk;
    private int amount;

    public void setMerk(String merk){
        //completed the code
        this.merk = merk;
    }

    public void setAmount(int amount){
        //completed the code
        this.amount = amount;
    }

    public String getMerk(){
        //complete the code
        return this.merk;
    }

    public int getAmount(){
        return this.amount;
    }

}

class Store{
    public String name;
    private ArrayList<Smartphone> arrSmartphone = new ArrayList<Smartphone>();

    public void setName(String name){
        //completed the code
        this.name = name;
    }

    //Add 1 object smartphone to arrSmartphone
    public void addSmartphone(Smartphone objSmartphone){
        //completed the code
        this.arrSmartphone.add(objSmartphone);
    }

    public void getInfo(){
        System.out.println(this.name + " Store have " + this.arrSmartphone.size() + " Smartphone Type with detail");
        //complete the code
        //print each smartphone merk with looping
        for(Smartphone handPhone : arrSmartphone){
            System.out.println("Merek : "+handPhone.getMerk()+ " has "+ handPhone.getAmount() + " Unit");
        }
    }
}


public class SmartPhoneStore {

    public static void main(String[] args) {

        Store objStore = new Store();
        objStore.setName("Tangerang Store");

        Smartphone objSmart1 = new Smartphone();
        objSmart1.setMerk("Oppa");
        objSmart1.setAmount(10);

        Smartphone objSmart2 = new Smartphone();
        objSmart2.setMerk("Samsul");
        objSmart2.setAmount(5);

        objStore.addSmartphone(objSmart1);
        objStore.addSmartphone(objSmart2);

        objStore.getInfo();


    }
}
