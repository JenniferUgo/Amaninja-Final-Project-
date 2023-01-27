package tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.http.client.params.ClientPNames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import utilities.Commenter;
import utilities.DataTableHelper;

import java.util.ArrayList;
import java.util.List;

public class ContactUsTest {

    private WebDriver driver;

    @BeforeTest
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Given("User is logged in and on Contact us page with url {string}")
    public void user_is_logged_in_and_on_contact_us_page_with_url(String url) {
        driver.get(url);
    }

    @Then("Details should be filled in contact us form")
    public void details_should_be_filled_in_contact_us_form(io.cucumber.datatable.DataTable dataTable) {
//        List<List<String>> data=dataTable.cells();
//        driver.findElement(By.id("ContactForm-Name")).sendKeys(data.get(0).get(0));
//        driver.findElement(By.id("ContactForm.email")).sendKeys();

        DataTableHelper dataTableHelper = new DataTableHelper();

        ArrayList<Commenter> myCommentersList = dataTableHelper.mapDataTableToArrayOfCommenters(dataTable);


    }
}
