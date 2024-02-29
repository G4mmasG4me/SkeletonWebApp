package com.develogical;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    // if first word of query equals "what"
    if (query.toLowerCase().startsWith("what is")) {
        // return 2nd word in query + 4th word in query
        String[] words = query.split(" ");
        return words[2] + words[4];
    }
    else if (query.toLowerCase().startsWith("which of the following numbers is the largest")) {
        String[] words = query.split(" ");
        String num1 = words[8].replace(",", "");
        String num2 = words[9].replace(",", "");
        String num3 = words[10].replace("?", "");
        // convert to intergers
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int n3 = Integer.parseInt(num3);
        // find the largest number
        int max = Math.max(n1, Math.max(n2, n3));
        return Integer.toString(max);
    }

    return "";
  }
}
