package com.github.skulluglify.coconuts.enums;

import org.jetbrains.annotations.NotNull;

@SuppressWarnings("ALL")
public enum Globals {

    ROOTDIR("/com/github/skulluglify/coconuts"),
    TRANSLATIONS("/com/github/skulluglify/coconuts/translations"),
    ICON("/com/github/skulluglify/coconuts/icon.png");

    private String location;

    private Globals(@NotNull String location) {

        this.location = location;
    }

    public String getSource() {

        return this.location;
    }
}