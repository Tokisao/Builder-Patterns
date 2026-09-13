public class Coffee {
    private String name;
    private String size;
    private String milk;
    private String syrup;
    private String topping;
    private String temperature;
    private int extraShots;

    Coffee(String name, String size, String milk, String syrup,
           String topping, String temperature, int extraShots) {
        this.name = name;
        this.size = size;
        this.milk = milk;
        this.syrup = syrup;
        this.topping = topping;
        this.temperature = temperature;
        this.extraShots = extraShots;
    }

    @Override
    public String toString() {
        return "Coffee recipe: "+ "\nName: " +name+ "\nEnums.Size:" + size + "\nEnums.Milk: " + milk
                + "\nSyrup: " + syrup + "\nTopping: " + topping + "\nEnums.Temperature: "
                + temperature +"\nExtra shots: " + extraShots +"\n";
    }
}