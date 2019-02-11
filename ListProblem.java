import java.util.ArrayList;
import java.util.List;

public class ListProblem {

    public static void main(String[] args){
        List<Triangle> trilist = new ArrayList<Triangle>();
        // Next line does not work, since List is invariant in its parameter:
        // Triangle <: Polygon does *not* mean List<Triangle> <: List<Polygon>
        List<Polygon> polylist = trilist;

        //polylist[0] = new Square(5, 10);
        Triangle t = trilist.get(0);

    }
}
