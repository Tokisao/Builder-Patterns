public class LatteBuilder implements CoffeeBuilder {
    private String name = "Latte";
    private String size = "medium";
    private String milk = "oat";
    private String syrup = "none";
    private String topping = "none";
    private String temperature = "hot";
    private int extraShots = 1;

    @Override public CoffeeBuilder name(String name) { this.name = name; return this; }
    @Override public CoffeeBuilder size(String size) { this.size = size; return this; }
    @Override public CoffeeBuilder setMilk(String milk) { this.milk = milk; return this; }
    @Override public CoffeeBuilder setSyrup(String syrup) { this.syrup = syrup; return this; }
    @Override public CoffeeBuilder addTopping(String topping) { this.topping = topping; return this; }
    @Override public CoffeeBuilder temperature(String t) { this.temperature = t; return this; }
    @Override public CoffeeBuilder extraShots(int s) { this.extraShots = s; return this; }

    @Override
    public Coffee build() {
        // Latte requires milk and cannot be small — validate at build time
        if ("none".equalsIgnoreCase(milk))
            throw new IllegalStateException("Latte requires milk");
        if ("small".equalsIgnoreCase(size))
            throw new IllegalStateException("Latte cannot be small");
        return new Coffee(name, size, milk, syrup, topping, temperature, extraShots);
    }
}
