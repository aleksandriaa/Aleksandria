package users;

import javafx.fxml.FXML;

import java.awt.*;


public class MainController {
    @FXML
    private Label lblStatus;

    @FXML
    private TextField txtUserName;


    @FXML
    private TextField txtPassword;
    public void Login(ActiveEvent event){
        if (txtUserName.getText().equals("User") && txtPassword.getText().equals("password")){
            lblStatus.setText("Logina Success");
        }
        else {lblStatus.setText("Login Failed");
    }//



}}
