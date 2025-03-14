/*
 * This file was automatically generated by EvoSuite
 * Sat Oct 19 08:27:29 GMT 2019
 */

package net.mooctest;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import net.mooctest.MathParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MathParser_ESTest extends MathParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      double double0 = MathParser.solveBinaryOperation(1481.0, "+", 1481.0);
      assertEquals(2962.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      double double0 = MathParser.solveBinaryOperation(0.0, "*", (-1571.0));
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      double double0 = MathParser.solveBinaryOperation((-1.0), "*", 0.0);
      assertEquals(-0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      double double0 = MathParser.solveBinaryOperation(3885.755456, "/", (-509.346));
      assertEquals((-7.628911301944061), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      double double0 = MathParser.solveBinaryOperation(1139.41, "%", 438.02805);
      assertEquals(263.35390000000007, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      double double0 = MathParser.factorial(2.0);
      assertEquals(2.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      double double0 = MathParser.solveUnaryFunction("rad", 0.0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = MathParser.isNumber("8");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathParser.solveUnaryFunction((String) null, 0.0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        MathParser.solveBinaryOperation(678.5148826339466, (String) null, 678.5148826339466);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      MathParser.factorial(Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      double double0 = MathParser.solveUnaryFunction("log", 1634.6504);
      assertEquals(7.399184237838067, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      double double0 = MathParser.solveUnaryFunction("exp", 29.331217519999882);
      assertEquals(5.475022602865668E12, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      double double0 = MathParser.solveUnaryFunction("abs", (-1789.451640559));
      assertEquals(1789.451640559, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      MathParser.solveUnaryFunction("fct", Double.POSITIVE_INFINITY);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      double double0 = MathParser.solveUnaryFunction("deg", 1.0);
      assertEquals(57.29577951308232, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      try { 
        MathParser.solveUnaryFunction("*", 1.0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // ExpressionParserException
         //
         verifyException("net.mooctest.MathParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      double double0 = MathParser.solveUnaryFunction("ctn", 11.65039999999999);
      assertEquals((-0.7678470391219846), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      double double0 = MathParser.solveUnaryFunction("sec", (-2091.533822));
      assertEquals(1.388743374498124, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      double double0 = MathParser.solveUnaryFunction("csc", 10.755455999999867);
      assertEquals((-1.0295375869859682), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      double double0 = MathParser.solveUnaryFunction("tan", 37.319826000000035);
      assertEquals((-0.3985848707022195), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      double double0 = MathParser.solveUnaryFunction("cos", (-1.0));
      assertEquals(0.5403023058681398, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      double double0 = MathParser.solveUnaryFunction("sin", (-1.0));
      assertEquals((-0.8414709848078965), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      double double0 = MathParser.solveUnaryFunction("rad", 1.7554559999998673);
      assertEquals(0.030638487073887263, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      double double0 = MathParser.solveBinaryOperation((-0.8414709848078965), "-", (-462.837551368));
      assertEquals(461.9960803831921, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      double double0 = MathParser.solveBinaryOperation(0.0, "+", (-1789.451640559));
      assertEquals((-1789.451640559), double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      double double0 = MathParser.solveBinaryOperation(3401.88742904913, "", 4679.2381514423);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      double double0 = MathParser.solveBinaryOperation((-2765.275758633), "^", (-2665.39415883085));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      double double0 = MathParser.factorial(1.0);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      double double0 = MathParser.factorial(3044.874411188);
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = MathParser.isNumber((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MathParser mathParser0 = new MathParser();
  }
}
