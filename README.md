# Katalon Studio Samples: Siteminder
Quick Sample of usage Katalon for automate varioue type of automation tests.
______
The **Siteminder** perform UI functional automation test on web site "https://nxs-dev-nxs-admin.dev.siteminderlabs.com" using Katalon Studio.
## Getting Started
These instructions will get you a copy of the project up and running on your local machine.
### Prerequisites
- [Katalon Studio](https://www.katalon.com/) - [Installation and Setup](https://docs.katalon.com/x/HwAM)
- Internet access
- Application Under Test (AUT):
     + Siteminder cloud: https://nxs-dev-nxs-admin.dev.siteminderlabs.com
     + Account: ************
### Setting Up
- [Check out]() the code from this repository
- [Open the project] from Katalon Studio
### Executing a Test Case
1. Expand the Test Cases structure, where all the test cases are stored.
2. Select the test case you want to execute
3. Choose the browser for executing the test case

At the end of this README, you will find additional ways to execute automation test cases. 
## Test Scenarios
Below is the list of all the available test cases in this project. 
### Story: Login feature
```Gherkin     
     User story
         As a Normal user, I would like to be able to login the Siteminder system, so that I could search on salesforce.
     
     Feature: Login 
         Scenario: Login successfully
          Given The Login page is loaded successfully
          When I login the system with a valid account
          Then The Dashboard Page is loaded successfully

 ```         
(https://github.com/amirgauss/siteminder/blob/master/Tutorials/Figures/login.png?raw=true)
### Story: Filter tickets
```Gherkin     
     User story
         As a Normal user, I would like to be able to filter all tickets of salesforce with diffrent parameter, so that I could find my suitable one.

     Feature: fileter salesfoce
         Scenario Outline: Create ticket successfully
          Given I login the system with a valid account
          When I filter element of list salesforce a base on below information
          Then validate output record successfully
         
         Examples:
          | name    | id | address |
          |'\'Love\' Hanmer Couples Retreat'|0010D000007MzUXQA0|'95 Chalet Crescent,Hanmer Springs,Canterbury,New Zealand,NZ,'|
          |'(Cairn Hotel Group) Angel Hotel'|0010D000007MyRsQAK|'Castle St,Cardiff,Wales,United Kingdom,GB,CF10 1QZ'|
```
(https://github.com/amirgauss/siteminder/blob/master/Tutorials/Figures/filter.png?raw=true)
