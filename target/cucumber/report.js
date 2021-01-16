$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("gettingThere.feature");
formatter.feature({
  "line": 1,
  "name": "trial for jenkins",
  "description": "",
  "id": "trial-for-jenkins",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "this is just a test",
  "description": "",
  "id": "trial-for-jenkins;this-is-just-a-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test"
    },
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "i am walking",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I get tired",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I will sit",
  "keyword": "Then "
});
formatter.match({
  "location": "gettingThereSetpDefinitions.i_am_walking()"
});
formatter.result({
  "duration": 225287800,
  "status": "passed"
});
formatter.match({
  "location": "gettingThereSetpDefinitions.i_get_tired()"
});
formatter.result({
  "duration": 67200,
  "status": "passed"
});
formatter.match({
  "location": "gettingThereSetpDefinitions.i_will_sit()"
});
formatter.result({
  "duration": 80100,
  "status": "passed"
});
});