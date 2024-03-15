module org.example.groupproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.groupproject to javafx.fxml;
    exports org.example.groupproject;
}