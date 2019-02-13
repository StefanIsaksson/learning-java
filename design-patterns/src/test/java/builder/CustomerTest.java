package builder;

import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {

    @Test
    public void test(){
        String firstName = "Alice";
        String lastName = "Bobson";
        Customer alice = new Customer.Builder().firstName(firstName).lastName(lastName).build();

        Assert.assertEquals(firstName, alice.getFirstName());
        Assert.assertEquals(lastName, alice.getLastName());
        Assert.assertNull(alice.getEmail());
        Assert.assertNull(alice.getPhoneNumber());
    }
}
