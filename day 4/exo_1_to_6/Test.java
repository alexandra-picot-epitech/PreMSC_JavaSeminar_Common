public class Test {

    public static void main(String[] args) {
        Animal isidore = new Animal ("Isidore", 4, Animal.Type.FISH);
        Animal idore = new Animal ("Isidore", 4, Animal.Type.FISH);
        Animal dore = new Animal ("Isidore", 4, Animal.Type.MAMMAL);
        System.out.println(isidore.getName() + " has " + isidore.getLegs()
                + " legs and is a " + isidore.getType());
        Animal.getNumberOfMammals();
        Animal.getNumberOfFish();
        Animal.getNumberOfBirds();

        Cat sidore = new Cat ("Isidore", "orange") ;
        System.out.println(sidore.getName() + " has " + sidore.getLegs()
                + " legs and is a " + sidore.getType()) ;
        sidore.meow() ;

        Canary titi = new Canary("Titi");
        Shark willy = new Shark("Willy"); // Yes Willy is a shark here !
        willy.status();
        willy.smellBlood( true );
        willy.status();
        titi.layEgg();
        System.out.println(titi.getEggsCount());

        willy.eat(titi);
        willy.eat(willy);

        BlueShark bl = new BlueShark("Bob");
        GreatWhite g = new GreatWhite("b");
        g.eat(titi);
        bl.eat(titi);
        bl.eat(g);
        g.eat(bl);
    }
}
