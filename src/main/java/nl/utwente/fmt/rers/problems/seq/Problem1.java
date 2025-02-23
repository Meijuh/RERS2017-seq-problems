package nl.utwente.fmt.rers.problems.seq;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import lombok.EqualsAndHashCode;
import lombok.ToString;
@ToString(exclude={"stdin", "inputs", "output", "cf"})
@EqualsAndHashCode(exclude={"stdin", "inputs", "output", "cf"}) public class Problem1 implements Problem {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	private String[] inputs = {"B","E","C","A","D"};

	private int a175 = 6;
	private boolean cf = true;
	private int a52 = 9;
	private int a176 = 7;
	private String a166 = "e";
	private String a167 = "e";
	private String a62 = "f";

	private void errorCheck() {

	}private  void calculateOutputm1(String input) {
    if(((((a166.equals("e")) && cf) && (input.equals("C"))) && (a176 == 6))) {
    	cf = false;
    	a166 = "f";
    	a52 = 11; 
    	output = "Y";
    } 
    if(((input.equals("E")) && (((a166.equals("e")) && cf) && (a176 == 6)))) {
    	cf = false;
    	a176 = 11; 
    	output = "X";
    } 
    if((((a166.equals("e")) && (cf && (a176 == 6))) && (input.equals("D")))) {
    	cf = false;
    	a166 = "g";
    	a167 = "g"; 
    	output = "W";
    } 
}
private  void calculateOutputm2(String input) {
    if(((input.equals("D")) && (((a166.equals("e")) && cf) && (a176 == 7)))) {
    	cf = false;
    	a176 = 11; 
    	output = "Y";
    } 
}
private  void calculateOutputm3(String input) {
    if((((input.equals("C")) && ((a176 == 8) && cf)) && (a166.equals("e")))) {
    	cf = false;
    	a166 = "h";
    	a175 = 6; 
    	output = "S";
    } 
}
private  void calculateOutputm4(String input) {
    if(((input.equals("B")) && ((a176 == 10) && ((a166.equals("e")) && cf)))) {
    	cf = false;
    	a166 = "i";
    	a62 = "h"; 
    	output = "Y";
    } 
}
private  void calculateOutputm5(String input) {
    if((((cf && (a166.equals("e"))) && (a176 == 11)) && (input.equals("C")))) {
    	cf = false;
    	a166 = "i";
    	a62 = "e"; 
    	output = "U";
    } 
}
private  void calculateOutputm6(String input) {
    if((((cf && (a176 == 12)) && (a166.equals("e"))) && (input.equals("C")))) {
    	cf = false;
    	a166 = "f";
    	a52 = 8; 
    	output = "S";
    } 
    if((((cf && (a176 == 12)) && (input.equals("E"))) && (a166.equals("e")))) {
    	cf = false;
    	a176 = 8; 
    	output = "Z";
    } 
}
private  void calculateOutputm7(String input) {
    if((((a166.equals("f")) && ((a52 == 5) && cf)) && (input.equals("E")))) {
    	cf = false;
    	a166 = "g";
    	a167 = "e"; 
    	output = "Z";
    } 
    if((((a166.equals("f")) && ((a52 == 5) && cf)) && (input.equals("B")))) {
    	cf = false;
    	a52 = 7; 
    	output = "Z";
    } 
}
private  void calculateOutputm8(String input) {
    if((((input.equals("E")) && (cf && (a166.equals("f")))) && (a52 == 7))) {
    	cf = false;
    	a166 = "e";
    	a176 = 11; 
    	output = "Y";
    } 
    if((((cf && (a52 == 7)) && (input.equals("D"))) && (a166.equals("f")))) {
    	cf = false;
    	a166 = "g";
    	a167 = "f"; 
    	output = "U";
    } 
}
private  void calculateOutputm9(String input) {
    if(((a166.equals("f")) && ((a52 == 8) && (cf && (input.equals("D")))))) {
    	cf = false;
    	 
    	output = "S";
    } 
    if((((a52 == 8) && ((a166.equals("f")) && cf)) && (input.equals("E")))) {
    	cf = false;
    	a166 = "e";
    	a176 = 6; 
    	output = "Z";
    } 
    if(((input.equals("B")) && ((cf && (a166.equals("f"))) && (a52 == 8)))) {
    	cf = false;
    	a166 = "g";
    	a167 = "g"; 
    	output = "W";
    } 
}
private  void calculateOutputm10(String input) {
    if((((a166.equals("f")) && ((a52 == 9) && cf)) && (input.equals("D")))) {
    	cf = false;
    	a166 = "e";
    	a176 = 6; 
    	output = "U";
    } 
}
private  void calculateOutputm11(String input) {
    if((((a166.equals("f")) && (cf && (a52 == 11))) && (input.equals("C")))) {
    	cf = false;
    	 
    	output = "Y";
    } 
}
private  void calculateOutputm12(String input) {
    if((((cf && (a166.equals("g"))) && (input.equals("B"))) && (a167.equals("e")))) {
    	cf = false;
    	a166 = "i";
    	a62 = "e"; 
    	output = "U";
    } 
    if(((a166.equals("g")) && ((input.equals("D")) && (cf && (a167.equals("e")))))) {
    	cf = false;
    	a166 = "e";
    	a176 = 10; 
    	output = "W";
    } 
    if(((input.equals("C")) && ((cf && (a167.equals("e"))) && (a166.equals("g"))))) {
    	cf = false;
    	a166 = "f";
    	a52 = 5; 
    	output = "U";
    } 
}
private  void calculateOutputm13(String input) {
    if((((cf && (input.equals("D"))) && (a166.equals("g"))) && (a167.equals("f")))) {
    	cf = false;
    	a166 = "f";
    	a52 = 7; 
    	output = "U";
    } 
    if((((cf && (a166.equals("g"))) && (input.equals("E"))) && (a167.equals("f")))) {
    	cf = false;
    	a166 = "f";
    	a52 = 8; 
    	output = "X";
    } 
    if(((a166.equals("g")) && ((input.equals("C")) && ((a167.equals("f")) && cf)))) {
    	cf = false;
    	a166 = "h";
    	a175 = 4; 
    	output = "W";
    } 
}
private  void calculateOutputm14(String input) {
    if(((a167.equals("g")) && (((a166.equals("g")) && cf) && (input.equals("E"))))) {
    	cf = false;
    	a166 = "i";
    	a62 = "e"; 
    	output = "U";
    } 
    if((((cf && (a166.equals("g"))) && (input.equals("C"))) && (a167.equals("g")))) {
    	cf = false;
    	a166 = "f";
    	a52 = 9; 
    	output = "X";
    } 
}
private  void calculateOutputm15(String input) {
    if(((((input.equals("D")) && cf) && (a167.equals("h"))) && (a166.equals("g")))) {
    	cf = false;
    	a166 = "i";
    	a62 = "f"; 
    	output = "X";
    } 
}
private  void calculateOutputm16(String input) {
    if((((a175 == 4) && ((a166.equals("h")) && cf)) && (input.equals("D")))) {
    	cf = false;
    	 
    	output = "S";
    } 
}
private  void calculateOutputm17(String input) {
    if(((a166.equals("h")) && ((a175 == 6) && (cf && (input.equals("E")))))) {
    	cf = false;
    	a166 = "e";
    	a176 = 11; 
    	output = "X";
    } 
    if(((a166.equals("h")) && ((cf && (input.equals("B"))) && (a175 == 6)))) {
    	cf = false;
    	a166 = "e";
    	a176 = 12; 
    	output = "W";
    } 
}
private  void calculateOutputm18(String input) {
    if(((a175 == 8) && ((cf && (a166.equals("h"))) && (input.equals("D"))))) {
    	cf = false;
    	a175 = 6; 
    	output = "Z";
    } 
}
private  void calculateOutputm19(String input) {
    if(((input.equals("E")) && (((a62.equals("e")) && cf) && (a166.equals("i"))))) {
    	cf = false;
    	a166 = "e";
    	a176 = 10; 
    	output = "W";
    } 
    if(((a166.equals("i")) && ((a62.equals("e")) && ((input.equals("B")) && cf)))) {
    	cf = false;
    	a166 = "g";
    	a167 = "f"; 
    	output = "S";
    } 
    if((((a62.equals("e")) && ((a166.equals("i")) && cf)) && (input.equals("D")))) {
    	cf = false;
    	a166 = "h";
    	a175 = 8; 
    	output = "W";
    } 
}
private  void calculateOutputm20(String input) {
    if(((a166.equals("i")) && ((a62.equals("f")) && (cf && (input.equals("C")))))) {
    	cf = false;
    	a166 = "f";
    	a52 = 8; 
    	output = "S";
    } 
    if(((a166.equals("i")) && ((cf && (a62.equals("f"))) && (input.equals("E"))))) {
    	cf = false;
    	a166 = "g";
    	a167 = "e"; 
    	output = "X";
    } 
}
private  void calculateOutputm21(String input) {
    if(((a62.equals("h")) && ((input.equals("C")) && (cf && (a166.equals("i")))))) {
    	cf = false;
    	a166 = "f";
    	a52 = 5; 
    	output = "U";
    } 
    if((((a62.equals("h")) && ((a166.equals("i")) && cf)) && (input.equals("D")))) {
    	cf = false;
    	a166 = "g";
    	a167 = "h"; 
    	output = "U";
    } 
}



@Override public void calculateOutput(String input) {
 	cf = true;
    if(((a166.equals("e")) && cf)) {
    	if(((a176 == 6) && cf)) {
    		calculateOutputm1(input);
    	} 
    	if((cf && (a176 == 7))) {
    		calculateOutputm2(input);
    	} 
    	if(((a176 == 8) && cf)) {
    		calculateOutputm3(input);
    	} 
    	if((cf && (a176 == 10))) {
    		calculateOutputm4(input);
    	} 
    	if(((a176 == 11) && cf)) {
    		calculateOutputm5(input);
    	} 
    	if(((a176 == 12) && cf)) {
    		calculateOutputm6(input);
    	} 
    } 
    if(((a166.equals("f")) && cf)) {
    	if(((a52 == 5) && cf)) {
    		calculateOutputm7(input);
    	} 
    	if((cf && (a52 == 7))) {
    		calculateOutputm8(input);
    	} 
    	if((cf && (a52 == 8))) {
    		calculateOutputm9(input);
    	} 
    	if((cf && (a52 == 9))) {
    		calculateOutputm10(input);
    	} 
    	if(((a52 == 11) && cf)) {
    		calculateOutputm11(input);
    	} 
    } 
    if((cf && (a166.equals("g")))) {
    	if(((a167.equals("e")) && cf)) {
    		calculateOutputm12(input);
    	} 
    	if(((a167.equals("f")) && cf)) {
    		calculateOutputm13(input);
    	} 
    	if((cf && (a167.equals("g")))) {
    		calculateOutputm14(input);
    	} 
    	if((cf && (a167.equals("h")))) {
    		calculateOutputm15(input);
    	} 
    } 
    if((cf && (a166.equals("h")))) {
    	if((cf && (a175 == 4))) {
    		calculateOutputm16(input);
    	} 
    	if((cf && (a175 == 6))) {
    		calculateOutputm17(input);
    	} 
    	if(((a175 == 8) && cf)) {
    		calculateOutputm18(input);
    	} 
    } 
    if((cf && (a166.equals("i")))) {
    	if(((a62.equals("e")) && cf)) {
    		calculateOutputm19(input);
    	} 
    	if((cf && (a62.equals("f")))) {
    		calculateOutputm20(input);
    	} 
    	if(((a62.equals("h")) && cf)) {
    		calculateOutputm21(input);
    	} 
    } 

    errorCheck();
    if(cf)
    	throw new IllegalArgumentException("Current state has no transition for this input!");
}


public static void main(String[] args) throws Exception {
	// init system and input reader
	Problem1 eca = new Problem1();

	// main i/o-loop
	while(true) {
		//read input
		String input = stdin.readLine();

		 if((input.equals("B")) && (input.equals("E")) && (input.equals("C")) && (input.equals("A")) && (input.equals("D")))
			throw new IllegalArgumentException("Current state has no transition for this input!");
		try {
			//operate eca engine output = 
			eca.calculateOutput(input);
		} catch(IllegalArgumentException e) {
			System.err.println("Invalid input: " + e.getMessage());
		}
	}
}


	
	private String output = null;
	
	@Override
	public String getOutput() {
	     final String res = output;
	     output = null;
	     return res;
	}
	
	@Override
	public String[] getInputs() {
	     return inputs;
	}
	
	@Override
	public void reset() {
  a175 = 6;
  cf = true;
  a52 = 9;
  a176 = 7;
  a166 = "e";
  a167 = "e";
  a62 = "f";
}}
