module com.example.winapplication {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.winapplication to javafx.fxml;
    exports com.example.winapplication;
}