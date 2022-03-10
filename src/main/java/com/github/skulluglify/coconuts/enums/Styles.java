package com.github.skulluglify.coconuts.enums;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public enum Styles {

    COCONUTS("/com/github/skulluglify/coconuts/views/coconuts.css");

    private String location;

    private Styles(@NotNull String location) {

        this.location = location;
    }

    public String getSource() {
        return location;
    }
}
