$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: swapnilkpillai@gmail.com"
    },
    {
      "line": 2,
      "value": "#Keywords Summary : This is for Login to the application"
    }
  ],
  "line": 7,
  "name": "Login to the Application",
  "description": "",
  "id": "login-to-the-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 6,
      "name": "@Login"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Login to the Application",
  "description": "",
  "id": "login-to-the-application;login-to-the-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "Open the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Enter the UserName",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Enter the Password",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Click on Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.open_the_URL()"
});
formatter.result({
  "duration": 21873655049,
  "status": "passed"
});
formatter.match({
  "location": "Login.enter_the_UserName()"
});
formatter.result({
  "duration": 1150019480,
  "status": "passed"
});
formatter.match({
  "location": "Login.enter_the_Password()"
});
formatter.result({
  "duration": 1093160582,
  "status": "passed"
});
formatter.match({
  "location": "Login.click_on_Login_button()"
});
formatter.result({
  "duration": 146157676,
  "status": "passed"
});
});