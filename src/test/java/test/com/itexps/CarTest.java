/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.com.itexps;

import com.itexps.sales.Car;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author polar
 */
public class CarTest {
    
    public CarTest() {
            Car car;
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testCar() {
        
        Car car = new Car();
        car.setVin("aaa");
        car.setColor("red");
        car.setMake("Ford");
        
        assertEquals("red", car.getColor());
        assertEquals("aaa", car.getVin());
        assertEquals("Ford", car.getMake());
        
    }    

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
        Car car = new Car();
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
