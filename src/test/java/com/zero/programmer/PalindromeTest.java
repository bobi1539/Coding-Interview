package com.zero.programmer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

  public boolean isPalindromeOne(String value){

    String temporary = "";
    for (int i = value.length()-1; i >= 0; i--) {
      temporary = temporary + value.charAt(i);
    }
    return temporary.equals(value);

  }

  public boolean isPalindromeTwo(String value){

    for (int i = 0; i < value.length()/2; i++) {
      if (value.charAt(i) != value.charAt(value.length() - i - 1)){
        return false;
      }
    }

    return true;
  }

  public boolean helpIsPalindromeThree(String value, int index){

    if (index < value.length()){
      if (value.charAt(index) != value.charAt(value.length() - index - 1)){
        return false;
      } else {
        index += 1;
        return helpIsPalindromeThree(value,index);
      }
    } else {
      return true;
    }

  }

  public boolean isPalindromeThree(String value){
    // menggunakan rekursif
    return helpIsPalindromeThree(value, 0);
  }

  @Test
  void palindromeOneTest(){
    assertTrue(isPalindromeOne("a"));
    assertTrue(isPalindromeOne("aba"));
    assertTrue(isPalindromeOne("malam"));
    assertTrue(isPalindromeOne("kaak"));

    assertFalse(isPalindromeOne("ab"));
    assertFalse(isPalindromeOne("abab"));
    assertFalse(isPalindromeOne("kamis"));
    assertFalse(isPalindromeOne("eko"));
  }

  @Test
  void palindromeTwoTest(){
    assertTrue(isPalindromeTwo("a"));
    assertTrue(isPalindromeTwo("aba"));
    assertTrue(isPalindromeTwo("malam"));
    assertTrue(isPalindromeTwo("kaak"));

    assertFalse(isPalindromeTwo("ab"));
    assertFalse(isPalindromeTwo("abab"));
    assertFalse(isPalindromeTwo("kamis"));
    assertFalse(isPalindromeTwo("eko"));
  }

  @Test
  void palindromeThreeTest() {
    assertTrue(isPalindromeThree("a"));
    assertTrue(isPalindromeThree("aba"));
    assertTrue(isPalindromeThree("malam"));
    assertTrue(isPalindromeThree("kaak"));
    assertTrue(isPalindromeThree("kodok"));

    assertFalse(isPalindromeThree("ab"));
    assertFalse(isPalindromeThree("abab"));
    assertFalse(isPalindromeThree("kamis"));
    assertFalse(isPalindromeThree("eko"));
  }
}
