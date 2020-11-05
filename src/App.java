import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.stage.Stage;

public class App extends Application {



    //This code runs before the start method runs
    @Override
    public void init() throws Exception {
        super.init();

    }


    //Every window in the GUI is called a stage
    //This method will start when the application runs
    @Override
    public void start(Stage stage) throws Exception {
        Parent parent = FXMLLoader.load(getClass().getResource("resources/home.fxml"));
        Scene scene = new Scene(parent);//Handling the mouse clicked event(on box)

        stage.setScene(scene);
        stage.show();
    }
    
}