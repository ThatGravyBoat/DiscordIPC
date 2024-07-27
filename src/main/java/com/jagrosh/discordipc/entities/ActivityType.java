package com.jagrosh.discordipc.entities;

public enum ActivityType {
    PLAYING(0),
    LISTENING(2),
    WATCHING(3),
    COMPETING(5),
    ;

    private final int id;

    ActivityType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
