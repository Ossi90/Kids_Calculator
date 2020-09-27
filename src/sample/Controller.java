package sample;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;


public class Controller {
    @FXML
    private TextArea textArea;
    private float intOperator;
    private String inputValue = "";
    private String tempInput = "";
    private String tempInputTwo= "";
    private String UIoperator = "";
    private ArrayList <String> value = new ArrayList<>();
    private ArrayList <Float> input = new ArrayList();
    Calculator calculator = new Calculator();
    private static int iterator = 0;

    @FXML
    private Button seven;
    @FXML
    private Button nine;
    @FXML
    private Button four;
    @FXML
    private Button five;
    @FXML
    private Button six;
    @FXML
    private Button one;
    @FXML
    private Button two;
    @FXML
    private Button three;
    @FXML
    private Button zero;
    @FXML
    private Button clear;
    @FXML
    private Button dot;
    @FXML
    private Button equal;
    @FXML
    private Button minusValue;
    @FXML
    private Button plus;
    @FXML
    private Button minus;
    @FXML
    private Button multi;
    @FXML
    private Button div;
    @FXML
    private Button square;
    @FXML
    private Button root;
    @FXML
    private Button squareRoot;


    /*public void initialize(){

       seven.setOnAction(actionEvent -> {
          System.out.println(seven);

       });
    }*/

  public ArrayList setArray(){
      ArrayList <String> capacity = new ArrayList();
      capacity.add("");

     return capacity;
  }

    @FXML
    public void clear (){
      clearText();
    }
    @FXML
    public void seven(){
        inputValue = "7";
        addToTextField();
    }
    @FXML
    public void eight(){
       inputValue = "8";
       addToTextField();
    }
    @FXML
    public void nine(){
        inputValue = "9";
        addToTextField();
    }
    @FXML
    public void four(){
        inputValue = "4";
        addToTextField();
    }
    @FXML
    public void five(){
        inputValue = "5";
        addToTextField();
    }
    @FXML
    public void six(){
        inputValue = "6";
        addToTextField();
    }
    @FXML
    public void one(){
        inputValue = "1";
        addToTextField();
    }
    @FXML
    public void two(){
        inputValue = "2";
        addToTextField();
    }
    @FXML
    public void three(){
        inputValue = "3";
        addToTextField();
    }
    @FXML
    public void zero(){
        inputValue = "0";
        addToTextField();
    }
    @FXML
    public void dot(){
        inputValue += ".";
        addToTextField();
    }
    @FXML
    public void plus(){
      intOperator = -1;
        UIoperator = "+";
        addToTextField();
    }
    @FXML
    public void minus(){
        intOperator = -2;
        UIoperator = "–";
        addToTextField();
    }
    @FXML
    public void multi(){
        intOperator = -3;
        UIoperator = "x";
        addToTextField();
    }
    @FXML
    public void div(){
        intOperator = -4;
        UIoperator = "÷";
        addToTextField();
    }
 @FXML
    public void square(){
        intOperator = -5;
        UIoperator += "²";
        addToTextField();
    }

    @FXML
    public void root(){
        intOperator = -6;
        UIoperator += "√";
        addToTextField();
    }


    @FXML
    public void equal(){
        intOperator = -6;
        UIoperator = "=";
        addValuesToList(tempInputTwo);
        textArea.setText("= "+calculator.calculate(input));
      /*  if (calculator.caclulateTest(value).equals("Error")){
            error();
        }else{
            System.out.println(calculator.caclulateTest(value));
            addToTextField();
        }*/


    }

    public void clearText(){
        intOperator = 0;
        tempInput = "";
        tempInputTwo= "";
        inputValue ="";
        UIoperator ="";
        iterator = 0;
        textArea.clear();
        input.clear();
        value.clear();
    }


    public void addToTextField(){

        if(UIoperator ==""){
            tempInput += inputValue;
            tempInputTwo += inputValue;
            textArea.setText(tempInput);
            inputValue="";
        }else{
            addValuesToList(tempInputTwo);
            tempInput += UIoperator;
            textArea.setText(tempInput);
            addOperatorsToList(UIoperator);
            UIoperator ="";
            inputValue="";
            tempInputTwo = "";
        }
    }

    public void addValuesToList(String val){
      try{
          float f=Float.parseFloat(val);
      value.add(val);
      input.add(f);
     //System.out.println(input);
      }
      catch(java.lang.NumberFormatException e){

          textArea.setText("Please Add a Value First");
      }
    }
    public void addOperatorsToList(String val){
       try{value.add(val);
           input.add(intOperator);
      //  System.out.println(value);
             }
       catch (java.lang.NumberFormatException e){
           clear();
           textArea.setText("Please Enter A Value First");
       }
    }

    public void error(){
      clear();
      textArea.setText("error");
    }

}
