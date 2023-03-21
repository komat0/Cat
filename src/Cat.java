
public class Cat {
    private double originWeight;
    private double weight;
    private double minWeight;
    private double maxWeight;
    private double eatenAmount = 0;
    private static int catCounter = 0;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        catCounter++;
    }

    public void meow() {
        weight = weight - 1000;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        eatenAmount = eatenAmount + amount;
        weight = weight + amount;
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

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
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
}