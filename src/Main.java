import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1
        System.out.print("Enter min number: ");
        int min=sc.nextInt();
        System.out.print("Enter max number: ");
        int max=sc.nextInt();
        System.out.print("Enter no. of elements in disabled numbers list: ");
        int listn=sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter list elements...\n");
        for (int i=0;i<listn;i++) {
            list.add(sc.nextInt());
        }
        System.out.println("Disabled Numbers List: " + list);

        // Step 2
        System.out.print("Enter test number: ");

        // Step 3
        if (sc.hasNextInt()) {
            int testNum=sc.nextInt();
            // Step 4
            if (testNum<min || testNum>max) {
                System.out.println("Invalid Input");
            } else {
                // Step 5
                if (testNum>=min && testNum<=max) {
                    while (list.contains(testNum)) {    // goto step 4 & 5 and loop through till testNum>max
                        testNum+=1;
                    }
                    System.out.println("Valid Number: " +testNum); //return the max Valid Number
                }
                else {
                    System.out.println("Invalid Message");
                }
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }
}
