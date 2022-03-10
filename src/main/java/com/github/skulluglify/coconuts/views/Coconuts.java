package com.github.skulluglify.coconuts.views;

import com.github.skulluglify.coconuts.enums.Fxmls;
import com.github.skulluglify.coconuts.enums.Globals;
import com.github.skulluglify.coconuts.enums.Styles;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;

@SuppressWarnings("ALL")
public class Coconuts extends VBox {

    private URL location;
    private Locale locale;
    private ResourceBundle resourceBundle;
    private FXMLLoader fxmlLoader;
    private URL sStyles;

    @FXML
    private Text coText;

    public Coconuts() throws IOException {

        Globals translations = Globals.TRANSLATIONS;
        Styles coconutsStyles = Styles.COCONUTS;
        Fxmls coconutsFxmls = Fxmls.COCONUTS;

        /* URLs */
        sStyles = getClass().getResource(coconutsStyles.getSource());
        location = getClass().getResource(coconutsFxmls.getSource());

        locale = new Locale("en", "US");
        resourceBundle = ResourceBundle.getBundle(translations.getSource());

        fxmlLoader = new FXMLLoader(location, resourceBundle);
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);

        try {

            fxmlLoader.load();

            // Now Working Fine ...
            this.getStylesheets().add(sStyles.toExternalForm());

            coText = (Text)this.lookup("#coText");
            coText.textProperty().set(resourceBundle.getString("say"));

        } catch (Exception exception) {

            throw new RuntimeException(exception);
        }
    }
}
