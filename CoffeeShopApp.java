public class CoffeeShopApp {
    public static void main(String[] args) {
        BaristaDirector director = new BaristaDirector();
        System.out.println(director.makeEspresso(new EspressoBuilder()));
        System.out.println(director.makeLatte(new LatteBuilder()));
    }
}