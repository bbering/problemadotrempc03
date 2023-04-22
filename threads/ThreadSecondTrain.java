package threads;

import control.mainController;

public class ThreadSecondTrain extends Thread {
  mainController mainController = new mainController();

  public void setController(mainController controller) {
    this.mainController = controller;
  }

  // Iniciando a thread e gerando os movimentos padrão do trem
  // A thread de trem apenas verifica qual a solucao foi selecionada e gerencia o
  // movimento dos trens

  public void run() {
    while (true) {
      if (mainController.selectedSolution() == "Variavel de Travamento") {
        switch (mainController.getOp()) {
          case 1: {
            mainController.moveX("blue", 100, 0, 1);
            mainController.rotate("blue", -45, 1);
            mainController.moveY("blue", 0, -30, "up", 1);
            // Zona Critica 1
            while (mainController.getLV1() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterFirstBridge("blue");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV1(1);
            mainController.rotate("blue", 0, 1);
            mainController.moveY("blue", -52, -30, "up", 1);
            mainController.moveX("blue", 214, 111, 1);
            mainController.setLV1(0);
            mainController.rotate("blue", -45, 1);
            mainController.moveY("blue", -95, -52, "up", 1);
            mainController.rotate("blue", 0, 1);
            mainController.moveX("blue", 350, 216, 1);
            mainController.rotate("blue", 45, 1);
            // Zona Critica 2
            while (mainController.getLV2() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterSecondBridge("blue");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV2(1);
            mainController.moveY("blue", -52, -95, "down", 1);
            mainController.rotate("blue", 0, 1);
            mainController.moveX("blue", 470, 350, 1);
            mainController.setLV2(0);
            mainController.rotate("blue", 45, 1);
            mainController.moveY("blue", 0, -30, "down", 1);
            mainController.rotate("blue", 0, 1);
            mainController.moveX("blue", 560, 470, 1);
            break;
          }
          case 2: {
            mainController.moveX("blue", 0, 100, 2);
            mainController.rotate("blue", 45, 2);
            mainController.moveY("blue", -30, 0, "up", 2);
            // Zona Critica 1
            while (mainController.getLV1() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterFirstBridge("blue");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV1(1);
            mainController.rotate("blue", 0, 2);
            mainController.moveY("blue", -52, -30, "up", 2);
            mainController.moveX("blue", 111, 214, 2);
            mainController.setLV1(0);
            mainController.rotate("blue", 45, 2);
            mainController.moveY("blue", -95, -52, "up", 2);
            mainController.rotate("blue", 0, 2);
            mainController.moveX("blue", 216, 350, 2);
            mainController.rotate("blue", -45, 2);
            // Zona Critica 2
            while (mainController.getLV2() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterSecondBridge("blue");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV2(1);
            mainController.moveY("blue", -52, -95, "down", 2);
            mainController.rotate("blue", 0, 2);
            mainController.moveX("blue", 350, 470, 2);
            mainController.setLV2(0);
            mainController.rotate("blue", -45, 2);
            mainController.moveY("blue", 0, -30, "down", 2);
            mainController.rotate("blue", 0, 2);
            mainController.moveX("blue", 470, 560, 2);
            break;
          }
          case 3: {
            mainController.moveX("blue", 0, 100, 2);
            mainController.rotate("blue", 45, 2);
            mainController.moveY("blue", -30, 0, "up", 2);
            // Zona Critica 1
            while (mainController.getLV2() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterSecondBridge("blue");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV2(1);
            mainController.rotate("blue", 0, 2);
            mainController.moveY("blue", -52, -30, "up", 2);
            mainController.moveX("blue", 111, 214, 2);
            mainController.setLV2(0);
            mainController.rotate("blue", -45, 2);
            mainController.moveY("blue", 0, -52, "down", 2);
            mainController.rotate("blue", 0, 2);
            mainController.moveX("blue", 216, 350, 2);
            mainController.rotate("blue", 45, 2);
            // Zona Critica 2
            while (mainController.getLV1() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterFirstBridge("blue");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV1(1);
            mainController.moveY("blue", -52, 0, "up", 2);
            mainController.rotate("blue", 0, 2);
            mainController.moveX("blue", 350, 470, 2);
            mainController.setLV1(0);
            mainController.rotate("blue", -45, 2);
            mainController.moveY("blue", 0, -30, "down", 2);
            mainController.rotate("blue", 0, 2);
            mainController.moveX("blue", 470, 560, 2);
            break;
          }
          case 4: {
            mainController.moveX("blue", 100, 0, 1);
            mainController.rotate("blue", -45, 1);
            mainController.moveY("blue", 0, -30, "up", 1);
            // Zona Critica 1
            while (mainController.getLV1() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterFirstBridge("blue");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV1(1);
            mainController.rotate("blue", 0, 1);
            mainController.moveY("blue", -52, -30, "up", 1);
            mainController.moveX("blue", 214, 111, 1);
            mainController.setLV1(0);
            mainController.rotate("blue", -45, 1);
            mainController.moveY("blue", -95, -52, "up", 1);
            mainController.rotate("blue", 0, 1);
            mainController.moveX("blue", 350, 216, 1);
            mainController.rotate("blue", 45, 1);
            // Zona Critica 2
            while (mainController.getLV2() == 1) {
              try {
                Thread.sleep(1);
                mainController.enterSecondBridge("blue");
              } catch (InterruptedException e) {
              }
            }
            mainController.setLV2(1);
            mainController.moveY("blue", -52, -95, "down", 1);
            mainController.rotate("blue", 0, 1);
            mainController.moveX("blue", 470, 350, 1);
            mainController.setLV2(0);
            mainController.rotate("blue", 45, 1);
            mainController.moveY("blue", 0, -30, "down", 1);
            mainController.rotate("blue", 0, 1);
            mainController.moveX("blue", 560, 470, 1);
            break;
          }
        }
      } // Fim switch 01
      if (mainController.selectedSolution() == "Estrita alternancia") {
        switch (mainController.getOp()) {
          case 1: {
            mainController.moveX("blue", 100, 0, 1);
            mainController.rotate("blue", -45, 1);
            mainController.moveY("blue", 0, -30, "up", 1);
            // Zona Critica 1
            while (mainController.getTurn01() != 1) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.rotate("blue", 0, 1);
            mainController.moveY("blue", -52, -30, "up", 1);
            mainController.moveX("blue", 214, 111, 1);
            mainController.setTurn01(0);
            mainController.rotate("blue", -45, 1);
            mainController.moveY("blue", -95, -52, "up", 1);
            mainController.rotate("blue", 0, 1);
            mainController.moveX("blue", 350, 216, 1);
            mainController.rotate("blue", 45, 1);
            // Zona Critica 2
            while (mainController.getTurn01() != 1) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.moveY("blue", -52, -95, "down", 1);
            mainController.rotate("blue", 0, 1);
            mainController.moveX("blue", 470, 350, 1);
            mainController.setTurn02(0);
            mainController.rotate("blue", 45, 1);
            mainController.moveY("blue", 0, -30, "down", 1);
            mainController.rotate("blue", 0, 1);
            mainController.moveX("blue", 560, 470, 1);
            break;
          }
          case 2: {
            mainController.moveX("blue", 0, 100, 2);
            mainController.rotate("blue", 45, 2);
            mainController.moveY("blue", -30, 0, "up", 2);
            // Zona Critica 1
            while (mainController.getTurn02() != 1) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.rotate("blue", 0, 2);
            mainController.moveY("blue", -52, -30, "up", 2);
            mainController.moveX("blue", 111, 214, 2);
            mainController.setTurn02(0);
            mainController.rotate("blue", 45, 2);
            mainController.moveY("blue", -95, -52, "up", 2);
            mainController.rotate("blue", 0, 2);
            mainController.moveX("blue", 216, 350, 2);
            mainController.rotate("blue", -45, 2);
            // Zona Critica 2
            while (mainController.getTurn01() != 1) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.moveY("blue", -52, -95, "down", 2);
            mainController.rotate("blue", 0, 2);
            mainController.moveX("blue", 350, 470, 2);
            mainController.setTurn01(0);
            mainController.rotate("blue", -45, 2);
            mainController.moveY("blue", 0, -30, "down", 2);
            mainController.rotate("blue", 0, 2);
            mainController.moveX("blue", 470, 560, 2);
            break;
          }
          case 3: {
            mainController.moveX("blue", 0, 100, 2);
            mainController.rotate("blue", 45, 2);
            mainController.moveY("blue", -30, 0, "up", 2);
            // Zona Critica 1
            while (mainController.getTurn02() != 1) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.rotate("blue", 0, 2);
            mainController.moveY("blue", -52, -30, "up", 2);
            mainController.moveX("blue", 111, 214, 2);
            mainController.setTurn02(0);
            mainController.rotate("blue", -45, 2);
            mainController.moveY("blue", 0, -52, "down", 2);
            mainController.rotate("blue", 0, 2);
            mainController.moveX("blue", 216, 350, 2);
            mainController.rotate("blue", 45, 2);
            // Zona Critica 2
            while (mainController.getTurn01() != 1) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.moveY("blue", -52, 0, "up", 2);
            mainController.rotate("blue", 0, 2);
            mainController.moveX("blue", 350, 470, 2);
            mainController.setTurn01(0);
            mainController.rotate("blue", -45, 2);
            mainController.moveY("blue", 0, -30, "down", 2);
            mainController.rotate("blue", 0, 2);
            mainController.moveX("blue", 470, 560, 2);
            break;
          }
          case 4: {
            mainController.setTurn01(1);
            mainController.moveX("blue", 100, 0, 1);
            mainController.rotate("blue", -45, 1);
            mainController.moveY("blue", 0, -30, "up", 1);
            // Zona Critica 1
            while (mainController.getTurn01() != 1) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.rotate("blue", 0, 1);
            mainController.moveY("blue", -52, -30, "up", 1);
            mainController.moveX("blue", 214, 111, 1);
            mainController.setTurn01(0);
            mainController.rotate("blue", -45, 1);
            mainController.moveY("blue", -95, -52, "up", 1);
            mainController.rotate("blue", 0, 1);
            mainController.moveX("blue", 350, 216, 1);
            mainController.rotate("blue", 45, 1);
            // Zona Critica 2
            while (mainController.getTurn02() != 1) {
              try {
                Thread.sleep(1);
              } catch (InterruptedException e) {
                System.out.println("Erro!!!!");
              }
            }
            mainController.moveY("blue", -52, -95, "down", 1);
            mainController.rotate("blue", 0, 1);
            mainController.moveX("blue", 470, 350, 1);
            mainController.setTurn02(0);
            mainController.rotate("blue", 45, 1);
            mainController.moveY("blue", 0, -30, "down", 1);
            mainController.rotate("blue", 0, 1);
            mainController.moveX("blue", 560, 470, 1);
            break;
          }
        }
      }
    }
  }
}
