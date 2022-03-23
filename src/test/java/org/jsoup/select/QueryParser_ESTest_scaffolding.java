/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 22 23:25:18 GMT 2022
 */

package org.jsoup.select;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class QueryParser_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jsoup.select.QueryParser"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/ali/Desktop/jsoup-2"); 
    java.lang.System.setProperty("user.home", "/home/ali"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "ali"); 
    java.lang.System.setProperty("user.timezone", "Africa/Tunis"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(QueryParser_ESTest_scaffolding.class.getClassLoader() ,
      "org.jsoup.select.NodeVisitor",
      "org.jsoup.nodes.Document$QuirksMode",
      "org.jsoup.select.StructuralEvaluator$ImmediateParent",
      "org.jsoup.helper.ChangeNotifyingArrayList",
      "org.jsoup.select.Evaluator$AttributeWithValueStarting",
      "org.jsoup.nodes.PseudoTextElement",
      "org.jsoup.select.Evaluator$IndexGreaterThan",
      "org.jsoup.select.Evaluator$IndexEvaluator",
      "org.jsoup.select.Evaluator$IsOnlyOfType",
      "org.jsoup.nodes.LeafNode",
      "org.jsoup.select.QueryParser",
      "org.jsoup.select.Evaluator$IsEmpty",
      "org.jsoup.helper.StringUtil$1",
      "org.jsoup.nodes.Entities$CoreCharset",
      "org.jsoup.select.Evaluator$Matches",
      "org.jsoup.select.Evaluator$AttributeWithValueMatching",
      "org.jsoup.select.Selector",
      "org.jsoup.select.Evaluator$AttributeWithValueEnding",
      "org.jsoup.select.Evaluator$IsOnlyChild",
      "org.jsoup.nodes.Element",
      "org.jsoup.select.StructuralEvaluator$ImmediatePreviousSibling",
      "org.jsoup.select.Collector$FirstFinder",
      "org.jsoup.select.Evaluator$IsNthChild",
      "org.jsoup.select.Evaluator$Class",
      "org.jsoup.select.NodeTraversor",
      "org.jsoup.UncheckedIOException",
      "org.jsoup.select.StructuralEvaluator$Has",
      "org.jsoup.parser.TokenQueue",
      "org.jsoup.select.Evaluator$MatchesOwn",
      "org.jsoup.select.Evaluator$AttributeKeyPair",
      "org.jsoup.select.NodeFilter",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.select.Evaluator$IsNthLastOfType",
      "org.jsoup.select.CombiningEvaluator$And",
      "org.jsoup.parser.Tag",
      "org.jsoup.select.Evaluator$IsLastOfType",
      "org.jsoup.select.Evaluator$Attribute",
      "org.jsoup.nodes.Node",
      "org.jsoup.select.NodeFilter$FilterResult",
      "org.jsoup.nodes.Document",
      "org.jsoup.select.Evaluator$AttributeStarting",
      "org.jsoup.select.Evaluator$ContainsOwnText",
      "org.jsoup.nodes.Entities",
      "org.jsoup.select.Evaluator$AttributeWithValueContaining",
      "org.jsoup.select.Elements",
      "org.jsoup.select.Evaluator$AllElements",
      "org.jsoup.select.Evaluator$IndexLessThan",
      "org.jsoup.nodes.Attributes",
      "org.jsoup.select.StructuralEvaluator",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.select.Evaluator$AttributeWithValue",
      "org.jsoup.select.Evaluator$AttributeWithValueNot",
      "org.jsoup.nodes.Entities$EscapeMode",
      "org.jsoup.nodes.BooleanAttribute",
      "org.jsoup.select.Evaluator$MatchText",
      "org.jsoup.SerializationException",
      "org.jsoup.select.CombiningEvaluator",
      "org.jsoup.select.CombiningEvaluator$Or",
      "org.jsoup.nodes.Document$OutputSettings",
      "org.jsoup.select.Evaluator$ContainsText",
      "org.jsoup.select.Evaluator",
      "org.jsoup.select.Evaluator$ContainsData",
      "org.jsoup.select.Evaluator$IsRoot",
      "org.jsoup.select.Evaluator$IsNthOfType",
      "org.jsoup.select.Evaluator$Id",
      "org.jsoup.helper.StringUtil",
      "org.jsoup.internal.Normalizer",
      "org.jsoup.select.StructuralEvaluator$PreviousSibling",
      "org.jsoup.select.Evaluator$IndexEquals",
      "org.jsoup.helper.Validate",
      "org.jsoup.select.StructuralEvaluator$Parent",
      "org.jsoup.select.Selector$SelectorParseException",
      "org.jsoup.select.Evaluator$IsLastChild",
      "org.jsoup.select.Collector",
      "org.jsoup.select.Collector$Accumulator",
      "org.jsoup.select.Evaluator$IsNthLastChild",
      "org.jsoup.select.StructuralEvaluator$Not",
      "org.jsoup.nodes.XmlDeclaration",
      "org.jsoup.select.Evaluator$TagEndsWith",
      "org.jsoup.nodes.Attribute",
      "org.jsoup.parser.CharacterReader",
      "org.jsoup.select.Evaluator$IsFirstChild",
      "org.jsoup.select.Evaluator$CssNthEvaluator",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.nodes.Document$OutputSettings$Syntax",
      "org.jsoup.select.Evaluator$IsFirstOfType",
      "org.jsoup.select.StructuralEvaluator$Root",
      "org.jsoup.nodes.Element$NodeList"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(QueryParser_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jsoup.select.QueryParser",
      "org.jsoup.helper.StringUtil$1",
      "org.jsoup.helper.StringUtil",
      "org.jsoup.parser.TokenQueue",
      "org.jsoup.helper.Validate",
      "org.jsoup.select.Evaluator",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.select.Selector$SelectorParseException",
      "org.jsoup.select.CombiningEvaluator",
      "org.jsoup.select.CombiningEvaluator$And",
      "org.jsoup.select.StructuralEvaluator",
      "org.jsoup.select.StructuralEvaluator$Parent",
      "org.jsoup.internal.Normalizer",
      "org.jsoup.select.Evaluator$AllElements",
      "org.jsoup.select.Evaluator$ContainsText",
      "org.jsoup.select.Evaluator$IsOnlyChild",
      "org.jsoup.select.Evaluator$Attribute",
      "org.jsoup.select.CombiningEvaluator$Or",
      "org.jsoup.select.StructuralEvaluator$Has",
      "org.jsoup.select.Evaluator$CssNthEvaluator",
      "org.jsoup.select.Evaluator$IsNthOfType",
      "org.jsoup.select.Evaluator$IsFirstOfType",
      "org.jsoup.select.StructuralEvaluator$Root",
      "org.jsoup.select.Evaluator$Id",
      "org.jsoup.select.Evaluator$IsEmpty",
      "org.jsoup.select.Evaluator$Class",
      "org.jsoup.select.Evaluator$IsRoot",
      "org.jsoup.select.Evaluator$IsOnlyOfType",
      "org.jsoup.select.Evaluator$MatchText",
      "org.jsoup.select.Evaluator$ContainsData",
      "org.jsoup.select.Evaluator$AttributeKeyPair",
      "org.jsoup.select.Evaluator$AttributeWithValueContaining",
      "org.jsoup.select.Evaluator$TagEndsWith",
      "org.jsoup.select.Evaluator$IsLastChild",
      "org.jsoup.select.Evaluator$AttributeStarting",
      "org.jsoup.select.Evaluator$IsNthLastOfType",
      "org.jsoup.select.Evaluator$IsLastOfType",
      "org.jsoup.select.Evaluator$AttributeWithValue",
      "org.jsoup.select.Evaluator$ContainsOwnText",
      "org.jsoup.select.Evaluator$AttributeWithValueEnding",
      "org.jsoup.select.Evaluator$IndexEvaluator",
      "org.jsoup.select.Evaluator$IndexGreaterThan",
      "org.jsoup.select.Evaluator$IsFirstChild",
      "org.jsoup.select.Evaluator$AttributeWithValueNot",
      "org.jsoup.select.Evaluator$AttributeWithValueStarting",
      "org.jsoup.select.StructuralEvaluator$ImmediatePreviousSibling",
      "org.jsoup.select.StructuralEvaluator$ImmediateParent",
      "org.jsoup.select.Evaluator$IndexLessThan",
      "org.jsoup.nodes.Node",
      "org.jsoup.nodes.Element",
      "org.jsoup.nodes.Document",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.parser.Tag",
      "org.jsoup.nodes.Document$OutputSettings",
      "org.jsoup.nodes.Document$OutputSettings$Syntax",
      "org.jsoup.nodes.Entities",
      "org.jsoup.parser.CharacterReader",
      "org.jsoup.nodes.Entities$EscapeMode",
      "org.jsoup.helper.ChangeNotifyingArrayList",
      "org.jsoup.nodes.Element$NodeList",
      "org.jsoup.select.Collector",
      "org.jsoup.select.Elements",
      "org.jsoup.select.Collector$Accumulator",
      "org.jsoup.select.NodeTraversor",
      "org.jsoup.select.StructuralEvaluator$Not",
      "org.jsoup.select.StructuralEvaluator$PreviousSibling",
      "org.jsoup.select.Evaluator$IndexEquals",
      "org.jsoup.select.Evaluator$Matches",
      "org.jsoup.select.Evaluator$AttributeWithValueMatching",
      "org.jsoup.select.Evaluator$MatchesOwn",
      "org.jsoup.select.Evaluator$IsNthChild",
      "org.jsoup.select.Evaluator$IsNthLastChild"
    );
  }
}
