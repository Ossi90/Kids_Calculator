package sample;

import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
public class Calculator {
    public float outcome;

    public Calculator() {

    }

    public float calculate(ArrayList <Float> input){
       // System.out.println(input);

        input = isSquare(input);
        input = isRoot(input);
        input = isMultiOrDiv(input);
        outcome = isPlusOrMinus(input);
        System.out.println(outcome);
        return outcome;
    }

    public float isPlusOrMinus(ArrayList<Float> input){

        float x = 0;
        float y = 0;

        for(int i = 1; i < input.size(); i+=2){
            if(input.get(i) == -1.0){
                x = input.get(i-1);
                y = input.get(i+1);
                outcome=(x+y);
                input.set(i+1,outcome);
            }
            if(input.get(i) == -2.0){
                x = input.get(i-1);
                y = input.get(i+1);
                outcome=(x-y);
                input.set(i+1,outcome);
            }
        }

        return outcome;
    }
    public ArrayList isMultiOrDiv(ArrayList <Float> input) {

        int i = 1;
        while (i< input.size()){
            if(input.get(i) == -3.0){
                outcome = input.get(i-1)*input.get(i+1);
                input.set(i-1,outcome);
                input.remove(i);
                input.remove(i);
            }else if(input.get(i) == -4.0){
                outcome = input.get(i-1)/input.get(i+1);
                input.set(i-1,outcome);
                input.remove(i);
                input.remove(i);
            }else{
                i+=2;
            }
        }
        System.out.println(input);
        return input;
    }

    public ArrayList isRoot(ArrayList<Float> input){
        double rootTemp = 0;
        float root = 0;
        for(int i = 0; i < input.size(); i+=2){
            if(input.get(i) == -6.0){
                rootTemp = (double)input.get(i+1);
                rootTemp = Math.sqrt(rootTemp);
                root = (float)rootTemp;
                System.out.println(root + " hehehehere");
                outcome = root;
                input.set(i+1,outcome);
                input.remove(i);
            }
        }

        return input;
    }

   public ArrayList isSquare(ArrayList <Float> input){
       float zero = 0;
       for(int i = 1; i < input.size(); i+=2){
           if(input.get(i) == -5.0){
               outcome = input.get(i-1)*input.get(i-1);
               input.set(i-1,outcome);
               input.remove(i);
           }
           }
        return input;
   }

}
