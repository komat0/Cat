import java.util.Objects;

public class Loader {
    public static void main(String[] args) throws NoSuchFieldException {
        Cat marusya = new Cat();
        Cat vasya = new Cat();
        Cat barsik = new Cat();
        Cat timokha = new Cat();
        Cat agnus = new Cat();

//        System.out.println(marusya.getCatStatus());

        Cat.getCatCounter();

        while (vasya.getWeight() <= vasya.getMaxWeight()) {
            vasya.feed(1000.0);
        }

        System.out.println("Вася " + vasya.getCatStatus());
//
//        vasya.getEatenAmount();
//
//        Cat.getCatCounter();
//
//        System.out.println("Тимоха " + timokha.getCatStatus());

        while (!Objects.equals(timokha.getCatStatus(), "Dead")) {
            timokha.meow();
        }
        System.out.println("Тимоха " + timokha.getCatStatus());

//        System.out.println(marusya.getCatStatus());
//        System.out.println(vasya.getCatStatus());
//        System.out.println(barsik.getCatStatus());
//        System.out.println(timokha.getCatStatus());
//        System.out.println(agnus.getCatStatus());
//
//        Cat.getCatCounter();

//        System.out.println(agnus.getWeight());
        agnus.pee();
//        System.out.println(agnus.getWeight());

        marusya.setCatColor(Colors.RED);
//        marusya.getCatColor();
        timokha.setCatColor(Colors.BLACK);
//        timokha.getCatColor();

        Cat cat1 = Loader.getKitten();
        Cat cat2 = Loader.getKitten();
        Cat cat3 = Loader.getKitten();

//        System.out.println(cat1.getCatStatus());
//        cat2.pee();
//        cat3.meow();

        Cat inga = new Cat(5000, Colors.SPOTED, "Inga");
//        inga.getCatColor();
//        System.out.println(inga.getOriginWeight());
//        System.out.println(inga.getWeight());
//        System.out.println(inga.getMinWeight());
//        System.out.println(inga.getMaxWeight());
//        System.out.println(inga.getEyes());
//        System.out.println(inga.getLegs());
//        System.out.println(inga.getCatStatus());
        Cat ingaJr = new Cat(inga.getOriginWeight(),Colors.SPOTED, "IngaJr");
        ingaJr.setWeight(inga.getWeight());

    }

    private static Cat getKitten() {
        return new Cat(1100);
    }
}