package edu.estu;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/* *********************************************************
 **** WRITE YOUR FAILING UNIT TEST(S) INTO  THIS FILE! *****
 ***********************************************************
 */

/**
 * Unit tests for the first part of the project.
 */
public class FailingTest {
    @Test
    public void testInfiniteLoop() {
        try {
            App.infiniteLoop(Double.POSITIVE_INFINITY);
            fail("Expected an infinite loop, but the method terminated.");
        } catch (RuntimeException e) {

        }
    }

}
