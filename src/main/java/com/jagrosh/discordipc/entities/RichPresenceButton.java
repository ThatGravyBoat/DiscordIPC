package com.jagrosh.discordipc.entities;

public class RichPresenceButton {
    private final String url;
    private final String label;

    public RichPresenceButton(String url, String label) {
        this.url = url;
        this.label = label;
    }

    public String getLabel(){
        return this.label;
    }

    public String getUrl(){
        return this.url;
    }
}
