package cn.yxgao.twu.prime.factor.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.emptyList;
import static java.util.stream.Collectors.toList;

public class Generator {
  public List<Integer> generate(int n) {
    if (n == 1) {
      return emptyList();
    }
    ArrayList<Integer> factors = new ArrayList<>();
    for (int i = 2; i <= n; i++) {
      while(n >= i) {
        if (n % i != 0) {
          break;
        }
        factors.add(i);
        n = n / i;
      }
    }
    return factors.stream().sorted().collect(toList());
  }
}
