
import java.util.Set;
import utfpr.ct.dainf.if62c.pratica.Jogador;
import utfpr.ct.dainf.if62c.pratica.Time;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * 
 * Template de projeto de programa Java usando Maven.
 * @author Wilson Horstmeyer Bogado <wilson@utfpr.edu.br>
 */
public class Pratica61 {
    public static void main(String[] args) {
        
        Time time1 = new Time();
        Time time2 = new Time();
        
        time1.addJogador("Goleiro", new Jogador(1, "Fulano"));
        time1.addJogador("Lateral", new Jogador(4, "Ciclano"));
        time1.addJogador("Atacante", new Jogador(10, "Beltrano"));
        
        time2.addJogador("Goleiro", new Jogador(1, "João"));
        time2.addJogador("Lateral", new Jogador(7, "José"));
        time2.addJogador("Atacante", new Jogador(15, "Mário"));
        
        Set<String> entradas = time1.getJogadores().keySet();
        System.out.println("Posição\t\tTime 1\t\tTime 2");
        
        for(String entrada: entradas){
            System.out.println(entrada + "\t" + time1.getJogadores().get(entrada) + "\t" + time2.getJogadores().get(entrada));   
        }
    }
}
