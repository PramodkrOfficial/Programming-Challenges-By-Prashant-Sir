package in.kgcoding.challenge108;

import java.util.List;

public class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs = List.of("Pramod Kumar","is the best Developer","bad", "designer", "Best Programmer",
                "Bad Coder","in programming language", "Bad","student","of Java Development");

        String result = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce("",(a, b) ->  a + " " + b);

        System.out.println(result);
    }
}
