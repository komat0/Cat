import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Cat marusya = new Cat();
        Cat vasya = new Cat();
        Cat barsik = new Cat();
        Cat timokha = new Cat();
        Cat agnus = new Cat();


        System.out.println(marusya.getStatus());
        System.out.println(vasya.getStatus());
        System.out.println(barsik.getStatus());
        System.out.println(timokha.getStatus());
        System.out.println(agnus.getStatus());

        Cat.getCatCounter();

        while (vasya.getWeight() <= vasya.getMaxWeight()) {
            vasya.feed(1000.0);
            System.out.println("Васю покормили");
        }

        System.out.println("Вася " + vasya.getStatus());

        vasya.getEatenAmount();

        Cat.getCatCounter();

        System.out.println("Тимоха " + timokha.getStatus());

        while (!Objects.equals(timokha.getStatus(), "Dead")) {
            timokha.meow();
        }
        System.out.println("Тимоха " + timokha.getStatus());


        System.out.println(marusya.getStatus());
        System.out.println(vasya.getStatus());
        System.out.println(barsik.getStatus());
        System.out.println(timokha.getStatus());
        System.out.println(agnus.getStatus());

        Cat.getCatCounter();

        System.out.println(agnus.getWeight());
        agnus.pee();
        System.out.println(agnus.getWeight());

    }
}