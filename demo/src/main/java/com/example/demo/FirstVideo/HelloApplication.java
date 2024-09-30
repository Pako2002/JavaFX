package com.example.demo.FirstVideo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);
        //String path= "/com/example/demo/Images/tod.png";
        //Image icon= new Image("/com/example/demo/Images/tod.png");
        //stage.getIcons().add(icon);
        ImageView iv = new ImageView(getClass().getResource("/com/example/demo/Images/tod.png").toExternalForm());
        stage.getIcons().add(iv.getImage());
        stage.setTitle("Stag Demo Program Woo Woo");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
        //stage.setX(50);
        //stage.setY(50);
        stage.setFullScreen(true);

        stage.setScene(scene);
        stage.show();
    }
}