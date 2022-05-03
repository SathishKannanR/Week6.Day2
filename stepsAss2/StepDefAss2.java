package stepsAss2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefAss2  extends BaseClass{
	
		//public ChromeDriver driver;
		public String ID;
		/*@Given("open the browser")
		public void open_the_browser() {
			WebDriverManager.chromedriver().setup(); 
			driver=new ChromeDriver();  
		    
		}
		@Given("Load the Url")
		public void load_the_url() {
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
		    
		}
		@Given("Enter the Username as {string}")
		public void enter_the_username_as(String uname) {
			driver.findElement(By.id("username")).sendKeys(uname);
		   
		}
		@Given("Enter the password as {string}")
		public void enter_the_password_as(String pwd) {
			 driver.findElement(By.id("password")).sendKeys(pwd);	 
		    
		}
		@When("click on Login Button")
		public void click_on_login_button() {
			driver.findElement(By.className("decorativeSubmit")).click();
		    
		}*/
		@Then("Homepage should be displayed")
		public void homepage_should_be_displayed() {
			Boolean displayed=driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
			Assert.assertTrue(displayed);
		}
		@When("Click on CRMSFA Link")
		public void click_on_crmsfa_link()
		{
			driver.findElement((By.linkText("CRM/SFA"))).click();	 
		}
		@When("Click on Leads")
		public void click_on_leads() 
		{
			driver.findElement(By.linkText("Leads")).click();
		}
		@When("Click on Create Leads")
		public void click_on_create_leads()
		{
			driver.findElement(By.linkText("Create Lead")).click();
		}
		@When("Provide the company name as {string}")
		public void provide_the_company_name_as_test_leaf(String Cmp) {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(Cmp);
		}
		@When("Provide firstname as {string}")
		public void provide_firstname_as_sathish(String fname) {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		}
		@When("Provide the lastname as {string}")
		public void provide_the_lastname_as_kannan(String lname) {
			 driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		}
		@When("Provide first_local_name as {string}")
		public void provide_first_local_name_as_sat(String flocal) {
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(flocal);
		}
		@When("Provide Department name as {string}")
		public void provide_department_name_as_testing(String Dept) {
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(Dept);
		}
		@When("Provide description as {string}")
		public void provide_description_as_software_testing_department(String Desc) {
			driver.findElement(By.id("createLeadForm_description")).sendKeys(Desc);
		}
		@When("provide the email Id as {string}")
		public void provide_the_email_id_as_sathish_gmail_com(String email) {
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(email);
			WebElement we=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			 Select se=new Select(we);
			 se.selectByVisibleText("New York");
		}
		@When("Click on submit Button")
		public void click_on_submit_button() {
			driver.findElement(By.className("smallSubmit")).click();
		}
		@Then("Create Lead Page should be displayed")
		public void create_lead_page_should_be_displayed() {
			String title=driver.getTitle();
			 System.out.println("Title of the page is:" +title);
		}
		
		@When("Click on Edit Button")
		public void click_on_edit_button() {
			driver.findElement((By.linkText("Edit"))).click();
		}
		@When("Clear the Description Field")
		public void clear_the_description_field() {
			driver.findElement(By.id("updateLeadForm_description")).clear();
		}
		@When("Type some information in important Notes Field")
		public void type_some_information_in_important_notes_field() {
			driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("High priority Lead creation");
		}
		@When("Get the Title of the page")
		public void get_the_title_of_the_page() {
			String Title= driver.getTitle();
			 System.out.println("Tiltle of the page is:" +Title);	
		}
		
		@When("click on Find Leads")
		public void click_on_find_leads() {
			driver.findElement(By.linkText("Find Leads")).click();
		}
		@When("Click on Phone and provide the phone number")
		public void click_on_phone_and_provide_the_phone_number() {
			driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9876543210");
		}
		@When("Click on Find Leads Button")
		public void click_on_Find_Leads_Button() {
			driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		}
		@Then("Get the first Lead ID and click on the first ID")
		public void get_the_first_lead_id_and_click_on_the_first_id() throws InterruptedException {
			Thread.sleep(2000);
			WebElement LeadId=driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));		
			 ID=LeadId.getText();
			 System.out.println("Lead Id is:" +ID);
			 LeadId.click();
		}
		@Then("click on Delete Lead")
		public void click_on_delete_lead() {
			driver.findElement(By.linkText("Delete")).click();
		}
		@Then("click on Find Lead and provide the first Lead Id")
		public void click_on_find_lead_and_provide_the_first_lead_id() {
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(ID);
		 
		}
		@Then("click on Fingeads and check for the Error Code {string}")
		public void click_on_fingeads_and_check_for_the_error_code(String string) throws InterruptedException {
			driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
			 Thread.sleep(2000);
			 WebElement ErrorCode=driver.findElement(By.xpath("//div[contains(text(),'No records to display')]"));
			 Boolean Error=ErrorCode.isDisplayed();
			 System.out.println(Error);
		}
		
		@Given("Click on Duplicate Lead Button")
		public void click_on_duplicate_lead_button() {
			driver.findElement(By.linkText("Duplicate Lead")).click();
		}
		@Then("Clear Company Name Field")
		public void clear_company_name_field() {
			driver.findElement(By.id("createLeadForm_companyName")).clear();
		}
		@Then("Provide the new company name as {string}")
		public void provide_the_new_company_name_as(String NewCmp) {
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys(NewCmp);
		}
		@Then("Clear FirstName and Provide new name")
		public void clear_first_name_and_provide_new_name() {
			 driver.findElement(By.id("createLeadForm_firstName")).clear();
			 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kannan");
		}
		@Then("click on Submit and get the title of the page")
		public void click_on_submit_and_get_the_title_of_the_page() {
			 driver.findElement(By.className("smallSubmit")).click();
			 String title1=driver.getTitle();
			 System.out.println("Title of the page is:" +title1);
		}

	}
