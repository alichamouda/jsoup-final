/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 23:36:23 GMT 2022
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Entities;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataNode_ESTest extends DataNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = "";
      DataNode dataNode0 = new DataNode("");
      dataNode0.setWholeData("");
      StringBuffer stringBuffer0 = new StringBuffer("");
      int int0 = (-484);
      // Undeclared exception!
      try { 
        stringBuffer0.insert((-484), (long) (-484));
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -484
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataNode dataNode0 = new DataNode("", "0(2hJ)IY|c~(04");
      dataNode0.clone();
      dataNode0.getWholeData();
      DataNode.createFromEncoded("0(2hJ)IY|c~(04", "0(2hJ)IY|c~(04");
      dataNode0.toString();
      StringWriter stringWriter0 = new StringWriter();
      int int0 = (-1810);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      stringWriter0.append((CharSequence) "");
      // Undeclared exception!
      try { 
        dataNode0.ensureChildNodes();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Leaf Nodes do not have child nodes.
         //
         verifyException("org.jsoup.nodes.LeafNode", e);
      }
  }
}
