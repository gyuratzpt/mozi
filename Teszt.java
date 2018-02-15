
package mozi;

public class Teszt {

    public static void main(String[] args) {

// 1. Objektumok letrehozasa

//alapobjektum a mozi
    Cinema mozi = new Cinema("Cinema paradiso", "Somewhere", "1-555-123456789");
    
//filmek listajanak Film objektumokkal feltöltése
    Film film1 = new Film("Kincs, ami nincs", 78);
    mozi.addToFilmList(film1);
    Film film2 = new Film("Bunvadaszok", 83);
    mozi.addToFilmList(film2);
    Film film3 = new Film("Interstellar", 134);
    mozi.addToFilmList(film3);
    Film film4 = new Film("Az", 106);
    mozi.addToFilmList(film4);
    Film film5 = new Film("Halloween", 76);
    mozi.addToFilmList(film5);

//termek listajának Hall objektumokkal feltöltése
    Hall hall1 = new Hall("Első");
    mozi.addHallToList(hall1);
    Hall hall2 = new Hall("Második");
    mozi.addHallToList(hall2);
    Hall hall3 = new Hall("Harmadik");
    mozi.addHallToList(hall3);
    Hall hall4 = new Hall("Negyedik");
    mozi.addHallToList(hall4);
    Hall hall5 = new Hall("Ötödik");
    mozi.addHallToList(hall5);

//eddigiek ellenőrzése    
    System.out.println("A mozi adatai:");
    System.out.println("Neve: " + mozi.getName() + ", cime: " + mozi.getAdress() + ", telefonszama: " + mozi.getPhoneNumber());
    System.out.println("A " + mozi.getName() +" mozi termei:");
    mozi.printHallList();
    System.out.println("\nA felvitt filmek adatai:");
    mozi.printFilmList();
    System.out.println("\n\n\n");    
    
    
// vetites objektumok létrehozása
    Show show1 = new Show("2018-06-06 11:10");
    //vetiteshez terem beallitasa
    show1.setReservedHall(hall1);
    //vetiteshez film beallitasa
    show1.setRunningFilm(film2, mozi.getFilmList());
    //vetites mozihoz adasa
    mozi.addShowToCinema(show1);
    
    Show show2 = new Show("2018-06-06 20:10");
    show2.setReservedHall(hall2);
    show2.setRunningFilm(film4, mozi.getFilmList());
    mozi.addShowToCinema(show2);
    
    Show show3 = new Show("2018-06-06 22:10");
    show3.setReservedHall(hall3);
    show3.setRunningFilm(film1, mozi.getFilmList());
    mozi.addShowToCinema(show3);
    
    Show show4 = new Show("2018-06-07 11:20");
    show4.setReservedHall(hall4);
    show4.setRunningFilm(film5, mozi.getFilmList());
    mozi.addShowToCinema(show4);
    
    Show show5 = new Show("2018-06-07 16:20");
    show5.setReservedHall(hall5);
    show5.setRunningFilm(film3, mozi.getFilmList());
    mozi.addShowToCinema(show5);
    
    
    //eddigiek ellenőrzése 
    mozi.printShows();
    System.out.println("\n\n\n");


// szék objektumok létrehozása

    
    hall1.addSorok(3);          //mivel nincs ellenőrzés, a tömb dimenzióit megfelelően kell megadni, különben fagy!
    hall1.addOszlopok(0, 10);
    hall1.addOszlopok(1, 3);
    hall1.addOszlopok(2, 6);
    System.out.println(hall1.getName() + " nézőtér alapállapota:");
    hall1.printseats();
    System.out.println();

    hall2.addSorok(5);          //mivel nincs ellenőrzés, a tömb dimenzióit megfelelően kell megadni, különben fagy!
    hall2.addOszlopok(0, 10);
    hall2.addOszlopok(1, 10);
    hall2.addOszlopok(2, 10);
    hall2.addOszlopok(3, 10);
    hall2.addOszlopok(4, 10);
    System.out.println(hall2.getName() + " nézőtér alapállapota:");
    hall2.printseats();
    System.out.println();

    hall3.addSorok(2);          //mivel nincs ellenőrzés, a tömb dimenzióit megfelelően kell megadni, különben fagy!
    hall3.addOszlopok(0, 5);
    hall3.addOszlopok(1, 5);
    System.out.println(hall3.getName() + " nézőtér alapállapota:");
    hall3.printseats();
    System.out.println();

    hall4.addSorok(5);          //mivel nincs ellenőrzés, a tömb dimenzióit megfelelően kell megadni, különben fagy!
    hall4.addOszlopok(0, 4);
    hall4.addOszlopok(1, 4);
    hall4.addOszlopok(2, 4);
    hall4.addOszlopok(3, 4);
    hall4.addOszlopok(4, 4);
    System.out.println(hall4.getName() + " nézőtér alapállapota:");
    hall4.printseats();
    System.out.println();
    
    hall5.addSorok(2);          //mivel nincs ellenőrzés, a tömb dimenzióit megfelelően kell megadni, különben fagy!
    hall5.addOszlopok(0, 2);
    hall5.addOszlopok(1, 2);
    System.out.println(hall5.getName() + " nézőtér alapállapota:");
    hall5.printseats();
    System.out.println("\n\n\n");
    
    
//székállapotok metódusainak tesztelése    
    show1.jegyElAd('A',1);
    show1.jegyElAd('A',2);
    show1.jegyElAd('A',3);    
    show1.jegyElAd('A',4);
    show1.jegyElAd('A',5);
    show1.jegyElAd('A',6);
    show2.jegyElAd('A',1);
    show2.jegyElAd('A',2);
    show3.jegyElAd('A',1);
    show3.jegyElAd('A',2);
    show3.jegyElAd('A',3);
    show4.jegyElAd('C',1);
    show4.jegyElAd('C',2);
    show4.jegyElAd('C',3);
    show4.jegyElAd('C',4);
    show4.jegyElAd('A',2);
    show4.jegyElAd('A',3);
    show5.jegyElAd('A',1);
    show5.jegyElAd('A',2);
    show5.jegyElAd('B',1);
    show5.jegyElAd('B',2);
    System.out.println(hall1.getName() + " nézőtér alapállapota:");
    hall1.printseats();
    System.out.println();
    System.out.println(hall2.getName() + " nézőtér alapállapota:");
    hall2.printseats();
    System.out.println();
    System.out.println(hall3.getName() + " nézőtér alapállapota:");
    hall3.printseats();
    System.out.println();
    System.out.println(hall4.getName() + " nézőtér alapállapota:");
    hall4.printseats();
    System.out.println();
    System.out.println(hall5.getName() + " nézőtér alapállapota:");
    hall5.printseats();
    System.out.println("\n\n\n");

//néhány szék tiltottra állitása
    System.out.println("Néhány szék tiltottra állitása...");
    show1.nemEladhatoHely('A', 9);
    show1.nemEladhatoHely('A', 10);
    show1.nemEladhatoHely('C', 5);
    show1.nemEladhatoHely('C', 6);
    System.out.println(hall1.getName() + " nézőtér alapállapota:");
    hall1.printseats();
    System.out.println();
    show3.nemEladhatoHely('B', 1);
    show3.nemEladhatoHely('B', 2);
    System.out.println(hall3.getName() + " nézőtér alapállapota:");
    hall3.printseats();
    System.out.println();
    show4.nemEladhatoHely('A', 1);
    show4.nemEladhatoHely('A', 4);
    System.out.println(hall4.getName() + " nézőtér alapállapota:");
    hall4.printseats();
    System.out.println();

// el lehet-e adni tiltott vagy már foglalt helyre jegyet?
    //Foglalt helyre:
    show1.jegyElAd('C',6);
    //Tiltott helyre:
    show4.jegyElAd('A',1);
    System.out.println("\n\n\n");

//megvalóstandó feladatok:
    System.out.println("Kitűzött feladatok, első funkció, keresett szakasz: z");    
    mozi.vetitesKeres("z");
    System.out.println();
    System.out.println("Keresett szakasz: inc");
    mozi.vetitesKeres("inc");
    System.out.println();
    System.out.println("Keresett szakasz: we");
    mozi.vetitesKeres("we");
    System.out.println("\n\n\n");   

    
    System.out.println("Kitűzött feladatok, második funkció, három legnépszerőbb vetités:");    
    mozi.haromLegnepszerubbVetites();    
    //nézőszám megváltoztatása, majd újra listázás:
    show1.jegyElAd('B',1);
    show1.jegyElAd('B',2);
    show1.jegyElAd('B',3);
    show1.jegyElAd('C',1);
    show1.jegyElAd('C',2);
    show1.jegyElAd('C',3);
    show1.jegyElAd('C',4);
    show2.jegyElAd('E',1);
    show2.jegyElAd('E',2);
    show2.jegyElAd('E',3);
    show2.jegyElAd('E',4);
    show2.jegyElAd('E',5);
    show2.jegyElAd('E',6);
    show2.jegyElAd('E',7);
    show4.jegyElAd('D',1);
    show4.jegyElAd('D',2);
    System.out.println("Változtatás után:");
    mozi.haromLegnepszerubbVetites();    
    System.out.println("\n\n\n");

    System.out.println("Kitűzött feladatok, harmadik funkció, legtöbbet játszott film:");
    mozi.legtobbetVetitett();
    //nézőszám megváltoztatása, majd újra listázás:  
    show2.setRunningFilm(film5, mozi.getFilmList());
    show3.setRunningFilm(film5, mozi.getFilmList());
    mozi.legtobbetVetitett();
    System.out.println("\n\n\n");
    
    
    mozi.vetitesekSzama();
    mozi.legtobbetVetitett();
    System.out.println();
    show4.setRunningFilm(film2, mozi.getFilmList());
    mozi.vetitesekSzama();
    mozi.legtobbetVetitett();
    System.out.println();
    show1.setRunningFilm(film4, mozi.getFilmList());
    show5.setRunningFilm(film1, mozi.getFilmList());
    show2.setRunningFilm(film1, mozi.getFilmList());
    show3.setRunningFilm(film3, mozi.getFilmList());
    mozi.vetitesekSzama();
    mozi.legtobbetVetitett();
    System.out.println();
    show1.setRunningFilm(film2, mozi.getFilmList());
    show2.setRunningFilm(film2, mozi.getFilmList());
    show3.setRunningFilm(film2, mozi.getFilmList());
    show4.setRunningFilm(film2, mozi.getFilmList());
    show5.setRunningFilm(film2, mozi.getFilmList());
    mozi.vetitesekSzama();
    mozi.legtobbetVetitett();
    }
}
