/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.betplayleague;

/**
 *
 * @author Andres Felipe
 */
public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private MatchResult result;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public Team getHomeTeam() {
        return this.homeTeam;
    }

    public Team getAwayTeam() {
        return this.awayTeam;
    }

    public MatchResult getResult() {
        return this.result;
    }

    public void setResult(MatchResult result) {
        this.result = result;
    }
    
    public String toString(){
        return getHomeTeam() + " vs " + getAwayTeam(); 
    }
}
