module com.example.java_week_4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_week_4 to javafx.fxml;
    exports com.example.java_week_4;
}