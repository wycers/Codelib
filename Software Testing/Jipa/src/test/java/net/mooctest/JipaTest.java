package net.mooctest;


import static org.junit.Assert.*;
import static org.junit.contrib.java.lang.system.TextFromStandardInputStream.emptyStandardInputStream;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import org.junit.contrib.java.lang.system.ExpectedSystemExit;
import org.junit.contrib.java.lang.system.SystemErrRule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.util.ArrayList;


public class JipaTest {

    @Before
    public void handleBefore() {
        Jipa.TOTAL_INSTRUCTIONS = 0;
        Jipa.instruction = new String[0];
        Jipa.iPtr = 0;
        Label.labelList = new ArrayList<Label>();
    }

    @Test(timeout = 4000)
    public void test() {

        int int0 = Jipa.getValue("");

    }

    @org.junit.Test(timeout = 4000)
    public void test0() throws java.lang.Throwable {
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = -198;
        java.lang.String string0 = net.mooctest.Jipa.getStringValue("~i:kp,m[65(b|-Zc\"");
        org.junit.Assert.assertEquals("0", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test1() throws java.lang.Throwable {
        net.mooctest.Jipa.processInstruction("");
        java.lang.String string0 = net.mooctest.Jipa.getStringValue("cp\"");
        org.junit.Assert.assertEquals("0", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test2() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = net.mooctest.Jipa.splitArguments(",Xg&|bO,jL");
        org.junit.Assert.assertEquals(3, stringArray0.length);
        org.junit.Assert.assertNotNull(stringArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test3() throws java.lang.Throwable {
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = -82;
        net.mooctest.Jipa.resetInstructions();
    }

    @org.junit.Test(timeout = 4000)
    public void test4() throws java.lang.Throwable {
        net.mooctest.Jipa.processInstruction("");
        net.mooctest.Jipa.resetInstructions();
    }

    @org.junit.Test(timeout = 4000)
    public void test5() throws java.lang.Throwable {
        java.lang.String string0 = net.mooctest.Jipa.removeComment("");
        org.junit.Assert.assertEquals("", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test6() throws java.lang.Throwable {
        boolean boolean0 = net.mooctest.Jipa.isNumeric("00");
        assertTrue(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test7() throws java.lang.Throwable {
        int int0 = net.mooctest.Jipa.getValue("5");
        org.junit.Assert.assertEquals(5, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test9() throws java.lang.Throwable {
        int int0 = net.mooctest.Jipa.getJumpValue("3");
        org.junit.Assert.assertEquals(2, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test12() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.splitArguments(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test13() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.removeComment(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test15() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.loadInstructions(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test16() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.getValue(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test17() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.getStringValue(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test18() throws java.lang.Throwable {
        net.mooctest.Label.labelList = null;
        // Undeclared exception!
        try {
            net.mooctest.Jipa.getJumpValue("&y-KM3U|`\"%veu m");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test19() throws java.lang.Throwable {
        int int0 = net.mooctest.Jipa.getValue("hh7");
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test20() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = net.mooctest.Jipa.splitArguments("div");
        org.junit.Assert.assertEquals(1, stringArray0.length);
        org.junit.Assert.assertNotNull(stringArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test21() throws java.lang.Throwable {
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = 512;
        // Undeclared exception!
        try {
            net.mooctest.Jipa.resetInstructions();
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test22() throws java.lang.Throwable {
        java.lang.String string0 = net.mooctest.Jipa.removeComment("&");
        org.junit.Assert.assertEquals("&", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test23() throws java.lang.Throwable {
        net.mooctest.Jipa.opcodes jipa_opcodes0 = net.mooctest.Jipa.opcodes.toOpcode("9htZW\",ACmg");
        org.junit.Assert.assertEquals(net.mooctest.Jipa.opcodes.novalue, jipa_opcodes0);
    }

    @org.junit.Test(timeout = 4000)
    public void test24() throws java.lang.Throwable {
        boolean boolean0 = net.mooctest.Jipa.isNumeric("z^e;mOMx!<&{T3T5k.?");
        org.junit.Assert.assertFalse(boolean0);
    }

    @org.junit.Test(timeout = 4000)
    public void test26() throws java.lang.Throwable {
        java.lang.String string0 = net.mooctest.Jipa.getStringValue("\"-S~~MfzEv![ne");
        org.junit.Assert.assertEquals("0", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test27() throws java.lang.Throwable {
        java.lang.String string0 = net.mooctest.Jipa.getStringValue("*<v\"B BI9BoE5[?\"L");
        org.junit.Assert.assertEquals("-1B BI9BoE5[?0", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test28() throws java.lang.Throwable {
        java.lang.String string0 = net.mooctest.Jipa.getStringValue("net.mooctest.Variable");
        org.junit.Assert.assertEquals("0", string0);
        org.junit.Assert.assertNotNull(string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test31() throws java.lang.Throwable {
        int int0 = net.mooctest.Jipa.getJumpValue("00");
        org.junit.Assert.assertEquals((-1), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test32() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = net.mooctest.Jipa.splitArguments("IvC}v$Ot@X\"O{7q*,");
        org.junit.Assert.assertEquals(1, stringArray0.length);
        org.junit.Assert.assertNotNull(stringArray0);
    }

    @org.junit.Test(timeout = 4000)
    public void test33() throws java.lang.Throwable {
        java.lang.String[] stringArray0 = net.mooctest.Jipa.splitArguments("r5P_S,/TnPd0!");
        org.junit.Assert.assertEquals(2, stringArray0.length);
    }

    @org.junit.Test(timeout = 4000)
    public void test34() throws java.lang.Throwable {
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = 22;
        // Undeclared exception!
        try {
            net.mooctest.Jipa.loadInstructions("g1\"");
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test35() throws java.lang.Throwable {
        java.lang.String string0 = net.mooctest.Jipa.removeComment("$bvp\u007fb;xs\"pnz");
        org.junit.Assert.assertEquals("$bvp\u007fb;xs\"pnz", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test36() throws java.lang.Throwable {
        java.lang.String string0 = net.mooctest.Jipa.removeComment("`y:2pmr.J@wRG\"t;U5");
        org.junit.Assert.assertEquals("`y:2pmr.J@wRG\"t", string0);
    }

    @org.junit.Test(timeout = 4000)
    public void test40() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("jne");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test41() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("je");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test42() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("jz");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test43() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("jbe");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test44() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("jae");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test45() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("ja");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test47() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("and");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test48() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("or");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test49() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("xor");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test50() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("var");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test51() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("arr");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test52() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("del");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test53() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("out");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @org.junit.Test(timeout = 4000)
    public void test54() throws java.lang.Throwable {
        // Undeclared exception!
        exit.expectSystemExit();
        net.mooctest.Jipa.processInstruction("halt");
    }

    @org.junit.Test(timeout = 4000)
    public void test55() throws java.lang.Throwable {
        net.mooctest.Jipa.processInstruction("lbl ");
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = 22;
        // Undeclared exception!
        try {
            net.mooctest.Jipa.loadInstructions("g1\"");
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            //
            // 0
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test56() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Jipa.processInstruction("jnz");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test58() throws java.lang.Throwable {
        net.mooctest.Jipa jipa0 = new net.mooctest.Jipa();
        org.junit.Assert.assertEquals(0, net.mooctest.Jipa.TOTAL_INSTRUCTIONS);
    }

    @org.junit.Test(timeout = 4000)
    public void test59() throws java.lang.Throwable {
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = -156;
        net.mooctest.Label.buildLabelList();
    }

    @org.junit.Test(timeout = 4000)
    public void test60() throws java.lang.Throwable {
        net.mooctest.Label label0 = new net.mooctest.Label((-443), "lbl kdo)~g*w%{");
        label0.getName();
        org.junit.Assert.assertEquals((-443), label0.getLine());
    }

    @org.junit.Test(timeout = 4000)
    public void test61() throws java.lang.Throwable {
        net.mooctest.Label label0 = new net.mooctest.Label(852, "");
        label0.getName();
        org.junit.Assert.assertEquals(852, label0.getLine());
    }

    @org.junit.Test(timeout = 4000)
    public void test62() throws java.lang.Throwable {
        net.mooctest.Label label0 = new net.mooctest.Label(0, "");
        int int0 = label0.getLine();
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test63() throws java.lang.Throwable {
        net.mooctest.Label label0 = new net.mooctest.Label((-156), "lbl ");
        int int0 = label0.getLine();
        org.junit.Assert.assertEquals((-156), int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test64() throws java.lang.Throwable {
        net.mooctest.Label.labelList = null;
        // Undeclared exception!
        try {
            net.mooctest.Label.findLabel("");
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test66() throws java.lang.Throwable {
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = 3345;
        java.lang.String[] stringArray0 = new java.lang.String[2];
        stringArray0[0] = "kdo)~.g*.{";
        net.mooctest.Jipa.instruction = stringArray0;
        // Undeclared exception!
        try {
            net.mooctest.Label.buildLabelList();
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test68() throws java.lang.Throwable {
        net.mooctest.Label label0 = new net.mooctest.Label(921, ((java.lang.String) (null)));
        label0.getName();
        org.junit.Assert.assertEquals(921, label0.getLine());
    }

    @org.junit.Test(timeout = 4000)
    public void test69() throws java.lang.Throwable {
        net.mooctest.Jipa.TOTAL_INSTRUCTIONS = 802;
        java.lang.String[] stringArray0 = new java.lang.String[2];
        stringArray0[0] = "lbl kdo)~g*w%{";
        net.mooctest.Jipa.instruction = stringArray0;
        // Undeclared exception!
        try {
            net.mooctest.Label.buildLabelList();
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test70() throws java.lang.Throwable {
        net.mooctest.Variable.removeVariable("");
        boolean boolean0 = net.mooctest.Variable.addVariable("&");
        assertTrue(boolean0);
        int int0 = net.mooctest.Variable.getVariableValue("&");
        org.junit.Assert.assertEquals(0, int0);
        net.mooctest.Variable.setVariableValue("&", 0);
        net.mooctest.Variable.removeVariable("&");
        net.mooctest.Variable.setVariableValue("l", 0);
        net.mooctest.Variable.setVariableValue("&", 0);
        boolean boolean1 = net.mooctest.Variable.addVariable("l");
        assertTrue((boolean1 == boolean0));
        assertTrue(boolean1);
        int int1 = net.mooctest.Variable.getVariableValue("");
        assertTrue((int1 == int0));
        org.junit.Assert.assertEquals(0, int1);
        boolean boolean2 = net.mooctest.Variable.addVariable("&");
        assertTrue((boolean2 == boolean0));
        assertTrue((boolean2 == boolean1));
        assertTrue(boolean2);
        net.mooctest.Variable.setVariableValue("", (-1453));
        int int2 = net.mooctest.Variable.getVariableValue("");
        assertTrue((int2 == int0));
        assertTrue((int2 == int1));
        org.junit.Assert.assertEquals(0, int2);
        net.mooctest.Variable.setVariableValue("", 0);
        int int3 = net.mooctest.Variable.getVariableValue("&");
        assertTrue((int3 == int1));
        assertTrue((int3 == int2));
        assertTrue((int3 == int0));
        org.junit.Assert.assertEquals(0, int3);
        int int4 = net.mooctest.Variable.getVariableValue("");
        assertTrue((int4 == int1));
        assertTrue((int4 == int2));
        assertTrue((int4 == int0));
        assertTrue((int4 == int3));
        org.junit.Assert.assertEquals(0, int4);
        boolean boolean3 = net.mooctest.Variable.addVariable("&");
        assertTrue((boolean3 == boolean2));
        assertTrue((boolean3 == boolean1));
        assertTrue((boolean3 == boolean0));
        assertTrue(boolean3);
        boolean boolean4 = net.mooctest.Variable.addVariable("");
        assertTrue((boolean4 == boolean3));
        assertTrue((boolean4 == boolean2));
        assertTrue((boolean4 == boolean0));
        assertTrue((boolean4 == boolean1));
        assertTrue(boolean4);
        net.mooctest.Variable.setVariableValue("", (-1453));
        boolean boolean5 = net.mooctest.Variable.addVariable("");
        org.junit.Assert.assertFalse((boolean5 == boolean2));
        org.junit.Assert.assertFalse((boolean5 == boolean1));
        org.junit.Assert.assertFalse((boolean5 == boolean0));
        org.junit.Assert.assertFalse((boolean5 == boolean4));
        org.junit.Assert.assertFalse((boolean5 == boolean3));
        org.junit.Assert.assertFalse(boolean5);
        boolean boolean6 = net.mooctest.Variable.addVariable("");
        org.junit.Assert.assertFalse((boolean6 == boolean4));
        org.junit.Assert.assertFalse((boolean6 == boolean0));
        org.junit.Assert.assertFalse((boolean6 == boolean2));
        org.junit.Assert.assertFalse((boolean6 == boolean3));
        assertTrue((boolean6 == boolean5));
        org.junit.Assert.assertFalse((boolean6 == boolean1));
        org.junit.Assert.assertFalse(boolean6);
        net.mooctest.Variable.removeVariable("*");
        // Undeclared exception!
        try {
            net.mooctest.Variable.getVariableValue("&");
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test71() throws java.lang.Throwable {
        java.lang.String string0 = "";
        int int0 = net.mooctest.Variable.getVariableValue("");
        org.junit.Assert.assertEquals(-1453, int0);
        int int1 = net.mooctest.Variable.getVariableValue("");
        assertTrue((int1 == int0));
        org.junit.Assert.assertEquals(-1453, int1);
        net.mooctest.Variable.setVariableValue("", 1690);
        net.mooctest.Variable.setVariableValue("", 1690);
        net.mooctest.Variable.setVariableValue("", 1690);
        net.mooctest.Variable.setVariableValue("", (-1094));
        net.mooctest.Variable.setVariableValue("", (-14));
        int int2 = net.mooctest.Variable.getVariableValue("");
        org.junit.Assert.assertFalse((int2 == int1));
        org.junit.Assert.assertFalse((int2 == int0));
        org.junit.Assert.assertEquals((-14), int2);
        int int3 = net.mooctest.Variable.getVariableValue("");
        assertTrue((int3 == int2));
        org.junit.Assert.assertFalse((int3 == int0));
        org.junit.Assert.assertFalse((int3 == int1));
        org.junit.Assert.assertEquals((-14), int3);
        // Undeclared exception!
        try {
            net.mooctest.Variable.setVariableValue("&", (-14));
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test72() throws java.lang.Throwable {
        java.lang.String string0 = "&";
        // Undeclared exception!
        try {
            net.mooctest.Variable.getVariableValue("&");
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test73() throws java.lang.Throwable {
        net.mooctest.Variable.setVariableValue("^", 435);
        int int0 = net.mooctest.Variable.getVariableValue(">a6l]36xlB");
        org.junit.Assert.assertEquals(0, int0);
        net.mooctest.Variable.removeVariable(">a6l]36xlB");
        java.lang.String string0 = "";
        boolean boolean0 = net.mooctest.Variable.addVariable("");
        org.junit.Assert.assertFalse(boolean0);
        boolean boolean1 = net.mooctest.Variable.addVariable("");
        assertTrue((boolean1 == boolean0));
        org.junit.Assert.assertFalse(boolean1);
        java.lang.String string1 = "&";
        int int1 = 0;
        // Undeclared exception!
        try {
            net.mooctest.Variable.setVariableValue("&", 0);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test74() throws java.lang.Throwable {
        int int0 = net.mooctest.Variable.getVariableValue("sX");
        org.junit.Assert.assertEquals(0, int0);
        int int1 = net.mooctest.Variable.getVariableValue("}N");
        assertTrue((int1 == int0));
        org.junit.Assert.assertEquals(0, int1);
        net.mooctest.Variable.removeVariable("sX");
        // Undeclared exception!
        try {
            net.mooctest.Variable.setVariableValue("&", 0);
            org.junit.Assert.fail("Expecting exception: ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test75() throws java.lang.Throwable {
        net.mooctest.Variable.setVariableValue("*", 0);
        net.mooctest.Variable.removeVariable("Ow");
        int int0 = net.mooctest.Variable.getVariableValue("[^dL]o1V%~O2a(tD");
        org.junit.Assert.assertEquals(0, int0);
        net.mooctest.Variable.removeVariable("Ow");
        int int1 = net.mooctest.Variable.getVariableValue("*");
        org.junit.Assert.assertFalse((int1 == int0));
        org.junit.Assert.assertEquals((4), int1);
    }

    @org.junit.Test(timeout = 4000)
    public void test76() throws java.lang.Throwable {
        int int0 = net.mooctest.Variable.getVariableValue("net.mooctest.Variable");
        org.junit.Assert.assertEquals(0, int0);
        net.mooctest.Variable.removeVariable("");
        int int1 = net.mooctest.Variable.getVariableValue("");
        assertTrue((int1 == int0));
        org.junit.Assert.assertEquals(0, int1);
        boolean boolean0 = net.mooctest.Variable.addVariable("");
        assertTrue(boolean0);
        java.lang.String string0 = "";
        net.mooctest.Variable.removeVariable("");
        // Undeclared exception!
        try {
            net.mooctest.Variable.removeVariable(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test77() throws java.lang.Throwable {
        java.lang.String string0 = null;
        // Undeclared exception!
        try {
            net.mooctest.Variable.addVariable(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test78() throws java.lang.Throwable {
        net.mooctest.Variable.setVariableValue("K2nR }", 0);
        net.mooctest.Variable.removeVariable("K2nR }");
        java.lang.String string0 = null;
        // Undeclared exception!
        try {
            net.mooctest.Variable.setVariableValue(((java.lang.String) (null)), 0);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test79() throws java.lang.Throwable {
        // Undeclared exception!
        try {
            net.mooctest.Variable.getVariableValue(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test80() throws java.lang.Throwable {
        net.mooctest.Variable.setVariableValue("", (-1677499287));
        net.mooctest.Variable.removeVariable("");
        net.mooctest.Variable.addVariable("");
        net.mooctest.Variable.setVariableValue("", (-1677499287));
        boolean boolean0 = net.mooctest.Variable.addVariable("");
        net.mooctest.Variable.removeVariable("");
        net.mooctest.Variable.getVariableValue("");
        net.mooctest.Variable.getVariableValue("");
        net.mooctest.Variable.addVariable("`CCw(@[");
        net.mooctest.Variable.getVariableValue("");
        net.mooctest.Variable.getVariableValue("%;PI>qe;@TPVkLP");
        boolean boolean1 = net.mooctest.Variable.addVariable("68xNsroO$g(5w?");
        org.junit.Assert.assertFalse((boolean1 == boolean0));
        net.mooctest.Variable.removeVariable("`CCw(@[");
        net.mooctest.Variable.removeVariable("&");
        net.mooctest.Variable.getVariableValue("{Cz7*l");
        net.mooctest.Variable.removeVariable("");
        net.mooctest.Variable.removeVariable("{Cz7*l");
        net.mooctest.Variable.addVariable("{Cz7*l");
        net.mooctest.Variable.getVariableValue("%;PI>qe;@TPVkLP");
        net.mooctest.Variable.setVariableValue("`CCw(@[", 0);
        net.mooctest.Variable.getVariableValue("68xNsroO$g(5w?");
        int int0 = net.mooctest.Variable.getVariableValue("l_bLcBo<");
        org.junit.Assert.assertEquals(0, int0);
    }

    @org.junit.Test(timeout = 4000)
    public void test81() throws java.lang.Throwable {
        net.mooctest.Variable.addVariable("&");
        net.mooctest.Variable.setVariableValue("&", (-1));
        net.mooctest.Variable.addVariable("");
        net.mooctest.Variable.addVariable("");
        net.mooctest.Variable.removeVariable("");
        net.mooctest.Variable.setVariableValue("&", 0);
    }

    @org.junit.Test(timeout = 4000)
    public void test82() throws java.lang.Throwable {
        java.lang.String string0 = "kn6BPb~[&@d]r%3!kUo";
        net.mooctest.Variable.getVariableValue("kn6BPb~[&@d]r%3!kUo");
        net.mooctest.Variable.setVariableValue("kn6BPb~[&@d]r%3!kUo", 0);
        net.mooctest.Variable.addVariable("1o>2LXpM[Kw{p|]M(");
        net.mooctest.Variable.setVariableValue("1o>2LXpM[Kw{p|]M(", 0);
        net.mooctest.Variable.setVariableValue("j", 0);
        net.mooctest.Variable.addVariable("net.mooctest.Variable");
        net.mooctest.Variable.addVariable("kn6BPb~[&@d]r%3!kUo");
        java.lang.String string1 = null;
        // Undeclared exception!
        try {
            net.mooctest.Variable.addVariable(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test83() throws java.lang.Throwable {
        net.mooctest.Variable.removeVariable("2~HR/Y`");
        // Undeclared exception!
        try {
            net.mooctest.Variable.addVariable(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test84() throws java.lang.Throwable {
        net.mooctest.Variable.removeVariable("");
        net.mooctest.Variable.getVariableValue("");
        net.mooctest.Variable.setVariableValue("\"<", 0);
        net.mooctest.Variable.addVariable("T~U;7?]@xtjr87i<%");
        net.mooctest.Variable.removeVariable("kob@L,v43h>z[");
        net.mooctest.Variable.setVariableValue("kob@L,v43h>z[", (-2261));
        net.mooctest.Variable.removeVariable("kob@L,v43h>z[");
        net.mooctest.Variable.addVariable("");
        net.mooctest.Variable.addVariable("");
        net.mooctest.Variable.addVariable("T~U;7?]@xtjr87i<%");
        net.mooctest.Variable.removeVariable("T~U;7?]@xtjr87i<%");
        net.mooctest.Variable.removeVariable("kob@L,v43h>z[");
        net.mooctest.Variable.getVariableValue("T~U;7?]@xtjr87i<%");
        net.mooctest.Variable.addVariable("");
        net.mooctest.Variable.setVariableValue("s", (-1320));
        net.mooctest.Variable.getVariableValue("");
        // Undeclared exception!
        try {
            net.mooctest.Variable.setVariableValue(((java.lang.String) (null)), 718);
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @org.junit.Test(timeout = 4000)
    public void test85() throws java.lang.Throwable {
        net.mooctest.Variable.getVariableValue(",@ly0%US^y");
        net.mooctest.Variable.removeVariable(",@ly0%US^y");
        boolean boolean0 = net.mooctest.Variable.addVariable("oaT6*");
        assertTrue(boolean0);
        int int0 = net.mooctest.Variable.getVariableValue("oaT6*");
        org.junit.Assert.assertEquals(0, int0);
        net.mooctest.Variable.getVariableValue("6,]4apOus?m");
        net.mooctest.Variable.removeVariable("");
        net.mooctest.Variable.removeVariable("zq!xuD#");
        net.mooctest.Variable.addVariable("zq!xuD#");
        net.mooctest.Variable.getVariableValue("zq!xuD#");
        net.mooctest.Variable.setVariableValue("oaT6*", 0);
        net.mooctest.Variable.getVariableValue("");
        net.mooctest.Variable.setVariableValue("", (-1));
        net.mooctest.Variable.getVariableValue("");
        net.mooctest.Variable.getVariableValue("Ohfd@f,SJSsa0QEOwri");
        net.mooctest.Variable.getVariableValue(",@ly0%US^y");
        net.mooctest.Variable.getVariableValue("jK 2,:_(4:S45h%*");
        int int1 = net.mooctest.Variable.getVariableValue("oaT6*");
        org.junit.Assert.assertEquals(0, int1);
    }

    @org.junit.Test(timeout = 4000)
    public void test86() throws java.lang.Throwable {
        net.mooctest.Variable.getVariableValue("");
        net.mooctest.Variable.addVariable("DNv*~l QIcEUN:N@|I");
        net.mooctest.Variable.getVariableValue("du,t?F^wX+P*Vz1N)w?");
        net.mooctest.Variable.setVariableValue("", 2005);
        net.mooctest.Variable.getVariableValue("");
        net.mooctest.Variable.addVariable("du,t?F^wX+P*Vz1N)w?");
        net.mooctest.Variable.removeVariable("DN0PPpl}Q");
        net.mooctest.Variable.getVariableValue("*");
        net.mooctest.Variable.removeVariable("net.mooctest.Variable");
        net.mooctest.Variable.getVariableValue("DNv*~l QIcEUN:N@|I");
        net.mooctest.Variable.setVariableValue("}f/b]", 2141);
        net.mooctest.Variable.addVariable("");
        net.mooctest.Variable.removeVariable("");
    }

    @org.junit.Test(timeout = 4000)
    public void test87() throws java.lang.Throwable {
        net.mooctest.Variable.addVariable("");
        net.mooctest.Variable.removeVariable("&14_!)P*5n Z");
        net.mooctest.Variable.setVariableValue("zMsv ba3rS<xiv$5\u0006!", 3117);
    }

    @org.junit.Test(timeout = 4000)
    public void test88() throws java.lang.Throwable {
        net.mooctest.Variable.getVariableValue("AOP2Rk69F;lM>\"");
        net.mooctest.Variable.setVariableValue("6$Pf3EIJM-.K", 0);
        net.mooctest.Variable.setVariableValue("6$Pf3EIJM-.K", 0);
        net.mooctest.Variable.addVariable("*");
        java.lang.String string0 = "mOs$v a;ae;ya:P\"";
        int int0 = 0;
        net.mooctest.Variable.setVariableValue("mOs$v a;ae;ya:P\"", 0);
        java.lang.String string1 = "";
        net.mooctest.Variable.addVariable("");
        java.lang.String string2 = "|!6Q{R*lq";
        net.mooctest.Variable.getVariableValue("|!6Q{R*lq");
        net.mooctest.Variable.getVariableValue("*");
        java.lang.String string3 = "net.mooctest.Variable";
        net.mooctest.Variable.removeVariable("net.mooctest.Variable");
        net.mooctest.Variable.getVariableValue("6$Pf3EIJM-.K");
        net.mooctest.Variable.addVariable("|!6Q{R*lq");
        // Undeclared exception!
        try {
            net.mooctest.Variable.removeVariable(((java.lang.String) (null)));
            org.junit.Assert.fail("Expecting exception: NullPointerException");
        } catch (java.lang.NullPointerException e) {
            //
            // no message in exception (getMessage() returned null)
            //
        }
    }

    @Test(timeout = 4000)
    public void test89() throws java.lang.Throwable {
        Jipa jipa = new Jipa();
        exit.expectSystemExit();
        jipa.processInstruction("halt");
    }

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Rule
    public final SystemErrRule systemErrorRule = new SystemErrRule().enableLog();

    @Test(timeout = 4000)
    public void test90() throws java.lang.Throwable {
        Jipa jipa = new Jipa();
        jipa.processInstruction("var a");
        jipa.processInstruction("out a");
        jipa.processInstruction("inc a");
        jipa.processInstruction("out a");
        jipa.processInstruction("dec a");
        jipa.processInstruction("out a");
        assertEquals("0\n1\n0\n", systemOutRule.getLog().replaceAll("\r\n", "\n"));
    }

    @Test(timeout = 4000)
    public void test91() throws java.lang.Throwable {
        Jipa jipa = new Jipa();
        jipa.processInstruction("var a");
        jipa.processInstruction("var b");
        jipa.processInstruction("set b,6");
        jipa.processInstruction("and a,b");
        jipa.processInstruction("out a");
        jipa.processInstruction("out b");
        jipa.processInstruction("add a,b");
        jipa.processInstruction("out a");
        jipa.processInstruction("out b");
        jipa.processInstruction("sub a,b");
        jipa.processInstruction("out a");
        jipa.processInstruction("out b");
        jipa.processInstruction("or a,b");
        jipa.processInstruction("out a");
        jipa.processInstruction("out b");
        jipa.processInstruction("xor a,b");
        jipa.processInstruction("out a");
        jipa.processInstruction("out b");
        jipa.processInstruction("set a,6");
        jipa.processInstruction("set b,6");
        jipa.processInstruction("mul a,b");
        jipa.processInstruction("out a");
        jipa.processInstruction("out b");
        jipa.processInstruction("set a,6");
        jipa.processInstruction("set b,6");
        jipa.processInstruction("div a,b");
        jipa.processInstruction("out a");
        jipa.processInstruction("out b");
        jipa.processInstruction("set a,6");
        jipa.processInstruction("set b,4");
        jipa.processInstruction("mod a,b");
        jipa.processInstruction("out a");
        jipa.processInstruction("out b");
        jipa.processInstruction("arr c,4");
        jipa.processInstruction("out a");
        jipa.processInstruction("out b");
        assertEquals("6\n" +
                "6\n" +
                "12\n" +
                "6\n" +
                "6\n" +
                "6\n" +
                "6\n" +
                "6\n" +
                "0\n" +
                "6\n" +
                "36\n" +
                "6\n" +
                "1\n" +
                "6\n" +
                "2\n" +
                "4\n" +
                "2\n" +
                "4\n", systemOutRule.getLog().replaceAll("\r\n", "\n"));
    }

    @Rule
    public final TextFromStandardInputStream systemInMock = emptyStandardInputStream();


    @Test(timeout = 4000)
    public void test92() throws java.lang.Throwable {
        Jipa jipa = new Jipa();
        systemInMock.provideLines("qwq.txt\n");
        Label.labelList = new ArrayList<Label>();

        assertTrue(jipa.loadInstructions(""));

        jipa.processInstruction("jmp label");

        assertEquals(1, jipa.iPtr);

        jipa.processInstruction("jmp sb");
        assertEquals(-1, jipa.iPtr);

        jipa.processInstruction("var a");
        jipa.processInstruction("var a");

        jipa.processInstruction("jnz 1,label");
        assertEquals(1, jipa.iPtr);
        jipa.processInstruction("jnz 0,label");
        assertEquals(2, jipa.iPtr);

        jipa.processInstruction("jz 0,label");
        assertEquals(1, jipa.iPtr);
        jipa.processInstruction("jz 1,label");
        assertEquals(2, jipa.iPtr);

        jipa.processInstruction("ja 2,1,label");
        assertEquals(1, jipa.iPtr);
        jipa.processInstruction("ja 1,1,label");
        assertEquals(2, jipa.iPtr);

        jipa.processInstruction("jae 2,1,label");
        assertEquals(1, jipa.iPtr);
        jipa.processInstruction("jae 1,1,label");
        assertEquals(1, jipa.iPtr);
        jipa.processInstruction("jae 0,1,label");
        assertEquals(2, jipa.iPtr);

        jipa.processInstruction("jb 1,2,label");
        assertEquals(1, jipa.iPtr);
        jipa.processInstruction("jb 1,1,label");
        assertEquals(2, jipa.iPtr);

        jipa.processInstruction("jbe 1,2,label");
        assertEquals(1, jipa.iPtr);
        jipa.processInstruction("jbe 1,1,label");
        assertEquals(1, jipa.iPtr);
        jipa.processInstruction("jbe 1,0,label");
        assertEquals(2, jipa.iPtr);


        jipa.processInstruction("je 1,2,label");
        assertEquals(3, jipa.iPtr);
        jipa.processInstruction("je 1,1,label");
        assertEquals(1, jipa.iPtr);
        jipa.processInstruction("je 1,0,label");
        assertEquals(2, jipa.iPtr);


        jipa.processInstruction("jne 1,2,label");
        assertEquals(1, jipa.iPtr);
        jipa.processInstruction("jne 1,1,label");
        assertEquals(2, jipa.iPtr);
        jipa.processInstruction("jne 1,0,label");
        assertEquals(1, jipa.iPtr);

        jipa.processInstruction("set a,2");
        jipa.processInstruction("cmp 1,2,a");
        jipa.processInstruction("out a");
        jipa.processInstruction("set a,2");
        jipa.processInstruction("cmp 1,1,a");
        jipa.processInstruction("out a");

        jipa.processInstruction("var b");
        jipa.processInstruction("mov a,b");
        jipa.processInstruction("out a");
        jipa.processInstruction("out b");
        jipa.processInstruction("cpy b,a");
        jipa.processInstruction("out a");
        jipa.processInstruction("out b");


        assertEquals("Enter the full path to the file or type q to quit :\n" +
                "0\n" +
                "1\n" +
                "0\n" +
                "1\n" +
                "1\n" +
                "1\n", systemOutRule.getLog().replaceAll("\r\n", "\n"));

        systemInMock.provideLines("2");
        assertEquals(2, jipa.readValue());
        systemInMock.provideLines("w");
        assertEquals(0, jipa.readValue());

        jipa.resetInstructions();
    }

    @Test(timeout = 4000)
    public void test93() throws java.lang.Throwable {
        Jipa jipa = new Jipa();

        assertFalse(jipa.loadInstructions("qaq.txt"));
        assertTrue(systemErrorRule.getLog().replaceAll("\r\n", "\n").contains("java.io.FileNotFoundException: qaq.txt"));

        exit.expectSystemExit();
        assertFalse(jipa.loadInstructions("q"));
    }

    @Test(timeout = 4000)
    public void test94() throws java.lang.Throwable {
        Jipa jipa = new Jipa();
        jipa.processInstruction("var a");
        systemInMock.provideLines("5\n");
        jipa.processInstruction("in a");
        jipa.processInstruction("out a");
        assertEquals("5\n", systemOutRule.getLog().replaceAll("\r\n", "\n"));
        jipa.processInstruction("del a");

        assertEquals(";\"",jipa.removeComment(";\""));
        assertEquals("\"",jipa.removeComment("\";"));
        assertEquals("0asd000a",jipa.getStringValue("\"\"\"asd\"asd\"\"a\"\"a\"a\""));
    }
}

