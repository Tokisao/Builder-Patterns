public class BaristaDirector {
    public Coffee makeEspresso(CoffeeBuilder b) {
        return b.temperature("hot").extraShots(2).build();
    }
    public Coffee makeLatte(CoffeeBuilder b) {
        return b.setMilk("oat").temperature("hot").extraShots(1).build();
    }
}