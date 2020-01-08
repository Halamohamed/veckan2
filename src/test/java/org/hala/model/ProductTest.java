package org.hala.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ProductTest {

    private Product testObject;

    @BeforeEach
    public void setup(){
      testObject = new Product(1, "Test product", "Test description", 9.90);
    }

    @Test
    public void testObject_successfully_created(){
        Assertions.assertEquals(1,testObject.getProductId());
        Assertions.assertEquals("Test product", testObject.getProductName());
        Assertions.assertEquals("Test description", testObject.getDescription());
        Assertions.assertEquals(9.90, testObject.getPrice());
    }

    @Test
    public void given_null_setProductName_throws_illegallArgumentException(){
        Product copy = new Product(1, "Test product", "Test description", 9.90);
       Assertions.assertTrue(testObject.equals(copy));
       Assertions.assertThrows(IllegalArgumentException.class, () -> testObject.setProductName(null));


    }
}


