/* ***************************************************************
* Autor............: Breno Bering Silva
* Matricula........: 202110863
* Inicio...........: 17/04/2023
* Ultima alteracao.: 
* Nome.............: Problema do Trem
* Funcao...........: Controlar a cena e implementar metodos
*************************************************************** */
package control;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import threads.*;

public class mainController implements Initializable {

  // Todos os FXML que serao utilizados

  // Botoes especificos de acelerar e frear os trens

  @FXML
  private Button lessRed;

  @FXML
  private Button plusRed;

  @FXML
  private Button plusBlue;

  @FXML
  private Button lessBlue;

  @FXML
  private Button option01;

  @FXML
  private Button option02;

  @FXML
  private Button option03;

  @FXML
  private Button option04;

  @FXML
  private ImageView train1;

  @FXML
  private ImageView train2;

  @FXML
  private ImageView train3;

  @FXML
  private ImageView train4;

  @FXML
  private ComboBox solutionsBox;

  // Instanciando ambas as threads (que sao os trens)

  private ThreadFirstTrain threadTrain1;

  private ThreadSecondTrain threadTrain2;

  // Variavel de travamento

  private int LV1 = 0;

  private int LV2 = 0;

  // Variavel de escolha de display

  private int op;

  // Variaveis de velocidade dos trens que serao alteradas em tempo real

  private long speedRed = 10;

  private long speedBlue = 10;

  // Variaveis usadas na estrita alternancia

  private int turn01 = 1;

  private int turn02 = 0;

  // Inicializando os recursos necessarios para serem utilizados no controller

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    this.threadTrain1 = new ThreadFirstTrain();
    threadTrain1.setController(this);
    this.threadTrain2 = new ThreadSecondTrain();
    threadTrain2.setController(this);
    train1.setVisible(false);
    train2.setVisible(false);
    train3.setVisible(false);
    train4.setVisible(false);
    lessRed.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        speedRed = speedRed + 1;
      }
    });
    plusRed.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        if (speedRed == 1)
          System.out.println("Velocidade maxima atingida!!!");
        else {
          speedRed = speedRed - 1;
        }
      }
    });
    lessBlue.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        speedBlue = speedBlue + 1;
      }
    });
    plusBlue.setOnAction(new EventHandler<ActionEvent>() {
      @Override
      public void handle(ActionEvent event) {
        if (speedBlue == 1)
          System.out.println("Velocidade maxima atingida!!!");
        else {
          speedBlue = speedBlue - 1;
        }
      }
    });
    solutionsBox.getItems().addAll("Variavel de Travamento", "Estrita alternancia");
  }

  // Metodos que retornam as imagens dos trens, utilizado nas threads

  public ImageView getTrain1() {
    return train1;
  }

  public ImageView getTrain2() {
    return train2;
  }

  public ImageView getTrain3() {
    return train3;
  }

  public ImageView getTrain4() {
    return train4;
  }

  // Botoes que configuram os displays iniciais (as 4 possibilidades)

  @FXML
  public void display01(ActionEvent event) {
    option01.setVisible(false);
    option02.setVisible(false);
    option03.setVisible(false);
    option04.setVisible(false);
    train1.setVisible(true);
    train2.setVisible(true);
    train3.setVisible(false);
    train4.setVisible(false);
    train2.setImage(new Image("/assets/blueTrain.png"));
    threadTrain1.start();
    threadTrain2.start();
    this.op = 1;
  }

  @FXML
  public void display02(ActionEvent event) {
    option01.setVisible(false);
    option02.setVisible(false);
    option03.setVisible(false);
    option04.setVisible(false);
    train1.setVisible(false);
    train2.setVisible(false);
    train3.setVisible(true);
    train4.setVisible(true);
    train4.setImage(new Image("/assets/blueTrain02.png"));
    threadTrain1.start();
    threadTrain2.start();
    this.op = 2;
  }

  @FXML
  public void display03(ActionEvent event) {
    option01.setVisible(false);
    option02.setVisible(false);
    option03.setVisible(false);
    option04.setVisible(false);
    train1.setVisible(true);
    train2.setVisible(false);
    train3.setVisible(false);
    train4.setVisible(true);
    train4.setImage(new Image("/assets/blueTrain02.png"));
    threadTrain1.start();
    threadTrain2.start();
    this.op = 3;
  }

  @FXML
  public void display04(ActionEvent event) {
    option01.setVisible(false);
    option02.setVisible(false);
    option03.setVisible(false);
    option04.setVisible(false);
    train1.setVisible(false);
    train2.setVisible(true);
    train3.setVisible(true);
    train4.setVisible(false);
    train3.setImage(new Image("/assets/train02.png"));
    train2.setImage(new Image("/assets/blueTrain.png"));
    threadTrain1.start();
    threadTrain2.start();
    this.op = 4;
  }

  // Metodo para indicar onde se encontra a zona critica

  public void enterFirstBridge(String train) throws InterruptedException {
  }

  public void enterSecondBridge(String train) throws InterruptedException {
  }

  // Metodo que move o trem na direcao X e configura a velocidade X

  public void moveX(String train, int pos, int starterPoint, int side) {
    if (train == "red" && side == 1) {
      for (int i = starterPoint; i <= pos; i++) {
        int moveX = i;
        Platform.runLater(() -> train1.setX(moveX));
        try {
          threadTrain1.sleep(speedRed);
        } catch (InterruptedException e) {
        }
      }
    }
    if (train == "blue" && side == 1) {
      for (int i = starterPoint; i <= pos; i++) {
        int moveX = i;
        Platform.runLater(() -> train2.setX(moveX));
        try {
          threadTrain2.sleep(speedBlue);
        } catch (InterruptedException e) {
        }
      }
    }
    if (train == "red" && side == 2) {
      for (int i = pos; i <= starterPoint; i++) {
        int moveX = -i;
        Platform.runLater(() -> train3.setX(moveX));
        try {
          threadTrain1.sleep(speedRed);
        } catch (InterruptedException e) {
        }
      }
    }
    if (train == "blue" && side == 2) {
      for (int i = pos; i <= starterPoint; i++) {
        int moveX = -i;
        Platform.runLater(() -> train4.setX(moveX));
        try {
          threadTrain2.sleep(speedBlue);
        } catch (InterruptedException e) {
        }
      }
    }
  }

  // Metodo que move o trem na direcao Y e configura a velocidade Y

  public void moveY(String train, int pos, int starterPoint, String direc, int zone) {
    if (direc == "down" && zone == 1) {
      for (int i = starterPoint; i <= pos; i++) {
        int moveY = i;
        if (train == "red")
          Platform.runLater(() -> train1.setY(moveY));
        if (train == "blue")
          Platform.runLater(() -> train2.setY(moveY));
        try {
          if (train == "red")
            threadTrain1.sleep(speedRed);
        } catch (InterruptedException e) {
        }
        if (train == "blue")
          try {
            threadTrain2.sleep(speedBlue);
          } catch (InterruptedException e) {
          }
      }
    }
    if (direc == "down" && zone == 2) {
      for (int i = starterPoint; i <= pos; i++) {
        int moveY = i;
        if (train == "red")
          Platform.runLater(() -> train3.setY(moveY));
        if (train == "blue")
          Platform.runLater(() -> train4.setY(moveY));
        try {
          if (train == "red")
            threadTrain1.sleep(speedRed);
        } catch (InterruptedException e) {
        }
        if (train == "blue")
          try {
            threadTrain2.sleep(speedBlue);
          } catch (InterruptedException e) {
          }
      }
    }
    if (direc == "up" && pos > 0 && zone == 1) {
      for (int i = pos; i >= starterPoint; i--) {
        int moveY = i;
        if (train == "red")
          Platform.runLater(() -> train1.setY(moveY));
        if (train == "blue")
          Platform.runLater(() -> train2.setY(moveY));
        if (train == "red")
          try {
            threadTrain1.sleep(10);
          } catch (InterruptedException e) {
          }
        try {
          if (train == "blue")
            threadTrain2.sleep(10);
        } catch (InterruptedException e) {
        }
      }
    } else if (direc == "up" && pos < 0 && zone == 1) {
      for (int i = starterPoint; i >= pos; i--) {
        int moveY = i;
        if (train == "red")
          Platform.runLater(() -> train1.setY(moveY));
        if (train == "blue")
          Platform.runLater(() -> train2.setY(moveY));
        if (train == "red")
          try {
            threadTrain1.sleep(10);
          } catch (InterruptedException e) {
          }
        try {
          if (train == "blue")
            threadTrain2.sleep(10);
        } catch (InterruptedException e) {
        }
      }
    }
    if (direc == "up" && pos > 0 && zone == 2) {
      for (int i = pos; i >= starterPoint; i--) {
        int moveY = i;
        if (train == "red")
          Platform.runLater(() -> train3.setY(moveY));
        if (train == "blue")
          Platform.runLater(() -> train4.setY(moveY));
        if (train == "red")
          try {
            threadTrain1.sleep(10);
          } catch (InterruptedException e) {
          }
        try {
          if (train == "blue")
            threadTrain2.sleep(10);
        } catch (InterruptedException e) {
        }
      }
    } else if (direc == "up" && pos < 0 && zone == 2) {
      for (int i = starterPoint; i >= pos; i--) {
        int moveY = i;
        if (train == "red")
          Platform.runLater(() -> train3.setY(moveY));
        if (train == "blue")
          Platform.runLater(() -> train4.setY(moveY));
        if (train == "red")
          try {
            threadTrain1.sleep(10);
          } catch (InterruptedException e) {
          }
        try {
          if (train == "blue")
            threadTrain2.sleep(10);
        } catch (InterruptedException e) {
        }
      }
    }
  }

  // Metodo que rotaciona os trens em tempo real para fazer curvas mais suaves no
  // trilho

  public void rotate(String train, int rotation, int direc) {
    if (train == "red" && direc == 1) {
      Platform.runLater(() -> train1.setRotate(rotation));
    }
    if (train == "blue" && direc == 1) {
      Platform.runLater(() -> train2.setRotate(rotation));
    }
    if (train == "red" && direc == 2) {
      Platform.runLater(() -> train3.setRotate(rotation));
    }
    if (train == "blue" && direc == 2) {
      Platform.runLater(() -> train4.setRotate(rotation));
    }
  }

  // Getter do display de trens (as 4 possibilidades)

  public int getOp() {
    return op;
  }

  // Getters e Setters para as variaveis de travamento

  public int getLV1() {
    return LV1;
  }

  public int getLV2() {
    return LV2;
  }

  public void setLV1(int lV1) {
    LV1 = lV1;
  }

  public void setLV2(int lV2) {
    LV2 = lV2;
  }

  // Getters utilizados para a estrita alternancia

  public int getTurn01() {
    return turn01;
  }

  public int getTurn02() {
    return turn02;
  }

  // Metodos de estrita alternancia

  public void alternateFrist() {
    while (getTurn01() != 0) {
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        System.out.println("Erro!!!!");
      }
    }
  }

  public void alternateSecond() {
    while (getTurn02() != 1) {
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        System.out.println("Erro!!!!");
      }
    }
  }

  public String selectedSolution() {
    return solutionsBox.getSelectionModel().getSelectedItem().toString();
  }
}