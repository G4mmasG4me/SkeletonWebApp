package com.develogical;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    if (query.toLowerCase().contains("shakespeare")) {
      return "William Shakespeare (26 April 1564 - 23 April 1616) was an "
          + "English poet, playwright, and actor, widely regarded as the greatest "
          + "writer in the English language and the world's pre-eminent dramatist.";
    }
    else if (query.toLowerCase().contains("darwin")) {
      return "Charles Robert Darwin, FRS FRGS FLS FZS was an English naturalist, "
          + "geologist and biologist, best known for his contributions to the science "
          + "of evolution!";
    }
    return "";
  }
}
