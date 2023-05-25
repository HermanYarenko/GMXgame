package com.mygdx.game.gameOOP.Units;

import java.util.ArrayList;

public interface Gameinterface {
    void step(ArrayList<Unit> enemy);

    String getInfo();

    String introduce();
}