import java.util.*;

public class Organigrama {
    private Map<Angajat, List<Angajat>> org = new TreeMap<Angajat, List<Angajat>>(); 
    // private ArrayList<Angajat> angList = new ArrayList<Angajat>();
    private static Organigrama singleton;
    
    private Organigrama(){}
    
    public static Organigrama getInstance() {
        if (singleton == null) {
            singleton = new Organigrama();
        }
        return singleton;
    }
    
    public void adaugare(Angajat sef, Angajat sub) {
        if (org.get(sef) == null) {
            List<Angajat> angList = new ArrayList<Angajat>();
            angList.add(sub);
            org.put(sef, angList);
        } else {
            org.get(sef).add(sub);
        }
    }
    
    public void stergere(Angajat sub) {
        for (Angajat key : org.keySet()) {
            for (int i = 0; i<org.get(key).size(); i++) {
                if (org.get(key).get(i).equals(sub)) {
                    org.get(key).remove(sub);
                }                
            }            
        }
    }
    
    public void afisare() {
        for (Angajat key : org.keySet()) {
            System.out.println(key + "   " +  org.get(key));
        }
    }
}