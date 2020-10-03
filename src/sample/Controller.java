package sample;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


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
    Path currentRelativePath = Paths.get("");
    String path = currentRelativePath.toAbsolutePath().toString();
    Voice voice = new Voice();
    Calculator calculator = new Calculator();
    Media media;
    MediaPlayer mediaPlayer;


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
        voice.readOperation(inputValue);
        addToTextField();
    }
    @FXML
    public void eight(){
       inputValue = "8";
        voice.readOperation(inputValue);
       addToTextField();
    }
    @FXML
    public void nine(){
        inputValue = "9";
        voice.readOperation(inputValue);
        addToTextField();
    }
    @FXML
    public void four(){
        inputValue = "4";
        voice.readOperation(inputValue);
        addToTextField();
    }
    @FXML
    public void five(){
        inputValue = "5";
        voice.readOperation(inputValue);
        addToTextField();
    }
    @FXML
    public void six(){
        inputValue = "6";
        voice.readOperation(inputValue);
        addToTextField();
    }
    @FXML
    public void one(){
       // voice = new Media(new File(path+"\\src\\sample\\Voice_Clips\\1.m4a").toURI().toString());
        //mediaPlayer = new MediaPlayer(voice);
        inputValue = "1";
        voice.readOperation(inputValue);
        addToTextField();
        //mediaPlayer.setAutoPlay(true);
    }
    @FXML
    public void two(){
        inputValue = "2";
        voice.readOperation(inputValue);
        addToTextField();
    }
    @FXML
    public void three(){
        inputValue = "3";
        voice.readOperation(inputValue);
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
        voice.readOperator(inputValue);
        addToTextField();
    }
    @FXML
    public void plus(){
      intOperator = -1;
        UIoperator = "+";
        voice.readOperator(UIoperator);
        addToTextField();
    }
    @FXML
    public void minus(){
        intOperator = -2;
        UIoperator = "–";
        voice.readOperator(UIoperator);
        addToTextField();
    }
    @FXML
    public void multi(){
        intOperator = -3;
        UIoperator = "x";
        voice.readOperator(UIoperator);
        addToTextField();
    }
    @FXML
    public void div(){
        intOperator = -4;
        UIoperator = "÷";
        voice.readOperator(UIoperator);
        addToTextField();
    }
 @FXML
    public void square(){
        intOperator = -5;
        UIoperator += "²";
        voice.readOperator(UIoperator);
        addToTextField();
    }

    @FXML
    public void root(){
        intOperator = -6;
        UIoperator += "√";
        voice.readOperator(UIoperator);
        addToTextField();
    }


    @FXML
    public void equal() throws InterruptedException {
        intOperator = -6;
        UIoperator = "=";
        voice.readOperator(UIoperator);
        addValuesToList(tempInputTwo);
        float outcome = calculator.calculate(input);
        voice.readOutcome(outcome);
        textArea.setText("= "+outcome );



    }

    public void clearText(){
        intOperator = 0;
        tempInput = "";
        tempInputTwo= "";
        inputValue ="";
        UIoperator ="";
        voice.readOperator("clear");
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
      }
      catch(java.lang.NumberFormatException e){

          textArea.setText("Please Add a Value First");
      }
    }
    public void addOperatorsToList(String val){
       try{value.add(val);
           input.add(intOperator);

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
