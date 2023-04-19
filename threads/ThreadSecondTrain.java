package threads;

import control.mainController;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.util.Duration;

public class ThreadSecondTrain {
  mainController mainController = new mainController();

  public void setController(mainController controller) {
    this.mainController = controller;
  }

  // Iniciando a thread e gerando os movimentos padrão do trem

  public void run(int pos) {
    double time = 1500;
    if (pos == 1) {
      TranslateTransition translate01 = new TranslateTransition();
      mainController.setTrainImg("/assets/train.png", 1);
      translate01.setNode(mainController.getTrain2());
      translate01.setDuration(Duration.millis(time));
      translate01.setByX(65);
      translate01.setByY(-18);
      TranslateTransition translate02 = new TranslateTransition();
      translate02.setNode(mainController.getTrain2());
      translate02.setDuration(Duration.millis(time));
      translate02.setByX(35);
      translate02.setByY(-15);
      TranslateTransition translate03 = new TranslateTransition();
      translate03.setNode(mainController.getTrain2());
      translate03.setDuration(Duration.millis(time));
      translate03.setByX(50);
      translate03.setByY(1.5);
      TranslateTransition translate04 = new TranslateTransition();
      translate04.setNode(mainController.getTrain2());
      translate04.setDuration(Duration.millis(time));
      translate04.setByX(88);
      translate04.setByY(32);
      TranslateTransition translate05 = new TranslateTransition();
      translate05.setNode(mainController.getTrain2());
      translate05.setDuration(Duration.millis(time));
      translate05.setByX(60);
      translate05.setByY(0);
      TranslateTransition translate06 = new TranslateTransition();
      translate06.setNode(mainController.getTrain2());
      translate06.setDuration(Duration.millis(time));
      translate06.setByX(88);
      translate06.setByY(-25);
      TranslateTransition translate07 = new TranslateTransition();
      translate07.setNode(mainController.getTrain2());
      translate07.setDuration(Duration.millis(time));
      translate07.setByX(60);
      translate07.setByY(0);
      TranslateTransition translate08 = new TranslateTransition();
      translate08.setNode(mainController.getTrain2());
      translate08.setDuration(Duration.millis(time));
      translate08.setByX(110);
      translate08.setByY(30);
      SequentialTransition st = new SequentialTransition(translate01, translate02, translate03, translate04,
          translate05, translate06, translate07, translate08);
      st.play();
    } else if (pos == 2) {
      TranslateTransition translate01 = new TranslateTransition();
      mainController.setTrainImg("/assets/train.png", 1);
      translate01.setNode(mainController.getTrain4());
      translate01.setDuration(Duration.millis(time));
      translate01.setByX(-65);
      translate01.setByY(-18);
      TranslateTransition translate02 = new TranslateTransition();
      translate02.setNode(mainController.getTrain4());
      translate02.setDuration(Duration.millis(time));
      translate02.setByX(-35);
      translate02.setByY(-15);
      TranslateTransition translate03 = new TranslateTransition();
      translate03.setNode(mainController.getTrain4());
      translate03.setDuration(Duration.millis(time));
      translate03.setByX(-50);
      translate03.setByY(1.5);
      TranslateTransition translate04 = new TranslateTransition();
      translate04.setNode(mainController.getTrain4());
      translate04.setDuration(Duration.millis(time));
      translate04.setByX(-88);
      translate04.setByY(32);
      TranslateTransition translate05 = new TranslateTransition();
      translate05.setNode(mainController.getTrain4());
      translate05.setDuration(Duration.millis(time));
      translate05.setByX(-60);
      translate05.setByY(0);
      TranslateTransition translate06 = new TranslateTransition();
      translate06.setNode(mainController.getTrain4());
      translate06.setDuration(Duration.millis(time));
      translate06.setByX(-88);
      translate06.setByY(-25);
      TranslateTransition translate07 = new TranslateTransition();
      translate07.setNode(mainController.getTrain4());
      translate07.setDuration(Duration.millis(time));
      translate07.setByX(-60);
      translate07.setByY(0);
      TranslateTransition translate08 = new TranslateTransition();
      translate08.setNode(mainController.getTrain4());
      translate08.setDuration(Duration.millis(time));
      translate08.setByX(-115);
      translate08.setByY(25);
      SequentialTransition st = new SequentialTransition(translate01, translate02, translate03, translate04,
          translate05, translate06, translate07, translate08);
      st.play();
    } else if (pos == 3) {
      TranslateTransition translate01 = new TranslateTransition();
      mainController.setTrainImg("/assets/train.png", 1);
      translate01.setNode(mainController.getTrain3());
      translate01.setDuration(Duration.millis(time));
      translate01.setByX(-65);
      translate01.setByY(18);
      TranslateTransition translate02 = new TranslateTransition();
      translate02.setNode(mainController.getTrain3());
      translate02.setDuration(Duration.millis(time));
      translate02.setByX(-35);
      translate02.setByY(15);
      TranslateTransition translate03 = new TranslateTransition();
      translate03.setNode(mainController.getTrain3());
      translate03.setDuration(Duration.millis(time));
      translate03.setByX(-50);
      translate03.setByY(-1.5);
      TranslateTransition translate04 = new TranslateTransition();
      translate04.setNode(mainController.getTrain3());
      translate04.setDuration(Duration.millis(time));
      translate04.setByX(-88);
      translate04.setByY(-32);
      TranslateTransition translate05 = new TranslateTransition();
      translate05.setNode(mainController.getTrain3());
      translate05.setDuration(Duration.millis(time));
      translate05.setByX(-60);
      translate05.setByY(0);
      TranslateTransition translate06 = new TranslateTransition();
      translate06.setNode(mainController.getTrain3());
      translate06.setDuration(Duration.millis(time));
      translate06.setByX(-88);
      translate06.setByY(25);
      TranslateTransition translate07 = new TranslateTransition();
      translate07.setNode(mainController.getTrain3());
      translate07.setDuration(Duration.millis(time));
      translate07.setByX(-60);
      translate07.setByY(3);
      TranslateTransition translate08 = new TranslateTransition();
      translate08.setNode(mainController.getTrain3());
      translate08.setDuration(Duration.millis(time));
      translate08.setByX(-115);
      translate08.setByY(25);
      SequentialTransition st = new SequentialTransition(translate01, translate02, translate03, translate04,
          translate05, translate06, translate07, translate08);
      st.play();
    } else if (pos == 4) {
      TranslateTransition translate01 = new TranslateTransition();
      mainController.setTrainImg("/assets/train.png", 1);
      translate01.setNode(mainController.getTrain4());
      translate01.setDuration(Duration.millis(time));
      translate01.setByX(-65);
      translate01.setByY(-18);
      TranslateTransition translate02 = new TranslateTransition();
      translate02.setNode(mainController.getTrain4());
      translate02.setDuration(Duration.millis(time));
      translate02.setByX(-35);
      translate02.setByY(-15);
      TranslateTransition translate03 = new TranslateTransition();
      translate03.setNode(mainController.getTrain4());
      translate03.setDuration(Duration.millis(time));
      translate03.setByX(-50);
      translate03.setByY(1.5);
      TranslateTransition translate04 = new TranslateTransition();
      translate04.setNode(mainController.getTrain4());
      translate04.setDuration(Duration.millis(time));
      translate04.setByX(-88);
      translate04.setByY(32);
      TranslateTransition translate05 = new TranslateTransition();
      translate05.setNode(mainController.getTrain4());
      translate05.setDuration(Duration.millis(time));
      translate05.setByX(-60);
      translate05.setByY(0);
      TranslateTransition translate06 = new TranslateTransition();
      translate06.setNode(mainController.getTrain4());
      translate06.setDuration(Duration.millis(time));
      translate06.setByX(-88);
      translate06.setByY(-25);
      TranslateTransition translate07 = new TranslateTransition();
      translate07.setNode(mainController.getTrain4());
      translate07.setDuration(Duration.millis(time));
      translate07.setByX(-60);
      translate07.setByY(-3);
      TranslateTransition translate08 = new TranslateTransition();
      translate08.setNode(mainController.getTrain4());
      translate08.setDuration(Duration.millis(time));
      translate08.setByX(-115);
      translate08.setByY(-25);
      SequentialTransition st = new SequentialTransition(translate01, translate02, translate03, translate04,
          translate05, translate06, translate07, translate08);
      st.play();
    }
  }
}
