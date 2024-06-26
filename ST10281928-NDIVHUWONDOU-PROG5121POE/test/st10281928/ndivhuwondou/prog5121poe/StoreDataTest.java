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
import static st10281928.ndivhuwondou.prog5121poe.Account.taskDuration;
import static st10281928.ndivhuwondou.prog5121poe.StoreData.devNames;
import static st10281928.ndivhuwondou.prog5121poe.StoreData.searchTaskDeveloper;
import static st10281928.ndivhuwondou.prog5121poe.StoreData.statusTask;
import static st10281928.ndivhuwondou.prog5121poe.StoreData.taskNames;

/**
 *
 * @author ndoum
 */
public class StoreDataTest {
    
    public StoreDataTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        StoreData.devNames.add("Mike Smith");
        StoreData.devNames.add("Edward Harrison");
        StoreData.devNames.add("Samantha Paulson");
        StoreData.devNames.add("Glenda Oberholzer");
        StoreData.taskNames.add("Create Login");
        StoreData.taskNames.add("Create Add Features");
        StoreData.taskNames.add("Create Reports");
        StoreData.taskNames.add("Add arrays");
        StoreData.statusTask.add("To do");
        StoreData.statusTask.add("Doing");
        StoreData.statusTask.add("Done");
        StoreData.statusTask.add("To do");
        StoreData.taskDuration.add(5);
        StoreData.taskDuration.add(8);
        StoreData.taskDuration.add(2);
        StoreData.taskDuration.add(11);
        Account.searchTask = "Create Login";
        Account.developer = "Samantha Paulson";
        Account.deleteTask = "Create Report";
        
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
     * Test of addToArray method, of class StoreData.
     */
    @Test
    public void testAddToArray() {
        System.out.println("addToArray");
        StoreData.addToArray();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displayAllTasks method, of class StoreData.
     */
    @Test
    public void testDisplayAllTasks() {
        System.out.println("displayAllTasks");
        System.out.println(taskNames);
        System.out.println(devNames);
        System.out.println(statusTask);
        System.out.println(taskDuration);
        StoreData.displayAllTasks();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchStatus method, of class StoreData.
     */
    @Test
    public void testSearchStatus() {
        System.out.println("searchStatus");
        StoreData.searchStatus();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of longestDuration method, of class StoreData.
     */
    @Test
    public void testLongestDuration() {
        System.out.println("longestDuration");
        String expResult = "Glenda Oberholzer";
        String result = StoreData.longestDuration();
        //assertEquals(expResult,result);
        assertTrue(result.contains(expResult));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskNames method, of class StoreData.
     */
    @Test
    public void testSearchTaskNames() {
        System.out.println("searchTaskNames");
        String expResult = "Mike Smith";
        String result = StoreData.searchTaskNames();
        //assertEquals(expResult, result);
        System.out.print(result);
        assertTrue(result.contains(expResult));
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskDeveloper method, of class StoreData.
     */
    @Test
    public void testSearchTaskDeveloper() {
        System.out.println("seartTaskDeveloper");
        //String developer = " Samantha Paulson";
        StoreData.searchTaskDeveloper();
       // System.out.print(taskNames);
        //StoreData instance = new StoreData[]  
        //instance.addToArray(("Samantha Paulson","Create Reports","Done",2));
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTask method, of class StoreData.
     */
    @Test
    public void testDeleteTask() {
        System.out.println("deleteTask");
        String expResult = "Task Create Report has been removed";
        String result = StoreData.deleteTask();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
