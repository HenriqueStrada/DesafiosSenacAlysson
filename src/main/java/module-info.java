module com.senac.desafiosjava {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.senac.desafiosjava to javafx.fxml;
    exports com.senac.desafiosjava;
}