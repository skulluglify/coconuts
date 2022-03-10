package com.github.skulluglify.coconuts.enums;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public enum Fxmls {

    COCONUTS("/com/github/skulluglify/coconuts/views/coconuts.fxml");

    private String location;

    private Fxmls(@NotNull String location) {

        this.location = location;
    }

    public String getSource() {

        return this.location;
    }
}
