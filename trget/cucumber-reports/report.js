$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("MyFeatures.feature");
formatter.feature({
  "line": 2,
  "name": "Title of your feature",
  "description": "I want to use this template for my feature file",
  "id": "title-of-your-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Title of your scenario",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I want to write a step with precondition",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "some other precondition",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I complete action",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "some other action",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "yet another action",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I validate the outcomes",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "check more outcomes",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition1.i_want_to_write_a_step_with_precondition()"
});
formatter.result({
  "duration": 1043273977,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.some_other_precondition()"
});
formatter.result({
  "duration": 318175,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.i_complete_action()"
});
formatter.result({
  "duration": 261502,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.some_other_action()"
});
formatter.result({
  "duration": 263286,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.yet_another_action()"
});
formatter.result({
  "duration": 734524,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.i_validate_the_outcomes()"
});
formatter.result({
  "duration": 1149981,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.check_more_outcomes()"
});
formatter.result({
  "duration": 298985,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 16,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario-outline",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 15,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I want to write a step with \u003cname\u003e",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I check for the \u003cvalue\u003e in step",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I verify the \u003cstatus\u003e in step",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario-outline;",
  "rows": [
    {
      "cells": [
        "name",
        "value",
        "status"
      ],
      "line": 22,
      "id": "title-of-your-feature;title-of-your-scenario-outline;;1"
    },
    {
      "cells": [
        "name1",
        "5",
        "success"
      ],
      "line": 23,
      "id": "title-of-your-feature;title-of-your-scenario-outline;;2"
    },
    {
      "cells": [
        "name2",
        "7",
        "Fail"
      ],
      "line": 24,
      "id": "title-of-your-feature;title-of-your-scenario-outline;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 23,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario-outline;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 15,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I want to write a step with name1",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I check for the 5 in step",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I verify the success in step",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 32
    }
  ],
  "location": "StepDefinition1.i_want_to_write_a_step_with_name(int)"
});
formatter.result({
  "duration": 24983623,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 16
    }
  ],
  "location": "StepDefinition1.i_check_for_the_in_step(int)"
});
formatter.result({
  "duration": 3995702,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.i_verify_the_success_in_step()"
});
formatter.result({
  "duration": 3083126,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Title of your scenario outline",
  "description": "",
  "id": "title-of-your-feature;title-of-your-scenario-outline;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    },
    {
      "line": 15,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "I want to write a step with name2",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I check for the 7 in step",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I verify the Fail in step",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 32
    }
  ],
  "location": "StepDefinition1.i_want_to_write_a_step_with_name(int)"
});
formatter.result({
  "duration": 662232,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "7",
      "offset": 16
    }
  ],
  "location": "StepDefinition1.i_check_for_the_in_step(int)"
});
formatter.result({
  "duration": 1421746,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition1.i_verify_the_Fail_in_step()"
});
formatter.result({
  "duration": 204381,
  "status": "passed"
});
});