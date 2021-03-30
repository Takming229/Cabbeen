package testcase;

import Page.APPlocalaction;
import org.junit.Before;
import org.junit.Test;

public class TestCase {
    public APPlocalaction app;
    @Before
    @Test
    public void login(){
        app =new APPlocalaction();
        app.login();
    }
    @Test
    public void oc_b_sale_apply(){

        app.Order_center().Sale_apply();
    }

    @Test
    public void search(){
        app.Order_center().search_for().Od_search_for();
    }
}
