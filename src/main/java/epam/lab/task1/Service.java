package epam.lab.task1;

/**
*/
public class Service
{
    public static void main( String[] args )
    {
       @Override
       public int compareTo(Object obj) {
             Comp entry = (Comp) obj;
            
             int result = str.compareTo(entry.str);
             if(result != 0) {
                    return result;
             }
            
             result = number - entry.number;
             if(result != 0) {
                    return (int) result / Math.abs( result );
             }
             return 0;
       }    }
}
