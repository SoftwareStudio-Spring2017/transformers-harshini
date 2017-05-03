package com.villanova.studio.transformer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TransformerDriver {

    public static void main(String[] args) {

        char choice;
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            do {
                String transformationText, transformationOrder;
                System.out.println(
                        "Available Transformations \n 0 - ReverseString \n 1 - CaseChange \n 2 - CharacterShift");
                System.out.println("Enter the desired transformations in order by number, single space delimited");

                transformationOrder = sc.nextLine();
                System.out.println("Enter text to transform, limit 2000 chars: ");
                transformationText = sc.nextLine();
                System.out.println("Initial String : " + transformationText);
                if (transformationText.length() > 2000) {
                    System.out.println("Please limit your transformation text to 2000 chars");
                }
                if (transformationText.isEmpty()) {
                    System.out.println("Please enter valid input");
                }
                Map<Integer, TransformationType> transformationMap = new HashMap<Integer, TransformationType>();
                transformationMap.put(0, TransformationType.ReverseStringTransform);
                transformationMap.put(1, TransformationType.CaseChangeTransform);
                transformationMap.put(2, TransformationType.CharacterShiftTransform);

                List<TransformationType> transformationTypeOrder = new ArrayList<TransformationType>();

                String[] transformOrder = transformationOrder.split(" ");
                for (String order : transformOrder) {
                    transformationTypeOrder.add(transformationMap.get(new Integer(order)));
                }
                Transformer transformer = new Transformer();
                boolean result = transformer.transformationProcess(
                        transformationTypeOrder.toArray(new TransformationType[0]), transformationText);
                if (result) {
                    System.out.println("SUCCESS - initial equals final string!");
                }
                else {
                    System.out.println("UNSUCCESS - initial not equals final string!");
                }

                System.out.println("Enter Y to play again, any other char to stop: ");
                choice = sc.nextLine().charAt(0);

            } while (choice == 'Y');
        }
        catch (Exception e) {
            // TODO: handle exception
        }
        finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
