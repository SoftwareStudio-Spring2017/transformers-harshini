package com.villanova.studio.transformer;

import org.apache.commons.lang3.StringUtils;

public class ReverseStringTransform implements Transform {

	public String forwardTransform(String input) {
		// TODO Auto-generated method stub
		String inputString = "";
		inputString = StringUtils.reverse(input);
		return inputString;
	}

	public String reverseTransform(String input) {
		return forwardTransform(input);
	}

}