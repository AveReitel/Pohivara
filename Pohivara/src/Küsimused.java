public class K�simused {
    private String definitsioon; // Definitsioon
    private String �ige_vastus; // �ige vastus
    private String m�ngija_vastus; // Kasutaja pakutud vastus
    private boolean on�ige;
   
    public void k�simused(String definitsioon, String answer) {
        this.definitsioon = definitsioon;
        this.�ige_vastus = answer;     
    }
 
    public String getU_answer() {
        return m�ngija_vastus;
    }
 
    public void setU_answer(String m�ngija_vastus) {
        this.m�ngija_vastus = m�ngija_vastus.toLowerCase();
        // Kontrolli tulemust
        if (m�ngija_vastus.toLowerCase().equals(�ige_vastus.toLowerCase()))
            on�ige = true;
        //on�ige = false;
    } 
    public String getDefinitsioon() {
        return definitsioon;
    } 
    public String get�ige_vastus() {
        return �ige_vastus;
    } 
    public boolean on�ige() {
        return on�ige;
    }   
}