Feature: Hamon Site Navigation and Element Verification
  As a user,
  I want to visit the Hamon site
  So that I can verify the home page elements and navigate to different sections of the website

  Scenario: Verify Hamon Home Page and navigate through menus
    Given I am on Hamon Site
    Then Verify Hamon Home Page Elements Check
    When I click on the Case Studies
    When I click on the Services
    When I click on the Blog
    When I click on the Careers