import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem21 {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	private String[] inputs = {"B","E","C","A","D"};

	public String a166 = "e";
	public int a175 = 6;
	public String a167 = "e";
	public String a62 = "f";
	public int a52 = 9;
	public int a176 = 7;
	public boolean cf = true;

private  void calculateOutputm1(String input) {
    if(((a166.equals("e")) && (((input.equals("B")) && cf) && (a176 == 6)))) {
    	cf = false;
    	 
    	System.out.println("S");
    } 
    if((((cf && (a166.equals("e"))) && (input.equals("C"))) && (a176 == 6))) {
    	cf = false;
    	a166 = "i";
    	a62 = "e"; 
    	System.out.println("U");
    } 
    if((((cf && (a166.equals("e"))) && (input.equals("D"))) && (a176 == 6))) {
    	cf = false;
    	a166 = "f";
    	a52 = 9; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm2(String input) {
    if(((a166.equals("e")) && ((cf && (input.equals("D"))) && (a176 == 7)))) {
    	cf = false;
    	a166 = "i";
    	a62 = "e"; 
    	System.out.println("U");
    } 
    if(((a176 == 7) && ((input.equals("C")) && ((a166.equals("e")) && cf)))) {
    	cf = false;
    	a176 = 11; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm3(String input) {
    if(((((input.equals("E")) && cf) && (a166.equals("e"))) && (a176 == 8))) {
    	cf = false;
    	a166 = "h";
    	a175 = 6; 
    	System.out.println("S");
    } 
    if(((a166.equals("e")) && ((cf && (input.equals("B"))) && (a176 == 8)))) {
    	cf = false;
    	a166 = "i";
    	a62 = "f"; 
    	System.out.println("S");
    } 
    if((((a176 == 8) && (cf && (input.equals("D")))) && (a166.equals("e")))) {
    	cf = false;
    	a166 = "i";
    	a62 = "e"; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm4(String input) {
    if(((input.equals("A")) && (((a166.equals("e")) && cf) && (a176 == 10)))) {
    	cf = false;
    	a176 = 12; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm5(String input) {
    if((((input.equals("B")) && (cf && (a176 == 11))) && (a166.equals("e")))) {
    	cf = false;
    	a176 = 10; 
    	System.out.println("W");
    } 
    if((((a166.equals("e")) && ((input.equals("A")) && cf)) && (a176 == 11))) {
    	cf = false;
    	a166 = "h";
    	a175 = 8; 
    	System.out.println("Y");
    } 
    if(((a176 == 11) && ((input.equals("E")) && ((a166.equals("e")) && cf)))) {
    	cf = false;
    	a166 = "g";
    	a167 = "f"; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm6(String input) {
    if((((a176 == 12) && ((input.equals("B")) && cf)) && (a166.equals("e")))) {
    	cf = false;
    	a166 = "i";
    	a62 = "f"; 
    	System.out.println("U");
    } 
    if(((a176 == 12) && ((a166.equals("e")) && ((input.equals("C")) && cf)))) {
    	cf = false;
    	a176 = 10; 
    	System.out.println("W");
    } 
    if(((a176 == 12) && (((a166.equals("e")) && cf) && (input.equals("D"))))) {
    	cf = false;
    	 
    	System.out.println("S");
    } 
}
private  void calculateOutputm7(String input) {
    if(((a52 == 5) && ((input.equals("C")) && ((a166.equals("f")) && cf)))) {
    	cf = false;
    	a166 = "i";
    	a62 = "f"; 
    	System.out.println("S");
    } 
}
private  void calculateOutputm8(String input) {
    if((((a52 == 7) && ((a166.equals("f")) && cf)) && (input.equals("E")))) {
    	cf = false;
    	a166 = "h";
    	a175 = 8; 
    	System.out.println("U");
    } 
    if(((input.equals("D")) && (((a166.equals("f")) && cf) && (a52 == 7)))) {
    	cf = false;
    	 
    	System.out.println("T");
    } 
}
private  void calculateOutputm9(String input) {
    if(((a166.equals("f")) && (((input.equals("D")) && cf) && (a52 == 8)))) {
    	cf = false;
    	a52 = 9; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm10(String input) {
    if(((a52 == 9) && (((input.equals("B")) && cf) && (a166.equals("f"))))) {
    	cf = false;
    	 
    	System.out.println("Y");
    } 
    if((((input.equals("C")) && ((a52 == 9) && cf)) && (a166.equals("f")))) {
    	cf = false;
    	 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm11(String input) {
    if((((cf && (a167.equals("e"))) && (input.equals("E"))) && (a166.equals("g")))) {
    	cf = false;
    	a166 = "i";
    	a62 = "h"; 
    	System.out.println("Y");
    } 
    if(((input.equals("A")) && ((a167.equals("e")) && ((a166.equals("g")) && cf)))) {
    	cf = false;
    	a166 = "i";
    	a62 = "e"; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm12(String input) {
    if((((cf && (input.equals("A"))) && (a167.equals("f"))) && (a166.equals("g")))) {
    	cf = false;
    	a166 = "f";
    	a52 = 5; 
    	System.out.println("S");
    } 
    if((((cf && (a167.equals("f"))) && (input.equals("D"))) && (a166.equals("g")))) {
    	cf = false;
    	a167 = "h"; 
    	System.out.println("W");
    } 
    if((((input.equals("E")) && (cf && (a167.equals("f")))) && (a166.equals("g")))) {
    	cf = false;
    	a167 = "g"; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm13(String input) {
    if(((a166.equals("g")) && (((input.equals("D")) && cf) && (a167.equals("g"))))) {
    	cf = false;
    	a166 = "e";
    	a176 = 11; 
    	System.out.println("U");
    } 
    if((((a167.equals("g")) && (cf && (input.equals("A")))) && (a166.equals("g")))) {
    	cf = false;
    	a166 = "f";
    	a52 = 9; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm14(String input) {
    if(((((a167.equals("h")) && cf) && (a166.equals("g"))) && (input.equals("C")))) {
    	cf = false;
    	a166 = "i";
    	a62 = "f"; 
    	System.out.println("T");
    } 
    if(((a166.equals("g")) && ((input.equals("E")) && ((a167.equals("h")) && cf)))) {
    	cf = false;
    	a167 = "f"; 
    	System.out.println("Y");
    } 
    if(((input.equals("B")) && ((a166.equals("g")) && (cf && (a167.equals("h")))))) {
    	cf = false;
    	a166 = "i";
    	a62 = "f"; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm15(String input) {
    if(((a175 == 4) && (((a166.equals("h")) && cf) && (input.equals("B"))))) {
    	cf = false;
    	a175 = 8; 
    	System.out.println("U");
    } 
    if(((((input.equals("A")) && cf) && (a166.equals("h"))) && (a175 == 4))) {
    	cf = false;
    	a166 = "e";
    	a176 = 11; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm16(String input) {
    if(((input.equals("A")) && (((a166.equals("h")) && cf) && (a175 == 6)))) {
    	cf = false;
    	a166 = "e";
    	a176 = 6; 
    	System.out.println("Y");
    } 
    if((((cf && (a175 == 6)) && (input.equals("B"))) && (a166.equals("h")))) {
    	cf = false;
    	a166 = "e";
    	a176 = 8; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm17(String input) {
    if(((a166.equals("h")) && (((input.equals("E")) && cf) && (a175 == 8)))) {
    	cf = false;
    	a166 = "f";
    	a52 = 7; 
    	System.out.println("Z");
    } 
    if(((a166.equals("h")) && ((cf && (input.equals("C"))) && (a175 == 8)))) {
    	cf = false;
    	a175 = 4; 
    	System.out.println("S");
    } 
}
private  void calculateOutputm18(String input) {
    if((((a166.equals("i")) && (cf && (a62.equals("e")))) && (input.equals("C")))) {
    	cf = false;
    	a166 = "h";
    	a175 = 6; 
    	System.out.println("T");
    } 
    if((((a62.equals("e")) && (cf && (input.equals("D")))) && (a166.equals("i")))) {
    	cf = false;
    	a166 = "f";
    	a52 = 8; 
    	System.out.println("S");
    } 
    if(((a166.equals("i")) && ((cf && (input.equals("A"))) && (a62.equals("e"))))) {
    	cf = false;
    	a62 = "h"; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm19(String input) {
    if((((a166.equals("i")) && ((a62.equals("f")) && cf)) && (input.equals("C")))) {
    	cf = false;
    	a62 = "e"; 
    	System.out.println("U");
    } 
    if(((((a166.equals("i")) && cf) && (a62.equals("f"))) && (input.equals("A")))) {
    	cf = false;
    	 
    	System.out.println("Y");
    } 
    if(((input.equals("E")) && ((a62.equals("f")) && ((a166.equals("i")) && cf)))) {
    	cf = false;
    	 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm20(String input) {
    if((((input.equals("C")) && ((a166.equals("i")) && cf)) && (a62.equals("h")))) {
    	cf = false;
    	a62 = "f"; 
    	System.out.println("Y");
    } 
    if((((input.equals("A")) && (cf && (a166.equals("i")))) && (a62.equals("h")))) {
    	cf = false;
    	a166 = "g";
    	a167 = "e"; 
    	System.out.println("W");
    } 
}



public  void calculateOutput(String input) {
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
    } 
    if(((a166.equals("g")) && cf)) {
    	if((cf && (a167.equals("e")))) {
    		calculateOutputm11(input);
    	} 
    	if(((a167.equals("f")) && cf)) {
    		calculateOutputm12(input);
    	} 
    	if(((a167.equals("g")) && cf)) {
    		calculateOutputm13(input);
    	} 
    	if((cf && (a167.equals("h")))) {
    		calculateOutputm14(input);
    	} 
    } 
    if((cf && (a166.equals("h")))) {
    	if((cf && (a175 == 4))) {
    		calculateOutputm15(input);
    	} 
    	if((cf && (a175 == 6))) {
    		calculateOutputm16(input);
    	} 
    	if((cf && (a175 == 8))) {
    		calculateOutputm17(input);
    	} 
    } 
    if(((a166.equals("i")) && cf)) {
    	if((cf && (a62.equals("e")))) {
    		calculateOutputm18(input);
    	} 
    	if(((a62.equals("f")) && cf)) {
    		calculateOutputm19(input);
    	} 
    	if((cf && (a62.equals("h")))) {
    		calculateOutputm20(input);
    	} 
    } 


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
}
