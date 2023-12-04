module kagemori.michiru {
    requires java.desktop;
    requires java.management;
    requires javafx.controls;
    requires javafx.fxml;

    opens kagemori.michiru to javafx.fxml;
    exports kagemori.michiru;
}
