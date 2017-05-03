package com.villanova.studio.transformer;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseStringTransformTest {

	 @Test
	    public void testForwardTransformWithWrapAndNonAlpha() {
	        String input = "!abc xyz??";
	        ReverseStringTransform r = new ReverseStringTransform();
	        assertEquals("??zyx cba!", r.forwardTransform(input));
	    } 

	 @Test
	    public void testReverseTransformWithWrap() {    
	        String input = "abcxyz";
	        ReverseStringTransform rs = new ReverseStringTransform();
	        assertEquals("zyxcba", rs.reverseTransform(input));
	    } 


}
