import chocolate.*;
import planet.*;
import planet.Mars;
import planet.moon.Phobos;

public class Test {
    public static void main(String[] args) {
        planet.Mars lo = new planet.Mars("Viking 1");
        planet.Mars lol = new planet.Mars("Viking 50");
        chocolate.Mars l = new chocolate.Mars();
        chocolate.Mars la = new chocolate.Mars();
        chocolate.Mars lb = new chocolate.Mars();
        Astronaut boy = new Astronaut("Simon");
        planet.moon.Phobos ph = new Phobos("Vortex");

        System.out.println(boy.getId());
        System.out.println(lo.getId());
        System.out.println(lo.getLandingSite());

        boy.doActions(lo);

        Astronaut mutta = new Astronaut("Mutta");
        Astronaut hibito = new Astronaut("Hibito");
        Astronaut serika = new Astronaut("Serika");
        Team spaceBro = new Team("SpaceBrothers");
        spaceBro.add(mutta);
        spaceBro.add(hibito);
        spaceBro.add(serika);
        System.out.println(spaceBro.countMembers());
        Mars titi = new Mars("Hill");
        mutta.doActions(titi);
        spaceBro.showMembers();
        System.out.println(spaceBro.countMembers ());
        System.out.println();
        System.out.println();
        hibito.doActions(lol);
        System.out.println(hibito.getDestination());
        spaceBro.doActions(ph);
        System.out.println(hibito.getDestination());
    }
}
