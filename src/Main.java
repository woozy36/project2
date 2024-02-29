import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayList<Task> myTasks = new ArrayList<>();


        Task asimpletest = new Task("cat", "walk the cat", 5);
        System.out.println(asimpletest);





        String option = "";




        while(!(option.equals("0"))) {

            System.out.println("(1) Add a task.\n" +
                    "(2) Remove a task.\n" +
                    "(3) Update a task.\n" +
                    "(4) List all tasks.\n" +
                    "(0) Exit.");
            option = input.nextLine();


            if (option.equals("1")) {
                System.out.println("what task name");
                String taskName = input.nextLine();

                System.out.println("give a description of the task");
                String taskDescription = input.nextLine();

                System.out.println("give a priority for the task");
                int taskPriority = input.nextInt();
                input.nextLine();

                Task theNewTask = new Task(taskName, taskDescription, taskPriority);
                myTasks.add(theNewTask);




            }
            else if (option.equals("2")) {
                System.out.println("what task do you want to remove");
                System.out.println(myTasks);
                String delete = input.nextLine();
                myTasks.remove(Integer.parseInt(delete));

            }
            else if (option.equals("3")) {
                System.out.println("what task do you want to update");
                String update = input.nextLine();
                System.out.println("what do you want to replace it with");




            }
            else if (option.equals("4")) {
                System.out.println(myTasks);

            }




        }






    }



}