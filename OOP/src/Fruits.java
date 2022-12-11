public class Fruits {
    private String name;
    private String color;
    public Fruits(String name, String color) {
        //lengkapi code
        this.name = name;
        this.color = color;

    }
    public String getName() {
        //lengkapi code
        return this.name;
    }
    public String getColor() {
        return this.color;
    }
    public void getInfo() {
        //lengkapi code

        System.out.println("Color Of "+ getName()+ " Is " + getColor());
    }

    public static void main(String[] args) {
        Fruits objFruit = new Fruits("Banana", "Yellow");
        Fruits objFruit2 = new Fruits("Apple", "Red");

        objFruit.getInfo();
        objFruit2.getInfo();
    }
}
