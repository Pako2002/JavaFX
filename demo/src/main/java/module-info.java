module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    exports com.example.demo.FirstVideo;
    opens com.example.demo.FirstVideo to javafx.fxml;
    exports com.example.demo.SecondVideo;
    opens com.example.demo.SecondVideo to javafx.fxml;
    exports com.example.demo.SceneBuilderUno;
    opens com.example.demo.SceneBuilderUno to javafx.fxml;
}