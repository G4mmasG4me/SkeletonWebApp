package com.develogical;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class QueryProcessorTest {

  QueryProcessor queryProcessor = new QueryProcessor();

  @Test
  public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
    assertThat(queryProcessor.process("test"), is(""));
  }

  @Test
  public void plusMethod() throws Exception {
    // print queryProcess.process
    System.out.println(queryProcessor.process("What is 23 plus 33?"));
    assertThat(queryProcessor.process("What is 23 plus 33?"), containsString("56"));

  }

  @Test
  public void largestMethod() throws Exception {
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 42, 50, 77?"), containsString("77"));
  }
  @Test
  public void multiplyMethod() throws Exception {
    // print queryProcess.process
    System.out.println(queryProcessor.process("What is 23 multiplied by 33?"));
    assertThat(queryProcessor.process("What is 23 multiplied by 33?"), containsString("759"));
  }
  @Test
  public void squareAndCubeMethod() throws Exception {
    // print
    System.out.println(queryProcessor.process("Which of the following numbers is both a square and a cube: 4332, 1225, 4455, 652, 1857, 4096, 64?"));
    assertThat(queryProcessor.process("Which of the following numbers is both a square and a cube: 4332, 1225, 4455, 652, 1857, 4096, 64?\t"), containsString("4096"));
  }

  @Test
  public void primeNumberMethod() throws Exception {
    // print
    System.out.println(queryProcessor.process("Which of the following numbers are primes: 2, 79, 34, 66, 83?"));
    assertThat(queryProcessor.process("Which of the following numbers are primes: 2, 79, 34, 66, 83?"), containsString("73"));
  }

  @Test
  public void minusMethod() throws Exception {
    // print
    System.out.println(queryProcessor.process("What is 46 minus 3?"));
    assertThat(queryProcessor.process("What is 46 minus 3?"), containsString("43"));
  }
}
