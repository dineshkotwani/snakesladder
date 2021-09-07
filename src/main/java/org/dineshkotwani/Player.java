package org.dineshkotwani;

import lombok.Data;

import java.util.Random;

@Data
public class Player {

    private long id ;
    private String name;
    private int currentPosition;
    private boolean winner;

    public Player(String name) {
        this.name = name;
        this.id = new Random().nextLong();
        this.currentPosition = 0;
    }
}
