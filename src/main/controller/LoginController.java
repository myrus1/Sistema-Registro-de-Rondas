/*package main.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import main.User.Persona;

public class LoginController {
    @FXML
    private Button btIngresar;
    @FXML
    private TextField tfUsuario;
    @FXML
    private PasswordField tfPassword;
    @FXML
    private Label lbMensaje;

    @FXML
    public void btIngresarOnAction(ActionEvent event) {
        String usuario = tfUsuario.getText();
        String password = tfPassword.getText();
        Persona user = new Persona() {
          
        };(usuario,password);
        if(user.getIngreso().ingresar(user)) {
            if(user instanceof UsuarioAdministrador) {
                App.setRoot("Admin");
            } else {
                App.setRoot("User");
            }
        } else {
            lbMensaje.setText("Usuario o contrase a incorrecta");
        }
    }
}
*/