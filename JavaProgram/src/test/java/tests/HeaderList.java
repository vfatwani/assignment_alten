package tests;

import locators.HomePageLocators;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.json.JSONObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;


public class HeaderList extends HomePageLocators {
    @Test
    public void GetTheLinkedListFromYahoo() {
        driver.navigate().to("https://www.yahoo.com/");
        HashMap<String ,String> newLinkList = new HashMap<>();
        List<WebElement> headers = driver.findElements(HomePageLocators.headerList);

        for ( WebElement we: headers) {
            newLinkList.put(we.getText(),we.getAttribute("href"));
        }
        //System.out.println(newLinkList);
        System.out.println("Yahoo Header Web Urls =>");
        JSONObject yahooHeaders = new JSONObject(newLinkList);
        int indent = 2;
        System.out.println(yahooHeaders.toString(indent));
    }
}
