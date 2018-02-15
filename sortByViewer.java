
package mozi;
import java.util.Comparator;

public class sortByViewer implements Comparator<Show>{
    
    @Override
    public int compare(Show o1, Show o2) {
        if(o1.getViewer() < o2.getViewer()){
            return 1;
        } else {
            return -1;
        }
    }
}
