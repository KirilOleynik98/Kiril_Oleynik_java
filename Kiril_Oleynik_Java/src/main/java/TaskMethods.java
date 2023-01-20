import java.util.ArrayList;
import java.util.Scanner;

public class TaskMethods {

    public void firstTask() {
        System.out.println("Enter number > 7 to see hello word");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        } else if (number < 7) {
            System.out.println("Wrong number");
        } else if (number == 7) {
            System.out.println("Wrong number");
        }
        scanner.close();
    }

    public void secondTask() {
        System.out.println("Enter \"Вячеслав\" to see hello word");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Wrong name");
        }
        scanner.close();
    }

    public void thirdTask() {
        int array[] = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = (int) (Math.random() * 21);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : array) {
            if (num % 3 == 0) {
                list.add(num);
            }
        }
        System.out.println(list);
    }
}



