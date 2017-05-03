package com.villanova.studio.transformer;

import org.apache.commons.lang3.CharUtils;
public class CharacterShiftTransform implements Transform {

    public String forwardTransform(String input) {
        // TODO Auto-generated method stub
        String characShift_FT = "";
        for (char c : input.toCharArray()) {
            if(CharUtils.isAsciiAlpha(c))
            {
                if(c == 'z')
                {
                    characShift_FT += "a";
                } else if(c == 'Z')
                {
                    characShift_FT += "A";
                } else
                {
                    //bar += Character.toString((char) (((c - 'a' + 1) % 26) + 'a'));
                    characShift_FT += Character.toString((char)((int)c + 1));
                }
            }else 
            {
                characShift_FT += Character.toString(c);
            }
        }

      //System.out.println(characShift_FT);
        return characShift_FT;
    }

    public String reverseTransform(String input) {
        // TODO Auto-generated method stub
        String characShift_RT = "";
        for (char c : input.toCharArray()) {
            if(CharUtils.isAsciiAlpha(c))
            {
                if(c == 'a')
                {
                    characShift_RT += "z";
                } else if(c == 'A')
                {
                    characShift_RT += "Z";
                } else
                {
                    //bar += Character.toString((char) (((c - 'a' + 1) % 26) + 'a'));
                    characShift_RT += Character.toString((char)((int)c - 1));
                }
            }else 
            {
                characShift_RT += Character.toString(c);
            }
        }

      //System.out.println(characShift_FT);
        return characShift_RT;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String afterShift_FT = "";
        String afterShift_RT = "";
        CharacterShiftTransform cs = new CharacterShiftTransform();
        String str = "12 abZd";
        System.out.println("Input string is: " + str);
        afterShift_FT = cs.forwardTransform(str);
        System.out.println("String after forward transform character shift " + afterShift_FT);
        afterShift_RT = cs.reverseTransform(afterShift_FT);
        System.out.println("String after reverse transform character shift " + afterShift_RT);
       if(afterShift_RT.equals(str))
       {
           System.out.println("success");
       }
       else
       {
           System.out.println("Failed");
       }
    }

}
