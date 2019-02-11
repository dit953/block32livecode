import java.util.ArrayList;
import java.util.List;

public class Variance {

    public static void main(String[] args) {
        List<Triangle> trilist = new ArrayList<Triangle>();
        // Next line does not work if uncommented,
        // since List<Polygon> is invariant in its type parameter.
        List<Polygon> polylist = // trilist;
                new ArrayList<Polygon>();
        // Next line *does* work, since copolylist has a wider type than polylist,
        // to also include lists whose element types are subtypes to Polygon.
        List<? extends Polygon> copolylist = trilist;

        // Next line also works, since contrapolylist has a wider type than polylist,
        // to also include lists whose element types are supertypes to Polygon.
        List<? super Polygon> contrapolylist = polylist;

        // For invariant types, both reading and writing works
        polylist.add(new Square(5, 10));
        Polygon p = polylist.get(0);

        // For covariant types, only reading works. We cannot write, since copolylist
        // may hold a reference to a list whose element type is incompatible with what
        // we want to write; e.g. List<Triangle> when we try to insert a Square.
        copolylist.add(new Square(5, 10));
        // Reading still works fine though, since all accepted lists all contain elements
        // that will be subtypes to Polygon.
        p = copolylist.get(0);

        // For contravariant types, only writing works. We can only read as Object, since
        // in the worst case contrapolylist may hold a reference to a list whose element
        // type is Object.
        Object o = contrapolylist.get(0);
        p = contrapolylist.get(0);
        // Writing objects that are subtypes to Polygon works fine, since all accepted
        // lists can hold elements of type Polygon.
    }

}
