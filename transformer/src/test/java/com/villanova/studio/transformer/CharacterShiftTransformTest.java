package com.villanova.studio.transformer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CharacterShiftTransformTest {

    private CharacterShiftTransform cs = new CharacterShiftTransform();
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testForwardTransformWithWrapAndNonAlpha() {
        String input = "!abc xyz??";       
        assertEquals("!bcd yza??", cs.forwardTransform(input));
    } 

    @Test
    public void testReverseTransformWithWrap() {    
        String input = "abcxyz";
        assertEquals("zabwxy", cs.reverseTransform(input));
    } 


}
