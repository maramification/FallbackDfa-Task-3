package csen1002.tests.task3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.Timeout.ThreadMode;

import csen1002.main.task3.FallbackDfa;

@Timeout(value = 5, unit = TimeUnit.SECONDS, threadMode = ThreadMode.SEPARATE_THREAD)
public class Task3TestsBatch7 {

	@Test
	public void testFallbackDfa1String1() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8#d;f;q;r;v#0,d,6;0,f,8;0,q,8;0,r,0;0,v,1;1,d,0;1,f,8;1,q,6;1,r,3;1,v,1;2,d,8;2,f,8;2,q,1;2,r,2;2,v,7;3,d,7;3,f,7;3,q,2;3,r,4;3,v,6;4,d,8;4,f,0;4,q,3;4,r,1;4,v,6;5,d,6;5,f,3;5,q,4;5,r,2;5,v,1;6,d,5;6,f,3;6,q,6;6,r,2;6,v,6;7,d,2;7,f,8;7,q,1;7,r,4;7,v,6;8,d,2;8,f,0;8,q,1;8,r,0;8,v,8#5#1;7");
		assertEquals("vvqvdvffv,1;rv,7;vvrd,7;v,1", fallbackDfa.run("vvqvdvffvrvvvrdv"));
	}

	@Test
	public void testFallbackDfa1String2() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8#d;f;q;r;v#0,d,6;0,f,8;0,q,8;0,r,0;0,v,1;1,d,0;1,f,8;1,q,6;1,r,3;1,v,1;2,d,8;2,f,8;2,q,1;2,r,2;2,v,7;3,d,7;3,f,7;3,q,2;3,r,4;3,v,6;4,d,8;4,f,0;4,q,3;4,r,1;4,v,6;5,d,6;5,f,3;5,q,4;5,r,2;5,v,1;6,d,5;6,f,3;6,q,6;6,r,2;6,v,6;7,d,2;7,f,8;7,q,1;7,r,4;7,v,6;8,d,2;8,f,0;8,q,1;8,r,0;8,v,8#5#1;7");
		assertEquals("vrrvffqqvrvfqvv,1;rv,7;v,1;qqd,7", fallbackDfa.run("vrrvffqqvrvfqvvrvvqqd"));
	}

	@Test
	public void testFallbackDfa1String3() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8#d;f;q;r;v#0,d,6;0,f,8;0,q,8;0,r,0;0,v,1;1,d,0;1,f,8;1,q,6;1,r,3;1,v,1;2,d,8;2,f,8;2,q,1;2,r,2;2,v,7;3,d,7;3,f,7;3,q,2;3,r,4;3,v,6;4,d,8;4,f,0;4,q,3;4,r,1;4,v,6;5,d,6;5,f,3;5,q,4;5,r,2;5,v,1;6,d,5;6,f,3;6,q,6;6,r,2;6,v,6;7,d,2;7,f,8;7,q,1;7,r,4;7,v,6;8,d,2;8,f,0;8,q,1;8,r,0;8,v,8#5#1;7");
		assertEquals("qqrvdrvrqvrrddv,7;v,1;qqf,7;vfrv,1", fallbackDfa.run("qqrvdrvrqvrrddvvqqfvfrv"));
	}

	@Test
	public void testFallbackDfa1String4() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8#d;f;q;r;v#0,d,6;0,f,8;0,q,8;0,r,0;0,v,1;1,d,0;1,f,8;1,q,6;1,r,3;1,v,1;2,d,8;2,f,8;2,q,1;2,r,2;2,v,7;3,d,7;3,f,7;3,q,2;3,r,4;3,v,6;4,d,8;4,f,0;4,q,3;4,r,1;4,v,6;5,d,6;5,f,3;5,q,4;5,r,2;5,v,1;6,d,5;6,f,3;6,q,6;6,r,2;6,v,6;7,d,2;7,f,8;7,q,1;7,r,4;7,v,6;8,d,2;8,f,0;8,q,1;8,r,0;8,v,8#5#1;7");
		assertEquals("rqv,1;dfrr,1;qr,1;ff,7", fallbackDfa.run("rqvdfrrqrff"));
	}

	@Test
	public void testFallbackDfa1String5() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8#d;f;q;r;v#0,d,6;0,f,8;0,q,8;0,r,0;0,v,1;1,d,0;1,f,8;1,q,6;1,r,3;1,v,1;2,d,8;2,f,8;2,q,1;2,r,2;2,v,7;3,d,7;3,f,7;3,q,2;3,r,4;3,v,6;4,d,8;4,f,0;4,q,3;4,r,1;4,v,6;5,d,6;5,f,3;5,q,4;5,r,2;5,v,1;6,d,5;6,f,3;6,q,6;6,r,2;6,v,6;7,d,2;7,f,8;7,q,1;7,r,4;7,v,6;8,d,2;8,f,0;8,q,1;8,r,0;8,v,8#5#1;7");
		assertEquals("rdvdqqdvrf,7;ff,7;fdrffdq,1;dr,2", fallbackDfa.run("rdvdqqdvrffffdrffdqdr"));
	}

	@Test
	public void testFallbackDfa2String1() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9#a;i;t;w;y#0,a,1;0,i,0;0,t,9;0,w,9;0,y,7;1,a,3;1,i,5;1,t,4;1,w,5;1,y,2;2,a,1;2,i,0;2,t,8;2,w,5;2,y,1;3,a,8;3,i,7;3,t,1;3,w,3;3,y,9;4,a,0;4,i,7;4,t,3;4,w,6;4,y,0;5,a,8;5,i,7;5,t,8;5,w,1;5,y,4;6,a,9;6,i,3;6,t,5;6,w,9;6,y,5;7,a,7;7,i,7;7,t,0;7,w,8;7,y,4;8,a,8;8,i,6;8,t,9;8,w,8;8,y,0;9,a,1;9,i,9;9,t,9;9,w,7;9,y,5#0#2;6;7");
		assertEquals("ttttwywiiatiy,7;tw,7;y,7;tw,7;t,9", fallbackDfa.run("ttttwywiiatiytwytwt"));
	}

	@Test
	public void testFallbackDfa2String2() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9#a;i;t;w;y#0,a,1;0,i,0;0,t,9;0,w,9;0,y,7;1,a,3;1,i,5;1,t,4;1,w,5;1,y,2;2,a,1;2,i,0;2,t,8;2,w,5;2,y,1;3,a,8;3,i,7;3,t,1;3,w,3;3,y,9;4,a,0;4,i,7;4,t,3;4,w,6;4,y,0;5,a,8;5,i,7;5,t,8;5,w,1;5,y,4;6,a,9;6,i,3;6,t,5;6,w,9;6,y,5;7,a,7;7,i,7;7,t,0;7,w,8;7,y,4;8,a,8;8,i,6;8,t,9;8,w,8;8,y,0;9,a,1;9,i,9;9,t,9;9,w,7;9,y,5#0#2;6;7");
		assertEquals("yaiyaittaaiwai,6;iati,7;y,7;tw,7", fallbackDfa.run("yaiyaittaaiwaiiatiytw"));
	}

	@Test
	public void testFallbackDfa2String3() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9#a;i;t;w;y#0,a,1;0,i,0;0,t,9;0,w,9;0,y,7;1,a,3;1,i,5;1,t,4;1,w,5;1,y,2;2,a,1;2,i,0;2,t,8;2,w,5;2,y,1;3,a,8;3,i,7;3,t,1;3,w,3;3,y,9;4,a,0;4,i,7;4,t,3;4,w,6;4,y,0;5,a,8;5,i,7;5,t,8;5,w,1;5,y,4;6,a,9;6,i,3;6,t,5;6,w,9;6,y,5;7,a,7;7,i,7;7,t,0;7,w,8;7,y,4;8,a,8;8,i,6;8,t,9;8,w,8;8,y,0;9,a,1;9,i,9;9,t,9;9,w,7;9,y,5#0#2;6;7");
		assertEquals("iiww,7;yaaa,7;twa,7;wwa,7;y,7", fallbackDfa.run("iiwwyaaatwawway"));
	}

	@Test
	public void testFallbackDfa2String4() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9#a;i;t;w;y#0,a,1;0,i,0;0,t,9;0,w,9;0,y,7;1,a,3;1,i,5;1,t,4;1,w,5;1,y,2;2,a,1;2,i,0;2,t,8;2,w,5;2,y,1;3,a,8;3,i,7;3,t,1;3,w,3;3,y,9;4,a,0;4,i,7;4,t,3;4,w,6;4,y,0;5,a,8;5,i,7;5,t,8;5,w,1;5,y,4;6,a,9;6,i,3;6,t,5;6,w,9;6,y,5;7,a,7;7,i,7;7,t,0;7,w,8;7,y,4;8,a,8;8,i,6;8,t,9;8,w,8;8,y,0;9,a,1;9,i,9;9,t,9;9,w,7;9,y,5#0#2;6;7");
		assertEquals("attaiwywiyi,7;y,7;twaa,7;y,7", fallbackDfa.run("attaiwywiyiytwaay"));
	}

	@Test
	public void testFallbackDfa2String5() {
		FallbackDfa fallbackDfa= new FallbackDfa("0;1;2;3;4;5;6;7;8;9#a;i;t;w;y#0,a,1;0,i,0;0,t,9;0,w,9;0,y,7;1,a,3;1,i,5;1,t,4;1,w,5;1,y,2;2,a,1;2,i,0;2,t,8;2,w,5;2,y,1;3,a,8;3,i,7;3,t,1;3,w,3;3,y,9;4,a,0;4,i,7;4,t,3;4,w,6;4,y,0;5,a,8;5,i,7;5,t,8;5,w,1;5,y,4;6,a,9;6,i,3;6,t,5;6,w,9;6,y,5;7,a,7;7,i,7;7,t,0;7,w,8;7,y,4;8,a,8;8,i,6;8,t,9;8,w,8;8,y,0;9,a,1;9,i,9;9,t,9;9,w,7;9,y,5#0#2;6;7");
		assertEquals("waaiaiiayi,7;twai,7;y,7;yai,7", fallbackDfa.run("waaiaiiayitwaiyyai"));
	}

}