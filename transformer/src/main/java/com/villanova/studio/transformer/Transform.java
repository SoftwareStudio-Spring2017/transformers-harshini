package com.villanova.studio.transformer;

public interface Transform {

    public String forwardTransform(String input);
    public String reverseTransform(String input);
}
