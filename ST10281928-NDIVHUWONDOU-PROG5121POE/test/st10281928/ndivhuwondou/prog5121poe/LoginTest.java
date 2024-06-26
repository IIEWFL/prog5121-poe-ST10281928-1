/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package st10281928.ndivhuwondou.prog5121poe;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static st10281928.ndivhuwondou.prog5121poe.Account.lastName;
import static st10281928.ndivhuwondou.prog5121poe.Account.name;

/**
 *
 * @author ndoum
 */
public class LoginTest {
    
    public LoginTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Account.userName = "kyl_1";
        Account.password = "Ch&&sec@ke99!";
        Account.loginName = "kyl_1";
        Account.loginPassword = "Ch&&sec@ke99!";
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String userName = "kyl_1";
        String example = "kyle!!!!!!!";
        boolean expResult = true;
        boolean exampleResult = false; 
        boolean result = Login.checkUserName(userName);
        boolean result2 = Login.checkUserName(example);
        assertEquals(expResult, result);
        assertEquals(exampleResult, result2);
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@ke99!";
        String test1 = "password";
        boolean expResult = true;
        boolean exampleResult = false;
        boolean result = Login.checkPasswordComplexity(password);
        boolean result2 = Login.checkPasswordComplexity(test1);
        assertEquals(expResult, result);
        assertEquals(exampleResult, result2);
        assertTrue(result);
        assertFalse(result2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String message = "successfully";
        String expResult = "";
        String name = "NDivh";
        String pass = "JUHBESUY";
        String result = Login.registerUser();
        System.out.println(result);
       // assertEquals(expResult,result.);
        assertTrue(result.contains(message));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String loginName = "kyl_1";
        String userName = "kyl_1";
        String loginPassword = "Ch&&sec@ke99!";
        String password = "Ch&&sec@ke99!";
        boolean expResult = true;
        boolean result = Login.loginUser(loginName, userName, loginPassword, password);
        assertTrue(result);
        loginName = "kyl_1";
        userName = "kyle!!!!!!!";
        loginPassword = "Ch&&sec@ke99!";
        password = "password";
        result = Login.loginUser(loginName, userName, loginPassword, password);
        //assertEquals(expResult, result);
        assertFalse(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String status = "Welcome "+name+" "+lastName+" it is great to see you again";
        String name = "";
        String lastName = "";
        String expResult = "Welcome";
        String result = Login.returnLoginStatus(status, name, lastName);
        System.out.println(result);
        assertTrue(result.contains(expResult));
        
      //  assertEquals(expResult, result);
      //  boolean correct = status == "Welcome "+name+" "+lastName+" it is great to see you again";
      //  boolean statement  = correct == true;
      //  assert(statement);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
