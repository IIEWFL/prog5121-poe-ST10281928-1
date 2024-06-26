/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10281928.ndivhuwondou.prog5121poe;



/**
 *
 * @author ndoum
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static st10281928.ndivhuwondou.prog5121poe.Account.deleteTask;
import static st10281928.ndivhuwondou.prog5121poe.Account.developer;
import static st10281928.ndivhuwondou.prog5121poe.Account.searchTask;
public class StoreData {
    
  /*  public void displayAllTasks(ArrayList<String> taskNames){
        
        for(int i=0; i>taskNames.size();i++ ){
        System.out.println(taskNames+"\n");
        
    }*/
   static ArrayList<String> devNames = new ArrayList<>();
   static ArrayList<String> taskNames = new ArrayList<>();
   static ArrayList<String> statusTask = new ArrayList<>();
   static ArrayList<String> taskDescription = new ArrayList<>();
   static ArrayList<Integer> taskDuration = new ArrayList<>();
    
   //The code to add data into an ArrayList
   //https://www.geeksforgeeks.org/how-to-add-element-in-java-arraylist/
   //Geeksforgeeks
   //https://www.geeksforgeeks.org/
    public static void addToArray(){
        devNames.add(Account.taskDev);
        taskNames.add(Account.taskName);
        statusTask.add(Account.taskStatus);
        taskDescription.add(Account.taskInfo);
        taskDuration.add(Account.taskTime);
    }
    
    //How to use a stringbuilder
    //https://www.codecademy.com/resources/docs/java/stringbuilder
    //Steven Swiniarski & Christina Yang
    //https://www.codecademy.com/profiles/StevenSwiniarski?_gl=1*jyxgiv*_gcl_au*MjAwNDMxMzY5My4xNzEzNjAzNDIx*_ga*OTc1MTI0MDkwOS4xNzEzNjAzNDE2*_ga_3LRZM6TM9L*MTcxOTQyMDAwNi4yLjAuMTcxOTQyMDAwNi42MC4wLjA.
    //https://www.codecademy.com/profiles/Christine_Yang?_gl=1*kontyy*_gcl_au*MjAwNDMxMzY5My4xNzEzNjAzNDIx*_ga*OTc1MTI0MDkwOS4xNzEzNjAzNDE2*_ga_3LRZM6TM9L*MTcxOTQyMDAwNi4yLjEuMTcxOTQyMDE3MC4yMy4wLjA.
   
    public static void displayAllTasks(){
        StringBuilder output = new StringBuilder("Task Report\n\n");
        
        for(int i=0;i<devNames.size();i++){
            output.append("Task Name: ").append(taskNames.get(i)).append("\n")
                    .append("Developer: ").append(devNames.get(i)).append("\n")
                    //.append("Task Description: ").append(taskDescription.get(i)).append("\n")
                    .append("Task Status: ").append(statusTask.get(i)).append("\n")
                    .append("Task Duration: ").append(taskDuration.get(i)).append("\n\n");
        }
        
        JOptionPane.showMessageDialog(null,output.toString());
    }
    
    public static void searchStatus(){
        //Account.devNames.get(0);
        StringBuilder output = new StringBuilder("Task Report\n\n");
       
     for(int i=0; i<statusTask.size();i++ ){
         if(statusTask.get(i).equals("Done")){
            output.append("Task Name: ").append(taskNames.get(i)).append("\n")
                    .append("Developer: ").append(devNames.get(i)).append("\n")
                    .append("Task Duration: ").append(taskDuration.get(i)).append("\n\n");
    
         }
     }
     JOptionPane.showMessageDialog(null,output.toString());

    }
    
    public static String longestDuration(){
        int max = 0;
        String developer = "";
        for(int i=0;i<taskDuration.size();i++){
           
           if(taskDuration.get(i)>max){
               max = taskDuration.get(i);
               developer = devNames.get(i);
           }
        }
        String output = "Task Developer: "+developer+"\nDuration: "+max;
        return output;
    } 
    
    public static String searchTaskNames(){
       String name ="";
       String developer = "";
       String status = "";
        for(int i=0;i<taskNames.size();i++){
            if(taskNames.get(i).equalsIgnoreCase(searchTask)){
               name = taskNames.get(i);
               developer = devNames.get(i);
               status = statusTask.get(i);
            }
        }
        String task ="Task Name: "+ name+"\n Developer: "+developer+"\n Task Status: "+status;
        return task;
    }
    public static void searchTaskDeveloper(){
        StringBuilder output = new StringBuilder("Task Report\n\n");
        
      for(int i=0;i<devNames.size();i++){
        if(devNames.get(i).equalsIgnoreCase(developer)){
           output.append("Task Name: ").append(taskNames.get(i)).append("\n")
                    .append("Task Status: ").append(statusTask.get(i)).append("\n\n");
        }  
      }  
       JOptionPane.showMessageDialog(null,output.toString());
    }
    
    //Removing/Deleting data from an ArrayList
    //https://www.javatpoint.com/remove-an-element-from-arraylist-in-java
    //javatpoint
    //https://www.javatpoint.com/
    
    public static String deleteTask(){
        
      for(int i=0;i<taskNames.size();i++){
          if(taskNames.get(i).equals(deleteTask)){
              taskNames.remove(i);
              devNames.remove(i);
              statusTask.remove(i);
              taskDuration.remove(i);
          }
      } 
      return "Task "+deleteTask+" has been removed";
    }
}
