module org.example.enciptacionraulyllera {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.enciptacionraulyllera to javafx.fxml;
    exports org.example.enciptacionraulyllera;
}