package org.example;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Surefire {
    WebDriver driver;

    @Test
    public void testng() {
        Assert.assertEquals("demo", "demo");
    }
}
