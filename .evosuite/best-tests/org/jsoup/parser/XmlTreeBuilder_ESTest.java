/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 23:31:32 GMT 2022
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.parser.ParseErrorList;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Token;
import org.jsoup.parser.XmlTreeBuilder;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class XmlTreeBuilder_ESTest extends XmlTreeBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      assertNotNull(xmlTreeBuilder0);
      
      Document document0 = xmlTreeBuilder0.parse("JM85(*~2xt", "h");
      assertNotNull(document0);
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertFalse(document0.isBlock());
      assertEquals("h", document0.baseUri());
      assertEquals("#document", document0.nodeName());
      assertEquals(0, document0.siblingIndex());
      assertEquals("#root", document0.tagName());
      assertEquals(1, document0.childNodeSize());
      assertFalse(document0.hasParent());
      assertEquals("h", document0.location());
      assertFalse(document0.updateMetaCharsetElement());
      
      boolean boolean0 = xmlTreeBuilder0.processEndTag("\"");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      assertNotNull(xmlTreeBuilder0);
      
      Token.CData token_CData0 = new Token.CData("~J$O@@>Z(.P5i.I");
      assertNotNull(token_CData0);
      
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.insert(token_CData0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      assertNotNull(xmlTreeBuilder0);
      
      Token.Comment token_Comment0 = new Token.Comment();
      assertNotNull(token_Comment0);
      
      token_Comment0.bogus = true;
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.insert(token_Comment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      assertNotNull(xmlTreeBuilder0);
      
      Token.Doctype token_Doctype0 = new Token.Doctype();
      assertNotNull(token_Doctype0);
      assertEquals("", token_Doctype0.getSystemIdentifier());
      assertFalse(token_Doctype0.isForceQuirks());
      
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.process(token_Doctype0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.XmlTreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      assertNotNull(xmlTreeBuilder0);
      
      Token.Comment token_Comment0 = new Token.Comment();
      assertNotNull(token_Comment0);
      
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.process(token_Comment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.TreeBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      assertNotNull(xmlTreeBuilder0);
      
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.processStartTag("AfterAttributeValue_quoted");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.parser.Tag", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      assertNotNull(xmlTreeBuilder0);
      
      Document document0 = xmlTreeBuilder0.parse("attributeDoubleValueCharsSorted", "attributeDoubleValueCharsSorted");
      assertNotNull(document0);
      assertFalse(document0.isBlock());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("attributeDoubleValueCharsSorted", document0.location());
      assertFalse(document0.hasParent());
      assertEquals(1, document0.childNodeSize());
      assertEquals("attributeDoubleValueCharsSorted", document0.baseUri());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(0, document0.siblingIndex());
      assertEquals("#document", document0.nodeName());
      assertEquals("#root", document0.tagName());
      
      boolean boolean0 = xmlTreeBuilder0.processStartTag("AfterAttributeValue_quoted");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      assertNotNull(xmlTreeBuilder0);
      
      PipedReader pipedReader0 = new PipedReader();
      assertNotNull(pipedReader0);
      
      // Undeclared exception!
      try { 
        xmlTreeBuilder0.parse(pipedReader0, "=<");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      xmlTreeBuilder0.parseFragment("", "", parseErrorList0, parseSettings0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      XmlTreeBuilder xmlTreeBuilder0 = new XmlTreeBuilder();
      ParseSettings parseSettings0 = xmlTreeBuilder0.defaultSettings();
      assertNotNull(parseSettings0);
  }
}
