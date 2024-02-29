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
  public void knowsAboutShakespeare() throws Exception {
    // print queryProcess.process
    System.out.println(queryProcessor.process("What is 23 plus 33?"));
    assertThat(queryProcessor.process("What is 23 plus 33?"), containsString("56"));

  }

  @Test
  public void knowsAboutDarwin() throws Exception {
    assertThat(queryProcessor.process("Which of the following numbers is the largest: 42, 50, 77?"), containsString("77"));
  }

}
