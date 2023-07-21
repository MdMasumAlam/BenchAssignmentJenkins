package CityNames;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DestinationCityNames extends BaseTest {

    public void destinationCityNames()
    {
        //Using Custom Xpath To Store The DropDown List Values
        List<WebElement> list_Des_Names = driver.findElements(By.xpath("//select[@name='toPort']//option"));
        System.out.println("Number and Names of the Departure Cities are :" +list_Des_Names.size());


        for(WebElement option:list_Des_Names)
        {
            System.out.println(option.getText());
        }

    }

}
