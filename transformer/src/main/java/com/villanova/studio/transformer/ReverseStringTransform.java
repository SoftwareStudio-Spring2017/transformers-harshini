package com.villanova.studio.transformer;

import org.apache.commons.lang3.StringUtils;

public class ReverseStringTransform implements Transform {

	public String forwardTransform(String input) {
		// TODO Auto-generated method stub
		String st = "";
		st = StringUtils.reverse(input);
		return st;
	}

	public String reverseTransform(String input) {
		return forwardTransform(input);
	}

    public static void main(String[] args)
    {
        String str = "MyJava";
        ReverseStringTransform rs = new ReverseStringTransform();
        String ft = rs.forwardTransform(str);
        System.out.println("ft for reverse string is: " + ft);
        String rt = rs.reverseTransform(ft);
        System.out.println("ft for reverse string is: " + rt);
        if(rt.equals(str))
        {
        	System.out.println("success");
        }
        else
        {
        	System.out.println("Failed");
        }
 
    }
 
}