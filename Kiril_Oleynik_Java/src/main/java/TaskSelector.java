import java.util.Scanner;

public class TaskSelector {

    public void start() {
        TaskMethods taskMethods = new TaskMethods();
        try {
            System.out.println("Enter 1 to run the first task");
            System.out.println("Enter 2 to run the second task");
            System.out.println("Enter 3 to run the third task");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            if (1 == num) {
                taskMethods.firstTask();
            }
            if (2 == num) {
                taskMethods.secondTask();
            }
            if (3 == num) {
                taskMethods.thirdTask();
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println("Вы ввели некорректный символ");
        }
    }
}
