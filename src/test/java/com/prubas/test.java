package com.prubas;

import com.example.demo.service.SmartPhoneServiceImpl;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class test {
    @Test
    @Order(2)
    public void testCount() {
        SmartPhoneServiceImpl test = new SmartPhoneServiceImpl();
        assertNotNull(test.count(), "No puede ser NULL.");
    }
    @Test
    @Order(1)
    public void testMayorQue0() {
        SmartPhoneServiceImpl test = new SmartPhoneServiceImpl();
        assertTrue(test.count() > 0, "Tiene que ser mayor que 0.");
    }
    @Test
    @Order(4)
    public void testDevuelve3() {
        SmartPhoneServiceImpl test = new SmartPhoneServiceImpl();
        assertEquals(3, test.count(), "El valor debe ser 3.");
    }
    @Test
    @Order(3)
    public void testAll() {
        SmartPhoneServiceImpl test = new SmartPhoneServiceImpl();
        assertAll("Comprobando count.",
                () ->assertNotNull(test.count()),
                () -> assertTrue(test.count()>0),
                () -> assertEquals(3,test.count()));
    }
    @Test
    public void testLongID() {
        SmartPhoneServiceImpl test = new SmartPhoneServiceImpl();
        assertThrows(IllegalArgumentException.class, () -> test.findOne(null));
    }
    @BeforeEach
    void setUp() {
        System.out.println("Before Each");
    }
    @AfterEach
    void tearDown() {
        System.out.println("After Each");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("After All");
    }


}





















