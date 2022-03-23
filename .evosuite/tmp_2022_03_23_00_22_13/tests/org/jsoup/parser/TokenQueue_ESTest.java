/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 23:25:20 GMT 2022
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.TokenQueue;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TokenQueue_ESTest extends TokenQueue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("1dL_+npyx ]");
      tokenQueue0.consumeAttributeKey();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("c+o/yx@i sTAT");
      tokenQueue0.consumeCssIdentifier();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("__");
      tokenQueue0.consumeElementSelector();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("A_lK_0<nm");
      tokenQueue0.consumeTagName();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("QO");
      tokenQueue0.consumeWord();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TokenQueue.unescape(")!O}&Ze\\*<xLbu?:");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("");
      Character character0 = Character.valueOf('Q');
      tokenQueue0.addFirst(character0);
      tokenQueue0.chompBalanced('F', 'Q');
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("\"bo*)#&,]zt0zn");
      tokenQueue0.addFirst("\"bo*)#&,]zt0zn");
      Character character0 = new Character('X');
      tokenQueue0.addFirst(character0);
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('X', 'X');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at '\"bo*)#&,]zt0zn\"bo*)#&,]zt0zn'
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("\"`oj*)#,]ztzn");
      tokenQueue0.addFirst("Did not find balanced marker at '");
      tokenQueue0.consumeElementSelector();
      tokenQueue0.chompBalanced('N', 'N');
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('n', 'N');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at 'ot find balanced marker at '
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("\"`oj*)#,]ztzn");
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('\"', 'l');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at '`oj*)#,]ztzn'
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("'");
      // Undeclared exception!
      try { 
        tokenQueue0.chompBalanced('\'', '\'');
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Did not find balanced marker at ''
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("__");
      tokenQueue0.consumeCssIdentifier();
      tokenQueue0.chompBalanced('D', 'D');
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("FYDUY$z!sJs[ Rzw");
      tokenQueue0.consumeAttributeKey();
      String[] stringArray0 = new String[4];
      stringArray0[0] = "FYDUY$z!sJs[ Rzw";
      stringArray0[1] = "Did not find balanced marker at '";
      stringArray0[2] = "FYDUY$z!sJs[ Rzw";
      stringArray0[3] = "FYDUY$z!sJs[ Rzw";
      tokenQueue0.consumeToAny(stringArray0);
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("c+o/yx@i sTAT");
      String[] stringArray0 = new String[6];
      tokenQueue0.consumeToIgnoreCase("         ");
      tokenQueue0.consumeToAny(stringArray0);
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("c+o/yx@i sTAT");
      tokenQueue0.consumeToIgnoreCase("         ");
      tokenQueue0.consumeAttributeKey();
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("__");
      tokenQueue0.chompToIgnoreCase("Object must not be null");
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("__");
      // Undeclared exception!
      try { 
        tokenQueue0.consume("Npr:T6");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Queue did not match expected sequence
         //
         verifyException("org.jsoup.parser.TokenQueue", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("          ");
      tokenQueue0.consume("");
      assertEquals("          ", tokenQueue0.toString());
      assertEquals(' ', tokenQueue0.peek());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue(")");
      tokenQueue0.advance();
      tokenQueue0.consumeTagName();
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("");
      tokenQueue0.advance();
      assertTrue(tokenQueue0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("Did not find balanced marker at '");
      tokenQueue0.consumeElementSelector();
      boolean boolean0 = tokenQueue0.consumeWhitespace();
      assertEquals('n', tokenQueue0.peek());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("__");
      tokenQueue0.chompTo("Object must not be null");
      assertEquals('\u0000', tokenQueue0.peek());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("taY <d`");
      tokenQueue0.consumeElementSelector();
      tokenQueue0.chompBalanced('b', 'b');
      boolean boolean0 = tokenQueue0.matchesStartTag();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("");
      tokenQueue0.addFirst("\"}");
      boolean boolean0 = tokenQueue0.matchesStartTag();
      assertEquals("\"}", tokenQueue0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("<2/7!@d2");
      boolean boolean0 = tokenQueue0.matchesStartTag();
      assertFalse(boolean0);
      assertEquals('<', tokenQueue0.peek());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("$'@");
      tokenQueue0.chompBalanced('\u0089', '\u0089');
      tokenQueue0.chompBalanced('\u0089', '\u0089');
      boolean boolean0 = tokenQueue0.matchesStartTag();
      assertEquals('@', tokenQueue0.peek());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("__");
      tokenQueue0.consumeCssIdentifier();
      boolean boolean0 = tokenQueue0.consumeWhitespace();
      assertEquals("", tokenQueue0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("");
      char[] charArray0 = new char[4];
      boolean boolean0 = tokenQueue0.matchesAny(charArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("|");
      String[] stringArray0 = new String[3];
      stringArray0[0] = "|";
      String string0 = tokenQueue0.consumeToAny(stringArray0);
      assertFalse(tokenQueue0.isEmpty());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("");
      assertTrue(tokenQueue0.isEmpty());
      
      char char0 = tokenQueue0.peek();
      assertEquals('\u0000', char0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("_Cz'vR");
      char char0 = tokenQueue0.peek();
      assertEquals('_', char0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("Did not find balanced marker at '");
      String string0 = tokenQueue0.toString();
      assertEquals("Did not find balanced marker at '", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("          ");
      tokenQueue0.chompToIgnoreCase("          ");
      assertEquals("", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("          ");
      tokenQueue0.matchesCS("9>cRnAeKvkr");
      assertEquals("          ", tokenQueue0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TokenQueue tokenQueue0 = new TokenQueue("          ");
      tokenQueue0.chompTo("");
      assertEquals("          ", tokenQueue0.toString());
  }
}