package it.polito.tdp.alien;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	AlienDictionary dizionario;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtWord;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnClearText;

    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	String risultato[];
    	risultato = txtWord.getText().split(" ");
    	
		if(risultato.length==1) {
    		txtResult.setText(dizionario.translateWord(risultato[0]));
    	}
    	if(risultato.length==2) {
    		dizionario.addWord(risultato[0],risultato[1]);
    		txtResult.setText(dizionario.translateWord(risultato[0]));
    	}

    }

    @FXML
    void initialize() {
        assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnClearText != null : "fx:id=\"btnClearText\" was not injected: check your FXML file 'Alien.fxml'.";
        
        dizionario = new AlienDictionary();

    }
}
