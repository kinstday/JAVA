package listtoarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kinstday
 */
public class ListToArray
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<String>(3);
        list.add("one");
        list.add("two");
        list.add("three");

        Object[] array1 = list.toArray();

        String[] array2 = new String[2];
        list.toArray(array2);
        System.out.println(Arrays.asList(array2));

        String[] array3 = new String[3];
        list.toArray(array3);
        System.out.println(Arrays.asList(array3));
    }
}
