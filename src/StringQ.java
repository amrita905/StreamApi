import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringQ {

    public static void main(String[] args) {

        String s="Hello World";
        // result olleH dlroW

        String[] l = s.split(" "); // return type of split method is String[]

        String result =Arrays.stream(l) // convert the array into stream
                .map(w -> new StringBuilder(w).reverse().toString()) // w is string. make it stringbuilder and reverse it and then  make it string
                .collect(Collectors.joining(" ")); // join the strings with space

        System.out.println(result);

    }

}
