package it.polito.tdp.Es1_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXMLController {

    @FXML
    private Label txtMessaggio;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtPassword;

    @FXML
    void handleAccedi(ActionEvent event) {
    	String nome = txtNome.getText();
    	String password = txtPassword.getText();
    	if(nome.length()!=0 && password.length()!=0)
    	{
    		int flNum=0;
    		int flUpper=0;
    		int flChar=0;
    		
    		for(int i = 0;i<password.length();i++)
    		{
    			
    			char c = password.charAt(i);
    			
    			
    			if(Character.isDigit(c))
    				flNum=1;
    			if(Character.isUpperCase(c))
    				flUpper=1;
    			if(c=='!' || c=='?' || c=='@' || c=='#')
    				flChar=1;
    			
    			if(flNum==1 && flUpper==1 && flChar==1 && password.length()>=7)
    			{
    				txtMessaggio.setText("Accesso effettuato con successo");
    				txtNome.setText("");
    				txtPassword.setText("");
    			}
    			
    			else
    			{
    				txtMessaggio.setText("ERRORE! Questa non e' una password");
    			}
    			
    			
    			
    		}
    		
    		
    		
    		
    	}
    	else
    	{
    		txtMessaggio.setText("ERRORE! Nome o password ancora da inserire");
    	}

    }

}
