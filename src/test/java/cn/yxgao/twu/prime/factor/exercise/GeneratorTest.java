package cn.yxgao.twu.prime.factor.exercise;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.Collections.emptyList;
import static org.junit.Assert.*;

public class GeneratorTest {

  private Generator generator;

  @Before
  public void setUp() throws Exception {
    generator = new Generator();
  }

  @Test
  public void should_return_empty_list_when_given_1() throws Exception {
    List<Integer> factors = generator.generate(1);
    assertEquals(factors, emptyList());
  }

  @Test
  public void shuld_return_expect_list_when_given_30() throws Exception {
    List<Integer> expectFactors = Arrays.asList(2, 3, 5);
    List<Integer> factors = generator.generate(30);
    assertEquals(expectFactors, factors);
  }
}