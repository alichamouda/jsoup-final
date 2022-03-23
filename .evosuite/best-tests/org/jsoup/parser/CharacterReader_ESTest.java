/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 23:26:34 GMT 2022
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.StringReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.CharacterReader;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CharacterReader_ESTest extends CharacterReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      char[] charArray0 = new char[4];
      boolean boolean0 = CharacterReader.rangeEquals(charArray0, 1, 1, "b");
      assertEquals(4, charArray0.length);
      assertFalse(boolean0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("N!y@;a");
      assertNotNull(stringReader0);
      
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeLetterSequence();
      assertEquals("N", string0);
      assertEquals(1, characterReader0.pos());
      assertNotNull(string0);
      
      String string1 = characterReader0.consumeData();
      assertEquals("!y@;a", string1);
      assertEquals(6, characterReader0.pos());
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("b;w 3[<<9c");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeLetterThenDigitSequence();
      assertEquals("b", string0);
      assertEquals(1, characterReader0.pos());
      assertNotNull(string0);
      
      characterReader0.rewindToMark();
      assertEquals(0, characterReader0.pos());
      
      String string1 = characterReader0.consumeLetterSequence();
      assertEquals("b", string1);
      assertEquals(1, characterReader0.pos());
      assertNotNull(string1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader(";H+");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      boolean boolean0 = characterReader0.containsIgnoreCase(";H+");
      assertTrue(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("aw!:e");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      boolean boolean0 = characterReader0.containsIgnoreCase("aw!:e");
      assertTrue(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("u#v:y[e %rNBCc");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      boolean boolean0 = characterReader0.matchConsume("");
      assertTrue(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("0co)}(R7P");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      boolean boolean0 = characterReader0.matchesDigit();
      assertTrue(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("N!y@;a");
      assertNotNull(stringReader0);
      
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeLetterSequence();
      assertEquals("N", string0);
      assertEquals(1, characterReader0.pos());
      assertNotNull(string0);
      
      boolean boolean0 = characterReader0.matchesDigit();
      assertFalse(boolean0);
      assertEquals(1, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      assertNotNull(stringReader0);
      
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      boolean boolean0 = characterReader0.matchesDigit();
      assertFalse(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("l!x4m4Uy2VH ");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      boolean boolean0 = characterReader0.matchesLetter();
      assertTrue(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("N!9iL5L}?\"=q;F>0'W");
      assertNotNull(stringReader0);
      
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 1);
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      boolean boolean0 = characterReader0.matchesLetter();
      assertTrue(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("(FG#$-~?0}~Q@Xuj");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeData();
      assertEquals("(FG#$-~?0}~Q@Xuj", string0);
      assertEquals(16, characterReader0.pos());
      assertNotNull(string0);
      
      boolean boolean0 = characterReader0.matchesLetter();
      assertFalse(boolean0);
      assertEquals(16, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("|nm|puak\"'^^}");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      boolean boolean0 = characterReader0.matchesLetter();
      assertFalse(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("(FG#$-~?0}~Q@Xuj");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      char[] charArray0 = new char[2];
      charArray0[0] = '(';
      boolean boolean0 = characterReader0.matchesAnySorted(charArray0);
      assertEquals(2, charArray0.length);
      assertTrue(boolean0);
      assertEquals(0, characterReader0.pos());
      assertArrayEquals(new char[] {'(', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("3<I/jW9iU3xC'S");
      assertNotNull(stringReader0);
      
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      char[] charArray0 = new char[7];
      boolean boolean0 = characterReader0.matchesAnySorted(charArray0);
      assertEquals(7, charArray0.length);
      assertFalse(boolean0);
      assertEquals(0, characterReader0.pos());
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("(FG#$-~?0}~Q@Xuj");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      char[] charArray0 = new char[2];
      String string0 = characterReader0.consumeData();
      assertEquals("(FG#$-~?0}~Q@Xuj", string0);
      assertEquals(16, characterReader0.pos());
      assertNotNull(string0);
      
      boolean boolean0 = characterReader0.matchesAny(charArray0);
      assertEquals(2, charArray0.length);
      assertFalse(boolean0);
      assertEquals(16, characterReader0.pos());
      assertArrayEquals(new char[] {'\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("bm1_CvPd @");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      char[] charArray0 = new char[5];
      boolean boolean0 = characterReader0.matchesAny(charArray0);
      assertEquals(5, charArray0.length);
      assertFalse(boolean0);
      assertEquals(0, characterReader0.pos());
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("AdpOt9>T1C$X>X zZ");
      assertNotNull(stringReader0);
      
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      boolean boolean0 = characterReader0.matchConsumeIgnoreCase("AdpOt9>T1C$X>X zZ");
      assertTrue(boolean0);
      assertEquals(17, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringReader stringReader0 = new StringReader("AdpOt9>T1C$X>X zZ");
      assertNotNull(stringReader0);
      
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      boolean boolean0 = characterReader0.matchConsumeIgnoreCase("SQ|7IKi-");
      assertFalse(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("5w!:e");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeTagName();
      assertEquals("5w!:e", string0);
      assertEquals(5, characterReader0.pos());
      assertNotNull(string0);
      
      boolean boolean0 = characterReader0.matchConsumeIgnoreCase("5w!:e");
      assertFalse(boolean0);
      assertEquals(5, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("b;w n[<9");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeLetterThenDigitSequence();
      assertEquals("b", string0);
      assertEquals(1, characterReader0.pos());
      assertNotNull(string0);
      
      boolean boolean0 = characterReader0.matches("b");
      assertFalse(boolean0);
      assertEquals(1, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("|nm|puak\"'^^}");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeTagName();
      assertEquals("|nm|puak\"'^^}", string0);
      assertEquals(13, characterReader0.pos());
      assertNotNull(string0);
      
      boolean boolean0 = characterReader0.matchConsume("nm|puak\"'^^}");
      assertFalse(boolean0);
      assertEquals(13, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("b;w n[<9");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      boolean boolean0 = characterReader0.matches("b");
      assertTrue(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("(FG#$-~?0}~Q@Xuj");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      boolean boolean0 = characterReader0.matches('(');
      assertTrue(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("org.jsoup.parser.CharacterReader");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      boolean boolean0 = characterReader0.matches('.');
      assertFalse(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      boolean boolean0 = characterReader0.matches('_');
      assertFalse(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("org.jsoup.parser.CharacterReader");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeLetterThenDigitSequence();
      assertEquals("org", string0);
      assertEquals(3, characterReader0.pos());
      assertNotNull(string0);
      
      String string1 = characterReader0.consumeDigitSequence();
      assertEquals("", string1);
      assertEquals(3, characterReader0.pos());
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      StringReader stringReader0 = new StringReader("3<I/jW9iU3xC'S");
      assertNotNull(stringReader0);
      
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeDigitSequence();
      assertEquals("3", string0);
      assertEquals(1, characterReader0.pos());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("|nm|puak\"'^^}");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeTagName();
      assertEquals("|nm|puak\"'^^}", string0);
      assertEquals(13, characterReader0.pos());
      assertNotNull(string0);
      
      String string1 = characterReader0.consumeDigitSequence();
      assertEquals("", string1);
      assertEquals(13, characterReader0.pos());
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.jsoup.parser.CharacterReader");
      assertNotNull(stringReader0);
      
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 9);
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeHexSequence();
      assertEquals("", string0);
      assertEquals(0, characterReader0.pos());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringReader stringReader0 = new StringReader("aD,Jda+WFL[4wH");
      assertNotNull(stringReader0);
      
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 24576);
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeHexSequence();
      assertEquals("aD", string0);
      assertEquals(2, characterReader0.pos());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("l!x4m4Uy2VH ");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeTagName();
      assertEquals("l!x4m4Uy2VH", string0);
      assertEquals(11, characterReader0.pos());
      assertNotNull(string0);
      
      String string1 = characterReader0.consumeHexSequence();
      assertEquals("", string1);
      assertEquals(11, characterReader0.pos());
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("org.jsoup.parser.CharacterReader");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      char[] charArray0 = new char[4];
      String string0 = characterReader0.consumeToAny(charArray0);
      assertEquals(4, charArray0.length);
      assertEquals("org.jsoup.parser.CharacterReader", string0);
      assertEquals(32, characterReader0.pos());
      assertNotNull(string0);
      assertArrayEquals(new char[] {'\u0000', '\u0000', '\u0000', '\u0000'}, charArray0);
      
      String string1 = characterReader0.consumeHexSequence();
      assertEquals("", string1);
      assertEquals(32, characterReader0.pos());
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      StringReader stringReader0 = new StringReader("N!y@;a");
      assertNotNull(stringReader0);
      
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeLetterThenDigitSequence();
      assertEquals("N", string0);
      assertEquals(1, characterReader0.pos());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{RZT4(AeED|0v8/d`");
      assertNotNull(stringReader0);
      
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 38);
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeLetterThenDigitSequence();
      assertEquals("", string0);
      assertEquals(0, characterReader0.pos());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("H2Zmmf[J+La#");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeLetterThenDigitSequence();
      assertEquals("H2", string0);
      assertEquals(2, characterReader0.pos());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("b;w 3[<<9c");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeLetterThenDigitSequence();
      assertEquals("b", string0);
      assertEquals(1, characterReader0.pos());
      assertNotNull(string0);
      
      boolean boolean0 = characterReader0.matchesLetter();
      assertFalse(boolean0);
      assertEquals(1, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("|nm|puak\"'^^}");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeTagName();
      assertEquals("|nm|puak\"'^^}", string0);
      assertEquals(13, characterReader0.pos());
      assertNotNull(string0);
      
      String string1 = characterReader0.consumeLetterThenDigitSequence();
      assertEquals("", string1);
      assertEquals(13, characterReader0.pos());
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      StringReader stringReader0 = new StringReader("af+$kqlI+QT}~v9=W");
      assertNotNull(stringReader0);
      
      char[] charArray0 = new char[9];
      int int0 = stringReader0.read(charArray0);
      assertEquals(9, charArray0.length);
      assertEquals(9, int0);
      assertArrayEquals(new char[] {'a', 'f', '+', '$', 'k', 'q', 'l', 'I', '+'}, charArray0);
      
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeLetterSequence();
      assertEquals("QT", string0);
      assertEquals(2, characterReader0.pos());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("|nm|puak\"'^^}");
      assertEquals(0, characterReader0.pos());
      assertNotNull(characterReader0);
      
      String string0 = characterReader0.consumeTagName();
      assertEquals("|nm|puak\"'^^}", string0);
      assertEquals(13, characterReader0.pos());
      assertNotNull(string0);
      
      String string1 = characterReader0.consumeLetterSequence();
      assertEquals("", string1);
      assertEquals(13, characterReader0.pos());
      assertNotNull(string1);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("bm1_CvPd @");
      characterReader0.consumeLetterSequence();
      characterReader0.consumeHexSequence();
      characterReader0.advance();
      characterReader0.consumeLetterSequence();
      characterReader0.consumeTagName();
      assertEquals(8, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      StringReader stringReader0 = new StringReader("MyL{;i>&n}SZ,4vXM");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      characterReader0.consumeTagName();
      assertEquals(6, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      StringReader stringReader0 = new StringReader("3<I/jW9iU3xC'S");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      characterReader0.consumeTagName();
      assertEquals(3, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("|nm|puak\"'^^}");
      characterReader0.consumeTagName();
      characterReader0.consumeData();
      assertEquals(13, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("b;w<o[<$Ec");
      characterReader0.consumeData();
      assertEquals(3, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      StringReader stringReader0 = new StringReader("{&v.j");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      characterReader0.consumeData();
      assertEquals(1, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("(FG#$-~?0}~Q@Xuj");
      char[] charArray0 = new char[2];
      charArray0[0] = '(';
      characterReader0.consumeToAnySorted(charArray0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("5Yv!it($$");
      char[] charArray0 = new char[1];
      characterReader0.consumeToAnySorted(charArray0);
      assertEquals(9, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("(FG#$-~?0}~Q@Xuj");
      char[] charArray0 = new char[2];
      charArray0[0] = '(';
      characterReader0.consumeToAny(charArray0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("5Yv!it($$");
      char[] charArray0 = new char[1];
      characterReader0.consumeToAny(charArray0);
      characterReader0.matchesAnySorted(charArray0);
      assertEquals(9, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("(FG#$-~?0}~Q@Xuj");
      String string0 = characterReader0.consumeTo("(FG#$-~?0}~Q@Xuj");
      assertEquals("", string0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      StringReader stringReader0 = new StringReader("N!9iL5L}?\"=q;F>0'W");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 1);
      characterReader0.consumeTo('Q');
      characterReader0.consumeTo('Q');
      characterReader0.consumeTo("");
      assertEquals(3, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("org.jsoup.parser.CharacterReader");
      characterReader0.consumeTo('.');
      assertEquals(3, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      StringReader stringReader0 = new StringReader("org.jsoup.parser.CharacterReader");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      boolean boolean0 = characterReader0.containsIgnoreCase("org.jsoup.parser.CharacterReader");
      assertEquals(0, characterReader0.pos());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("|nm|puak\"'^^}");
      characterReader0.consumeTagName();
      char char0 = characterReader0.consume();
      assertEquals(14, characterReader0.pos());
      assertEquals('\uFFFF', char0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("|nm|puak\"'^^}");
      char char0 = characterReader0.consume();
      assertEquals(1, characterReader0.pos());
      assertEquals('|', char0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("bm1_CvPd @");
      characterReader0.consumeData();
      char char0 = characterReader0.current();
      assertEquals(10, characterReader0.pos());
      assertEquals('\uFFFF', char0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("|nm|puak\"'^^}");
      char char0 = characterReader0.current();
      assertEquals(0, characterReader0.pos());
      assertEquals('|', char0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("bm1_CvPd @");
      boolean boolean0 = characterReader0.matchesDigit();
      assertFalse(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      StringReader stringReader0 = new StringReader("k");
      CharacterReader characterReader0 = new CharacterReader(stringReader0, 65535);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("b;w<o[<$Ec");
      int int0 = characterReader0.pos();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("0co)}(R7P");
      boolean boolean0 = characterReader0.rangeEquals(1, 13, "]{Mo");
      assertFalse(boolean0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("bm1_CvPd @");
      String string0 = characterReader0.toString();
      assertEquals("bm1_CvPd @", string0);
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("|nm|puak\"'^^}");
      characterReader0.unconsume();
      assertEquals((-1), characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CharacterReader characterReader0 = new CharacterReader("0co)}(R7P");
      characterReader0.mark();
      assertEquals(0, characterReader0.pos());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      StringReader stringReader0 = new StringReader("MmqFE'3,WE=)CF%uz");
      CharacterReader characterReader0 = new CharacterReader(stringReader0);
      char[] charArray0 = new char[8];
      charArray0[0] = 'M';
      boolean boolean0 = characterReader0.matchesAny(charArray0);
      assertEquals(0, characterReader0.pos());
      assertTrue(boolean0);
  }
}
