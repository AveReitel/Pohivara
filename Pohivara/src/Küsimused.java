public class Küsimused {
    private String definitsioon; // Definitsioon
    private String õige_vastus; // Õige vastus
    private String mängija_vastus; // Kasutaja pakutud vastus
    private boolean onõige;
   
    public void küsimused(String definitsioon, String answer) {
        this.definitsioon = definitsioon;
        this.õige_vastus = answer;     
    }
 
    public String getU_answer() {
        return mängija_vastus;
    }
 
    public void setU_answer(String mängija_vastus) {
        this.mängija_vastus = mängija_vastus.toLowerCase();
        // Kontrolli tulemust
        if (mängija_vastus.toLowerCase().equals(õige_vastus.toLowerCase()))
            onõige = true;
        //onõige = false;
    } 
    public String getDefinitsioon() {
        return definitsioon;
    } 
    public String getÕige_vastus() {
        return õige_vastus;
    } 
    public boolean onÕige() {
        return onõige;
    }   
}