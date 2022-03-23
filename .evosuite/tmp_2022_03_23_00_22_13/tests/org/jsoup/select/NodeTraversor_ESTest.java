/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 23:31:30 GMT 2022
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeTraversor_ESTest extends NodeTraversor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.STOP;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult1).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-1494)).when(node1).childNodeSize();
      doReturn(node0).when(node1).nextSibling();
      NodeFilter.FilterResult nodeFilter_FilterResult2 = NodeTraversor.filter(nodeFilter0, node1);
      assertEquals(NodeFilter.FilterResult.STOP, nodeFilter_FilterResult2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.STOP;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeTraversor.filter(nodeFilter0, node1);
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      NodeTraversor nodeTraversor0 = new NodeTraversor(nodeVisitor0);
      NodeVisitor nodeVisitor1 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node3 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node3).childNodeSize();
      doReturn((Node) null).when(node3).nextSibling();
      NodeFilter.FilterResult nodeFilter_FilterResult2 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter.FilterResult nodeFilter_FilterResult3 = NodeFilter.FilterResult.REMOVE;
      NodeFilter.FilterResult nodeFilter_FilterResult4 = NodeFilter.FilterResult.REMOVE;
      NodeFilter nodeFilter1 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult2, nodeFilter_FilterResult3).when(nodeFilter1).head(any(org.jsoup.nodes.Node.class) , anyInt());
      Node node4 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0, (Node) null).when(node4).nextSibling();
      Node node5 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node4).when(node5).childNode(anyInt());
      doReturn(2821).when(node5).childNodeSize();
      NodeTraversor.filter(nodeFilter1, node5);
      Node node6 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node6).childNodeSize();
      doReturn((Node) null).when(node6).nextSibling();
      nodeTraversor0.traverse(node6);
      NodeTraversor.traverse(nodeVisitor1, node3);
      Node node7 = null;
      nodeTraversor0.traverse(node7);
      nodeTraversor0.traverse(node7);
      NodeFilter nodeFilter2 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      NodeFilter.FilterResult nodeFilter_FilterResult5 = NodeTraversor.filter(nodeFilter2, node7);
      assertFalse(nodeFilter_FilterResult5.equals((Object)nodeFilter_FilterResult1));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.STOP;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeTraversor.filter(nodeFilter0, node1);
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      NodeTraversor nodeTraversor0 = new NodeTraversor(nodeVisitor0);
      NodeVisitor nodeVisitor1 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node3 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node3).childNodeSize();
      doReturn((Node) null).when(node3).nextSibling();
      NodeFilter.FilterResult nodeFilter_FilterResult2 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter.FilterResult nodeFilter_FilterResult3 = NodeFilter.FilterResult.SKIP_ENTIRELY;
      NodeFilter.FilterResult nodeFilter_FilterResult4 = NodeFilter.FilterResult.STOP;
      NodeFilter nodeFilter1 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult2, nodeFilter_FilterResult3).when(nodeFilter1).head(any(org.jsoup.nodes.Node.class) , anyInt());
      Node node4 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node2, (Node) null).when(node4).nextSibling();
      Node node5 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node4).when(node5).childNode(anyInt());
      doReturn(2821).when(node5).childNodeSize();
      NodeTraversor.filter(nodeFilter1, node5);
      Node node6 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node6).childNodeSize();
      doReturn((Node) null).when(node6).nextSibling();
      nodeTraversor0.traverse(node6);
      NodeTraversor.traverse(nodeVisitor1, node3);
      Node node7 = null;
      nodeTraversor0.traverse(node7);
      nodeTraversor0.traverse(node7);
      NodeFilter nodeFilter2 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      NodeFilter.FilterResult nodeFilter_FilterResult5 = NodeTraversor.filter(nodeFilter2, node7);
      assertFalse(nodeFilter_FilterResult5.equals((Object)nodeFilter_FilterResult1));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn((NodeFilter.FilterResult) null).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node0).nextSibling();
      NodeTraversor.filter(nodeFilter0, node0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.STOP;
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node1).childNodeSize();
      doReturn((Node) null).when(node1).nextSibling();
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult1, nodeFilter_FilterResult1, nodeFilter_FilterResult1).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult1, nodeFilter_FilterResult0).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-1)).when(node2).childNodeSize();
      doReturn(node0, node1).when(node2).nextSibling();
      Node node3 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node2).when(node3).childNode(anyInt());
      doReturn(2821).when(node3).childNodeSize();
      NodeFilter.FilterResult nodeFilter_FilterResult2 = NodeTraversor.filter(nodeFilter0, node3);
      assertEquals(NodeFilter.FilterResult.STOP, nodeFilter_FilterResult2);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.SKIP_CHILDREN;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn((NodeFilter.FilterResult) null).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node1).nextSibling();
      NodeTraversor.filter(nodeFilter0, node1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((-729)).when(node1).childNodeSize();
      doReturn(node0, (Node) null).when(node1).nextSibling();
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node1).when(node2).childNode(anyInt());
      doReturn(9).when(node2).childNodeSize();
      NodeTraversor.traverse(nodeVisitor0, node2);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(node1).childNodeSize();
      doReturn((Node) null).when(node1).nextSibling();
      NodeTraversor.traverse(nodeVisitor0, node1);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      NodeTraversor nodeTraversor0 = new NodeTraversor(nodeVisitor0);
      nodeTraversor0.traverse((Node) null);
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.SKIP_CHILDREN;
      NodeFilter.FilterResult nodeFilter_FilterResult2 = NodeFilter.FilterResult.SKIP_ENTIRELY;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult1).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult2).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      Node node0 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node1 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node0, (Node) null).when(node1).nextSibling();
      int int0 = 62;
      Node node2 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node1).when(node2).childNode(anyInt());
      doReturn(62).when(node2).childNodeSize();
      NodeTraversor.filter(nodeFilter0, node2);
      NodeVisitor nodeVisitor1 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      int int1 = 9;
      Node node3 = mock(Node.class, new ViolatedAssumptionAnswer());
      Node node4 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn((Node) null).when(node4).childNode(anyInt());
      doReturn(int0).when(node4).childNodeSize();
      Node node5 = mock(Node.class, new ViolatedAssumptionAnswer());
      doReturn(node4).when(node5).childNode(anyInt());
      doReturn(int1).when(node5).childNodeSize();
      NodeTraversor.traverse(nodeVisitor1, node5);
      NodeFilter nodeFilter1 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      Elements elements0 = null;
      // Undeclared exception!
      try { 
        NodeTraversor.filter(nodeFilter1, elements0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}