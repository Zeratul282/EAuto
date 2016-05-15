/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eautoswing;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author -Zeratul
 */
public class NormalUserTest {
    
    NormalUser n;
    
    
    public NormalUserTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        n = new NormalUser("test","test");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of changeKilometers method, of class NormalUser, should update value correctly.
     * @throws java.lang.Exception
     */
    @Test
    public void testChangeKilometersGood() throws Exception {
        System.out.println("changeKilometers");
        n.addCar(new Car(null,null,null,null,null,null,null,0,null,null,null,null,null,null,null));
        n.changeKilometers(0, 500);
        assertEquals(Long.valueOf(n.getCar(0).getKilometers()),Long.valueOf(500));
    }
    
    /**
     * Test of changeKilometers method, of class NormalUser, should throw LowerKilometers exception.
     * @throws Exception 
     */
    @Test(expected=NormalUser.LowerKilometers.class)
    public void testChangeKilometersBad() throws Exception
    {
        System.out.println("changeKilometers");
        n.addCar(new Car(null,null,null,null,null,null,null,500,null,null,null,null,null,null,null));
        n.changeKilometers(0, 100);
    }

    /**
     * Test of addCar method, of class NormalUser, should add car to list correctly.
     */
    @Test
    public void testAddCarGood() throws Exception {
        System.out.println("addCar");
        Car car = new Car(null,null,null,null,null,null,null,null,null,null,null,null,null,null,null);
        n.addCar(car);
        assertEquals(n.getCar(0),car);
    }
    
    /**
     * Test of addCar method, of class NormalUser, should throw NoCar exception.
     * @throws Exception 
     */
    @Test(expected=NormalUser.NoCar.class)
    public void testAddCarBad() throws Exception
    {
        System.out.println("addCar");
        Car car = null;
        n.addCar(car);
    }

    /**
     * Test of getCar method, of class NormalUser, should get both Cars correctly.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetCar() throws Exception{
        System.out.println("getCar");
        Car car1 = new Car(null,null,null,null,null,null,null,500,null,null,null,null,null,null,null);
        Car car2 = new Car(null,null,null,null,null,null,null,1000,null,null,null,null,null,null,null);
        n.addCar(car1);
        n.addCar(car2);
        assertEquals(n.getCar(0),car1);
        assertEquals(n.getCar(1),car2);
    }
    
    @Test
    public void mockTestMethod() throws NormalUser.NoCar{
        
        Car mockCar = mock(Car.class);
        when(mockCar.getKilometers()).thenReturn(0);
        
        n.addCar(mockCar);
        Car testedCar=n.getCar(0);
        int result=testedCar.getKilometers();
        
        verify(mockCar).getKilometers();
        assertEquals(0,result);
    }
    
    
    
}
