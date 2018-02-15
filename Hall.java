
package mozi;

import java.util.ArrayList;

public class Hall {
    private String name;
    private Seat[][] seats;
    
    public Hall(String name/*, int sor, int oszlop*/) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + '\n';
    }

    public void addSorok(int sor){
        seats = new Seat[sor][];                                //létrehozza a kétdimenziós Seat objektumokból álló tömb sorait
    }

    public void addOszlopok(int sor, int oszlop){
        seats[sor]= new Seat[oszlop];                           //létrehozza a megadott sor oszlopait
        for (int i=0;i<oszlop;i++){                             //megvan a sor és az oszlopértéke is, már el lehet nevezni az ülőhelyeket, ciklussal végigfutva
            StringBuilder tmpName = new StringBuilder();        //az elnevezéshez egy ideiglenes sztring létrehozása, egyelőre üres
            tmpName.append(Character.toString((char)(sor+65))); //a sor értékéhez 65-öt adva, és ezt karakterré konvertálva megkapjuk a sor nevét (első sor 0, ASCII A = 65) és ezt az ideiglenes sztringhez fűzzük
            tmpName.append(Integer.toString(i+1));              //a sor nevéhez hozzáfűzzük az aktuális oszlopértéket is, sztringként
            seats[sor][i] = new Seat(tmpName.toString());       //megvan a megfelelő név (aktuális sor + oszlop), az aktuális tömbpozicióba létrehozunk egy Seat objektumot és névként átadjuk a konstruktornak az előállitott ideiglenes sztringet
        }
    }

    public void printseats(){
        for (int i=0;i<seats.length;i++){
            for (int j=0; j<seats[i].length;j++){
                System.out.print(seats[i][j] + " ");
            }
            System.out.println("\b");
        }        
    }

    public Status getSeatStatus(int sor, int oszlop){
        return seats[sor][oszlop].getStatus();
    }    
    public void setSeat(int sor, int oszlop, Status status){
        seats[sor][oszlop].setStatus(status);
    }
}
