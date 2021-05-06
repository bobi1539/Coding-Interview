package com.zero.programmer;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

  public void fizzBuzz(int total){

    for (int i = 1; i <= total; i++) {

      if (i % 3 == 0 && i % 5 == 0){
        System.out.println("FizzBuzz");
      } else if (i % 3 == 0){
        System.out.println("Fizz");
      } else if (i % 5 == 0){
        System.out.println("Buzz");
      } else {
        System.out.println(i);
      }

    }

  }

  @Test
  void fizzBuzzTest(){
    fizzBuzz(110);
  }

}
