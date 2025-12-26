import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapQ {
    // sort the HashMap using stream API

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 3);
        map.put("B", 1);
        map.put("C", 2);

       Map<String,Integer> result = map.entrySet().stream().sorted(new Comparator<Map.Entry<String, Integer>>() {
                    @Override
                    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                })
                .collect(Collectors.toMap(
                        Map.Entry::getKey, // key value
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // if the values are same then take the first value
                        LinkedHashMap::new)); // linkedHashMap to maintain the order

        System.out.println(result);
    }
}
