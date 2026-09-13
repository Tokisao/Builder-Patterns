public interface CoffeeBuilder {
    CoffeeBuilder name(String name);
    CoffeeBuilder size(String size);
    CoffeeBuilder setMilk(String milk);
    CoffeeBuilder setSyrup(String syrup);
    CoffeeBuilder addTopping(String topping);
    CoffeeBuilder temperature(String temperature);
    CoffeeBuilder extraShots(int extraShots);
    Coffee build();
}