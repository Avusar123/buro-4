import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> distinct = new HashSet<>();
        for (int k = 0; k < 30; k++) {
            BigDecimal value = BigDecimal.ONE.divide(BigDecimal.TEN.pow(k));
            distinct.add(value.toPlainString());
        }

        System.out.println(distinct.size());
    }
}