public class EspressoBuilder implements CoffeeBuilder {
    private String name = "Espresso";
    private String size = "small";
    private String milk = "none";
    private String syrup = "none";
    private String topping = "none";
    private String temperature = "hot";
    private int extraShots = 2;

    @Override public CoffeeBuilder name(String name) { this.name = name; return this; }
    @Override public CoffeeBuilder size(String size) { this.size = size; return this; }
    @Override public CoffeeBuilder setMilk(String milk) { this.milk = milk; return this; }
    @Override public CoffeeBuilder setSyrup(String syrup) { this.syrup = syrup; return this; }
    @Override public CoffeeBuilder addTopping(String topping) { this.topping = topping; return this; }
    @Override public CoffeeBuilder temperature(String t) { this.temperature = t; return this; }
    @Override public CoffeeBuilder extraShots(int s) { this.extraShots = s; return this; }

    @Override
    public Coffee build() {
        if (!"none".equalsIgnoreCase(milk))
            throw new IllegalStateException("Espresso cannot contain milk");
        if (!"none".equalsIgnoreCase(syrup))
            throw new IllegalStateException("Espresso cannot contain syrups");
        if (!"small".equalsIgnoreCase(size))
            throw new IllegalStateException("Espresso must be small");
        return new Coffee(name, size, milk, syrup, topping, temperature, extraShots);
    }
}