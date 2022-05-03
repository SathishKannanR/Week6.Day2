Feature: Cucumber implementation for all 5 Scenarios

##Background:
##Given open the browser
##And Load the Url
##Given Enter the Username as 'Demosalesmanager'
##And Enter the password as 'crmsfa'
##When click on Login Button

@smoke @functional
Scenario: TC001_Login with Positive Credentials
Then Homepage should be displayed

Scenario Outline: TC002_Create a new Lead
When Click on CRMSFA Link
And Click on Leads 
And Click on Create Leads
And Provide the company name as <company>
And Provide firstname as <firstname>
And Provide the lastname as <lastname>
And Provide first_local_name as <flocalname>
And Provide Department name as <Department>
And Provide description as <Description>
And provide the email Id as <email>
When Click on submit Button
Then Create Lead Page should be displayed

Examples:
|company|firstname|lastname|flocalname|Department|Description|email|
|'TestLeaf'|'Sathish'|'Kannan'|'Sat'|'Testing'|'software Testing Department'|'sathish@gmail.com'|

@smoke @sanity
Scenario Outline: TC003_Edit Lead
When Click on CRMSFA Link
And Click on Leads
And Click on Create Leads
And Provide the company name as <company>
And Provide firstname as <firstname>
And Provide the lastname as <lastname>
And Provide first_local_name as <flocalname>
And Provide Department name as <Department>
And Provide description as <Description>
And provide the email Id as <email>
And Click on submit Button
And Click on Edit Button
And Clear the Description Field
And Type some information in important Notes Field
When Click on submit Button
And Get the Title of the page

Examples:
|company|firstname|lastname|flocalname|Department|Description|email|
|'TestLeaf'|'Sathish'|'Kannan'|'Sat'|'Testing'|'software Testing Department'|'sathish@gmail.com'|

@smoke @sanity
Scenario Outline: TC004_To Validate the Duplicate Lead
When Click on CRMSFA Link
And Click on Leads
And Click on Create Leads
And Provide the company name as <company>
And Provide firstname as <firstname>
And Provide the lastname as <lastname>
And Provide first_local_name as <flocalname>
And Provide Department name as <Department>
And Provide description as <Description>
And provide the email Id as <email>
And Click on submit Button
And Get the Title of the page
And Click on Duplicate Lead Button
Then Clear Company Name Field
And Provide the new company name as "ABC company"
And Clear FirstName and Provide new name
And click on Submit and get the title of the page

Examples:
|company|firstname|lastname|flocalname|Department|Description|email|
|'TestLeaf'|'Sathish'|'Kannan'|'Sat'|'Testing'|'software Testing Department'|'sathish@gmail.com'|

@smoke @functional @regression
Scenario: TC005_To Validate the Delete Lead
When Click on CRMSFA Link
And Click on Leads
And click on Find Leads
And Click on Phone and provide the phone number
And Click on Find Leads Button
Then Get the first Lead ID and click on the first ID
And click on Delete Lead
And click on Find Lead and provide the first Lead Id
And click on Fingeads and check for the Error Code "No records to display"

