package com.optimo;

import org.junit.Assert;
import org.junit.Test;


public class DemoTest {

    @Test
    public void concatenate() {


        Demo demo = new Demo();
        final String concatenate = demo.concatenate("a", "b");

        Assert.assertEquals("ab", concatenate);
    }
}