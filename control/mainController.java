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

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import threads.*;

public class mainController implements Initializable {

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

    private ThreadFirstTrain threadTrain1;

    private ThreadSecondTrain threadTrain2;

    // Botao que inicia ambas as threads

    public void setTrainImg(String directory, int imgNum) {
        if (imgNum == 1) {
            train1.setImage(new Image(directory));
        }
        if (imgNum == 2) {
            train2.setImage(new Image(directory));
        }
    }

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
    }

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
        threadTrain1.run(1);
        threadTrain2.run(1);
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
        threadTrain1.run(2);
        threadTrain2.run(2);
    }

    @FXML
    public void display03(ActionEvent event) {
        option01.setVisible(false);
        option02.setVisible(false);
        option03.setVisible(false);
        option04.setVisible(false);
        train1.setVisible(true);
        train2.setVisible(false);
        train3.setVisible(true);
        train4.setVisible(false);
        threadTrain1.run(3);
        threadTrain2.run(3);
    }

    @FXML
    public void display04(ActionEvent event) {
        option01.setVisible(false);
        option02.setVisible(false);
        option03.setVisible(false);
        option04.setVisible(false);
        train1.setVisible(false);
        train2.setVisible(true);
        train3.setVisible(false);
        train4.setVisible(true);
        threadTrain1.run(4);
        threadTrain2.run(4);
    }
}
