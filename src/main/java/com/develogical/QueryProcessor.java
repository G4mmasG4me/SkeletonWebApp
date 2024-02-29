package com.develogical;

import static java.lang.Math.abs;

public class QueryProcessor {

  public String process(String query) {

    System.out.println("Received query:" + query);

    // if first word of query equals "what"
    if (query.toLowerCase().startsWith("what is") && query.toLowerCase().contains("plus")) {
        // return 2nd word in query + 4th word in query
        String[] words = query.split(" ");

        return Integer.toString(Integer.parseInt(words[2]) + Integer.parseInt(words[4].replace("?", "")));
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
    else if (query.toLowerCase().startsWith("what is") && query.toLowerCase().contains("multiplied")) {
          String[] words = query.split(" ");

          return Integer.toString(Integer.parseInt(words[2]) * Integer.parseInt(words[5].replace("?", "")));
      }
    else if (query.toLowerCase().startsWith("which of the following numbers is both a square and a cube")) {
        String[] words = query.split(" ");
        String num1 = words[12].replace(",", "");
        String num2 = words[13].replace(",", "");
        String num3 = words[14].replace(",", "");
        String num4 = words[15].replace(",", "");
        String num5 = words[16].replace(",", "");
        String num6 = words[17].replace(",", "");
        String num7 = words[18].replace("?", "");
        String[] numbers = {num1, num2, num3, num4, num5, num6, num7};


        for (String number : numbers) {
            // print number
            int num = Integer.parseInt(number);
            // print sqrt and cbrt
            // print num
            // if sqrt and cube root are whole numbers
            if (Math.sqrt(num) % 1 == 0 && Math.cbrt(num) % 1 == 0) {
                return number;
            }
        }
      }
    else if (query.toLowerCase().contains("what is your name?")) {
        return "Team Dom";
      }
    else if (query.toLowerCase().contains("which of the following numbers are primes")) {
        String[] words = query.split(" ");
        // print words

        String num1 = words[7].replace(",", "");
        String num2 = words[8].replace(",", "");
        String num3 = words[9].replace(",", "");
        String num4 = words[10].replace(",", "");
        String num5 = words[11].replace("?", "");
        // print

        String[] numbers = {num1, num2, num3, num4, num5};

        // calculate the prime number
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (isPrime(num)) {
                return number;
            }
        }
    }

    return "";
  }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
