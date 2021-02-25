package com.jagrosh.discordipc.entities;

/**
 * Changes from ThatGravyBoat: https://github.com/ThatGravyboat/DiscordIPC/commit/f689cd53003fbfd3a306e10e30645df72cb7ed81
 */
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
