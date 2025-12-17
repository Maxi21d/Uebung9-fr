package h1;
import java.util.ArrayList;

public class PrioListe {
    public ArrayList<Patient> myList =  new ArrayList<Patient>();

    public void addPatient(Patient p){
        for(int i = 0; i < this.myList.size(); i++){
            Patient current = myList.get(i);
            if(p.prio < current.prio){
                myList.add(i, p);
                return;
            }
        }
        myList.add(p);
    }
    public Patient getNextPatient() {
       return myList.remove(0);
    }
    public int getPosition(Patient p) {
        return myList.indexOf(p);
    }
}

