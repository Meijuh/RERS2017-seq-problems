import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Problem24 {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	private String[] inputs = {"B","E","C","A","D"};

	public String a118 = "g";
	public String a94 = "i";
	public int a142 = 11;
	public String a48 = "g";
	public int a133 = 7;
	public String a19 = "e";
	public int a145 = 5;
	public String a1 = "g";
	public int a175 = 10;
	public int a72 = 13;
	public String a76 = "g";
	public int a119 = 6;
	public String a46 = "h";
	public String a45 = "e";
	public int a177 = 13;
	public int a92 = 6;
	public String a144 = "h";
	public String a171 = "g";
	public int a128 = 2;
	public int a29 = 13;
	public int a83 = 10;
	public String a102 = "h";
	public String a0 = "h";
	public String a180 = "i";
	public String a125 = "h";
	public boolean cf = true;
	public int a163 = 3;
	public int a60 = 6;
	public String a17 = "i";
	public int a129 = 11;
	public String a176 = "f";
	public int a173 = 12;
	public int a54 = 8;
	public int a10 = 10;
	public String a195 = "f";
	public int a70 = 16;
	public String a12 = "e";
	public int a146 = 10;
	public String a132 = "i";
	public int a15 = 13;
	public int a28 = 9;
	public String a34 = "e";
	public int a109 = 8;
	public int a84 = 5;
	public int a168 = 3;
	public String a89 = "e";
	public int a42 = 14;
	public int a181 = 8;
	public int a169 = 11;

	private void errorCheck() {
	    if((((a42 == 10) && (a163 == 3)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(0);
	    }
	    if((((a125.equals("e")) && (a12.equals("e"))) && (a60 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(1);
	    }
	    if((((a83 == 14) && (a70 == 15)) && (a60 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(2);
	    }
	    if((((a169 == 14) && (a12.equals("f"))) && (a60 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(3);
	    }
	    if((((a133 == 10) && (a168 == 5)) && (a60 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(4);
	    }
	    if((((a72 == 9) && (a168 == 8)) && (a60 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(5);
	    }
	    if((((a128 == 8) && (a125.equals("h"))) && (a60 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(6);
	    }
	    if((((a118.equals("f")) && (a10 == 12)) && (a60 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(7);
	    }
	    if((((a54 == 6) && (a72 == 11)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(8);
	    }
	    if((((a173 == 11) && (a132.equals("i"))) && (a60 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(9);
	    }
	    if((((a72 == 14) && (a168 == 8)) && (a60 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(10);
	    }
	    if((((a72 == 12) && (a132.equals("e"))) && (a60 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(11);
	    }
	    if((((a128 == 4) && (a125.equals("h"))) && (a60 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(12);
	    }
	    if((((a118.equals("f")) && (a163 == 4)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(13);
	    }
	    if((((a34.equals("f")) && (a72 == 10)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(14);
	    }
	    if((((a176.equals("g")) && (a10 == 16)) && (a60 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(15);
	    }
	    if((((a29 == 12) && (a125.equals("g"))) && (a60 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(16);
	    }
	    if((((a195.equals("h")) && (a70 == 16)) && (a60 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(17);
	    }
	    if((((a133 == 13) && (a168 == 5)) && (a60 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(18);
	    }
	    if((((a89.equals("f")) && (a132.equals("g"))) && (a60 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(19);
	    }
	    if((((a94.equals("i")) && (a70 == 12)) && (a60 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(20);
	    }
	    if((((a89.equals("i")) && (a72 == 14)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(21);
	    }
	    if((((a42 == 8) && (a70 == 9)) && (a60 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(22);
	    }
	    if((((a89.equals("h")) && (a72 == 14)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(23);
	    }
	    if((((a94.equals("i")) && (a163 == 6)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(24);
	    }
	    if((((a102.equals("f")) && (a132.equals("h"))) && (a60 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(25);
	    }
	    if((((a173 == 7) && (a70 == 14)) && (a60 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(26);
	    }
	    if((((a89.equals("e")) && (a72 == 14)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(27);
	    }
	    if((((a142 == 10) && (a10 == 9)) && (a60 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(28);
	    }
	    if((((a145 == 7) && (a72 == 13)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(29);
	    }
	    if((((a94.equals("e")) && (a163 == 6)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(30);
	    }
	    if((((a84 == 10) && (a72 == 9)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(31);
	    }
	    if((((a94.equals("g")) && (a70 == 12)) && (a60 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(32);
	    }
	    if((((a102.equals("h")) && (a132.equals("h"))) && (a60 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(33);
	    }
	    if((((a175 == 3) && (a10 == 11)) && (a60 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(34);
	    }
	    if((((a144.equals("h")) && (a163 == 7)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(35);
	    }
	    if((((a142 == 7) && (a10 == 9)) && (a60 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(36);
	    }
	    if((((a72 == 8) && (a132.equals("e"))) && (a60 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(37);
	    }
	    if((((a119 == 5) && (a163 == 2)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(38);
	    }
	    if((((a146 == 9) && (a10 == 13)) && (a60 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(39);
	    }
	    if((((a119 == 11) && (a163 == 2)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(40);
	    }
	    if((((a83 == 10) && (a70 == 15)) && (a60 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(41);
	    }
	    if((((a109 == 3) && (a163 == 1)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(42);
	    }
	    if((((a29 == 8) && (a125.equals("g"))) && (a60 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(43);
	    }
	    if((((a42 == 12) && (a70 == 9)) && (a60 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(44);
	    }
	    if((((a89.equals("g")) && (a168 == 3)) && (a60 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(45);
	    }
	    if((((a142 == 11) && (a10 == 9)) && (a60 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(46);
	    }
	    if((((a169 == 9) && (a12.equals("h"))) && (a60 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(47);
	    }
	    if((((a173 == 8) && (a132.equals("i"))) && (a60 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(48);
	    }
	    if((((a45.equals("g")) && (a125.equals("f"))) && (a60 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(49);
	    }
	    if((((a54 == 2) && (a72 == 11)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(50);
	    }
	    if((((a145 == 4) && (a12.equals("g"))) && (a60 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(51);
	    }
	    if((((a94.equals("h")) && (a163 == 6)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(52);
	    }
	    if((((a177 == 15) && (a72 == 12)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(53);
	    }
	    if((((a128 == 2) && (a125.equals("h"))) && (a60 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(54);
	    }
	    if((((a181 == 7) && (a10 == 15)) && (a60 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(55);
	    }
	    if((((a84 == 3) && (a72 == 9)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(56);
	    }
	    if((((a15 == 12) && (a12.equals("i"))) && (a60 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(57);
	    }
	    if((((a133 == 9) && (a168 == 5)) && (a60 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(58);
	    }
	    if((((a125.equals("i")) && (a12.equals("e"))) && (a60 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(59);
	    }
	    if((((a175 == 3) && (a70 == 11)) && (a60 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(60);
	    }
	    if((((a119 == 9) && (a163 == 2)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(61);
	    }
	    if((((a15 == 10) && (a168 == 7)) && (a60 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(62);
	    }
	    if((((a1.equals("e")) && (a70 == 13)) && (a60 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(63);
	    }
	    if((((a129 == 14) && (a168 == 4)) && (a60 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(64);
	    }
	    if((((a34.equals("g")) && (a72 == 10)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(65);
	    }
	    if((((a94.equals("f")) && (a70 == 12)) && (a60 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(66);
	    }
	    if((((a29 == 10) && (a125.equals("g"))) && (a60 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(67);
	    }
	    if((((a109 == 8) && (a163 == 1)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(68);
	    }
	    if((((a15 == 11) && (a12.equals("i"))) && (a60 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(69);
	    }
	    if((((a146 == 10) && (a10 == 13)) && (a60 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(70);
	    }
	    if((((a0.equals("f")) && (a163 == 8)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(71);
	    }
	    if((((a0.equals("h")) && (a163 == 8)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(72);
	    }
	    if((((a83 == 17) && (a70 == 15)) && (a60 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(73);
	    }
	    if((((a72 == 9) && (a132.equals("e"))) && (a60 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(74);
	    }
	    if((((a28 == 9) && (a125.equals("i"))) && (a60 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(75);
	    }
	    if((((a54 == 5) && (a72 == 11)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(76);
	    }
	    if((((a54 == 4) && (a72 == 11)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(77);
	    }
	    if((((a72 == 10) && (a168 == 8)) && (a60 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(78);
	    }
	    if((((a15 == 14) && (a12.equals("i"))) && (a60 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(79);
	    }
	    if((((a173 == 12) && (a132.equals("f"))) && (a60 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(80);
	    }
	    if((((a15 == 13) && (a168 == 7)) && (a60 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(81);
	    }
	    if((((a17.equals("i")) && (a70 == 10)) && (a60 == 6))){
	    	cf = false;
	    	Errors.__VERIFIER_error(82);
	    }
	    if((((a145 == 6) && (a72 == 13)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(83);
	    }
	    if((((a72 == 13) && (a132.equals("e"))) && (a60 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(84);
	    }
	    if((((a169 == 9) && (a12.equals("f"))) && (a60 == 7))){
	    	cf = false;
	    	Errors.__VERIFIER_error(85);
	    }
	    if((((a15 == 14) && (a168 == 7)) && (a60 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(86);
	    }
	    if((((a84 == 5) && (a72 == 9)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(87);
	    }
	    if((((a171.equals("e")) && (a125.equals("e"))) && (a60 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(88);
	    }
	    if((((a109 == 4) && (a163 == 1)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(89);
	    }
	    if((((a118.equals("i")) && (a10 == 12)) && (a60 == 10))){
	    	cf = false;
	    	Errors.__VERIFIER_error(90);
	    }
	    if((((a109 == 9) && (a163 == 1)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(91);
	    }
	    if((((a171.equals("f")) && (a125.equals("e"))) && (a60 == 5))){
	    	cf = false;
	    	Errors.__VERIFIER_error(92);
	    }
	    if((((a133 == 11) && (a168 == 5)) && (a60 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(93);
	    }
	    if((((a109 == 5) && (a163 == 1)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(94);
	    }
	    if((((a89.equals("e")) && (a132.equals("g"))) && (a60 == 9))){
	    	cf = false;
	    	Errors.__VERIFIER_error(95);
	    }
	    if((((a145 == 3) && (a72 == 13)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(96);
	    }
	    if((((a133 == 8) && (a168 == 5)) && (a60 == 8))){
	    	cf = false;
	    	Errors.__VERIFIER_error(97);
	    }
	    if((((a84 == 8) && (a72 == 9)) && (a60 == 11))){
	    	cf = false;
	    	Errors.__VERIFIER_error(98);
	    }
	    if((((a42 == 8) && (a163 == 3)) && (a60 == 4))){
	    	cf = false;
	    	Errors.__VERIFIER_error(99);
	    }
	}private  void calculateOutputm59(String input) {
    if(((((a163 == 1) && (cf && (input.equals("A")))) && (a109 == 6)) && (a60 == 4))) {
    	cf = false;
    	a19 = "i";
    	a163 = 5; 
    	System.out.println("V");
    } 
    if((((input.equals("D")) && ((a163 == 1) && (cf && (a109 == 6)))) && (a60 == 4))) {
    	cf = false;
    	a60 = 10;
    	a118 = "i";
    	a10 = 12; 
    	System.out.println("U");
    } 
    if(((((a109 == 6) && (cf && (a60 == 4))) && (a163 == 1)) && (input.equals("C")))) {
    	cf = false;
    	a72 = 8;
    	a60 = 11;
    	a92 = 13; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm60(String input) {
    if(((a163 == 1) && ((input.equals("E")) && ((a109 == 7) && (cf && (a60 == 4)))))) {
    	cf = false;
    	a125 = "e";
    	a171 = "e";
    	a60 = 5; 
    	System.out.println("W");
    } 
    if((((((a60 == 4) && cf) && (a109 == 7)) && (input.equals("A"))) && (a163 == 1))) {
    	cf = false;
    	a19 = "i";
    	a163 = 5; 
    	System.out.println("V");
    } 
    if((((a109 == 7) && ((a60 == 4) && ((a163 == 1) && cf))) && (input.equals("C")))) {
    	cf = false;
    	a60 = 11;
    	a72 = 8;
    	a92 = 13; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm1(String input) {
    if((cf && (a109 == 6))) {
    	calculateOutputm59(input);
    } 
    if(((a109 == 7) && cf)) {
    	calculateOutputm60(input);
    } 
}
private  void calculateOutputm63(String input) {
    if(((input.equals("B")) && (((a60 == 4) && (cf && (a119 == 4))) && (a163 == 2)))) {
    	cf = false;
    	a168 = 4;
    	a60 = 8;
    	a129 = 8; 
    	System.out.println("T");
    } 
    if((((a119 == 4) && ((input.equals("E")) && (cf && (a60 == 4)))) && (a163 == 2))) {
    	cf = false;
    	a60 = 7;
    	a12 = "f";
    	a169 = 13; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm2(String input) {
    if(((a119 == 4) && cf)) {
    	calculateOutputm63(input);
    } 
}
private  void calculateOutputm69(String input) {
    if(((((a42 == 15) && (cf && (input.equals("B")))) && (a163 == 3)) && (a60 == 4))) {
    	cf = false;
    	a132 = "i";
    	a60 = 9;
    	a173 = 10; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm3(String input) {
    if(((a42 == 15) && cf)) {
    	calculateOutputm69(input);
    } 
}
private  void calculateOutputm70(String input) {
    if((((a60 == 4) && ((cf && (input.equals("D"))) && (a118.equals("e")))) && (a163 == 4))) {
    	cf = false;
    	a102 = "h";
    	a132 = "h";
    	a60 = 9; 
    	System.out.println("Z");
    } 
    if(((a118.equals("e")) && ((((input.equals("C")) && cf) && (a60 == 4)) && (a163 == 4)))) {
    	cf = false;
    	a163 = 1;
    	a109 = 7; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm4(String input) {
    if(((a118.equals("e")) && cf)) {
    	calculateOutputm70(input);
    } 
}
private  void calculateOutputm72(String input) {
    if(((a19.equals("g")) && (((a60 == 4) && ((input.equals("A")) && cf)) && (a163 == 5)))) {
    	cf = false;
    	a60 = 11;
    	a72 = 11;
    	a54 = 3; 
    	System.out.println("W");
    } 
    if((((a19.equals("g")) && ((input.equals("E")) && (cf && (a60 == 4)))) && (a163 == 5))) {
    	cf = false;
    	a60 = 11;
    	a72 = 12;
    	a177 = 14; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm73(String input) {
    if(((a60 == 4) && (((a163 == 5) && ((a19.equals("i")) && cf)) && (input.equals("E"))))) {
    	cf = false;
    	a60 = 11;
    	a72 = 11;
    	a54 = 9; 
    	System.out.println("Z");
    } 
    if(((a60 == 4) && ((((a19.equals("i")) && cf) && (a163 == 5)) && (input.equals("C"))))) {
    	cf = false;
    	a60 = 8;
    	a171 = "i";
    	a168 = 1; 
    	System.out.println("Y");
    } 
    if(((input.equals("A")) && (((a19.equals("i")) && ((a163 == 5) && cf)) && (a60 == 4)))) {
    	cf = false;
    	a76 = "e";
    	a60 = 11;
    	a72 = 7; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm5(String input) {
    if(((a19.equals("g")) && cf)) {
    	calculateOutputm72(input);
    } 
    if((cf && (a19.equals("i")))) {
    	calculateOutputm73(input);
    } 
}
private  void calculateOutputm82(String input) {
    if(((a60 == 5) && (((a171.equals("g")) && (cf && (a125.equals("e")))) && (input.equals("B"))))) {
    	cf = false;
    	a60 = 11;
    	a72 = 11;
    	a54 = 9; 
    	System.out.println("W");
    } 
    if(((a125.equals("e")) && (((a60 == 5) && (cf && (input.equals("A")))) && (a171.equals("g"))))) {
    	cf = false;
    	a48 = "f";
    	a60 = 10;
    	a10 = 14; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm9(String input) {
    if((cf && (a171.equals("g")))) {
    	calculateOutputm82(input);
    } 
}
private  void calculateOutputm83(String input) {
    if((((a60 == 5) && (((a125.equals("f")) && cf) && (a45.equals("e")))) && (input.equals("A")))) {
    	cf = false;
    	a60 = 7;
    	a12 = "i";
    	a15 = 13; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm85(String input) {
    if(((((cf && (a125.equals("f"))) && (a45.equals("i"))) && (input.equals("E"))) && (a60 == 5))) {
    	cf = false;
    	a168 = 8;
    	a60 = 8;
    	a72 = 8; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm10(String input) {
    if(((a45.equals("e")) && cf)) {
    	calculateOutputm83(input);
    } 
    if((cf && (a45.equals("i")))) {
    	calculateOutputm85(input);
    } 
}
private  void calculateOutputm89(String input) {
    if(((input.equals("C")) && ((((a125.equals("g")) && cf) && (a29 == 13)) && (a60 == 5)))) {
    	cf = false;
    	a60 = 9;
    	a132 = "e";
    	a72 = 9; 
    	System.out.println("Z");
    } 
    if(((input.equals("A")) && ((a60 == 5) && ((cf && (a29 == 13)) && (a125.equals("g")))))) {
    	cf = false;
    	a60 = 8;
    	a171 = "e";
    	a168 = 1; 
    	System.out.println("V");
    } 
    if(((a29 == 13) && ((input.equals("B")) && ((a60 == 5) && ((a125.equals("g")) && cf))))) {
    	cf = false;
    	a60 = 6;
    	a1 = "h";
    	a70 = 13; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm11(String input) {
    if((cf && (a29 == 13))) {
    	calculateOutputm89(input);
    } 
}
private  void calculateOutputm93(String input) {
    if(((a128 == 9) && (((cf && (a60 == 5)) && (input.equals("A"))) && (a125.equals("h"))))) {
    	cf = false;
    	a72 = 11;
    	a60 = 11;
    	a54 = 3; 
    	System.out.println("W");
    } 
    if(((a60 == 5) && ((a128 == 9) && ((input.equals("E")) && ((a125.equals("h")) && cf))))) {
    	cf = false;
    	a60 = 8;
    	a171 = "i";
    	a168 = 1; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm12(String input) {
    if((cf && (a128 == 9))) {
    	calculateOutputm93(input);
    } 
}
private  void calculateOutputm97(String input) {
    if(((input.equals("B")) && (((a42 == 13) && ((a60 == 6) && cf)) && (a70 == 9)))) {
    	cf = false;
    	a72 = 11;
    	a60 = 11;
    	a54 = 9; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm14(String input) {
    if(((a42 == 13) && cf)) {
    	calculateOutputm97(input);
    } 
}
private  void calculateOutputm100(String input) {
    if(((a60 == 6) && (((a70 == 11) && (cf && (input.equals("B")))) && (a175 == 4)))) {
    	cf = false;
    	a125 = "h";
    	a60 = 5;
    	a128 = 9; 
    	System.out.println("U");
    } 
    if(((input.equals("A")) && ((a70 == 11) && ((a175 == 4) && ((a60 == 6) && cf))))) {
    	cf = false;
    	a168 = 5;
    	a60 = 8;
    	a133 = 7; 
    	System.out.println("V");
    } 
    if(((a70 == 11) && (((cf && (a60 == 6)) && (a175 == 4)) && (input.equals("C"))))) {
    	cf = false;
    	a60 = 10;
    	a180 = "e";
    	a10 = 10; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm16(String input) {
    if((cf && (a175 == 4))) {
    	calculateOutputm100(input);
    } 
}
private  void calculateOutputm105(String input) {
    if(((a1.equals("h")) && ((a60 == 6) && ((cf && (input.equals("C"))) && (a70 == 13))))) {
    	cf = false;
    	a168 = 7;
    	a60 = 8;
    	a15 = 11; 
    	System.out.println("T");
    } 
    if((((a70 == 13) && (((a1.equals("h")) && cf) && (a60 == 6))) && (input.equals("B")))) {
    	cf = false;
    	a125 = "h";
    	a60 = 5;
    	a128 = 2; 
    	System.out.println("W");
    } 
    if(((input.equals("E")) && (((cf && (a60 == 6)) && (a70 == 13)) && (a1.equals("h"))))) {
    	cf = false;
    	a70 = 11;
    	a175 = 4; 
    	System.out.println("Y");
    } 
    if(((a1.equals("h")) && (((a60 == 6) && (cf && (a70 == 13))) && (input.equals("A"))))) {
    	cf = false;
    	a132 = "i";
    	a60 = 9;
    	a173 = 6; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm18(String input) {
    if((cf && (a1.equals("h")))) {
    	calculateOutputm105(input);
    } 
}
private  void calculateOutputm107(String input) {
    if(((a173 == 8) && (((cf && (input.equals("B"))) && (a70 == 14)) && (a60 == 6)))) {
    	cf = false;
    	a70 = 15;
    	a83 = 15; 
    	System.out.println("X");
    } 
    if(((input.equals("A")) && ((a70 == 14) && ((cf && (a60 == 6)) && (a173 == 8))))) {
    	cf = false;
    	a60 = 4;
    	a163 = 3;
    	a42 = 15; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm19(String input) {
    if((cf && (a173 == 8))) {
    	calculateOutputm107(input);
    } 
}
private  void calculateOutputm109(String input) {
    if((((a60 == 6) && (((input.equals("E")) && cf) && (a83 == 12))) && (a70 == 15))) {
    	cf = false;
    	a12 = "g";
    	a60 = 7;
    	a145 = 7; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm111(String input) {
    if(((a70 == 15) && ((a83 == 15) && ((a60 == 6) && (cf && (input.equals("A"))))))) {
    	cf = false;
    	a46 = "f";
    	a60 = 8;
    	a168 = 2; 
    	System.out.println("T");
    } 
    if(((((input.equals("C")) && (cf && (a60 == 6))) && (a83 == 15)) && (a70 == 15))) {
    	cf = false;
    	a72 = 12;
    	a60 = 11;
    	a177 = 11; 
    	System.out.println("T");
    } 
    if((((a83 == 15) && (((input.equals("E")) && cf) && (a70 == 15))) && (a60 == 6))) {
    	cf = false;
    	a72 = 9;
    	a60 = 11;
    	a84 = 9; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm112(String input) {
    if(((a70 == 15) && ((input.equals("B")) && ((a60 == 6) && (cf && (a83 == 16)))))) {
    	cf = false;
    	a89 = "i";
    	a132 = "g";
    	a60 = 9; 
    	System.out.println("T");
    } 
    if((((input.equals("E")) && (((a83 == 16) && cf) && (a70 == 15))) && (a60 == 6))) {
    	cf = false;
    	a12 = "f";
    	a60 = 7;
    	a169 = 13; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm20(String input) {
    if((cf && (a83 == 12))) {
    	calculateOutputm109(input);
    } 
    if(((a83 == 15) && cf)) {
    	calculateOutputm111(input);
    } 
    if((cf && (a83 == 16))) {
    	calculateOutputm112(input);
    } 
}
private  void calculateOutputm114(String input) {
    if((((a60 == 6) && (((a195.equals("f")) && cf) && (a70 == 16))) && (input.equals("B")))) {
    	cf = false;
    	a168 = 6;
    	a60 = 8;
    	a29 = 9; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm21(String input) {
    if(((a195.equals("f")) && cf)) {
    	calculateOutputm114(input);
    } 
}
private  void calculateOutputm119(String input) {
    if(((a12.equals("f")) && ((input.equals("C")) && ((cf && (a169 == 13)) && (a60 == 7))))) {
    	cf = false;
    	a132 = "h";
    	a102 = "i";
    	a60 = 9; 
    	System.out.println("Y");
    } 
    if((((((a12.equals("f")) && cf) && (a60 == 7)) && (input.equals("A"))) && (a169 == 13))) {
    	cf = false;
    	a76 = "e";
    	a60 = 11;
    	a72 = 7; 
    	System.out.println("U");
    } 
    if(((input.equals("E")) && (((a12.equals("f")) && ((a60 == 7) && cf)) && (a169 == 13)))) {
    	cf = false;
    	a60 = 11;
    	a76 = "e";
    	a72 = 7; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm121(String input) {
    if((((a169 == 15) && (((input.equals("A")) && cf) && (a12.equals("f")))) && (a60 == 7))) {
    	cf = false;
    	a125 = "e";
    	a171 = "g";
    	a60 = 5; 
    	System.out.println("W");
    } 
    if((((a60 == 7) && ((cf && (input.equals("E"))) && (a169 == 15))) && (a12.equals("f")))) {
    	cf = false;
    	a10 = 9;
    	a60 = 10;
    	a142 = 4; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm122(String input) {
    if(((((a60 == 7) && ((a169 == 16) && cf)) && (a12.equals("f"))) && (input.equals("C")))) {
    	cf = false;
    	a168 = 6;
    	a60 = 8;
    	a29 = 13; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm23(String input) {
    if((cf && (a169 == 13))) {
    	calculateOutputm119(input);
    } 
    if((cf && (a169 == 15))) {
    	calculateOutputm121(input);
    } 
    if((cf && (a169 == 16))) {
    	calculateOutputm122(input);
    } 
}
private  void calculateOutputm124(String input) {
    if(((a60 == 7) && ((a12.equals("g")) && ((a145 == 6) && (cf && (input.equals("A"))))))) {
    	cf = false;
    	a60 = 11;
    	a72 = 12;
    	a177 = 12; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm125(String input) {
    if((((a145 == 7) && ((a12.equals("g")) && (cf && (a60 == 7)))) && (input.equals("A")))) {
    	cf = false;
    	a60 = 8;
    	a168 = 5;
    	a133 = 12; 
    	System.out.println("W");
    } 
    if((((((a145 == 7) && cf) && (input.equals("D"))) && (a60 == 7)) && (a12.equals("g")))) {
    	cf = false;
    	a60 = 8;
    	a168 = 5;
    	a133 = 11; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm126(String input) {
    if((((((a12.equals("g")) && cf) && (a145 == 8)) && (a60 == 7)) && (input.equals("B")))) {
    	cf = false;
    	a60 = 4;
    	a118 = "e";
    	a163 = 4; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm24(String input) {
    if(((a145 == 6) && cf)) {
    	calculateOutputm124(input);
    } 
    if(((a145 == 7) && cf)) {
    	calculateOutputm125(input);
    } 
    if(((a145 == 8) && cf)) {
    	calculateOutputm126(input);
    } 
}
private  void calculateOutputm128(String input) {
    if(((a12.equals("h")) && (((a60 == 7) && ((input.equals("C")) && cf)) && (a169 == 14)))) {
    	cf = false;
    	a60 = 10;
    	a48 = "e";
    	a10 = 14; 
    	System.out.println("T");
    } 
    if(((a12.equals("h")) && ((input.equals("E")) && (((a60 == 7) && cf) && (a169 == 14))))) {
    	cf = false;
    	a70 = 11;
    	a60 = 6;
    	a175 = 4; 
    	System.out.println("Y");
    } 
    if(((((input.equals("A")) && (cf && (a60 == 7))) && (a12.equals("h"))) && (a169 == 14))) {
    	cf = false;
    	a60 = 9;
    	a132 = "i";
    	a173 = 6; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm25(String input) {
    if(((a169 == 14) && cf)) {
    	calculateOutputm128(input);
    } 
}
private  void calculateOutputm131(String input) {
    if((((a60 == 7) && ((input.equals("B")) && (cf && (a12.equals("i"))))) && (a15 == 13))) {
    	cf = false;
    	a132 = "g";
    	a89 = "i";
    	a60 = 9; 
    	System.out.println("T");
    } 
    if(((a60 == 7) && ((a15 == 13) && ((cf && (a12.equals("i"))) && (input.equals("C")))))) {
    	cf = false;
    	a163 = 2;
    	a60 = 4;
    	a119 = 5; 
    	System.out.println("U");
    } 
    if(((input.equals("E")) && ((a60 == 7) && (((a12.equals("i")) && cf) && (a15 == 13))))) {
    	cf = false;
    	a12 = "f";
    	a169 = 13; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm26(String input) {
    if((cf && (a15 == 13))) {
    	calculateOutputm131(input);
    } 
}
private  void calculateOutputm133(String input) {
    if(((a168 == 1) && ((input.equals("B")) && ((cf && (a171.equals("e"))) && (a60 == 8))))) {
    	cf = false;
    	a12 = "f";
    	a60 = 7;
    	a169 = 16; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm134(String input) {
    if((((a60 == 8) && (((a171.equals("h")) && cf) && (input.equals("A")))) && (a168 == 1))) {
    	cf = false;
    	a60 = 7;
    	a12 = "g";
    	a145 = 8; 
    	System.out.println("V");
    } 
    if(((a168 == 1) && (((a171.equals("h")) && (cf && (a60 == 8))) && (input.equals("E"))))) {
    	cf = false;
    	a60 = 7;
    	a12 = "h";
    	a169 = 9; 
    	System.out.println("U");
    } 
    if(((input.equals("B")) && (((cf && (a171.equals("h"))) && (a60 == 8)) && (a168 == 1)))) {
    	cf = false;
    	a168 = 6;
    	a29 = 15; 
    	System.out.println("X");
    } 
    if(((a171.equals("h")) && ((a60 == 8) && ((input.equals("D")) && (cf && (a168 == 1)))))) {
    	cf = false;
    	a60 = 11;
    	a72 = 11;
    	a54 = 4; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm135(String input) {
    if((((input.equals("C")) && (((a171.equals("i")) && cf) && (a168 == 1))) && (a60 == 8))) {
    	cf = false;
    	a125 = "h";
    	a60 = 5;
    	a128 = 9; 
    	System.out.println("U");
    } 
    if(((input.equals("E")) && ((a60 == 8) && ((cf && (a171.equals("i"))) && (a168 == 1))))) {
    	cf = false;
    	a125 = "h";
    	a60 = 5;
    	a128 = 9; 
    	System.out.println("U");
    } 
    if(((a171.equals("i")) && ((input.equals("B")) && ((cf && (a60 == 8)) && (a168 == 1))))) {
    	cf = false;
    	a70 = 11;
    	a60 = 6;
    	a175 = 4; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm27(String input) {
    if((cf && (a171.equals("e")))) {
    	calculateOutputm133(input);
    } 
    if(((a171.equals("h")) && cf)) {
    	calculateOutputm134(input);
    } 
    if(((a171.equals("i")) && cf)) {
    	calculateOutputm135(input);
    } 
}
private  void calculateOutputm136(String input) {
    if((((input.equals("C")) && ((cf && (a46.equals("f"))) && (a60 == 8))) && (a168 == 2))) {
    	cf = false;
    	a70 = 15;
    	a60 = 6;
    	a83 = 12; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm28(String input) {
    if((cf && (a46.equals("f")))) {
    	calculateOutputm136(input);
    } 
}
private  void calculateOutputm138(String input) {
    if((((a168 == 3) && ((input.equals("A")) && (cf && (a89.equals("i"))))) && (a60 == 8))) {
    	cf = false;
    	a168 = 6;
    	a29 = 15; 
    	System.out.println("X");
    } 
    if(((a168 == 3) && ((a60 == 8) && ((input.equals("C")) && ((a89.equals("i")) && cf))))) {
    	cf = false;
    	 
    	System.out.println("T");
    } 
    if((((input.equals("E")) && ((a60 == 8) && ((a168 == 3) && cf))) && (a89.equals("i")))) {
    	cf = false;
    	a180 = "e";
    	a60 = 10;
    	a10 = 10; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm29(String input) {
    if(((a89.equals("i")) && cf)) {
    	calculateOutputm138(input);
    } 
}
private  void calculateOutputm139(String input) {
    if(((a168 == 4) && ((input.equals("C")) && (((a60 == 8) && cf) && (a129 == 8))))) {
    	cf = false;
    	a45 = "e";
    	a125 = "f";
    	a60 = 5; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm141(String input) {
    if((((a60 == 8) && ((a129 == 15) && ((a168 == 4) && cf))) && (input.equals("C")))) {
    	cf = false;
    	a72 = 8;
    	a60 = 11;
    	a92 = 10; 
    	System.out.println("U");
    } 
    if(((a168 == 4) && ((a60 == 8) && ((input.equals("E")) && (cf && (a129 == 15)))))) {
    	cf = false;
    	a168 = 8;
    	a72 = 13; 
    	System.out.println("U");
    } 
    if((((((a129 == 15) && cf) && (a168 == 4)) && (a60 == 8)) && (input.equals("D")))) {
    	cf = false;
    	a102 = "f";
    	a132 = "h";
    	a60 = 9; 
    	System.out.println("W");
    } 
    if((((a129 == 15) && ((cf && (a60 == 8)) && (input.equals("B")))) && (a168 == 4))) {
    	cf = false;
    	a70 = 11;
    	a60 = 6;
    	a175 = 4; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm30(String input) {
    if(((a129 == 8) && cf)) {
    	calculateOutputm139(input);
    } 
    if((cf && (a129 == 15))) {
    	calculateOutputm141(input);
    } 
}
private  void calculateOutputm142(String input) {
    if(((a133 == 7) && ((a168 == 5) && ((cf && (input.equals("A"))) && (a60 == 8))))) {
    	cf = false;
    	a70 = 9;
    	a60 = 6;
    	a42 = 13; 
    	System.out.println("X");
    } 
    if(((a60 == 8) && ((a133 == 7) && ((cf && (a168 == 5)) && (input.equals("E")))))) {
    	cf = false;
    	a76 = "e";
    	a60 = 11;
    	a72 = 7; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm147(String input) {
    if((((a60 == 8) && (((a133 == 12) && cf) && (a168 == 5))) && (input.equals("A")))) {
    	cf = false;
    	a171 = "e";
    	a168 = 1; 
    	System.out.println("V");
    } 
    if((((((a60 == 8) && cf) && (a168 == 5)) && (input.equals("B"))) && (a133 == 12))) {
    	cf = false;
    	a60 = 7;
    	a12 = "h";
    	a169 = 14; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm31(String input) {
    if((cf && (a133 == 7))) {
    	calculateOutputm142(input);
    } 
    if((cf && (a133 == 12))) {
    	calculateOutputm147(input);
    } 
}
private  void calculateOutputm149(String input) {
    if(((a168 == 6) && (((a29 == 9) && (cf && (a60 == 8))) && (input.equals("C"))))) {
    	cf = false;
    	a60 = 6;
    	a70 = 14;
    	a173 = 8; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm150(String input) {
    if((((((a60 == 8) && cf) && (a29 == 13)) && (a168 == 6)) && (input.equals("C")))) {
    	cf = false;
    	a60 = 11;
    	a72 = 8;
    	a92 = 13; 
    	System.out.println("V");
    } 
    if((((a29 == 13) && ((cf && (a60 == 8)) && (input.equals("A")))) && (a168 == 6))) {
    	cf = false;
    	a19 = "i";
    	a60 = 4;
    	a163 = 5; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm151(String input) {
    if(((a29 == 15) && ((a60 == 8) && ((cf && (a168 == 6)) && (input.equals("E")))))) {
    	cf = false;
    	a60 = 6;
    	a70 = 11;
    	a175 = 4; 
    	System.out.println("Y");
    } 
    if(((a168 == 6) && ((((a60 == 8) && cf) && (a29 == 15)) && (input.equals("A"))))) {
    	cf = false;
    	a132 = "i";
    	a60 = 9;
    	a173 = 6; 
    	System.out.println("T");
    } 
    if(((((a168 == 6) && ((a60 == 8) && cf)) && (a29 == 15)) && (input.equals("C")))) {
    	cf = false;
    	a168 = 7;
    	a15 = 11; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm32(String input) {
    if((cf && (a29 == 9))) {
    	calculateOutputm149(input);
    } 
    if(((a29 == 13) && cf)) {
    	calculateOutputm150(input);
    } 
    if(((a29 == 15) && cf)) {
    	calculateOutputm151(input);
    } 
}
private  void calculateOutputm152(String input) {
    if(((a168 == 7) && ((a60 == 8) && (((input.equals("C")) && cf) && (a15 == 9))))) {
    	cf = false;
    	a171 = "h";
    	a168 = 1; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm154(String input) {
    if((((a60 == 8) && ((a168 == 7) && ((a15 == 11) && cf))) && (input.equals("A")))) {
    	cf = false;
    	a70 = 15;
    	a60 = 6;
    	a83 = 16; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm157(String input) {
    if(((a60 == 8) && ((((input.equals("B")) && cf) && (a15 == 15)) && (a168 == 7)))) {
    	cf = false;
    	a72 = 9;
    	a60 = 11;
    	a84 = 7; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm33(String input) {
    if(((a15 == 9) && cf)) {
    	calculateOutputm152(input);
    } 
    if((cf && (a15 == 11))) {
    	calculateOutputm154(input);
    } 
    if((cf && (a15 == 15))) {
    	calculateOutputm157(input);
    } 
}
private  void calculateOutputm158(String input) {
    if((((a72 == 8) && ((input.equals("A")) && (cf && (a60 == 8)))) && (a168 == 8))) {
    	cf = false;
    	a60 = 11;
    	a72 = 11;
    	a54 = 9; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm161(String input) {
    if(((a72 == 13) && ((a60 == 8) && ((cf && (a168 == 8)) && (input.equals("A")))))) {
    	cf = false;
    	a60 = 11;
    	a72 = 11;
    	a54 = 3; 
    	System.out.println("W");
    } 
    if(((input.equals("C")) && ((a168 == 8) && (((a72 == 13) && cf) && (a60 == 8))))) {
    	cf = false;
    	a12 = "g";
    	a60 = 7;
    	a145 = 4; 
    	System.out.println("Y");
    } 
    if(((a168 == 8) && ((a60 == 8) && ((input.equals("E")) && ((a72 == 13) && cf))))) {
    	cf = false;
    	a171 = "i";
    	a168 = 1; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm34(String input) {
    if((cf && (a72 == 8))) {
    	calculateOutputm158(input);
    } 
    if((cf && (a72 == 13))) {
    	calculateOutputm161(input);
    } 
}
private  void calculateOutputm163(String input) {
    if(((((a60 == 9) && ((a72 == 7) && cf)) && (a132.equals("e"))) && (input.equals("B")))) {
    	cf = false;
    	a132 = "g";
    	a89 = "i"; 
    	System.out.println("T");
    } 
    if(((input.equals("E")) && (((a60 == 9) && (cf && (a72 == 7))) && (a132.equals("e"))))) {
    	cf = false;
    	a60 = 7;
    	a12 = "f";
    	a169 = 13; 
    	System.out.println("U");
    } 
    if(((a72 == 7) && ((input.equals("C")) && ((a132.equals("e")) && ((a60 == 9) && cf))))) {
    	cf = false;
    	a60 = 4;
    	a0 = "f";
    	a163 = 8; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm35(String input) {
    if(((a72 == 7) && cf)) {
    	calculateOutputm163(input);
    } 
}
private  void calculateOutputm168(String input) {
    if((((a60 == 9) && (((input.equals("B")) && cf) && (a173 == 10))) && (a132.equals("f")))) {
    	cf = false;
    	a70 = 11;
    	a60 = 6;
    	a175 = 4; 
    	System.out.println("Y");
    } 
    if(((((a60 == 9) && ((input.equals("C")) && cf)) && (a173 == 10)) && (a132.equals("f")))) {
    	cf = false;
    	a168 = 6;
    	a60 = 8;
    	a29 = 15; 
    	System.out.println("X");
    } 
    if(((input.equals("A")) && ((((a173 == 10) && cf) && (a132.equals("f"))) && (a60 == 9)))) {
    	cf = false;
    	a168 = 6;
    	a60 = 8;
    	a29 = 15; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm36(String input) {
    if(((a173 == 10) && cf)) {
    	calculateOutputm168(input);
    } 
}
private  void calculateOutputm172(String input) {
    if(((input.equals("B")) && ((a89.equals("g")) && ((a132.equals("g")) && ((a60 == 9) && cf))))) {
    	cf = false;
    	a132 = "h";
    	a102 = "i"; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm173(String input) {
    if(((input.equals("A")) && ((a89.equals("h")) && ((cf && (a132.equals("g"))) && (a60 == 9))))) {
    	cf = false;
    	a10 = 11;
    	a60 = 10;
    	a175 = 9; 
    	System.out.println("W");
    } 
    if((((a89.equals("h")) && ((input.equals("E")) && (cf && (a132.equals("g"))))) && (a60 == 9))) {
    	cf = false;
    	a171 = "i";
    	a60 = 8;
    	a168 = 1; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm174(String input) {
    if(((a60 == 9) && ((input.equals("C")) && ((a89.equals("i")) && (cf && (a132.equals("g"))))))) {
    	cf = false;
    	a60 = 8;
    	a168 = 7;
    	a15 = 11; 
    	System.out.println("T");
    } 
}
private  void calculateOutputm37(String input) {
    if(((a89.equals("g")) && cf)) {
    	calculateOutputm172(input);
    } 
    if(((a89.equals("h")) && cf)) {
    	calculateOutputm173(input);
    } 
    if((cf && (a89.equals("i")))) {
    	calculateOutputm174(input);
    } 
}
private  void calculateOutputm177(String input) {
    if(((a60 == 9) && ((input.equals("C")) && ((a102.equals("i")) && (cf && (a132.equals("h"))))))) {
    	cf = false;
    	a72 = 11;
    	a60 = 11;
    	a54 = 9; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm38(String input) {
    if(((a102.equals("i")) && cf)) {
    	calculateOutputm177(input);
    } 
}
private  void calculateOutputm178(String input) {
    if((((input.equals("C")) && ((a60 == 9) && (cf && (a132.equals("i"))))) && (a173 == 6))) {
    	cf = false;
    	a125 = "f";
    	a45 = "i";
    	a60 = 5; 
    	System.out.println("Z");
    } 
}
private  void calculateOutputm179(String input) {
    if(((a132.equals("i")) && ((a60 == 9) && ((input.equals("E")) && (cf && (a173 == 7)))))) {
    	cf = false;
    	a60 = 10;
    	a180 = "f";
    	a10 = 10; 
    	System.out.println("Z");
    } 
    if(((a132.equals("i")) && (((a60 == 9) && (cf && (input.equals("B")))) && (a173 == 7)))) {
    	cf = false;
    	a60 = 7;
    	a12 = "f";
    	a169 = 14; 
    	System.out.println("X");
    } 
    if(((a173 == 7) && ((a60 == 9) && (((input.equals("D")) && cf) && (a132.equals("i")))))) {
    	cf = false;
    	a125 = "h";
    	a60 = 5;
    	a128 = 4; 
    	System.out.println("U");
    } 
    if((((input.equals("A")) && ((cf && (a60 == 9)) && (a173 == 7))) && (a132.equals("i")))) {
    	cf = false;
    	a76 = "e";
    	a60 = 11;
    	a72 = 7; 
    	System.out.println("V");
    } 
    if((((a132.equals("i")) && (((a173 == 7) && cf) && (a60 == 9))) && (input.equals("C")))) {
    	cf = false;
    	a60 = 8;
    	a168 = 4;
    	a129 = 15; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm181(String input) {
    if(((a60 == 9) && (((input.equals("C")) && ((a173 == 10) && cf)) && (a132.equals("i"))))) {
    	cf = false;
    	a10 = 9;
    	a60 = 10;
    	a142 = 5; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm39(String input) {
    if((cf && (a173 == 6))) {
    	calculateOutputm178(input);
    } 
    if((cf && (a173 == 7))) {
    	calculateOutputm179(input);
    } 
    if((cf && (a173 == 10))) {
    	calculateOutputm181(input);
    } 
}
private  void calculateOutputm183(String input) {
    if((((a142 == 4) && ((a10 == 9) && (cf && (input.equals("C"))))) && (a60 == 10))) {
    	cf = false;
    	a60 = 5;
    	a125 = "h";
    	a128 = 9; 
    	System.out.println("U");
    } 
    if(((a142 == 4) && (((a60 == 10) && ((a10 == 9) && cf)) && (input.equals("B"))))) {
    	cf = false;
    	a60 = 6;
    	a70 = 11;
    	a175 = 4; 
    	System.out.println("Y");
    } 
    if(((a60 == 10) && (((a142 == 4) && ((a10 == 9) && cf)) && (input.equals("E"))))) {
    	cf = false;
    	a19 = "g";
    	a60 = 4;
    	a163 = 5; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm184(String input) {
    if(((a60 == 10) && ((input.equals("C")) && ((a142 == 5) && (cf && (a10 == 9)))))) {
    	cf = false;
    	a72 = 12;
    	a60 = 11;
    	a177 = 16; 
    	System.out.println("V");
    } 
    if(((a10 == 9) && ((a60 == 10) && ((a142 == 5) && (cf && (input.equals("A"))))))) {
    	cf = false;
    	a132 = "i";
    	a60 = 9;
    	a173 = 7; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm40(String input) {
    if(((a142 == 4) && cf)) {
    	calculateOutputm183(input);
    } 
    if((cf && (a142 == 5))) {
    	calculateOutputm184(input);
    } 
}
private  void calculateOutputm188(String input) {
    if(((a60 == 10) && ((input.equals("A")) && ((a10 == 10) && (cf && (a180.equals("e"))))))) {
    	cf = false;
    	a60 = 9;
    	a132 = "f";
    	a173 = 10; 
    	System.out.println("X");
    } 
    if(((((cf && (a180.equals("e"))) && (a10 == 10)) && (input.equals("B"))) && (a60 == 10))) {
    	cf = false;
    	a60 = 8;
    	a89 = "i";
    	a168 = 3; 
    	System.out.println("T");
    } 
    if(((input.equals("C")) && ((a10 == 10) && ((a60 == 10) && (cf && (a180.equals("e"))))))) {
    	cf = false;
    	a89 = "g";
    	a132 = "g";
    	a60 = 9; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm189(String input) {
    if(((a180.equals("f")) && ((a10 == 10) && (((a60 == 10) && cf) && (input.equals("B")))))) {
    	cf = false;
    	a60 = 8;
    	a168 = 6;
    	a29 = 15; 
    	System.out.println("X");
    } 
    if(((((cf && (a180.equals("f"))) && (a10 == 10)) && (input.equals("A"))) && (a60 == 10))) {
    	cf = false;
    	a168 = 7;
    	a60 = 8;
    	a15 = 15; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm41(String input) {
    if(((a180.equals("e")) && cf)) {
    	calculateOutputm188(input);
    } 
    if(((a180.equals("f")) && cf)) {
    	calculateOutputm189(input);
    } 
}
private  void calculateOutputm191(String input) {
    if(((input.equals("B")) && (((a60 == 10) && (cf && (a10 == 11))) && (a175 == 9)))) {
    	cf = false;
    	a72 = 11;
    	a60 = 11;
    	a54 = 9; 
    	System.out.println("W");
    } 
    if(((a10 == 11) && ((a175 == 9) && ((cf && (a60 == 10)) && (input.equals("D")))))) {
    	cf = false;
    	a60 = 4;
    	a163 = 1;
    	a109 = 8; 
    	System.out.println("W");
    } 
    if((((input.equals("A")) && ((cf && (a175 == 9)) && (a60 == 10))) && (a10 == 11))) {
    	cf = false;
    	a102 = "i";
    	a132 = "h";
    	a60 = 9; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm42(String input) {
    if(((a175 == 9) && cf)) {
    	calculateOutputm191(input);
    } 
}
private  void calculateOutputm196(String input) {
    if((((a10 == 14) && ((a60 == 10) && ((a48.equals("e")) && cf))) && (input.equals("A")))) {
    	cf = false;
    	a60 = 9;
    	a132 = "e";
    	a72 = 7; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm197(String input) {
    if((((a48.equals("f")) && ((cf && (a10 == 14)) && (input.equals("C")))) && (a60 == 10))) {
    	cf = false;
    	a125 = "g";
    	a60 = 5;
    	a29 = 13; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm45(String input) {
    if(((a48.equals("e")) && cf)) {
    	calculateOutputm196(input);
    } 
    if(((a48.equals("f")) && cf)) {
    	calculateOutputm197(input);
    } 
}
private  void calculateOutputm200(String input) {
    if((((input.equals("A")) && ((a176.equals("h")) && (cf && (a60 == 10)))) && (a10 == 16))) {
    	cf = false;
    	a72 = 11;
    	a60 = 11;
    	a54 = 2; 
    	System.out.println("X");
    } 
    if(((((a60 == 10) && (cf && (a176.equals("h")))) && (input.equals("B"))) && (a10 == 16))) {
    	cf = false;
    	a60 = 7;
    	a12 = "f";
    	a169 = 16; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm47(String input) {
    if(((a176.equals("h")) && cf)) {
    	calculateOutputm200(input);
    } 
}
private  void calculateOutputm201(String input) {
    if(((((a76.equals("e")) && ((input.equals("A")) && cf)) && (a72 == 7)) && (a60 == 11))) {
    	cf = false;
    	a72 = 11;
    	a54 = 9; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm48(String input) {
    if((cf && (a76.equals("e")))) {
    	calculateOutputm201(input);
    } 
}
private  void calculateOutputm202(String input) {
    if(((input.equals("D")) && (((a60 == 11) && ((a72 == 8) && cf)) && (a92 == 10)))) {
    	cf = false;
    	a168 = 7;
    	a60 = 8;
    	a15 = 13; 
    	System.out.println("Z");
    } 
    if((((a60 == 11) && (((input.equals("E")) && cf) && (a72 == 8))) && (a92 == 10))) {
    	cf = false;
    	a171 = "i";
    	a60 = 8;
    	a168 = 1; 
    	System.out.println("Z");
    } 
    if(((a60 == 11) && (((cf && (a72 == 8)) && (a92 == 10)) && (input.equals("A"))))) {
    	cf = false;
    	a72 = 11;
    	a54 = 3; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm203(String input) {
    if(((a72 == 8) && ((((a92 == 13) && cf) && (input.equals("E"))) && (a60 == 11)))) {
    	cf = false;
    	a102 = "i";
    	a132 = "h";
    	a60 = 9; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm49(String input) {
    if((cf && (a92 == 10))) {
    	calculateOutputm202(input);
    } 
    if((cf && (a92 == 13))) {
    	calculateOutputm203(input);
    } 
}
private  void calculateOutputm206(String input) {
    if((((a84 == 7) && ((input.equals("C")) && (cf && (a72 == 9)))) && (a60 == 11))) {
    	cf = false;
    	a60 = 4;
    	a163 = 1;
    	a109 = 6; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm208(String input) {
    if(((input.equals("A")) && (((a72 == 9) && (cf && (a60 == 11))) && (a84 == 9)))) {
    	cf = false;
    	a89 = "g";
    	a72 = 14; 
    	System.out.println("V");
    } 
    if((((input.equals("B")) && ((cf && (a84 == 9)) && (a72 == 9))) && (a60 == 11))) {
    	cf = false;
    	a12 = "f";
    	a60 = 7;
    	a169 = 15; 
    	System.out.println("U");
    } 
    if((((input.equals("C")) && ((a84 == 9) && (cf && (a72 == 9)))) && (a60 == 11))) {
    	cf = false;
    	a60 = 10;
    	a180 = "e";
    	a10 = 10; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm50(String input) {
    if((cf && (a84 == 7))) {
    	calculateOutputm206(input);
    } 
    if(((a84 == 9) && cf)) {
    	calculateOutputm208(input);
    } 
}
private  void calculateOutputm213(String input) {
    if(((input.equals("A")) && ((((a60 == 11) && cf) && (a72 == 11)) && (a54 == 3)))) {
    	cf = false;
    	a132 = "h";
    	a102 = "i";
    	a60 = 9; 
    	System.out.println("U");
    } 
    if(((((input.equals("B")) && ((a54 == 3) && cf)) && (a72 == 11)) && (a60 == 11))) {
    	cf = false;
    	a54 = 9; 
    	System.out.println("W");
    } 
}
private  void calculateOutputm217(String input) {
    if(((a72 == 11) && (((a60 == 11) && ((a54 == 9) && cf)) && (input.equals("B"))))) {
    	cf = false;
    	a60 = 8;
    	a168 = 6;
    	a29 = 15; 
    	System.out.println("X");
    } 
    if((((a54 == 9) && ((cf && (a60 == 11)) && (a72 == 11))) && (input.equals("A")))) {
    	cf = false;
    	a60 = 8;
    	a171 = "e";
    	a168 = 1; 
    	System.out.println("V");
    } 
}
private  void calculateOutputm52(String input) {
    if((cf && (a54 == 3))) {
    	calculateOutputm213(input);
    } 
    if(((a54 == 9) && cf)) {
    	calculateOutputm217(input);
    } 
}
private  void calculateOutputm218(String input) {
    if((((a60 == 11) && (((a72 == 12) && cf) && (input.equals("A")))) && (a177 == 11))) {
    	cf = false;
    	a163 = 2;
    	a60 = 4;
    	a119 = 4; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm219(String input) {
    if(((a72 == 12) && ((a177 == 12) && ((cf && (a60 == 11)) && (input.equals("A")))))) {
    	cf = false;
    	a60 = 10;
    	a176 = "h";
    	a10 = 16; 
    	System.out.println("V");
    } 
    if(((a177 == 12) && ((a72 == 12) && (((a60 == 11) && cf) && (input.equals("B")))))) {
    	cf = false;
    	a168 = 6;
    	a60 = 8;
    	a29 = 15; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm220(String input) {
    if(((a177 == 14) && (((cf && (a60 == 11)) && (input.equals("E"))) && (a72 == 12)))) {
    	cf = false;
    	a60 = 5;
    	a125 = "h";
    	a128 = 9; 
    	System.out.println("U");
    } 
    if(((input.equals("B")) && (((a60 == 11) && ((a177 == 14) && cf)) && (a72 == 12)))) {
    	cf = false;
    	a70 = 11;
    	a60 = 6;
    	a175 = 4; 
    	System.out.println("Y");
    } 
    if(((input.equals("C")) && (((a72 == 12) && ((a177 == 14) && cf)) && (a60 == 11)))) {
    	cf = false;
    	a89 = "h";
    	a132 = "g";
    	a60 = 9; 
    	System.out.println("U");
    } 
}
private  void calculateOutputm222(String input) {
    if(((((cf && (input.equals("C"))) && (a60 == 11)) && (a177 == 16)) && (a72 == 12))) {
    	cf = false;
    	a60 = 4;
    	a163 = 2;
    	a119 = 9; 
    	System.out.println("T");
    } 
    if(((a177 == 16) && ((a72 == 12) && ((input.equals("E")) && ((a60 == 11) && cf))))) {
    	cf = false;
    	a60 = 8;
    	a168 = 7;
    	a15 = 9; 
    	System.out.println("W");
    } 
    if(((a177 == 16) && (((a72 == 12) && (cf && (a60 == 11))) && (input.equals("A"))))) {
    	cf = false;
    	a132 = "f";
    	a60 = 9;
    	a173 = 12; 
    	System.out.println("Z");
    } 
    if((((a60 == 11) && ((a177 == 16) && ((input.equals("B")) && cf))) && (a72 == 12))) {
    	cf = false;
    	a60 = 4;
    	a144 = "h";
    	a163 = 7; 
    	System.out.println("Y");
    } 
}
private  void calculateOutputm53(String input) {
    if((cf && (a177 == 11))) {
    	calculateOutputm218(input);
    } 
    if((cf && (a177 == 12))) {
    	calculateOutputm219(input);
    } 
    if(((a177 == 14) && cf)) {
    	calculateOutputm220(input);
    } 
    if(((a177 == 16) && cf)) {
    	calculateOutputm222(input);
    } 
}
private  void calculateOutputm227(String input) {
    if(((a89.equals("g")) && (((cf && (input.equals("E"))) && (a60 == 11)) && (a72 == 14)))) {
    	cf = false;
    	a12 = "g";
    	a60 = 7;
    	a145 = 6; 
    	System.out.println("T");
    } 
    if((((((a89.equals("g")) && cf) && (input.equals("A"))) && (a60 == 11)) && (a72 == 14))) {
    	cf = false;
    	a70 = 9;
    	a60 = 6;
    	a42 = 13; 
    	System.out.println("X");
    } 
}
private  void calculateOutputm55(String input) {
    if((cf && (a89.equals("g")))) {
    	calculateOutputm227(input);
    } 
}



public  void calculateOutput(String input) {
 	cf = true;
    if((cf && (a60 == 4))) {
    	if(((a163 == 1) && cf)) {
    		calculateOutputm1(input);
    	} 
    	if(((a163 == 2) && cf)) {
    		calculateOutputm2(input);
    	} 
    	if(((a163 == 3) && cf)) {
    		calculateOutputm3(input);
    	} 
    	if(((a163 == 4) && cf)) {
    		calculateOutputm4(input);
    	} 
    	if((cf && (a163 == 5))) {
    		calculateOutputm5(input);
    	} 
    } 
    if(((a60 == 5) && cf)) {
    	if((cf && (a125.equals("e")))) {
    		calculateOutputm9(input);
    	} 
    	if(((a125.equals("f")) && cf)) {
    		calculateOutputm10(input);
    	} 
    	if(((a125.equals("g")) && cf)) {
    		calculateOutputm11(input);
    	} 
    	if(((a125.equals("h")) && cf)) {
    		calculateOutputm12(input);
    	} 
    } 
    if((cf && (a60 == 6))) {
    	if(((a70 == 9) && cf)) {
    		calculateOutputm14(input);
    	} 
    	if((cf && (a70 == 11))) {
    		calculateOutputm16(input);
    	} 
    	if((cf && (a70 == 13))) {
    		calculateOutputm18(input);
    	} 
    	if((cf && (a70 == 14))) {
    		calculateOutputm19(input);
    	} 
    	if((cf && (a70 == 15))) {
    		calculateOutputm20(input);
    	} 
    	if((cf && (a70 == 16))) {
    		calculateOutputm21(input);
    	} 
    } 
    if(((a60 == 7) && cf)) {
    	if((cf && (a12.equals("f")))) {
    		calculateOutputm23(input);
    	} 
    	if(((a12.equals("g")) && cf)) {
    		calculateOutputm24(input);
    	} 
    	if((cf && (a12.equals("h")))) {
    		calculateOutputm25(input);
    	} 
    	if((cf && (a12.equals("i")))) {
    		calculateOutputm26(input);
    	} 
    } 
    if((cf && (a60 == 8))) {
    	if((cf && (a168 == 1))) {
    		calculateOutputm27(input);
    	} 
    	if(((a168 == 2) && cf)) {
    		calculateOutputm28(input);
    	} 
    	if(((a168 == 3) && cf)) {
    		calculateOutputm29(input);
    	} 
    	if(((a168 == 4) && cf)) {
    		calculateOutputm30(input);
    	} 
    	if((cf && (a168 == 5))) {
    		calculateOutputm31(input);
    	} 
    	if((cf && (a168 == 6))) {
    		calculateOutputm32(input);
    	} 
    	if((cf && (a168 == 7))) {
    		calculateOutputm33(input);
    	} 
    	if((cf && (a168 == 8))) {
    		calculateOutputm34(input);
    	} 
    } 
    if(((a60 == 9) && cf)) {
    	if(((a132.equals("e")) && cf)) {
    		calculateOutputm35(input);
    	} 
    	if(((a132.equals("f")) && cf)) {
    		calculateOutputm36(input);
    	} 
    	if(((a132.equals("g")) && cf)) {
    		calculateOutputm37(input);
    	} 
    	if(((a132.equals("h")) && cf)) {
    		calculateOutputm38(input);
    	} 
    	if(((a132.equals("i")) && cf)) {
    		calculateOutputm39(input);
    	} 
    } 
    if((cf && (a60 == 10))) {
    	if(((a10 == 9) && cf)) {
    		calculateOutputm40(input);
    	} 
    	if(((a10 == 10) && cf)) {
    		calculateOutputm41(input);
    	} 
    	if((cf && (a10 == 11))) {
    		calculateOutputm42(input);
    	} 
    	if((cf && (a10 == 14))) {
    		calculateOutputm45(input);
    	} 
    	if((cf && (a10 == 16))) {
    		calculateOutputm47(input);
    	} 
    } 
    if((cf && (a60 == 11))) {
    	if(((a72 == 7) && cf)) {
    		calculateOutputm48(input);
    	} 
    	if((cf && (a72 == 8))) {
    		calculateOutputm49(input);
    	} 
    	if(((a72 == 9) && cf)) {
    		calculateOutputm50(input);
    	} 
    	if((cf && (a72 == 11))) {
    		calculateOutputm52(input);
    	} 
    	if(((a72 == 12) && cf)) {
    		calculateOutputm53(input);
    	} 
    	if((cf && (a72 == 14))) {
    		calculateOutputm55(input);
    	} 
    } 

    errorCheck();
    if(cf)
    	throw new IllegalArgumentException("Current state has no transition for this input!");
}


public static void main(String[] args) throws Exception {
	// init system and input reader
	Problem4 eca = new Problem4();

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
