/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 23:34:52 GMT 2022
 */

package org.jsoup.examples;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.jsoup.examples.Wikipedia;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Wikipedia_ESTest extends Wikipedia_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Wikipedia wikipedia0 = new Wikipedia();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://en.wikipedia.org/");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "Comment");
      String[] stringArray0 = new String[4];
      Wikipedia.main(stringArray0);
  }
}
