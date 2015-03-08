package nyc.c4q.Jvidals1;

/**
 * Created by s3a on 3/8/15.
 */

import java.util.Scanner;

public class Friut {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String fruit = scanner.nextLine();
        String color =scanner.nextLine();
        String flavor=scanner.nextLine();

        if (fruit.equals("banana")) {
            color = "yellow";
            flavor = "sweet";

        }
        else if (fruit.equals("grapefruit")) {
            color = "pink";
            flavor = "bitter";


        } else if (fruit.equals("lime")) {
            color = "green";
            flavor= "sour";

        }

        else if (fruit.equals("apple")) {
            color="red";
            flavor="sweet";
        }

        else {


            System.out.println("I don't know that fruit.");
        }

            System.out.println("a " + fruit + " is " + color + " and tastes " + flavor);





    }
}