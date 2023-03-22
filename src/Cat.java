public class Cat {
    private String name;
    private double originWeight;
    private double weight;
    private final double minWeight = 1000.0;
    private final double maxWeight = 9000.0;
    private double eatenAmount;
    private static int catCounter;
    private static final int eyes = 2;
    private static final int legs = 4;
    private String catColor;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        catCounter++;
    }

    public Cat(int weight) {
        this();
        this.weight = weight;
    }

    public void meow() {
        this.weight = weight - 1000;
        System.out.println("Котик проорал Meow и потерял в весе 1000");
        if (weight <= minWeight) {
            System.out.println("Котик заорал себя до смерти");
            catCounter--;
        }
    }

    public void feed(Double amount) {
        eatenAmount = eatenAmount + amount;
        weight = weight + amount;
        if (weight >= maxWeight) {
            System.out.println("Котик переел и умер");
            catCounter--;
        }
    }

    public void drink(Double amount) {
        weight = weight + amount;
    }

    public Double getWeight() {
        return weight;
    }

    public Double getMaxWeight() {
        return maxWeight;
    }

    public String getCatStatus() {
        if (weight <= minWeight) {
            return "Dead";
        } else if (weight >= maxWeight) {
            return "Exploded";
        } else if (weight >= originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public static void getCatCounter() {
        System.out.println("Всего кошек: " + catCounter);
    }

    public void getEatenAmount() {
        System.out.println(eatenAmount);
    }

    public double pee() {
        weight = weight - 10;
        System.out.println("Животное сходило в лоток и потеряло 10 в весе, вес стал " + weight);
        return weight;
    }

    public void setCatColor(Colors color) {
        catColor = String.valueOf(color);
    }

    public void getCatColor() {
        System.out.println(catColor);
    }
}