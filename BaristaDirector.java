public class BaristaDirector {
    public Coffee makeEspresso(CoffeeBuilder b) {
        // Espresso canon: hot, double shot, no milk
        return b.temperature("hot").extraShots(2).build();
    }

    public Coffee makeLatte(CoffeeBuilder b) {
        // Default latte on oat milk, single shot
        return b.setMilk("oat").temperature("hot").extraShots(1).build();
    }
}
