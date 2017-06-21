$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("OpenApplication.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: swapnilkpillai@gmail.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary : This is the Login feature file"
    },
    {
      "line": 3,
      "value": "#Feature: Login"
    },
    {
      "line": 4,
      "value": "#Scenario:"
    },
    {
      "line": 5,
      "value": "#Given: Some precondition step"
    },
    {
      "line": 6,
      "value": "#When: Some key actions"
    },
    {
      "line": 7,
      "value": "#Then: To observe outcomes or validation"
    },
    {
      "line": 8,
      "value": "#And,But: To enumerate more Given,When,Then steps"
    },
    {
      "line": 9,
      "value": "#Scenario Outline: List of steps for data-driven as an Examples and \u003cplaceholder\u003e"
    },
    {
      "line": 10,
      "value": "#Examples: Container for s table"
    },
    {
      "line": 11,
      "value": "#Background: List of steps run before each of the scenarios"
    },
    {
      "line": 12,
      "value": "#\"\"\" (Doc Strings)"
    },
    {
      "line": 13,
      "value": "#| (Data Tables)"
    },
    {
      "line": 14,
      "value": "#@ (Tags/Labels):To group Scenarios"
    },
    {
      "line": 15,
      "value": "#\u003c\u003e (placeholder)"
    },
    {
      "line": 16,
      "value": "#\"\""
    },
    {
      "line": 17,
      "value": "## (Comments)"
    },
    {
      "line": 19,
      "value": "#Sample Feature Definition Template"
    }
  ],
  "line": 21,
  "name": "Open the application",
  "description": "",
  "id": "open-the-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 20,
      "name": "@OpenApplication"
    }
  ]
});
formatter.scenario({
  "line": 22,
  "name": "Open the Application",
  "description": "",
  "id": "open-the-application;open-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 23,
  "name": "Open the URL",
  "keyword": "Given "
});
formatter.match({
  "location": "OpenApplication.open_the_URL()"
});
formatter.result({
  "duration": 8915186060,
  "status": "passed"
});
});