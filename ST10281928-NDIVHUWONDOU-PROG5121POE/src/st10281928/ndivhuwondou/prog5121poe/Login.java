/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package st10281928.ndivhuwondou.prog5121poe;

import java.util.regex.Pattern;
//import static st10281928.ndivhuwondou.prog5121poe.Account.name;
//import static st10281928.ndivhuwondou.prog5121poe.Account.lastName;
import static st10281928.ndivhuwondou.prog5121poe.Account.loginName;
import static st10281928.ndivhuwondou.prog5121poe.Account.loginPassword;
import static st10281928.ndivhuwondou.prog5121poe.Account.password;
import static st10281928.ndivhuwondou.prog5121poe.Account.userName;

/**
 *
 * @author ndoum
 */
public class Login {
    
    public static boolean checkUserName(String userName) {
            return userName.length() <= 5 && userName.contains("_");
        }

    //Code Attributtion
    //The code to check Uppercase letters & numbers
    //https://stackoverflow.com/questions/40336374/how-do-i-check-if-a-java-string-contains-at-least-one-capital-letter-lowercase
    //Sunil
    //https://stackoverflow.com/users/23904921/sunil?tab=profile
    
    //Code Attribution
    //The code to check for special characters
    //https://stackoverflow.com/questions/1795402/check-if-a-string-contains-a-special-character
    //Reilas
    //https://stackoverflow.com/users/17758716/reilas

    
        public static boolean checkPasswordComplexity(String password) {
            return password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*") && password.matches(".*?[" + Pattern.quote("!@#$%^&*()_-+=[]{};:'<>,.?|/") + "].*");
        }

        public static String registerUser() {
            String message;
                //If-Statement to determine which message should be applied for different outcomes
            if (!checkUserName(userName)) {
                message = "The UserName is incorrectly formatted, Username should be not more than 5 characters and contain an underscore";
            } else if (!checkPasswordComplexity(password)) {
                message = "The Password is incorrectly formatted, Password should be not less than 8 characters, have a special character , a number and a capital letter ";
            } else {
                message = "Both these conditions are met and you have successfully registered";
            }
            return message;
        }
    
     public static boolean loginUser(String loginName, String userName, String loginPassword, String password) {
            return loginName.equals(userName) && loginPassword.equals(password);
        }

        public static String returnLoginStatus(String status,String name,String lastName) {
            if (!loginUser(loginName, userName, loginPassword, password)) {
                status = "Username or Password incorrect, please try again.";
            } else {
                status = "Welcome "+name+" "+lastName+" it is great to see you again";
            }
            return status;
        }
        
        //String name = JOption.pane.showInputDialog("Please enter your name")
       // String firstname= name.NextLine();-
    
}
