package org.dineshkotwani;

import lombok.Data;

@Data
public class Player {

    private String name;
    private int currentPosition;
    private boolean winner;

    public Player(String name) {
        this.name = name;
        this.currentPosition = 0;
    }
}
