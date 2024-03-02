import java.util.Scanner;

public class Delivery4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x;
        int localDeliveryCount = 0;
        double totalLocalDeliveryFees = 0.0;
        int longDistanceDeliveryCount = 0;
        double totalLongDistanceFees = 0.0;

        do {
            System.out.print("Enter Distance (1) Local - (2) Long Distance:");
            x = input.nextInt();

            int w;
            double fee = 0.0;
            String deliveryType = "";

            if (x == 1) {
                System.out.println("Local");
                localDeliveryCount++;
                System.out.print("Enter Weight:");
                w = input.nextInt();

                if (w > 5) {
                    fee = 12.00;
                } else if (w >= 5 && w <= 20) {
                    fee = 16.50;
                } else if (w > 20) {
                    fee = 22.00;
                }

                totalLocalDeliveryFees += fee;
                deliveryType = "Local";
            } else if (x == 2) {
                System.out.println("Long distance");
                longDistanceDeliveryCount++;
                System.out.print("Enter Weight:");
                w = input.nextInt();

                if (w <= 5) {
                    fee = 35.00;
                } else {
                    fee = 47.95;
                }

                totalLongDistanceFees += fee;
                deliveryType = "Long Distance";
            }

            System.out.printf("Delivery Type: %s\n", deliveryType);
            System.out.printf("Fee: $%.2f\n", fee);

            System.out.println("(1) to continue : (0) to exit :");
            x = input.nextInt();

        } while (x != 0);

        System.out.println("Local Delivery Count: " + localDeliveryCount + " items");
        System.out.printf("Total Local Delivery Fee: $%.2f\n", totalLocalDeliveryFees);
        System.out.println("Long Distance Delivery Count: " + longDistanceDeliveryCount + " items");
        System.out.printf("Total Long Distance Delivery Fee: $%.2f\n", totalLongDistanceFees);

        System.out.println("End of Program");
    }
}
