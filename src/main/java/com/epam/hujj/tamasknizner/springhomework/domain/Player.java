package com.epam.hujj.tamasknizner.springhomework.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("player")
@Scope("prototype")
public class Player extends Person {

    private PlayerRole playerRole;

    public Player(@Value("${player.name.default}") String name, @Value("${player.playerrole.default}") PlayerRole playerRole) {
        super(name, Role.PLAYER);
        this.playerRole = playerRole;
    }

    public PlayerRole getPlayerRole() {
        return playerRole;
    }

    public void setPlayerRole(PlayerRole playerRole) {
        this.playerRole = playerRole;
    }

    @Override
    public String toString() {
        return "Player [name=" + name + " playerRole=" + playerRole + "]";
    }

    @Override
    public String doMyJob() {
        // TODO Auto-generated method stub
        return null;
    }

}
