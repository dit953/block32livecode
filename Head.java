public class Head {

    /* Whatever type T is, return the first element of an array of Ts.
       * <T> introduces the type parameter T
       * The lone T that precedes the method name is the return type.
       * The parameter type is T[], i.e. an array of Ts.
       * T is a type variable.
       *   - In the return type it is used as a type
       *   - In the parameter type it is used as a type argument to the type constructor []
     */
    public static <T> T head(T[] a){
        return a[0];
    }
    String[] strings = {"Hej"};
    String x = Head.<String>head(strings);  // Type argument redundant, can be inferred ...
    String y = Head.head(strings);          // ... like on this line.

}
