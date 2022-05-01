package com.s4dx;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


public class FinderTest {


    @Test
    public void whenInputArrayIsEmtpy_shouldResultNull() {

        String[] inputArray = {};
        Finder finder = new Finder(inputArray);
        String[] result = finder.find("sad");

        assertNull(result);
    }

    @Test
    public void whenInputArrayAndTargerIsEmtpy_shouldResulEmpty() {

        String[] inputArray = {""};
        Finder finder = new Finder(inputArray);
        String[] result = finder.find("");
        
        assertNull(result);
    }

    @Test
    public void whenInputArrayHasOneElement_shouldOneElement() {

        String[] inputArray = {"a"};
        Finder finder = new Finder(inputArray);
        String[] result = finder.find("a");

        assertEquals( 1 , result.length);
        assertEquals( "a", result[0]);
    }

    @Test
    public void whenTargetIsEmpty_shouldResultNull() {

        String[] inputArray = {"asd", "asdd", "fre", "glk", "ikm"};
        Finder finder = new Finder(inputArray);
        String[] result = finder.find("");

        assertNull(result);
    }


    @Test
    public void whenArrayIncludesTarget_shouldReturnNonOrderSameWord() {

        String[] inputArray = {"asd", "asdd", "fre", "glk", "ikm"};
        Finder finder = new Finder(inputArray);
        String[] result = finder.find("sad");

        assertEquals( result.length , 1);
        assertEquals( "asd", result[0]);
    }

    @Test
    public void whenArrayIncludesRepetedTarget_shouldReturnNonOrderSameWord() {

        String[] inputArray = {"asd", "asdd", "fre", "glk", "ikm"};
        Finder finder = new Finder(inputArray);
        String[] result = finder.find("sadd");

        assertEquals( result.length , 1);
        assertEquals( "asdd", result[0]);
    }

    @Test
    public void whenArrayIncludesTarget_shouldReturnSameWord() {

        String[] inputArray = {"sad", "asdd", "fre", "glk", "ikm"};
        Finder finder = new Finder(inputArray);
        String[] result = finder.find("sad");

        assertEquals( 1 , result.length);
        assertEquals( "sad", result[0]);
    }

    @Test
    public void whenArrayIncludesTarget_shouldReturnListOfSameWord() {

        String[] inputArray = {"abc", "abd", "abcd", "abce", "abcf", "fbca"};
        Finder finder = new Finder(inputArray);
        String[] result = finder.find("abcf");
        assertEquals( result.length , 2);
        assertEquals( "abcf", result[0]);
        assertEquals( "fbca", result[1]);

    }

    @Test
    public void whenSameStringsNonOrder_shouldReturnTrue() {

        String[] inputArray = {};
        Finder finder = new Finder(inputArray);
        Boolean result = finder.isSameCharacterInNonOrder("abc" , "acb");
        assertTrue( result);

      }

      @RepeatedTest(5000)
      public void whenSameStringsNonOrderRepeated_shouldReturnTrue() {
  
          String[] inputArray = {"afcb", "abc", "abd", "abcd", "abce", "abcf", "fbca"};
          Finder finder = new Finder(inputArray);
          String[] result = finder.find("abcf");
          assertEquals( 3 , result.length);
          assertEquals( "afcb", result[0]);
          assertEquals( "abcf", result[1]);
          assertEquals( "fbca", result[2]);
  
      }
    @Test
    public void whenSameStringsNonOrder_shouldReturnTrueFive() {

        List<String> inputArray = new ArrayList<String>();

        for(int i = 0; i < 1000000; i++){
            inputArray.add("bac");
        }
        for(int i = 0; i < 1000000; i++){
            inputArray.add("acb");
        }

        for(int i = 0; i < 1000000; i++){
            inputArray.add("xyz");
        }
    
        Finder finder = new Finder(inputArray.toArray(new String[inputArray.size()]));
        String[] result = finder.find("abc");
        assertEquals(  2000000 , result.length);

    }



}