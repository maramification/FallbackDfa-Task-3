package csen1002.tests.task3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task3.FallbackDfa;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task3TestsBatch0 {

	@Test
	public void testFallbackDfa1String1() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11#h;k;o;r;s#0,h,5;0,k,2;0,o,11;0,r,5;0,s,5;1,h,4;1,k,10;1,o,7;1,r,11;1,s,9;2,h,10;2,k,3;2,o,6;2,r,2;2,s,3;3,h,8;3,k,11;3,o,3;3,r,11;3,s,10;4,h,10;4,k,9;4,o,3;4,r,8;4,s,5;5,h,3;5,k,3;5,o,9;5,r,6;5,s,7;6,h,4;6,k,9;6,o,7;6,r,0;6,s,11;7,h,3;7,k,5;7,o,7;7,r,1;7,s,1;8,h,10;8,k,0;8,o,2;8,r,9;8,s,1;9,h,0;9,k,8;9,o,4;9,r,11;9,s,10;10,h,10;10,k,11;10,o,5;10,r,0;10,s,7;11,h,3;11,k,6;11,o,5;11,r,10;11,s,2#2#3;4;7");
		assertEquals("oroookoooshkkhs,7;rk,3;k,3;rro,6", fallbackDfa.run("oroookoooshkkhsrkkrro"));
	}

	@Test
	public void testFallbackDfa1String2() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11#h;k;o;r;s#0,h,5;0,k,2;0,o,11;0,r,5;0,s,5;1,h,4;1,k,10;1,o,7;1,r,11;1,s,9;2,h,10;2,k,3;2,o,6;2,r,2;2,s,3;3,h,8;3,k,11;3,o,3;3,r,11;3,s,10;4,h,10;4,k,9;4,o,3;4,r,8;4,s,5;5,h,3;5,k,3;5,o,9;5,r,6;5,s,7;6,h,4;6,k,9;6,o,7;6,r,0;6,s,11;7,h,3;7,k,5;7,o,7;7,r,1;7,s,1;8,h,10;8,k,0;8,o,2;8,r,9;8,s,1;9,h,0;9,k,8;9,o,4;9,r,11;9,s,10;10,h,10;10,k,11;10,o,5;10,r,0;10,s,7;11,h,3;11,k,6;11,o,5;11,r,10;11,s,2#2#3;4;7");
		assertEquals("okhkrhoorkrhrh,4;rk,3;s,3;r,2", fallbackDfa.run("okhkrhoorkrhrhrksr"));
	}

	@Test
	public void testFallbackDfa1String3() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11#h;k;o;r;s#0,h,5;0,k,2;0,o,11;0,r,5;0,s,5;1,h,4;1,k,10;1,o,7;1,r,11;1,s,9;2,h,10;2,k,3;2,o,6;2,r,2;2,s,3;3,h,8;3,k,11;3,o,3;3,r,11;3,s,10;4,h,10;4,k,9;4,o,3;4,r,8;4,s,5;5,h,3;5,k,3;5,o,9;5,r,6;5,s,7;6,h,4;6,k,9;6,o,7;6,r,0;6,s,11;7,h,3;7,k,5;7,o,7;7,r,1;7,s,1;8,h,10;8,k,0;8,o,2;8,r,9;8,s,1;9,h,0;9,k,8;9,o,4;9,r,11;9,s,10;10,h,10;10,k,11;10,o,5;10,r,0;10,s,7;11,h,3;11,k,6;11,o,5;11,r,10;11,s,2#2#3;4;7");
		assertEquals("oroosososorkhhs,7;s,3;k,3;k,3;k,3", fallbackDfa.run("oroosososorkhhsskkk"));
	}

	@Test
	public void testFallbackDfa1String4() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11#h;k;o;r;s#0,h,5;0,k,2;0,o,11;0,r,5;0,s,5;1,h,4;1,k,10;1,o,7;1,r,11;1,s,9;2,h,10;2,k,3;2,o,6;2,r,2;2,s,3;3,h,8;3,k,11;3,o,3;3,r,11;3,s,10;4,h,10;4,k,9;4,o,3;4,r,8;4,s,5;5,h,3;5,k,3;5,o,9;5,r,6;5,s,7;6,h,4;6,k,9;6,o,7;6,r,0;6,s,11;7,h,3;7,k,5;7,o,7;7,r,1;7,s,1;8,h,10;8,k,0;8,o,2;8,r,9;8,s,1;9,h,0;9,k,8;9,o,4;9,r,11;9,s,10;10,h,10;10,k,11;10,o,5;10,r,0;10,s,7;11,h,3;11,k,6;11,o,5;11,r,10;11,s,2#2#3;4;7");
		assertEquals("rosrorhhshrrshssks,7;k,3;rk,3;s,3", fallbackDfa.run("rosrorhhshrrshsskskrks"));
	}

	@Test
	public void testFallbackDfa1String5() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10;11#h;k;o;r;s#0,h,5;0,k,2;0,o,11;0,r,5;0,s,5;1,h,4;1,k,10;1,o,7;1,r,11;1,s,9;2,h,10;2,k,3;2,o,6;2,r,2;2,s,3;3,h,8;3,k,11;3,o,3;3,r,11;3,s,10;4,h,10;4,k,9;4,o,3;4,r,8;4,s,5;5,h,3;5,k,3;5,o,9;5,r,6;5,s,7;6,h,4;6,k,9;6,o,7;6,r,0;6,s,11;7,h,3;7,k,5;7,o,7;7,r,1;7,s,1;8,h,10;8,k,0;8,o,2;8,r,9;8,s,1;9,h,0;9,k,8;9,o,4;9,r,11;9,s,10;10,h,10;10,k,11;10,o,5;10,r,0;10,s,7;11,h,3;11,k,6;11,o,5;11,r,10;11,s,2#2#3;4;7");
		assertEquals("kkrohrok,3;k,3;s,3;r,2", fallbackDfa.run("kkrohrokksr"));
	}

	@Test
	public void testFallbackDfa2String1() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10#b;c;g;o#0,b,1;0,c,4;0,g,9;0,o,3;1,b,10;1,c,8;1,g,7;1,o,10;2,b,8;2,c,8;2,g,3;2,o,3;3,b,6;3,c,1;3,g,5;3,o,1;4,b,10;4,c,1;4,g,10;4,o,9;5,b,6;5,c,9;5,g,7;5,o,2;6,b,6;6,c,6;6,g,3;6,o,4;7,b,3;7,c,0;7,g,3;7,o,0;8,b,10;8,c,3;8,g,0;8,o,1;9,b,6;9,c,8;9,g,9;9,o,1;10,b,4;10,c,2;10,g,6;10,o,3#10#3;5");
		assertEquals("co,3;bbbbo,3;cgoccbg,3;bbo,3;o,3", fallbackDfa.run("cobbbbocgoccbgbboo"));
	}

	@Test
	public void testFallbackDfa2String2() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10#b;c;g;o#0,b,1;0,c,4;0,g,9;0,o,3;1,b,10;1,c,8;1,g,7;1,o,10;2,b,8;2,c,8;2,g,3;2,o,3;3,b,6;3,c,1;3,g,5;3,o,1;4,b,10;4,c,1;4,g,10;4,o,9;5,b,6;5,c,9;5,g,7;5,o,2;6,b,6;6,c,6;6,g,3;6,o,4;7,b,3;7,c,0;7,g,3;7,o,0;8,b,10;8,c,3;8,g,0;8,o,1;9,b,6;9,c,8;9,g,9;9,o,1;10,b,4;10,c,2;10,g,6;10,o,3#10#3;5");
		assertEquals("boogbbcbobo,3;oobo,3;oocc,3;o,3;o,3", fallbackDfa.run("boogbbcboboooboooccoo"));
	}

	@Test
	public void testFallbackDfa2String3() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10#b;c;g;o#0,b,1;0,c,4;0,g,9;0,o,3;1,b,10;1,c,8;1,g,7;1,o,10;2,b,8;2,c,8;2,g,3;2,o,3;3,b,6;3,c,1;3,g,5;3,o,1;4,b,10;4,c,1;4,g,10;4,o,9;5,b,6;5,c,9;5,g,7;5,o,2;6,b,6;6,c,6;6,g,3;6,o,4;7,b,3;7,c,0;7,g,3;7,o,0;8,b,10;8,c,3;8,g,0;8,o,1;9,b,6;9,c,8;9,g,9;9,o,1;10,b,4;10,c,2;10,g,6;10,o,3#10#3;5");
		assertEquals("cbgbboogg,3;o,3;co,3;c,2", fallbackDfa.run("cbgbbooggococ"));
	}

	@Test
	public void testFallbackDfa2String4() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10#b;c;g;o#0,b,1;0,c,4;0,g,9;0,o,3;1,b,10;1,c,8;1,g,7;1,o,10;2,b,8;2,c,8;2,g,3;2,o,3;3,b,6;3,c,1;3,g,5;3,o,1;4,b,10;4,c,1;4,g,10;4,o,9;5,b,6;5,c,9;5,g,7;5,o,2;6,b,6;6,c,6;6,g,3;6,o,4;7,b,3;7,c,0;7,g,3;7,o,0;8,b,10;8,c,3;8,g,0;8,o,1;9,b,6;9,c,8;9,g,9;9,o,1;10,b,4;10,c,2;10,g,6;10,o,3#10#3;5");
		assertEquals("gbbocgb,3;bbo,3;og,5;o,3", fallbackDfa.run("gbbocgbbboogo"));
	}

	@Test
	public void testFallbackDfa2String5() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9;10#b;c;g;o#0,b,1;0,c,4;0,g,9;0,o,3;1,b,10;1,c,8;1,g,7;1,o,10;2,b,8;2,c,8;2,g,3;2,o,3;3,b,6;3,c,1;3,g,5;3,o,1;4,b,10;4,c,1;4,g,10;4,o,9;5,b,6;5,c,9;5,g,7;5,o,2;6,b,6;6,c,6;6,g,3;6,o,4;7,b,3;7,c,0;7,g,3;7,o,0;8,b,10;8,c,3;8,g,0;8,o,1;9,b,6;9,c,8;9,g,9;9,o,1;10,b,4;10,c,2;10,g,6;10,o,3#10#3;5");
		assertEquals("obbggobc,3;cgocc,3;og,5;o,3;cbbgg,3", fallbackDfa.run("obbggobccgoccogocbbgg"));
	}

}