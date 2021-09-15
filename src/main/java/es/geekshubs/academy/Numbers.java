package es.geekshubs.academy;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Arrays;
import java.util.List;

public class Numbers {

  /**
   * Apply Method
   * @param input
   * @return
   */
  public List<String> apply(final List<Integer> input) {
    long positiveCount = input.stream().filter(integer -> integer > 0).count();
    long negativeCount = input.stream().filter(integer -> integer < 0).count();
    long zerosCount = input.stream().filter(integer -> integer == 0).count();

    double l1 = (double) positiveCount / (double) input.size();
    double l2 = (double) negativeCount / (double) input.size();
    double l3 = (double) zerosCount / (double) input.size();

    return Arrays.asList(String.format("%-6s", BigDecimal.valueOf(l1).round(new MathContext(4))).replace(' ', '0'),
            String.format("%-6s", BigDecimal.valueOf(l2).round(new MathContext(4))).replace(' ', '0'),
            String.format("%-6s", BigDecimal.valueOf(l3).round(new MathContext(4))).replace(' ', '0'));
  }

}
