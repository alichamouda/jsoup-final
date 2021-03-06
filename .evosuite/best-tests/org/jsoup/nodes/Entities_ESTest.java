/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 23:29:20 GMT 2022
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Entities_ESTest extends Entities_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Entities.CoreCharset.byName("");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      document_OutputSettings0.encoder();
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.html;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      Entities.CoreCharset entities_CoreCharset0 = Entities.CoreCharset.fallback;
      document_OutputSettings1.coreCharset = entities_CoreCharset0;
      // Undeclared exception!
      try { 
        Entities.escape((Appendable) null, "I'nAa^AO", document_OutputSettings0, false, false, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Entities", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("US-ASCII");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Charset charset0 = Charset.forName("US-ASCII");
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.charset(charset0);
      Entities.escape((Appendable) mockPrintWriter0, "UTF-dxkikTIj;", document_OutputSettings1, false, true, true);
      assertSame(document_OutputSettings1, document_OutputSettings0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter("US-ASCII");
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) mockPrintWriter0, "K?;f5\"(U~QACC8{", document_OutputSettings0, true, true, false);
      assertEquals(1, document_OutputSettings0.indentAmount());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) stringWriter0, ">:AEN2", document_OutputSettings0, true, true, true);
      assertEquals(">:AEN2", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.escapeMode(entities_EscapeMode0);
      // Undeclared exception!
      try { 
        Entities.escape((Appendable) null, "<lyi^F[h(c5n'? ", document_OutputSettings1, true, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Entities", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      // Undeclared exception!
      try { 
        Entities.escape((Appendable) null, "<lyi^F[h(c5n'? ", document_OutputSettings0, true, true, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Entities", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = Entities.escape("$xs>H\"lq$JA,Wk");
      assertEquals("$xs&gt;H\"lq$JA,Wk", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String string0 = Entities.escape(".RK3r<");
      assertEquals(".RK3r&lt;", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String string0 = Entities.escape("&gt;");
      assertEquals("&amp;gt;", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) stringWriter0, "failed: ", document_OutputSettings0, false, true, true);
      assertEquals("failed: ", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringWriter stringWriter0 = new StringWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Entities.escape((Appendable) stringWriter0, "failed: ", document_OutputSettings0, false, true, false);
      assertEquals("failed: ", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      try { 
        Entities.escape((Appendable) pipedWriter0, "  at ", document_OutputSettings0, true, true, true);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      String string0 = Entities.escape((String) null, document_OutputSettings0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[] intArray0 = new int[7];
      int int0 = Entities.codepointsForName("US-ASCII", intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String string0 = Entities.getByName("US-ASCII");
      assertEquals("", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String string0 = Entities.getByName("macr");
      assertNotNull(string0);
      assertEquals("\u00AF", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = Entities.isBaseNamedEntity("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = Entities.isNamedEntity("x0K.6Q&p/`F o");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.extended;
      String string0 = entities_EscapeMode0.nameForCodepoint(62);
      assertEquals("gt", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.base;
      String string0 = entities_EscapeMode0.nameForCodepoint(175);
      assertEquals("macr", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.xhtml;
      String string0 = entities_EscapeMode0.nameForCodepoint(62);
      assertEquals("gt", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Entities.EscapeMode entities_EscapeMode0 = Entities.EscapeMode.base;
      String string0 = entities_EscapeMode0.nameForCodepoint(134);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String string0 = Entities.unescape("&gt;");
      assertEquals(">", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Character character0 = Entities.getCharacterByName("org.eclipse.jetty.util.component.StopLifeCycle");
      assertEquals('\uFFFF', (char)character0);
  }
}
