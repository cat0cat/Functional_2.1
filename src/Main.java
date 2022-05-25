import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        // отличительные черты функционального стиля в программе:
        // интерфейс function и монады (Stream API)

        String aboriginal = "sdfdf kljo ksdfs sdfkc kfjurnl";

        Function<String, List<String>> dictionary = (a) ->
                Arrays.stream(a.split(" "))
                        .sorted()
                        .distinct()
                        .toList();
        dictionary.apply(aboriginal).forEach(System.out::println);
    }
}