import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayList<String> myTasks = new ArrayList<>();

        myTasks.add("huh?");








        String option = "";




        while(!(option.equals("0"))) {

            System.out.println("(1) Add a task.\n" +
                    "(2) Remove a task.\n" +
                    "(3) Update a task.\n" +
                    "(4) List all tasks.\n" +
                    "(0) Exit.");
            option = input.nextLine();


            if (option.equals("1")) {
                System.out.println("what do you want to add");
                String newTask = input.nextLine();
                myTasks.add(newTask);


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
                String selectThing = input.nextLine();
                myTasks.set(Integer.parseInt(update), selectThing);

            }
            else if (option.equals("4")) {
                System.out.println(myTasks);

            }




        }






    }



}