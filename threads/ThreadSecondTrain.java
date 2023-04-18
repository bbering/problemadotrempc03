package threads;

import control.mainController;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class ThreadSecondTrain {
    mainController mainController = new mainController();
    // private int speed = 0;

    public void setController(mainController controller) {
        this.mainController = controller;
    }

    public void run(int pos) {
        if (pos == 1) {
            TranslateTransition translate = new TranslateTransition();
            mainController.setTrainImg("/assets/train.png", 1);
            translate.setNode(mainController.getTrain2());
            translate.setDuration(Duration.millis(1000));
            translate.setByX(65);
            translate.setByY(-14);
            translate.play();
        } else if (pos == 2) {
            TranslateTransition translate = new TranslateTransition();
            mainController.setTrainImg("/assets/train02.png", 1);
            translate.setNode(mainController.getTrain4());
            translate.setDuration(Duration.millis(1000));
            translate.setByX(-65);
            translate.setByY(-14);
            translate.play();
        }
        else if (pos == 3){
            TranslateTransition translate = new TranslateTransition();
            mainController.setTrainImg("/assets/train.png", 1);
            translate.setNode(mainController.getTrain3());
            translate.setDuration(Duration.millis(1000));
            translate.setByX(-65);
            translate.setByY(18);
            translate.play();
        }
        else if (pos == 4){
            TranslateTransition translate = new TranslateTransition();
            mainController.setTrainImg("/assets/train.png", 1);
            translate.setNode(mainController.getTrain4());
            translate.setDuration(Duration.millis(1000));
            translate.setByX(-65);
            translate.setByY(-14);
            translate.play();
        }
    }
}
