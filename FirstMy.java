package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstMy extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		
		 //creating label email 
	      Text text1 = new Text("Primo numero");       
	      
	      //creating label password 
	      Text text2 = new Text("Secondo numero");
	      
	      //Creating Text Filed for email        
	      TextField textField1 = new TextField();       
	      
	      //Creating Text Filed for password        
	      TextField textField2 = new TextField();  
	    //Creating Buttons 
	      Button button1 = new Button("Submit"); 
	      
	    //Creating a Grid Pane 
	      GridPane gridPane = new GridPane();    
	      
	      //Setting size for the pane 
	      gridPane.setMinSize(400, 200); 
	      
	      //Setting the padding  
	      gridPane.setPadding(new Insets(10, 10, 10, 10));
	      
	    //Setting the Grid alignment 
	      gridPane.setAlignment(Pos.CENTER); 
	      
	      gridPane.add(text1, 0, 0);
	      gridPane.add(text2, 0, 1);
	      gridPane.add(textField1, 1, 0);
	      gridPane.add(textField2, 1, 1);
	      gridPane.add(button1, 0, 2);
	      
	      
	      
	      
	      
	      // Registrare un gestore di eventi sul pulsante
	        button1.setOnAction(e -> {
	            // Leggere l'input dai campi di testo
	            String campo1 = textField1.getText();
	            String campo2 = textField2.getText();
	            
	            int num1 = Integer.parseInt(campo1);
	            int num2 = Integer.parseInt(campo2);
                int somma = num1 + num2;
	            // Creare e mostrare un popup con l'input
	            Alert alert = new Alert(AlertType.INFORMATION);
	            alert.setTitle("Sommatore");
	            alert.setHeaderText("La somma dei due numeri");
	            alert.setContentText("" + somma);
	            alert.showAndWait();
	        });
	      
	    //Creating a scene object 
	      Scene scene = new Scene(gridPane); 
	       
	      //Setting title to the Stage 
	      stage.setTitle("Addizionatore");
	      
	   // Caricare e applicare il file CSS
	        String css = this.getClass().getResource("application.css").toExternalForm();
	        scene.getStylesheets().add(css);
	         
	      //Adding scene to the stage 
	      stage.setScene(scene);
	      
	      //Displaying the conten
		
	      stage.show(); 
	   }      
	   public static void main(String args[]){ 
	      launch(args); 
	   } 

}
