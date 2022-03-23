/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 23:31:42 GMT 2022
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.CharBuffer;
import java.nio.ReadOnlyBufferException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.TextNode;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TextNode_ESTest extends TextNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "'");
      assertNotNull(stringBuilder0);
      assertEquals("'", stringBuilder0.toString());
      
      StringBuilder stringBuilder1 = stringBuilder0.appendCodePoint(32);
      assertNotNull(stringBuilder1);
      assertSame(stringBuilder0, stringBuilder1);
      assertSame(stringBuilder1, stringBuilder0);
      assertEquals("' ", stringBuilder0.toString());
      assertEquals("' ", stringBuilder1.toString());
      
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder0);
      assertSame(stringBuilder0, stringBuilder1);
      assertEquals("' ", stringBuilder0.toString());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(">~h%LQ}[(");
      assertNotNull(stringBuilder0);
      assertEquals(">~h%LQ}[(", stringBuilder0.toString());
      
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder0);
      assertEquals(">~h%LQ}[(", stringBuilder0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(3277);
      assertNotNull(stringBuilder0);
      assertEquals("", stringBuilder0.toString());
      
      boolean boolean0 = TextNode.lastCharIsWhitespace(stringBuilder0);
      assertEquals("", stringBuilder0.toString());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TextNode textNode0 = new TextNode("");
      assertNotNull(textNode0);
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertFalse(textNode0.hasParent());
      
      Document.OutputSettings document_OutputSettings0 = textNode0.getOutputSettings();
      assertNotNull(document_OutputSettings0);
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertFalse(textNode0.hasParent());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
      assertTrue(document_OutputSettings0.prettyPrint());
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertFalse(document_OutputSettings0.outline());
      
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.outline(true);
      assertNotNull(document_OutputSettings1);
      assertSame(document_OutputSettings0, document_OutputSettings1);
      assertSame(document_OutputSettings1, document_OutputSettings0);
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertFalse(textNode0.hasParent());
      assertTrue(document_OutputSettings0.outline());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
      assertTrue(document_OutputSettings0.prettyPrint());
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertEquals(1, document_OutputSettings1.indentAmount());
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings1.syntax());
      assertTrue(document_OutputSettings1.prettyPrint());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings1.escapeMode());
      assertTrue(document_OutputSettings1.outline());
      
      textNode0.outerHtmlHead((Appendable) null, 32, document_OutputSettings0);
      assertSame(document_OutputSettings0, document_OutputSettings1);
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertFalse(textNode0.hasParent());
      assertTrue(document_OutputSettings0.outline());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
      assertTrue(document_OutputSettings0.prettyPrint());
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
      assertEquals(1, document_OutputSettings0.indentAmount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TextNode textNode0 = new TextNode("#C*@\"Dd;(09G=(G~p", "#C*@\"Dd;(09G=(G~p");
      assertNotNull(textNode0);
      assertEquals(0, textNode0.siblingIndex());
      assertEquals("#text", textNode0.nodeName());
      assertFalse(textNode0.hasParent());
      
      textNode0.setSiblingIndex(102);
      assertEquals("#text", textNode0.nodeName());
      assertFalse(textNode0.hasParent());
      assertEquals(102, textNode0.siblingIndex());
      
      String string0 = textNode0.outerHtml();
      assertNotNull(string0);
      assertEquals("#text", textNode0.nodeName());
      assertFalse(textNode0.hasParent());
      assertEquals(102, textNode0.siblingIndex());
      assertEquals("#C*@\"Dd;(09G=(G~p", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("0.0.0.0");
      assertNotNull(textNode0);
      assertFalse(textNode0.hasParent());
      assertEquals(0, textNode0.siblingIndex());
      assertEquals("#text", textNode0.nodeName());
      
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "0.0.0.0");
      assertNotNull(charBuffer0);
      assertFalse(charBuffer0.isDirect());
      assertEquals(7, charBuffer0.remaining());
      assertEquals(7, charBuffer0.capacity());
      assertFalse(charBuffer0.hasArray());
      assertTrue(charBuffer0.isReadOnly());
      assertEquals(0, charBuffer0.position());
      assertEquals(7, charBuffer0.length());
      assertEquals("0.0.0.0", charBuffer0.toString());
      assertEquals(7, charBuffer0.limit());
      assertTrue(charBuffer0.hasRemaining());
      
      Document.OutputSettings document_OutputSettings0 = textNode0.getOutputSettings();
      assertNotNull(document_OutputSettings0);
      assertFalse(textNode0.hasParent());
      assertEquals(0, textNode0.siblingIndex());
      assertEquals("#text", textNode0.nodeName());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
      assertFalse(document_OutputSettings0.outline());
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
      assertTrue(document_OutputSettings0.prettyPrint());
      
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.prettyPrint(false);
      assertNotNull(document_OutputSettings1);
      assertSame(document_OutputSettings0, document_OutputSettings1);
      assertSame(document_OutputSettings1, document_OutputSettings0);
      assertFalse(textNode0.hasParent());
      assertEquals(0, textNode0.siblingIndex());
      assertEquals("#text", textNode0.nodeName());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
      assertFalse(document_OutputSettings0.outline());
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertFalse(document_OutputSettings0.prettyPrint());
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
      assertEquals(1, document_OutputSettings1.indentAmount());
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings1.syntax());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings1.escapeMode());
      assertFalse(document_OutputSettings1.prettyPrint());
      assertFalse(document_OutputSettings1.outline());
      
      // Undeclared exception!
      try { 
        textNode0.outerHtmlHead(charBuffer0, (-3941), document_OutputSettings1);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.StringCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded(">~h%LQ}[(", (String) null);
      assertNotNull(textNode0);
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertFalse(textNode0.hasParent());
      
      textNode0.setParentNode(textNode0);
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertTrue(textNode0.hasParent());
      
      // Undeclared exception!
      try { 
        textNode0.splitText(1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Leaf Nodes do not have child nodes.
         //
         verifyException("org.jsoup.nodes.LeafNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("3d", "dv)d");
      assertNotNull(textNode0);
      assertFalse(textNode0.hasParent());
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      
      TextNode textNode1 = textNode0.splitText(0);
      assertNotNull(textNode1);
      assertNotSame(textNode0, textNode1);
      assertNotSame(textNode1, textNode0);
      assertFalse(textNode1.equals((Object)textNode0));
      assertFalse(textNode0.hasParent());
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertFalse(textNode1.hasParent());
      assertEquals("#text", textNode1.nodeName());
      assertEquals(0, textNode1.siblingIndex());
      
      // Undeclared exception!
      try { 
        textNode0.splitText(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Split offset must not be greater than current text length
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("");
      assertNotNull(cDataNode0);
      assertEquals("#cdata", cDataNode0.nodeName());
      assertEquals(0, cDataNode0.siblingIndex());
      assertFalse(cDataNode0.hasParent());
      
      // Undeclared exception!
      try { 
        cDataNode0.splitText((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Split offset must be not be negative
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TextNode textNode0 = new TextNode("?2S<Sb[~g:G~?=", "?2S<Sb[~g:G~?=");
      assertNotNull(textNode0);
      assertFalse(textNode0.hasParent());
      assertEquals(0, textNode0.siblingIndex());
      assertEquals("#text", textNode0.nodeName());
      
      String string0 = textNode0.toString();
      assertNotNull(string0);
      assertFalse(textNode0.hasParent());
      assertEquals(0, textNode0.siblingIndex());
      assertEquals("#text", textNode0.nodeName());
      assertEquals("?2S&lt;Sb[~g:G~?=", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("org.jsoup.nodes.TextNode", "org.jsoup.nodes.TextNode");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      textNode0.outerHtmlTail((Appendable) null, (-1056), document_OutputSettings0);
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextNode textNode0 = new TextNode("#text", "#text");
      String string0 = textNode0.text();
      assertEquals("#text", textNode0.nodeName());
      assertEquals("#text", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String string0 = TextNode.stripLeadingWhitespace("#text");
      assertEquals("#text", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String string0 = TextNode.normaliseWhitespace("GJ.&wI3Rrw3Z(# ");
      assertEquals("GJ.&wI3Rrw3Z(# ", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("", "");
      textNode0.isBlank();
  }
}
