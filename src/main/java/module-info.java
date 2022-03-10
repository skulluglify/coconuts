module com.github.skulluglify.coconuts {

    requires org.jetbrains.annotations;
    requires javafx.controls;
    requires javafx.fxml;

    exports com.github.skulluglify.coconuts;
    exports com.github.skulluglify.coconuts.views;
    exports com.github.skulluglify.coconuts.enums;

    opens com.github.skulluglify.coconuts to javafx.fxml;
    opens com.github.skulluglify.coconuts.views to javafx.fxml;
}