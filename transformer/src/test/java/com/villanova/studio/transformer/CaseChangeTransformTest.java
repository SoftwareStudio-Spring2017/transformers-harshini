package com.villanova.studio.transformer;

import static org.junit.Assert.*;

import javax.xml.transform.TransformerConfigurationException;

import org.junit.Before;
import org.junit.Test;

public class CaseChangeTransformTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testForwardTransformWithWrapAndNonAlpha() throws TransformerConfigurationException {
        String input = "!abc xyz??";
        CaseChangeTransform cc = new CaseChangeTransform();
        assertEquals("!ABC XYZ??", cc.forwardTransform(input));
    } 

 @Test
    public void testReverseTransformWithWrap() throws TransformerConfigurationException {    
        String input = "abcxyz";
        CaseChangeTransform c = new CaseChangeTransform();
        assertEquals("ABCXYZ", c.reverseTransform(input));
    } 

}
