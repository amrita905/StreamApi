import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayQ {


    public  static void  main(String arg[]){
        int[] a ={1,5,2,8,3,1,2,9,4,3,5};
        Map<Integer,Long> m =Arrays.stream(a).boxed()
                .collect(Collectors.groupingBy(t->t,Collectors.counting())
                );

        Map<Integer,Long> mSorted =Arrays.stream(a).boxed()
                .collect(Collectors.groupingBy(t->t,Collectors.counting())
                ).entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(
                        Collectors.toMap(Map.Entry::getKey,
                                Map.Entry::getValue,
                                (t,b)->t,
                        LinkedHashMap::new
                ));


        System.out.println(m);
        System.out.println(mSorted);

    }



}
