/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.betplayleague;

/**
 *
 * @author Andres Felipe
 */
public class Team {

    private final String name;
    private int points;
    private int wins;
    private int loses;
    private int draws;
    private int goalsFor;
    private int goalsAgainst;

    public Team(String name) {
        this.name = name;
        this.points = 0;
        this.wins = 0;
        this.loses = 0;
        this.draws = 0;
        this.goalsFor = 0;
        this.goalsAgainst = 0;
    }

    public void addPoints(int points) {
        this.points += points;
    }

    public void addWin() {
        this.wins += 1;
    }

    public void addLose() {
        this.loses += 1;
    }

    public void addDraw() {
        this.draws += 1;
    }
    
    public int getGoalsFor() {
        return goalsFor;
    }

    public void addGoalsFor(int goalsFor) {
        this.goalsFor += goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void addGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst += goalsAgainst;
    }

    public int getWins() {
        return wins;
    }

    public int getLoses() {
        return loses;
    }

    public int getDraws() {
        return draws;
    }

    public String getName() {
        return this.name;
    }

    public int getPoints() {
        return this.points;
    }

    @Override
    public String toString() {
        return getName();
    }
}
