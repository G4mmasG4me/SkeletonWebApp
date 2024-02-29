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
    System.out.println("test");
    System.out.println(queryProcessor.process("Which of the following numbers is both a square and a cube: 117, 125, 4096, 1948, 2876, 4473, 441?"));
    assertThat(queryProcessor.process("Which of the following numbers is both a square and a cube: 117, 125, 4096, 1948, 2876, 4473, 441?"), containsString("64"));
  }

}
