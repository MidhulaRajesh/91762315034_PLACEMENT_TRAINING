public class WaterBottles {
    public static void main(String[] args) {

        int numBottles = 9;   
        int exchange = 3;

        int total = numBottles;
        int empty = numBottles;

        while (empty >= exchange) {
            int newBottles = empty / exchange;
            total += newBottles;
            empty = newBottles + (empty % exchange);
        }

        System.out.println("Total bottles drunk: " + total);
    }
}