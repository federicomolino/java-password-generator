
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        //Faccio inserire il nome
        System.out.println("Insersci il tuo nome");
        String nome = scan.next();

        //Faccio inserire il cognome
        System.out.println("Insersci il tuo cognome");
        String cognome = scan.next();

        //Faccio inserire il colore preferito
        System.out.println("Insersci il tuo colore preferito");
        String colorePreferito = scan.next();

        //faccio inserire il giorno
        System.out.println("Insersci il giorno in cui sei nato");
        int giornoDiNascita = scan.nextInt();

        //faccio inserire il mese
        System.out.println("Insersci il mese in cui sei nato");
        int meseDiNascita = scan.nextInt();

        //faccio inserire l'anno
        System.out.println("Insersci l'anno in cui sei nato");
        int annoDiNascita = scan.nextInt();

        //concateno ogni valore inserito separato da '-', prima sommo però per generare il numero che sarà presente nella password
        System.out.println("La tua password è: " + nome +"-" + cognome+"-" + colorePreferito+"-" + (giornoDiNascita + meseDiNascita + annoDiNascita));
    }
}
