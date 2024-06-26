/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10281928.ndivhuwondou.prog5121poe;

//import static st10281928.ndivhuwondou.prog5121poe.Account.taskDuration;
import static st10281928.ndivhuwondou.prog5121poe.Account.taskTime;

/**
 *
 * @author ndoum
 */
public class Task {


    static int time = taskTime;
    static int idNum = 0;
    static int counterTask = 0;

    
  
    public static boolean checkTaskDescription(String taskInfo) {
        //This will minus the number of spaces in the string from the the length of the string 
        //since the length() function counts spaces as characters and they will increase the number 
        // of the length.
        int counterControl = 0;
        int spaceNum2 = 0;
        while (counterControl != taskInfo.length()) {
            String spaceChar = " ";
            char spaceNum = taskInfo.charAt(counterControl);
            if (spaceChar.equals(spaceNum)) {
                spaceNum2++;
            }
            counterControl++;
        }
        int totalLength = taskInfo.length() - spaceNum2;
        return totalLength <= 50;
    }

    //Code Attribution
    //The code to create a subtring
    //https://www.geeksforgeeks.org/searching-for-characters-and-substring-in-a-string-in-java/
    //Geeksforgeeks
    //https://www.geeksforgeeks.org/
    
    public static String createTaskID(String taskName, String taskNum, String taskDev) {
        String nameID = taskName.substring(0, 2);
        int devName = taskDev.length() - 3; 
        String devID = taskDev.substring(devName, taskDev.length());
        int numHolder = Integer.parseInt(taskNum);
        String taskID = nameID.toUpperCase() + ":" + idNum + ":" + devID.toUpperCase();

       idNum = idNum + 1;
        return taskID;
    }

    public static String printTaskDetails(String taskName, String taskNum, String taskDev, String taskInfo, String taskID, String taskStatus, String taskDuration) {
        int taskNumber = idNum+1;
        String taskOverview = "Task Name: "+ taskName + "\nTask Number: " +taskNumber + "\nDeveloper Details: " 
                + taskDev+"\nTask Description: "+taskInfo +"\nDuration: " +taskDuration 
                + "hrs " + "\n Task ID: "+ createTaskID(taskName, taskNum, taskDev) 
                + "\n Task Status: " + taskStatus;
        return taskOverview;
    }

    public static int returnTotalHours(int[] totalDuration) {

        int total = 0;
        int j;
        for (j = 0; j < totalDuration.length; j++) {
            
                total += totalDuration[j];
            
        }
        return total;
    }
    

}
