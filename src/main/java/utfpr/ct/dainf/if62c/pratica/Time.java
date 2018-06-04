/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.pratica;

import java.util.HashMap;

/**
 *
 * @author Gustavo
 */
public class Time {
    
    private final HashMap<String, Jogador> jogadores;
    
    public Time(){
        this.jogadores = new HashMap<>();
    }
    
    public HashMap<String, Jogador> getJogadores(){
        return jogadores;
    }
    
    public void addJogador(String string, Jogador jog){
        
        this.jogadores.put(string, jog);
    }
}
