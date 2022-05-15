package Aula_POO_INTRO;
import java.util.Scanner;

public class Jogo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        Personagem p = new Personagem();
        System.out.println("Qual o nome do seu personagem?");
        p.nome= leitor.next();
        System.out.println("O nome do seu personagem é " + p.nome);
        p.cacar();
        p.cacar();

        p.dormir();
        int res = p.somar(2, 3);
        System.out.println(res);

        p.cacar();
        p.comer();





    }
    
}
