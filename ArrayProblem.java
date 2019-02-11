/**
 * Created by Niklas on 2016-02-05.
 *
 * Block 3-2: Variance
 */
public class ArrayProblem {

    public static void main(String[] args){
        Triangle[] triarray = new Triangle[1];
        // Next line passes type checking since arrays are co-variant in their parameter:
        // Triangle <: Polygon *does* mean Triangle[] <: Polygon[]
        Polygon[] polyarray = triarray;

        //... but at runtime we get an ArrayStoreException thrown by the next line.
        polyarray[0] = new Square(5, 10);
        Triangle t = triarray[0];

    }
}
