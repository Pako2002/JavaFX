package com.example.demo.SecondVideo;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;

import java.io.IOException;

public class DrawingStuff extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        //Parent root = FXMLLoader.load(getClass().getResource("SecondVideo/DrawingStuff.java"));
        Group root= new Group();
        Scene scene= new Scene(root,600,600, Color.LIGHTSKYBLUE);
        Stage stage= new Stage();

        Text text= new Text();
        text.setText("Pisello");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.LIMEGREEN);

        Line line= new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        line.setOpacity(0.5);   //makes the object transparent
        line.setRotate(45);

        Rectangle rectangle= new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLUE);
        rectangle.setStrokeWidth(5);
        rectangle.setStroke(Color.BLACK);
        //anche i Rectangle object hanno svariate funzioni come opacity e rotate

        Polygon triangle= new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,    //primo punto
                300.0,300.0,    //secondo punto
                200.0,300.0     //terzo punto
                );
        triangle.setFill(Color.YELLOW);

        Circle circle= new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        ImageView imageView= new ImageView(getClass().getResource("/com/example/demo/Images/sponge.png").toExternalForm());
        imageView.setX(400);
        imageView.setY(400);

        root.getChildren().add(imageView);
        root.getChildren().add(circle);
        root.getChildren().add(triangle);
        root.getChildren().add(rectangle);
        root.getChildren().add(text);
        root.getChildren().add(line);
        stage.setScene(scene);
        stage.show();
    }
}
