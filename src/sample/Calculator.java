package sample;

import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
public class Calculator {
public float outcome = 0;

    public Calculator() {

    }



  /*  public String caclulateTest(ArrayList inputs) {
        int x = 0;
       try{ if (inputs.get(0) instanceof String) {
            return "Error";
        }
       }catch(IndexOutOfBoundsException e){
           return "No Value Entered";
       }

        return "YES";

    }
*/
    public float calculate(ArrayList <Float> input){

        float x = 0;
        float y = 0;

       input = isMultiOrDiv(input);

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
            System.out.println(outcome);
        return outcome;
    }

   public ArrayList isMultiOrDiv(ArrayList <Float> input){
float zero = 0;
       for(int i = 1; i < input.size(); i+=2){
           if(input.get(i) == -3.0){
               outcome = input.get(i-1)*input.get(i+1);
              input.set(i-1,outcome);
              input.set(i+1,outcome);
              input.set(i,zero);
           }

           if(input.get(i) == -4.0){
               outcome = input.get(i-1)/input.get(i+1);
               input.set(i-1,outcome);
               input.set(i+1,outcome);
               input.set(i,zero);
           }
       }
    System.out.println(input);
       return input;
   }

}
