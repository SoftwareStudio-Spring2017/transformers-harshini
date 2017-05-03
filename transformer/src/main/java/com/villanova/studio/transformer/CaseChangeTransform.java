package com.villanova.studio.transformer;

import org.apache.commons.lang3.StringUtils;

public class CaseChangeTransform implements Transform {

    public String forwardTransform(String input) {
        String caseChangedString = StringUtils.swapCase(input);
        return caseChangedString;
    }

    public String reverseTransform(String input) {
        String caseChangedString=forwardTransform(input);
        return caseChangedString;
    }
}
