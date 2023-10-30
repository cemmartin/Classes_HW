import java.sql.SQLOutput;

public class Main {
    public static void main(String[] arg){
        WaterBottle waterBottle1 = new WaterBottle(100);

        System.out.println(waterBottle1.volume);

        System.out.println(waterBottle1.drinkFunction());

        System.out.println(waterBottle1.bigGulp());

        System.out.println(waterBottle1.fillUp());
    }
}
