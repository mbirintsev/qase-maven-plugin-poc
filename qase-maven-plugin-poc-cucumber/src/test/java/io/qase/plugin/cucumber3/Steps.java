package io.qase.plugin.cucumber3;


import io.cucumber.java.en.Given;

public class Steps {

    @Given("step @caseId={int}")
    public void stepWithCaseId(int caseId) {
        System.out.println("Step caseId = " + caseId);
    }
}
