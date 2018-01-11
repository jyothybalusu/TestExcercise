Feature: Test to Verify that the DVLA details from the excel document match the details in the DVLA site

  @bb-dvla
Scenario Outline: Verify vehicle details from DVLA

Given I navigate to the DVLA "<site>"
When I press the Start Now button
And I enter the Vehicle Registration Number "<regnumber>" and continue
And I confirm that the make "<make>" and colour "<colour>" details match to the Vehicle registration "<regnumber>" I am looking for
Then I check the make "<make>", date of first registration "<firstregdate>", year of make "<yearofmake>", cylinder capacity "<cylindercapacity>",cotwo "<cotwo>",fuel "<fuel>",exportmaker "<exportmaker>", status "<status>",colour "<colour>",typeapproval "<typeApproval>",wheelplan "<wheelplan>" and revenue weight "<revenueWeight>"

Examples:
| site                                                 |regnumber  |make    |colour|firstregdate|yearofmake|cylindercapacity|cotwo     |fuel  |exportmaker|status     |typeApproval|wheelplan        |revenueWeight|
| https://www.gov.uk/get-vehicle-information-from-dvla | NT07 AXG  |BMW     |GREY  |March 2007  |2007      |1995 cc         |152 g/km|DIESEL|No         |Tax not due|M1          |2-AXLE-RIGID BODY|Not available|
| https://www.gov.uk/get-vehicle-information-from-dvla |AE17 EYO   |PEUGEOT |WHITE |March 2017  |2017      |1200 cc         |95 g/km |PETROL|No         |Tax not due|M1          |2-AXLE-RIGID BODY|Not available|
| https://www.gov.uk/get-vehicle-information-from-dvla |LS67 LRE   |CITROEN |BLUE  |October 2017  |2017      |1560 cc         |107 g/km |DIESEL|No        |Tax not due|M1         |2-AXLE-RIGID BODY|Not available|

 ########################################################################################################################################################################################################################################################################################################################################################
