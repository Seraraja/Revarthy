$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "To validate login functionlity of facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "To validate login function with invalid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to the facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_navigate_to_the_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter username \"sera\" and password \"9898\"",
  "keyword": "When "
});
formatter.match({
  "location": "Login.user_enter_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to invalid page",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.user_navigate_to_invalid_page()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdefinition.Login.user_navigate_to_invalid_page(Login.java:36)\r\n\tat ✽.User navigate to invalid page(file:src/test/resources/Features/Login.feature:10)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/Register.feature");
formatter.feature({
  "name": "To validate login functionlity of facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@register"
    }
  ]
});
formatter.scenario({
  "name": "To validate register function with valid credential",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@register"
    },
    {
      "name": "@retest"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to the facebook application",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.user_navigate_to_the_facebook_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click create button",
  "keyword": "When "
});
formatter.match({
  "location": "Register.user_click_create_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter firstname and lastname",
  "keyword": "And "
});
formatter.match({
  "location": "Register.user_enter_firstname_and_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click signup button",
  "keyword": "And "
});
formatter.match({
  "location": "Register.user_click_signup_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User successfully registered",
  "keyword": "Then "
});
formatter.match({
  "location": "Register.user_successfully_registered()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});