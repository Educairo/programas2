package Aula_POO_INTRO;
//import javax.swing.JOptionPane;
public class Personagem {
public String nome;
int energia = 10;
int fome;
int sono;




public void cacar (){
    if (energia >= 2){
    System.out.println(nome + " caçando...");
energia -= 2;
    
}
else{
    System.out.println(nome + "Sem energia para caçar");

    fome = Math.min ( fome + 1, 10);
    sono = Math.min ( sono + 1, 10);
}
}
void dormir(){
    System.out.println(nome + " dormindo...");
    if (sono >= 1);{
    System.out.println (nome + " Dormindo");
    sono--;
    energia = energia + 1 <= 10 ? energia + 1 : 10;

} else{
System.out.println(nome + " Sem sono");
}
    
    void comer(){
        System.out.println(nome + " comendo...");
        if (comer >= 1);{
            System.out.println (nome + " Comendo");
        }else{
            System.out.println(nome + " Sem fome");

        }   
    }
        int somar(int a, int b){
            return a + b;
        }

    

    

    



}
