package io.qase.plugin.cucumber3;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("io/qase/plugin/cucumber3")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
// @ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.example.cucumber3")
public class SuccessFeatureTest {
}
