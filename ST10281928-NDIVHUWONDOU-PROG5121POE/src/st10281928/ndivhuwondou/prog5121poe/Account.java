/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st10281928.ndivhuwondou.prog5121poe;

/**
 *
 * @author ndoum
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Account {

    /**
     * @param args the command line arguments
     */
    static String searchTask = "";
    static String developer = "";
    static String deleteTask = "";
    static int[] totalDuration;
    static String name = "";
    static String lastName = "";
    static String userName = "";
    static String password = "";
    static String loginName = "";
    static String loginPassword = "";
    static String taskName = "";
    static String taskInfo = "";
    static String taskDuration = "";
    static String taskNum = "";
    static String taskDev = "";
    static String taskStatus = "";
    static int taskNum2;
    static int taskTime;

    public static void main(String[] args) {
        // TODO code application logic here
        String status = null;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your Name");
        name = input.nextLine();
        System.out.println("Please enter your Lastname");
        lastName = input.nextLine();
        System.out.println("Please enter your Username");
        userName = input.nextLine();
        while (!Login.checkUserName(userName)) {
            System.out.println(Login.registerUser());
            System.out.println("Please enter your Username");
            userName = input.nextLine();
        }
        System.out.println("Username successfully captured");
        System.out.println("Please enter your password");
        password = input.nextLine();
        while (!Login.checkPasswordComplexity(password)) {
            System.out.println(Login.registerUser());
            System.out.println("Please enter your Password");
            password = input.nextLine();
        }
        System.out.println("Password successfully captured");

        System.out.println(Login.registerUser());

        System.out.println("Please enter your user name for Login purposes");
        loginName = input.nextLine();
        System.out.println("Please enter your user password for Login purposes");
        loginPassword = input.nextLine();
        while (!Login.loginUser(loginName, userName, loginPassword, password)) {

            System.out.println(Login.returnLoginStatus(status, name, lastName));
            System.out.println("Please enter your user name for Login purposes");
            loginName = input.nextLine();
            System.out.println("Please enter your user password for Login purposes");
            loginPassword = input.nextLine();
        }

        System.out.println(Login.returnLoginStatus(status, name, lastName));
        input.close();
        JOptionPane.showMessageDialog(null, "Welcome to Easykanban");
        String activity = JOptionPane.showInputDialog("Enter the specific number for the task you would like to perform \n"
                + "1: Add Task\n"
                + "2:Show report(Coming Soon)\n"
                + "3:Quit");
        int numActivity = Integer.parseInt(activity);
        while (numActivity != 3) {

            while (numActivity == 1) {
                taskNum = JOptionPane.showInputDialog("Please enter the number of the task");
                taskNum2 = Integer.parseInt(taskNum);
                totalDuration = new int[taskNum2];
                int counter;
                for (counter = 0; counter < taskNum2; counter++) {
                    
                    taskName = JOptionPane.showInputDialog("Please enter the name of the task");
                    taskInfo = JOptionPane.showInputDialog("Please enter the description of the task");
                    while (!Task.checkTaskDescription(taskInfo)) {
                        JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters");
                        taskInfo = JOptionPane.showInputDialog("Please enter the description of the task");
                    }
                    JOptionPane.showMessageDialog(null, "Task successfully captured");
                    taskDuration = JOptionPane.showInputDialog("Please enter the number of hours it will take to finish the task");
                    taskTime = Integer.parseInt(taskDuration);
                    int counterHours = 0;
                    if (counterHours < taskNum2) {
                        totalDuration[counterHours] += taskTime;
                        counterHours++;
                    }
                    taskDev = JOptionPane.showInputDialog("Please enter the developers name and surname that has been assigned this task");
                    taskStatus = JOptionPane.showInputDialog("Please enter the status of the task, choose from the following: \n"
                            + "1: To do \n"
                            + "2: Done \n"
                            + "3: Doing");
                    JOptionPane.showMessageDialog(null, Task.printTaskDetails(taskName, taskNum, taskDev, taskInfo, taskInfo, taskStatus, taskDuration));
                    // JOptionPane.showMessageDialog(null,"array hours"+totalDuration[counterHours]);
                    StoreData.addToArray();
                }
                JOptionPane.showMessageDialog(null, "Total Hours:" + Task.returnTotalHours(totalDuration) + "hrs");
                activity = JOptionPane.showInputDialog("Enter the specific number for the task you would like to perform \n"
                        + "1: Add Task\n"
                        + "2:Show report(Coming Soon)\n"
                        + "3:Quit");
                numActivity = Integer.parseInt(activity);
            }
            while (numActivity == 2 || numActivity > 3) {
                /* JOptionPane.showMessageDialog(null, "That option is not available or does not exist please enter either 1 or 3");
                 activity = JOptionPane.showInputDialog("Enter the specific number for the task you would like to perform \n"
                + "1: Add Task\n"
                + "2:Show report(Coming Soon)\n"
                + "3:Quit");
                 numActivity = Integer.parseInt(activity);
                StoreData displayTasks = new StoreData();
               //String hi = displayTasks.displayAllTasks(taskNames);
               JOptionPane.showMessageDialog(null,displayTasks);*/
                String option = JOptionPane.showInputDialog("Please select your option\n"
                        + "1. Tasks with the status Done\n"
                        + "2. Task with the longest duration\n"
                        + "3. Search for a task using the Task Name\n"
                        + "4. Tasks assigned to a developer\n"
                        + "5. Delete a task\n"
                        + "6. Full report\n"
                        + "7. Back to Main Menu");
                int optionNum = Integer.parseInt(option);
                switch (optionNum) {
                    case 1:
                        StoreData.searchStatus();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, StoreData.longestDuration());
                        break;
                    case 3:
                        searchTask = JOptionPane.showInputDialog("Please enter the task name");
                        JOptionPane.showMessageDialog(null, StoreData.searchTaskNames());
                        break;
                    case 4:
                        developer = JOptionPane.showInputDialog("Please enter the developers name");
                        StoreData.searchTaskDeveloper();
                        break;
                    case 5:
                        deleteTask = JOptionPane.showInputDialog("Please enter the task name");
                        JOptionPane.showMessageDialog(null, StoreData.deleteTask());
                        break;
                    case 6:
                        StoreData.displayAllTasks();
                        break;
                    case 7:
                        activity = JOptionPane.showInputDialog("Enter the specific number for the task you would like to perform \n"
                                + "1: Add Task\n"
                                + "2:Show report(Coming Soon)\n"
                                + "3:Quit");
                        numActivity = Integer.parseInt(activity);
                }
            }
        }
        System.out.println("Thank you, Hope to see you next time");
    }

}
