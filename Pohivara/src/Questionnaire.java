import java.util.Date;
import java.util.List;
import java.util.Scanner;
 
public class Questionnaire {
    private List<K�simused> k�simus; // K�simuste list
    private String m�ngija_nimi; // M�ngija nimi
    private Date alustusaeg; // Algusaeg
    private Date l�ppaeg; // L�puaeg
    private List<K�simused> k�situd ; // K�situd k�simuste list, tulemuste jaoks
    private int correctAnswers; // õigeid vastusied
   
    public Questionnaire(String input, String name)
    {
        this.m�ngija_nimi = m�ngija_nimi;
        parseInputFile(input);
        alustusaeg = new Date(); // Praegune aeg saab algusajaks
        alustaM�ngu();
    }
   
    private void parseInputFile(String input) {
        // Siin loe fail sisse, tee oma failist Question t��pi isendid
        // Siia paned ts�kli, mis splitib sul need definitsioonid ja seletused �ra, ja nendest teed Qustion t��pi isendid (konstruktorit vaata seal)
    }
   
    private void alustaM�ngu() {
        // Testi põhits�kkel
        while (k�simus.size() != 0)
        {
            int i =  0 + (int)(Math.random() * k�simus.size());
            K�simused k = k�simus.get(i);
            Scanner scanner = new Scanner(System.in);
            System.out.println(k.getDefinitsioon());
            String u_answer = scanner.next();
            k.setU_answer(u_answer);
            k�simus.remove(i);
            k�situd.add(k);          
        }
        // L�pptulemus
        for (K�simused k�simus: k�situd) {
            if (k�simus.on�ige())
                System.out.println("�: Vastasid �igesti!"); // Muuda seda detailisemaks
            else
                System.out.println("V: Vastasid valesti"); // Muda seda detailsemaks, mis oleks �ige olnud, mis tema vastas jne
        }
        // Prindi v�lja testi tegemiseks kulunud aeg (finishtime - starttime)
    }
   
 
}

