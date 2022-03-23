/*
 * This file was automatically generated by EvoSuite
 * Tue Mar 22 23:34:38 GMT 2022
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.ParseErrorList;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParseErrorList_ESTest extends ParseErrorList_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ParseErrorList parseErrorList0 = new ParseErrorList(3487, 686);
      boolean boolean0 = parseErrorList0.canAddError();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ParseErrorList parseErrorList0 = new ParseErrorList(0, 0);
      boolean boolean0 = parseErrorList0.canAddError();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.tracking(0);
      assertTrue(parseErrorList0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ParseErrorList parseErrorList0 = new ParseErrorList(3487, 686);
      int int0 = parseErrorList0.getMaxSize();
      assertEquals(686, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ParseErrorList parseErrorList0 = ParseErrorList.noTracking();
      assertTrue(parseErrorList0.isEmpty());
  }
}
