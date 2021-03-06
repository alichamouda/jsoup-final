/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 23:30:06 GMT 2022
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Attributes_ESTest extends Attributes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attributes attributes1 = attributes0.clone();
      assertNotNull(attributes1);
      assertEquals(0, attributes0.size());
      assertEquals(0, attributes1.size());
      assertTrue(attributes1.equals((Object)attributes0));
      assertNotSame(attributes0, attributes1);
      assertNotSame(attributes1, attributes0);
      
      boolean boolean0 = attributes1.equals(attributes0);
      assertTrue(boolean0);
      assertEquals(0, attributes0.size());
      assertEquals(0, attributes1.size());
      assertTrue(attributes0.equals((Object)attributes1));
      assertTrue(attributes1.equals((Object)attributes0));
      assertNotSame(attributes0, attributes1);
      assertNotSame(attributes1, attributes0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attribute attribute0 = Attribute.createFromEncoded("Rio Y7d5O9Yv9S", "Rio Y7d5O9Yv9S");
      assertNotNull(attribute0);
      assertEquals("Rio Y7d5O9Yv9S", attribute0.getValue());
      assertEquals("Rio Y7d5O9Yv9S", attribute0.getKey());
      
      Attributes attributes1 = attributes0.put(attribute0);
      assertNotNull(attributes1);
      assertEquals(1, attributes0.size());
      assertEquals("Rio Y7d5O9Yv9S", attribute0.getValue());
      assertEquals("Rio Y7d5O9Yv9S", attribute0.getKey());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      
      Attributes attributes2 = attribute0.parent.clone();
      assertNotNull(attributes2);
      assertEquals("Rio Y7d5O9Yv9S", attribute0.getValue());
      assertEquals("Rio Y7d5O9Yv9S", attribute0.getKey());
      assertEquals(1, attributes2.size());
      assertFalse(attributes2.equals((Object)attributes1));
      assertFalse(attributes2.equals((Object)attributes0));
      assertNotSame(attributes2, attributes1);
      assertNotSame(attributes2, attributes0);
      
      boolean boolean0 = attributes0.equals(attributes2);
      assertFalse(boolean0);
      assertEquals(1, attributes0.size());
      assertEquals("Rio Y7d5O9Yv9S", attribute0.getValue());
      assertEquals("Rio Y7d5O9Yv9S", attribute0.getKey());
      assertEquals(1, attributes2.size());
      assertFalse(attributes0.equals((Object)attributes2));
      assertFalse(attributes2.equals((Object)attributes1));
      assertFalse(attributes2.equals((Object)attributes0));
      assertSame(attributes0, attributes1);
      assertNotSame(attributes0, attributes2);
      assertNotSame(attributes2, attributes1);
      assertNotSame(attributes2, attributes0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Object object0 = new Object();
      assertNotNull(object0);
      
      boolean boolean0 = attributes0.equals(object0);
      assertFalse(boolean0);
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      boolean boolean0 = attributes0.equals((Object) null);
      assertFalse(boolean0);
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attribute attribute0 = new Attribute("=\"", (String) null, attributes0);
      assertNotNull(attribute0);
      assertEquals(0, attributes0.size());
      assertNull(attribute0.getValue());
      assertEquals("=\"", attribute0.getKey());
      
      Attributes attributes1 = attributes0.put(attribute0);
      assertNotNull(attributes1);
      assertEquals(1, attributes0.size());
      assertNull(attribute0.getValue());
      assertEquals("=\"", attribute0.getKey());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      
      StringWriter stringWriter0 = new StringWriter(97);
      assertNotNull(stringWriter0);
      assertEquals("", stringWriter0.toString());
      
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      assertNotNull(document_OutputSettings0);
      assertFalse(document_OutputSettings0.outline());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
      assertTrue(document_OutputSettings0.prettyPrint());
      
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      assertNotNull(document_OutputSettings1);
      assertEquals(Document.OutputSettings.Syntax.xml, document_OutputSettings0.syntax());
      assertFalse(document_OutputSettings0.outline());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertTrue(document_OutputSettings0.prettyPrint());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings1.escapeMode());
      assertEquals(1, document_OutputSettings1.indentAmount());
      assertEquals(Document.OutputSettings.Syntax.xml, document_OutputSettings1.syntax());
      assertFalse(document_OutputSettings1.outline());
      assertTrue(document_OutputSettings1.prettyPrint());
      assertSame(document_OutputSettings0, document_OutputSettings1);
      assertSame(document_OutputSettings1, document_OutputSettings0);
      
      attributes1.html((Appendable) stringWriter0, document_OutputSettings1);
      assertEquals(1, attributes0.size());
      assertNull(attribute0.getValue());
      assertEquals("=\"", attribute0.getKey());
      assertEquals(1, attributes1.size());
      assertEquals(" =\"=\"\"", stringWriter0.toString());
      assertEquals(Document.OutputSettings.Syntax.xml, document_OutputSettings0.syntax());
      assertFalse(document_OutputSettings0.outline());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertTrue(document_OutputSettings0.prettyPrint());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings1.escapeMode());
      assertEquals(1, document_OutputSettings1.indentAmount());
      assertEquals(Document.OutputSettings.Syntax.xml, document_OutputSettings1.syntax());
      assertFalse(document_OutputSettings1.outline());
      assertTrue(document_OutputSettings1.prettyPrint());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      assertSame(document_OutputSettings0, document_OutputSettings1);
      assertSame(document_OutputSettings1, document_OutputSettings0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attributes attributes1 = attributes0.put(". B'WoL;W#6<#", true);
      assertNotNull(attributes1);
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      
      String string0 = attributes1.html();
      assertEquals(" . B'WoL;W#6<#", string0);
      assertNotNull(string0);
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attributes attributes1 = attributes0.put("Rio Y7d5O9Yv9S", "Rio Y7d5O9Yv9S");
      assertNotNull(attributes1);
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      
      String string0 = attributes0.html();
      assertEquals(" Rio Y7d5O9Yv9S=\"Rio Y7d5O9Yv9S\"", string0);
      assertNotNull(string0);
      assertEquals(1, attributes0.size());
      assertSame(attributes0, attributes1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attributes attributes1 = attributes0.put("", true);
      assertNotNull(attributes1);
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      
      // Undeclared exception!
      try { 
        attributes0.asList();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attribute attribute0 = new Attribute("MX:kg(UYn25^`[Knhp!", "uOX{x!O");
      assertNotNull(attribute0);
      assertEquals("MX:kg(UYn25^`[Knhp!", attribute0.getKey());
      assertEquals("uOX{x!O", attribute0.getValue());
      
      Attributes attributes1 = attributes0.put(attribute0);
      assertNotNull(attributes1);
      assertEquals(1, attributes0.size());
      assertEquals("MX:kg(UYn25^`[Knhp!", attribute0.getKey());
      assertEquals("uOX{x!O", attribute0.getValue());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      
      List<Attribute> list0 = attributes0.asList();
      assertNotNull(list0);
      assertEquals(1, attributes0.size());
      assertEquals(1, list0.size());
      assertFalse(list0.isEmpty());
      assertTrue(list0.contains(attribute0));
      assertSame(attributes0, attributes1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      boolean boolean0 = attributes0.hasKeyIgnoreCase("rUfeD,otx@%<OUG_");
      assertFalse(boolean0);
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attributes attributes1 = attributes0.put("Rio Y7d5O9Yv9S", "Rio Y7d5O9Yv9S");
      assertNotNull(attributes1);
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      
      boolean boolean0 = attributes0.hasKey("Rio Y7d5O9Yv9S");
      assertTrue(boolean0);
      assertEquals(1, attributes0.size());
      assertSame(attributes0, attributes1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      boolean boolean0 = attributes0.hasKey(" Rio Y7d5O9Yv9S=\"kwou*p_\"");
      assertFalse(boolean0);
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      attributes0.removeIgnoreCase("Y;Po_nh-yhbGM}");
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attributes attributes1 = attributes0.put("", true);
      assertNotNull(attributes1);
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      
      attributes0.remove("");
      assertEquals(0, attributes0.size());
      assertSame(attributes0, attributes1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attributes attributes1 = attributes0.put("Y;Po_nh-yhbGM}", true);
      assertNotNull(attributes1);
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      
      Attributes attributes2 = attributes1.put("", "");
      assertNotNull(attributes2);
      assertEquals(2, attributes0.size());
      assertEquals(2, attributes1.size());
      assertEquals(2, attributes2.size());
      assertSame(attributes0, attributes2);
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      assertSame(attributes1, attributes2);
      assertSame(attributes2, attributes1);
      assertSame(attributes2, attributes0);
      
      attributes1.removeIgnoreCase("Y;Po_nh-yhbGM}");
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes2);
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      assertSame(attributes1, attributes2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attributes attributes1 = attributes0.put("", false);
      assertNotNull(attributes1);
      assertEquals(0, attributes0.size());
      assertEquals(0, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attributes attributes1 = attributes0.put("h&/= 'vp,!XUQ;", true);
      assertNotNull(attributes1);
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      
      attributes0.normalize();
      assertEquals(1, attributes0.size());
      assertSame(attributes0, attributes1);
      
      attributes0.putIgnoreCase("h&/= 'vp,!XUQ;", (String) null);
      assertEquals(1, attributes0.size());
      assertSame(attributes0, attributes1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attribute attribute0 = Attribute.createFromEncoded("Rio Y7d5O9Yv9S", "Rio Y7d5O9Yv9S");
      assertNotNull(attribute0);
      assertEquals("Rio Y7d5O9Yv9S", attribute0.getKey());
      assertEquals("Rio Y7d5O9Yv9S", attribute0.getValue());
      
      Attributes attributes1 = attributes0.put(attribute0);
      assertNotNull(attributes1);
      assertEquals(1, attributes0.size());
      assertEquals("Rio Y7d5O9Yv9S", attribute0.getKey());
      assertEquals("Rio Y7d5O9Yv9S", attribute0.getValue());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      
      attributes1.putIgnoreCase("Rio Y7d5O9Yv9S", "kwou*p_");
      assertEquals(1, attributes0.size());
      assertEquals("Rio Y7d5O9Yv9S", attribute0.getKey());
      assertEquals("Rio Y7d5O9Yv9S", attribute0.getValue());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      String string0 = attributes0.getIgnoreCase("4s}CHRTVV=TD2fGMf[?");
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      String string0 = attributes0.get("di1#Kh#<8kB%=3uHx");
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attributes attributes1 = attributes0.put("org.jsoup.nodes.Attributes$Dataset$EntrySet", "org.jsoup.nodes.Attributes$Dataset$EntrySet");
      assertNotNull(attributes1);
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      
      String string0 = attributes1.get("org.jsoup.nodes.Attributes$Dataset$EntrySet");
      assertEquals("org.jsoup.nodes.Attributes$Dataset$EntrySet", string0);
      assertNotNull(string0);
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attributes attributes1 = attributes0.put("data-", true);
      assertNotNull(attributes1);
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      
      String string0 = attributes1.getIgnoreCase("data-");
      assertEquals("", string0);
      assertNotNull(string0);
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attributes attributes1 = attributes0.put("", "");
      assertNotNull(attributes1);
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      
      Attributes attributes2 = attributes1.put("FAILED ", "%Z HN");
      assertNotNull(attributes2);
      assertEquals(2, attributes0.size());
      assertEquals(2, attributes1.size());
      assertEquals(2, attributes2.size());
      assertSame(attributes0, attributes2);
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      assertSame(attributes1, attributes2);
      assertSame(attributes2, attributes1);
      assertSame(attributes2, attributes0);
      
      Attributes attributes3 = attributes1.clone();
      assertNotNull(attributes3);
      assertEquals(2, attributes0.size());
      assertEquals(2, attributes1.size());
      assertEquals(2, attributes3.size());
      assertFalse(attributes3.equals((Object)attributes0));
      assertFalse(attributes3.equals((Object)attributes1));
      assertFalse(attributes3.equals((Object)attributes2));
      assertNotSame(attributes0, attributes3);
      assertSame(attributes0, attributes2);
      assertSame(attributes0, attributes1);
      assertNotSame(attributes1, attributes3);
      assertSame(attributes1, attributes0);
      assertSame(attributes1, attributes2);
      assertNotSame(attributes3, attributes0);
      assertNotSame(attributes3, attributes1);
      assertNotSame(attributes3, attributes2);
      
      attributes2.putIgnoreCase("hl/ZEK1z8LJ wnp", "hl/ZEK1z8LJ wnp");
      assertEquals(3, attributes0.size());
      assertEquals(3, attributes1.size());
      assertEquals(3, attributes2.size());
      assertFalse(attributes0.equals((Object)attributes3));
      assertFalse(attributes1.equals((Object)attributes3));
      assertFalse(attributes2.equals((Object)attributes3));
      assertNotSame(attributes0, attributes3);
      assertSame(attributes0, attributes2);
      assertSame(attributes0, attributes1);
      assertNotSame(attributes1, attributes3);
      assertSame(attributes1, attributes0);
      assertSame(attributes1, attributes2);
      assertSame(attributes2, attributes1);
      assertSame(attributes2, attributes0);
      assertNotSame(attributes2, attributes3);
      
      // Undeclared exception!
      try { 
        attributes3.addAll(attributes1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      assertNotNull(attributes0);
      assertEquals(0, attributes0.size());
      
      Attributes attributes1 = attributes0.put(". B'WoL;W#6<#", true);
      assertNotNull(attributes1);
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
      
      attributes1.addAll(attributes0);
      assertEquals(1, attributes0.size());
      assertEquals(1, attributes1.size());
      assertSame(attributes0, attributes1);
      assertSame(attributes1, attributes0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.clone();
      Attribute attribute0 = Attribute.createFromEncoded("Rio Y7d5O9Yv9S", "Rio Y7d5O9Yv9S");
      Attributes attributes2 = attributes0.put(attribute0);
      boolean boolean0 = attributes1.equals(attributes2);
      assertEquals(1, attributes0.size());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.addAll(attributes0);
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.put("", true);
      boolean boolean0 = attributes0.hasKeyIgnoreCase("");
      assertEquals(1, attributes0.size());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.dataset();
      assertEquals(0, attributes0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.toString();
  }
}
