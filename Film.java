
package mozi;

import java.util.ArrayList;
import java.util.List;



public class Film {
    private String name;
    private int length;
    private int nrOfPlays=0;


    public Film(String name, int length) {
        this.name = name;
        this.length = length;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    public int getNrOfPlays() {
        return nrOfPlays;
    }
    public void setNrOfPlays(int nrOfPlays) {
        this.nrOfPlays = nrOfPlays;
    }
    

    @Override
    public String toString() {
        return name + ", hossza: " + length + "min";
    }
}
