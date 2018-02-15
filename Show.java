
package mozi;

import java.util.List;

public class Show {
    private String time;
    private Hall reservedHall;
    private Film runningFilm = null;
    private int viewer;
    
    public Show(String time) {
        this.time = time;
        this.viewer = 0;
    }

    public void setReservedHall(Hall reservedHall) {
        this.reservedHall = reservedHall;
    }
    public Hall getReservedHall() {
        return reservedHall;
    }

    public Film getRunningFilm() {
        return runningFilm;
    }
    public void setRunningFilm(Film runningFilm, List<Film> _filmList) {
        if (this.runningFilm == null){
            this.runningFilm = runningFilm;
            this.runningFilm.setNrOfPlays(this.runningFilm.getNrOfPlays()+1);
            System.out.println("Film egy üres teremhez hozzáadva!");
        }
        else if (this.runningFilm.equals(runningFilm)){
            System.out.println("Jelenleg is ez a film van a vetitéshez rendelve!");            
        }
        else  {
            for (Film i : _filmList){
                if (i.equals(this.runningFilm)){
                    this.runningFilm.setNrOfPlays(this.runningFilm.getNrOfPlays()-1);
                }
            }
            this.runningFilm = runningFilm;
            this.runningFilm.setNrOfPlays(this.runningFilm.getNrOfPlays()+1);
        }

    }

    public int getViewer() {
        return viewer;
    }

    @Override
    public String toString() {
        return "A(z) " + time + "-es vetitesen a " + runningFilm.getName() + " cimű filmet játsza a mozi, a(z) " + reservedHall.getName() + " teremben.";
    }

    public void jegyElAd(char sor, int oszlop){
        int _sor = (char)(sor-65);
        if (reservedHall.getSeatStatus(_sor, oszlop-1) == Status.URES){
            reservedHall.setSeat(_sor, oszlop-1, Status.FOGLALT);
            this.viewer++;
        }
        else System.out.println(sor +"" + oszlop + ": Ez a szék nem eladható!");
    }

    public void nemEladhatoHely(char sor, int oszlop){
        int _sor = (char)(sor-65);
        reservedHall.setSeat(_sor, oszlop-1, Status.TILTOTT);
    }

}