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
		
	}

	
	public String run(String input) {

		String[] inputStrip = input.split("");
		String finalOutputaya = "";
		String rejectString = "";
		String currState = ""; 
		String initState = ""; 
		
		
		int L = 0;
		int R = 0;
		String stateImAt = null;
		
		
		
		for (int i = 0; i < dfaSetOfStates.length; i++) {
			
			if (dfaSetOfStates[i].equals(dfaInitialState)) {
				dfaStack.push(dfaSetOfStates[i]);
				stateImAt = dfaSetOfStates[i];
				break;
			}
		}
		
		
		for (int i = 0; i < inputStrip.length; i++) {
			L = i;
		
			for (int j = 0; j < dfaTransitionStates.length; j++) {
				String[] splitTstate = dfaTransitionStates[j].split(",");
			
				if (stateImAt.equals(splitTstate[0]) && inputStrip[i].equals(splitTstate[1])) {
					dfaStack.push(splitTstate[2]);
					stateImAt = splitTstate[2];
					break;
				}
			}
		}
		
		
	
		initState = dfaStack.peek();
		while (! (dfaStack.isEmpty())) {
		    currState = dfaStack.pop();
			String newStrip = "";
				
				if (dfaSetOfAcceptStates.contains(currState)) {
					for (int j = 0; j <= L; j++) {
						newStrip = newStrip + inputStrip[j];
					}

					finalOutputaya = finalOutputaya + newStrip + "," + currState;
					L +=1;
					R = L;
					break;
					}
				
				
				else {
					L -= 1;
				}
			}
		
		
		if (dfaStack.isEmpty()) {
			rejectString = input + "," + initState;
			if(output.equals("")) {
				output = rejectString;
			}
			
			else {
				output = output + ";" + rejectString;
			}
			
		}
			
			String restOfStrip = "";
			if ((L !=0) && (L > 0)) {
				
				
				
				while(!(dfaStack.isEmpty())) {
					dfaStack.pop();
			}
				
				
				
				for (int k = L; k < inputStrip.length; k++) {
					restOfStrip = restOfStrip + inputStrip[k];
				}
				
			}	
		
		
		if (! (finalOutputaya.equals(""))) {
			if (output.equals("")) {
				output = finalOutputaya;
			}
			
			else {
				output = output + ";" + finalOutputaya;
			}
			
		}
		
		
		if (! (restOfStrip.equals(""))) {
			run(restOfStrip);
		}
	
		return output;
	}
	
}
