package com.epam.hujj.tamasknizner.springhomework.domain;

import java.util.List;

public class Team {

    private Coach coach;
    private List<Player> players;
    private TeamNationality nationality;

    public Team(final Coach coach, final List<Player> players, TeamNationality nationality) {
        this.coach = coach;
        this.players = players;
        this.nationality = nationality;
    }

    public Team() {

    }

    public TeamNationality getNationality() {
        return nationality;
    }

    public void setNationality(TeamNationality nationality) {
        this.nationality = nationality;
    }

    public Coach getCoach() {
        return coach;
    }

    public void setCoach(Coach coach) {
        this.coach = coach;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((coach == null) ? 0 : coach.hashCode());
        result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
        result = prime * result + ((players == null) ? 0 : players.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Team other = (Team) obj;
        if (coach == null) {
            if (other.coach != null)
                return false;
        } else if (!coach.equals(other.coach))
            return false;
        if (nationality != other.nationality)
            return false;
        if (players == null) {
            if (other.players != null)
                return false;
        } else if (!players.equals(other.players))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Team " + nationality;
    }

    public String getMembers() {
        return coach.toString() + " " + players.toString();
    }

}
