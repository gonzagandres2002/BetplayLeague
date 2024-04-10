/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.betplayleague;

/**
 *
 * @author Andres Felipe
 */

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MatchSimulator {
    
    //simulate a single round
    
    public static String simulateMatches(League league, int round) {
        List<Team> teams = league.getTeams();
        List<Match> matches = league.getRounds().get(round);
        String results = "";
        
        // Randomly determine the match result
        for (Match match : matches) {
            MatchResult result = simulateMatch(match.getHomeTeam(), match.getAwayTeam());
            match.setResult(result);
            results += result + "\n";

            // Assign points
            Team winner = result.getWinner(match);
            if (winner != null) {
                winner.addPoints(3);
                winner.addWin();
                match.getAwayTeam().addLose();
            }else{
            match.getHomeTeam().addPoints(1);
            match.getAwayTeam().addPoints(1);
            match.getHomeTeam().addDraw();
            match.getAwayTeam().addDraw();
            }
        }

        // Order the teams by points
        Collections.sort(teams, new Comparator<Team>() {
            public int compare(Team team1, Team team2) {
                return Integer.compare(team2.getPoints(), team1.getPoints());
            }
        });
        
        return results;
    }
    
    private static MatchResult simulateMatch(Team homeTeam, Team awayTeam) {

        int homeTeamScore = (int) (Math.random() * 5);
        int awayTeamScore = (int) (Math.random() * 5);

        MatchResult result = new MatchResult(homeTeamScore, awayTeamScore, homeTeam, awayTeam);
        homeTeam.addGoalsFor(homeTeamScore);
        awayTeam.addGoalsAgainst(homeTeamScore);
        homeTeam.addGoalsAgainst(awayTeamScore);
        awayTeam.addGoalsFor(awayTeamScore);
        
        return result;
    }
    

}