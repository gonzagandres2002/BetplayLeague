/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.betplayleague;

/**
 *
 * @author Andres Felipe
 */

class MatchResult {
    private int homeScore;
    private int awayScore;
    private Team homeTeam;
    private Team awayTeam;

    public MatchResult(int homeScore, int awayScore, Team homeTeam, Team awayTeam) {
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public int getHomeScore() {
        return homeScore;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public Team getWinner(Match match) {
        if (homeScore > awayScore) {
            return homeTeam;
        } else if (homeScore < awayScore) {
            return awayTeam;
        }

        return null;
    }
    
    @Override
    public String toString(){
        return homeTeam.getName() + " " + getHomeScore() + " vs " + awayTeam.getName() + " " + getAwayScore();
    }

}
