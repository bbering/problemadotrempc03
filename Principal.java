/* ***************************************************************
* Autor............: Breno Bering Silva
* Matricula........: 202110863
* Inicio...........: 17/04/2023
* Ultima alteracao.: 
* Nome.............: Problema do Trem
* Funcao...........: Resolver o problema da região critica
*************************************************************** */
import javafx.scene.image.Image;

import control.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Gerando o FXML base
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/assets/background.fxml"));
        //Instanciando o controlador
        mainController control = new mainController();
        Parent root = loader.load();

        //Criando a cena e setando altura, largura, icone, propriedade resizable, icone da tela
        Scene scene = new Scene(root);
        primaryStage.setResizable(false);
        primaryStage.setMaxHeight(400);
        primaryStage.setMaxWidth(600);
        primaryStage.setTitle("Problema do Trem");
        primaryStage.getIcons().add(new Image("/assets/train.png"));
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}