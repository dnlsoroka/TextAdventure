public class Main {

    //Daniel Soroka
    //IST 242 Section 101
    //LM2 Applied Solo Project Text Adventure Enemies




    public static void main(String[] args) {
        //System.out.println("");
//        Item item = new Item("item name", "item description", 100);
//        System.out.println(item.toString());
//
//        Weapon weapon = new Weapon("Weapon name", "Weapon desc", 20, 6);
//        System.out.println(weapon.str());
//        System.out.println();

//        Gold gold = new Gold(5);
//        System.out.println(gold.toString());
//
//        Sword sword = new Sword();
//        System.out.println(sword.str());

        FastZombie fastZombie = new FastZombie();
        System.out.println(fastZombie.toString());
        System.out.println();

        SlowZombie slowZombie = new SlowZombie();
        System.out.println((slowZombie.toString()));
        System.out.println();

        GreenOgre greenOgre = new GreenOgre();
        System.out.println(greenOgre.toString());
        System.out.println();

        BlueOgre blueOgre = new BlueOgre();
        System.out.println(blueOgre.toString());
        System.out.println();

        RedOgre redOgre = new RedOgre();
        System.out.println(redOgre.toString());
        System.out.println();

        SpotDog spotDog = new SpotDog();
        System.out.println(spotDog.toString());
        System.out.println();


    }
}
