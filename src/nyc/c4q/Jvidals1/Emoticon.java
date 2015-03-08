package nyc.c4q.Jvidals1;

import java.util.Scanner;
/**
 * Created by s3a on 3/8/15.
 */
public class Emoticon {

    public static void main(String[] args) {

         Scanner input = new Scanner(System.in);


        System.out.println("How do you feel? Enter ' :)''(ツ)',':(' ");
        String feeling = input.nextLine();

        if (feeling==":)" ) {
            System.out.println("Today you're happy.");
        }

        else if (feeling == ":(") {
                System.out.println(" Today you're sad.");
                System.out.println("What's wrong?");
            }
                else {
                    System.out.println(" You're feeling like whatever.");
                }

                System.out.println("Peace out!");
            }
        }


/*   if (smiley.equals (:) ")
    System.out.println("You're happy!);
    *  emotion = "happy"; --another way to write this and at the end just add a system print line, you can save the info

    else if (smiley.equals (":(")
        System.out.println("You're sad!);







 */







