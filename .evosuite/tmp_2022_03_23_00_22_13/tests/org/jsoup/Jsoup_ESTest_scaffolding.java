/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Mar 22 23:36:24 GMT 2022
 */

package org.jsoup;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Jsoup_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jsoup.Jsoup"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Jsoup_ESTest_scaffolding.class.getClassLoader() ,
      "org.jsoup.helper.DataUtil",
      "org.jsoup.Connection$Response",
      "org.jsoup.helper.ChangeNotifyingArrayList",
      "org.eclipse.jetty.util.annotation.ManagedOperation",
      "org.eclipse.jetty.io.NetworkTrafficListener",
      "org.jsoup.select.Evaluator$IsOnlyOfType",
      "org.eclipse.jetty.io.ManagedSelector$DumpKeys",
      "org.jsoup.safety.Whitelist$TypedValue",
      "org.eclipse.jetty.util.Callback",
      "org.eclipse.jetty.io.NetworkTrafficSocketChannelEndPoint",
      "org.jsoup.select.NodeTraversor",
      "org.eclipse.jetty.util.InetAddressSet$MinMaxInetRange",
      "org.eclipse.jetty.io.AbstractConnection",
      "org.jsoup.select.CombiningEvaluator$And",
      "org.eclipse.jetty.util.thread.ThreadPool",
      "org.eclipse.jetty.util.Scanner$ScanCycleListener",
      "org.eclipse.jetty.io.ssl.SslConnection$FlushState",
      "org.jsoup.parser.Token$EndTag",
      "org.jsoup.helper.HttpConnection$Request",
      "org.jsoup.nodes.Document",
      "org.jsoup.Jsoup",
      "org.jsoup.parser.HtmlTreeBuilder",
      "org.eclipse.jetty.util.Scanner$PathMatcherSet",
      "org.jsoup.UnsupportedMimeTypeException",
      "org.eclipse.jetty.util.component.Destroyable",
      "org.eclipse.jetty.util.PathWatcher$Config",
      "org.eclipse.jetty.util.InetAddressSet$InetPattern",
      "org.eclipse.jetty.util.thread.ThreadPool$SizedThreadPool",
      "org.eclipse.jetty.util.thread.Scheduler$Task",
      "org.eclipse.jetty.util.component.StopLifeCycle",
      "org.jsoup.select.Evaluator$IndexEquals",
      "org.jsoup.parser.Token$Tag",
      "org.eclipse.jetty.util.SharedBlockingCallback",
      "org.jsoup.select.Evaluator$TagEndsWith",
      "org.eclipse.jetty.util.thread.Locker",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.nodes.Document$OutputSettings$Syntax",
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "org.eclipse.jetty.util.PathWatcher$PathWatchEvent",
      "org.eclipse.jetty.server.AbstractConnector",
      "org.jsoup.nodes.LeafNode",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Bean",
      "org.eclipse.jetty.io.SelectorManager",
      "org.eclipse.jetty.util.CountingCallback",
      "org.jsoup.select.Selector",
      "org.jsoup.select.Evaluator$AttributeWithValueEnding",
      "org.eclipse.jetty.util.thread.QueuedThreadPool",
      "org.jsoup.select.Collector$FirstFinder",
      "org.eclipse.jetty.util.IncludeExclude",
      "org.eclipse.jetty.io.ManagedSelector$Start",
      "org.eclipse.jetty.server.ServerConnector$ServerConnectorManager",
      "org.jsoup.safety.Whitelist$Protocol",
      "org.eclipse.jetty.util.component.Graceful",
      "org.eclipse.jetty.util.SharedBlockingCallback$BlockerFailedException",
      "org.eclipse.jetty.util.thread.ScheduledExecutorScheduler",
      "org.eclipse.jetty.util.AtomicBiInteger",
      "org.eclipse.jetty.io.SelectChannelEndPoint",
      "org.eclipse.jetty.util.component.Container$Listener",
      "org.eclipse.jetty.util.thread.Invocable$InvocationType",
      "org.jsoup.parser.HtmlTreeBuilderState",
      "org.jsoup.select.Evaluator$AttributeStarting",
      "org.jsoup.nodes.DataNode",
      "org.eclipse.jetty.util.Scanner$TimeNSize",
      "org.jsoup.nodes.Attributes",
      "org.jsoup.helper.W3CDom",
      "org.eclipse.jetty.io.ManagedSelector$Acceptor",
      "org.eclipse.jetty.util.thread.TimerScheduler",
      "org.eclipse.jetty.util.SharedBlockingCallback$Blocker",
      "org.jsoup.select.Evaluator$ContainsData",
      "org.jsoup.helper.StringUtil",
      "org.eclipse.jetty.http.PathMap",
      "org.eclipse.jetty.io.ssl.SslConnection$DecryptedEndPoint",
      "org.eclipse.jetty.util.PathWatcher$ExactPathMatcher",
      "org.eclipse.jetty.util.PathWatcher$EventListListener",
      "org.eclipse.jetty.io.Connection$UpgradeTo",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget",
      "org.eclipse.jetty.util.statistic.SampleStatistic",
      "org.jsoup.parser.Token$Comment",
      "org.eclipse.jetty.util.log.Logger",
      "org.eclipse.jetty.util.Attributes$Wrapper",
      "org.jsoup.parser.TokeniserState$56",
      "org.eclipse.jetty.util.Callback$Completing",
      "org.jsoup.parser.TokeniserState$57",
      "org.jsoup.parser.TokeniserState$58",
      "org.jsoup.parser.TokeniserState$59",
      "org.jsoup.parser.TokeniserState$52",
      "org.eclipse.jetty.io.ManagedSelector$SelectorProducer",
      "org.jsoup.parser.TokeniserState$53",
      "org.jsoup.parser.TokeniserState$54",
      "org.jsoup.parser.TokeniserState$55",
      "org.jsoup.parser.TokeniserState$50",
      "org.jsoup.parser.TokeniserState$51",
      "org.jsoup.parser.Parser",
      "org.eclipse.jetty.io.ssl.SslConnection",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool",
      "org.eclipse.jetty.io.ArrayByteBufferPool",
      "org.eclipse.jetty.util.component.FileNoticeLifeCycleListener",
      "org.jsoup.select.Evaluator$AttributeWithValueMatching",
      "org.eclipse.jetty.util.thread.TimerScheduler$SimpleTask",
      "org.eclipse.jetty.io.ssl.SslHandshakeListener",
      "org.jsoup.parser.TokeniserState$67",
      "org.jsoup.parser.TokeniserState$63",
      "org.eclipse.jetty.io.WriteFlusher",
      "org.jsoup.parser.TokeniserState$64",
      "org.jsoup.parser.TokeniserState$65",
      "org.jsoup.parser.TokeniserState$66",
      "org.eclipse.jetty.io.FillInterest",
      "org.jsoup.parser.TokeniserState$60",
      "org.eclipse.jetty.io.ssl.SslConnection$HandshakeState",
      "org.jsoup.parser.TokeniserState$61",
      "org.jsoup.parser.TokeniserState$62",
      "org.jsoup.parser.Tag",
      "org.eclipse.jetty.io.Connection$Listener$Adapter",
      "org.eclipse.jetty.util.Scanner$Listener",
      "org.jsoup.select.NodeFilter$FilterResult",
      "org.eclipse.jetty.util.FutureCallback",
      "org.eclipse.jetty.io.ssl.SslClientConnectionFactory$HTTPSHandshakeListener",
      "org.jsoup.select.Elements",
      "org.eclipse.jetty.io.IncludeExcludeConnectionStatistics",
      "org.jsoup.parser.Token$CData",
      "org.jsoup.select.Evaluator$AllElements",
      "org.eclipse.jetty.util.LeakDetector",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.select.Evaluator$AttributeWithValue",
      "org.eclipse.jetty.util.Callback$Nested",
      "org.eclipse.jetty.io.AbstractEndPoint",
      "org.eclipse.jetty.io.ManagedSelector$SelectorUpdate",
      "org.jsoup.SerializationException",
      "org.jsoup.select.Evaluator$ContainsText",
      "org.jsoup.safety.Whitelist$TagName",
      "org.jsoup.Connection$Base",
      "org.eclipse.jetty.util.component.LifeCycle$Listener",
      "org.jsoup.select.Evaluator$Id",
      "org.eclipse.jetty.io.SelectorManager$AcceptListener",
      "org.jsoup.select.Collector$Accumulator",
      "org.eclipse.jetty.util.thread.MonitoredQueuedThreadPool",
      "org.eclipse.jetty.util.PathWatcher$PathMatcherSet",
      "org.eclipse.jetty.util.thread.ExecutorThreadPool",
      "org.jsoup.parser.CharacterReader",
      "org.jsoup.select.Evaluator$IsFirstChild",
      "org.jsoup.helper.HttpConnection$Response",
      "org.jsoup.parser.TokeniserState$12",
      "org.jsoup.parser.TokeniserState$13",
      "org.jsoup.parser.TokeniserState$14",
      "org.jsoup.parser.TokeniserState$15",
      "org.eclipse.jetty.util.component.LifeCycle",
      "org.eclipse.jetty.io.EndPoint",
      "org.jsoup.select.Evaluator$AttributeWithValueStarting",
      "org.jsoup.parser.Token$EOF",
      "org.jsoup.parser.TokeniserState$10",
      "org.jsoup.parser.TokeniserState$11",
      "org.eclipse.jetty.io.ChannelEndPoint",
      "org.jsoup.select.QueryParser",
      "org.eclipse.jetty.util.RegexSet",
      "org.jsoup.select.Evaluator$Matches",
      "org.jsoup.safety.Whitelist$AttributeValue",
      "org.eclipse.jetty.io.NetworkTrafficSelectChannelEndPoint",
      "org.eclipse.jetty.io.RuntimeIOException",
      "org.jsoup.parser.TokeniserState$16",
      "org.jsoup.parser.TokeniserState$17",
      "org.jsoup.parser.TokeniserState$18",
      "org.eclipse.jetty.util.Scanner$DiscreteListener",
      "org.jsoup.parser.TokeniserState$19",
      "org.jsoup.nodes.Entities$1",
      "org.jsoup.parser.TokeniserState$23",
      "org.jsoup.UncheckedIOException",
      "org.jsoup.parser.TokeniserState$24",
      "org.jsoup.parser.TokeniserState$25",
      "org.jsoup.parser.TokeniserState$26",
      "org.jsoup.parser.TokeniserState$20",
      "org.jsoup.parser.TokeniserState$21",
      "org.jsoup.parser.TokeniserState$22",
      "org.eclipse.jetty.io.ManagedSelector$DestroyEndPoint",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.select.NodeFilter",
      "org.eclipse.jetty.io.ByteBufferPool",
      "org.eclipse.jetty.io.ManagedSelector$CloseConnections",
      "org.eclipse.jetty.io.AbstractByteBufferPool",
      "org.eclipse.jetty.util.component.AbstractLifeCycle$AbstractLifeCycleListener",
      "org.jsoup.helper.W3CDom$W3CBuilder",
      "org.eclipse.jetty.io.ManagedSelector$Connect",
      "org.jsoup.select.Evaluator$ContainsOwnText",
      "org.jsoup.parser.TokeniserState$27",
      "org.jsoup.parser.TokeniserState$28",
      "org.eclipse.jetty.util.Scanner",
      "org.jsoup.parser.TokeniserState$29",
      "org.jsoup.parser.TokeniserState$34",
      "org.jsoup.parser.TokeniserState$35",
      "org.jsoup.parser.TokeniserState$36",
      "org.eclipse.jetty.server.AbstractNetworkConnector",
      "org.jsoup.parser.TokeniserState$37",
      "org.eclipse.jetty.util.IncludeExcludeSet$SetContainsPredicate",
      "org.jsoup.parser.TokeniserState$30",
      "org.jsoup.parser.TokeniserState$31",
      "org.jsoup.parser.TokeniserState$32",
      "org.jsoup.parser.TokeniserState$33",
      "org.eclipse.jetty.util.CompletableCallback",
      "org.jsoup.select.Evaluator$MatchText",
      "org.eclipse.jetty.io.ManagedSelector",
      "org.jsoup.select.Evaluator",
      "org.jsoup.Connection",
      "org.jsoup.select.Evaluator$IsRoot",
      "org.eclipse.jetty.util.Callback$Completable",
      "org.jsoup.parser.TokeniserState$38",
      "org.jsoup.parser.TokeniserState$39",
      "org.jsoup.parser.TokeniserState$45",
      "org.jsoup.parser.TokeniserState$46",
      "org.jsoup.parser.TokeniserState$47",
      "org.eclipse.jetty.util.component.Container$InheritedListener",
      "org.jsoup.parser.TokeniserState$48",
      "org.jsoup.select.Evaluator$IsLastChild",
      "org.jsoup.parser.TokeniserState$41",
      "org.jsoup.select.Evaluator$IsNthLastChild",
      "org.jsoup.parser.TokeniserState$42",
      "org.jsoup.parser.TokeniserState$43",
      "org.jsoup.parser.TokeniserState$44",
      "org.jsoup.parser.TokeniserState$40",
      "org.eclipse.jetty.io.SocketChannelEndPoint",
      "org.eclipse.jetty.util.IteratingNestedCallback",
      "org.jsoup.parser.TokeniserState$49",
      "org.jsoup.nodes.Document$QuirksMode",
      "org.jsoup.select.StructuralEvaluator$ImmediateParent",
      "org.jsoup.parser.HtmlTreeBuilderState$18",
      "org.jsoup.parser.HtmlTreeBuilderState$19",
      "org.jsoup.parser.HtmlTreeBuilderState$16",
      "org.jsoup.parser.HtmlTreeBuilderState$17",
      "org.jsoup.parser.HtmlTreeBuilderState$14",
      "org.jsoup.parser.HtmlTreeBuilderState$15",
      "org.jsoup.select.Evaluator$IndexEvaluator",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget$Lease",
      "org.jsoup.nodes.Entities$CoreCharset",
      "org.jsoup.safety.Cleaner",
      "org.jsoup.nodes.Element",
      "org.jsoup.parser.HtmlTreeBuilderState$12",
      "org.jsoup.helper.HttpConnection",
      "org.jsoup.parser.HtmlTreeBuilderState$13",
      "org.jsoup.parser.HtmlTreeBuilderState$10",
      "org.eclipse.jetty.util.annotation.ManagedObject",
      "org.jsoup.parser.HtmlTreeBuilderState$11",
      "org.eclipse.jetty.util.InetAddressSet$SingletonInetRange",
      "org.jsoup.select.Evaluator$MatchesOwn",
      "org.eclipse.jetty.util.thread.Invocable",
      "org.eclipse.jetty.io.MappedByteBufferPool",
      "org.eclipse.jetty.io.NullByteBufferPool",
      "org.eclipse.jetty.io.ssl.SslConnection$FillState",
      "org.jsoup.nodes.FormElement",
      "org.jsoup.select.StructuralEvaluator",
      "org.eclipse.jetty.util.thread.TryExecutor",
      "org.eclipse.jetty.io.ConnectionStatistics$Stats",
      "org.eclipse.jetty.io.ConnectionStatistics",
      "org.eclipse.jetty.util.PathWatcher$PathWatchEventType",
      "org.eclipse.jetty.util.thread.ExecutorSizedThreadPool",
      "org.eclipse.jetty.util.PathWatcher",
      "org.jsoup.select.Selector$SelectorParseException",
      "org.eclipse.jetty.server.NetworkConnector",
      "org.jsoup.nodes.XmlDeclaration",
      "org.eclipse.jetty.util.component.Dumpable",
      "org.jsoup.parser.Token$Doctype",
      "org.eclipse.jetty.io.Connection",
      "org.jsoup.parser.HtmlTreeBuilderState$23",
      "org.eclipse.jetty.io.AbstractEndPoint$2",
      "org.jsoup.parser.HtmlTreeBuilderState$24",
      "org.jsoup.parser.HtmlTreeBuilderState$21",
      "org.jsoup.parser.HtmlTreeBuilderState$22",
      "org.jsoup.parser.HtmlTreeBuilderState$20",
      "org.eclipse.jetty.io.AbstractEndPoint$1",
      "org.eclipse.jetty.util.component.AttributeContainerMap",
      "org.jsoup.parser.Tokeniser",
      "org.jsoup.nodes.Comment",
      "org.eclipse.jetty.util.ModuleLocation",
      "org.jsoup.select.Evaluator$IndexGreaterThan",
      "org.eclipse.jetty.io.ByteBufferPool$Bucket",
      "org.eclipse.jetty.util.component.Container",
      "org.eclipse.jetty.util.ConstantThrowable",
      "org.jsoup.select.StructuralEvaluator$ImmediatePreviousSibling",
      "org.eclipse.jetty.util.component.DumpableCollection",
      "org.eclipse.jetty.io.IncludeExcludeConnectionStatistics$ConnectionSet",
      "org.eclipse.jetty.util.Scanner$BulkListener",
      "org.eclipse.jetty.util.PathWatcher$DirAction",
      "org.eclipse.jetty.io.ManagedSelector$Selectable",
      "org.eclipse.jetty.util.Scanner$Visitor",
      "org.jsoup.nodes.Node",
      "org.eclipse.jetty.util.InetAddressSet",
      "org.eclipse.jetty.util.IteratingCallback",
      "org.eclipse.jetty.io.ByteArrayEndPoint",
      "org.eclipse.jetty.util.AttributesMap",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool$1",
      "org.jsoup.parser.XmlTreeBuilder",
      "org.eclipse.jetty.util.thread.SerializedExecutor",
      "org.jsoup.nodes.Document$OutputSettings",
      "org.jsoup.select.CombiningEvaluator",
      "org.jsoup.internal.Normalizer",
      "org.jsoup.helper.Validate",
      "org.eclipse.jetty.io.ManagedSelector$Accept",
      "org.eclipse.jetty.io.QuietException",
      "org.eclipse.jetty.util.thread.ThreadPoolBudget$Leased",
      "org.eclipse.jetty.util.thread.ExecutionStrategy",
      "org.eclipse.jetty.server.ServerConnector",
      "org.eclipse.jetty.io.IdleTimeout",
      "org.eclipse.jetty.util.thread.SerializedExecutor$ErrorHandlingTask",
      "org.jsoup.select.Evaluator$CssNthEvaluator",
      "org.eclipse.jetty.io.ManagedSelector$CreateEndPoint",
      "org.eclipse.jetty.server.Connector",
      "org.jsoup.select.Evaluator$IsFirstOfType",
      "org.jsoup.nodes.Element$NodeList",
      "org.jsoup.parser.ParseError",
      "org.jsoup.parser.TreeBuilder",
      "org.jsoup.nodes.PseudoTextElement",
      "org.eclipse.jetty.io.EofException",
      "org.eclipse.jetty.util.SharedBlockingCallback$BlockerTimeoutException",
      "org.jsoup.select.Evaluator$IsEmpty",
      "org.eclipse.jetty.http.PathMap$PathSet",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "org.jsoup.select.Evaluator$IsNthChild",
      "org.jsoup.select.Evaluator$Class",
      "org.eclipse.jetty.io.NegotiatingClientConnection",
      "org.eclipse.jetty.io.MappedByteBufferPool$Tagged",
      "org.jsoup.select.StructuralEvaluator$Has",
      "org.jsoup.nodes.Node$OuterHtmlVisitor",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.jsoup.safety.Cleaner$CleaningVisitor",
      "org.jsoup.parser.Token",
      "org.eclipse.jetty.util.thread.ExecutorThreadPool$1",
      "org.jsoup.select.Evaluator$AttributeKeyPair",
      "org.jsoup.select.Evaluator$IsNthLastOfType",
      "org.jsoup.parser.Token$Character",
      "org.jsoup.select.Evaluator$IsLastOfType",
      "org.jsoup.select.Evaluator$Attribute",
      "org.eclipse.jetty.util.statistic.CounterStatistic",
      "org.jsoup.Connection$KeyVal",
      "org.eclipse.jetty.util.InetAddressSet$CidrInetRange",
      "org.jsoup.nodes.Entities",
      "org.eclipse.jetty.util.PathWatcher$Listener",
      "org.jsoup.select.Evaluator$AttributeWithValueContaining",
      "org.jsoup.safety.Whitelist$AttributeKey",
      "org.jsoup.select.Evaluator$AttributeWithValueNot",
      "org.jsoup.parser.ParseErrorList",
      "org.jsoup.nodes.BooleanAttribute",
      "org.eclipse.jetty.util.Scanner$ScanListener",
      "org.jsoup.select.CombiningEvaluator$Or",
      "org.jsoup.select.Evaluator$IsNthOfType",
      "org.jsoup.select.StructuralEvaluator$PreviousSibling",
      "org.jsoup.safety.Whitelist",
      "org.jsoup.examples.HtmlToPlainText$FormattingVisitor",
      "org.jsoup.select.Collector",
      "org.jsoup.select.StructuralEvaluator$Not",
      "org.jsoup.parser.XmlTreeBuilder$1",
      "org.eclipse.jetty.util.LeakDetector$LeakInfo",
      "org.jsoup.internal.ConstrainableInputStream",
      "org.eclipse.jetty.io.AbstractEndPoint$State",
      "org.eclipse.jetty.util.InetAddressSet$LegacyInetRange",
      "org.jsoup.select.StructuralEvaluator$Root",
      "org.eclipse.jetty.io.ManagedSelector$StopSelector",
      "org.jsoup.select.NodeVisitor",
      "org.jsoup.parser.TokeniserState$2",
      "org.jsoup.parser.TokeniserState$1",
      "org.eclipse.jetty.util.component.Dumpable$DumpableContainer",
      "org.eclipse.jetty.util.Attributes",
      "org.jsoup.parser.Token$StartTag",
      "org.jsoup.nodes.DocumentType",
      "org.jsoup.parser.TokeniserState$9",
      "org.jsoup.Connection$Request",
      "org.jsoup.parser.TokeniserState$8",
      "org.jsoup.parser.TokeniserState$7",
      "org.jsoup.parser.TokeniserState$6",
      "org.jsoup.HttpStatusException",
      "org.jsoup.parser.TokeniserState$5",
      "org.jsoup.parser.TokeniserState$4",
      "org.jsoup.parser.TokeniserState$3",
      "org.eclipse.jetty.util.annotation.ManagedAttribute",
      "org.jsoup.helper.StringUtil$1",
      "org.jsoup.select.Evaluator$IsOnlyChild",
      "org.jsoup.Connection$Method",
      "org.jsoup.helper.HttpConnection$Base",
      "org.jsoup.parser.TokenQueue",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Managed",
      "org.jsoup.parser.TokeniserState",
      "org.jsoup.select.Evaluator$IndexLessThan",
      "org.eclipse.jetty.util.thread.Scheduler",
      "org.jsoup.nodes.Entities$EscapeMode",
      "org.jsoup.nodes.CDataNode",
      "org.jsoup.select.StructuralEvaluator$Parent",
      "org.eclipse.jetty.io.ssl.SslHandshakeListener$Event",
      "org.eclipse.jetty.util.thread.ExecutionStrategy$Producer",
      "org.jsoup.parser.Token$TokenType",
      "org.jsoup.parser.HtmlTreeBuilderState$2",
      "org.jsoup.parser.HtmlTreeBuilderState$1",
      "org.jsoup.parser.HtmlTreeBuilderState$4",
      "org.jsoup.nodes.Attribute",
      "org.jsoup.parser.HtmlTreeBuilderState$3",
      "org.jsoup.parser.HtmlTreeBuilderState$9",
      "org.jsoup.parser.HtmlTreeBuilderState$6",
      "org.jsoup.parser.HtmlTreeBuilderState$5",
      "org.eclipse.jetty.io.Connection$Listener",
      "org.jsoup.parser.HtmlTreeBuilderState$8",
      "org.jsoup.parser.HtmlTreeBuilderState$7"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Jsoup_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jsoup.Jsoup",
      "org.jsoup.helper.DataUtil",
      "org.jsoup.parser.Parser",
      "org.jsoup.helper.HttpConnection",
      "org.jsoup.helper.HttpConnection$Base",
      "org.jsoup.helper.HttpConnection$Request",
      "org.jsoup.Connection$Method",
      "org.jsoup.parser.TreeBuilder",
      "org.jsoup.parser.HtmlTreeBuilder",
      "org.jsoup.parser.Token",
      "org.jsoup.parser.Token$Tag",
      "org.jsoup.parser.Token$StartTag",
      "org.jsoup.nodes.Attributes",
      "org.jsoup.parser.Token$TokenType",
      "org.jsoup.parser.Token$EndTag",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.helper.HttpConnection$Response",
      "org.jsoup.parser.ParseErrorList",
      "org.jsoup.nodes.Node",
      "org.jsoup.nodes.Element",
      "org.jsoup.nodes.Document",
      "org.jsoup.parser.Tag",
      "org.jsoup.internal.Normalizer",
      "org.jsoup.nodes.Document$QuirksMode",
      "org.jsoup.parser.Tokeniser",
      "org.jsoup.parser.TokeniserState",
      "org.jsoup.parser.Token$Character",
      "org.jsoup.parser.Token$Doctype",
      "org.jsoup.parser.Token$Comment",
      "org.jsoup.parser.HtmlTreeBuilderState",
      "org.jsoup.parser.Token$EOF",
      "org.jsoup.helper.ChangeNotifyingArrayList",
      "org.jsoup.nodes.Element$NodeList",
      "org.jsoup.parser.HtmlTreeBuilderState$24",
      "org.jsoup.safety.Whitelist",
      "org.jsoup.safety.Whitelist$TypedValue",
      "org.jsoup.safety.Whitelist$TagName",
      "org.jsoup.safety.Whitelist$AttributeKey",
      "org.jsoup.safety.Whitelist$Protocol",
      "org.jsoup.safety.Whitelist$AttributeValue",
      "org.jsoup.helper.StringUtil$1",
      "org.jsoup.helper.StringUtil",
      "org.jsoup.nodes.LeafNode",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.select.Elements",
      "org.jsoup.safety.Cleaner",
      "org.jsoup.safety.Cleaner$CleaningVisitor",
      "org.jsoup.select.NodeTraversor",
      "org.jsoup.nodes.Node$OuterHtmlVisitor",
      "org.jsoup.nodes.Entities$CoreCharset",
      "org.jsoup.nodes.Entities$1",
      "org.jsoup.internal.ConstrainableInputStream",
      "org.jsoup.parser.XmlTreeBuilder",
      "org.jsoup.parser.XmlTreeBuilder$1",
      "org.jsoup.parser.ParseError",
      "org.jsoup.select.Selector",
      "org.jsoup.select.QueryParser",
      "org.jsoup.parser.TokenQueue",
      "org.jsoup.select.Selector$SelectorParseException",
      "org.jsoup.HttpStatusException",
      "org.jsoup.select.Evaluator",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.select.Evaluator$AttributeKeyPair",
      "org.jsoup.select.Evaluator$AttributeWithValue",
      "org.jsoup.select.Evaluator$Attribute",
      "org.jsoup.select.CombiningEvaluator",
      "org.jsoup.select.CombiningEvaluator$And",
      "org.jsoup.select.CombiningEvaluator$Or",
      "org.jsoup.select.Collector",
      "org.jsoup.select.Collector$Accumulator",
      "org.jsoup.select.Evaluator$CssNthEvaluator",
      "org.jsoup.select.Evaluator$IsNthChild"
    );
  }
}