import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Organigrama organ = Organigrama.getInstance();  
        Scanner scanner = new Scanner(System.in);
        String line;
        String[] input;
        
        while(true) {
            System.out.println("Alege una dintre variantele:");
            System.out.println("1. ADD <sef> <nume> <functie> <sub> <nume> <functie>");
            System.out.println("2. STERGE <sub> <nume> <functie>");
            System.out.println("3. AFIS");
            System.out.println("4. EXIT");
            line = scanner.nextLine();
            input = line.split("\\s+");
            
            switch(input[0].toUpperCase()) {
                case "ADD" :
                    Angajat angaj1 = new Angajat(input[2], input[3]);
                    Angajat angaj2 = new Angajat(input[5], input[6]);
                    organ.adaugare(angaj1, angaj2);
                    break;
                case "STERGE" :
                    Angajat sub3 = new Angajat(input[2], input[3]);
                    organ.stergere(sub3); 
                    break;
                case "AFIS":
                    organ.afisare();
                    break;
                case "EXIT":
                    System.exit(0);
            
                    
            }
        }          
    }
}

// add sef si atat
// sterge sef si atat
// la sterge sub nu am nevoie de functie
// vreau sa vad ierarhia sefilor