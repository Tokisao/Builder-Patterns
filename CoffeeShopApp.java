public class CoffeeShopApp {
    public static void main(String[] args) {
        BaristaDirector director = new BaristaDirector();
        // Director defines recipes; builders enforce each drink's invariants
        System.out.println(director.makeEspresso(new EspressoBuilder()));
        System.out.println(director.makeLatte(new LatteBuilder()));
    }
}
