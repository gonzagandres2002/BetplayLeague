/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.betplayleague;

/**
 *
 * @author Andres Felipe
 */

import java.util.ArrayList;
import java.util.List;

public class League {
    private final ArrayList<Team> teams;
    private final List<List<Match>> rounds;

    public League() {
        teams = new ArrayList<>();
        
        // Create examples of teams
        teams.add(new Team("Aguilas Doradas"));
        teams.add(new Team("Alianza"));
        teams.add(new Team("America de Cali"));
        teams.add(new Team("Atletico Bucaramanga"));
        teams.add(new Team("Atletico Nacional"));
        teams.add(new Team("Boyaca Chico"));
        teams.add(new Team("Deportes Tolima"));
        teams.add(new Team("Deportivo Cali"));
        teams.add(new Team("Deportivo Pasto"));
        teams.add(new Team("Deportivo Pereira"));
        teams.add(new Team("Envigado"));
        teams.add(new Team("Fortaleza C.E.I.F"));
        teams.add(new Team("Independiente Medellin"));
        teams.add(new Team("Jaguares"));
        teams.add(new Team("Junior"));
        teams.add(new Team("La Equidad"));
        teams.add(new Team("Millonarios"));
        teams.add(new Team("Once Caldas"));
        teams.add(new Team("Patriotas"));
        teams.add(new Team("Santa Fe"));
        
        

        // Create matches between all pairs of teams
        
        rounds = generateRoundRobinSchedule(teams);
    }
    
  

    public static List<List<Match>> generateRoundRobinSchedule(ArrayList<Team> teams) {
        List<List<Match>> rounds = new ArrayList<>();
        int numTeams = teams.size();

        int totalRounds = numTeams - 1;
        int matchesPerRound = numTeams / 2;

        for (int round = 0; round < totalRounds; round++) {
            
            List<Match> matches = new ArrayList<>();
            
            for (int match = 0; match < matchesPerRound; match++) {
                int home = (round + match) % (numTeams - 1);
                int away = (numTeams - 1 - match + round) % (numTeams - 1);
                if (match == 0) {
                    away = numTeams - 1;
                }
                
                Match fixture = new Match(teams.get(home), teams.get(away));
                matches.add(fixture);
            }
            rounds.add(matches);
        }
        return rounds;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }
    
    public List<List<Match>> getRounds() {
        return rounds;
    }
    
    public String strMatches(){
        String matchStr = "";
        for (int round = 0; round < rounds.size(); round++) {
            matchStr += "Round " + (round + 1) + ":\n";
            List<Match> fixtures = rounds.get(round);
            for(Match match:fixtures){
                matchStr += match + "\n";
            }
            matchStr += "\n";
        }
        return matchStr;
    }
}
