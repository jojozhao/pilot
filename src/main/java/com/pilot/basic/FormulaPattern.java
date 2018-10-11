package com.pilot.basic;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* Created by moony.chen on 2/15/2017.
*/
public class FormulaPattern {


    private String formulae = "(a and b) or (a and (b or c))";
                                //"or and a b and a or b c"

    private List<String> stack = new ArrayList<>();

    public List<String> splitToWords(String formulae) {
        Pattern p = Pattern.compile("(\\(|\\)|\\w+)");
        Matcher m = p.matcher(formulae);
        List<String> result = new ArrayList<>();
        while(m.find()) {
            result.add(m.group());
        }
        return result;
    }

    private boolean isValue(String value) {
        return
                !"(".equals(value) &&
                !")".equals(value) &&
                !"and".equals(value) &&
                !"or".equals(value)
                ;
    }

    private <T> T pop(List<T> stack) {
        return stack.remove(stack.size()-1);
    }
    private <T> void push(List<T> stack, T value) {
        stack.add(value);
    }

    public String evaluate(List<String> tokens) {

        List<String> stack = new ArrayList<>();
        List<Integer> levelStack = new ArrayList<>();
        int valueCount = 0;
        for(String t : tokens) {
            push(stack, t);

            if(isValue(t)) valueCount++;
            if("(".equals(t)) {
                push(levelStack, valueCount);
                valueCount = 0;
            }

            if(")".equals(t)) {
                pop(stack); //pop )
                String result = pop(stack);
                pop(stack);
                push(stack, result);
                valueCount = pop(levelStack)+1;
            }



            if(valueCount == 2) {
                String right = pop(stack);
                String op = pop(stack);
                String left = pop(stack);

                boolean leftB = valueMap.get(left);
                boolean rightB = valueMap.get(right);

                boolean result = "and".equals(op)? leftB && rightB : leftB || rightB;

                push(stack, result?"true":"false");
                valueCount = 1;
            }
        }

        return stack.get(0);

    }



    private static Map<String, Boolean> valueMap = new HashMap<>();
    static {
        valueMap.put("a", true);
        valueMap.put("b", false);
        valueMap.put("c", true);
        valueMap.put("true", true);
        valueMap.put("false", false);
    }


    @Test
    public void testsplitToWords() {
        String[] expected = {"(","a","and","b",")"};
        Object[] actuals = splitToWords("(a and b)").toArray();
        Assert.assertArrayEquals(expected, actuals);

        String result = evaluate(splitToWords("(a and b)"));
        Assert.assertEquals("false", result);
        Assert.assertEquals("false", splitToWords("(a a a"));
        Assert.assertEquals("true", evaluate(splitToWords("(a and b) or (a and (b or c))")));
        Assert.assertEquals("true", evaluate(splitToWords("a and (a and (b or c)) or (a and (b or c))")));
        Assert.assertEquals("false", evaluate(splitToWords("(a and b) and (a and (b or c)) and (a and (b or c))")));
    }


}
