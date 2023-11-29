module kagemori.michiru {
    requires javafx.controls;
    requires javafx.fxml;

    opens kagemori.michiru to javafx.fxml;
    exports kagemori.michiru;
}
