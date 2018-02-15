
package mozi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Cinema {
    private String name;
    private String adress;
    private String phoneNumber;
    private List<Film> filmList;
    private List<Hall> hallList;
    private List<Show> showList;
    
    
    public Cinema(String name, String adress, String phoneNumber) {
        this.name = name;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        filmList = new ArrayList<>();
        hallList = new ArrayList<>();
        showList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Film> getFilmList() {
        return filmList;
    }

    //filmek listaja
    public void addToFilmList(Film _film){
        filmList.add(_film);
    }
    public void printFilmList(){
        for (Film i : filmList){
            System.out.println(i);
        }
    }

    //termek listaja
    public void addHallToList(Hall _hall){
        hallList.add(_hall);
    }
    public void printHallList(){
        for (Hall i : hallList){
            System.out.print(i);
        }
    }
    
    //vetitesek listaja   
    public void addShowToCinema(Show _show){
        showList.add(_show);
    }
    public void printShows(){
        for (Show i : showList){
            System.out.println(i);
        }
    }

    public void vetitesKeres(String filmNevResz){
        for (Show i : showList){
            if (i.getRunningFilm().getName().contains(filmNevResz)){
                System.out.println(i);
            }
        }
    }
    
    public void legtobbetVetitett(){
        Film mostPlayed;
        mostPlayed = filmList.get(0);
        for (Film i : filmList){
            if (i.getNrOfPlays()>mostPlayed.getNrOfPlays()){
                mostPlayed = i;
            }
        }
        System.out.println("A legtöbbet játszott film: " + mostPlayed + ", játszások száma: " + mostPlayed.getNrOfPlays());
    }
    public void vetitesekSzama(){
        for (Film i : filmList){
            System.out.println(i.getName() + " " + i.getNrOfPlays());
            }
    }
   

    public void haromLegnepszerubbVetites(){
        Collections.sort(showList, new sortByViewer());
        for(int i=0; i < 3; i++){
            System.out.print(showList.get(i) + " Nézőszáma: " + showList.get(i).getViewer());
            System.out.println();
        }
    }
    
}
