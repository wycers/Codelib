/*
 * This file was automatically generated by EvoSuite
 * Sun Oct 25 06:16:01 GMT 2020
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import net.mooctest.TreeNodeException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TreeNodeException_ESTest extends TreeNodeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreeNodeException treeNodeException0 = new TreeNodeException("-@lE8*(aLX5s:");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      TreeNodeException treeNodeException0 = new TreeNodeException("net.mooctest.TreeNodeException", mockThrowable0);
  }
}
