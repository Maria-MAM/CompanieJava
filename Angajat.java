public class Angajat implements Comparable<Angajat>{
    private String nume;
    private String functie;
    
    public Angajat(String nume, String functie) {
        this.nume = nume;
        this.functie = functie;
    }
    
    public String getNume() {
        return nume;
    }
    
    public void setNume(String nume) {
        this.nume= nume;
    }
    
    public String getFunctie() {
        return functie;
    }
    
    public void setFunctie(String nume) {
        this.functie= functie;
    }
    
    public String toString() {
        return nume + " - " + functie;
    } 
    
    @Override
    public int compareTo(Angajat a) {
        return nume.compareTo(a.nume);
    }
    
    public boolean equals (Object obj) {
       if (this == obj) return true;
       if (this == null) return false;
       if (this.getClass() != obj.getClass()) return false;
       Angajat ang = (Angajat) obj ;
       return this.nume.equals(ang.nume);
   }
}