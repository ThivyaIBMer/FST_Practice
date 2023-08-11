$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/Features/blog.feature");
formatter.feature({
  "name": "Blog",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "prerequisite",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.BlogPage.bg_Test()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing multi scenario case1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "test multiple scenatio case1",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.BlogPage.test_multiple_scenatio_case1()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "prerequisite",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.BlogPage.bg_Test()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Testing multi scenario case2",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "test multiple scenatio case2",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.BlogPage.test_multiple_scenatio_case2()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/Features/search.feature");
formatter.feature({
  "name": "Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Validate Search functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User is in search page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cproduct\u003e\" product",
  "keyword": "When "
});
formatter.step({
  "name": "Click on search button",
  "keyword": "And "
});
formatter.step({
  "name": "Product \"\u003cproduct\u003e\" shoud be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "product"
      ]
    },
    {
      "cells": [
        "iPhone"
      ]
    },
    {
      "cells": [
        "MacBook Air"
      ]
    },
    {
      "cells": [
        "MacBook Pro"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Validate Search functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in search page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Search.user_is_in_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"iPhone\" product",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Search.user_enters_product(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Search.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product \"iPhone\" shoud be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Search.product_shoud_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Search functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in search page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Search.user_is_in_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"MacBook Air\" product",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Search.user_enters_product(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Search.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product \"MacBook Air\" shoud be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Search.product_shoud_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Search functionality",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in search page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.Search.user_is_in_search_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"MacBook Pro\" product",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.Search.user_enters_product(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on search button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.Search.click_on_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Product \"MacBook Pro\" shoud be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.Search.product_shoud_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});