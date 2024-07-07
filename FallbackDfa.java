package csen1002.main.task3;

import java.util.ArrayList;
import java.util.Stack;



/**
 * Write your info here
 * 
 * @name Maram Hossam
 * @id 49-1891
 * @labNumber 18
 */

public class FallbackDfa {

	
	private String[] dfaSetOfStates;
	private String alphabetString;
	private String[] dfaTransitionStates;
	private String dfaInitialState;
	private ArrayList<String> dfaSetOfAcceptStates = new ArrayList<String>();
	private Stack<String> dfaStack = new Stack<>();
	private String output = "";

	/**
	 * Constructs a Fallback DFA
	 * 
	 * @param fdfa A formatted string representation of the Fallback DFA. The string
	 *             representation follows the one in the task description
	 */
	public FallbackDfa(String fdfa) {
		String[] dfaString = fdfa.split("#");
		this.dfaSetOfStates = dfaString[0].split(";");
		
		this.alphabetString = dfaString[1];
		
		this.dfaTransitionStates = dfaString[2].split(";");
		
		this.dfaInitialState = dfaString[3];
		
		String [] AcceptStates = dfaString[4].split(";");
		
		for (int i = 0; i < AcceptStates.length; i++) {
			dfaSetOfAcceptStates.add(AcceptStates[i]);
		}
		
		//run("oroookoooshkkhsrkkrro");
		//System.out.println(output);
		
		//returnString();
		
		
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param input The string to simulate by the FDFA.
	 * 
	 * @return Returns a formatted string representation of the list of tokens. The
	 *         string representation follows the one in the task description
	 */
	public String run(String input) {
		// TODO Auto-generated method stub
		String[] inputStrip = input.split("");
		String finalOutputaya = "";
		String rejectString = "";
		String currState = ""; //akher pop
		String initState = ""; //first to pop
		
		
		int L = 0;
		int R = 0;
		String stateImAt = null;
		
		
		
		for (int i = 0; i < dfaSetOfStates.length; i++) {
			//L = i;
			if (dfaSetOfStates[i].equals(dfaInitialState)) {
				dfaStack.push(dfaSetOfStates[i]);
				stateImAt = dfaSetOfStates[i];
				break;
			}
		}
		
		
		for (int i = 0; i < inputStrip.length; i++) {
			L = i;
			  //System.out.println("EL LAYA: " + L);
			 // System.out.println("INPUT STRIP: " + inputStrip[i]);
			 // System.out.println("MY STATE: " + stateImAt);
			
			for (int j = 0; j < dfaTransitionStates.length; j++) {
				String[] splitTstate = dfaTransitionStates[j].split(",");
			
				if (stateImAt.equals(splitTstate[0]) && inputStrip[i].equals(splitTstate[1])) {
					//System.out.println("MY CURR TRANSITION: " + dfaTransitionStates[j]);
					//System.out.println("stateImAt BEFORE: " + stateImAt);
					dfaStack.push(splitTstate[2]);
					stateImAt = splitTstate[2];
					//System.out.println("stateImAt AFTER: " + stateImAt);
					break;
				}
			}
		}
		
		
		
//		for (int i = 0; i < dfaStack.size(); i++) {
//			System.out.println("STACK CONTENT: " + dfaStack.get(i));
//		}
//		
//		System.out.println("L: " + L);
		
	
		initState = dfaStack.peek();
		while (! (dfaStack.isEmpty())) {
		    currState = dfaStack.pop();
			String newStrip = "";
				
				if (dfaSetOfAcceptStates.contains(currState)) {
				//	System.out.println("currState: " +  currState);
					for (int j = 0; j <= L; j++) {
						newStrip = newStrip + inputStrip[j];
					}

					finalOutputaya = finalOutputaya + newStrip + "," + currState;
				//	System.out.println("finalOutputaya: " + finalOutputaya);

					
					L +=1;
					R = L;
					//acceptStatesFound++;
					break;
					}
				
				
				else {
					L -= 1;
				}
			}
		
		
		if (dfaStack.isEmpty()) {
		//	System.out.println("im empty and rejected");
		//	System.out.println("rejectString: " + rejectString);
			rejectString = input + "," + initState;
			if(output.equals("")) {
				output = rejectString;
			}
			
			else {
				output = output + ";" + rejectString;
			}
			
			//return output;
		}

		
	//	System.out.println("L again: " + L);
			
			String restOfStrip = "";
			if ((L !=0) && (L > 0)) {
				
				
				
				while(!(dfaStack.isEmpty())) {
					dfaStack.pop();
			}
				
				
				
				for (int k = L; k < inputStrip.length; k++) {
					restOfStrip = restOfStrip + inputStrip[k];
				//	System.out.println("restOfStrip: " + restOfStrip);
				}
				
				//System.out.println("finalOutputaya: " + finalOutputaya);
			}	
		
	//	System.out.println("ana output: " + output);
		
		if (! (finalOutputaya.equals(""))) {
			if (output.equals("")) {
				output = finalOutputaya;
			//	System.out.println("ana output tani: " + output);
			}
			
			else {
				output = output + ";" + finalOutputaya;
			//	System.out.println("ana output tani(2): " + output);
			}
			
		}
		
		
		if (! (restOfStrip.equals(""))) {
	//		System.out.println("restOfStrip: " + restOfStrip);
//			output = output + finalOutputaya;
			run(restOfStrip);
		}
		

//		output = output + finalOutputaya;
		return output;
	}
	
	
	
	//public String returnString(String inputStrip) {
//		int L = 0;
//		int R = 0;
//		for (int i = 0; i < dfaSetOfStates.length; i++) {
//			L = i;
//			if (dfaSetOfStates[L].equals(dfaInitialState)) {
//				dfaStack.push(dfaSetOfStates[L]);
//			}
//			
//			
//			
//		}
		
	//	return null;
//	}
	
	
	public static void main(String[] args) { 
		
	//	String fdfa = "0;1;2;3;4;5;6;7;8;9;10;11#h;k;o;r;s#0,h,5;0,k,2;0,o,11;0,r,5;0,s,5;1,h,4;1,k,10;1,o,7;1,r,11;1,s,9;2,h,10;2,k,3;2,o,6;2,r,2;2,s,3;3,h,8;3,k,11;3,o,3;3,r,11;3,s,10;4,h,10;4,k,9;4,o,3;4,r,8;4,s,5;5,h,3;5,k,3;5,o,9;5,r,6;5,s,7;6,h,4;6,k,9;6,o,7;6,r,0;6,s,11;7,h,3;7,k,5;7,o,7;7,r,1;7,s,1;8,h,10;8,k,0;8,o,2;8,r,9;8,s,1;9,h,0;9,k,8;9,o,4;9,r,11;9,s,10;10,h,10;10,k,11;10,o,5;10,r,0;10,s,7;11,h,3;11,k,6;11,o,5;11,r,10;11,s,2#2#3;4;7";
	//	FallbackDfa newfdfa = new FallbackDfa(fdfa);
	//	System.out.println(newfdfa.output);
		
		
//		for (int i = 0; i < newfdfa.dfaSetOfStates.length; i++) {
//			System.out.println(newfdfa.dfaSetOfStates[i]);
//		}
		
		
//		System.out.println(newfdfa.alphabetString);
//		
//		for (int i = 0; i < newfdfa.dfaTransitionStates.length; i++) {
//			System.out.println(newfdfa.dfaTransitionStates[i]);
//		}
//		
//		
//		System.out.println(newfdfa.dfaInitialState);
		
//		for (int i = 0; i < newfdfa.dfaStack.size(); i++) {
//		System.out.println(newfdfa.dfaStack.get(i));
//	}
					}
	
	
	
	
	
}
