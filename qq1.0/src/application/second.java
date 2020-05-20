package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class second {
	
	Stage stage=new Stage();
	
	public void start(Stage primaryStage) {
		try {
			
			Parent root = FXMLLoader.load(getClass().getResource("config.fxml"));
			Scene scene = new Scene(root,590,405);
			scene.getStylesheets().add(getClass().getResource("./application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setResizable(false);//设置不能窗口改变大小
			primaryStage.setTitle("QQ");//设置标题

			primaryStage.show();


			} catch(Exception e) {
			e.printStackTrace();
			}
		
	}

	
	public void  showWindow() throws Exception {
	start(stage);

}
}
