/* ***************************************************************
* Autor............: Breno Bering Silva
* Matricula........: 202110863
* Inicio...........: 17/04/2023
* Ultima alteracao.: 
* Nome.............: Problema do Trem
* Funcao...........: Controlar a cena e implementar metodos
*************************************************************** */
package control;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class mainController {

    @FXML
    private Button moveTrain1;

    @FXML
    private ImageView train1;

    @FXML
    private ImageView train2;

    //Metodo que move o trem 1
    public void mover() {
        TranslateTransition translate = new TranslateTransition();
        translate.setNode(train1);
        translate.setDuration(Duration.millis(1000));
        translate.setByX(100);
        translate.play();
    }

    //Botao que move o trem 1
    @FXML
    void moveTrain1(ActionEvent event) {
        mover();
    }
}
