import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner inputDevice = new Scanner(System.in);
        System.out.println("To-Do List");
        startList(inputDevice);

    }

    public static void startList(Scanner inputDevice){
        User user = askName(inputDevice);
        Tasks tasks = askTasks(inputDevice);
        giveMotivation(tasks, user);

    }

    public static User askName(Scanner inputDevice){
        User user = new User();
        System.out.println("What is your name?");
        user.setName(inputDevice.nextLine());
        return user;
    }

    public static Tasks askTasks(Scanner inputDevice) {
            Tasks task = new Tasks();
            System.out.println("What do you need to get done today?");
            task.setTask(inputDevice.nextLine());
            return task;

    }

        public static void giveMotivation(Tasks task, User user){
        System.out.println(""+ user.getName() +" please get " + task.getTask() +" done before it's due.");
    }
}
