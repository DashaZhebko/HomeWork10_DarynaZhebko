import java.util.Arrays;
import java.util.Random;

public class HomeWork10 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] teamOne = new int[25];
        int[] teamTwo = new int[25];
        int minValue = 18;
        int maxValue = 40;

        int sumOne = 0;
        int sumTwo = 0;

        for (int i = 0; i < teamOne.length; i++) {
            teamOne[i] = random.nextInt(maxValue - minValue + 1) + minValue;
            sumOne += teamOne[i];
        }
        System.out.println("Віковий склад першої команди: ");
        System.out.println(Arrays.toString(teamOne));
        System.out.println("Середній вік серед гравців першої команди: " + sumOne / teamOne.length);

        for (int i = 0; i < teamTwo.length; i++) {
            teamTwo[i] = random.nextInt(maxValue - minValue + 1) + minValue;
            sumTwo += teamTwo[i];
        }
        System.out.println("Віковий склад другої команди: ");
        System.out.println(Arrays.toString(teamTwo));
        System.out.println("Середній вік серед гравців другої команди: " + sumTwo / teamTwo.length);
    }
}
