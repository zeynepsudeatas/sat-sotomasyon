package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.isteMySQL.Util.VeritabanıUtil;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;



public class LoginController {
	
    public LoginController(){
    	baglanti=VeritabanıUtil.Baglan();
    }
    
    Connection baglanti=null;
    PreparedStatement sorguIfadesi=null;
    ResultSet getirilen=null;
    String sql;
	

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn_login;

    @FXML
    private Label lbl1;

    @FXML
    private Label lbl2;

    @FXML
    private Label lbl_sonuc;

    @FXML
    private PasswordField password;

    @FXML
    private TextField username;

    @FXML
    void btn_login_Click(ActionEvent event) {
    	sql="select * from login where kul_ad=? and sifre=?";
    	try {
			sorguIfadesi=baglanti.prepareStatement(sql);
			sorguIfadesi.setString(1, username.getText().trim());
			sorguIfadesi.setString(2, password.getText().trim());
			
			ResultSet getirilen=sorguIfadesi.executeQuery();
			if(!getirilen.next()) {
				Alert alert=new Alert(AlertType.ERROR);
				alert.setTitle("Satıs ve Stok Otomasonu");
				alert.setHeaderText("Hata Mesajı");
				alert.setContentText("Kullanıcı Adı veya Şifre Hatalı...");
				alert.showAndWait();
			}
			else {
				getirilen.getString(1);
				System.out.println("kID:"+ getirilen.getString("kId"));
				System.out.println("kullanıcı:"+ getirilen.getString("kul_ad"));
				System.out.println("şifre:"+ getirilen.getString("sifre"));
				
				try {
		    		Stage stage=new Stage();
		    		AnchorPane pane1=(AnchorPane) FXMLLoader.load(getClass().getResource("menu.fxml"));
		    		Scene scene1=new Scene(pane1);
		    		stage.setScene(scene1);
		    		stage.show();
		    	}
		    		catch(Exception e) {
		    			e.printStackTrace();
		    			
		      		}
				
				}			
		} catch (Exception e) {
			// TODO: handle exception
			Alert alert=new Alert(AlertType.ERROR);
			alert.setTitle("Hata Mesajı");
			alert.setHeaderText("Satıs ve Stok Otomasyonu");
			alert.setContentText(e.getMessage().toString());
			lbl_sonuc.setText(e.getMessage().toString());
			alert.showAndWait();
		}

    }

    @FXML
    void initialize() {
       
    }

}
