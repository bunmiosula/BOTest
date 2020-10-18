#Author: bunmiosula@hotmail.com

Feature: City bike location worldwide
Description: Ensure Frankfurt is displayed as a city in Germany and corresponding longitude and latitude are displayed
Scenario:	 Successful	Login	with	valid	credentials
 
  Given I have the API is up and running
  When I enter the API Endpoint with the City and Location
  And Germany is Country(DE)
  Then Frankfurt should be listed as a City
  And the corresponding longitude and latitude should be displayed
