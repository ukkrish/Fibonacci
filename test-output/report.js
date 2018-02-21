$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/krish/Documents/Automation/gitclones/fobonacciTestProj/src/test/java/features/fibonacci.feature");
formatter.feature({
  "line": 1,
  "name": "Fibonacci functionality",
  "description": "",
  "id": "fibonacci-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Verify the Fibonacci functional URLs",
  "description": "",
  "id": "fibonacci-functionality;verify-the-fibonacci-functional-urls",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "that the client provides restApi service",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "the webservice is running,",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "identify all the endpoint URLs and the datalimitations",
  "keyword": "Then "
});
formatter.match({
  "location": "fibonacciTesting.that_the_client_provides_restApi_service()"
});
formatter.result({
  "duration": 499420835,
  "status": "passed"
});
formatter.match({
  "location": "fibonacciTesting.the_webservice_is_running()"
});
formatter.result({
  "duration": 1427355,
  "status": "passed"
});
formatter.match({
  "location": "fibonacciTesting.identify_all_the_endpoint_URLs_and_the_datalimitations()"
});
formatter.result({
  "duration": 5257292493,
  "status": "passed"
});
});