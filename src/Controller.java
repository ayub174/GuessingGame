import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller{

    @FXML
    TextField enterNumberId = new TextField();
    @FXML
    Label resultLabel = new Label();
    @FXML
    Label guessesLabel = new Label();

    int number = (int) (Math.random()*100+1);
    int count = 0;

    Alert a = new Alert(Alert.AlertType.NONE);

    public void guessEvent(ActionEvent actionEvent) {
        String fieldText = enterNumberId.getText();
        int value = Integer.parseInt(fieldText);

            if(value == number)
            {
                resultLabel.setText("Yippiie!! You won the game :)");
            } else if(value > number) {
                resultLabel.setText("Try a lower number");
            } else {
                resultLabel.setText("Try a higher number");
            }

            count++;
            guessesLabel.setText(Integer.toString(count));
   }

    public void giveUpEvent(ActionEvent actionEvent) {

    }
}