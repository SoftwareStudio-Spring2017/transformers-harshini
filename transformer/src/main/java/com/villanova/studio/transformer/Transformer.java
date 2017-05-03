package com.villanova.studio.transformer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;

public class Transformer {
    private Map<TransformationType, Transform> commands = new HashMap<TransformationType, Transform>();

    public Transformer() {
        commands.put(TransformationType.ReverseStringTransform, new ReverseStringTransform());
        commands.put(TransformationType.CaseChangeTransform, new CaseChangeTransform());
        commands.put(TransformationType.CharacterShiftTransform, new CharacterShiftTransform());
    }

    public boolean transformationProcess(TransformationType[] forwardTransformOrder, String inputTextString) {

        System.out.println("Requested these " + forwardTransformOrder.length + " forward transformations (in order): "
                + Arrays.toString(forwardTransformOrder));
        String forwardOpResult = transform(forwardTransformOrder, inputTextString);
        TransformationType[] reverseTransformOrder = forwardTransformOrder.clone();
        ArrayUtils.reverse(reverseTransformOrder);
        System.out.println("Requested these " + reverseTransformOrder.length + " reverse transformations (in order): "
                + Arrays.toString(reverseTransformOrder));
        String reverseOpResult = transform(reverseTransformOrder, forwardOpResult);
        if (inputTextString.equals(reverseOpResult))
            return true;
        else
            return false;
    }

    public String transform(TransformationType[] forwardTransformOrder, String inputTextString) {

        String result = inputTextString;
        for (TransformationType transformationType : forwardTransformOrder) {
            result = commands.get(transformationType).forwardTransform(result);
            System.out.println("Interim transform = " + result);
        }
        return result;

    }
}
