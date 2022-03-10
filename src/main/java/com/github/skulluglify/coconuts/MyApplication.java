package com.github.skulluglify.coconuts;

import com.github.skulluglify.coconuts.enums.Globals;
import com.github.skulluglify.coconuts.views.Coconuts;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.InputStream;

@SuppressWarnings("ALL")
public class MyApplication extends Application {

    public static final int CURRENT_WIDTH = 320;
    public static final int CURRENT_HEIGHT = 240;

    @Override
    public void start(Stage stage) throws IOException {

        setUserAgentStylesheet(STYLESHEET_MODENA);

        Globals icon = Globals.ICON;

        Coconuts coconuts = new Coconuts();

        InputStream iconAsStream = getClass().getResourceAsStream(icon.getSource());

        assert iconAsStream != null;

        Image iconAsImage = new Image(iconAsStream);

        Scene scene = new Scene(coconuts, CURRENT_WIDTH, CURRENT_HEIGHT);

        stage.setTitle("Coconuts");
        stage.setMinWidth(CURRENT_WIDTH);
        stage.setMinHeight(CURRENT_WIDTH);
        stage.setAlwaysOnTop(true);
        stage.setIconified(false); // minimize
        stage.setFullScreen(false);
        stage.getIcons().add(iconAsImage);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        // better look
        launch();
    }
}