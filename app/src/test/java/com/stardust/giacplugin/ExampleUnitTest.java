package com.stardust.giacplugin;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void plugin_isAvailable() throws Exception {
        assertEquals(Computer.calculate("1+1"), "2");
    }
}