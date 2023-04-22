package threads;

import control.mainController;

public class ThreadFirstTrain extends Thread {
  mainController mainController = new mainController();

  public void setController(mainController controller) {
    this.mainController = controller;
  }

  // Iniciando a thread e gerando os movimentos padrão do trem

  public void run() {
    while (true) {
      if (mainController.selectedSolution() == "Variavel de Travamento")
        switch (mainController.getOp()) {
          case 1: {
            mainController.moveX("red", 100, 0, 1);
            mainController.rotate("red", 45, 1);
            mainController.moveY("red", 30, 0, "down", 1);
            while (mainController.getLV1() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterFirstBridge("red");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV1(1);
            mainController.rotate("red", 0, 1);
            mainController.moveY("red", 52, 30, "down", 1);
            mainController.moveX("red", 216, 111, 1);
            mainController.setLV1(0);
            mainController.rotate("red", 45, 1);
            mainController.moveY("red", 95, 52, "down", 1);
            mainController.rotate("red", 0, 1);
            mainController.moveX("red", 350, 216, 1);
            mainController.rotate("red", -45, 1);
            // Zona Critica 2
            while (mainController.getLV2() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterSecondBridge("red");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV2(1);
            mainController.moveY("red", 95, 52, "up", 1);
            mainController.rotate("red", 0, 1);
            mainController.moveX("red", 470, 350, 1);
            mainController.setLV2(0);
            mainController.rotate("red", -45, 1);
            mainController.moveY("red", 30, 0, "up", 1);
            mainController.rotate("red", 0, 1);
            mainController.moveX("red", 560, 470, 1);
            break;
          }
          case 2: {
            mainController.moveX("red", 0, 100, 2);
            mainController.rotate("red", -45, 2);
            mainController.moveY("red", 30, 0, "down", 2);
            // Zona Critica 1
            while (mainController.getLV1() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterFirstBridge("red");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV1(1);
            mainController.rotate("red", 0, 2);
            mainController.moveY("red", 52, 30, "down", 2);
            mainController.moveX("red", 111, 216, 2);
            mainController.setLV1(0);
            mainController.rotate("red", -45, 2);
            mainController.moveY("red", 95, 52, "down", 2);
            mainController.rotate("red", 0, 2);
            mainController.moveX("red", 216, 350, 2);
            mainController.rotate("red", 45, 2);
            // Zona Critica 2
            while (mainController.getLV2() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterSecondBridge("red");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV2(1);
            mainController.moveY("red", 95, 52, "up", 2);
            mainController.rotate("red", 0, 2);
            mainController.moveX("red", 350, 470, 2);
            mainController.setLV2(0);
            mainController.rotate("red", 45, 2);
            mainController.moveY("red", 30, 0, "up", 2);
            mainController.rotate("red", 0, 2);
            mainController.moveX("red", 470, 560, 2);
            break;
          }
          case 3: {
            mainController.moveX("red", 100, 0, 1);
            mainController.rotate("red", 45, 1);
            mainController.moveY("red", 30, 0, "down", 1);
            // Zona Critica 1
            while (mainController.getLV1() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterFirstBridge("red");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV1(1);
            mainController.rotate("red", 0, 1);
            mainController.moveY("red", 52, 30, "down", 1);
            mainController.moveX("red", 216, 111, 1);
            mainController.setLV1(0);
            mainController.rotate("red", -45, 1);
            mainController.moveY("red", -2, 52, "up", 1);
            mainController.rotate("red", 0, 1);
            mainController.moveX("red", 350, 216, 1);
            mainController.rotate("red", 45, 1);
            // Zona Critica 2
            while (mainController.getLV2() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterSecondBridge("red");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV2(1);
            mainController.moveY("red", 44, -2, "down", 1);
            mainController.rotate("red", 0, 1);
            mainController.moveX("red", 470, 350, 1);
            mainController.setLV2(0);
            mainController.rotate("red", -45, 1);
            mainController.moveY("red", 30, 0, "up", 1);
            mainController.rotate("red", 0, 1);
            mainController.moveX("red", 560, 470, 1);
            break;
          }
          case 4: {
            mainController.moveX("red", 0, 100, 2);
            mainController.rotate("red", -45, 2);
            mainController.moveY("red", 30, 0, "down", 2);
            // Zona Critica 1
            while (mainController.getLV2() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterSecondBridge("red");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV2(1);
            mainController.rotate("red", 0, 2);
            mainController.moveY("red", 52, 30, "down", 2);
            mainController.moveX("red", 111, 216, 2);
            mainController.setLV2(0);
            mainController.rotate("red", -45, 2);
            mainController.moveY("red", 95, 52, "down", 2);
            mainController.rotate("red", 0, 2);
            mainController.moveX("red", 216, 350, 2);
            mainController.rotate("red", 45, 2);
            // Zona Critica 2
            while (mainController.getLV1() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterFirstBridge("red");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV1(1);
            mainController.moveY("red", 95, 52, "up", 2);
            mainController.rotate("red", 0, 2);
            mainController.moveX("red", 350, 470, 2);
            mainController.setLV1(0);
            mainController.rotate("red", 45, 2);
            mainController.moveY("red", 30, 0, "up", 2);
            mainController.rotate("red", 0, 2);
            mainController.moveX("red", 470, 560, 2);
            break;
          }
        } // Fim switch 01
      if (mainController.selectedSolution() == "Estrita alternancia") {
        switch (mainController.getOp()) {
          case 1: {
            mainController.moveX("red", 100, 0, 1);
            mainController.rotate("red", 45, 1);
            mainController.moveY("red", 30, 0, "down", 1);
            while (mainController.getTurn01() != 0) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.rotate("red", 0, 1);
            mainController.moveY("red", 52, 30, "down", 1);
            mainController.moveX("red", 216, 111, 1);
            mainController.setTurn01(1);
            mainController.rotate("red", 45, 1);
            mainController.moveY("red", 95, 52, "down", 1);
            mainController.rotate("red", 0, 1);
            mainController.moveX("red", 350, 216, 1);
            mainController.rotate("red", -45, 1);
            // Zona Critica 2
            while (mainController.getTurn02() != 0) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.moveY("red", 95, 52, "up", 1);
            mainController.rotate("red", 0, 1);
            mainController.moveX("red", 470, 350, 1);
            mainController.setTurn02(1);
            mainController.rotate("red", -45, 1);
            mainController.moveY("red", 30, 0, "up", 1);
            mainController.rotate("red", 0, 1);
            mainController.moveX("red", 560, 470, 1);
            break;
          }
          case 2: {
            mainController.moveX("red", 0, 100, 2);
            mainController.rotate("red", -45, 2);
            mainController.moveY("red", 30, 0, "down", 2);
            // Zona Critica 1
            while (mainController.getTurn02() != 0) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.rotate("red", 0, 2);
            mainController.moveY("red", 52, 30, "down", 2);
            mainController.moveX("red", 111, 216, 2);
            mainController.setTurn02(1);
            mainController.rotate("red", -45, 2);
            mainController.moveY("red", 95, 52, "down", 2);
            mainController.rotate("red", 0, 2);
            mainController.moveX("red", 216, 350, 2);
            mainController.rotate("red", 45, 2);
            // Zona Critica 2
            while (mainController.getTurn01() != 0) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.moveY("red", 95, 52, "up", 2);
            mainController.rotate("red", 0, 2);
            mainController.moveX("red", 350, 470, 2);
            mainController.setTurn01(1);
            mainController.rotate("red", 45, 2);
            mainController.moveY("red", 30, 0, "up", 2);
            mainController.rotate("red", 0, 2);
            mainController.moveX("red", 470, 560, 2);
            break;
          }
          case 3: {
            mainController.setTurn02(1);
            mainController.moveX("red", 100, 0, 1);
            mainController.rotate("red", 45, 1);
            mainController.moveY("red", 30, 0, "down", 1);
            // Zona Critica 1
            while (mainController.getTurn01() != 0) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.rotate("red", 0, 1);
            mainController.moveY("red", 52, 30, "down", 1);
            mainController.moveX("red", 216, 111, 1);
            mainController.setTurn01(1);
            mainController.rotate("red", -45, 1);
            mainController.moveY("red", -2, 52, "up", 1);
            mainController.rotate("red", 0, 1);
            mainController.moveX("red", 350, 216, 1);
            mainController.rotate("red", 45, 1);
            // Zona Critica 2
            while (mainController.getTurn02() != 0) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.moveY("red", 44, -2, "down", 1);
            mainController.rotate("red", 0, 1);
            mainController.moveX("red", 470, 350, 1);
            mainController.setTurn02(1);
            mainController.rotate("red", -45, 1);
            mainController.moveY("red", 30, 0, "up", 1);
            mainController.rotate("red", 0, 1);
            mainController.moveX("red", 560, 470, 1);
            break;
          }
          case 4: {
            mainController.moveX("red", 0, 100, 2);
            mainController.rotate("red", -45, 2);
            mainController.moveY("red", 30, 0, "down", 2);
            // Zona Critica 1
            while (mainController.getTurn02() != 0) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.rotate("red", 0, 2);
            mainController.moveY("red", 52, 30, "down", 2);
            mainController.moveX("red", 111, 216, 2);
            mainController.setTurn02(1);
            mainController.rotate("red", -45, 2);
            mainController.moveY("red", 95, 52, "down", 2);
            mainController.rotate("red", 0, 2);
            mainController.moveX("red", 216, 350, 2);
            mainController.rotate("red", 45, 2);
            // Zona Critica 2
            while (mainController.getTurn01() != 0) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.moveY("red", 95, 52, "up", 2);
            mainController.rotate("red", 0, 2);
            mainController.moveX("red", 350, 470, 2);
            mainController.setTurn01(1);
            mainController.rotate("red", 45, 2);
            mainController.moveY("red", 30, 0, "up", 2);
            mainController.rotate("red", 0, 2);
            mainController.moveX("red", 470, 560, 2);
            break;
          }
        }
      }
    }
  }
}
