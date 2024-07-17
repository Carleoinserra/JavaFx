package application;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PrimaFinestra extends Application {
	
	
	
	

	@Override
	public void start(Stage stage) throws Exception {

		//creating label email 
	      Text text1 = new Text("Hello world"); 
	      
	      
	      Text text2 = new Text("Benvenuti al corso");
	      
	      
	    //Creating a Grid Pane 
	      GridPane gridPane = new GridPane(); 
	      
	    //Setting the Grid alignment 
	      gridPane.setAlignment(Pos.CENTER); 
	      
	      gridPane.add(text1, 0, 0);
	      gridPane.add(text2, 0, 1);
	      
	    //Creating a scene object 
	      Scene scene = new Scene(gridPane); 
	       
	    //Setting title to the Stage 
	      stage.setTitle("Prima finestra");
	      
	      
	      //Setting size for the pane 
	      gridPane.setMinSize(400, 200); 
	      
	   // Caricare e applicare il file CSS
	        String css = this.getClass().getResource("application.css").toExternalForm();
	        scene.getStylesheets().add(css);
	      
	    //Adding scene to the stage 
	      stage.setScene(scene);
	      
	      //Displaying the conten
		
	      stage.show(); 
	      
		
	}
	public static void main(String[] args) {
		launch(args);
	}
}
	
	


