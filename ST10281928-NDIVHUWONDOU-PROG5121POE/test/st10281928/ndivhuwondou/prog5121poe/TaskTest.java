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

/**
 *
 * @author ndoum
 */
public class TaskTest {
    
    public TaskTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        Account.taskNum = "2";
        Account.taskNum2 = 2;
        Task.idNum = 0;
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
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String taskInfo = "Create Login to authenticate users";
        String taskInfo2 = "TODO review the generated test code and remove the default call to fail";
        boolean expResult = true;
        boolean result = Task.checkTaskDescription(taskInfo);
        boolean result2 = Task.checkTaskDescription(taskInfo2);
        assertTrue(result);
        assertFalse(result2);
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String taskName = "Login Feature";
        String taskNum = "0";
        String taskDev = "Robyn Harrison";
        String expResult = "LO:0:SON";
        String result = Task.createTaskID(taskName, taskNum, taskDev);
        System.out.println(result);
        assertEquals(expResult, result);
        
       taskName = "Add Task Feature";
        taskNum = "1";
        taskDev = "Mike Smith";
        String expResult2 = "AD:1:ITH";
        String result2=Task.createTaskID(taskName, taskNum, taskDev);
        assertEquals(expResult2,result2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
        taskName = "Create Task Feature";
        taskNum = "2";
        taskDev = "Kim Pike";
        String expResult3 = "CR:2:IKE";
        String result3=Task.createTaskID(taskName, taskNum, taskDev);
        assertEquals(expResult3,result3);
        
        taskName = "Create Task Feature";
        taskNum = "3";
        taskDev = "Chris Geard";
        String expResult4 = "CR:3:ARD";
        String result4=Task.createTaskID(taskName, taskNum, taskDev);
        assertEquals(expResult4,result4);
        
         taskName = "Create Task Feature";
        taskNum = "4";
        taskDev = "Amanda Thabitha";
        String expResult5 = "CR:4:THA";
        String result5=Task.createTaskID(taskName, taskNum, taskDev);
        assertEquals(expResult5,result5);
        
        taskName = "Add Task Feature";
        taskNum = "5";
        taskDev = "David Strand";
        String expResult6 = "AD:5:AND";
        String result6=Task.createTaskID(taskName, taskNum, taskDev);
        assertEquals(expResult6,result6);
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        String taskName = "Login Feature";
        String taskNum = "1";
        String taskDev = "Robyn Harrison";
        String taskInfo = "Create Login to authenticate users";
        String taskID = "LO:0:SON";
        String taskStatus = "To do";
        String taskDuration = "8";
        String expResult ="Robyn" ;
        String result = Task.printTaskDetails(taskName, taskNum, taskDev, taskInfo, taskID, taskStatus, taskDuration);
        assertTrue(result.contains(expResult));
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        int[] totalDuration = {8,10};
        int expResult = 18;
        int result = Task.returnTotalHours(totalDuration);
        assertEquals(expResult, result);
        
         totalDuration = new int[5];
         totalDuration[0]=10;
         totalDuration[1]=12;
         totalDuration[2]=55;
         totalDuration[3]=11;
         totalDuration[4]=1;
         expResult = 89;
         result = Task.returnTotalHours(totalDuration);
         assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
