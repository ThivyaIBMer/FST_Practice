Feature: Search

@smoke
Scenario Outline: Validate Search functionality
Given User is in search page
When user enters "<product>" product
And Click on search button
Then Product "<product>" shoud be displayed

Examples:

| product |
| iPhone  |
| MacBook Air |
| MacBook Pro |