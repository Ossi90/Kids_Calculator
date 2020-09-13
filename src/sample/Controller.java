package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import org.w3c.dom.Text;


import java.net.URISyntaxException;
import java.util.jar.Attributes;

public class Controller {
    private String input = "";

    @FXML
    private Button seven;

    @FXML
    private TextArea textArea;

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
    private Button squareRoot;

   /* public void initialize(){

       seven.setOnAction(actionEvent -> {
           input += "7";
           addToTextField();
       });
    }*/

    @FXML
    public void clear (){
        clearText();
    }
    @FXML
    public void seven(){
        input += "7";
        addToTextField();
    }

    @FXML
    public void eight(){
       input += "8";
       addToTextField();
    }

    @FXML
    public void nine(){
        input += "9";
        addToTextField();
    }

    @FXML
    public void four(){
        input += "4";
        addToTextField();
    }

    @FXML
    public void five(){
        input += "5";
        addToTextField();
    }

    @FXML
    public void six(){
        input += "6";
        addToTextField();
    }

    @FXML
    public void one(){
        input += "1";
        addToTextField();
    }

    @FXML
    public void two(){
        input += "2";
        addToTextField();
    }

    @FXML
    public void three(){
        input += "3";
        addToTextField();
    }

    @FXML
    public void zero(){
        input += "0";
        addToTextField();
    }

    @FXML
    public void dot(){
        input += ".";
        addToTextField();
    }

    @FXML
    public void plus(){
        input += " + ";
        addToTextField();
    }

    @FXML
    public void minus(){
        input += " – ";
        addToTextField();
    }

    @FXML
    public void multi(){
        input += " x ";
        addToTextField();
    }

    @FXML
    public void div(){
        input += " ÷ ";
        addToTextField();
    }

    @FXML
    public void square(){
        input += "²";
        addToTextField();
    }

    public void clearText(){
        input ="";
        textArea.clear();
    }

    public void addToTextField(){
        textArea.setText(input);
    }

}
