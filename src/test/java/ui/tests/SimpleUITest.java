package ui.tests;

import base.BaseTest;
import org.testng.annotations.Test;

public class SimpleUITest extends BaseTest {
    @Test
    public void simpleUiScenario() throws InterruptedException {
        System.out.println("Simple UI scenario example");
        //check that an appropriate page is opened
        //do login, credentials: "standard_user/secret_sauce"
        //check that user is logged in
        //add product which contains text 'Red' to the cart
        //check that cart counter is updated
        //go to the cart and check that correct product is added
        //do checkout and compare total price at the final step
        //place the order and check that confirmation page is opened
    }
}
