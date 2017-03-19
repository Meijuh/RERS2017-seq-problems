package nl.utwente.fmt.rers.problems.seq;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import lombok.EqualsAndHashCode;
@EqualsAndHashCode(exclude={"stdin", "inputs", "output", "cf"}) public class Problem26 implements Problem {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	private String[] inputs = {"E","F","A","G","B","H","C","I","J","D"};

	private String a155 = "i";
	private int a291 = 3;
	private String a189 = "h";
	private int a162 = 149;
	private int[] a10 = {54,55,56,57,58,59};
	private int[] a18 = {60,61,62,63,64,65};
	private int[] a86 = {66,67,68,69,70,71};
	private int[] a82 = a10;
	private int a166 = 14;
	private int a56 = 361;
	private int a337 = 7;
	private int[] a29 = {3,4,5,6,7,8,9,10};
	private int a349 = 133;
	private int a391 = 3;
	private int a340 = 7;
	private String a278 = "f";
	private int[] a343 = {1,2,3,4,5,6,7,8};
	private int[] a207 = {70,71,72,73,74,75};
	private int[] a385 = {76,77,78,79,80,81};
	private int[] a205 = {82,83,84,85,86,87};
	private int[] a282 = a207;
	private int[] a148 = {3,4,5,6,7,8,9,10};
	private int a215 = 11;
	private String a365 = "f";
	private int a50 = 4;
	private int a244 = 124;
	private String a316 = "g";
	private int[] a0 = {3,4,5,6,7,8,9,10};
	private int[] a344 = {86,87,88,89,90,91};
	private int[] a251 = {92,93,94,95,96,97};
	private int[] a269 = {98,99,100,101,102,103};
	private int[] a399 = a251;
	private int a1 = -55;
	private int[] a240 = {41,42,43,44,45,46};
	private int[] a324 = {47,48,49,50,51,52};
	private int[] a374 = {53,54,55,56,57,58};
	private int[] a235 = a324;
	private int a338 = 9;
	private int[] a178 = {7,8,9,10,11,12,13,14};
	private int[] a124 = {58,59,60,61,62,63};
	private int[] a111 = {64,65,66,67,68,69};
	private int[] a84 = {70,71,72,73,74,75};
	private int[] a33 = a124;
	private int a373 = 3;
	private String a79 = "f";
	private int a279 = 116;
	private String a209 = "f";
	private int[] a67 = {5,6,7,8,9,10,11,12};
	private String a333 = "f";
	private int a24 = 11;
	private int a146 = 6;
	private int[] a204 = {82,83,84,85,86,87};
	private int[] a366 = {88,89,90,91,92,93};
	private int[] a281 = {94,95,96,97,98,99};
	private int[] a377 = a366;
	private String a95 = "h";
	private int a167 = 5;
	private int[] a217 = {55,56,57,58,59,60};
	private int[] a372 = {61,62,63,64,65,66};
	private int[] a299 = {67,68,69,70,71,72};
	private int[] a320 = a372;
	private int a295 = -7;
	private int a129 = 112;
	private int a180 = 460;
	private int a400 = -81;
	private String a285 = "f";
	private int a30 = 14;
	private int a127 = 10;
	private int[] a48 = {88,89,90,91,92,93};
	private int[] a98 = {94,95,96,97,98,99};
	private int[] a70 = {100,101,102,103,104,105};
	private int[] a76 = a98;
	private int a263 = 9;
	private int a193 = 129;
	private String a116 = "e";
	private int a177 = 8;
	private int a109 = 4;
	private int a156 = 43;
	private String a133 = "g";
	private boolean cf = true;
	private int[] a296 = {80,81,82,83,84,85};
	private int[] a358 = {86,87,88,89,90,91};
	private int[] a332 = {92,93,94,95,96,97};
	private int[] a246 = a358;
	private String a17 = "h";
	private int a201 = 7;
	private int a280 = 175;
	private int a19 = 279;
	private int[] a74 = {13,14,15,16,17,18};
	private int[] a28 = {19,20,21,22,23,24};
	private int[] a53 = {25,26,27,28,29,30};
	private int[] a61 = a28;
	private int[] a392 = {2,3,4,5,6,7,8,9};
	private String a310 = "f";
	private int a15 = 13;
	private String a113 = "g";
	private int[] a307 = {2,3,4,5,6,7,8,9};
	private int[] a382 = {5,6,7,8,9,10,11,12};
	private int[] a143 = {41,42,43,44,45,46};
	private int[] a2 = {47,48,49,50,51,52};
	private int[] a197 = {53,54,55,56,57,58};
	private int[] a152 = a2;
	private String a101 = "e";
	private int a117 = 14;
	private String a119 = "e";
	private int[] a221 = {13,14,15,16,17,18};
	private int[] a211 = {19,20,21,22,23,24};
	private int[] a236 = {25,26,27,28,29,30};
	private int[] a266 = a211;
	private String a325 = "g";
	private String a190 = "e";
	private int[] a13 = {39,40,41,42,43,44};
	private int[] a99 = {45,46,47,48,49,50};
	private int[] a80 = {51,52,53,54,55,56};
	private int[] a132 = a13;
	private int a379 = 13;
	private int a312 = 6;
	private int a381 = 9;
	private int[] a336 = {16,17,18,19,20,21};
	private int[] a265 = {22,23,24,25,26,27};
	private int[] a328 = {28,29,30,31,32,33};
	private int[] a237 = a265;
	private int a64 = 12;
	private int[] a92 = {76,77,78,79,80,81};
	private int[] a112 = {82,83,84,85,86,87};
	private int[] a57 = {88,89,90,91,92,93};
	private int[] a142 = a57;
	private int[] a229 = {5,6,7,8,9,10,11,12};
	private int a353 = 2;
	private int[] a3 = {1,2,3,4,5,6,7,8};
	private int[] a160 = {46,47,48,49,50,51};
	private int[] a165 = {52,53,54,55,56,57};
	private int[] a87 = {58,59,60,61,62,63};
	private int[] a130 = a160;
	private int a104 = 8;
	private int a128 = 4;
	private int a261 = 6;
	private String a302 = "g";
	private int[] a245 = {6,7,8,9,10,11,12,13};
	private int a212 = 10;
	private int a88 = 246;
	private int a27 = 300;
	private int a103 = 12;
	private int a54 = -80;
	private int[] a218 = {8,9,10,11,12,13,14,15};
	private int a309 = 13;
	private int a360 = 9;
	private String a283 = "f";
	private int a249 = 9;
	private int a136 = 6;
	private int a390 = 250;
	private int a154 = 0;
	private int a71 = 1;
	private int a157 = 1;
	private int a187 = 1;
	private int a192 = 1;
	private int a59 = 1;
	private int a35 = 1;

	private void errorCheck() {
	    if(((a27 <=  28 && (a24 == 10)) && a146 == a3[3])){
	    	cf = false;
	    	Errors.__VERIFIER_error(0);
	    }
	    if((((a113.equals("g")) && (a109 == 2)) && a146 == a3[5])){
	    	cf = false;
	    	Errors.__VERIFIER_error(1);
	    }
	    if(((a180 <=  144 && (a136 == 6)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(2);
	    }
	    if(((((134 < a54) && (227 >= a54)) && (a15 == 11)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(3);
	    }
	    if((((18 == a61[5]) && (91 == a76[3])) && a146 == a3[6])){
	    	cf = false;
	    	Errors.__VERIFIER_error(4);
	    }
	    if((((a316.equals("f")) && (a24 == 6)) && a146 == a3[3])){
	    	cf = false;
	    	Errors.__VERIFIER_error(5);
	    }
	    if((((a325.equals("h")) && (a116.equals("h"))) && a146 == a3[4])){
	    	cf = false;
	    	Errors.__VERIFIER_error(6);
	    }
	    if((((a177 == 4) && (a15 == 8)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(7);
	    }
	    if(((115 < a193 && (104 == a76[4])) && a146 == a3[6])){
	    	cf = false;
	    	Errors.__VERIFIER_error(8);
	    }
	    if(((a50 == a0[5] && (a24 == 8)) && a146 == a3[3])){
	    	cf = false;
	    	Errors.__VERIFIER_error(9);
	    }
	    if((((a249 == 6) && (a136 == 3)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(10);
	    }
	    if((((a338 == 5) && (96 == a76[2])) && a146 == a3[6])){
	    	cf = false;
	    	Errors.__VERIFIER_error(11);
	    }
	    if(((a129 <=  21 && (a116.equals("e"))) && a146 == a3[4])){
	    	cf = false;
	    	Errors.__VERIFIER_error(12);
	    }
	    if((((a128 == 9) && (a116.equals("f"))) && a146 == a3[4])){
	    	cf = false;
	    	Errors.__VERIFIER_error(13);
	    }
	    if((((a189.equals("f")) && (a17.equals("h"))) && a146 == a3[0])){
	    	cf = false;
	    	Errors.__VERIFIER_error(14);
	    }
	    if((((a309 == 8) && (a136 == 7)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(15);
	    }
	    if((((45 == a152[4]) && (a17.equals("f"))) && a146 == a3[0])){
	    	cf = false;
	    	Errors.__VERIFIER_error(16);
	    }
	    if((((a309 == 10) && (a109 == 6)) && a146 == a3[5])){
	    	cf = false;
	    	Errors.__VERIFIER_error(17);
	    }
	    if(((a64 == a67[7] && (a15 == 9)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(18);
	    }
	    if((((a190.equals("e")) && (a136 == 9)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(19);
	    }
	    if(((a104 == a148[4] && (a116.equals("g"))) && a146 == a3[4])){
	    	cf = false;
	    	Errors.__VERIFIER_error(20);
	    }
	    if((((a133.equals("h")) && ((210 < a56) && (352 >= a56))) && a146 == a3[1])){
	    	cf = false;
	    	Errors.__VERIFIER_error(21);
	    }
	    if(((a104 == a148[6] && (a116.equals("g"))) && a146 == a3[4])){
	    	cf = false;
	    	Errors.__VERIFIER_error(22);
	    }
	    if((((58 == a130[0]) && (a136 == 5)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(23);
	    }
	    if((((a379 == 8) && (a15 == 14)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(24);
	    }
	    if((((a177 == 2) && (a15 == 8)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(25);
	    }
	    if(((((-114 < a1) && (-60 >= a1)) && (a24 == 11)) && a146 == a3[3])){
	    	cf = false;
	    	Errors.__VERIFIER_error(26);
	    }
	    if((((a133.equals("g")) && ((210 < a56) && (352 >= a56))) && a146 == a3[1])){
	    	cf = false;
	    	Errors.__VERIFIER_error(27);
	    }
	    if((((56 == a132[5]) && (a109 == 7)) && a146 == a3[5])){
	    	cf = false;
	    	Errors.__VERIFIER_error(28);
	    }
	    if(((a64 == a67[4] && (a15 == 9)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(29);
	    }
	    if(((((105 < a19) && (289 >= a19)) && (a15 == 13)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(30);
	    }
	    if(((((-80 < a193) && (115 >= a193)) && (104 == a76[4])) && a146 == a3[6])){
	    	cf = false;
	    	Errors.__VERIFIER_error(31);
	    }
	    if(((((49 < a156) && (158 >= a156)) && (a109 == 3)) && a146 == a3[5])){
	    	cf = false;
	    	Errors.__VERIFIER_error(32);
	    }
	    if(((158 < a156 && (a109 == 3)) && a146 == a3[5])){
	    	cf = false;
	    	Errors.__VERIFIER_error(33);
	    }
	    if((((a309 == 13) && (a109 == 6)) && a146 == a3[5])){
	    	cf = false;
	    	Errors.__VERIFIER_error(34);
	    }
	    if((((25 == a61[0]) && (91 == a76[3])) && a146 == a3[6])){
	    	cf = false;
	    	Errors.__VERIFIER_error(35);
	    }
	    if(((a104 == a148[1] && (a116.equals("g"))) && a146 == a3[4])){
	    	cf = false;
	    	Errors.__VERIFIER_error(36);
	    }
	    if((((23 == a61[4]) && (91 == a76[3])) && a146 == a3[6])){
	    	cf = false;
	    	Errors.__VERIFIER_error(37);
	    }
	    if((((a379 == 6) && (a15 == 14)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(38);
	    }
	    if(((a64 == a67[5] && (a15 == 9)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(39);
	    }
	    if((((a302.equals("h")) && (a17.equals("i"))) && a146 == a3[0])){
	    	cf = false;
	    	Errors.__VERIFIER_error(40);
	    }
	    if((((a177 == 5) && (a15 == 8)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(41);
	    }
	    if((((a309 == 15) && (a136 == 7)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(42);
	    }
	    if(((((-73 < a162) && (42 >= a162)) && (a24 == 7)) && a146 == a3[3])){
	    	cf = false;
	    	Errors.__VERIFIER_error(43);
	    }
	    if((((a30 == 12) && (a24 == 9)) && a146 == a3[3])){
	    	cf = false;
	    	Errors.__VERIFIER_error(44);
	    }
	    if((((a338 == 8) && (a15 == 7)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(45);
	    }
	    if((((a190.equals("f")) && (a136 == 9)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(46);
	    }
	    if(((((-10 < a156) && (49 >= a156)) && (a109 == 3)) && a146 == a3[5])){
	    	cf = false;
	    	Errors.__VERIFIER_error(47);
	    }
	    if(((a104 == a148[2] && (a116.equals("g"))) && a146 == a3[4])){
	    	cf = false;
	    	Errors.__VERIFIER_error(48);
	    }
	    if((((a189.equals("i")) && (a17.equals("h"))) && a146 == a3[0])){
	    	cf = false;
	    	Errors.__VERIFIER_error(49);
	    }
	    if(((a1 <=  -194 && (a24 == 11)) && a146 == a3[3])){
	    	cf = false;
	    	Errors.__VERIFIER_error(50);
	    }
	    if((((a249 == 10) && (a136 == 3)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(51);
	    }
	    if((((a155.equals("f")) && (a109 == 5)) && a146 == a3[5])){
	    	cf = false;
	    	Errors.__VERIFIER_error(52);
	    }
	    if(((((-79 < a54) && (134 >= a54)) && (a15 == 11)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(53);
	    }
	    if((((a103 == 6) && (a24 == 12)) && a146 == a3[3])){
	    	cf = false;
	    	Errors.__VERIFIER_error(54);
	    }
	    if((((a325.equals("e")) && (a116.equals("h"))) && a146 == a3[4])){
	    	cf = false;
	    	Errors.__VERIFIER_error(55);
	    }
	    if((((a79.equals("g")) && (a24 == 13)) && a146 == a3[3])){
	    	cf = false;
	    	Errors.__VERIFIER_error(56);
	    }
	    if((((a338 == 6) && (a15 == 7)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(57);
	    }
	    if(((a127 == a29[7] && ((44 < a56) && (210 >= a56))) && a146 == a3[1])){
	    	cf = false;
	    	Errors.__VERIFIER_error(58);
	    }
	    if(((a104 == a148[5] && (a116.equals("g"))) && a146 == a3[4])){
	    	cf = false;
	    	Errors.__VERIFIER_error(59);
	    }
	    if((((75 == a33[5]) && (a17.equals("e"))) && a146 == a3[0])){
	    	cf = false;
	    	Errors.__VERIFIER_error(60);
	    }
	    if((((a325.equals("g")) && (a116.equals("h"))) && a146 == a3[4])){
	    	cf = false;
	    	Errors.__VERIFIER_error(61);
	    }
	    if(((a127 == a29[0] && ((44 < a56) && (210 >= a56))) && a146 == a3[1])){
	    	cf = false;
	    	Errors.__VERIFIER_error(62);
	    }
	    if((((a379 == 12) && (a15 == 14)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(63);
	    }
	    if(((a56 <=  44 && (a116.equals("i"))) && a146 == a3[4])){
	    	cf = false;
	    	Errors.__VERIFIER_error(64);
	    }
	    if(((308 < a27 && (a24 == 10)) && a146 == a3[3])){
	    	cf = false;
	    	Errors.__VERIFIER_error(65);
	    }
	    if((((65 == a82[5]) && (a109 == 4)) && a146 == a3[5])){
	    	cf = false;
	    	Errors.__VERIFIER_error(66);
	    }
	    if((((a101.equals("g")) && 352 < a56) && a146 == a3[1])){
	    	cf = false;
	    	Errors.__VERIFIER_error(67);
	    }
	    if(((455 < a180 && (a136 == 6)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(68);
	    }
	    if((((a177 == 7) && (a15 == 8)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(69);
	    }
	    if((((a338 == 5) && (a15 == 7)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(70);
	    }
	    if((((a379 == 7) && (a15 == 14)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(71);
	    }
	    if((((a177 == 1) && (a15 == 8)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(72);
	    }
	    if((((51 == a130[5]) && (a136 == 5)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(73);
	    }
	    if((((a113.equals("e")) && (a109 == 2)) && a146 == a3[5])){
	    	cf = false;
	    	Errors.__VERIFIER_error(74);
	    }
	    if(((a104 == a148[3] && (a116.equals("g"))) && a146 == a3[4])){
	    	cf = false;
	    	Errors.__VERIFIER_error(75);
	    }
	    if((((71 == a82[5]) && (a109 == 4)) && a146 == a3[5])){
	    	cf = false;
	    	Errors.__VERIFIER_error(76);
	    }
	    if(((a1 <=  -194 && (a109 == 1)) && a146 == a3[5])){
	    	cf = false;
	    	Errors.__VERIFIER_error(77);
	    }
	    if((((a309 == 9) && (a109 == 6)) && a146 == a3[5])){
	    	cf = false;
	    	Errors.__VERIFIER_error(78);
	    }
	    if(((a127 == a29[1] && ((44 < a56) && (210 >= a56))) && a146 == a3[1])){
	    	cf = false;
	    	Errors.__VERIFIER_error(79);
	    }
	    if((((a101.equals("i")) && 352 < a56) && a146 == a3[1])){
	    	cf = false;
	    	Errors.__VERIFIER_error(80);
	    }
	    if(((352 < a56 && (a116.equals("i"))) && a146 == a3[4])){
	    	cf = false;
	    	Errors.__VERIFIER_error(81);
	    }
	    if(((a117 == a178[3] && (a15 == 12)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(82);
	    }
	    if((((a249 == 5) && (a136 == 3)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(83);
	    }
	    if(((289 < a19 && (a15 == 13)) && a146 == a3[7])){
	    	cf = false;
	    	Errors.__VERIFIER_error(84);
	    }
	    if((((a167 == 5) && (a136 == 8)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(85);
	    }
	    if((((a155.equals("i")) && (a109 == 5)) && a146 == a3[5])){
	    	cf = false;
	    	Errors.__VERIFIER_error(86);
	    }
	    if((((a167 == 4) && (a136 == 8)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(87);
	    }
	    if(((a127 == a29[4] && ((44 < a56) && (210 >= a56))) && a146 == a3[1])){
	    	cf = false;
	    	Errors.__VERIFIER_error(88);
	    }
	    if((((a128 == 2) && (a116.equals("f"))) && a146 == a3[4])){
	    	cf = false;
	    	Errors.__VERIFIER_error(89);
	    }
	    if((((a167 == 3) && (a136 == 8)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(90);
	    }
	    if((((a190.equals("h")) && (a136 == 9)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(91);
	    }
	    if((((a30 == 13) && (a24 == 9)) && a146 == a3[3])){
	    	cf = false;
	    	Errors.__VERIFIER_error(92);
	    }
	    if(((244 < a88 && a56 <=  44) && a146 == a3[1])){
	    	cf = false;
	    	Errors.__VERIFIER_error(93);
	    }
	    if((((a95.equals("f")) && (a109 == 8)) && a146 == a3[5])){
	    	cf = false;
	    	Errors.__VERIFIER_error(94);
	    }
	    if((((a30 == 15) && (a24 == 9)) && a146 == a3[3])){
	    	cf = false;
	    	Errors.__VERIFIER_error(95);
	    }
	    if((((a167 == 6) && (a136 == 8)) && a146 == a3[2])){
	    	cf = false;
	    	Errors.__VERIFIER_error(96);
	    }
	    if((((a128 == 3) && (a116.equals("f"))) && a146 == a3[4])){
	    	cf = false;
	    	Errors.__VERIFIER_error(97);
	    }
	    if((((a103 == 7) && (a24 == 12)) && a146 == a3[3])){
	    	cf = false;
	    	Errors.__VERIFIER_error(98);
	    }
	    if((((61 == a33[3]) && (a17.equals("e"))) && a146 == a3[0])){
	    	cf = false;
	    	Errors.__VERIFIER_error(99);
	    }
	}private  void calculateOutputm51(String input) {
    if((((((a201 == 6) && (a146 == a3[0] && (((((a17.equals("e")) && cf) && input.equals(inputs[9])) && a390 <=  75) && a391 == a392[0]))) && (64 == a33[0])) && a244 <=  94) && (a279 <=  105 && (a278.equals("e"))))) {
    	cf = false;
    	a235 = a240;
    	a400 = (((((a400 % 53) + -5) * 5) % 53) + -3);
    	a246 = a332;
    	a261 = a229[4];
    	a24 = (a201 + 5);
    	a365 = "g";
    	a337 = 11;
    	a353 = a343[3];
    	a312 = a382[4];
    	a291 = a307[3];
    	a244 = ((((a244 / 5) % 57) - -198) + 0);
    	a279 = ((((a279 * 1) + 12543) % 15052) + -14946);
    	a146 = a3[((a263 * a215) - 77)];
    	a349 = ((((a349 * 1) % 72) + 317) + -2);
    	a333 = "e";
    	a237 = a336;
    	a263 = 12;
    	a360 = 10;
    	a1 = ((((79 * 10) / -11) / 5) - 72); 
    	output = "U";
    } 
    if((((a360 == 8) && ((a146 == a3[0] && a400 <=  -103) && (a212 == 9))) && ((a209.equals("e")) && (((90 == a399[4]) && (((a17.equals("e")) && ((64 == a33[0]) && cf)) && input.equals(inputs[7]))) && (a283.equals("e")))))) {
    	cf = false;
    	if((a340 == a245[3] || (a116.equals("f")))) {
    	a15 = (a360 - -3);
    	a146 = a3[(a215 + -3)];
    	a54 = (((76 - 6449) + 6343) - -91); 
    	}else {
    	a146 = a3[((a201 + a373) + -3)];
    	a109 = (a373 * a373);
    	a82 = a86;
    	}output = "Z";
    } 
    if((((((((41 == a235[0]) && (a283.equals("e"))) && (a17.equals("e"))) && (64 == a33[0])) && (a333.equals("e"))) && (a337 == 6)) && ((((cf && a146 == a3[0]) && input.equals(inputs[8])) && (20 == a237[4])) && (56 == a320[1])))) {
    	cf = false;
    	a33 = a84; 
    	output = "W";
    } 
    if(((((a17.equals("e")) && ((cf && (64 == a33[0])) && a146 == a3[0])) && a244 <=  94) && (a279 <=  105 && ((a391 == a392[0] && (a312 == a382[0] && (input.equals(inputs[6]) && (a373 == 2)))) && a349 <=  23)))) {
    	cf = false;
    	a309 = (a360 - -2);
    	a109 = ((a263 / a337) - -5);
    	a146 = a3[((a263 - a201) - -2)]; 
    	output = "X";
    } 
    if((((a212 == 9) && ((a283.equals("e")) && (((input.equals(inputs[4]) && (a146 == a3[0] && cf)) && (64 == a33[0])) && (a17.equals("e"))))) && (a280 <=  156 && ((a261 == a229[0] && (a333.equals("e"))) && (85 == a377[3]))))) {
    	cf = false;
    	a381 = a218[7];
    	a320 = a299;
    	a353 = a343[6];
    	a377 = a366;
    	a261 = a229[7];
    	a291 = a307[7];
    	a337 = 13;
    	a136 = a201;
    	a215 = 16;
    	a212 = 16;
    	a391 = a392[7];
    	a209 = "f";
    	a279 = (((((a279 % 14833) - -15166) / 5) - 3960) + 21172);
    	a266 = a211;
    	a310 = "f";
    	a146 = a3[(a136 + -4)];
    	a246 = a296;
    	a285 = "f";
    	a201 = 9;
    	a237 = a265;
    	a263 = 13;
    	a373 = 8;
    	a360 = 13;
    	a235 = a240;
    	a295 = ((((a295 % 62) + 7) / 5) * 5);
    	a312 = a382[3];
    	a283 = "e";
    	a349 = ((((a349 % 15011) + -14987) + -1) - 2);
    	a390 = ((((a390 + 0) / 5) % 87) - -163);
    	a280 = (((a280 / 5) - 19146) / 5);
    	a333 = "e";
    	a180 = (((((3 * 5) * 229) / 10) * 10) / 9); 
    	output = "Z";
    } 
    if((((((cf && (64 == a33[0])) && (a17.equals("e"))) && (41 == a235[0])) && a381 == a218[0]) && (a390 <=  75 && ((82 == a246[2]) && ((input.equals(inputs[2]) && ((a360 == 8) && a146 == a3[0])) && (90 == a399[4])))))) {
    	cf = false;
    	a116 = "h";
    	a325 = "e";
    	a146 = a3[((a337 + a337) - 8)]; 
    	output = "S";
    } 
    if(((input.equals(inputs[1]) && (((a201 == 6) && (a295 <=  -110 && (a360 == 8))) && (41 == a235[0]))) && (a353 == a343[0] && ((((64 == a33[0]) && ((a17.equals("e")) && cf)) && a146 == a3[0]) && a291 == a307[0])))) {
    	cf = false;
    	a177 = ((a263 + a212) - 13);
    	a15 = ((a215 * a215) - 92);
    	a146 = a3[(a215 - 3)]; 
    	output = "U";
    } 
    if((((41 == a235[0]) && (64 == a33[0])) && (a291 == a307[0] && ((a17.equals("e")) && (((a209.equals("e")) && ((a373 == 2) && (a295 <=  -110 && (input.equals(inputs[3]) && (a146 == a3[0] && cf))))) && a390 <=  75))))) {
    	cf = false;
    	a337 = 11;
    	a246 = a332;
    	a360 = 15;
    	a285 = "i";
    	a349 = (((((a349 % 72) + 316) + 5184) + 12537) - 17720);
    	a365 = "i";
    	a266 = a221;
    	a310 = "i";
    	a146 = a3[(a263 - 6)];
    	a399 = a344;
    	a283 = "i";
    	a373 = 7;
    	a381 = a218[5];
    	a353 = a343[4];
    	a278 = "i";
    	a390 = (((a390 / 5) - -3222) - -4702);
    	a201 = 11;
    	a312 = a382[0];
    	a136 = (a215 + -6);
    	a237 = a336;
    	a391 = a392[4];
    	a142 = a92;
    	a377 = a204;
    	a235 = a240;
    	a279 = ((((((a279 % 57) + 163) + 7635) / 5) * 1) / 10);
    	a261 = a229[1];
    	a280 = (((a280 / 5) + 22767) - 1840);
    	a340 = a245[6];
    	a291 = a307[1];
    	a215 = 10;
    	a263 = 11; 
    	output = "W";
    } 
    if((((a337 == 6) && ((a365.equals("e")) && ((a209.equals("e")) && ((a17.equals("e")) && (((64 == a33[0]) && cf) && a146 == a3[0]))))) && ((input.equals(inputs[5]) && ((56 == a320[1]) && (a285.equals("e")))) && a279 <=  105))) {
    	cf = false;
    	a64 = a67[(a337 - -1)];
    	a15 = ((a201 + a215) - 7);
    	a146 = a3[((a373 * a215) + -13)]; 
    	output = "U";
    } 
    if((((a263 == 8) && ((a201 == 6) && ((64 == a33[0]) && ((a333.equals("e")) && (a209.equals("e")))))) && (a340 == a245[0] && (a146 == a3[0] && (a391 == a392[0] && ((cf && (a17.equals("e"))) && input.equals(inputs[0]))))))) {
    	cf = false;
    	if((((64 == a33[0]) && (a316.equals("g"))) && ((16 < a295) && (208 >= a295)))) {
    	a320 = a299;
    	a237 = a336;
    	a146 = a3[(a263 + -4)];
    	a283 = "e";
    	a266 = a221;
    	a244 = ((((a244 + 26847) % 14871) - -15127) + 0);
    	a333 = "h";
    	a377 = a281;
    	a128 = (a201 - 2);
    	a360 = 12;
    	a312 = a382[0];
    	a353 = a343[7];
    	a215 = 13;
    	a212 = 12;
    	a291 = a307[4];
    	a365 = "i";
    	a400 = ((((a400 % 53) - -24) - -7) - 15);
    	a399 = a269;
    	a279 = ((((a279 % 14833) - -15166) - -1) * 1);
    	a373 = 9;
    	a209 = "i";
    	a337 = 6;
    	a381 = a218[5];
    	a201 = 11;
    	a235 = a324;
    	a246 = a332;
    	a261 = a229[4];
    	a349 = ((((a349 + 15560) % 14805) + 15194) + 1);
    	a390 = (((a390 * 1) * 1) + 0);
    	a280 = ((((a280 % 14817) - -15181) * 1) + 1);
    	a295 = (((((a295 - -10856) / 5) * 5) % 95) - -111);
    	a340 = a245[2];
    	a285 = "h";
    	a278 = "h";
    	a391 = a392[6];
    	a116 = "f";
    	a263 = 10; 
    	}else {
    	a33 = a124;
    	}output = "Z";
    } 
}
private  void calculateOutputm1(String input) {
    if(((((a337 == 6) && ((a312 == a382[0] && (a360 == 8)) && (a365.equals("e")))) && (a215 == 10)) && ((20 == a237[4]) && ((64 == a33[0]) && cf)))) {
    	calculateOutputm51(input);
    } 
}
private  void calculateOutputm54(String input) {
    if(((a146 == a3[0] && (a312 == a382[0] && (input.equals(inputs[4]) && (((48 == a152[1]) && ((a17.equals("f")) && cf)) && a349 <=  23)))) && ((a360 == 8) && (a279 <=  105 && ((a278.equals("e")) && a400 <=  -103))))) {
    	cf = false;
    	if(((((a190.equals("i")) && !(a283.equals("h"))) && !(56 == a320[1])) || !(a261 == a229[2]))) {
    	a373 = 6;
    	a244 = (((((a244 - -1686) + 4298) * 1) % 14871) + 15127);
    	a399 = a269;
    	a333 = "h";
    	a280 = ((((a280 * 1) % 15078) + -14921) + -1);
    	a353 = a343[3];
    	a246 = a358;
    	a283 = "h";
    	a17 = "g";
    	a282 = a205; 
    	}else {
    	a373 = 6;
    	a291 = a307[0];
    	a109 = (a263 + -5);
    	a263 = 15;
    	a261 = a229[4];
    	a340 = a245[3];
    	a235 = a374;
    	a146 = a3[((a360 / a212) - -5)];
    	a295 = ((((a295 % 14895) + 15103) * 1) + 5315);
    	a285 = "h";
    	a279 = (((a279 / 5) + 17977) * 1);
    	a365 = "g";
    	a360 = 14;
    	a333 = "e";
    	a312 = a382[7];
    	a201 = 13;
    	a156 = (((((10 * 10) / 2) + 0) * 10) / 9);
    	}output = "U";
    } 
    if((((a353 == a343[0] && (a381 == a218[0] && ((48 == a152[1]) && ((input.equals(inputs[0]) && (cf && (a17.equals("f")))) && (a201 == 6))))) && a146 == a3[0]) && ((a279 <=  105 && a391 == a392[0]) && (a333.equals("e"))))) {
    	cf = false;
    	a295 = ((((a295 * 1) * 1) % 14945) - 110);
    	a400 = (((((a400 % 53) - -24) * 5) % 53) - 21);
    	a285 = "e";
    	a399 = a344;
    	a310 = "i";
    	a146 = a3[(a263 - 5)];
    	a373 = 8;
    	a24 = ((a212 * a360) + -62);
    	a349 = ((((a349 + 26344) * 1) % 72) + 315);
    	a391 = a392[2];
    	a27 = ((((((a244 * a244) % 14999) % 14845) + 15153) * 1) * 1);
    	a337 = 6;
    	a266 = a221;
    	a279 = ((((a279 % 55) + 276) * 5) / 5);
    	a365 = "i";
    	a235 = a374;
    	a244 = ((((a244 % 14871) - -15127) - -2) * 1); 
    	output = "S";
    } 
    if(((a349 <=  23 && ((56 == a320[1]) && (a365.equals("e")))) && (((a263 == 8) && (((((cf && (48 == a152[1])) && input.equals(inputs[1])) && (a17.equals("f"))) && a390 <=  75) && a146 == a3[0])) && (90 == a399[4])))) {
    	cf = false;
    	a56 = (((((a390 * a244) % 14999) + 6363) + -21355) + -3);
    	a88 = (((((((a244 * a56) % 14999) % 14877) + 15121) / 5) / 5) + 2851);
    	a146 = a3[(a201 + -5)]; 
    	output = "S";
    } 
    if((((((a146 == a3[0] && ((48 == a152[1]) && cf)) && a291 == a307[0]) && (a209.equals("e"))) && a349 <=  23) && (((input.equals(inputs[6]) && ((a17.equals("f")) && (a365.equals("e")))) && a340 == a245[0]) && (a263 == 8)))) {
    	cf = false;
    	a146 = a3[(a263 + -6)];
    	a280 = ((((a280 % 15078) + -14921) + -2) * 1);
    	a399 = a251;
    	a283 = "h";
    	a278 = "i";
    	a365 = "i";
    	a244 = ((((a244 % 14871) - -15127) + 0) * 1);
    	a263 = 11;
    	a285 = "e";
    	a261 = a229[3];
    	a136 = ((a337 * a360) - 42);
    	a266 = a221;
    	a215 = 17;
    	a310 = "e";
    	a381 = a218[3];
    	a337 = 6;
    	a212 = 16;
    	a235 = a374;
    	a400 = (((((a400 % 13) + -82) * 5) % 13) - 87);
    	a246 = a358;
    	a312 = a382[0];
    	a349 = ((((a349 % 14805) - -15194) + 0) - -1);
    	a291 = a307[3];
    	a201 = 9;
    	a180 = ((((((((a390 * a390) % 14999) % 61) - -206) + -1) * 5) % 61) - -151);
    	a209 = "f";
    	a279 = ((((a279 % 14833) + 15166) * 1) - -1);
    	a377 = a366;
    	a340 = a245[6];
    	a237 = a265;
    	a391 = a392[4];
    	a320 = a217;
    	a373 = 8;
    	a295 = ((((a295 * 1) + 15162) % 14945) + -15054);
    	a333 = "f";
    	a353 = a343[4];
    	a390 = ((((a390 % 14836) - -15162) / 5) + 20386);
    	a360 = 8; 
    	output = "U";
    } 
    if((((56 == a320[1]) && ((input.equals(inputs[8]) && ((a17.equals("f")) && ((48 == a152[1]) && cf))) && (41 == a235[0]))) && (((a209.equals("e")) && (((a212 == 9) && a146 == a3[0]) && (a285.equals("e")))) && (a201 == 6)))) {
    	cf = false;
    	if((((48 == a132[3]) && (a340 == 6)) || !(a146 == a3[5]))) {
    	a56 = ((((((a295 * a244) % 14999) % 70) + 281) - -2) * 1);
    	a133 = "g";
    	a146 = a3[(a337 + -5)]; 
    	}else {
    	a285 = "e";
    	a235 = a374;
    	a399 = a344;
    	a349 = ((((a349 % 72) - -316) - 1) + 0);
    	a337 = 9;
    	a295 = (((((a295 % 14945) + -110) * 1) * 10) / 9);
    	a146 = a3[(a360 - 5)];
    	a400 = (((a400 / 5) - 15578) * 1);
    	a391 = a392[2];
    	a266 = a221;
    	a310 = "g";
    	a279 = (((((a279 + 8635) - -7045) - -6408) % 15052) + -14946);
    	a24 = 10;
    	a373 = 2;
    	a365 = "g";
    	a27 = (((((((a244 * a244) % 14999) % 14845) + 15153) * 1) / 5) - -15915);
    	a244 = (((((a244 * 1) + 6542) * 1) % 15047) - 14952);
    	}output = "S";
    } 
    if((((a360 == 8) && ((56 == a320[1]) && (a280 <=  156 && (((a146 == a3[0] && (cf && input.equals(inputs[2]))) && (a17.equals("f"))) && a390 <=  75)))) && (a340 == a245[0] && ((48 == a152[1]) && (a215 == 10))))) {
    	cf = false;
    	if(((((221 < a279) && (333 >= a279)) || a291 == a307[0]) || (18 == a61[5]))) {
    	a15 = ((a373 + a201) + 1);
    	a64 = a67[(a360 - 4)];
    	a146 = a3[((a373 * a263) + -9)]; 
    	}else {
    	a177 = (a201 + -2);
    	a15 = (a337 - -2);
    	a146 = a3[(a360 - 1)];
    	}output = "Z";
    } 
    if((((a340 == a245[0] && ((a310.equals("e")) && (((48 == a152[1]) && cf) && a146 == a3[0]))) && (a285.equals("e"))) && (a280 <=  156 && (((a215 == 10) && ((a17.equals("f")) && (a283.equals("e")))) && input.equals(inputs[3]))))) {
    	a35 += (a35 + 20) > a35 ? 1 : 0;
    	cf = false;
    	a360 = 11;
    	a136 = ((a212 * a201) - 46);
    	a283 = "f";
    	a244 = ((((a244 - 0) % 14871) + 15127) + 2);
    	a285 = "h";
    	a391 = a392[1];
    	a279 = ((((a279 + 0) % 14833) - -15166) * 1);
    	a399 = a251;
    	a291 = a307[3];
    	a146 = a3[(a136 + -6)];
    	a246 = a358;
    	a340 = a245[0];
    	a381 = a218[6];
    	a365 = "h";
    	a337 = 10;
    	a373 = 8;
    	a349 = ((((a349 % 72) + 315) + 15185) + -15184);
    	a390 = (((a390 / 5) - 19434) * 1);
    	a235 = a240;
    	a261 = a229[1];
    	a377 = a366;
    	a400 = ((((a400 % 14948) - 103) - 14255) * 1);
    	a263 = 9;
    	a280 = (((a280 * 1) / 5) + 10136);
    	a278 = "e";
    	a266 = a211;
    	a215 = 10;
    	a237 = a265;
    	a320 = a372;
    	a295 = (((((a295 % 62) + -14) - 22) - 13975) + 14022);
    	a209 = "e";
    	a201 = 7;
    	a333 = "g";
    	a312 = a382[4];
    	a353 = a343[7];
    	a310 = "i";
    	a167 = (a212 + -7);
    	a212 = 9; 
    	output = "S";
    } 
    if(((a244 <=  94 && ((18 == a266[5]) && ((((a333.equals("e")) && (48 == a152[1])) && a146 == a3[0]) && (56 == a320[1])))) && ((((a17.equals("f")) && (cf && input.equals(inputs[5]))) && a312 == a382[0]) && (90 == a399[4])))) {
    	a59 += (a59 + 20) > a59 ? 2 : 0;
    	cf = false;
    	a109 = (a201 + -3);
    	a156 = ((((((a390 * a280) % 14999) / 5) % 29) - -20) / 5);
    	a146 = a3[(a373 + 3)]; 
    	output = "Z";
    } 
    if(((((a209.equals("e")) && ((56 == a320[1]) && (((a261 == a229[0] && a146 == a3[0]) && a349 <=  23) && (48 == a152[1])))) && (18 == a266[5])) && ((a201 == 6) && ((input.equals(inputs[9]) && cf) && (a17.equals("f")))))) {
    	a35 -= (a35 - 20) < a35 ? 1 : 0;
    	cf = false;
    	a101 = "i";
    	a146 = a3[(a373 - 1)];
    	a56 = ((((75 * 5) + -4685) * 5) + 23353); 
    	output = "Z";
    } 
    if((((((20 == a237[4]) && ((a201 == 6) && (((48 == a152[1]) && (a146 == a3[0] && cf)) && a261 == a229[0]))) && (a17.equals("f"))) && (a212 == 9)) && (((a285.equals("e")) && input.equals(inputs[7])) && (a310.equals("e"))))) {
    	cf = false;
    	a353 = a343[6];
    	a337 = 10;
    	a291 = a307[5];
    	a377 = a204;
    	a381 = a218[4];
    	a237 = a328;
    	a209 = "g";
    	a365 = "h";
    	a390 = (((((a390 / 5) % 37) + 288) / 5) + 253);
    	a24 = (a263 - -3);
    	a146 = a3[(a360 - 5)];
    	a285 = "h";
    	a263 = 13;
    	a391 = a392[0];
    	a261 = a229[2];
    	a340 = a245[6];
    	a399 = a269;
    	a212 = 16;
    	a310 = "e";
    	a279 = (((((a279 * 1) * 1) * 1) % 55) - -278);
    	a333 = "e";
    	a320 = a217;
    	a312 = a382[4];
    	a215 = 14;
    	a278 = "h";
    	a400 = (((((a400 + 18093) - -2443) * 1) % 53) + -21);
    	a349 = ((((((a349 * 1) % 72) + 317) * 5) % 72) + 307);
    	a201 = 8;
    	a235 = a374;
    	a373 = 8;
    	a266 = a221;
    	a360 = 10;
    	a280 = ((((a280 % 15078) - 14921) + -1) - 1);
    	a1 = (((((((a244 * a244) % 14999) % 39) + -153) + -27388) + 3089) + 24298); 
    	output = "S";
    } 
}
private  void calculateOutputm55(String input) {
    if(((a391 == a392[0] && (((input.equals(inputs[0]) && (cf && (56 == a152[3]))) && a146 == a3[0]) && (82 == a246[2]))) && (a291 == a307[0] && (a279 <=  105 && (((41 == a235[0]) && (a17.equals("f"))) && (20 == a237[4])))))) {
    	cf = false;
    	a113 = "e";
    	a246 = a358;
    	a109 = (a263 - 6);
    	a291 = a307[(a109 + -1)];
    	a215 = (a263 + 3);
    	a261 = a229[((a212 + a373) + -10)];
    	a201 = (a215 - 4);
    	a146 = a3[(a360 - 3)];
    	a333 = "f";
    	a391 = a392[((a360 - a263) + 1)];
    	a360 = (a201 - -2); 
    	output = "W";
    } 
    if((((a278.equals("e")) && ((a333.equals("e")) && (a212 == 9))) && ((a312 == a382[0] && ((18 == a266[5]) && ((56 == a152[3]) && ((a17.equals("f")) && (a146 == a3[0] && (input.equals(inputs[6]) && cf)))))) && (a373 == 2)))) {
    	cf = false;
    	a237 = a265;
    	a235 = a324;
    	a146 = a3[(a201 + -3)];
    	a291 = a307[(a212 + -8)];
    	a278 = "e";
    	a349 = ((((((a295 * a280) % 14999) + -5681) % 109) - -154) - -71);
    	a24 = ((a215 * a212) - 81);
    	a279 = ((((((a279 * a349) % 14999) - 8239) + 8931) % 57) - -163);
    	a377 = a204;
    	a215 = (a337 - -4);
    	a360 = (a263 + 1);
    	a310 = "e";
    	a391 = a392[(a337 + -6)];
    	a353 = a343[(a337 + -7)];
    	a333 = "f";
    	a390 = (((((a349 * a349) % 14999) - 28556) - 1142) + -84);
    	a201 = (a373 - -5);
    	a381 = a218[((a337 - a373) - 4)];
    	a295 = ((((((((a295 * a400) % 14999) - 21351) % 62) + -3) * 5) % 62) - 17);
    	a30 = (a263 + 1);
    	a261 = a229[((a337 * a263) - 55)];
    	a246 = a358;
    	a263 = a360;
    	a212 = (a337 + 3);
    	a312 = a382[(a337 - 7)];
    	a266 = a211;
    	a373 = (a360 + -7); 
    	output = "X";
    } 
}
private  void calculateOutputm2(String input) {
    if((((20 == a237[4]) && ((56 == a320[1]) && (85 == a377[3]))) && ((a353 == a343[0] && ((cf && (48 == a152[1])) && (a333.equals("e")))) && (a337 == 6)))) {
    	calculateOutputm54(input);
    } 
    if(((a263 == 8) && (a353 == a343[0] && ((a278.equals("e")) && (a349 <=  23 && (a295 <=  -110 && (a261 == a229[0] && ((56 == a152[3]) && cf)))))))) {
    	calculateOutputm55(input);
    } 
}
private  void calculateOutputm56(String input) {
    if((((a310.equals("e")) && ((a263 == 8) && ((41 == a235[0]) && (20 == a237[4])))) && (a279 <=  105 && ((input.equals(inputs[7]) && ((a17.equals("g")) && ((a146 == a3[0] && cf) && (87 == a282[5])))) && a340 == a245[0])))) {
    	cf = false;
    	a235 = a324;
    	a338 = ((a360 / a201) - -6);
    	a391 = a392[(a337 - 5)];
    	a283 = "e";
    	a377 = a366;
    	a15 = a338;
    	a349 = (((((((a349 * a244) % 14999) % 109) - -133) - -1) - -17877) + -17877);
    	a266 = a211;
    	a285 = "f";
    	a146 = a3[(a201 - -1)];
    	a280 = ((((((a390 * a390) % 14999) % 63) + 220) - 1) - -3); 
    	output = "S";
    } 
    if((((input.equals(inputs[2]) && (((a146 == a3[0] && cf) && (87 == a282[5])) && (a337 == 6))) && (56 == a320[1])) && ((a209.equals("e")) && (((85 == a377[3]) && ((a263 == 8) && a381 == a218[0])) && (a17.equals("g")))))) {
    	cf = false;
    	a353 = a343[(a360 + -8)];
    	a399 = a344;
    	a373 = ((a263 / a337) - -1);
    	a333 = "e";
    	a246 = a296;
    	a244 = ((((((a390 * a390) % 14999) * 2) % 15047) - 14952) - 1); 
    	output = "S";
    } 
    if(((a146 == a3[0] && ((a400 <=  -103 && (((a278.equals("e")) && (a337 == 6)) && a391 == a392[0])) && (a215 == 10))) && (input.equals(inputs[3]) && ((((a17.equals("g")) && cf) && (87 == a282[5])) && a279 <=  105)))) {
    	cf = false;
    	a377 = a281;
    	a381 = a218[(a212 + -7)];
    	a146 = a3[((a360 + a263) + -14)];
    	a390 = ((((((a390 * a280) % 14999) / 5) % 37) + 289) - -1);
    	a340 = a245[(a201 + -4)];
    	a136 = (a263 + -5);
    	a249 = (a201 + -1);
    	a266 = a236;
    	a337 = a360;
    	a285 = "g";
    	a263 = ((a249 / a136) - -9);
    	a235 = a374;
    	a279 = (((((((a279 * a400) % 14999) % 55) + 278) / 5) - -16735) + -16531);
    	a349 = ((((((a349 * a295) % 14999) + -330) - 4899) % 72) + 317);
    	a215 = (a360 + 4);
    	a261 = a229[((a136 - a136) + 2)]; 
    	output = "T";
    } 
}
private  void calculateOutputm3(String input) {
    if(((((a365.equals("e")) && (((a263 == 8) && (85 == a377[3])) && a261 == a229[0])) && (a201 == 6)) && ((cf && (87 == a282[5])) && a312 == a382[0]))) {
    	calculateOutputm56(input);
    } 
}
private  void calculateOutputm57(String input) {
    if((((a312 == a382[0] && (((a146 == a3[0] && cf) && input.equals(inputs[1])) && (a189.equals("e")))) && a390 <=  75) && ((a215 == 10) && ((a373 == 2) && (((a17.equals("h")) && (a337 == 6)) && a291 == a307[0]))))) {
    	cf = false;
    	a244 = (((((a244 - -5885) - 4106) * 1) % 15047) - 14952);
    	a295 = ((((a295 % 14895) - -15103) / 5) + 16563);
    	a353 = a343[0];
    	a285 = "h";
    	a279 = (((73 - -26361) * 1) * 1);
    	a338 = (a201 + 5);
    	a266 = a211;
    	a365 = "g";
    	a15 = (a337 - -1);
    	a146 = a3[((a15 * a338) - 70)]; 
    	output = "U";
    } 
    if((((a312 == a382[0] && (((a340 == a245[0] && a291 == a307[0]) && (a373 == 2)) && (90 == a399[4]))) && (a209.equals("e"))) && ((a17.equals("h")) && ((input.equals(inputs[7]) && (cf && (a189.equals("e")))) && a146 == a3[0])))) {
    	cf = false;
    	if(((!(a166 == 13) && ((a263 == 11) && ((a113.equals("g")) || !(a201 == 13)))) && (a373 == 4))) {
    	a189 = "i"; 
    	}else {
    	a365 = "f";
    	a337 = 7;
    	a215 = 14;
    	a390 = ((((a390 % 87) - -164) + 1) + -3);
    	a261 = a229[4];
    	a146 = a3[(a263 + -6)];
    	a381 = a218[4];
    	a235 = a324;
    	a333 = "e";
    	a285 = "f";
    	a136 = (a201 - 1);
    	a295 = (((((a295 / 5) + -18506) * 1) % 62) - -11);
    	a244 = (((((a244 % 23) + 117) - -2) - -28312) + -28313);
    	a266 = a221;
    	a278 = "f";
    	a399 = a344;
    	a130 = a160;
    	}output = "U";
    } 
    if(((a390 <=  75 && ((a373 == 2) && ((a278.equals("e")) && ((41 == a235[0]) && ((a189.equals("e")) && (a310.equals("e"))))))) && ((18 == a266[5]) && ((((a17.equals("h")) && cf) && input.equals(inputs[9])) && a146 == a3[0])))) {
    	cf = false;
    	if((((243 < a349) && (389 >= a349)) || (-60 < a1 && (a17.equals("g"))))) {
    	a116 = "g";
    	a146 = a3[4];
    	a104 = a148[((a337 * a337) - 33)]; 
    	}else {
    	a146 = a3[(a263 + -3)];
    	a109 = (a263 - 4);
    	a82 = a10;
    	}output = "U";
    } 
    if((((((a17.equals("h")) && ((a244 <=  94 && (20 == a237[4])) && (a189.equals("e")))) && a349 <=  23) && a391 == a392[0]) && (((a285.equals("e")) && ((input.equals(inputs[2]) && cf) && a146 == a3[0])) && a312 == a382[0]))) {
    	cf = false;
    	a15 = (a212 + 4);
    	a279 = (((63 + 5146) * 5) + 1945);
    	a146 = a3[(a337 + 1)];
    	a19 = ((((59 * 10) / 2) + 23871) * 1); 
    	output = "V";
    } 
    if((((a285.equals("e")) && ((20 == a237[4]) && ((a189.equals("e")) && (a365.equals("e"))))) && (a340 == a245[0] && (((a17.equals("h")) && ((18 == a266[5]) && (input.equals(inputs[6]) && (cf && a146 == a3[0])))) && (a283.equals("e")))))) {
    	cf = false;
    	if((((a17.equals("i")) && a156 <=  -10) && a261 == a229[6])) {
    	a312 = a382[4];
    	a360 = 15;
    	a373 = 2;
    	a244 = (((((a244 * 1) % 57) - -198) - -19683) - 19682);
    	a333 = "e";
    	a365 = "h";
    	a261 = a229[0];
    	a390 = (((((a390 % 15037) - 14961) - 3) - -11188) - 11186);
    	a391 = a392[3];
    	a146 = a3[((a212 / a201) + 4)];
    	a295 = ((((a295 / 5) * 5) % 14895) + 15103);
    	a399 = a344;
    	a237 = a328;
    	a95 = "i";
    	a340 = a245[6];
    	a263 = 12;
    	a279 = (((((42 - -284) + -85) / 5) * 47) / 10);
    	a291 = a307[3];
    	a283 = "i";
    	a215 = 12;
    	a377 = a281;
    	a235 = a374;
    	a310 = "e";
    	a320 = a217;
    	a246 = a296;
    	a285 = "g";
    	a109 = (a337 - -2);
    	a349 = ((((a349 % 14805) - -15194) + 0) * 1);
    	a209 = "i";
    	a353 = a343[5];
    	a280 = (((((a280 * 1) % 15078) + -14921) - -9420) - 9420);
    	a212 = 9;
    	a400 = ((((a400 % 14948) - 103) * 1) * 1);
    	a266 = a221;
    	a201 = 11;
    	a337 = 8; 
    	}else {
    	a146 = a3[((a373 * a337) + -6)];
    	a76 = a48;
    	a61 = a28;
    	}output = "Z";
    } 
    if(((((a201 == 6) && (a381 == a218[0] && input.equals(inputs[0]))) && (a283.equals("e"))) && (((20 == a237[4]) && ((a278.equals("e")) && (((cf && (a17.equals("h"))) && a146 == a3[0]) && (a189.equals("e"))))) && a400 <=  -103))) {
    	cf = false;
    	if((((251 < a390) && (326 >= a390)) || 227 < a54)) {
    	a56 = ((((20 - -9414) - 9424) + -6000) - -6110);
    	a127 = a29[(a201 + -2)];
    	a146 = a3[((a337 - a212) - -4)]; 
    	}else {
    	a116 = "g";
    	a146 = a3[(a201 + -2)];
    	a104 = a148[(a212 - 4)];
    	}output = "W";
    } 
    if(((((56 == a320[1]) && (((((a17.equals("h")) && cf) && a146 == a3[0]) && input.equals(inputs[4])) && (a189.equals("e")))) && a390 <=  75) && ((a263 == 8) && (((90 == a399[4]) && a295 <=  -110) && a400 <=  -103)))) {
    	cf = false;
    	a212 = 14;
    	a399 = a344;
    	a201 = 11;
    	a235 = a374;
    	a244 = ((((a244 % 15047) - 14952) + -1) * 1);
    	a285 = "g";
    	a353 = a343[5];
    	a333 = "i";
    	a283 = "h";
    	a279 = (((62 + 2319) + -15866) - -13777);
    	a103 = (a337 + 6);
    	a266 = a236;
    	a360 = 11;
    	a261 = a229[1];
    	a278 = "i";
    	a340 = a245[7];
    	a280 = ((((a280 % 39) + 323) * 1) - 0);
    	a365 = "g";
    	a391 = a392[2];
    	a390 = (((a390 / 5) - 3351) - -18473);
    	a295 = ((((a295 % 14945) - 110) / 5) * 5);
    	a310 = "i";
    	a349 = ((((a349 % 14805) - -15194) - -1) - 0);
    	a24 = (a337 + 6);
    	a263 = 11;
    	a400 = (((a400 - 0) + 30097) - -2);
    	a146 = a3[(a337 + -3)];
    	a312 = a382[5];
    	a246 = a332;
    	a237 = a336;
    	a291 = a307[6];
    	a381 = a218[7];
    	a320 = a217;
    	a373 = 6;
    	a377 = a204;
    	a215 = 13;
    	a337 = 11; 
    	output = "W";
    } 
    if((((a201 == 6) && ((85 == a377[3]) && (((cf && (a17.equals("h"))) && input.equals(inputs[5])) && a340 == a245[0]))) && ((a285.equals("e")) && ((56 == a320[1]) && (a146 == a3[0] && (a280 <=  156 && (a189.equals("e")))))))) {
    	cf = false;
    	if(((a88 <=  19 || (364 < a280 && ((a101.equals("f")) && 94 < a129))) && a391 == a392[5])) {
    	a285 = "i";
    	a333 = "i";
    	a390 = (((((a390 + 13233) % 87) - -162) + -2574) + 2576);
    	a320 = a299;
    	a295 = (((((a295 - 0) - -7572) * 1) % 95) + 112);
    	a349 = (((((a349 % 72) + 316) / 5) * 10) / 2);
    	a15 = (a337 + 6);
    	a235 = a240;
    	a279 = ((((32 + 21582) - 5780) * 10) / 9);
    	a117 = a178[(a15 + -10)];
    	a353 = a343[3];
    	a146 = a3[(a215 + -3)]; 
    	}else {
    	a17 = "f";
    	a152 = a143;
    	}output = "Z";
    } 
    if(((a353 == a343[0] && ((a360 == 8) && ((a285.equals("e")) && (((a337 == 6) && ((a189.equals("e")) && (cf && (a17.equals("h"))))) && input.equals(inputs[3]))))) && ((a261 == a229[0] && a146 == a3[0]) && a295 <=  -110))) {
    	cf = false;
    	a109 = (a263 - 4);
    	a82 = a86;
    	a146 = a3[(a212 + -4)]; 
    	output = "Z";
    } 
    if((((56 == a320[1]) && ((a209.equals("e")) && ((a215 == 10) && (input.equals(inputs[8]) && (a146 == a3[0] && (cf && (a17.equals("h")))))))) && (a244 <=  94 && ((a337 == 6) && ((a310.equals("e")) && (a189.equals("e"))))))) {
    	cf = false;
    	a146 = a3[((a360 - a337) + 5)];
    	a15 = (a215 + -3);
    	a338 = (a15 - 1); 
    	output = "S";
    } 
}
private  void calculateOutputm59(String input) {
    if((((((a146 == a3[0] && ((a215 == 10) && (a285.equals("e")))) && (a17.equals("h"))) && (56 == a320[1])) && (a337 == 6)) && (a353 == a343[0] && (a349 <=  23 && ((a189.equals("g")) && (input.equals(inputs[8]) && cf)))))) {
    	cf = false;
    	a279 = (((((a349 * a390) % 14999) / 5) + -8333) + -8251);
    	a237 = a336;
    	a54 = (((((((a295 * a390) % 14999) / 5) * 5) - 9169) % 14960) - 15038);
    	a285 = "f";
    	a310 = "e";
    	a381 = a218[((a337 * a212) - 54)];
    	a340 = a245[((a373 * a373) - 4)];
    	a283 = "f";
    	a261 = a229[((a212 + a215) - 18)];
    	a391 = a392[(a201 + -6)];
    	a353 = a343[(a373 - 2)];
    	a266 = a211;
    	a365 = "f";
    	a15 = (a337 + 5);
    	a400 = (((((((a400 * a295) % 14999) % 13) + -100) / 5) - -15253) - 15320);
    	a291 = a307[(a215 + -9)];
    	a146 = a3[(a201 + 1)];
    	a235 = a240;
    	a263 = ((a201 - a215) - -12); 
    	output = "W";
    } 
    if(((((a283.equals("e")) && ((cf && (a17.equals("h"))) && input.equals(inputs[6]))) && (a189.equals("g"))) && (((a312 == a382[0] && ((a263 == 8) && ((a337 == 6) && a295 <=  -110))) && a146 == a3[0]) && a400 <=  -103))) {
    	cf = false;
    	a261 = a229[(a373 - 1)];
    	a263 = (a215 - 1);
    	a333 = "f";
    	a24 = ((a201 - a337) - -11);
    	a353 = a343[(a212 - 8)];
    	a146 = a3[(a201 + -3)];
    	a400 = ((((((a400 * a390) % 14999) - -8658) * 1) % 13) + -88);
    	a349 = ((((((((a349 * a295) % 14999) % 109) - -134) - -1) * 5) % 109) + 105);
    	a235 = a324;
    	a244 = ((((((a244 * a295) % 14999) * 2) + 0) % 23) - -118);
    	a1 = ((((((a295 * a295) % 14999) / 5) % 26) + -101) + -8);
    	a365 = "f";
    	a337 = ((a373 / a212) - -7);
    	a360 = a212;
    	a291 = a307[((a373 * a263) + -17)];
    	a312 = a382[(a212 - 8)]; 
    	output = "W";
    } 
    if((((a17.equals("h")) && (((a278.equals("e")) && (input.equals(inputs[1]) && (cf && a146 == a3[0]))) && a280 <=  156)) && (a291 == a307[0] && (((a285.equals("e")) && (a390 <=  75 && (a365.equals("e")))) && (a189.equals("g")))))) {
    	cf = false;
    	a235 = a324;
    	a291 = a307[((a360 + a360) + -15)];
    	a349 = (((((((a349 * a295) % 14999) * 2) % 109) - -133) - 2406) + 2406);
    	a146 = a3[(a201 - 3)];
    	a295 = (((((((a295 * a280) % 14999) % 62) - 45) * 5) % 62) + -46);
    	a381 = a218[((a337 - a360) - -2)];
    	a280 = (((((a390 * a244) % 14999) - -1502) - 4073) + -12348);
    	a400 = ((((((a400 * a244) % 14999) * 2) + -1) % 13) - 87);
    	a263 = 9;
    	a353 = a343[((a360 * a201) + -48)];
    	a312 = a382[1];
    	a337 = 7;
    	a24 = (a212 + -2);
    	a212 = (a373 - -7);
    	a399 = a251;
    	a209 = "f";
    	a266 = a221;
    	a377 = a204;
    	a215 = (a263 + 2);
    	a373 = (a337 + -4);
    	a365 = "f";
    	a162 = ((((((a244 * a390) % 14999) % 14926) - -15072) * 1) * 1);
    	a285 = "f";
    	a246 = a358;
    	a261 = a229[1];
    	a201 = 7;
    	a333 = "f";
    	a278 = "f";
    	a320 = a372;
    	a390 = ((((((a390 * a244) % 14999) + -626) + -6681) % 87) + 163);
    	a283 = "f";
    	a360 = a263;
    	a244 = ((((((a244 * a279) % 14999) % 23) + 118) + 16971) + -16970); 
    	output = "S";
    } 
    if(((((a373 == 2) && (((a17.equals("h")) && ((a189.equals("g")) && (a263 == 8))) && (a201 == 6))) && a261 == a229[0]) && (((41 == a235[0]) && ((input.equals(inputs[3]) && cf) && a146 == a3[0])) && (18 == a266[5])))) {
    	cf = false;
    	if((!(a103 == 7) && (!(23 == a61[4]) || (22 == a237[0])))) {
    	a209 = "f";
    	a215 = ((a201 / a337) - -10);
    	a162 = ((((((a244 * a390) % 14999) + 8407) / 5) % 51) + 94);
    	a263 = (a215 - 2);
    	a24 = 7;
    	a399 = a251;
    	a244 = (((((((a280 * a280) % 14999) * 2) % 23) + 117) + 28023) - 28021);
    	a146 = a3[(a373 + 1)];
    	a333 = "f";
    	a365 = "f";
    	a349 = (((((((a349 * a280) % 14999) + 7039) % 109) + 132) + -16787) + 16787);
    	a283 = "f";
    	a201 = (a263 - 2);
    	a261 = a229[(a215 + -10)];
    	a360 = (a337 - -3);
    	a235 = a324;
    	a212 = ((a337 + a373) + 2);
    	a312 = a382[(a263 - 8)];
    	a285 = "f";
    	a377 = a366;
    	a390 = ((((((a390 * a295) % 14999) % 87) + 164) + 20498) + -20497);
    	a291 = a307[((a337 - a373) + -3)];
    	a400 = (((((((a400 * a280) % 14999) % 13) + -89) / 5) + -24988) + 24916);
    	a266 = a211;
    	a353 = a343[(a263 - 8)];
    	a295 = ((((((((a280 * a349) % 14999) / 5) % 62) + -46) * 5) % 62) - 47);
    	a373 = ((a212 + a360) - 16);
    	a246 = a296;
    	a337 = (a263 + -2);
    	a280 = ((((((a280 * a279) % 14999) % 63) - -221) - 3598) - -3598); 
    	}else {
    	a263 = (a360 + 1);
    	a266 = a236;
    	a373 = ((a263 * a263) - 78);
    	a377 = a366;
    	a400 = ((((((a400 * a390) % 14999) * 2) % 13) + -88) - -1);
    	a399 = a251;
    	a246 = a296;
    	a128 = ((a201 * a212) + -47);
    	a146 = a3[((a337 * a128) + -38)];
    	a201 = ((a263 - a360) + 6);
    	a291 = a307[(a373 - 2)];
    	a280 = ((((((a280 * a349) % 14999) % 63) + 221) - 1) - -1);
    	a244 = ((((((a244 * a349) % 14999) % 23) - -118) - -1) * 1);
    	a116 = "f";
    	a212 = ((a360 - a263) + 11);
    	a215 = (a360 + 3);
    	a390 = ((((((a390 * a279) % 14999) / 5) + 2446) % 87) + 162);
    	a209 = "f";
    	a312 = a382[((a263 + a263) + -17)];
    	a237 = a336;
    	a320 = a372;
    	a235 = a324;
    	a285 = "f";
    	a337 = (a263 - 2);
    	a333 = "f";
    	a261 = a229[((a373 - a373) - -1)];
    	a360 = a263;
    	a365 = "g";
    	a283 = "f";
    	a349 = (((((((a349 * a295) % 14999) + 13757) % 109) - -134) + -9322) - -9322);
    	a295 = (((((a295 % 62) - -10) - -3180) + -27541) - -24303);
    	}output = "X";
    } 
}
private  void calculateOutputm60(String input) {
    if(((a261 == a229[0] && a391 == a392[0]) && ((18 == a266[5]) && ((a340 == a245[0] && (input.equals(inputs[2]) && ((a244 <=  94 && ((a146 == a3[0] && cf) && (a189.equals("h")))) && (a17.equals("h"))))) && a295 <=  -110)))) {
    	cf = false;
    	a215 = ((a201 - a201) - -11);
    	a377 = a366;
    	a333 = "f";
    	a390 = ((((((a400 * a400) % 87) - -84) / 5) * 10) / 2);
    	a212 = ((a215 * a373) - 12);
    	a278 = "g";
    	a235 = a324;
    	a279 = (((((a400 * a400) % 57) + 116) / 5) * 5);
    	a263 = ((a201 + a215) - 8);
    	a24 = (a337 - -2);
    	a365 = "f";
    	a280 = ((((((a280 * a279) % 14999) % 63) + 221) * 5) / 5);
    	a291 = a307[(a201 + -5)];
    	a50 = a0[(a360 - 6)];
    	a337 = ((a212 + a201) - 9);
    	a373 = (a215 + -8);
    	a146 = a3[((a201 - a337) + 4)];
    	a360 = (a215 - 2);
    	a244 = ((((((a244 * a349) % 14999) % 23) + 118) / 5) + 105);
    	a295 = ((((((a295 * a390) % 14999) % 62) + -47) + -1) - -1);
    	a209 = "f";
    	a340 = a245[(a201 + -5)];
    	a266 = a211;
    	a399 = a251;
    	a201 = ((a212 + a215) + -14); 
    	output = "S";
    } 
    if(((a146 == a3[0] && (input.equals(inputs[5]) && (a244 <=  94 && ((a189.equals("h")) && ((a17.equals("h")) && cf))))) && (((a279 <=  105 && ((a209.equals("e")) && (85 == a377[3]))) && (20 == a237[4])) && a353 == a343[0]))) {
    	cf = false;
    	a279 = (((((((a244 * a280) % 14999) % 57) - -163) + 2) / 5) + 125);
    	a360 = (a263 - -1);
    	a353 = a343[((a263 + a212) + -16)];
    	a291 = a307[(a360 - 8)];
    	a146 = a3[(a337 - 2)];
    	a116 = "f";
    	a128 = ((a201 - a373) - 1);
    	a209 = "f";
    	a390 = ((((((a390 * a279) % 14999) * 2) / 5) % 87) + 164);
    	a377 = a366;
    	a237 = a265;
    	a261 = a229[((a215 - a128) + -6)];
    	a295 = (((((((a295 * a244) % 14999) % 62) - 46) + -1) - -28932) + -28930);
    	a215 = ((a263 + a263) + -5); 
    	output = "T";
    } 
    if(((((18 == a266[5]) && (((a146 == a3[0] && (a285.equals("e"))) && (20 == a237[4])) && a279 <=  105)) && a390 <=  75) && (((a189.equals("h")) && ((cf && input.equals(inputs[3])) && (a17.equals("h")))) && (a333.equals("e"))))) {
    	cf = false;
    	a263 = (a373 + 7);
    	a128 = (a360 + -4);
    	a237 = a265;
    	a373 = (a263 - 6);
    	a279 = ((((((a279 * a244) % 14999) % 57) - -162) - -20046) + -20045);
    	a377 = a366;
    	a295 = ((((((a295 * a244) % 14999) % 62) - 47) - 1) / 5);
    	a146 = a3[a128];
    	a209 = "f";
    	a353 = a343[(a263 - 8)];
    	a333 = "f";
    	a340 = a245[(a337 - 5)];
    	a261 = a229[((a212 + a201) + -14)];
    	a212 = ((a215 * a337) - 50);
    	a201 = ((a263 - a263) + 7);
    	a280 = ((((((a280 * a400) % 14999) % 39) + 323) * 1) + 0);
    	a391 = a392[(a263 + -8)];
    	a399 = a251;
    	a390 = (((((((a349 * a244) % 14999) / 5) / 5) / 5) % 87) + 162);
    	a360 = ((a337 * a215) + -51);
    	a291 = a307[(a337 - 5)];
    	a266 = a211;
    	a116 = "f";
    	a285 = "f";
    	a215 = (a263 + 2);
    	a381 = a218[((a337 / a263) + 2)];
    	a337 = ((a263 / a263) + 6);
    	a244 = (((((((a244 * a390) % 14999) * 2) * 1) / 5) % 23) + 117); 
    	output = "W";
    } 
}
private  void calculateOutputm4(String input) {
    if(((a291 == a307[0] && (a390 <=  75 && ((a215 == 10) && a312 == a382[0]))) && (a244 <=  94 && (a400 <=  -103 && ((a189.equals("e")) && cf))))) {
    	calculateOutputm57(input);
    } 
    if((((a373 == 2) && (a400 <=  -103 && ((a189.equals("g")) && cf))) && ((41 == a235[0]) && ((a390 <=  75 && (90 == a399[4])) && (a209.equals("e")))))) {
    	calculateOutputm59(input);
    } 
    if((((a381 == a218[0] && a295 <=  -110) && a261 == a229[0]) && ((a263 == 8) && ((((a189.equals("h")) && cf) && (18 == a266[5])) && a280 <=  156)))) {
    	calculateOutputm60(input);
    } 
}
private  void calculateOutputm62(String input) {
    if(((a310.equals("e")) && ((((((a360 == 8) && (((a17.equals("i")) && (a146 == a3[0] && (cf && input.equals(inputs[8])))) && (a302.equals("e")))) && (90 == a399[4])) && (a373 == 2)) && a353 == a343[0]) && (a283.equals("e"))))) {
    	a59 += (a59 + 20) > a59 ? 1 : 0;
    	cf = false;
    	a136 = (a373 - -5);
    	a310 = "h";
    	a309 = ((a136 * a337) - 34);
    	a278 = "i";
    	a201 = 13;
    	a146 = a3[((a212 / a212) + 1)];
    	a266 = a221;
    	a263 = 8;
    	a381 = a218[6];
    	a291 = a307[1];
    	a365 = "h";
    	a261 = a229[4];
    	a285 = "i";
    	a377 = a204;
    	a215 = 17;
    	a337 = 11;
    	a235 = a324;
    	a212 = 14; 
    	output = "U";
    } 
    if(((((input.equals(inputs[1]) && (((a333.equals("e")) && (a146 == a3[0] && ((a302.equals("e")) && cf))) && a349 <=  23)) && (a17.equals("i"))) && a295 <=  -110) && ((a201 == 6) && (a261 == a229[0] && (41 == a235[0]))))) {
    	cf = false;
    	a15 = (a263 + 6);
    	a146 = a3[((a373 + a337) - 1)];
    	a379 = (a15 + -2); 
    	output = "S";
    } 
    if(((((a17.equals("i")) && (82 == a246[2])) && (a263 == 8)) && ((a333.equals("e")) && (((((a146 == a3[0] && (input.equals(inputs[9]) && cf)) && (a212 == 9)) && (18 == a266[5])) && (a302.equals("e"))) && a353 == a343[0])))) {
    	cf = false;
    	if(((!(89 == a377[1]) && (20 == a237[4])) || cf)) {
    	a279 = (((((a279 % 14833) - -15166) / 5) * 5) + 5);
    	a17 = "h";
    	a391 = a392[5];
    	a189 = "e"; 
    	}else {
    	a146 = a3[4];
    	a116 = "i";
    	a56 = (((((((a280 * a280) % 14999) % 14823) + 15175) + 0) / 5) - -6768);
    	}output = "Z";
    } 
    if((((a312 == a382[0] && (((input.equals(inputs[3]) && (18 == a266[5])) && a279 <=  105) && (a365.equals("e")))) && a381 == a218[0]) && (((a146 == a3[0] && ((a17.equals("i")) && cf)) && (a302.equals("e"))) && a353 == a343[0]))) {
    	cf = false;
    	if((!(a146 == 5) && (cf || ((63 == a320[2]) || a88 <=  19)))) {
    	a237 = a336;
    	a279 = (((((a279 % 55) - -278) - 1) - 12300) - -12300);
    	a24 = ((a215 * a337) - 51);
    	a377 = a281;
    	a212 = 16;
    	a280 = ((((a280 + 5250) % 15078) + -14921) + -2);
    	a349 = ((((a349 + 0) % 14805) + 15194) * 1);
    	a295 = ((((a295 + 0) + 9513) / 5) + -11721);
    	a400 = (((((a400 % 14948) + -103) * 10) / 9) + -11280);
    	a381 = a218[6];
    	a235 = a240;
    	a30 = (a215 + 2);
    	a365 = "g";
    	a146 = a3[(a24 - 6)];
    	a246 = a332;
    	a337 = 8; 
    	}else {
    	a109 = ((a212 - a360) - -2);
    	a156 = ((((15 - -20311) + -31804) / 5) + 2338);
    	a146 = a3[((a201 / a263) - -5)];
    	}output = "S";
    } 
    if(((a353 == a343[0] && ((a360 == 8) && ((cf && (a17.equals("i"))) && (a302.equals("e"))))) && (a244 <=  94 && (input.equals(inputs[7]) && ((41 == a235[0]) && ((a146 == a3[0] && a400 <=  -103) && (a333.equals("e")))))))) {
    	cf = false;
    	if((!(a365.equals("i")) && (a116.equals("f")))) {
    	a325 = "h";
    	a116 = "h";
    	a146 = a3[((a337 + a360) + -10)]; 
    	}else {
    	a146 = a3[(a373 + a373)];
    	a116 = "f";
    	a128 = a373;
    	}output = "S";
    } 
    if((((90 == a399[4]) && (a381 == a218[0] && ((a263 == 8) && (((a201 == 6) && input.equals(inputs[4])) && a340 == a245[0])))) && ((a365.equals("e")) && ((a17.equals("i")) && (a146 == a3[0] && (cf && (a302.equals("e")))))))) {
    	cf = false;
    	a116 = "f";
    	a146 = a3[((a201 - a212) - -7)];
    	a128 = (a373 + 7); 
    	output = "Y";
    } 
    if((((a333.equals("e")) && (a244 <=  94 && a295 <=  -110)) && (((a302.equals("e")) && (a146 == a3[0] && (((18 == a266[5]) && (((a17.equals("i")) && cf) && input.equals(inputs[0]))) && (a360 == 8)))) && a349 <=  23))) {
    	cf = false;
    	if((((a249 == 9) || (((75 == a33[5]) && !(a325.equals("h"))) || !(a291 == a307[4]))) && !(a24 == 10))) {
    	a109 = (a201 + 2);
    	a95 = "f";
    	a146 = a3[((a201 * a337) - 31)]; 
    	}else {
    	a400 = (((a400 - -30091) + 4) * 1);
    	a312 = a382[7];
    	a209 = "f";
    	a244 = ((((a244 % 14871) + 15127) * 1) * 1);
    	a261 = a229[5];
    	a283 = "h";
    	a212 = 15;
    	a377 = a204;
    	a201 = 6;
    	a291 = a307[5];
    	a349 = ((((a349 - -19204) % 14805) - -15194) - 0);
    	a365 = "g";
    	a310 = "h";
    	a246 = a296;
    	a215 = 13;
    	a399 = a344;
    	a109 = ((a360 + a337) - 13);
    	a340 = a245[5];
    	a280 = ((((((a280 % 39) - -324) + 2) * 5) % 39) - -286);
    	a360 = 10;
    	a320 = a217;
    	a353 = a343[3];
    	a1 = ((((51 * 10) / 9) / 5) + 6311);
    	a263 = 15;
    	a279 = (((((a279 + 25446) % 15052) + -14946) - -7948) + -7949);
    	a333 = "e";
    	a235 = a374;
    	a266 = a221;
    	a146 = a3[(a373 - -3)];
    	a278 = "h";
    	a337 = 13;
    	a285 = "h";
    	a390 = ((((a390 * 1) % 15037) - 14961) - 0);
    	a295 = (((((a295 + 29310) % 95) - -113) + 20609) + -20608);
    	a237 = a328;
    	a381 = a218[1];
    	a373 = 6;
    	}output = "U";
    } 
    if((((a261 == a229[0] && (((a302.equals("e")) && (a146 == a3[0] && (82 == a246[2]))) && a349 <=  23)) && a295 <=  -110) && (a400 <=  -103 && ((((a17.equals("i")) && cf) && input.equals(inputs[6])) && (20 == a237[4]))))) {
    	cf = false;
    	a261 = a229[7];
    	a246 = a358;
    	a167 = (a212 - 7);
    	a381 = a218[3];
    	a244 = ((((a244 % 23) - -117) + 2) * 1);
    	a201 = 12;
    	a391 = a392[5];
    	a263 = 15;
    	a237 = a336;
    	a285 = "e";
    	a291 = a307[0];
    	a278 = "i";
    	a333 = "i";
    	a283 = "f";
    	a312 = a382[1];
    	a320 = a217;
    	a360 = 11;
    	a365 = "h";
    	a215 = 14;
    	a340 = a245[7];
    	a377 = a366;
    	a295 = (((a295 / 5) - 11207) / 5);
    	a349 = ((((a349 - -17543) + -3972) % 72) + 316);
    	a400 = ((((a400 - 0) + 30036) / 5) - -10678);
    	a390 = (((((a390 + 170) + 7150) + -3793) % 14836) + 15162);
    	a146 = a3[((a167 + a337) + -6)];
    	a353 = a343[3];
    	a209 = "g";
    	a266 = a221;
    	a310 = "h";
    	a280 = ((((a280 % 15078) + -14921) + 24945) - 24946);
    	a136 = (a167 - -6);
    	a212 = 12;
    	a399 = a344;
    	a373 = 2;
    	a235 = a324;
    	a279 = ((((a279 % 57) + 164) * 1) + 1);
    	a337 = 6; 
    	output = "S";
    } 
    if((((a280 <=  156 && a353 == a343[0]) && (a337 == 6)) && (((20 == a237[4]) && ((a201 == 6) && ((a17.equals("i")) && ((input.equals(inputs[5]) && (cf && a146 == a3[0])) && (a302.equals("e")))))) && a279 <=  105))) {
    	cf = false;
    	a349 = (((a349 / 5) - -29107) - -402);
    	a244 = (((a244 / 5) * 5) - 0);
    	a390 = ((((a390 % 15037) - 14961) + -3) / 5);
    	a399 = a251;
    	a212 = 13;
    	a353 = a343[6];
    	a310 = "h";
    	a263 = 15;
    	a266 = a211;
    	a381 = a218[1];
    	a312 = a382[7];
    	a291 = a307[5];
    	a279 = ((((a279 + 27432) % 15052) - 14946) - 1);
    	a338 = (a337 - -2);
    	a333 = "h";
    	a400 = (((((a400 % 14948) + -103) * 10) / 9) - 12295);
    	a76 = a98;
    	a278 = "f";
    	a373 = 2;
    	a215 = 13;
    	a146 = a3[((a201 * a337) + -30)];
    	a235 = a240;
    	a391 = a392[1];
    	a237 = a265;
    	a377 = a204;
    	a209 = "i";
    	a340 = a245[3];
    	a246 = a332;
    	a360 = 15;
    	a283 = "f";
    	a295 = (((a295 + 5761) / 5) - -8549);
    	a320 = a299;
    	a261 = a229[6];
    	a337 = 6;
    	a365 = "f";
    	a280 = ((((a280 + 0) % 15078) + -14921) - 1);
    	a285 = "e";
    	a201 = 10; 
    	output = "S";
    } 
    if(((((a278.equals("e")) && ((a302.equals("e")) && ((a390 <=  75 && a146 == a3[0]) && a261 == a229[0]))) && (a283.equals("e"))) && ((((a17.equals("i")) && (cf && input.equals(inputs[2]))) && a291 == a307[0]) && a295 <=  -110))) {
    	cf = false;
    	a266 = a221;
    	a215 = 13;
    	a400 = (((((a400 - 0) * 1) / 5) % 53) + -18);
    	a349 = ((((((a349 - -11574) % 72) - -315) * 5) % 72) - -275);
    	a291 = a307[0];
    	a279 = ((((a279 % 15052) + -14946) - -15040) - 15042);
    	a365 = "h";
    	a390 = (((((a390 / 5) - 22706) - 1058) % 87) - -182);
    	a391 = a392[1];
    	a244 = ((((a244 % 15047) - 14952) * 1) + -1);
    	a15 = ((a337 * a337) + -24);
    	a399 = a269;
    	a117 = a178[(a337 - 5)];
    	a146 = a3[(a337 - -1)]; 
    	output = "T";
    } 
}
private  void calculateOutputm64(String input) {
    if((((a365.equals("e")) && ((((a146 == a3[0] && ((a302.equals("i")) && (input.equals(inputs[6]) && (cf && (a17.equals("i")))))) && a391 == a392[0]) && (a283.equals("e"))) && (a310.equals("e")))) && (a349 <=  23 && (41 == a235[0])))) {
    	cf = false;
    	a116 = "g";
    	a104 = a148[((a263 - a337) - -2)];
    	a146 = a3[(a263 + -4)]; 
    	output = "W";
    } 
    if((((a333.equals("e")) && ((a17.equals("i")) && (a146 == a3[0] && (cf && input.equals(inputs[7]))))) && (a295 <=  -110 && (a340 == a245[0] && ((a302.equals("i")) && (((85 == a377[3]) && (a263 == 8)) && (90 == a399[4]))))))) {
    	cf = false;
    	if(((a146 == 4) || ((a391 == 9) && ((48 == a132[3]) || ((a381 == 10) || 208 < a295))))) {
    	a246 = a358;
    	a381 = a218[5];
    	a291 = a307[5];
    	a266 = a211;
    	a136 = ((a215 * a263) - 76);
    	a320 = a217;
    	a349 = (((a349 / 5) - -10338) - -3159);
    	a283 = "i";
    	a278 = "h";
    	a310 = "e";
    	a285 = "h";
    	a201 = 9;
    	a400 = (((((a400 % 13) + -81) - -14373) + 6965) + -21342);
    	a280 = ((((43 + 13898) / 5) * 5) - 13680);
    	a377 = a366;
    	a209 = "f";
    	a212 = 15;
    	a337 = 11;
    	a360 = 13;
    	a312 = a382[7];
    	a365 = "h";
    	a261 = a229[4];
    	a340 = a245[6];
    	a244 = (((((a244 % 23) + 117) / 5) + -13204) + 13297);
    	a295 = (((a295 / 5) / 5) + -24485);
    	a146 = a3[a373];
    	a142 = a112;
    	a333 = "e";
    	a390 = (((((a390 % 87) + 164) - -19043) - 23001) - -3956);
    	a373 = 8;
    	a263 = 15;
    	a399 = a251;
    	a279 = (((((a279 * 1) % 57) + 164) / 5) - -104);
    	a353 = a343[5];
    	a237 = a265;
    	a391 = a392[1];
    	a235 = a240;
    	a215 = 15; 
    	}else {
    	a146 = a3[(a373 - -5)];
    	a54 = ((((((a279 * a279) % 14999) % 46) - -180) + 0) - 0);
    	a15 = (a212 + 2);
    	}output = "W";
    } 
    if(((((a373 == 2) && (a146 == a3[0] && ((cf && (a17.equals("i"))) && (a302.equals("i"))))) && (a365.equals("e"))) && ((56 == a320[1]) && (((a283.equals("e")) && ((a310.equals("e")) && (a201 == 6))) && input.equals(inputs[5]))))) {
    	cf = false;
    	a116 = "g";
    	a104 = a148[((a263 + a337) - 9)];
    	a146 = a3[(a373 + 2)]; 
    	output = "S";
    } 
    if(((input.equals(inputs[0]) && (((((a373 == 2) && (((a302.equals("i")) && cf) && a146 == a3[0])) && (41 == a235[0])) && a295 <=  -110) && a400 <=  -103)) && ((a17.equals("i")) && ((20 == a237[4]) && a353 == a343[0])))) {
    	cf = false;
    	a116 = "g";
    	a146 = a3[((a212 / a201) + 3)];
    	a104 = a148[((a337 * a337) + -34)]; 
    	output = "Z";
    } 
    if((((((a360 == 8) && (a17.equals("i"))) && a312 == a382[0]) && (a278.equals("e"))) && ((((input.equals(inputs[1]) && (a146 == a3[0] && (cf && (a302.equals("i"))))) && a390 <=  75) && (a215 == 10)) && a381 == a218[0]))) {
    	cf = false;
    	if((!(a146 == a3[3]) || (((-79 < a54) && (134 >= a54)) && ((a64 == a67[4] && (a127 == 8)) || a146 == a3[1])))) {
    	a237 = a336;
    	a279 = (((((a279 * 1) * 1) - -12665) % 55) + 277);
    	a349 = (((((a349 + 0) % 72) + 317) + -3141) - -3140);
    	a261 = a229[7];
    	a209 = "e";
    	a391 = a392[0];
    	a353 = a343[6];
    	a24 = (a337 + 1);
    	a162 = (((((((a244 * a244) % 14999) % 51) - -93) * 1) + 17246) + -17244);
    	a146 = a3[(a373 + 1)];
    	a390 = (((((a390 * 1) * 1) + 0) % 37) - -288);
    	a291 = a307[4];
    	a201 = 6;
    	a215 = 13;
    	a340 = a245[2];
    	a337 = 9;
    	a310 = "h";
    	a312 = a382[3];
    	a373 = 4;
    	a399 = a344;
    	a360 = 8;
    	a285 = "i";
    	a365 = "g";
    	a212 = 11;
    	a283 = "e";
    	a263 = 13;
    	a235 = a240;
    	a266 = a221;
    	a295 = ((((((a295 % 95) - -112) - 1) * 5) % 95) - -76);
    	a400 = ((((a400 % 53) - -29) + -4) - 8);
    	a333 = "i";
    	a377 = a281;
    	a244 = ((((a244 % 14871) - -15127) - 22980) + 22983); 
    	}else {
    	a280 = (((((6 + -10628) * 2) * 1) * -1) / 10);
    	a146 = a3[(a337 - -1)];
    	a377 = a281;
    	a291 = a307[0];
    	a266 = a221;
    	a119 = "g";
    	a15 = (a212 - -1);
    	}output = "S";
    } 
    if((((input.equals(inputs[8]) && (cf && (a302.equals("i")))) && (a278.equals("e"))) && (((a263 == 8) && ((a310.equals("e")) && ((((20 == a237[4]) && a146 == a3[0]) && (a17.equals("i"))) && a340 == a245[0]))) && a391 == a392[0]))) {
    	cf = false;
    	a316 = "f";
    	a24 = ((a212 - a201) + 3);
    	a146 = a3[(a337 - 3)]; 
    	output = "Z";
    } 
    if((((85 == a377[3]) && ((a201 == 6) && (input.equals(inputs[9]) && (20 == a237[4])))) && ((a209.equals("e")) && ((((a302.equals("i")) && (a146 == a3[0] && ((a17.equals("i")) && cf))) && (a337 == 6)) && a295 <=  -110)))) {
    	cf = false;
    	if((!(a209.equals("f")) || ((a103 == 12) || (a146 == 8)))) {
    	a209 = "i";
    	a373 = 3;
    	a291 = a307[5];
    	a146 = a3[(a201 + -3)];
    	a316 = "g";
    	a365 = "g";
    	a333 = "e";
    	a261 = a229[1];
    	a278 = "h";
    	a215 = 13;
    	a246 = a296;
    	a399 = a269;
    	a353 = a343[5];
    	a237 = a336;
    	a24 = (a212 + -3);
    	a279 = (((a279 + 0) / 5) - -19755);
    	a377 = a281;
    	a212 = 11;
    	a320 = a372;
    	a312 = a382[6];
    	a349 = ((((((a349 - 0) % 72) - -317) * 5) % 72) + 296);
    	a337 = 9;
    	a391 = a392[4];
    	a285 = "i";
    	a400 = (((a400 / 5) + 17456) / 5);
    	a390 = ((((a390 % 15037) - 14961) + -3) + 0);
    	a283 = "e";
    	a310 = "i";
    	a360 = 12;
    	a244 = ((((a244 % 23) - -117) + -17435) + 17436);
    	a235 = a374;
    	a266 = a221;
    	a201 = 9; 
    	}else {
    	a338 = ((a201 + a212) + -5);
    	a373 = 6;
    	a15 = ((a263 * a338) - 73);
    	a283 = "i";
    	a280 = (((96 - -203) / 5) + 284);
    	a365 = "f";
    	a279 = (((((a279 + 3799) % 15052) - 14946) - -1952) - 1953);
    	a353 = a343[6];
    	a146 = a3[a15];
    	}output = "X";
    } 
    if(((a391 == a392[0] && ((a17.equals("i")) && a291 == a307[0])) && ((a381 == a218[0] && ((82 == a246[2]) && ((((input.equals(inputs[2]) && cf) && (a302.equals("i"))) && a146 == a3[0]) && (56 == a320[1])))) && (a212 == 9)))) {
    	cf = false;
    	a400 = ((((a400 * -4) / 10) + 1593) - -10901);
    	a246 = a358;
    	a244 = ((((((a244 % 57) - -199) + -1) / 5) * 51) / 10);
    	a50 = a0[(a201 - 6)];
    	a377 = a204;
    	a209 = "e";
    	a333 = "h";
    	a310 = "e";
    	a399 = a344;
    	a312 = a382[6];
    	a285 = "f";
    	a337 = 9;
    	a340 = a245[5];
    	a353 = a343[3];
    	a261 = a229[0];
    	a365 = "e";
    	a212 = 15;
    	a391 = a392[4];
    	a278 = "f";
    	a381 = a218[6];
    	a291 = a307[3];
    	a349 = (((a349 - 0) / 5) - 8136);
    	a373 = 8;
    	a295 = (((((a295 % 62) + -19) - -14391) + -37209) + 22832);
    	a360 = 14;
    	a24 = ((a263 - a201) - -6);
    	a320 = a217;
    	a215 = 13;
    	a263 = 13;
    	a266 = a221;
    	a146 = a3[(a24 - 5)];
    	a279 = ((((a279 % 15052) - 14946) + -3) / 5);
    	a390 = ((((a390 % 87) + 164) + 4104) - 4105);
    	a235 = a240;
    	a201 = 11; 
    	output = "W";
    } 
    if((((((a295 <=  -110 && (a209.equals("e"))) && a146 == a3[0]) && a261 == a229[0]) && (a215 == 10)) && ((a365.equals("e")) && ((((a17.equals("i")) && ((a302.equals("i")) && cf)) && input.equals(inputs[3])) && a390 <=  75)))) {
    	cf = false;
    	if(((a64 == 5) || ((221 < a279) && (333 >= a279)))) {
    	a400 = ((((a400 - -25434) + -4720) % 13) - 89);
    	a283 = "f";
    	a295 = (((((a295 % 14895) - -15103) - -14590) - 17462) + 14422);
    	a381 = a218[0];
    	a76 = a70;
    	a246 = a358;
    	a266 = a211;
    	a320 = a372;
    	a353 = a343[7];
    	a391 = a392[3];
    	a279 = ((((a279 % 14833) - -15166) * 1) - -1);
    	a278 = "h";
    	a373 = 8;
    	a399 = a251;
    	a390 = ((((a390 - -1402) % 15037) + -14961) + 0);
    	a146 = a3[(a215 - 4)];
    	a212 = 9;
    	a193 = (((((55 * 9) / 10) * 10) / 9) + -13); 
    	}else {
    	a340 = a245[4];
    	a246 = a296;
    	a146 = a3[(a337 + -4)];
    	a237 = a328;
    	a279 = ((((a279 - -18325) % 57) + 164) + 1);
    	a337 = 12;
    	a263 = 8;
    	a349 = ((((a349 % 14805) - -15194) + 0) + 0);
    	a360 = 11;
    	a312 = a382[0];
    	a390 = (((a390 / 5) + -19416) * 1);
    	a215 = 14;
    	a283 = "i";
    	a280 = (((2 + 277) + 14381) - 14413);
    	a310 = "i";
    	a377 = a204;
    	a399 = a251;
    	a266 = a211;
    	a136 = (a212 - 5);
    	a373 = 5;
    	a291 = a307[4];
    	a261 = a229[3];
    	a353 = a343[3];
    	a365 = "i";
    	a278 = "e";
    	a381 = a218[1];
    	a201 = 6;
    	a285 = "f";
    	a235 = a240;
    	a391 = a392[5];
    	a142 = a92;
    	}output = "V";
    } 
    if(((a261 == a229[0] && ((a278.equals("e")) && (((((a17.equals("i")) && cf) && (a302.equals("i"))) && input.equals(inputs[4])) && a391 == a392[0]))) && (((a244 <=  94 && a146 == a3[0]) && (a209.equals("e"))) && (a212 == 9)))) {
    	cf = false;
    	a360 = 12;
    	a365 = "i";
    	a399 = a269;
    	a400 = (((((a400 * 1) % 14948) - 103) / 5) + -13604);
    	a291 = a307[2];
    	a373 = 7;
    	a320 = a217;
    	a349 = (((a349 / 5) + -4191) + -429);
    	a263 = 13;
    	a146 = a3[3];
    	a279 = ((((a279 % 55) - -276) + 0) * 1);
    	a261 = a229[6];
    	a24 = (a212 + -1);
    	a266 = a221;
    	a235 = a374;
    	a390 = ((((a390 % 15037) - 14961) + -1) / 5);
    	a337 = 9;
    	a50 = a0[(a201 - 1)]; 
    	output = "W";
    } 
}
private  void calculateOutputm5(String input) {
    if((((41 == a235[0]) && (a340 == a245[0] && ((cf && (a302.equals("e"))) && (56 == a320[1])))) && ((82 == a246[2]) && (a261 == a229[0] && (18 == a266[5]))))) {
    	calculateOutputm62(input);
    } 
    if(((a391 == a392[0] && ((20 == a237[4]) && ((a263 == 8) && (56 == a320[1])))) && (a312 == a382[0] && (((a302.equals("i")) && cf) && (a373 == 2))))) {
    	calculateOutputm64(input);
    } 
}
private  void calculateOutputm65(String input) {
    if(((input.equals(inputs[6]) && (((89 == a377[1]) && (((a283.equals("f")) && a340 == a245[1]) && a353 == a343[1])) && a146 == a3[1])) && ((a360 == 9) && ((a201 == 7) && (a56 <=  44 && (a88 <=  19 && cf)))))) {
    	a187 -= (a187 - 20) < a187 ? 4 : 0;
    	a35 -= (a35 - 20) < a35 ? 4 : 0;
    	cf = false;
    	a116 = "f";
    	a390 = ((((((a400 * a88) % 14999) + 716) / 5) % 87) + 162);
    	a235 = a374;
    	a278 = "f";
    	a381 = a218[((a360 - a360) + 2)];
    	a128 = (a201 + -3);
    	a146 = a3[(a263 - 5)];
    	a365 = "g";
    	a280 = ((((((a280 * a349) % 14999) + 4048) % 39) - -300) - 7);
    	a391 = a392[(a212 + -9)]; 
    	output = "U";
    } 
    if(((((a312 == a382[1] && ((a201 == 7) && ((((-103 < a400) && (-75 >= a400)) && a146 == a3[1]) && input.equals(inputs[0])))) && (a333.equals("f"))) && (22 == a237[0])) && (((cf && a88 <=  19) && a56 <=  44) && (a212 == 10)))) {
    	cf = false;
    	a156 = ((((((a349 * a244) % 14999) / 5) % 54) - -54) + -1);
    	a146 = a3[5];
    	a109 = (a201 + -4); 
    	output = "V";
    } 
    if((((((((156 < a280) && (284 >= a280)) && (a360 == 9)) && a88 <=  19) && (a263 == 9)) && a312 == a382[1]) && ((a56 <=  44 && (((-110 < a295) && (16 >= a295)) && ((cf && a146 == a3[1]) && input.equals(inputs[1])))) && (a201 == 7)))) {
    	cf = false;
    	a146 = a3[a337];
    	a266 = a236;
    	a237 = a336;
    	a312 = a382[(a360 + -9)];
    	a280 = (((((a280 * a349) % 14999) / 5) + -14194) / 5);
    	a201 = (a212 - 4);
    	a261 = a229[((a337 * a337) - 49)];
    	a295 = ((((a295 * a244) / 5) + -17661) / 5);
    	a291 = a307[(a360 - 7)];
    	a117 = a178[((a263 + a212) + -18)];
    	a283 = "e";
    	a353 = a343[(a337 + -7)];
    	a15 = (a263 + 3);
    	a235 = a240;
    	a365 = "g";
    	a340 = a245[(a212 - 10)];
    	a285 = "e";
    	a215 = ((a212 / a337) - -11);
    	a263 = (a337 + 1);
    	a360 = (a201 - -2);
    	a373 = ((a337 * a337) + -47);
    	a212 = (a373 + 7);
    	a377 = a204;
    	a333 = "e";
    	a310 = "e";
    	a246 = a296;
    	a337 = 6; 
    	output = "Z";
    } 
}
private  void calculateOutputm66(String input) {
    if(((a381 == a218[1] && (a391 == a392[1] && a146 == a3[1])) && ((a212 == 10) && (((((a56 <=  44 && (input.equals(inputs[2]) && cf)) && ((19 < a88) && (133 >= a88))) && a353 == a343[1]) && (a333.equals("f"))) && (a283.equals("f")))))) {
    	a192 -= (a192 - 20) < a192 ? 1 : 0;
    	cf = false;
    	a136 = 6;
    	a146 = a3[((a136 / a360) + 2)];
    	a180 = (((((a400 * a349) * 10) / -9) * 1) + 2212); 
    	output = "Z";
    } 
    if((((((a263 == 9) && (a56 <=  44 && (input.equals(inputs[6]) && (a146 == a3[1] && cf)))) && (a278.equals("f"))) && (89 == a377[1])) && (((19 < a88) && (133 >= a88)) && ((a201 == 7) && (a391 == a392[1] && ((-110 < a295) && (16 >= a295))))))) {
    	cf = false;
    	a320 = a299;
    	a390 = (((((a390 + 2995) % 87) - -161) + 9534) - 9579);
    	a17 = "i";
    	a246 = a332;
    	a212 = 15;
    	a381 = a218[1];
    	a283 = "h";
    	a399 = a269;
    	a333 = "i";
    	a263 = 10;
    	a340 = a245[1];
    	a261 = a229[5];
    	a310 = "g";
    	a266 = a236;
    	a146 = a3[(a337 - 7)];
    	a201 = 8;
    	a244 = (((((a244 / 5) * 10) / 2) + 5592) + -5591);
    	a312 = a382[4];
    	a279 = ((((((a279 % 55) - -271) / 5) / 5) * 229) / 10);
    	a278 = "g";
    	a377 = a366;
    	a373 = 3;
    	a365 = "h";
    	a360 = 15;
    	a400 = ((((a400 - 9197) - -9237) * 10) / 9);
    	a391 = a392[1];
    	a291 = a307[5];
    	a295 = (((a295 + 23161) * 1) + 4932);
    	a353 = a343[6];
    	a209 = "i";
    	a235 = a374;
    	a349 = (((((a349 - 27902) % 109) + 174) * 9) / 10);
    	a237 = a265;
    	a215 = 16;
    	a302 = "i";
    	a337 = 13; 
    	output = "Y";
    } 
    if((((a146 == a3[1] && ((a337 == 7) && ((105 < a279) && (221 >= a279)))) && (20 == a266[1])) && (((75 < a390) && (251 >= a390)) && (((90 == a246[4]) && ((((19 < a88) && (133 >= a88)) && (cf && a56 <=  44)) && input.equals(inputs[5]))) && ((-103 < a400) && (-75 >= a400)))))) {
    	cf = false;
    	a133 = "g";
    	a56 = (((((((a56 * a88) % 14999) * 2) % 70) + 282) - -15687) - 15688); 
    	output = "U";
    } 
    if(((((((a209.equals("f")) && a312 == a382[1]) && (a263 == 9)) && input.equals(inputs[3])) && (a215 == 11)) && (((89 == a377[1]) && (a56 <=  44 && ((cf && ((19 < a88) && (133 >= a88))) && a146 == a3[1]))) && (90 == a246[4])))) {
    	cf = false;
    	if(((((a101.equals("e")) && a244 <=  94) || (90 == a246[4])) || !(a177 == 1))) {
    	a116 = "i";
    	a146 = a3[(a373 - -1)]; 
    	}else {
    	a24 = ((a337 / a263) - -11);
    	a1 = ((((((a88 * a56) % 14999) + 7358) % 26) - 87) * 1);
    	a146 = a3[a373];
    	}output = "S";
    } 
    if(((input.equals(inputs[4]) && (a146 == a3[1] && (((94 < a244) && (141 >= a244)) && ((95 == a399[3]) && (((-103 < a400) && (-75 >= a400)) && ((cf && a56 <=  44) && ((19 < a88) && (133 >= a88)))))))) && (((a263 == 9) && (a278.equals("f"))) && ((75 < a390) && (251 >= a390))))) {
    	cf = false;
    	a337 = 12;
    	a365 = "g";
    	a266 = a236;
    	a15 = 9;
    	a400 = (((((a400 * -1) / 10) * 9) / 10) / 5);
    	a360 = 15;
    	a390 = ((((a390 % 37) + 283) + -31) + 27);
    	a280 = (((((a280 % 63) + 210) + 7) + -6202) + 6147);
    	a237 = a328;
    	a295 = ((((a295 - 19656) * 10) / 9) - 3086);
    	a381 = a218[7];
    	a377 = a366;
    	a278 = "g";
    	a246 = a358;
    	a373 = 3;
    	a391 = a392[3];
    	a261 = a229[5];
    	a353 = a343[2];
    	a399 = a251;
    	a312 = a382[2];
    	a291 = a307[3];
    	a244 = (((((a244 * 5) % 23) - -100) - -196) - 177);
    	a310 = "h";
    	a201 = 8;
    	a340 = a245[1];
    	a215 = 15;
    	a320 = a372;
    	a283 = "h";
    	a146 = a3[(a263 - 2)];
    	a64 = a67[(a212 - 9)];
    	a209 = "g";
    	a349 = (((((a349 % 72) + 305) * 9) / 10) - 29);
    	a263 = 15;
    	a235 = a324;
    	a212 = 15; 
    	output = "W";
    } 
    if(((((-110 < a295) && (16 >= a295)) && ((a263 == 9) && (((19 < a88) && (133 >= a88)) && ((a278.equals("f")) && ((a283.equals("f")) && ((cf && a146 == a3[1]) && a56 <=  44)))))) && (input.equals(inputs[1]) && ((22 == a237[0]) && ((-103 < a400) && (-75 >= a400)))))) {
    	cf = false;
    	if((((a50 == 7) || (a133.equals("h"))) && (a338 == 5))) {
    	a283 = "f";
    	a295 = ((((a295 / 5) - -12537) * 10) / 9);
    	a246 = a358;
    	a399 = a251;
    	a212 = 13;
    	a193 = (((((((a390 * a244) % 14999) % 97) + -15) - -3840) - -10667) - 14559);
    	a373 = 9;
    	a353 = a343[1];
    	a381 = a218[1];
    	a320 = a372;
    	a278 = "h";
    	a390 = (((((a390 + 22307) * 1) + 4215) % 87) - -81);
    	a279 = (((((a279 * 32) / 10) - 17401) / 5) - -20115);
    	a266 = a211;
    	a146 = a3[(a337 + -1)];
    	a391 = a392[0];
    	a400 = ((((a400 * 10) / -9) + 22348) - -5036);
    	a76 = a70; 
    	}else {
    	a103 = ((a360 * a201) - 51);
    	a285 = "i";
    	a312 = a382[5];
    	a261 = a229[4];
    	a209 = "g";
    	a146 = a3[(a103 + -9)];
    	a24 = (a337 + 5);
    	}output = "V";
    } 
    if((((a360 == 9) && ((a212 == 10) && (((19 < a88) && (133 >= a88)) && (a146 == a3[1] && (a56 <=  44 && (cf && input.equals(inputs[0]))))))) && ((89 == a377[1]) && ((a312 == a382[1] && ((94 < a244) && (141 >= a244))) && (a333.equals("f")))))) {
    	cf = false;
    	a15 = (a201 - -1);
    	a146 = a3[(a360 - 2)];
    	a177 = (a15 - 7); 
    	output = "V";
    } 
    if((((a278.equals("f")) && ((a215 == 11) && (((19 < a88) && (133 >= a88)) && (((a146 == a3[1] && cf) && input.equals(inputs[7])) && a56 <=  44)))) && ((((22 == a237[0]) && a340 == a245[1]) && (a360 == 9)) && (89 == a377[1])))) {
    	cf = false;
    	a117 = a178[(a337 - 4)];
    	a146 = a3[a337];
    	a15 = (a360 - -3); 
    	output = "S";
    } 
    if((((a201 == 7) && (((23 < a349) && (243 >= a349)) && (((a373 == 3) && ((156 < a280) && (284 >= a280))) && a56 <=  44))) && ((a310.equals("f")) && ((a278.equals("f")) && (input.equals(inputs[9]) && (a146 == a3[1] && (cf && ((19 < a88) && (133 >= a88))))))))) {
    	cf = false;
    	if(((((!(a340 == 9) || (56 == a320[1])) && !(a79.equals("e"))) && !(87 == a282[5])) && !(a190.equals("g")))) {
    	a133 = "h";
    	a56 = (((((((a56 * a88) % 14999) % 70) + 280) + 2) + -4748) - -4748); 
    	}else {
    	a146 = a3[(a337 + -3)];
    	a116 = "g";
    	a104 = a148[(a373 - 1)];
    	}output = "Y";
    } 
    if(((((((156 < a280) && (284 >= a280)) && (((19 < a88) && (133 >= a88)) && (a56 <=  44 && cf))) && input.equals(inputs[8])) && (22 == a237[0])) && ((a283.equals("f")) && ((a215 == 11) && (a146 == a3[1] && (a381 == a218[1] && (95 == a399[3]))))))) {
    	cf = false;
    	if((a278.equals("g"))) {
    	a235 = a324;
    	a399 = a344;
    	a353 = a343[5];
    	a349 = ((((a349 % 109) + 27) + 60) + 25);
    	a340 = a245[0];
    	a244 = ((((((a244 % 23) - -108) + -4) / 5) * 48) / 10);
    	a312 = a382[5];
    	a263 = 13;
    	a320 = a217;
    	a146 = a3[(a337 - 1)];
    	a390 = ((((a390 / 5) + 200) * 9) / 10);
    	a285 = "f";
    	a279 = (((a279 - 5576) - -33222) * 1);
    	a360 = 11;
    	a310 = "i";
    	a333 = "h";
    	a373 = 3;
    	a278 = "f";
    	a212 = 9;
    	a193 = ((((((a56 * a88) % 14999) / 5) % 16) - 95) * 1);
    	a381 = a218[7];
    	a237 = a265;
    	a283 = "e";
    	a201 = 12;
    	a400 = ((((a400 % 13) - 88) + -2) + 0);
    	a391 = a392[3];
    	a209 = "h";
    	a261 = a229[4];
    	a280 = ((((((a280 % 63) + 183) * 10) / 9) / 5) - -143);
    	a291 = a307[5];
    	a76 = a70;
    	a215 = 11;
    	a246 = a358;
    	a295 = (((a295 + -11947) / 5) * 5);
    	a377 = a204;
    	a266 = a211;
    	a365 = "i";
    	a337 = 13; 
    	}else {
    	a127 = a29[(a263 - 8)];
    	a56 = ((((((a56 * a279) % 14999) % 82) - -126) * 1) - -3);
    	}output = "Z";
    } 
}
private  void calculateOutputm6(String input) {
    if(((((a215 == 11) && (a360 == 9)) && (20 == a266[1])) && ((((156 < a280) && (284 >= a280)) && ((a88 <=  19 && cf) && ((-103 < a400) && (-75 >= a400)))) && ((23 < a349) && (243 >= a349))))) {
    	calculateOutputm65(input);
    } 
    if(((((((-103 < a400) && (-75 >= a400)) && (((19 < a88) && (133 >= a88)) && cf)) && (a278.equals("f"))) && a261 == a229[1]) && ((a360 == 9) && ((a337 == 7) && (63 == a320[2]))))) {
    	calculateOutputm66(input);
    } 
}
private  void calculateOutputm70(String input) {
    if((((89 == a377[1]) && ((95 == a399[3]) && (input.equals(inputs[6]) && ((156 < a280) && (284 >= a280))))) && (a291 == a307[1] && (((a146 == a3[1] && (((44 < a56) && (210 >= a56)) && (a127 == a29[2] && cf))) && (a283.equals("f"))) && (a278.equals("f")))))) {
    	cf = false;
    	a116 = "i";
    	a146 = a3[(a201 + -3)];
    	a56 = ((((a56 - 3496) - 172) * 10) / 9); 
    	output = "U";
    } 
    if(((((a215 == 11) && (a127 == a29[2] && ((input.equals(inputs[9]) && (cf && ((44 < a56) && (210 >= a56)))) && a381 == a218[1]))) && (a263 == 9)) && (((a391 == a392[1] && a340 == a245[1]) && a353 == a343[1]) && a146 == a3[1]))) {
    	cf = false;
    	a285 = "g";
    	a360 = ((a201 / a201) - -9);
    	a338 = (a215 + -1);
    	a146 = a3[((a337 - a263) - -8)];
    	a237 = a328;
    	a278 = "g";
    	a390 = ((((((a390 * a244) % 14999) + 13237) - 15564) % 37) - -289);
    	a76 = a98;
    	a399 = a269;
    	a353 = a343[((a201 + a360) + -15)];
    	a337 = (a212 + -2);
    	a266 = a236;
    	a215 = (a360 - -2);
    	a377 = a204;
    	a291 = a307[(a201 - 5)];
    	a209 = "g";
    	a312 = a382[(a201 - 5)];
    	a349 = (((((((a56 * a280) % 14999) % 72) + 307) / 5) * 45) / 10);
    	a244 = ((((((a349 * a349) % 14999) / 5) % 57) + 162) - -25);
    	a373 = (a212 + -6);
    	a235 = a374;
    	a212 = ((a215 + a338) + -11);
    	a263 = (a201 + 1);
    	a280 = ((((((((a280 * a349) % 14999) % 39) + 285) + 0) * 5) % 39) + 313);
    	a295 = (((((a349 * a390) % 14999) + -19240) + 27687) - 37016);
    	a400 = ((((((((a390 * a390) % 14999) - -11520) % 13) - 89) * 5) % 13) + -85);
    	a310 = "e";
    	a333 = "g";
    	a340 = a245[(a201 - 5)];
    	a246 = a332;
    	a365 = "g";
    	a391 = a392[(a201 - 5)];
    	a261 = a229[((a201 - a201) - -2)];
    	a201 = (a360 + -2); 
    	output = "U";
    } 
    if(((a353 == a343[1] && ((a337 == 7) && ((a215 == 11) && input.equals(inputs[3])))) && ((((75 < a390) && (251 >= a390)) && ((a146 == a3[1] && ((a127 == a29[2] && cf) && ((44 < a56) && (210 >= a56)))) && ((94 < a244) && (141 >= a244)))) && ((156 < a280) && (284 >= a280))))) {
    	cf = false;
    	a266 = a211;
    	a209 = "f";
    	a263 = ((a373 / a215) - -8);
    	a400 = (((((((a244 * a279) % 14999) % 13) - 95) + 2) - -24434) + -24440);
    	a349 = ((((a56 * a244) * -1) - 33) + -270);
    	a116 = "f";
    	a285 = "e";
    	a320 = a217;
    	a215 = (a212 + 1);
    	a146 = a3[(a360 - 5)];
    	a373 = (a360 - 6);
    	a365 = "g";
    	a128 = (a201 - 2);
    	a340 = a245[(a201 - 7)]; 
    	output = "Z";
    } 
    if(((((75 < a390) && (251 >= a390)) && ((a285.equals("f")) && ((a127 == a29[2] && (a146 == a3[1] && cf)) && ((44 < a56) && (210 >= a56))))) && ((a337 == 7) && (a312 == a382[1] && ((a333.equals("f")) && ((63 == a320[2]) && input.equals(inputs[4]))))))) {
    	cf = false;
    	a353 = a343[(a263 - 9)];
    	a280 = (((((a280 * a244) % 14999) - 20153) - 8340) * 1);
    	a237 = a336;
    	a212 = (a337 - -2);
    	a244 = ((((a244 * a56) - -388) + -32951) * 1);
    	a391 = a392[(a263 + -9)];
    	a399 = a344;
    	a373 = (a360 - 7);
    	a278 = "e";
    	a285 = "e";
    	a390 = (((((((a390 * a400) % 14999) % 37) - -289) * 5) % 37) - -269);
    	a340 = a245[(a263 - 9)];
    	a215 = (a212 - -1);
    	a377 = a204;
    	a15 = (a201 + 5);
    	a333 = "e";
    	a360 = ((a337 * a337) + -41);
    	a381 = a218[(a212 - 9)];
    	a261 = a229[((a263 * a263) - 81)];
    	a201 = (a263 + -3);
    	a246 = a296;
    	a320 = a372;
    	a117 = a178[(a337 + -5)];
    	a310 = "e";
    	a146 = a3[(a263 - 2)];
    	a312 = a382[(a263 + -9)];
    	a291 = a307[(a215 - 10)];
    	a283 = "e";
    	a337 = ((a212 + a212) - 12);
    	a263 = ((a212 / a212) - -7); 
    	output = "U";
    } 
}
private  void calculateOutputm71(String input) {
    if((((((94 < a244) && (141 >= a244)) && (a146 == a3[1] && (((44 < a56) && (210 >= a56)) && ((cf && input.equals(inputs[5])) && a127 == a29[3])))) && (89 == a377[1])) && (((a373 == 3) && (a381 == a218[1] && a261 == a229[1])) && ((23 < a349) && (243 >= a349))))) {
    	cf = false;
    	a127 = a29[((a215 + a360) - 13)]; 
    	output = "Z";
    } 
    if(((((95 == a399[3]) && (((((44 < a56) && (210 >= a56)) && cf) && a146 == a3[1]) && (a263 == 9))) && ((156 < a280) && (284 >= a280))) && ((((23 < a349) && (243 >= a349)) && ((a373 == 3) && (a391 == a392[1] && a127 == a29[3]))) && input.equals(inputs[4])))) {
    	cf = false;
    	if((((a365.equals("g")) && (a212 == 10)) || !(a391 == a392[0]))) {
    	a146 = a3[(a212 + -7)];
    	a283 = "h";
    	a285 = "i";
    	a391 = a392[6];
    	a310 = "i";
    	a295 = (((((a295 % 62) - 45) + 25854) * 1) + -25855);
    	a390 = (((10 + 1576) / 5) - -2317);
    	a24 = (a201 + 6);
    	a79 = "h";
    	a201 = 11; 
    	}else {
    	a1 = ((((a56 * a295) - -24329) * 1) + 2117);
    	a340 = a245[7];
    	a310 = "h";
    	a109 = ((a201 - a263) + 3);
    	a381 = a218[3];
    	a209 = "i";
    	a400 = ((((a400 + -26736) * 1) * 10) / 9);
    	a349 = ((((a349 - -18596) - -10324) % 72) - -295);
    	a146 = a3[(a212 + -5)];
    	}output = "Z";
    } 
    if(((((a212 == 10) && ((a373 == 3) && (a261 == a229[1] && ((50 == a235[3]) && a127 == a29[3])))) && ((105 < a279) && (221 >= a279))) && ((a146 == a3[1] && ((cf && input.equals(inputs[2])) && ((44 < a56) && (210 >= a56)))) && a340 == a245[1]))) {
    	cf = false;
    	a261 = a229[0];
    	a103 = (a201 + 5);
    	a209 = "h";
    	a312 = a382[6];
    	a146 = a3[(a201 - 4)];
    	a310 = "e";
    	a24 = (a201 - -5); 
    	output = "Y";
    } 
    if(((((a333.equals("f")) && ((a209.equals("f")) && (a146 == a3[1] && ((cf && input.equals(inputs[6])) && ((44 < a56) && (210 >= a56)))))) && (50 == a235[3])) && (a261 == a229[1] && (a312 == a382[1] && (((-110 < a295) && (16 >= a295)) && a127 == a29[3]))))) {
    	cf = false;
    	a167 = (a212 + -6);
    	a136 = ((a167 - a212) - -14);
    	a146 = a3[(a136 - 6)]; 
    	output = "S";
    } 
    if(((a127 == a29[3] && (((22 == a237[0]) && ((a360 == 9) && (((-103 < a400) && (-75 >= a400)) && a146 == a3[1]))) && (a283.equals("f")))) && ((a285.equals("f")) && ((input.equals(inputs[3]) && (cf && ((44 < a56) && (210 >= a56)))) && (a201 == 7))))) {
    	cf = false;
    	a146 = a3[(a201 - 4)];
    	a30 = (a263 - -3);
    	a24 = ((a201 / a337) - -8); 
    	output = "U";
    } 
    if(((((((a215 == 11) && ((a201 == 7) && ((cf && input.equals(inputs[9])) && a127 == a29[3]))) && ((44 < a56) && (210 >= a56))) && ((23 < a349) && (243 >= a349))) && ((-103 < a400) && (-75 >= a400))) && ((a333.equals("f")) && (a381 == a218[1] && a146 == a3[1])))) {
    	cf = false;
    	a146 = a3[a201];
    	a64 = a67[(a201 + -2)];
    	a15 = (a337 - -2); 
    	output = "S";
    } 
    if(((a291 == a307[1] && ((((44 < a56) && (210 >= a56)) && (((-103 < a400) && (-75 >= a400)) && a127 == a29[3])) && a340 == a245[1])) && ((a337 == 7) && (((a146 == a3[1] && (input.equals(inputs[8]) && cf)) && (a285.equals("f"))) && ((105 < a279) && (221 >= a279)))))) {
    	cf = false;
    	if((!(a360 == 9) || ((((-79 < a54) && (134 >= a54)) || !(18 == a61[5])) && !(a190.equals("i"))))) {
    	a291 = a307[5];
    	a201 = 12;
    	a235 = a240;
    	a381 = a218[0];
    	a136 = ((a212 + a212) + -13);
    	a278 = "f";
    	a266 = a211;
    	a377 = a204;
    	a263 = 11;
    	a365 = "h";
    	a261 = a229[7];
    	a146 = a3[(a337 + -5)];
    	a285 = "i";
    	a309 = (a215 - 3);
    	a337 = 12;
    	a212 = 16;
    	a215 = 16; 
    	}else {
    	a349 = (((a349 + 23383) * 1) / -5);
    	a266 = a221;
    	a365 = "e";
    	a312 = a382[6];
    	a261 = a229[7];
    	a373 = 5;
    	a278 = "h";
    	a337 = 12;
    	a136 = ((a212 - a201) - -1);
    	a333 = "h";
    	a353 = a343[5];
    	a390 = (((11 - 11940) * 2) + -5433);
    	a279 = ((((a279 / 5) - -115) + 12113) + -12120);
    	a399 = a251;
    	a215 = 10;
    	a263 = 9;
    	a146 = a3[((a136 * a136) - 14)];
    	a295 = (((a295 / 5) - 80) + -8);
    	a381 = a218[4];
    	a360 = 9;
    	a246 = a358;
    	a320 = a372;
    	a400 = ((((a400 - 24344) * 10) / -9) - -2609);
    	a285 = "h";
    	a209 = "f";
    	a283 = "h";
    	a340 = a245[5];
    	a377 = a204;
    	a391 = a392[7];
    	a237 = a336;
    	a235 = a324;
    	a244 = (((((a244 / 5) + 111) / 5) * 37) / 10);
    	a201 = 13;
    	a212 = 9;
    	a291 = a307[4];
    	a280 = (((a280 - 24158) + -3764) * 1);
    	a142 = a112;
    	}output = "W";
    } 
    if(((a381 == a218[1] && (((44 < a56) && (210 >= a56)) && (a127 == a29[3] && ((a201 == 7) && (a146 == a3[1] && (cf && input.equals(inputs[1]))))))) && ((((63 == a320[2]) && (20 == a266[1])) && (95 == a399[3])) && (90 == a246[4])))) {
    	cf = false;
    	a333 = "f";
    	a146 = a3[(a373 - -4)];
    	a381 = a218[6];
    	a337 = 7;
    	a235 = a374;
    	a353 = a343[3];
    	a377 = a366;
    	a295 = (((a295 - -173) - -7323) - 7307);
    	a263 = 11;
    	a360 = 9;
    	a312 = a382[4];
    	a15 = (a201 - -5);
    	a212 = 15;
    	a278 = "i";
    	a340 = a245[6];
    	a246 = a358;
    	a266 = a211;
    	a280 = ((((a280 + -14349) / 5) * 10) / -9);
    	a215 = 16;
    	a283 = "g";
    	a201 = 9;
    	a373 = 5;
    	a310 = "g";
    	a237 = a265;
    	a285 = "f";
    	a291 = a307[5];
    	a390 = (((95 + 117) + 26) - 35);
    	a365 = "h";
    	a261 = a229[7];
    	a391 = a392[7];
    	a117 = a178[(a15 + -11)]; 
    	output = "S";
    } 
    if((((a365.equals("f")) && (a261 == a229[1] && (((63 == a320[2]) && (((cf && a127 == a29[3]) && a146 == a3[1]) && input.equals(inputs[0]))) && (a201 == 7)))) && ((a312 == a382[1] && ((-103 < a400) && (-75 >= a400))) && ((44 < a56) && (210 >= a56))))) {
    	cf = false;
    	if((!(58 == a130[0]) && ((a95.equals("f")) && ((a64 == a67[6] || !(a249 == 7)) && (23 == a61[4]))))) {
    	a291 = a307[3];
    	a360 = 14;
    	a263 = 15;
    	a246 = a358;
    	a340 = a245[6];
    	a266 = a236;
    	a399 = a269;
    	a379 = (a201 - -2);
    	a312 = a382[7];
    	a353 = a343[3];
    	a279 = (((((a279 % 55) + 226) + -15551) - 10549) + 26097);
    	a373 = 5;
    	a237 = a265;
    	a244 = ((((a244 / 5) / 5) * 5) + 1421);
    	a377 = a366;
    	a333 = "i";
    	a320 = a372;
    	a349 = (((((a349 * 163) / 10) - 20533) - 9259) - -51870);
    	a215 = 12;
    	a209 = "f";
    	a365 = "i";
    	a285 = "i";
    	a390 = ((((33 - -17813) + -17677) - 9789) - -9748);
    	a15 = (a337 + 7);
    	a146 = a3[(a379 - 2)];
    	a235 = a324;
    	a261 = a229[4];
    	a283 = "g";
    	a310 = "f";
    	a337 = 13;
    	a400 = (((a400 * 5) * 5) + 21978);
    	a295 = ((((a295 % 62) - 46) + 1) + -3);
    	a280 = ((((a280 * 5) % 39) + 296) * 1);
    	a278 = "i";
    	a391 = a392[7];
    	a381 = a218[2];
    	a212 = 15;
    	a201 = 10; 
    	}else {

    	}output = "Z";
    } 
    if((((a146 == a3[1] && (((-110 < a295) && (16 >= a295)) && (a278.equals("f")))) && a127 == a29[3]) && (a353 == a343[1] && ((((input.equals(inputs[7]) && (cf && ((44 < a56) && (210 >= a56)))) && (a209.equals("f"))) && (a283.equals("f"))) && (a365.equals("f")))))) {
    	cf = false;
    	if(((28 < a27) && (205 >= a27))) {
    	a76 = a48;
    	a146 = a3[((a373 - a373) + 6)];
    	a61 = a28; 
    	}else {
    	a325 = "e";
    	a116 = "h";
    	a146 = a3[((a373 + a373) - 2)];
    	}output = "W";
    } 
}
private  void calculateOutputm73(String input) {
    if((((((a127 == a29[5] && ((-110 < a295) && (16 >= a295))) && (a310.equals("f"))) && a353 == a343[1]) && a291 == a307[1]) && ((a373 == 3) && (((75 < a390) && (251 >= a390)) && (((44 < a56) && (210 >= a56)) && ((cf && input.equals(inputs[3])) && a146 == a3[1])))))) {
    	cf = false;
    	a340 = a245[((a201 * a263) + -63)];
    	a381 = a218[(a263 + -9)];
    	a209 = "e";
    	a353 = a343[(a263 - 8)];
    	a278 = "e";
    	a391 = a392[(a201 - 7)];
    	a101 = "f";
    	a365 = "e";
    	a291 = a307[(a212 - 10)];
    	a56 = (((((a56 * a400) * 1) * 10) / -9) - -395);
    	a280 = ((((((a244 * a244) % 63) + 205) / 5) + 7847) + -7629);
    	a349 = (((((a390 * a280) % 14999) - -7304) * -1) + -7336); 
    	output = "W";
    } 
    if(((((-103 < a400) && (-75 >= a400)) && ((22 == a237[0]) && ((((a333.equals("f")) && ((((44 < a56) && (210 >= a56)) && cf) && a127 == a29[5])) && (a215 == 11)) && input.equals(inputs[1])))) && ((a146 == a3[1] && a340 == a245[1]) && (a310.equals("f"))))) {
    	cf = false;
    	a128 = ((a201 / a215) + 4);
    	a235 = a374;
    	a278 = "f";
    	a365 = "g";
    	a116 = "f";
    	a209 = "f";
    	a391 = a392[((a337 / a360) - -1)];
    	a146 = a3[a128]; 
    	output = "V";
    } 
    if((((90 == a246[4]) && (a127 == a29[5] && (a146 == a3[1] && ((input.equals(inputs[2]) && (cf && ((44 < a56) && (210 >= a56)))) && (a215 == 11))))) && ((((94 < a244) && (141 >= a244)) && ((a365.equals("f")) && (a337 == 7))) && (a333.equals("f"))))) {
    	cf = false;
    	a201 = (a373 - -5);
    	a266 = a236;
    	a390 = (((((a390 * a400) / 5) % 37) - -321) + -13);
    	a76 = a98;
    	a338 = (a337 + -2);
    	a235 = a374;
    	a146 = a3[(a360 + -3)];
    	a291 = a307[((a337 * a215) + -75)];
    	a261 = a229[(a373 - 1)];
    	a399 = a269;
    	a215 = (a212 + 2);
    	a353 = a343[((a212 + a373) - 11)];
    	a360 = (a373 - -7);
    	a373 = (a212 - 6); 
    	output = "Z";
    } 
    if((((((a201 == 7) && (a127 == a29[5] && (22 == a237[0]))) && (a373 == 3)) && ((89 == a377[1]) && ((a360 == 9) && ((20 == a266[1]) && (input.equals(inputs[5]) && (a146 == a3[1] && (((44 < a56) && (210 >= a56)) && cf))))))) && a71 <= -25)) {
    	cf = false;
    	a50 = a0[(a337 + -2)];
    	a24 = (a337 + 1);
    	a146 = a3[(a24 - 5)]; 
    	output = "U";
    } 
}
private  void calculateOutputm74(String input) {
    if((((a146 == a3[1] && (((44 < a56) && (210 >= a56)) && cf)) && (a337 == 7)) && (a340 == a245[1] && ((((105 < a279) && (221 >= a279)) && (a127 == a29[6] && ((a312 == a382[1] && a353 == a343[1]) && input.equals(inputs[0])))) && (90 == a246[4]))))) {
    	cf = false;
    	a27 = (((((a56 * a56) % 14999) + -28410) - 300) + -781);
    	a24 = a212;
    	a146 = a3[(a212 - 7)]; 
    	output = "Z";
    } 
    if((((a365.equals("f")) && ((input.equals(inputs[4]) && ((a263 == 9) && (a285.equals("f")))) && (a209.equals("f")))) && ((a146 == a3[1] && ((((44 < a56) && (210 >= a56)) && (cf && a127 == a29[6])) && a261 == a229[1])) && (20 == a266[1])))) {
    	a59 -= (a59 - 20) < a59 ? 4 : 0;
    	cf = false;
    	if((a312 == a382[5] || ((!(a177 == 7) && ((69 == a320[2]) && a180 <=  144)) && !(a302.equals("h"))))) {
    	a246 = a358;
    	a337 = (a263 + -3);
    	a266 = a221;
    	a333 = "e";
    	a244 = ((((((a390 * a400) % 14999) * 2) / 5) - -4137) + -15849);
    	a235 = a374;
    	a279 = (((((a279 * a56) % 14999) / 5) + -28848) * 1);
    	a391 = a392[(a201 - 6)];
    	a295 = ((((((a244 * a244) % 14999) - 10259) % 14945) + -15054) - 0);
    	a285 = "e";
    	a353 = a343[(a263 + -9)];
    	a189 = "h";
    	a399 = a344;
    	a365 = "g";
    	a400 = ((((((((a400 * a279) % 14999) % 13) + -89) + -1) * 5) % 13) - 87);
    	a146 = a3[((a212 - a215) + 1)];
    	a373 = (a263 + -7);
    	a17 = "h";
    	a340 = a245[((a212 / a337) + -1)];
    	a349 = ((((((a56 * a295) % 14999) % 109) - -133) - 1) + 0);
    	a291 = a307[((a373 / a373) - 1)];
    	a261 = a229[(a215 - 11)];
    	a278 = "f";
    	a360 = ((a373 + a263) + -3);
    	a215 = (a201 - -4);
    	a280 = ((((((a295 * a244) % 14999) / 5) - -26755) * 1) + -42019);
    	a212 = (a201 - -3);
    	a209 = "e";
    	a237 = a336;
    	a377 = a204;
    	a263 = ((a337 * a337) + -28); 
    	}else {
    	a337 = ((a215 / a215) + 7);
    	a76 = a98;
    	a235 = a374;
    	a261 = a229[((a215 - a215) - -2)];
    	a201 = a337;
    	a310 = "g";
    	a295 = ((((((((a56 * a279) % 14999) % 95) + 23) * 9) / 10) * 10) / 9);
    	a365 = "g";
    	a283 = "g";
    	a209 = "g";
    	a353 = a343[(a212 + -8)];
    	a291 = a307[(a263 + -7)];
    	a391 = a392[(a337 - 6)];
    	a280 = ((((((a279 * a56) % 14999) % 39) + 300) + 3100) + -3081);
    	a338 = (a360 - 1);
    	a312 = a382[(a337 - 6)];
    	a237 = a328;
    	a390 = ((((((((a56 * a56) % 14999) % 37) - -270) - 9942) * 3) % 37) + 289);
    	a266 = a236;
    	a381 = a218[(a215 + -9)];
    	a400 = ((((((a400 * a295) % 53) - 10) + -10) + -16397) - -16443);
    	a146 = a3[(a373 + 3)];
    	a263 = (a215 - 1);
    	a399 = a269;
    	a373 = ((a201 - a215) - -7);
    	a333 = "g";
    	a212 = a215;
    	a279 = ((((((a279 * a390) % 14999) + -28704) * 1) % 55) - -306);
    	a215 = (a337 - -4);
    	}output = "X";
    } 
}
private  void calculateOutputm7(String input) {
    if(((((((a310.equals("f")) && a291 == a307[1]) && a312 == a382[1]) && (a373 == 3)) && (22 == a237[0])) && (a381 == a218[1] && (a127 == a29[2] && cf)))) {
    	calculateOutputm70(input);
    } 
    if((((95 == a399[3]) && ((((a212 == 10) && ((a333.equals("f")) && (a360 == 9))) && a261 == a229[1]) && (a215 == 11))) && (cf && a127 == a29[3]))) {
    	calculateOutputm71(input);
    } 
    if((((50 == a235[3]) && (((a360 == 9) && (a127 == a29[5] && cf)) && (a285.equals("f")))) && (((75 < a390) && (251 >= a390)) && ((a212 == 10) && a291 == a307[1])))) {
    	calculateOutputm73(input);
    } 
    if(((((a310.equals("f")) && a340 == a245[1]) && (a333.equals("f"))) && (((-103 < a400) && (-75 >= a400)) && ((a353 == a343[1] && (cf && a127 == a29[6])) && a391 == a392[1])))) {
    	calculateOutputm74(input);
    } 
}
private  void calculateOutputm78(String input) {
    if((((a373 == 3) && ((95 == a399[3]) && (((a146 == a3[1] && (cf && (a101.equals("f")))) && 352 < a56) && input.equals(inputs[4])))) && (a312 == a382[1] && ((a215 == 11) && ((a283.equals("f")) && (a263 == 9)))))) {
    	cf = false;
    	if(((a212 == 12) && (a95.equals("h")))) {
    	a340 = a245[(a360 - 8)];
    	a291 = a307[((a337 - a201) + 1)];
    	a280 = ((((((((a280 * a279) % 14999) % 39) - -310) - 18) * 5) % 39) - -309);
    	a56 = ((((((a56 % 82) + 102) * 9) / 10) + -1726) - -1710);
    	a209 = "g";
    	a391 = a392[((a263 + a373) - 10)];
    	a365 = "f";
    	a127 = a29[(a373 - -2)];
    	a381 = a218[((a215 + a373) + -12)];
    	a278 = "g";
    	a349 = ((((((a400 * a279) / 5) - 639) * 5) % 109) + 191); 
    	}else {
    	a162 = ((((((a295 * a280) % 14999) % 14963) - 15035) + -3) * 1);
    	a365 = "f";
    	a24 = a201;
    	a349 = ((((((a280 * a56) % 14999) % 109) + 84) - -41) + -81);
    	a291 = a307[((a337 - a360) + 3)];
    	a209 = "g";
    	a146 = a3[((a215 + a215) - 19)];
    	a340 = a245[(a373 - 2)];
    	a278 = "g";
    	a381 = a218[(a263 + -8)];
    	a391 = a392[(a215 - 10)];
    	}output = "W";
    } 
    if((((((-110 < a295) && (16 >= a295)) && a261 == a229[1]) && a146 == a3[1]) && ((63 == a320[2]) && (((a101.equals("f")) && ((22 == a237[0]) && ((352 < a56 && (input.equals(inputs[3]) && cf)) && (a333.equals("f"))))) && ((-103 < a400) && (-75 >= a400)))))) {
    	cf = false;
    	a215 = ((a360 - a360) - -10);
    	a201 = (a212 + -2);
    	a373 = ((a360 / a337) - -1);
    	a310 = "e";
    	a263 = ((a360 * a215) + -82);
    	a353 = a343[(a360 - 9)];
    	a266 = a221;
    	a285 = "e";
    	a312 = a382[((a337 + a215) + -17)];
    	a244 = (((((a244 * a400) % 23) + 124) + -5) * 1);
    	a237 = a336;
    	a15 = (a212 + 4);
    	a400 = (((((((a349 * a390) % 14999) - -7545) * 1) - -1805) % 14948) - 15050);
    	a280 = (((((a56 * a390) % 14999) - -10438) / 5) * -5);
    	a377 = a204;
    	a379 = (a360 + 1);
    	a399 = a344;
    	a333 = "e";
    	a320 = a217;
    	a212 = ((a360 / a360) - -8);
    	a279 = (((((a279 * a280) % 14999) + 14393) / 5) + -29682);
    	a261 = a229[((a215 + a215) - 18)];
    	a295 = ((((((a295 * a400) % 14999) - 11292) % 14945) + -15054) - 0);
    	a337 = (a360 - 3);
    	a283 = "e";
    	a235 = a240;
    	a390 = ((((((a390 * a56) % 14999) - 25114) * 1) * 10) / 9);
    	a246 = a296;
    	a146 = a3[(a379 + -3)];
    	a360 = ((a215 * a263) + -72); 
    	output = "S";
    } 
    if((((a283.equals("f")) && (((-110 < a295) && (16 >= a295)) && (a312 == a382[1] && (((90 == a246[4]) && (a310.equals("f"))) && 352 < a56)))) && (input.equals(inputs[5]) && (((cf && a146 == a3[1]) && (a101.equals("f"))) && ((75 < a390) && (251 >= a390)))))) {
    	a154 += (a154 + 20) > a154 ? 2 : 0;
    	a71 -= (a71 - 20) < a71 ? 4 : 0;
    	a157 -= (a157 - 20) < a157 ? 4 : 0;
    	a192 += (a192 + 20) > a192 ? 1 : 0;
    	cf = false;
    	a79 = "h";
    	a349 = (((((((a280 * a244) % 14999) - -14673) - -198) - -114) % 109) + 123);
    	a340 = a245[(a337 - 6)];
    	a209 = "f";
    	a24 = ((a201 * a215) + -64);
    	a283 = "e";
    	a278 = "f";
    	a381 = a218[(a337 - 6)];
    	a295 = ((((((a295 * a390) % 14945) - 15054) - 1) / 5) + -9934);
    	a146 = a3[((a24 - a337) - 3)];
    	a285 = "e";
    	a201 = (a24 + -7);
    	a390 = ((((((a390 * a244) % 14999) / 5) - 29058) % 37) + 317);
    	a365 = "f";
    	a291 = a307[(a212 + -9)]; 
    	output = "U";
    } 
    if((((a333.equals("f")) && (((input.equals(inputs[6]) && ((156 < a280) && (284 >= a280))) && (a212 == 10)) && ((-110 < a295) && (16 >= a295)))) && ((a285.equals("f")) && ((352 < a56 && (((a101.equals("f")) && cf) && a146 == a3[1])) && ((94 < a244) && (141 >= a244)))))) {
    	cf = false;
    	a285 = "e";
    	a400 = ((((a400 * a390) - 3562) / 5) + -5140);
    	a146 = a3[(a373 / a360)];
    	a377 = a204;
    	a244 = ((((a244 * a295) - 13239) * 1) + -575);
    	a152 = a143;
    	a360 = (a212 + -2);
    	a17 = "f";
    	a373 = (a337 + -5);
    	a261 = a229[(a201 - 7)];
    	a266 = a221;
    	a235 = a240;
    	a215 = (a263 - -1);
    	a263 = (a215 - 2); 
    	output = "W";
    } 
}
private  void calculateOutputm9(String input) {
    if((((((a373 == 3) && ((63 == a320[2]) && (20 == a266[1]))) && (90 == a246[4])) && a312 == a382[1]) && ((a201 == 7) && ((a101.equals("f")) && cf)))) {
    	calculateOutputm78(input);
    } 
}
private  void calculateOutputm83(String input) {
    if((((((((a249 == 7) && cf) && a146 == a3[2]) && a381 == a218[2]) && (a212 == 11)) && (32 == a237[4])) && (((141 < a244) && (256 >= a244)) && (input.equals(inputs[0]) && ((a136 == 3) && ((a360 == 10) && (97 == a246[5]))))))) {
    	cf = false;
    	a400 = ((((a400 * 5) * 5) * 5) - 17479);
    	a266 = a221;
    	a373 = 5;
    	a244 = (((a244 + 28441) - 27522) + 23052);
    	a246 = a296;
    	a127 = a29[(a360 - 7)];
    	a56 = ((((((a390 * a390) % 14999) % 82) + 128) / 5) - -103);
    	a391 = a392[3];
    	a333 = "g";
    	a279 = (((a279 - -4258) - 2997) * 5);
    	a349 = ((((a349 * 10) / 6) - -8882) * 3);
    	a263 = 14;
    	a261 = a229[4];
    	a377 = a204;
    	a381 = a218[3];
    	a337 = 6;
    	a340 = a245[7];
    	a280 = (((a280 - 8745) - -38163) * -1);
    	a235 = a374;
    	a209 = "h";
    	a146 = a3[(a215 - a212)];
    	a285 = "h";
    	a295 = (((a295 - -11072) + 13743) * 1);
    	a365 = "i";
    	a360 = 14;
    	a278 = "h";
    	a215 = 15;
    	a212 = 12;
    	a353 = a343[2];
    	a201 = 12;
    	a291 = a307[7];
    	a312 = a382[2];
    	a237 = a328;
    	a320 = a217;
    	a283 = "i";
    	a399 = a269;
    	a390 = (((a390 - 29465) * 1) - 376); 
    	output = "Z";
    } 
    if(((((input.equals(inputs[9]) && ((a136 == 3) && cf)) && (a201 == 8)) && (69 == a320[2])) && (a291 == a307[2] && (((a365.equals("g")) && (((a249 == 7) && (a278.equals("g"))) && a353 == a343[2])) && a146 == a3[2])))) {
    	cf = false;
    	if((((a104 == 10) && (((a155.equals("e")) && a54 <=  -79) && !(a127 == a29[6]))) || !(a353 == 7))) {
    	a146 = a3[(a136 - 2)];
    	a133 = "h";
    	a56 = (((48 - -245) - -14182) + -14156); 
    	}else {
    	a19 = ((((((a349 * a280) % 14999) + -7931) - 10053) + 25132) * -1);
    	a399 = a344;
    	a400 = (((a400 + 8650) + 17640) + 2043);
    	a263 = 10;
    	a390 = (((((a390 * 5) * 5) - 9104) % 37) - -314);
    	a283 = "g";
    	a237 = a265;
    	a209 = "e";
    	a312 = a382[4];
    	a337 = 8;
    	a279 = ((((a279 + -14961) * 10) / -9) - -6368);
    	a320 = a372;
    	a381 = a218[2];
    	a291 = a307[5];
    	a310 = "f";
    	a365 = "i";
    	a353 = a343[1];
    	a246 = a358;
    	a391 = a392[2];
    	a212 = 15;
    	a261 = a229[5];
    	a377 = a281;
    	a244 = ((((((a244 % 23) + 103) * 10) / 9) + -24056) - -24045);
    	a15 = (a360 - -3);
    	a295 = (((((a295 % 62) + -54) * 5) % 62) - 47);
    	a285 = "i";
    	a278 = "f";
    	a235 = a324;
    	a266 = a211;
    	a349 = (((((a349 % 72) + 286) / 5) * 45) / 10);
    	a201 = 9;
    	a340 = a245[7];
    	a146 = a3[(a136 + 4)];
    	a373 = 6;
    	a215 = 16;
    	a333 = "f";
    	a360 = 14;
    	a280 = ((((a280 / 5) / 5) * 5) - -252);
    	}output = "S";
    } 
    if((((a365.equals("g")) && ((a291 == a307[2] && (a201 == 8)) && input.equals(inputs[8]))) && (a340 == a245[2] && (((a373 == 4) && ((a249 == 7) && (a146 == a3[2] && (cf && (a136 == 3))))) && (a212 == 11))))) {
    	cf = false;
    	if((a373 == 3)) {
    	a285 = "h";
    	a24 = (a337 + 4);
    	a373 = 4;
    	a244 = ((((a244 * 5) - -3552) * 5) * -1);
    	a310 = "e";
    	a381 = a218[5];
    	a360 = 8;
    	a333 = "i";
    	a246 = a332;
    	a212 = 14;
    	a312 = a382[0];
    	a390 = ((((a390 * 13) / 10) + 28909) - -303);
    	a103 = (a201 + 2);
    	a201 = 12;
    	a377 = a281;
    	a340 = a245[4];
    	a235 = a240;
    	a291 = a307[7];
    	a279 = (((a279 + -14404) - 6541) * 1);
    	a399 = a344;
    	a353 = a343[7];
    	a365 = "h";
    	a263 = 15;
    	a237 = a265;
    	a391 = a392[6];
    	a400 = (((a400 - -13153) - -14320) * 1);
    	a261 = a229[0];
    	a320 = a299;
    	a215 = 17;
    	a295 = ((((a295 - 28704) + -485) + 2656) - -51080);
    	a349 = (((a349 + -4693) / 5) + -13257);
    	a283 = "h";
    	a146 = a3[a136];
    	a278 = "g";
    	a280 = (((((a280 - 6485) % 39) + 330) / 5) + 286);
    	a209 = "e";
    	a337 = 12; 
    	}else {
    	a190 = "e";
    	a136 = (a201 - -1);
    	}output = "Z";
    } 
    if(((((284 < a280) && (364 >= a280)) && ((a209.equals("g")) && (((a201 == 8) && input.equals(inputs[1])) && (a285.equals("g"))))) && ((a249 == 7) && (a291 == a307[2] && ((32 == a237[4]) && ((cf && a146 == a3[2]) && (a136 == 3))))))) {
    	cf = false;
    	a312 = a382[2];
    	a320 = a299;
    	a291 = a307[3];
    	a340 = a245[4];
    	a310 = "h";
    	a212 = 15;
    	a283 = "i";
    	a246 = a296;
    	a109 = (a337 - 6);
    	a280 = (((a280 * -5) - 18253) - 2459);
    	a261 = a229[3];
    	a279 = (((a279 + -13208) * 2) / 5);
    	a349 = (((a349 * -5) - 24994) / 5);
    	a333 = "e";
    	a244 = ((((a244 % 57) - -182) - -13) + -20);
    	a266 = a221;
    	a215 = 15;
    	a360 = 13;
    	a381 = a218[0];
    	a209 = "g";
    	a263 = 15;
    	a373 = 9;
    	a400 = (((a400 - 16138) - 11473) + -628);
    	a365 = "g";
    	a113 = "f";
    	a399 = a269;
    	a377 = a281;
    	a146 = a3[(a201 - 3)];
    	a390 = ((((a390 / 5) + 203) - -357) + -324);
    	a353 = a343[2];
    	a295 = ((((((a295 % 62) + -94) + 9) * 5) % 62) - 41);
    	a285 = "h";
    	a235 = a374;
    	a337 = 11;
    	a278 = "h";
    	a391 = a392[3];
    	a237 = a328;
    	a201 = 10; 
    	output = "Z";
    } 
    if((((a337 == 8) && (((cf && (a136 == 3)) && a146 == a3[2]) && (a249 == 7))) && ((32 == a237[4]) && (((221 < a279) && (333 >= a279)) && (input.equals(inputs[3]) && (a391 == a392[2] && (a340 == a245[2] && a291 == a307[2]))))))) {
    	cf = false;
    	if((!(41 == a235[0]) || a19 <=  14)) {
    	a333 = "h";
    	a261 = a229[3];
    	a285 = "h";
    	a390 = (((((a390 % 37) - -272) - -13) - -21136) + -21144);
    	a365 = "h";
    	a127 = a29[(a212 - 6)];
    	a399 = a344;
    	a400 = ((((a400 + 16783) / 5) * 10) / 9);
    	a146 = a3[(a249 - 6)];
    	a312 = a382[3];
    	a263 = 11;
    	a360 = 8;
    	a353 = a343[2];
    	a320 = a217;
    	a295 = ((((a295 % 95) + 110) + 3) + 1);
    	a279 = (((((a279 * 5) + -27141) / 5) % 55) + 305);
    	a201 = 6;
    	a377 = a204;
    	a215 = 17;
    	a266 = a236;
    	a246 = a332;
    	a349 = ((((a349 + 3787) % 72) + 283) - -6);
    	a310 = "h";
    	a244 = (((a244 + -6583) + -6162) + 40397);
    	a340 = a245[5];
    	a283 = "i";
    	a291 = a307[5];
    	a337 = 10;
    	a235 = a374;
    	a373 = 5;
    	a56 = ((((13 / 5) - 23031) / 5) + 4655);
    	a237 = a328;
    	a212 = 11; 
    	}else {
    	a349 = ((((a349 - -16243) * 10) / 9) * 1);
    	a285 = "g";
    	a261 = a229[2];
    	a244 = ((((a244 - 2319) * 10) / 9) / 5);
    	a283 = "e";
    	a215 = 17;
    	a263 = 15;
    	a280 = (((a280 * 5) / 5) * -5);
    	a360 = 11;
    	a291 = a307[3];
    	a340 = a245[6];
    	a390 = ((((a390 + -23511) + 46901) * 1) * -1);
    	a373 = 5;
    	a235 = a240;
    	a246 = a332;
    	a400 = ((((((a400 % 53) - 21) * 5) + -27044) % 53) - 6);
    	a146 = a3[(a201 + -5)];
    	a237 = a328;
    	a266 = a236;
    	a279 = (((((a279 / 5) - -20813) - 40085) * -1) / 10);
    	a377 = a281;
    	a312 = a382[2];
    	a310 = "g";
    	a391 = a392[0];
    	a333 = "e";
    	a399 = a344;
    	a24 = (a212 - 4);
    	a381 = a218[3];
    	a162 = ((((9 * 10) / -1) / 5) - 25496);
    	a320 = a217;
    	a295 = (((a295 - -22201) + 6566) + 301);
    	a365 = "g";
    	a353 = a343[6];
    	a212 = 15;
    	a337 = 10;
    	a201 = 12;
    	}output = "S";
    } 
    if((((102 == a399[4]) && ((a146 == a3[2] && (a337 == 8)) && (a136 == 3))) && ((((a278.equals("g")) && (((-75 < a400) && (33 >= a400)) && ((input.equals(inputs[6]) && cf) && (a249 == 7)))) && a340 == a245[2]) && ((141 < a244) && (256 >= a244))))) {
    	cf = false;
    	if((((23 < a349) && (243 >= a349)) || ((23 == a61[4]) && !(a360 == 11)))) {
    	a180 = ((((((((a244 * a295) % 14999) - -10404) % 93) + 345) / 5) * 39) / 10);
    	a320 = a217;
    	a400 = (((a400 + 21895) * 1) + 1812);
    	a279 = (((a279 + -6390) - 8680) + 43058);
    	a283 = "i";
    	a340 = a245[6];
    	a278 = "g";
    	a399 = a269;
    	a353 = a343[6];
    	a365 = "f";
    	a136 = ((a249 / a249) - -5);
    	a244 = ((((((a244 % 23) - -114) - -4) * 5) % 23) + 105); 
    	}else {
    	a377 = a204;
    	a261 = a229[2];
    	a365 = "f";
    	a279 = (((a279 / 5) * 5) - -2);
    	a310 = "g";
    	a201 = 6;
    	a320 = a217;
    	a333 = "g";
    	a209 = "f";
    	a278 = "i";
    	a244 = (((a244 + -14950) - 6149) + -2098);
    	a266 = a211;
    	a390 = ((((a390 * 5) * 5) * 10) / 9);
    	a349 = (((a349 - -7646) / 5) * 5);
    	a215 = 12;
    	a360 = 14;
    	a283 = "h";
    	a263 = 12;
    	a353 = a343[4];
    	a246 = a296;
    	a291 = a307[5];
    	a400 = ((((a400 % 13) - 87) * 1) * 1);
    	a399 = a269;
    	a127 = a29[((a136 / a337) + 2)];
    	a340 = a245[7];
    	a373 = 6;
    	a235 = a374;
    	a280 = (((a280 - -5349) * 5) + 1195);
    	a146 = a3[(a249 - 6)];
    	a212 = 12;
    	a56 = ((((26 - -120) * 5) - 16353) - -15815);
    	a381 = a218[6];
    	a391 = a392[3];
    	a312 = a382[4];
    	a295 = (((((a295 * 5) % 95) - -27) * 10) / 9);
    	a237 = a328;
    	a285 = "e";
    	a337 = 8;
    	}output = "S";
    } 
    if((((a201 == 8) && ((a360 == 10) && (a146 == a3[2] && (a337 == 8)))) && (a261 == a229[2] && ((32 == a237[4]) && (((141 < a244) && (256 >= a244)) && ((((a249 == 7) && cf) && input.equals(inputs[2])) && (a136 == 3))))))) {
    	cf = false;
    	if((((a278.equals("i")) || a340 == a245[0]) || !(a166 == 10))) {
    	a280 = (((a280 * 5) - -11544) * 2);
    	a333 = "g";
    	a278 = "e";
    	a201 = 9;
    	a291 = a307[6];
    	a279 = (((a279 / 5) / 5) / 5);
    	a261 = a229[6];
    	a365 = "g";
    	a312 = a382[7];
    	a381 = a218[7];
    	a127 = a29[((a263 + a360) - 17)];
    	a215 = 17;
    	a295 = ((((a295 * 10) / -1) + -2270) * 5);
    	a56 = (((((((a244 * a349) % 14999) + -22120) + -2555) * 1) % 82) + 159);
    	a390 = ((((((a390 / 5) * 66) / 10) + -22630) * -1) / 10);
    	a246 = a332;
    	a353 = a343[2];
    	a209 = "i";
    	a377 = a281;
    	a400 = ((((a400 * 5) * 5) / 5) - 17354);
    	a266 = a221;
    	a235 = a374;
    	a399 = a344;
    	a373 = 9;
    	a146 = a3[(a337 + -7)];
    	a391 = a392[6];
    	a263 = 8;
    	a283 = "h";
    	a340 = a245[3];
    	a337 = 10;
    	a212 = 9;
    	a360 = 13;
    	a237 = a336;
    	a244 = (((a244 + -28092) + 47864) - -196);
    	a285 = "h";
    	a320 = a299;
    	a349 = (((a349 - 6547) - 21258) + -2381); 
    	}else {
    	a360 = 14;
    	a400 = ((((a400 % 53) - 19) - 3) - 0);
    	a279 = ((((a279 - 20010) * 10) / 9) / 5);
    	a333 = "h";
    	a50 = a0[(a373 + -4)];
    	a24 = ((a212 + a337) + -11);
    	a146 = a3[((a24 - a249) + 2)];
    	a310 = "g";
    	a353 = a343[3];
    	a263 = 14;
    	a337 = 8;
    	a291 = a307[6];
    	a377 = a281;
    	a235 = a374;
    	a244 = ((((a244 / 5) / 5) + -8947) + 9101);
    	a266 = a236;
    	a365 = "i";
    	a349 = ((((a349 - -7550) - -4794) + 8135) * -1);
    	a391 = a392[3];
    	a212 = 14;
    	a373 = 4;
    	}output = "W";
    } 
    if((((((28 == a266[3]) && ((69 == a320[2]) && a312 == a382[2])) && (a212 == 11)) && a261 == a229[2]) && ((input.equals(inputs[5]) && ((((a249 == 7) && cf) && (a136 == 3)) && (56 == a235[3]))) && a146 == a3[2]))) {
    	cf = false;
    	a76 = a70;
    	a146 = a3[(a212 + -5)];
    	a193 = ((((75 + -5659) / 5) * 5) + 5614); 
    	output = "Y";
    } 
    if(((((a136 == 3) && a261 == a229[2]) && ((284 < a280) && (364 >= a280))) && (a340 == a245[2] && (((28 == a266[3]) && ((input.equals(inputs[4]) && ((cf && a146 == a3[2]) && (a249 == 7))) && ((221 < a279) && (333 >= a279)))) && (a333.equals("g")))))) {
    	cf = false;
    	a76 = a70;
    	a146 = a3[((a215 - a249) - -1)];
    	a193 = (((55 - -27319) - -681) - -1371); 
    	output = "S";
    } 
    if(((input.equals(inputs[7]) && (a146 == a3[2] && cf)) && (((-75 < a400) && (33 >= a400)) && ((a209.equals("g")) && ((a310.equals("g")) && (a340 == a245[2] && ((a136 == 3) && ((a249 == 7) && (a291 == a307[2] && ((221 < a279) && (333 >= a279))))))))))) {
    	cf = false;
    	a365 = "g";
    	a353 = a343[5];
    	a295 = (((a295 + -8635) + -15549) - 3961);
    	a201 = 10;
    	a109 = ((a360 - a263) + 3);
    	a246 = a332;
    	a373 = 2;
    	a237 = a336;
    	a146 = a3[(a337 - 3)];
    	a333 = "e";
    	a312 = a382[3];
    	a360 = 12;
    	a261 = a229[7];
    	a285 = "g";
    	a291 = a307[0];
    	a320 = a299;
    	a279 = ((((a279 + -28625) - -18560) * -1) / 10);
    	a391 = a392[4];
    	a156 = ((((26 * 10) / 1) / 5) - -7565); 
    	output = "W";
    } 
}
private  void calculateOutputm85(String input) {
    if(((a312 == a382[2] && (((a136 == 3) && (((((a249 == 11) && cf) && a146 == a3[2]) && a261 == a229[2]) && (a333.equals("g")))) && a391 == a392[2])) && (input.equals(inputs[2]) && (a381 == a218[2] && ((284 < a280) && (364 >= a280)))))) {
    	cf = false;
    	a360 = ((a215 / a215) - -7);
    	a333 = "e";
    	a349 = (((((((a349 * a390) % 14999) % 109) - -91) - -23319) - 51206) + 27872);
    	a146 = a3[(a136 + 4)];
    	a117 = a178[((a337 - a249) - -4)];
    	a377 = a204;
    	a373 = ((a201 + a360) - 14);
    	a278 = "e";
    	a295 = (((90 * 5) - 25450) - -10969);
    	a15 = ((a136 / a337) - -12);
    	a261 = a229[(a337 - 8)];
    	a237 = a336;
    	a235 = a240;
    	a280 = (((((a280 * a279) % 14999) + -19261) * 1) / 5);
    	a246 = a296;
    	a279 = ((((((62 * 19) / 10) - -9) / 5) * 59) / 10);
    	a291 = a307[(a201 + -6)];
    	a353 = a343[(a337 + -8)];
    	a340 = a245[((a373 / a373) + -1)];
    	a285 = "e";
    	a391 = a392[((a263 * a360) - 80)];
    	a244 = ((((((a244 * a295) % 14999) / 5) % 23) - -117) - -2);
    	a312 = a382[(a373 - 2)];
    	a337 = ((a201 - a212) + 7);
    	a399 = a251;
    	a381 = a218[(a136 - 3)];
    	a263 = a201;
    	a201 = ((a373 * a373) - -2); 
    	output = "Z";
    } 
    if((((((a249 == 11) && ((a136 == 3) && (a215 == 12))) && (a365.equals("g"))) && (a263 == 10)) && (((221 < a279) && (333 >= a279)) && (a261 == a229[2] && (a312 == a382[2] && (input.equals(inputs[6]) && (cf && a146 == a3[2]))))))) {
    	cf = false;
    	a391 = a392[(a249 + -11)];
    	a235 = a240;
    	a15 = ((a201 * a201) + -51);
    	a19 = ((((((a349 * a390) % 14999) - 1100) - 27873) / 5) - -31965);
    	a279 = ((((((a279 * a244) % 14999) - 9262) / 5) + 25534) * -1);
    	a285 = "e";
    	a340 = a245[(a337 + -8)];
    	a146 = a3[(a249 - 4)];
    	a237 = a336;
    	a278 = "e";
    	a349 = (((((a349 * a390) % 14999) - -3284) + -10727) - 14222);
    	a360 = (a249 + -3);
    	a333 = "e";
    	a312 = a382[(a201 + -8)];
    	a201 = (a373 - -2);
    	a390 = (((((a390 * a280) % 14999) - 19925) - -11026) - 20571); 
    	output = "X";
    } 
    if((((a249 == 11) && (input.equals(inputs[5]) && (((56 == a235[3]) && ((97 == a246[5]) && (a365.equals("g")))) && a391 == a392[2]))) && ((((cf && a146 == a3[2]) && (a136 == 3)) && (a278.equals("g"))) && a353 == a343[2]))) {
    	cf = false;
    	if(((a278.equals("g")) && (((94 < a129 || !(a360 == 15)) || !(a360 == 15)) && !(a278.equals("e"))))) {
    	a278 = "e";
    	a337 = (a373 - -3);
    	a340 = a245[(a337 - 7)];
    	a212 = (a136 + 7);
    	a373 = (a337 + -4);
    	a235 = a324;
    	a201 = a337;
    	a279 = ((((a279 + 18622) + -18734) + -24718) - -24716);
    	a365 = "f";
    	a320 = a372;
    	a377 = a366;
    	a261 = a229[(a212 + -9)];
    	a310 = "f";
    	a266 = a211;
    	a390 = ((((((a279 * a279) % 14999) % 87) + 138) - -24117) + -24092);
    	a24 = (a360 + -2);
    	a312 = a382[(a337 + -7)];
    	a237 = a336;
    	a244 = (((((((a244 * a400) - 3409) % 23) + 123) * 5) % 23) + 95);
    	a280 = (((((((a280 * a349) % 14999) + 9322) * 1) - -1820) % 63) - -161);
    	a399 = a251;
    	a333 = "f";
    	a360 = (a201 + 2);
    	a381 = a218[(a263 + -10)];
    	a146 = a3[((a215 + a263) + -19)];
    	a295 = (((((((a295 * a390) % 14999) + -18807) + 1149) / 5) % 62) - 10);
    	a215 = (a136 - -9);
    	a353 = a343[(a249 + -10)];
    	a349 = ((((((((a349 * a244) % 14999) % 109) + 43) * 5) + 13315) % 109) + 86);
    	a209 = "f";
    	a263 = (a201 + 2);
    	a391 = a392[(a136 + -3)];
    	a246 = a296;
    	a285 = "e";
    	a283 = "e";
    	a50 = a0[(a24 + -1)]; 
    	}else {

    	}output = "U";
    } 
    if((((a333.equals("g")) && (((a249 == 11) && (((cf && input.equals(inputs[7])) && a146 == a3[2]) && a381 == a218[2])) && (a136 == 3))) && ((((97 == a246[5]) && (a360 == 10)) && (32 == a237[4])) && ((16 < a295) && (208 >= a295))))) {
    	cf = false;
    	a295 = (((((((a280 * a280) % 14999) + 2080) / 5) * 5) % 62) + -71);
    	a279 = (((((((a279 * a280) % 14999) + 5184) * 1) * 1) % 57) + 140);
    	a377 = a366;
    	a244 = ((((((a244 * a295) % 23) - -118) + -1) - 12846) - -12846);
    	a212 = (a373 - -6);
    	a278 = "f";
    	a360 = (a136 + 6);
    	a337 = (a373 - -3);
    	a310 = "f";
    	a312 = a382[(a212 + -9)];
    	a399 = a251;
    	a340 = a245[(a373 - 3)];
    	a353 = a343[(a215 - a249)];
    	a349 = ((((((((a349 * a280) % 14999) % 109) - -103) - 1537) + 647) * -1) / 10);
    	a390 = ((((((((a390 * a400) % 14999) % 87) + 162) * 5) * 5) % 87) + 103);
    	a261 = a229[(a201 + -7)];
    	a283 = "f";
    	a201 = ((a373 - a373) + 7);
    	a333 = "f";
    	a263 = (a337 + 2);
    	a246 = a358;
    	a320 = a372;
    	a266 = a211;
    	a128 = a373;
    	a285 = "f";
    	a146 = a3[(a215 + -8)];
    	a116 = "f";
    	a237 = a265;
    	a215 = (a337 + 4);
    	a391 = a392[((a360 + a212) + -18)];
    	a373 = 3; 
    	output = "T";
    } 
}
private  void calculateOutputm86(String input) {
    if((((56 == a235[3]) && ((a285.equals("g")) && (((a201 == 8) && ((221 < a279) && (333 >= a279))) && a146 == a3[2]))) && ((((243 < a349) && (389 >= a349)) && (((141 < a244) && (256 >= a244)) && (input.equals(inputs[4]) && (cf && (a136 == 3))))) && (a249 == 12)))) {
    	cf = false;
    	if((!(a113.equals("i")) || (a212 == 14))) {
    	a177 = (a373 - -1);
    	a15 = (a212 - 3);
    	a146 = a3[(a373 - -3)]; 
    	}else {
    	a146 = a3[(a337 + -7)];
    	a127 = a29[(a360 - 9)];
    	a56 = (((((((a280 * a244) % 14999) + 2817) - 18026) - 10019) % 82) + 189);
    	}output = "Z";
    } 
    if((((56 == a235[3]) && (input.equals(inputs[5]) && (a381 == a218[2] && (((a249 == 12) && cf) && (a136 == 3))))) && ((a146 == a3[2] && (((a278.equals("g")) && (32 == a237[4])) && (a212 == 11))) && (a283.equals("g"))))) {
    	cf = false;
    	if(((a381 == 15) || ((41 == a235[0]) && (!(a291 == a307[1]) || ((a146 == 1) && 389 < a349))))) {
    	a146 = a3[((a136 - a212) - -15)];
    	a353 = a343[2];
    	a381 = a218[3];
    	a399 = a269;
    	a285 = "i";
    	a209 = "f";
    	a349 = (((((a349 * 5) % 72) - -289) * 9) / 10);
    	a333 = "f";
    	a291 = a307[3];
    	a340 = a245[6];
    	a246 = a358;
    	a261 = a229[5];
    	a320 = a372;
    	a278 = "i";
    	a237 = a265;
    	a244 = ((((a244 * 19) / 10) - -2167) + 4969);
    	a377 = a281;
    	a373 = 8;
    	a215 = 17;
    	a266 = a211;
    	a391 = a392[6];
    	a201 = 10;
    	a310 = "f";
    	a312 = a382[4];
    	a283 = "f";
    	a400 = (((((a400 + 27641) % 53) + -68) + -7958) + 7965);
    	a279 = (((a279 / 5) * 5) - -2);
    	a390 = (((a390 - -25314) / 5) - -14235);
    	a263 = 11;
    	a280 = (((a280 - 4915) + -3660) + 8474);
    	a15 = (a337 - -4);
    	a365 = "g";
    	a117 = a178[(a360 + -6)];
    	a360 = 12;
    	a337 = 10;
    	a235 = a324;
    	a212 = 11; 
    	}else {
    	a116 = "f";
    	a128 = ((a337 - a337) - -2);
    	a146 = a3[(a249 + -8)];
    	}output = "V";
    } 
    if((((a263 == 10) && (((284 < a280) && (364 >= a280)) && (((-75 < a400) && (33 >= a400)) && ((a136 == 3) && ((cf && input.equals(inputs[9])) && (a249 == 12)))))) && (((a146 == a3[2] && a261 == a229[2]) && (a373 == 4)) && (a337 == 8)))) {
    	cf = false;
    	a30 = ((a360 * a201) + -65);
    	a24 = ((a201 + a215) - 11);
    	a146 = a3[(a337 - 5)]; 
    	output = "T";
    } 
    if((((a283.equals("g")) && ((a373 == 4) && (((243 < a349) && (389 >= a349)) && ((221 < a279) && (333 >= a279))))) && ((a136 == 3) && (input.equals(inputs[0]) && ((((cf && (a249 == 12)) && a146 == a3[2]) && ((284 < a280) && (364 >= a280))) && (a360 == 10)))))) {
    	cf = false;
    	a399 = a269;
    	a266 = a221;
    	a24 = (a136 - -7);
    	a27 = (((((a390 * a400) + 8772) % 15014) + -14985) + -1);
    	a146 = a3[(a337 + -5)];
    	a244 = (((a244 * 5) + 25738) + 2126);
    	a349 = ((((a349 * -5) * 10) / 9) + -1267);
    	a235 = a240;
    	a373 = 6;
    	a365 = "g";
    	a279 = (((a279 - -29041) * 1) - -40);
    	a333 = "e";
    	a337 = 9;
    	a280 = (((a280 - -23761) - 17759) * 4);
    	a400 = (((a400 + 24135) - -3130) + 1467); 
    	output = "Z";
    } 
    if(((a312 == a382[2] && ((a263 == 10) && ((((a215 == 12) && (input.equals(inputs[6]) && (cf && (a249 == 12)))) && (a136 == 3)) && a146 == a3[2]))) && ((((-75 < a400) && (33 >= a400)) && (a285.equals("g"))) && ((141 < a244) && (256 >= a244))))) {
    	a71 -= (a71 - 20) < a71 ? 2 : 0;
    	a157 += (a157 + 20) > a157 ? 4 : 0;
    	a187 -= (a187 - 20) < a187 ? 1 : 0;
    	cf = false;
    	a353 = a343[0];
    	a193 = (((((((a244 * a244) % 14999) - 18330) + 9280) - 5599) % 16) - 96);
    	a295 = ((((100 - 18771) + -761) * 10) / 9);
    	a76 = a70;
    	a146 = a3[(a263 - 4)]; 
    	output = "W";
    } 
    if(((((97 == a377[3]) && ((a146 == a3[2] && (((a249 == 12) && (cf && input.equals(inputs[8]))) && (a310.equals("g")))) && (a136 == 3))) && ((141 < a244) && (256 >= a244))) && ((a312 == a382[2] && (a263 == 10)) && (a283.equals("g"))))) {
    	cf = false;
    	a136 = (a249 - 6);
    	a180 = (((6 * 5) + -14896) / 5); 
    	output = "Y";
    } 
    if(((((a212 == 11) && (input.equals(inputs[7]) && (a146 == a3[2] && ((a249 == 12) && cf)))) && (a365.equals("g"))) && (a391 == a392[2] && ((((a136 == 3) && a381 == a218[2]) && (97 == a246[5])) && (a215 == 12))))) {
    	a71 += (a71 + 20) > a71 ? 1 : 0;
    	cf = false;
    	a309 = (a212 - 2);
    	a146 = a3[(a201 - 3)];
    	a109 = (a249 + -6); 
    	output = "Z";
    } 
    if((((input.equals(inputs[1]) && ((((((a249 == 12) && cf) && a146 == a3[2]) && (32 == a237[4])) && ((221 < a279) && (333 >= a279))) && ((243 < a349) && (389 >= a349)))) && (a136 == 3)) && ((97 == a246[5]) && (a340 == a245[2] && ((251 < a390) && (326 >= a390)))))) {
    	cf = false;
    	if((((!(a312 == 9) || (a333.equals("h"))) || !(a285.equals("g"))) && !(a379 == 12))) {
    	a261 = a229[2];
    	a365 = "g";
    	a390 = (((a390 - 4823) * 5) / 5);
    	a340 = a245[0];
    	a312 = a382[5];
    	a244 = (((a244 / -5) * 5) - 1425);
    	a291 = a307[2];
    	a320 = a299;
    	a337 = 6;
    	a278 = "h";
    	a310 = "i";
    	a280 = ((((a280 / -5) * 10) / 9) - 16633);
    	a391 = a392[6];
    	a209 = "h";
    	a295 = ((((77 * 9) / 10) * 5) - 147);
    	a146 = a3[((a136 + a249) + -10)];
    	a377 = a204;
    	a381 = a218[5];
    	a215 = 17;
    	a246 = a332;
    	a263 = 14;
    	a235 = a240;
    	a399 = a344;
    	a279 = (((a279 * 5) * -5) * 3);
    	a237 = a336;
    	a266 = a221;
    	a283 = "e";
    	a285 = "h";
    	a400 = ((((a400 % 53) + -21) - -1) - -1);
    	a109 = (a201 + -6);
    	a349 = (((a349 - -300) * 5) - 1343);
    	a373 = 8;
    	a333 = "h";
    	a212 = 16;
    	a113 = "f";
    	a360 = 11;
    	a201 = 12; 
    	}else {
    	a127 = a29[((a263 - a373) + -5)];
    	a146 = a3[(a201 + -7)];
    	a56 = ((((79 + 12643) + -12598) * 9) / 10);
    	}output = "Z";
    } 
    if(((((-75 < a400) && (33 >= a400)) && (((a146 == a3[2] && ((((a136 == 3) && cf) && (a249 == 12)) && input.equals(inputs[2]))) && (a365.equals("g"))) && ((284 < a280) && (364 >= a280)))) && ((32 == a237[4]) && ((a283.equals("g")) && (102 == a399[4]))))) {
    	cf = false;
    	a156 = (((((((a244 * a244) % 14999) % 29) + -3) + 9) + 6244) + -6245);
    	a109 = (a201 + -5);
    	a146 = a3[((a109 + a337) - 6)]; 
    	output = "Z";
    } 
    if(((a391 == a392[2] && ((a146 == a3[2] && ((cf && (a136 == 3)) && input.equals(inputs[3]))) && (a337 == 8))) && (a291 == a307[2] && ((a209.equals("g")) && (((97 == a246[5]) && ((-75 < a400) && (33 >= a400))) && (a249 == 12)))))) {
    	cf = false;
    	a261 = a229[7];
    	a278 = "f";
    	a360 = 12;
    	a310 = "h";
    	a399 = a344;
    	a333 = "g";
    	a295 = (((33 - 80) / 5) - 74);
    	a291 = a307[2];
    	a390 = (((((a390 / 5) + 260) * 5) % 37) + 261);
    	a209 = "i";
    	a246 = a332;
    	a215 = 10;
    	a237 = a336;
    	a381 = a218[5];
    	a24 = ((a201 * a201) - 58);
    	a263 = 11;
    	a373 = 8;
    	a320 = a372;
    	a365 = "e";
    	a337 = 11;
    	a400 = (((a400 - 7641) + -9969) / 5);
    	a280 = (((a280 / 5) / -5) + -10981);
    	a349 = (((a349 + 19779) + 9820) + 3);
    	a391 = a392[2];
    	a377 = a204;
    	a279 = ((((a279 % 55) + 238) + -17627) - -17655);
    	a146 = a3[(a249 + -9)];
    	a285 = "i";
    	a235 = a374;
    	a244 = ((((a244 % 57) - -172) + 22) + -47);
    	a212 = 13;
    	a312 = a382[0];
    	a283 = "i";
    	a316 = "h";
    	a266 = a236;
    	a340 = a245[7];
    	a201 = 11; 
    	output = "S";
    } 
}
private  void calculateOutputm10(String input) {
    if(((((a215 == 12) && a312 == a382[2]) && (a373 == 4)) && ((a353 == a343[2] && ((cf && (a249 == 7)) && (a263 == 10))) && (a212 == 11)))) {
    	calculateOutputm83(input);
    } 
    if((((a353 == a343[2] && ((a360 == 10) && (102 == a399[4]))) && ((243 < a349) && (389 >= a349))) && (a261 == a229[2] && ((cf && (a249 == 11)) && ((141 < a244) && (256 >= a244)))))) {
    	calculateOutputm85(input);
    } 
    if((((((69 == a320[2]) && ((102 == a399[4]) && (cf && (a249 == 12)))) && a381 == a218[2]) && (a212 == 11)) && ((97 == a377[3]) && (a333.equals("g"))))) {
    	calculateOutputm86(input);
    } 
}
private  void calculateOutputm87(String input) {
    if(((a261 == a229[2] && ((a373 == 4) && (28 == a266[3]))) && (((102 == a399[4]) && ((a310.equals("g")) && (((77 == a142[1]) && ((cf && a146 == a3[2]) && input.equals(inputs[9]))) && (a136 == 4)))) && (a285.equals("g"))))) {
    	cf = false;
    	a381 = a218[(a263 - 10)];
    	a235 = a240;
    	a360 = ((a263 - a263) - -8);
    	a337 = (a360 - 2);
    	a391 = a392[(a136 + -3)];
    	a17 = "h";
    	a390 = ((((((a390 * a400) % 14999) + -322) - 9979) * 10) / 9);
    	a266 = a221;
    	a279 = ((((((a279 * a295) % 14999) % 57) - -162) + 0) * 1);
    	a280 = (((((a280 * a400) % 14999) + -11462) * 1) - 3023);
    	a261 = a229[(a337 + -6)];
    	a291 = a307[(a263 - 10)];
    	a215 = ((a337 + a337) + -2);
    	a201 = (a263 + -4);
    	a399 = a344;
    	a189 = "g";
    	a312 = a382[((a263 / a263) - 1)];
    	a146 = a3[(a373 - 4)];
    	a278 = "e";
    	a285 = "e";
    	a353 = a343[(a263 + -10)];
    	a365 = "e";
    	a377 = a204;
    	a283 = "e";
    	a310 = "f";
    	a349 = (((((a244 * a295) % 14999) - 14991) - 4) - 3);
    	a373 = (a212 + -7);
    	a263 = (a201 + 2); 
    	output = "Z";
    } 
    if(((((input.equals(inputs[6]) && ((((a136 == 4) && (cf && a146 == a3[2])) && a291 == a307[2]) && (77 == a142[1]))) && ((221 < a279) && (333 >= a279))) && (a360 == 10)) && ((a391 == a392[2] && a261 == a229[2]) && (56 == a235[3])))) {
    	cf = false;
    	a146 = a3[(a373 - -1)];
    	a215 = (a263 - -1);
    	a261 = a229[(a360 + -9)];
    	a109 = (a337 - 1);
    	a373 = (a337 + -5);
    	a235 = a324;
    	a310 = "f";
    	a132 = a80;
    	a285 = "f";
    	a360 = (a136 - -5);
    	a291 = a307[(a201 + -6)];
    	a337 = (a215 + -4); 
    	output = "Z";
    } 
}
private  void calculateOutputm88(String input) {
    if((((((86 == a142[4]) && (a310.equals("g"))) && (a136 == 4)) && ((251 < a390) && (326 >= a390))) && (a261 == a229[2] && ((((56 == a235[3]) && (input.equals(inputs[7]) && (cf && a146 == a3[2]))) && ((284 < a280) && (364 >= a280))) && (a360 == 10))))) {
    	cf = false;
    	a180 = ((((((a390 * a244) % 14999) + -28117) * 1) - -28960) + -25103);
    	a136 = ((a263 / a263) + 5); 
    	output = "S";
    } 
    if((((102 == a399[4]) && (a391 == a392[2] && (input.equals(inputs[1]) && ((86 == a142[4]) && cf)))) && ((a360 == 10) && ((((243 < a349) && (389 >= a349)) && ((a136 == 4) && (a146 == a3[2] && a261 == a229[2]))) && (32 == a237[4]))))) {
    	cf = false;
    	if((a146 == 2)) {
    	a15 = (a136 - -7);
    	a54 = ((((((a390 * a390) % 14999) / 5) % 46) - -149) - -13);
    	a146 = a3[((a212 - a201) - -4)]; 
    	}else {
    	a56 = (((((((a244 * a244) % 14999) % 82) + 120) - -24320) + -20079) - 4258);
    	a146 = a3[((a201 + a201) - 15)];
    	a127 = a29[(a337 - 7)];
    	}output = "T";
    } 
    if((((a360 == 10) && (input.equals(inputs[9]) && (((141 < a244) && (256 >= a244)) && ((a136 == 4) && ((a333.equals("g")) && (a209.equals("g"))))))) && ((a201 == 8) && (a312 == a382[2] && ((86 == a142[4]) && (cf && a146 == a3[2])))))) {
    	cf = false;
    	a109 = (a337 + -6);
    	a113 = "g";
    	a146 = a3[(a136 + 1)]; 
    	output = "V";
    } 
    if(((a312 == a382[2] && ((a310.equals("g")) && ((86 == a142[4]) && (a146 == a3[2] && cf)))) && ((((a263 == 10) && ((((16 < a295) && (208 >= a295)) && input.equals(inputs[8])) && ((284 < a280) && (364 >= a280)))) && a353 == a343[2]) && (a136 == 4)))) {
    	cf = false;
    	a295 = ((((a295 * 5) * 10) / 4) - -1102);
    	a320 = a217;
    	a261 = a229[0];
    	a285 = "g";
    	a279 = ((((a279 * -5) * 10) / 9) + -12390);
    	a201 = 8;
    	a109 = ((a263 * a215) + -113);
    	a391 = a392[5];
    	a381 = a218[4];
    	a215 = 13;
    	a246 = a296;
    	a244 = ((((a244 - -26866) * 1) * 1) * -1);
    	a390 = (((a390 + -9005) * 3) * 1);
    	a312 = a382[5];
    	a237 = a328;
    	a278 = "e";
    	a280 = ((((a280 + -13836) - -22323) * 3) - 50618);
    	a360 = 13;
    	a365 = "i";
    	a400 = (((((a400 + 8011) * 3) - -2370) * -1) / 10);
    	a235 = a374;
    	a146 = a3[(a136 - -1)];
    	a310 = "e";
    	a291 = a307[5];
    	a283 = "i";
    	a377 = a281;
    	a209 = "h";
    	a373 = 6;
    	a333 = "e";
    	a399 = a269;
    	a212 = 9;
    	a340 = a245[3];
    	a353 = a343[6];
    	a337 = 10;
    	a349 = (((a349 * 5) - 27000) + -694);
    	a132 = a13;
    	a263 = 15; 
    	output = "W";
    } 
    if((((((251 < a390) && (326 >= a390)) && ((86 == a142[4]) && (((cf && a146 == a3[2]) && input.equals(inputs[2])) && (a136 == 4)))) && a291 == a307[2]) && (((284 < a280) && (364 >= a280)) && (((221 < a279) && (333 >= a279)) && ((a285.equals("g")) && (a201 == 8)))))) {
    	cf = false;
    	if((a381 == 9)) {
    	a381 = a218[6];
    	a261 = a229[1];
    	a399 = a269;
    	a263 = 11;
    	a333 = "f";
    	a235 = a374;
    	a246 = a358;
    	a320 = a372;
    	a295 = ((((a295 - 12096) + 15093) % 62) + -52);
    	a237 = a328;
    	a360 = 12;
    	a373 = 4;
    	a266 = a236;
    	a244 = (((((a244 % 57) + 192) * 5) % 57) + 199);
    	a278 = "f";
    	a377 = a281;
    	a312 = a382[2];
    	a146 = a3[(a201 - 8)];
    	a212 = 16;
    	a17 = "h";
    	a365 = "i";
    	a189 = "e";
    	a280 = ((((a280 * 13) / 10) * 5) - -23409);
    	a340 = a245[6];
    	a400 = (((a400 * 5) - -16827) / 5);
    	a291 = a307[2];
    	a391 = a392[3];
    	a353 = a343[7];
    	a209 = "i";
    	a283 = "g";
    	a337 = 13;
    	a285 = "h";
    	a349 = ((((a349 - 169) - 28416) - -42624) + -14254);
    	a390 = (((a390 * 5) * 5) / 5);
    	a310 = "i";
    	a215 = 14;
    	a201 = 7; 
    	}else {
    	a209 = "h";
    	a333 = "f";
    	a167 = (a136 - 2);
    	a349 = ((((a349 * 16) / 10) + 11718) + 10122);
    	a263 = 14;
    	a136 = ((a373 + a215) - 8);
    	}output = "V";
    } 
    if((((a360 == 10) && ((86 == a142[4]) && (input.equals(inputs[3]) && (cf && a146 == a3[2])))) && ((a278.equals("g")) && (((221 < a279) && (333 >= a279)) && ((a136 == 4) && ((((243 < a349) && (389 >= a349)) && (32 == a237[4])) && (a285.equals("g")))))))) {
    	cf = false;
    	a309 = (a337 + 2);
    	a109 = (a360 + -4);
    	a146 = a3[((a263 - a136) - 1)]; 
    	output = "W";
    } 
    if(((((a263 == 10) && ((a136 == 4) && (a381 == a218[2] && a353 == a343[2]))) && ((-75 < a400) && (33 >= a400))) && (((28 == a266[3]) && (((cf && input.equals(inputs[5])) && (86 == a142[4])) && a146 == a3[2])) && (32 == a237[4])))) {
    	cf = false;
    	a377 = a366;
    	a390 = (((((a390 + -1259) % 37) - -293) - 4387) - -4417);
    	a381 = a218[5];
    	a283 = "h";
    	a349 = (((((a349 * 1) / 10) + 0) * 10) / 9);
    	a353 = a343[6];
    	a310 = "f";
    	a278 = "h";
    	a263 = 12;
    	a237 = a328;
    	a146 = a3[(a201 + -1)];
    	a215 = 16;
    	a360 = 10;
    	a15 = ((a212 + a136) + -1);
    	a373 = 9;
    	a365 = "h";
    	a337 = 11;
    	a391 = a392[2];
    	a379 = (a15 - 4);
    	a209 = "f";
    	a280 = ((((a280 * 10) / 7) + 26005) / 5);
    	a291 = a307[1];
    	a279 = (((((a279 % 55) + 238) / 5) - -4738) + -4483);
    	a235 = a324;
    	a295 = ((((a295 / 5) + 15) - -24004) + -23877);
    	a246 = a358;
    	a312 = a382[5];
    	a333 = "i";
    	a340 = a245[4];
    	a244 = (((((a244 % 57) - -156) * 10) / 9) + 2);
    	a399 = a269;
    	a285 = "f";
    	a320 = a372;
    	a266 = a211;
    	a400 = (((((a400 % 13) + -87) + -23559) / 5) - -4648);
    	a212 = 12; 
    	output = "X";
    } 
    if(((a146 == a3[2] && ((a391 == a392[2] && (((input.equals(inputs[6]) && cf) && (a136 == 4)) && (a373 == 4))) && (a337 == 8))) && (((a263 == 10) && (a291 == a307[2] && (a209.equals("g")))) && (86 == a142[4])))) {
    	cf = false;
    	if((208 < a295 || a129 <=  21)) {
    	a24 = ((a136 - a136) + 8);
    	a391 = a392[3];
    	a235 = a240;
    	a146 = a3[((a337 + a215) - 17)];
    	a400 = ((((a400 - -21951) * 10) / 9) + 714);
    	a50 = a0[(a337 / a212)];
    	a373 = 6;
    	a353 = a343[5];
    	a263 = 14;
    	a310 = "g";
    	a349 = (((((a349 / 5) + 273) / 5) * 39) / 10);
    	a337 = 10;
    	a333 = "e";
    	a365 = "g";
    	a244 = (((((a244 % 57) + 144) * 1) * 10) / 9);
    	a291 = a307[5];
    	a377 = a281;
    	a360 = 13;
    	a266 = a221;
    	a279 = ((((a279 * 5) * 10) / 9) * 5);
    	a212 = 12; 
    	}else {
    	a190 = "f";
    	a136 = (a337 - -1);
    	}output = "Z";
    } 
    if((((a263 == 10) && ((a365.equals("g")) && (((cf && input.equals(inputs[0])) && a146 == a3[2]) && (a136 == 4)))) && ((a360 == 10) && ((((251 < a390) && (326 >= a390)) && ((97 == a377[3]) && (86 == a142[4]))) && (56 == a235[3]))))) {
    	cf = false;
    	if((a325.equals("i"))) {
    	a146 = a3[((a337 / a360) - -5)];
    	a309 = (a201 - -2);
    	a109 = (a337 - 2); 
    	}else {
    	a136 = (a212 - 5);
    	a180 = (((((a280 * a349) % 14999) + -29882) * 1) - 22);
    	}output = "Z";
    } 
    if(((((284 < a280) && (364 >= a280)) && (((-75 < a400) && (33 >= a400)) && ((a146 == a3[2] && ((a201 == 8) && ((cf && (a136 == 4)) && (86 == a142[4])))) && input.equals(inputs[4])))) && ((a261 == a229[2] && (97 == a377[3])) && a391 == a392[2]))) {
    	cf = false;
    	a109 = ((a212 * a373) - 40);
    	a146 = a3[(a201 + -3)];
    	a82 = a86; 
    	output = "S";
    } 
}
private  void calculateOutputm11(String input) {
    if((((a310.equals("g")) && ((a263 == 10) && (((28 == a266[3]) && ((284 < a280) && (364 >= a280))) && (a215 == 12)))) && ((a283.equals("g")) && (cf && (77 == a142[1]))))) {
    	calculateOutputm87(input);
    } 
    if(((a212 == 11) && ((a337 == 8) && (a391 == a392[2] && (((a285.equals("g")) && ((a373 == 4) && (cf && (86 == a142[4])))) && (a263 == 10)))))) {
    	calculateOutputm88(input);
    } 
}
private  void calculateOutputm92(String input) {
    if(((((((144 < a180) && (268 >= a180)) && (a381 == a218[2] && ((a136 == 6) && (a146 == a3[2] && cf)))) && (28 == a266[3])) && (a285.equals("g"))) && (((((221 < a279) && (333 >= a279)) && (a333.equals("g"))) && input.equals(inputs[9])) && (a215 == 12)))) {
    	cf = false;
    	a295 = (((((a349 * a279) % 14999) + -21372) - 6410) - 400);
    	a391 = a392[(a337 + -8)];
    	a377 = a204;
    	a146 = a3[(a373 + 3)];
    	a320 = a217;
    	a360 = (a212 - 3);
    	a312 = a382[(a337 / a212)];
    	a266 = a221;
    	a340 = a245[(a212 + -11)];
    	a381 = a218[((a212 / a212) + -1)];
    	a285 = "e";
    	a15 = (a201 - 1);
    	a215 = ((a360 - a337) - -10);
    	a310 = "e";
    	a291 = a307[((a360 / a136) - 1)];
    	a337 = (a212 + -5);
    	a263 = ((a212 * a212) + -113);
    	a278 = "e";
    	a283 = "g";
    	a280 = (((((a180 * a390) % 14999) + -25112) + -1481) * 1);
    	a390 = ((((((a279 * a295) % 14999) + 17195) + 11836) / 5) * -5);
    	a399 = a344;
    	a400 = ((((a400 * a349) / 5) - 3756) - 9180);
    	a201 = (a212 + -5);
    	a244 = (((((a280 * a279) % 14999) - 3218) * 1) + -11750);
    	a235 = a240;
    	a261 = a229[(a263 - 8)];
    	a338 = (a212 - 1);
    	a246 = a296;
    	a212 = 9; 
    	output = "W";
    } 
    if(((input.equals(inputs[5]) && ((a365.equals("g")) && a391 == a392[2])) && (((144 < a180) && (268 >= a180)) && ((a261 == a229[2] && ((69 == a320[2]) && (a353 == a343[2] && (a146 == a3[2] && ((a136 == 6) && cf))))) && ((-75 < a400) && (33 >= a400)))))) {
    	cf = false;
    	a295 = ((((((((a295 * a349) % 14999) % 62) - 73) + -9) * 5) % 62) + -43);
    	a373 = ((a360 / a360) + 2);
    	a279 = (((((a400 * a349) % 57) + 164) + -17536) - -17534);
    	a377 = a366;
    	a215 = (a373 + 8);
    	a261 = a229[(a215 + -10)];
    	a116 = "g";
    	a390 = ((((((a390 * a279) % 14999) % 87) - -128) - -17) - -5);
    	a310 = "f";
    	a312 = a382[(a201 + -7)];
    	a104 = a148[(a212 - 10)];
    	a333 = "f";
    	a146 = a3[((a337 / a136) - -3)];
    	a212 = ((a373 - a360) + 17);
    	a337 = ((a263 + a215) + -14);
    	a360 = ((a373 - a373) + 9); 
    	output = "W";
    } 
    if((((((a310.equals("g")) && ((243 < a349) && (389 >= a349))) && (a337 == 8)) && (a209.equals("g"))) && (input.equals(inputs[4]) && (a146 == a3[2] && ((((((144 < a180) && (268 >= a180)) && cf) && (a136 == 6)) && ((-75 < a400) && (33 >= a400))) && (a278.equals("g"))))))) {
    	cf = false;
    	if(((a349 <=  23 || (a119.equals("h"))) && (a136 == 7))) {
    	a360 = (a215 + -3);
    	a381 = a218[((a337 + a360) - 17)];
    	a333 = "f";
    	a390 = (((((((a390 * a349) % 14999) + -457) % 87) - -164) - -8265) - 8265);
    	a340 = a245[((a263 * a263) + -100)];
    	a209 = "f";
    	a201 = (a263 + -3);
    	a261 = a229[((a136 / a201) + 1)];
    	a278 = "f";
    	a391 = a392[(a263 - 10)];
    	a337 = (a373 + 2);
    	a353 = a343[(a360 + -8)];
    	a312 = a382[((a373 * a263) + -39)];
    	a279 = ((((((a279 * a295) % 14999) / 5) / 5) % 57) - -106);
    	a146 = a3[(a215 - 8)];
    	a246 = a358;
    	a212 = ((a136 + a215) + -8);
    	a129 = ((((((((a180 * a180) % 14999) % 19) - -36) * 9) / 10) * 10) / 9);
    	a295 = (((((12 + 1) * 9) / 10) * 5) - 125);
    	a310 = "e";
    	a399 = a251;
    	a320 = a217;
    	a215 = (a263 - -1);
    	a116 = "e";
    	a373 = (a263 + -7);
    	a377 = a366;
    	a285 = "f";
    	a400 = ((((((a400 * a349) % 14948) + -15050) + -2) / 5) - 12740);
    	a349 = (((((a349 * a244) % 14999) - -1670) - 17946) + -7778);
    	a235 = a240;
    	a365 = "f";
    	a266 = a221;
    	a263 = (a360 - 1); 
    	}else {
    	a285 = "f";
    	a333 = "e";
    	a109 = ((a201 - a337) - -6);
    	a266 = a211;
    	a309 = ((a109 / a263) + 15);
    	a261 = a229[(a309 + -14)];
    	a377 = a204;
    	a212 = (a136 - -4);
    	a215 = (a136 + 5);
    	a399 = a251;
    	a400 = (((((a400 * a349) + 13592) * 1) % 13) - 89);
    	a390 = (((((((a390 * a180) % 14999) + -13775) % 87) + 163) - 28577) + 28576);
    	a365 = "f";
    	a391 = a392[(a215 - a360)];
    	a381 = a218[((a109 + a136) + -11)];
    	a340 = a245[(a309 - 15)];
    	a337 = (a136 + 1);
    	a310 = "e";
    	a246 = a296;
    	a146 = a3[(a337 + -2)];
    	a360 = (a201 + 1);
    	a349 = (((((a349 * a244) % 14999) + 12460) / -5) - 2893);
    	a312 = a382[(a373 - 4)];
    	a279 = (((((((a279 * a295) % 14999) % 57) + 142) + -4118) + 13475) - 9362);
    	a209 = "f";
    	a320 = a372;
    	a278 = "e";
    	a373 = (a109 + -4);
    	a201 = (a263 + -3);
    	a353 = a343[(a212 - 10)];
    	a263 = (a109 + 3);
    	a295 = (((((a295 * a400) % 62) + 9) - -27231) + -27245);
    	}output = "U";
    } 
    if(((((a337 == 8) && ((a136 == 6) && (((144 < a180) && (268 >= a180)) && (a146 == a3[2] && cf)))) && (a215 == 12)) && (((97 == a377[3]) && (a340 == a245[2] && (input.equals(inputs[8]) && a391 == a392[2]))) && (97 == a246[5])))) {
    	cf = false;
    	a180 = (((((((a180 * a295) % 14999) - 26498) - -18861) / 5) % 93) - -361);
    	a291 = a307[(a212 - 9)];
    	a278 = "e";
    	a235 = a374;
    	a280 = (((((((a390 * a279) % 14999) % 39) + 306) + -12) + 21859) - 21856);
    	a320 = a372;
    	a237 = a328;
    	a279 = (((((((a180 * a349) % 14999) % 57) - -151) - 17520) * 1) + 17517);
    	a399 = a344;
    	a340 = a245[(a263 - 10)];
    	a244 = ((((a400 * a349) / 5) + -10696) - 1369);
    	a400 = (((((a400 * a295) - -18986) / 5) + -4038) + -18836);
    	a365 = "e";
    	a353 = a343[(a215 + -11)]; 
    	output = "Z";
    } 
}
private  void calculateOutputm93(String input) {
    if((((a391 == a392[2] && ((97 == a246[5]) && (a201 == 8))) && ((251 < a390) && (326 >= a390))) && ((a136 == 6) && ((((a212 == 11) && ((cf && a146 == a3[2]) && ((268 < a180) && (455 >= a180)))) && (a209.equals("g"))) && input.equals(inputs[6]))))) {
    	cf = false;
    	a349 = ((((((((a349 * a390) % 14999) % 109) - -39) * 5) - -2910) % 109) + 42);
    	a337 = (a136 - -1);
    	a237 = a265;
    	a263 = (a136 - -3);
    	a360 = (a212 + -2);
    	a116 = "i";
    	a295 = ((((((((a295 * a180) % 14999) - -10134) % 62) + -82) * 5) % 62) + -38);
    	a56 = ((((((a280 * a280) % 14999) - -2038) * -1) + 23993) * -1);
    	a215 = (a136 - -5);
    	a312 = a382[((a360 * a136) - 53)];
    	a146 = a3[(a201 + -4)];
    	a261 = a229[(a136 + -5)];
    	a280 = (((((((a279 * a180) % 14999) % 63) + 159) * 5) % 63) + 172);
    	a390 = ((((((a390 * a180) % 14999) % 87) + 102) / 5) - -186); 
    	output = "U";
    } 
    if(((a312 == a382[2] && (((a291 == a307[2] && (a201 == 8)) && (97 == a246[5])) && (56 == a235[3]))) && (a146 == a3[2] && ((a212 == 11) && (((cf && ((268 < a180) && (455 >= a180))) && (a136 == 6)) && input.equals(inputs[3])))))) {
    	cf = false;
    	a201 = (a136 + 1);
    	a310 = "f";
    	a146 = a3[a373];
    	a237 = a265;
    	a235 = a324;
    	a128 = (a337 + -3);
    	a244 = ((((68 + 47) - 4) * 10) / 9);
    	a381 = a218[(a337 - 7)];
    	a365 = "g";
    	a285 = "e";
    	a400 = (((((a244 * a244) % 13) + -87) - 10) - 4);
    	a291 = a307[(a263 - 9)];
    	a116 = "f";
    	a312 = a382[((a128 - a128) - -1)];
    	a278 = "f";
    	a209 = "f";
    	a295 = (((((((a295 * a400) % 62) - 19) * 5) + 25901) % 62) + -88);
    	a261 = a229[(a201 + -6)];
    	a333 = "f";
    	a373 = (a201 - 4);
    	a320 = a217;
    	a390 = ((((((((a390 * a180) % 14999) % 87) + 98) * 9) / 10) * 9) / 10);
    	a391 = a392[(a212 + -10)];
    	a246 = a358;
    	a212 = (a215 - 2);
    	a280 = ((((((((a280 * a400) % 14999) % 63) + 220) + -1) * 5) % 63) + 197);
    	a215 = (a128 - -6);
    	a399 = a251;
    	a263 = a337;
    	a377 = a366;
    	a360 = (a201 - -2);
    	a349 = (((((a349 * a279) % 14999) - -1925) / 5) * -5);
    	a266 = a211;
    	a337 = (a360 - 2); 
    	output = "Z";
    } 
    if(((((((268 < a180) && (455 >= a180)) && (a333.equals("g"))) && (32 == a237[4])) && (a136 == 6)) && (((a360 == 10) && ((((cf && input.equals(inputs[9])) && a146 == a3[2]) && ((16 < a295) && (208 >= a295))) && (a209.equals("g")))) && (a285.equals("g"))))) {
    	cf = false;
    	a285 = "e";
    	a246 = a296;
    	a19 = (((((((((a180 * a180) % 14999) % 45) - -56) * 9) / 10) * 5) % 45) + 46);
    	a391 = a392[(a373 - 4)];
    	a400 = ((((((a390 * a390) % 14999) / 5) % 13) + -94) - 6);
    	a360 = ((a212 + a212) + -14);
    	a15 = ((a136 / a263) + 13);
    	a261 = a229[((a15 / a360) - 1)];
    	a244 = ((((((a390 * a19) % 14999) % 23) + 99) / 5) + 110);
    	a237 = a336;
    	a312 = a382[(a337 + -8)];
    	a349 = (((((a349 * a295) % 14999) - -11576) / -5) / 5);
    	a279 = ((((((((a295 * a390) % 14999) % 57) + 115) * 5) * 5) % 57) - -113);
    	a215 = (a373 + 6);
    	a333 = "e";
    	a146 = a3[((a201 * a201) + -57)];
    	a353 = a343[(a373 - 4)];
    	a310 = "e";
    	a337 = (a215 + -3);
    	a280 = (((((a280 * a390) % 14999) - 11691) + -11418) * 1);
    	a201 = (a215 + -4);
    	a235 = a240;
    	a320 = a217;
    	a291 = a307[(a373 + -4)];
    	a381 = a218[((a212 / a212) + -1)];
    	a263 = (a215 - 2);
    	a212 = (a373 - -5);
    	a295 = ((((((a295 * a280) % 14999) / 5) - -12013) * 10) / -9);
    	a209 = "f";
    	a266 = a236;
    	a377 = a204;
    	a373 = ((a215 * a215) + -98);
    	a390 = ((((((a390 * a19) % 14999) / 5) / 5) % 37) + 252); 
    	output = "U";
    } 
    if(((((a215 == 12) && ((284 < a280) && (364 >= a280))) && ((268 < a180) && (455 >= a180))) && ((a136 == 6) && (a391 == a392[2] && (a261 == a229[2] && ((((16 < a295) && (208 >= a295)) && ((input.equals(inputs[4]) && cf) && a146 == a3[2])) && (a212 == 11))))))) {
    	cf = false;
    	a237 = a336;
    	a310 = "e";
    	a201 = (a212 - 5);
    	a209 = "e";
    	a291 = a307[(a360 / a212)];
    	a235 = a324;
    	a377 = a204;
    	a246 = a296;
    	a312 = a382[((a201 + a263) + -16)];
    	a146 = a3[((a373 * a360) - 33)];
    	a360 = (a201 + 2);
    	a353 = a343[((a212 / a212) - 1)];
    	a263 = (a212 - 3);
    	a333 = "e";
    	a15 = a215;
    	a373 = ((a212 + a212) - 20);
    	a283 = "e";
    	a117 = a178[((a212 / a15) + 2)];
    	a381 = a218[(a212 - 11)];
    	a391 = a392[((a212 - a136) - 5)];
    	a349 = (((((((a349 * a400) % 14999) - 610) % 109) + 220) - 10540) - -10508);
    	a261 = a229[(a337 - 8)];
    	a320 = a372;
    	a285 = "e";
    	a337 = a201;
    	a295 = ((((((a295 * a390) % 14999) % 62) - 104) + 59) - 22);
    	a215 = ((a201 + a201) - 2);
    	a280 = (((((a280 * a180) % 14999) / 5) + -18069) * 1);
    	a266 = a221;
    	a390 = ((((((a390 * a400) % 14999) + 12546) % 37) - -288) - 0);
    	a212 = (a201 + 3); 
    	output = "U";
    } 
}
private  void calculateOutputm13(String input) {
    if(((((102 == a399[4]) && a391 == a392[2]) && (a215 == 12)) && ((((cf && ((144 < a180) && (268 >= a180))) && (28 == a266[3])) && (a310.equals("g"))) && a261 == a229[2]))) {
    	calculateOutputm92(input);
    } 
    if((((((16 < a295) && (208 >= a295)) && ((((268 < a180) && (455 >= a180)) && cf) && (97 == a377[3]))) && ((243 < a349) && (389 >= a349))) && ((a291 == a307[2] && a261 == a229[2]) && (97 == a246[5])))) {
    	calculateOutputm93(input);
    } 
}
private  void calculateOutputm96(String input) {
    if(((((a146 == a3[2] && (a209.equals("g"))) && ((141 < a244) && (256 >= a244))) && input.equals(inputs[0])) && ((a337 == 8) && ((a285.equals("g")) && (((a365.equals("g")) && ((cf && (a136 == 7)) && (a309 == 10))) && ((221 < a279) && (333 >= a279))))))) {
    	cf = false;
    	a283 = "f";
    	a109 = ((a263 - a263) + 4);
    	a285 = "f";
    	a261 = a229[((a263 + a136) + -16)];
    	a215 = (a136 + 4);
    	a146 = a3[(a309 + -5)];
    	a337 = (a263 - 3);
    	a82 = a18;
    	a201 = (a373 + 4);
    	a280 = ((((((a280 * a244) % 14999) / 5) % 63) + 208) + -35);
    	a291 = a307[((a136 * a109) + -27)];
    	a381 = a218[(a109 - 3)];
    	a365 = "f";
    	a360 = (a212 + -2); 
    	output = "S";
    } 
    if((((a136 == 7) && ((((input.equals(inputs[4]) && (cf && (a309 == 10))) && (a360 == 10)) && (a263 == 10)) && (97 == a377[3]))) && ((97 == a246[5]) && (((a337 == 8) && a146 == a3[2]) && (a333.equals("g")))))) {
    	cf = false;
    	a15 = ((a309 + a136) + -5);
    	a285 = "e";
    	a312 = a382[(a337 + -8)];
    	a201 = (a263 + -4);
    	a333 = "e";
    	a360 = ((a337 + a15) + -12);
    	a353 = a343[(a337 + -8)];
    	a280 = (((((a279 * a390) % 14999) - 16552) * 1) - 1969);
    	a377 = a204;
    	a310 = "e";
    	a212 = (a360 + 1);
    	a373 = (a215 - 10);
    	a261 = a229[(a337 + -8)];
    	a278 = "e";
    	a399 = a251;
    	a340 = a245[(a15 + -12)];
    	a246 = a296;
    	a279 = (((((((a279 * a390) % 14999) % 57) - -112) - -22) * 9) / 10);
    	a283 = "e";
    	a244 = ((((a244 % 23) + 102) / 5) - -99);
    	a146 = a3[a136];
    	a295 = (((((((a295 * a280) % 14999) % 14945) + -15054) - 2) + 145) + -144);
    	a117 = a178[(a337 + -7)];
    	a263 = ((a136 * a136) - 41);
    	a381 = a218[((a373 * a15) - 24)];
    	a337 = (a212 + -3); 
    	output = "X";
    } 
    if(((((97 == a377[3]) && (((a209.equals("g")) && ((a136 == 7) && ((a309 == 10) && (a146 == a3[2] && (input.equals(inputs[3]) && cf))))) && (a283.equals("g")))) && (a333.equals("g"))) && (((251 < a390) && (326 >= a390)) && (102 == a399[4])))) {
    	cf = false;
    	a333 = "f";
    	a377 = a366;
    	a128 = (a212 + -7);
    	a360 = (a136 + 2);
    	a295 = (((((a295 * a400) - 4056) % 62) - -15) / 5);
    	a246 = a358;
    	a390 = ((((((a390 * a279) % 14999) - -4829) % 87) - -155) - 18);
    	a266 = a211;
    	a209 = "f";
    	a146 = a3[(a201 + -4)];
    	a283 = "f";
    	a201 = ((a136 / a373) + 5);
    	a116 = "f";
    	a237 = a265;
    	a310 = "f";
    	a235 = a374;
    	a261 = a229[((a136 + a136) + -13)];
    	a263 = (a309 + -1);
    	a212 = (a215 - 2);
    	a278 = "f";
    	a399 = a251;
    	a279 = ((((((a279 * a390) % 14999) % 57) + 150) + -41) * 1);
    	a215 = (a128 - -7);
    	a337 = a136;
    	a391 = a392[(a136 + -6)];
    	a291 = a307[(a309 - 9)];
    	a285 = "f";
    	a244 = (((((((a244 * a349) % 14999) - -6376) + -22581) * 1) % 23) + 140); 
    	output = "S";
    } 
}
private  void calculateOutputm97(String input) {
    if((((a146 == a3[2] && (input.equals(inputs[7]) && ((a309 == 12) && ((a136 == 7) && cf)))) && (a360 == 10)) && (a312 == a382[2] && ((a340 == a245[2] && (((141 < a244) && (256 >= a244)) && (a278.equals("g")))) && (a285.equals("g")))))) {
    	a59 += (a59 + 20) > a59 ? 2 : 0;
    	cf = false;
    	a381 = a218[(a337 + -8)];
    	a283 = "e";
    	a295 = (((((a280 * a400) - -11058) * 1) % 14945) + -15054);
    	a365 = "e";
    	a360 = (a309 + -4);
    	a400 = ((((((a280 * a280) % 14999) + 12870) + -22351) / 5) + -21395);
    	a235 = a240;
    	a377 = a204;
    	a291 = a307[(a263 + -8)];
    	a337 = ((a263 / a212) - -6);
    	a146 = a3[(a309 - 5)];
    	a390 = ((((((a390 * a295) % 14999) + 3598) + 20530) % 87) + 132);
    	a312 = a382[((a136 + a263) - 17)];
    	a310 = "e";
    	a15 = (a212 - -2);
    	a209 = "f";
    	a19 = (((33 * 5) + -5469) + -1808);
    	a244 = ((((((a244 * a280) % 14999) - 24703) * 10) / 9) + -2175);
    	a340 = a245[((a136 * a263) - 70)];
    	a285 = "e";
    	a278 = "e";
    	a266 = a236;
    	a215 = ((a136 * a212) + -67);
    	a261 = a229[(a201 + -6)];
    	a212 = (a263 - 1);
    	a373 = (a212 + -7);
    	a280 = (((((a280 * a295) % 14999) + -12723) * 1) / 5);
    	a263 = 8; 
    	output = "S";
    } 
    if((((a278.equals("g")) && ((251 < a390) && (326 >= a390))) && (((a215 == 12) && (((a309 == 12) && ((56 == a235[3]) && ((a146 == a3[2] && (cf && (a136 == 7))) && (28 == a266[3])))) && input.equals(inputs[8]))) && ((-75 < a400) && (33 >= a400))))) {
    	cf = false;
    	a146 = a3[(a263 + -10)];
    	a360 = ((a337 * a215) - 88);
    	a390 = (((((a390 * a295) % 14999) - 17475) * 1) * 1);
    	a215 = (a201 + 4);
    	a337 = (a212 - 5);
    	a365 = "e";
    	a377 = a204;
    	a17 = "e";
    	a263 = (a212 + -3);
    	a381 = a218[(a309 - 12)];
    	a266 = a221;
    	a291 = a307[(a360 - 8)];
    	a33 = a124; 
    	output = "W";
    } 
}
private  void calculateOutputm98(String input) {
    if((((a215 == 12) && ((((a309 == 13) && ((cf && a146 == a3[2]) && input.equals(inputs[0]))) && (a136 == 7)) && (56 == a235[3]))) && ((((a365.equals("g")) && a391 == a392[2]) && ((251 < a390) && (326 >= a390))) && (97 == a377[3])))) {
    	cf = false;
    	if((!(a113.equals("f")) || (!(56 == a320[1]) || ((!(a189.equals("f")) || ((156 < a280) && (284 >= a280))) || (a146 == 2))))) {
    	a333 = "h";
    	a349 = (((((a349 * 5) + 19573) - 33033) % 72) - -378);
    	a279 = (((a279 / 5) * 5) + 2);
    	a337 = 10;
    	a391 = a392[2];
    	a312 = a382[7];
    	a215 = 16;
    	a209 = "e";
    	a146 = a3[(a201 + -4)];
    	a235 = a240;
    	a263 = 11;
    	a116 = "f";
    	a246 = a296;
    	a373 = 4;
    	a278 = "e";
    	a295 = ((((((a295 * 5) % 95) - -51) * 5) % 95) - -18);
    	a212 = 15;
    	a353 = a343[6];
    	a285 = "f";
    	a310 = "i";
    	a244 = (((91 - 3950) + 8106) + 11785);
    	a291 = a307[4];
    	a340 = a245[5];
    	a320 = a372;
    	a360 = 12;
    	a381 = a218[0];
    	a400 = (((a400 + -2539) * 5) - 9131);
    	a128 = (a309 + -8);
    	a266 = a221;
    	a390 = (((a390 / -5) - -13148) + -22134);
    	a377 = a281;
    	a283 = "e";
    	a261 = a229[2];
    	a237 = a336;
    	a399 = a344;
    	a280 = (((((a280 % 39) + 308) - -18296) * 1) - 18291);
    	a365 = "i";
    	a201 = 8; 
    	}else {
    	a365 = "e";
    	a349 = ((((a349 + -176) / 5) - -11682) - 11553);
    	a381 = a218[2];
    	a391 = a392[7];
    	a337 = 10;
    	a279 = ((((a279 / 5) * 5) - -25036) - 25033);
    	a285 = "i";
    	a209 = "g";
    	a113 = "h";
    	a261 = a229[2];
    	a266 = a221;
    	a340 = a245[4];
    	a310 = "h";
    	a400 = (((a400 - 12827) / 5) + -18619);
    	a390 = ((((a390 + -15477) * 10) / 9) - 8194);
    	a201 = 12;
    	a280 = (((a280 / -5) - 24021) + -750);
    	a283 = "g";
    	a291 = a307[0];
    	a146 = a3[((a215 + a212) + -18)];
    	a295 = ((((a295 - 25433) / 5) * 5) - -41975);
    	a399 = a269;
    	a244 = (((67 / 5) + 9862) / 5);
    	a109 = ((a212 - a360) + 1);
    	a312 = a382[4];
    	a212 = 12;
    	a237 = a265;
    	a377 = a366;
    	a246 = a296;
    	a373 = 6;
    	a263 = 12;
    	a353 = a343[2];
    	a215 = 12;
    	a235 = a374;
    	a333 = "h";
    	a278 = "e";
    	a320 = a217;
    	a360 = 10;
    	}output = "U";
    } 
    if(((((a310.equals("g")) && (97 == a246[5])) && (a360 == 10)) && (((32 == a237[4]) && ((a309 == 13) && ((a136 == 7) && ((56 == a235[3]) && (a146 == a3[2] && (cf && input.equals(inputs[6]))))))) && ((284 < a280) && (364 >= a280))))) {
    	cf = false;
    	a283 = "h";
    	a320 = a372;
    	a337 = 11;
    	a209 = "i";
    	a399 = a269;
    	a15 = a309;
    	a279 = (((a279 + -2896) * 5) - 2671);
    	a360 = 13;
    	a278 = "f";
    	a390 = ((((a390 * 5) - -18819) - 39829) + 26057);
    	a146 = a3[((a309 + a215) - 18)];
    	a201 = 11;
    	a261 = a229[2];
    	a310 = "f";
    	a365 = "f";
    	a266 = a221;
    	a340 = a245[1];
    	a263 = 13;
    	a280 = ((((a280 * 5) * 5) % 63) + 217);
    	a349 = ((((a349 - 198) - 12185) + -5332) + 17554);
    	a381 = a218[1];
    	a285 = "g";
    	a212 = 14;
    	a291 = a307[3];
    	a19 = (((4 / 5) / 5) + -21542);
    	a391 = a392[7];
    	a246 = a358;
    	a400 = ((((a400 - 9619) * 10) / -9) + -10447);
    	a353 = a343[2];
    	a237 = a265;
    	a235 = a374;
    	a295 = (((((((a295 % 62) - 84) * 9) / 10) * 5) % 62) - -10);
    	a333 = "i";
    	a377 = a366;
    	a373 = 4;
    	a215 = 16; 
    	output = "U";
    } 
    if((((((a285.equals("g")) && ((a263 == 10) && ((a209.equals("g")) && (32 == a237[4])))) && (a136 == 7)) && (a333.equals("g"))) && (((16 < a295) && (208 >= a295)) && ((a309 == 13) && ((cf && input.equals(inputs[5])) && a146 == a3[2]))))) {
    	cf = false;
    	a136 = ((a360 * a337) + -75);
    	a130 = a87; 
    	output = "W";
    } 
    if((((input.equals(inputs[9]) && ((a136 == 7) && ((cf && (a309 == 13)) && a146 == a3[2]))) && a340 == a245[2]) && (((a291 == a307[2] && ((102 == a399[4]) && ((243 < a349) && (389 >= a349)))) && (a283.equals("g"))) && (a215 == 12)))) {
    	cf = false;
    	a391 = a392[6];
    	a235 = a374;
    	a261 = a229[0];
    	a103 = (a337 - -2);
    	a377 = a204;
    	a237 = a265;
    	a310 = "g";
    	a295 = (((((a295 + -7868) * -1) / 10) * 10) / 9);
    	a246 = a296;
    	a320 = a217;
    	a263 = 11;
    	a390 = ((((a390 * 13) / 10) * 5) * 5);
    	a278 = "e";
    	a146 = a3[(a360 + -7)];
    	a399 = a344;
    	a373 = 8;
    	a353 = a343[3];
    	a381 = a218[5];
    	a24 = (a212 - -1);
    	a280 = (((((a280 / 5) * 65) / 10) / 5) - -12149);
    	a201 = 12;
    	a215 = 12;
    	a209 = "i";
    	a212 = 14;
    	a360 = 8;
    	a333 = "g";
    	a283 = "h";
    	a340 = a245[2];
    	a279 = (((((a279 + 10806) % 55) + 223) * 10) / 9);
    	a365 = "h";
    	a400 = ((((a400 + 2975) - -5679) / 5) - 9686);
    	a285 = "g";
    	a291 = a307[0];
    	a312 = a382[2];
    	a349 = (((a349 / 5) / 5) / 5);
    	a244 = ((((83 / 5) / 5) * 5) + 1801);
    	a337 = 9; 
    	output = "X";
    } 
    if(((a146 == a3[2] && (((251 < a390) && (326 >= a390)) && (((cf && input.equals(inputs[3])) && (a309 == 13)) && (a136 == 7)))) && ((a201 == 8) && ((((a212 == 11) && (102 == a399[4])) && (97 == a246[5])) && (a337 == 8))))) {
    	cf = false;
    	if((a17.equals("h"))) {
    	a116 = "f";
    	a146 = a3[(a136 - 3)];
    	a128 = (a212 + -2); 
    	}else {
    	a24 = ((a263 * a136) - 61);
    	a30 = (a360 + 3);
    	a146 = a3[((a309 / a337) - -2)];
    	}output = "T";
    } 
    if(((input.equals(inputs[8]) && (a373 == 4)) && ((a310.equals("g")) && (((((a360 == 10) && (a353 == a343[2] && (a146 == a3[2] && ((a136 == 7) && cf)))) && (a278.equals("g"))) && (102 == a399[4])) && (a309 == 13))))) {
    	cf = false;
    	a390 = (((a390 / -5) / 5) - 23068);
    	a349 = ((((a349 % 72) + 271) / 5) + 286);
    	a295 = (((a295 - -15589) + 4682) + 7189);
    	a266 = a221;
    	a201 = 13;
    	a244 = (((((9 - -173) * 9) / 10) * 9) / 10);
    	a237 = a328;
    	a333 = "i";
    	a212 = 13;
    	a312 = a382[4];
    	a320 = a217;
    	a116 = "f";
    	a391 = a392[6];
    	a285 = "g";
    	a146 = a3[((a263 + a215) - 18)];
    	a209 = "e";
    	a278 = "g";
    	a310 = "g";
    	a340 = a245[5];
    	a291 = a307[0];
    	a279 = (((a279 / 5) / 5) + 9715);
    	a128 = (a337 + -4);
    	a337 = 12;
    	a246 = a332;
    	a399 = a269;
    	a373 = 6;
    	a261 = a229[2];
    	a377 = a204;
    	a263 = 11;
    	a353 = a343[2];
    	a283 = "i";
    	a360 = 11;
    	a400 = (((a400 + 22390) + 5291) / 5);
    	a215 = 16; 
    	output = "S";
    } 
    if(((((a381 == a218[2] && input.equals(inputs[7])) && (a309 == 13)) && a291 == a307[2]) && (((221 < a279) && (333 >= a279)) && (((a215 == 12) && (((a146 == a3[2] && cf) && (a136 == 7)) && (a283.equals("g")))) && (69 == a320[2]))))) {
    	cf = false;
    	a285 = "f";
    	a340 = a245[2];
    	a377 = a366;
    	a266 = a211;
    	a235 = a374;
    	a390 = ((((a390 - 14407) * -1) / 10) * 5);
    	a333 = "f";
    	a365 = "h";
    	a19 = ((((((a279 * a400) % 15007) - 14992) - -4305) / 5) - 4465);
    	a237 = a328;
    	a349 = (((((a349 * 10) / 6) - -26717) - 30914) - -6619);
    	a246 = a358;
    	a373 = 5;
    	a201 = 11;
    	a209 = "i";
    	a212 = 15;
    	a215 = 14;
    	a399 = a269;
    	a310 = "g";
    	a337 = 8;
    	a291 = a307[7];
    	a360 = 9;
    	a146 = a3[((a309 * a136) + -84)];
    	a353 = a343[3];
    	a280 = (((((a280 % 39) + 322) * 9) / 10) * 1);
    	a283 = "h";
    	a279 = ((((((a279 % 55) + 271) / 5) / 5) * 222) / 10);
    	a263 = 15;
    	a15 = a309;
    	a320 = a299;
    	a391 = a392[2];
    	a261 = a229[4];
    	a295 = ((((((a295 % 95) + 70) * 5) - -28962) % 95) + 52);
    	a278 = "i";
    	a381 = a218[3];
    	a400 = ((((a400 % 13) + -88) + 27225) - 27224); 
    	output = "Z";
    } 
    if(((((a212 == 11) && ((a333.equals("g")) && (((-75 < a400) && (33 >= a400)) && (((251 < a390) && (326 >= a390)) && input.equals(inputs[2]))))) && a353 == a343[2]) && ((a285.equals("g")) && ((((a309 == 13) && cf) && (a136 == 7)) && a146 == a3[2])))) {
    	a157 += (a157 + 20) > a157 ? 4 : 0;
    	cf = false;
    	a349 = (((a349 / 5) + 24053) + -23975);
    	a391 = a392[3];
    	a246 = a358;
    	a295 = ((((a295 % 62) + -81) - 20962) + 20985);
    	a212 = 16;
    	a353 = a343[4];
    	a266 = a236;
    	a379 = (a215 + -2);
    	a381 = a218[4];
    	a377 = a281;
    	a280 = ((((a280 - 26500) / 5) + -2071) - -14565);
    	a333 = "g";
    	a399 = a251;
    	a278 = "h";
    	a285 = "i";
    	a360 = 11;
    	a279 = ((((a279 * 16) / 10) + 28722) - -341);
    	a310 = "h";
    	a146 = a3[((a136 + a309) - 13)];
    	a237 = a328;
    	a373 = 7;
    	a390 = ((((a390 - 16689) + -1218) * -1) / 10);
    	a291 = a307[2];
    	a15 = (a136 - -7);
    	a400 = (((((a400 * 5) + 968) - -13843) % 13) + -87);
    	a365 = "h";
    	a340 = a245[5];
    	a320 = a372;
    	a244 = ((((57 * 10) / 4) * 5) + -493);
    	a235 = a374;
    	a337 = 13;
    	a263 = 12;
    	a209 = "i";
    	a283 = "g";
    	a215 = 12; 
    	output = "Z";
    } 
    if((((a283.equals("g")) && ((69 == a320[2]) && (((251 < a390) && (326 >= a390)) && ((a309 == 13) && (a310.equals("g")))))) && (input.equals(inputs[4]) && ((a209.equals("g")) && ((a333.equals("g")) && ((a146 == a3[2] && cf) && (a136 == 7))))))) {
    	cf = false;
    	if(((a50 == 7) || ((!(a278.equals("e")) && (90 == a399[4])) || !(a312 == 12)))) {
    	a128 = ((a212 * a212) + -114);
    	a209 = "e";
    	a261 = a229[7];
    	a381 = a218[7];
    	a320 = a217;
    	a246 = a332;
    	a263 = 8;
    	a280 = (((((a280 / -5) * 10) / 9) - -13751) + -17206);
    	a340 = a245[4];
    	a291 = a307[3];
    	a391 = a392[2];
    	a278 = "f";
    	a285 = "h";
    	a399 = a269;
    	a237 = a328;
    	a146 = a3[(a360 + -6)];
    	a116 = "f";
    	a279 = ((((a279 + 22873) - 20143) % 55) + 224);
    	a337 = 9;
    	a283 = "h";
    	a212 = 14;
    	a310 = "g";
    	a215 = 10;
    	a333 = "g";
    	a312 = a382[2];
    	a244 = (((((42 + 16971) + 4721) + -30724) * -1) / 10);
    	a400 = ((((a400 - -16335) * 10) / 9) * 1);
    	a373 = 5;
    	a295 = (((a295 / 5) - 25092) - 175);
    	a377 = a204;
    	a353 = a343[2];
    	a349 = ((((a349 * 10) / 6) * 5) / 5);
    	a235 = a374;
    	a390 = (((a390 / -5) + -25472) / 5);
    	a201 = 9;
    	a360 = 13; 
    	}else {
    	a340 = a245[6];
    	a246 = a358;
    	a381 = a218[5];
    	a310 = "i";
    	a146 = a3[((a263 / a215) + 7)];
    	a400 = ((((a400 / 5) - -16) * 10) / 9);
    	a320 = a299;
    	a235 = a374;
    	a399 = a269;
    	a261 = a229[4];
    	a391 = a392[1];
    	a15 = (a263 - 3);
    	a280 = (((a280 + 11767) + 6797) - -10479);
    	a263 = 11;
    	a365 = "h";
    	a295 = ((((a295 - -27891) - 33882) % 95) - -186);
    	a377 = a281;
    	a353 = a343[4];
    	a212 = 15;
    	a333 = "i";
    	a279 = ((((((a279 * 5) / 10) + 18) - -129) * 5) / 10);
    	a337 = 11;
    	a201 = 11;
    	a349 = ((((a349 * 5) * 5) % 72) + 251);
    	a390 = ((((((a390 - 155) * 9) / 10) * 5) % 87) + 147);
    	a283 = "g";
    	a266 = a236;
    	a373 = 7;
    	a237 = a328;
    	a209 = "g";
    	a278 = "i";
    	a338 = (a360 - 1);
    	a285 = "g";
    	a291 = a307[6];
    	a360 = 12;
    	}output = "X";
    } 
    if(((input.equals(inputs[1]) && (((((a309 == 13) && ((a136 == 7) && (cf && a146 == a3[2]))) && (a283.equals("g"))) && ((16 < a295) && (208 >= a295))) && (a212 == 11))) && ((((251 < a390) && (326 >= a390)) && (a310.equals("g"))) && ((221 < a279) && (333 >= a279))))) {
    	cf = false;
    	a109 = (a337 + -4);
    	a82 = a86;
    	a146 = a3[((a309 - a136) + -1)]; 
    	output = "X";
    } 
}
private  void calculateOutputm99(String input) {
    if((((((((141 < a244) && (256 >= a244)) && ((28 == a266[3]) && ((a309 == 14) && (cf && a146 == a3[2])))) && (a136 == 7)) && a353 == a343[2]) && a312 == a382[2]) && ((a291 == a307[2] && input.equals(inputs[3])) && (a278.equals("g"))))) {
    	cf = false;
    	a128 = (a309 + -10);
    	a310 = "f";
    	a212 = ((a128 + a128) - -2);
    	a278 = "f";
    	a146 = a3[(a360 + -6)];
    	a266 = a211;
    	a263 = (a128 + 5);
    	a312 = a382[(a136 + -6)];
    	a337 = ((a360 + a373) + -7);
    	a353 = a343[(a212 + -9)];
    	a209 = "f";
    	a215 = ((a128 / a263) - -11);
    	a295 = (((((((a390 * a390) % 14999) % 62) + -60) * 5) % 62) - 45);
    	a400 = ((((((a349 * a390) % 14999) + 12288) - 25731) % 13) + -89);
    	a237 = a265;
    	a246 = a358;
    	a391 = a392[(a201 + -6)];
    	a291 = a307[(a337 - 6)];
    	a261 = a229[(a360 + -9)];
    	a377 = a366;
    	a279 = (((((((a279 * a390) % 14999) / 5) / 5) / 5) % 57) + 107);
    	a244 = ((((((a244 * a400) - -5864) + 3593) * 1) % 23) - -123);
    	a333 = "f";
    	a340 = a245[(a373 - 3)];
    	a280 = ((((((a390 * a390) % 14999) % 39) + 302) - 5) - 7);
    	a285 = "f";
    	a360 = ((a212 * a212) + -91);
    	a373 = (a128 + -1);
    	a283 = "f";
    	a116 = "f";
    	a390 = ((((((((a390 * a295) % 14999) % 87) - -164) + 1) * 5) % 87) + 110); 
    	output = "S";
    } 
    if((((a209.equals("g")) && ((((((a136 == 7) && cf) && input.equals(inputs[0])) && (a373 == 4)) && (a310.equals("g"))) && ((251 < a390) && (326 >= a390)))) && (((a309 == 14) && (a146 == a3[2] && ((141 < a244) && (256 >= a244)))) && (a283.equals("g"))))) {
    	cf = false;
    	a373 = (a309 - 11);
    	a360 = (a373 + 6);
    	a365 = "f";
    	a261 = a229[(a360 / a337)];
    	a109 = ((a337 + a337) + -12);
    	a215 = (a360 - -2);
    	a146 = a3[(a263 + -5)];
    	a283 = "f";
    	a285 = "f";
    	a381 = a218[(a309 + -13)];
    	a353 = a343[(a360 / a136)];
    	a291 = a307[((a215 * a263) + -109)];
    	a340 = a245[(a201 + -6)];
    	a337 = (a263 - 3);
    	a82 = a18;
    	a312 = a382[((a360 * a360) - 80)]; 
    	output = "S";
    } 
    if((((((a136 == 7) && ((a309 == 14) && cf)) && input.equals(inputs[4])) && (a337 == 8)) && (((a340 == a245[2] && (a146 == a3[2] && ((a310.equals("g")) && (56 == a235[3])))) && (97 == a377[3])) && ((-75 < a400) && (33 >= a400))))) {
    	cf = false;
    	a201 = (a136 + -1);
    	a15 = (a337 + 4);
    	a381 = a218[(a201 - 6)];
    	a283 = "e";
    	a280 = (((((a400 * a400) + -27426) + 27965) + 16327) * -1);
    	a391 = a392[((a215 + a337) - 20)];
    	a340 = a245[((a201 * a337) - 48)];
    	a244 = ((((((a244 * a400) % 23) - -118) * 1) + 21689) + -21688);
    	a263 = (a212 - 1);
    	a377 = a204;
    	a373 = (a212 - 7);
    	a278 = "e";
    	a146 = a3[((a15 * a15) - 137)];
    	a285 = "e";
    	a353 = a343[(a373 + -2)];
    	a117 = a178[(a15 - 11)];
    	a235 = a240;
    	a333 = "e";
    	a360 = (a309 - 6);
    	a279 = (((((((a279 * a280) % 14999) % 57) + 164) + 20643) - 10742) + -9902);
    	a310 = "e";
    	a312 = a382[(a360 - a360)];
    	a261 = a229[((a212 * a215) - 108)];
    	a337 = (a15 + -6);
    	a400 = ((((((a400 * a295) % 14999) + 1471) * 1) % 13) + -88); 
    	output = "X";
    } 
}
private  void calculateOutputm14(String input) {
    if(((((284 < a280) && (364 >= a280)) && ((((a309 == 10) && cf) && a261 == a229[2]) && ((16 < a295) && (208 >= a295)))) && (((a201 == 8) && (a278.equals("g"))) && (a365.equals("g"))))) {
    	calculateOutputm96(input);
    } 
    if((((((a381 == a218[2] && (cf && (a309 == 12))) && ((284 < a280) && (364 >= a280))) && (a360 == 10)) && (97 == a377[3])) && (((251 < a390) && (326 >= a390)) && ((16 < a295) && (208 >= a295))))) {
    	calculateOutputm97(input);
    } 
    if(((((284 < a280) && (364 >= a280)) && ((28 == a266[3]) && ((a373 == 4) && ((a360 == 10) && ((a365.equals("g")) && (56 == a235[3])))))) && (cf && (a309 == 13)))) {
    	calculateOutputm98(input);
    } 
    if((((a391 == a392[2] && (a340 == a245[2] && (((141 < a244) && (256 >= a244)) && (cf && (a309 == 14))))) && ((221 < a279) && (333 >= a279))) && ((a333.equals("g")) && (a310.equals("g"))))) {
    	calculateOutputm99(input);
    } 
}
private  void calculateOutputm101(String input) {
    if((((((a136 == 8) && ((a167 == 2) && cf)) && input.equals(inputs[9])) && (a365.equals("g"))) && ((a373 == 4) && (((((a215 == 12) && a381 == a218[2]) && a146 == a3[2]) && (a310.equals("g"))) && (97 == a377[3]))))) {
    	cf = false;
    	a365 = "f";
    	a373 = (a201 + -5);
    	a400 = (((((((a390 * a349) % 14999) + -4888) / 5) / 5) % 13) - 89);
    	a391 = a392[(a337 - 7)];
    	a212 = (a373 + 7);
    	a279 = ((((((a279 * a400) % 14999) - 6101) + -7835) % 57) + 212);
    	a310 = "f";
    	a24 = a136;
    	a235 = a324;
    	a353 = a343[(a373 - 2)];
    	a263 = (a215 - a373);
    	a333 = "f";
    	a50 = a0[(a337 + -8)];
    	a146 = a3[(a167 + 1)];
    	a377 = a366;
    	a209 = "g";
    	a360 = (a201 + 1);
    	a266 = a211;
    	a291 = a307[((a167 / a263) - -1)];
    	a337 = (a215 - 5);
    	a244 = ((((((a244 * a390) % 14999) - -9315) % 23) + 113) + -14); 
    	output = "U";
    } 
    if(((a312 == a382[2] && (((284 < a280) && (364 >= a280)) && ((56 == a235[3]) && ((((97 == a377[3]) && (a167 == 2)) && a146 == a3[2]) && (a360 == 10))))) && (((input.equals(inputs[8]) && cf) && (a136 == 8)) && ((251 < a390) && (326 >= a390))))) {
    	cf = false;
    	a76 = a70;
    	a193 = ((((((a279 * a295) % 14999) + 2464) + -21660) % 97) + 42);
    	a146 = a3[(a136 - 2)]; 
    	output = "Z";
    } 
    if(((((a146 == a3[2] && ((a285.equals("g")) && ((-75 < a400) && (33 >= a400)))) && (32 == a237[4])) && ((141 < a244) && (256 >= a244))) && ((((((a136 == 8) && cf) && (a167 == 2)) && (a278.equals("g"))) && input.equals(inputs[5])) && a391 == a392[2]))) {
    	cf = false;
    	a283 = "e";
    	a377 = a204;
    	a312 = a382[(a167 - 2)];
    	a261 = a229[(a201 + -8)];
    	a235 = a240;
    	a399 = a251;
    	a285 = "e";
    	a278 = "e";
    	a295 = ((((a295 - 24183) * 10) / 9) * 1);
    	a201 = (a167 + 4);
    	a340 = a245[(a360 + -10)];
    	a15 = (a212 - -1);
    	a246 = a296;
    	a237 = a336;
    	a117 = a178[(a167 + -1)];
    	a279 = ((((((a279 * a244) % 14999) - 27851) / 5) % 57) + 200);
    	a310 = "e";
    	a400 = (((((((a400 * a390) % 13) + -89) + 1) * 5) % 13) + -86);
    	a146 = a3[(a15 + -5)];
    	a212 = (a215 - 3);
    	a373 = (a136 - 6);
    	a244 = ((((60 + 69) - 1) - -14481) - 14512);
    	a353 = a343[(a337 - 8)];
    	a391 = a392[(a167 / a263)];
    	a280 = (((((a280 * a390) % 14999) + -22391) - 1014) * 1);
    	a381 = a218[(a337 - 8)];
    	a360 = (a167 + 6);
    	a337 = (a263 - 2); 
    	output = "U";
    } 
    if(((input.equals(inputs[1]) && (((16 < a295) && (208 >= a295)) && (((102 == a399[4]) && (a312 == a382[2] && ((a167 == 2) && (cf && a146 == a3[2])))) && (a136 == 8)))) && ((a391 == a392[2] && a353 == a343[2]) && ((284 < a280) && (364 >= a280))))) {
    	cf = false;
    	a278 = "f";
    	a360 = (a136 + 1);
    	a400 = ((((((a400 * a390) * 1) % 13) - 88) + -27523) + 27522);
    	a285 = "f";
    	a399 = a251;
    	a266 = a211;
    	a391 = a392[((a373 * a360) - 35)];
    	a353 = a343[(a360 + -8)];
    	a390 = (((((a349 * a400) * 1) + -641) % 87) - -187);
    	a212 = (a215 + -2);
    	a128 = (a201 + -4);
    	a263 = ((a360 * a136) - 63);
    	a116 = "f";
    	a261 = a229[(a167 - 1)];
    	a237 = a265;
    	a333 = "f";
    	a283 = "f";
    	a246 = a358;
    	a146 = a3[(a337 - 4)];
    	a291 = a307[(a212 + -9)];
    	a279 = (((((((a279 * a244) % 14999) / 5) - -20066) / 5) % 57) - -138);
    	a201 = (a360 - 2);
    	a340 = a245[(a212 - 9)];
    	a310 = "f";
    	a215 = (a263 + 2);
    	a244 = ((((((a295 * a295) % 14999) - -11377) / 5) % 23) + 118);
    	a320 = a372;
    	a337 = (a373 + 3);
    	a377 = a366;
    	a312 = a382[((a373 * a360) - 35)];
    	a295 = (((((((a295 * a280) % 14999) - 24124) / 5) * 5) % 62) + -12);
    	a373 = ((a360 + a136) - 14); 
    	output = "W";
    } 
}
private  void calculateOutputm106(String input) {
    if((((((a136 == 8) && ((cf && input.equals(inputs[6])) && a146 == a3[2])) && (69 == a320[2])) && (a263 == 10)) && (((97 == a377[3]) && (((a201 == 8) && a353 == a343[2]) && (a283.equals("g")))) && (a167 == 8)))) {
    	cf = false;
    	a349 = ((((((((a349 * a244) % 14999) % 109) + 43) * 10) / 9) + 12002) - 11961);
    	a360 = ((a167 / a167) - -8);
    	a279 = ((((((a349 * a244) % 14999) + 14446) / 5) % 57) - -157);
    	a399 = a251;
    	a320 = a372;
    	a381 = a218[(a360 + -9)];
    	a209 = "f";
    	a261 = a229[(a201 - 7)];
    	a340 = a245[(a360 / a360)];
    	a333 = "f";
    	a312 = a382[(a167 + -7)];
    	a212 = a263;
    	a266 = a211;
    	a235 = a324;
    	a365 = "f";
    	a215 = ((a263 * a263) + -89);
    	a280 = (((((((a280 * a279) % 14999) / 5) + -2506) + -8904) % 63) + 265);
    	a201 = (a136 - 1);
    	a373 = (a167 + -5);
    	a237 = a265;
    	a353 = a343[(a215 / a212)];
    	a291 = a307[(a263 - 9)];
    	a56 = (((((a390 * a295) % 14999) - 26636) + 32437) / -5);
    	a285 = "f";
    	a295 = ((((((a279 * a400) / 5) % 62) + -47) + 5883) - 5882);
    	a146 = a3[(a337 - 7)];
    	a278 = "e";
    	a337 = (a360 + -2);
    	a283 = "f";
    	a400 = (((((a400 * a244) + 14596) % 13) - 87) + -2);
    	a377 = a366;
    	a244 = ((((((((a244 * a279) % 14999) % 23) + 117) + 2) / 5) * 45) / 10);
    	a310 = "f";
    	a263 = (a212 + -1);
    	a246 = a358;
    	a88 = (((((a56 * a56) % 14999) + -14991) / 5) * 5); 
    	output = "T";
    } 
    if((((((141 < a244) && (256 >= a244)) && ((a167 == 8) && ((a337 == 8) && ((cf && (a136 == 8)) && a146 == a3[2])))) && (97 == a246[5])) && ((a215 == 12) && (((243 < a349) && (389 >= a349)) && (a261 == a229[2] && input.equals(inputs[3])))))) {
    	cf = false;
    	a212 = (a136 - -1);
    	a337 = (a201 - 2);
    	a310 = "e";
    	a338 = (a263 + -6);
    	a381 = a218[(a201 + -8)];
    	a340 = a245[((a215 * a201) + -96)];
    	a244 = ((((((a295 * a295) % 14999) / 5) + -25138) * 10) / 9);
    	a333 = "e";
    	a209 = "e";
    	a278 = "e";
    	a146 = a3[(a201 + -1)];
    	a283 = "e";
    	a285 = "e";
    	a15 = (a201 - 1);
    	a215 = (a201 - -2);
    	a263 = ((a201 / a373) + 4);
    	a353 = a343[(a167 + -8)];
    	a320 = a217;
    	a261 = a229[(a212 - 9)];
    	a280 = (((((a280 * a390) % 14999) + 12038) / -5) * 5);
    	a266 = a221;
    	a365 = "e";
    	a400 = (((((((a400 * a244) % 14999) % 14948) - 15050) + 10592) / 5) + -23198);
    	a377 = a204;
    	a390 = ((((((a295 * a295) % 14999) - -7031) / -5) * 10) / 9);
    	a399 = a344;
    	a246 = a296;
    	a201 = ((a212 * a360) + -66);
    	a295 = (((((a295 * a349) % 14999) - -3231) - 19047) * 1);
    	a349 = ((((a349 - -26806) * 1) * 1) + -41939); 
    	output = "X";
    } 
    if((((a136 == 8) && (((((16 < a295) && (208 >= a295)) && ((a365.equals("g")) && ((a146 == a3[2] && cf) && (a167 == 8)))) && (a333.equals("g"))) && (a278.equals("g")))) && (input.equals(inputs[9]) && (a353 == a343[2] && ((141 < a244) && (256 >= a244)))))) {
    	cf = false;
    	a360 = (a136 - -1);
    	a399 = a251;
    	a279 = ((((((((a295 * a295) % 14999) % 57) - -149) * 9) / 10) - -24807) - 24816);
    	a320 = a372;
    	a209 = "f";
    	a201 = ((a136 * a136) + -57);
    	a146 = a3[((a337 / a212) - -3)];
    	a261 = a229[(a360 + -9)];
    	a365 = "f";
    	a212 = (a201 - -2);
    	a400 = ((((((a400 * a349) - 1145) + 3079) / 5) % 13) + -88);
    	a24 = ((a337 - a337) - -13);
    	a215 = ((a360 / a360) + 10);
    	a246 = a358;
    	a353 = a343[(a136 + -7)];
    	a310 = "f";
    	a377 = a366;
    	a340 = a245[((a215 - a136) + -2)];
    	a235 = a324;
    	a283 = "f";
    	a390 = ((((((a390 * a280) % 14999) / 5) % 87) + 156) + -27);
    	a263 = ((a215 / a136) - -8);
    	a337 = (a360 + -2);
    	a285 = "f";
    	a266 = a211;
    	a278 = "f";
    	a237 = a265;
    	a244 = ((((((a244 * a295) % 14999) / 5) % 23) - -105) - -12);
    	a79 = "f";
    	a333 = "e";
    	a291 = a307[(a167 + -7)];
    	a381 = a218[((a201 / a136) + 1)];
    	a349 = ((((((a295 * a295) % 14999) / 5) % 109) + 60) - 10);
    	a280 = (((((((a280 * a279) % 14999) - -14853) % 63) + 219) * 9) / 10);
    	a312 = a382[((a136 * a360) - 71)];
    	a295 = (((((((a295 * a390) % 14999) / 5) % 62) + -107) - -2941) + -2923); 
    	output = "Y";
    } 
}
private  void calculateOutputm15(String input) {
    if((((((284 < a280) && (364 >= a280)) && (a291 == a307[2] && (a365.equals("g")))) && (a215 == 12)) && ((28 == a266[3]) && (((221 < a279) && (333 >= a279)) && (cf && (a167 == 2)))))) {
    	calculateOutputm101(input);
    } 
    if((((((a340 == a245[2] && ((a167 == 8) && cf)) && ((284 < a280) && (364 >= a280))) && (a209.equals("g"))) && (a263 == 10)) && ((69 == a320[2]) && a353 == a343[2]))) {
    	calculateOutputm106(input);
    } 
}
private  void calculateOutputm109(String input) {
    if(((((a209.equals("g")) && ((221 < a279) && (333 >= a279))) && (a337 == 8)) && ((((input.equals(inputs[3]) && (((a190.equals("g")) && (a146 == a3[2] && cf)) && (a136 == 9))) && (a333.equals("g"))) && (a215 == 12)) && (97 == a246[5])))) {
    	cf = false;
    	if(((a177 == 8) && (((a285.equals("e")) || (a117 == 13)) && a64 == a67[3]))) {
    	a244 = (((((4 * 643) / 10) * 10) / 9) - -14314);
    	a136 = ((a337 * a337) - 57);
    	a309 = (a373 - -6);
    	a353 = a343[4];
    	a391 = a392[7];
    	a349 = (((a349 + -18938) / 5) / 5);
    	a237 = a328;
    	a320 = a299;
    	a340 = a245[0];
    	a400 = ((((a400 + -7613) / 5) + 30753) + -50065);
    	a235 = a374;
    	a312 = a382[6];
    	a373 = 8; 
    	}else {
    	a76 = a98;
    	a310 = "i";
    	a146 = a3[((a337 / a201) + 5)];
    	a283 = "h";
    	a295 = ((((a295 % 62) - 107) * 5) / 5);
    	a400 = (((a400 + -14951) / 5) - -3005);
    	a377 = a281;
    	a320 = a217;
    	a263 = 12;
    	a279 = (((((a279 / -5) * 10) / 9) + 29201) - 38408);
    	a381 = a218[2];
    	a244 = ((((71 * 5) * -5) + 19440) * -1);
    	a338 = ((a212 / a337) - -9);
    	}output = "S";
    } 
    if((((32 == a237[4]) && (((a209.equals("g")) && (((102 == a399[4]) && (a190.equals("g"))) && (69 == a320[2]))) && ((284 < a280) && (364 >= a280)))) && ((a310.equals("g")) && ((((a136 == 9) && cf) && input.equals(inputs[6])) && a146 == a3[2])))) {
    	cf = false;
    	a109 = (a263 + -2);
    	a95 = "f";
    	a146 = a3[(a212 + -6)]; 
    	output = "Z";
    } 
    if(((((a340 == a245[2] && (a209.equals("g"))) && ((284 < a280) && (364 >= a280))) && (a278.equals("g"))) && ((((((cf && a146 == a3[2]) && (a190.equals("g"))) && input.equals(inputs[8])) && (97 == a246[5])) && (a310.equals("g"))) && (a136 == 9)))) {
    	cf = false;
    	a212 = 11;
    	a310 = "f";
    	a373 = 7;
    	a320 = a299;
    	a353 = a343[2];
    	a246 = a358;
    	a209 = "h";
    	a312 = a382[4];
    	a146 = a3[(a337 + -8)];
    	a349 = (((a349 + 21869) * 1) * 1);
    	a263 = 10;
    	a295 = ((((a295 + 26411) % 95) - -100) + 14);
    	a285 = "h";
    	a235 = a324;
    	a391 = a392[3];
    	a390 = (((a390 * 5) * 5) * 3);
    	a302 = "e";
    	a215 = 11;
    	a279 = ((((a279 - 14948) + 9199) * -1) / 10);
    	a365 = "h";
    	a377 = a366;
    	a333 = "f";
    	a283 = "g";
    	a400 = (((a400 - -28189) - -37) / 5);
    	a291 = a307[7];
    	a381 = a218[1];
    	a280 = (((((a280 - 110) * 9) / 10) - -20503) - 20502);
    	a266 = a211;
    	a360 = 14;
    	a237 = a265;
    	a399 = a269;
    	a17 = "i";
    	a278 = "i";
    	a201 = 11;
    	a261 = a229[2];
    	a340 = a245[4];
    	a244 = ((((84 / 5) / 5) * 419) / 10);
    	a337 = 8; 
    	output = "U";
    } 
    if(((((a146 == a3[2] && cf) && (a136 == 9)) && input.equals(inputs[9])) && (a340 == a245[2] && ((a353 == a343[2] && (((a190.equals("g")) && ((a333.equals("g")) && (a337 == 8))) && (97 == a377[3]))) && (a212 == 11))))) {
    	cf = false;
    	if(((a209.equals("i")) && !(a340 == 12))) {
    	a15 = a212;
    	a377 = a366;
    	a54 = (((((a295 * a280) % 14999) - 16433) / 5) + -23577);
    	a215 = 11;
    	a337 = 10;
    	a365 = "h";
    	a278 = "g";
    	a291 = a307[2];
    	a310 = "h";
    	a146 = a3[(a212 + -4)];
    	a266 = a236;
    	a353 = a343[4];
    	a400 = (((((a400 % 53) - 21) + -1) - -11756) + -11753);
    	a349 = ((((a349 + 25120) * 1) % 72) - -303);
    	a280 = (((((a280 + -6486) % 39) + 363) - -7062) + -7070);
    	a209 = "g";
    	a391 = a392[7];
    	a312 = a382[5];
    	a235 = a324;
    	a285 = "i";
    	a320 = a299;
    	a360 = 14;
    	a283 = "i";
    	a261 = a229[5];
    	a333 = "f";
    	a237 = a328;
    	a279 = (((((a279 % 55) - -272) * 9) / 10) * 1);
    	a295 = ((((a295 * 5) % 62) + -105) / 5);
    	a381 = a218[4];
    	a390 = ((((((a390 * 10) / 13) * 5) * 5) % 87) + 154);
    	a263 = 9;
    	a340 = a245[7];
    	a373 = 9;
    	a399 = a269;
    	a244 = ((((61 - -10231) + -10194) - -20368) + -20337);
    	a246 = a296;
    	a201 = 12;
    	a212 = 14; 
    	}else {
    	a365 = "f";
    	a279 = (((a279 + 12529) * 2) - -588);
    	a320 = a217;
    	a212 = 13;
    	a353 = a343[7];
    	a360 = 15;
    	a285 = "h";
    	a215 = 17;
    	a266 = a221;
    	a340 = a245[7];
    	a261 = a229[3];
    	a280 = (((((a280 * 5) / 5) - -25156) % 39) + 324);
    	a15 = ((a136 + a373) + -3);
    	a400 = (((((a400 % 13) - 89) * 5) % 13) + -79);
    	a278 = "i";
    	a244 = ((((89 / 5) * 10) / 1) - -69);
    	a246 = a332;
    	a283 = "i";
    	a237 = a328;
    	a337 = 7;
    	a201 = 10;
    	a399 = a269;
    	a235 = a324;
    	a209 = "h";
    	a119 = "e";
    	a377 = a281;
    	a391 = a392[6];
    	a291 = a307[4];
    	a295 = ((((a295 / 5) + 16295) - -9276) + -25507);
    	a381 = a218[2];
    	a146 = a3[(a263 - 3)];
    	a312 = a382[5];
    	a263 = 14;
    	a349 = (((((a349 / 5) - -7815) / 5) * 2) / 10);
    	a333 = "h";
    	a373 = 3;
    	}output = "Z";
    } 
    if(((((a215 == 12) && (((a190.equals("g")) && ((cf && a146 == a3[2]) && input.equals(inputs[7]))) && (32 == a237[4]))) && (a283.equals("g"))) && (((243 < a349) && (389 >= a349)) && (((a310.equals("g")) && (a136 == 9)) && a291 == a307[2])))) {
    	cf = false;
    	a156 = ((((((a295 * a390) % 14999) / 5) % 29) + 16) / 5);
    	a146 = a3[((a337 + a212) + -14)];
    	a109 = (a373 + -1); 
    	output = "S";
    } 
    if(((((251 < a390) && (326 >= a390)) && ((a136 == 9) && ((a340 == a245[2] && (a360 == 10)) && (a333.equals("g"))))) && (a312 == a382[2] && ((28 == a266[3]) && (((a190.equals("g")) && (input.equals(inputs[1]) && cf)) && a146 == a3[2]))))) {
    	cf = false;
    	a189 = "f";
    	a17 = "h";
    	a146 = a3[(a373 + -4)]; 
    	output = "S";
    } 
    if((((((((a391 == a392[2] && (input.equals(inputs[0]) && ((a190.equals("g")) && cf))) && (a337 == 8)) && ((284 < a280) && (364 >= a280))) && (a136 == 9)) && a146 == a3[2]) && (56 == a235[3])) && ((97 == a246[5]) && (a212 == 11)))) {
    	cf = false;
    	a333 = "i";
    	a365 = "h";
    	a310 = "f";
    	a377 = a366;
    	a237 = a328;
    	a266 = a236;
    	a379 = a360;
    	a280 = (((((a280 * 13) / 10) * 10) / 9) - -27497);
    	a320 = a299;
    	a15 = (a212 - -3);
    	a283 = "i";
    	a390 = ((((((a390 % 37) + 261) - -791) / 5) * 12) / 10);
    	a373 = 8;
    	a235 = a374;
    	a279 = (((((a279 % 55) + 244) + 31) + 12843) + -12866);
    	a391 = a392[5];
    	a340 = a245[7];
    	a353 = a343[4];
    	a285 = "f";
    	a291 = a307[6];
    	a278 = "i";
    	a400 = ((((a400 % 53) + -21) / 5) / 5);
    	a146 = a3[((a201 * a337) - 57)];
    	a360 = 9;
    	a244 = (((18 * 5) / -5) + -14959);
    	a246 = a358;
    	a399 = a269;
    	a337 = 12;
    	a209 = "g";
    	a295 = ((((a295 % 62) + -81) + -24897) - -24927);
    	a263 = 15;
    	a215 = 13;
    	a381 = a218[4];
    	a349 = ((((a349 + -163) * 9) / 10) + 16);
    	a312 = a382[1];
    	a212 = 14; 
    	output = "U";
    } 
    if((((a360 == 10) && ((((a136 == 9) && ((a190.equals("g")) && (input.equals(inputs[4]) && cf))) && (32 == a237[4])) && (a285.equals("g")))) && ((((243 < a349) && (389 >= a349)) && (a146 == a3[2] && a261 == a229[2])) && (69 == a320[2])))) {
    	cf = false;
    	if((a215 == 17)) {
    	a279 = (((((a279 + 7898) % 55) - -270) * 9) / 10);
    	a212 = 9;
    	a263 = 12;
    	a280 = (((((a280 % 39) + 322) * 5) % 39) - -301);
    	a116 = "g";
    	a283 = "g";
    	a310 = "g";
    	a291 = a307[7];
    	a349 = ((((a349 * -5) * 10) / 9) * 5);
    	a365 = "g";
    	a390 = (((a390 + 763) + 28615) * 1);
    	a146 = a3[a373];
    	a266 = a221;
    	a353 = a343[4];
    	a377 = a281;
    	a261 = a229[4];
    	a337 = 8;
    	a391 = a392[0];
    	a295 = ((((a295 + -17533) * 10) / -9) / 5);
    	a312 = a382[4];
    	a285 = "i";
    	a215 = 16;
    	a235 = a374;
    	a381 = a218[4];
    	a104 = a148[(a201 + -1)];
    	a400 = ((((a400 % 53) + -19) - 1) - -1);
    	a340 = a245[6];
    	a209 = "g";
    	a278 = "g";
    	a246 = a332;
    	a320 = a299;
    	a333 = "h";
    	a201 = 10;
    	a360 = 14;
    	a399 = a269;
    	a237 = a328;
    	a373 = 4; 
    	}else {
    	a266 = a236;
    	a212 = 15;
    	a237 = a328;
    	a56 = (((((a390 * a390) % 14999) - -4533) * 1) + -27036);
    	a283 = "g";
    	a310 = "e";
    	a261 = a229[4];
    	a278 = "i";
    	a349 = (((((a349 % 72) - -246) * 10) / 9) + -6);
    	a377 = a281;
    	a280 = ((((((a280 % 39) + 308) / 5) / 5) * 238) / 10);
    	a373 = 8;
    	a320 = a217;
    	a88 = (((((a56 * a56) % 14999) + -14985) / 5) * 5);
    	a312 = a382[6];
    	a285 = "h";
    	a246 = a332;
    	a365 = "g";
    	a235 = a374;
    	a279 = (((a279 / 5) - 18014) - -27402);
    	a360 = 13;
    	a215 = 14;
    	a340 = a245[4];
    	a337 = 12;
    	a399 = a269;
    	a333 = "g";
    	a263 = 14;
    	a146 = a3[(a201 - 7)];
    	a295 = (((a295 - 29966) - -14272) * 1);
    	a391 = a392[5];
    	a291 = a307[2];
    	a209 = "h";
    	a353 = a343[2];
    	a400 = ((((a400 + 1549) * 5) + -35063) + 29629);
    	a381 = a218[4];
    	a201 = 13;
    	}output = "U";
    } 
    if((((28 == a266[3]) && ((a333.equals("g")) && (((input.equals(inputs[5]) && a381 == a218[2]) && (a278.equals("g"))) && (a215 == 12)))) && ((a283.equals("g")) && (((cf && (a136 == 9)) && (a190.equals("g"))) && a146 == a3[2])))) {
    	cf = false;
    	a381 = a218[3];
    	a209 = "h";
    	a377 = a281;
    	a146 = a3[((a212 - a263) - -2)];
    	a285 = "i";
    	a278 = "i";
    	a280 = ((((((a280 % 39) - -289) * 10) / 9) * 9) / 10);
    	a390 = ((((a390 / 5) / 5) * 5) + 8779);
    	a391 = a392[6];
    	a310 = "i";
    	a237 = a328;
    	a295 = (((a295 - -15537) + 12305) + -49349);
    	a320 = a217;
    	a283 = "i";
    	a235 = a240;
    	a340 = a245[6];
    	a291 = a307[7];
    	a353 = a343[0];
    	a365 = "h";
    	a400 = ((((a400 * 5) / 5) * 5) - -26812);
    	a399 = a344;
    	a24 = (a136 - -3);
    	a201 = 9;
    	a279 = (((a279 / -5) * 5) + -26589);
    	a215 = 14;
    	a103 = (a136 - -1);
    	a373 = 4;
    	a349 = (((a349 / 5) - -206) * 1);
    	a246 = a296;
    	a261 = a229[2];
    	a312 = a382[7];
    	a263 = 8;
    	a360 = 15;
    	a337 = 8;
    	a333 = "h";
    	a212 = 13; 
    	output = "S";
    } 
    if((((32 == a237[4]) && (((221 < a279) && (333 >= a279)) && (a146 == a3[2] && ((a190.equals("g")) && (cf && (a136 == 9)))))) && ((((16 < a295) && (208 >= a295)) && (((-75 < a400) && (33 >= a400)) && ((97 == a246[5]) && ((243 < a349) && (389 >= a349))))) && input.equals(inputs[2])))) {
    	cf = false;
    	if(((a156 <=  -10 || a64 == a67[6]) && !(a24 == 13))) {
    	a320 = a299;
    	a399 = a269;
    	a373 = 5;
    	a24 = (a215 + -4);
    	a365 = "i";
    	a400 = (((a400 / 5) - 12178) * 2);
    	a390 = (((a390 + -28476) + -1088) * 1);
    	a266 = a221;
    	a261 = a229[2];
    	a235 = a374;
    	a279 = (((a279 / 5) - -7509) - 7318);
    	a291 = a307[7];
    	a146 = a3[((a337 * a201) - 61)];
    	a349 = (((((a349 * 5) % 72) + 308) + -17199) - -17186);
    	a360 = 14;
    	a263 = 14;
    	a50 = a0[(a337 - 3)];
    	a337 = 12; 
    	}else {
    	a15 = ((a215 / a136) - -12);
    	a391 = a392[1];
    	a310 = "g";
    	a312 = a382[4];
    	a340 = a245[5];
    	a278 = "f";
    	a285 = "g";
    	a333 = "h";
    	a295 = (((((a295 + 11981) % 95) - -68) - 1531) + 1519);
    	a283 = "i";
    	a349 = (((a349 + 3055) * 5) * 1);
    	a377 = a366;
    	a263 = 14;
    	a237 = a265;
    	a320 = a372;
    	a360 = 14;
    	a209 = "g";
    	a212 = 14;
    	a146 = a3[((a15 / a215) - -6)];
    	a201 = 10;
    	a19 = (((((63 + 1775) * 1) / 10) * 10) / 9);
    	}output = "S";
    } 
}
private  void calculateOutputm111(String input) {
    if((((97 == a377[3]) && ((a190.equals("i")) && (input.equals(inputs[0]) && ((28 == a266[3]) && (a310.equals("g")))))) && ((a263 == 10) && (a291 == a307[2] && (((a136 == 9) && (a146 == a3[2] && cf)) && (a333.equals("g"))))))) {
    	cf = false;
    	a136 = (a212 - 3);
    	a167 = (a136 + -5); 
    	output = "T";
    } 
    if((((a201 == 8) && (((a212 == 11) && (a263 == 10)) && input.equals(inputs[1]))) && (((((a209.equals("g")) && ((cf && a146 == a3[2]) && (a190.equals("i")))) && a381 == a218[2]) && (a136 == 9)) && (a285.equals("g"))))) {
    	cf = false;
    	a279 = ((((a279 - -24791) - -165) / 5) + -4750);
    	a333 = "e";
    	a261 = a229[3];
    	a291 = a307[5];
    	a400 = ((((a400 - -9627) % 53) - 50) + 20);
    	a244 = (((a244 - 9885) - -31042) * 1);
    	a24 = ((a136 * a136) - 68);
    	a312 = a382[6];
    	a237 = a336;
    	a310 = "g";
    	a337 = 12;
    	a365 = "g";
    	a212 = 11;
    	a390 = ((((a390 - -14039) - -1871) - -4861) - 27911);
    	a283 = "i";
    	a381 = a218[3];
    	a340 = a245[6];
    	a266 = a236;
    	a280 = (((a280 + -7072) * 4) * 1);
    	a278 = "g";
    	a146 = a3[((a360 - a201) - -1)];
    	a201 = 11;
    	a320 = a299;
    	a215 = 13;
    	a349 = ((((a349 - -16409) / 5) + 19158) + -23338);
    	a246 = a332;
    	a373 = 5;
    	a353 = a343[0];
    	a79 = "i";
    	a377 = a281;
    	a235 = a240;
    	a285 = "e";
    	a263 = 12;
    	a209 = "e";
    	a399 = a269;
    	a295 = ((((((a295 % 62) + -74) * 10) / 9) + 14739) - 14762);
    	a360 = 10; 
    	output = "S";
    } 
    if((((a278.equals("g")) && (a146 == a3[2] && ((a190.equals("i")) && (cf && input.equals(inputs[5]))))) && ((((32 == a237[4]) && (((a310.equals("g")) && (56 == a235[3])) && a391 == a392[2])) && (a136 == 9)) && (a283.equals("g"))))) {
    	cf = false;
    	a381 = a218[7];
    	a235 = a240;
    	a201 = 10;
    	a263 = 14;
    	a338 = (a360 - 3);
    	a215 = 14;
    	a279 = ((((a279 % 55) + 246) + -20) * 1);
    	a266 = a221;
    	a280 = (((((a280 * 10) / 7) - -13235) * 10) / 9);
    	a333 = "f";
    	a320 = a372;
    	a246 = a358;
    	a399 = a251;
    	a15 = (a212 - 4);
    	a295 = (((((a295 * 5) + -22270) - -27732) % 95) - -108);
    	a360 = 12;
    	a337 = 10;
    	a349 = ((((a349 % 72) - -300) - 19131) - -19118);
    	a391 = a392[7];
    	a377 = a204;
    	a278 = "f";
    	a312 = a382[4];
    	a353 = a343[4];
    	a400 = ((((a400 * 5) + 18301) % 53) - 19);
    	a244 = (((((a244 % 23) - -115) + 2) + 11939) - 11954);
    	a291 = a307[4];
    	a261 = a229[6];
    	a373 = 9;
    	a390 = (((a390 * 5) - -25391) - -644);
    	a285 = "i";
    	a310 = "g";
    	a237 = a328;
    	a283 = "f";
    	a340 = a245[6];
    	a146 = a3[(a212 + -4)];
    	a209 = "g";
    	a212 = 16; 
    	output = "U";
    } 
    if(((a340 == a245[2] && ((a136 == 9) && ((a373 == 4) && (((a212 == 11) && ((a190.equals("i")) && (cf && a146 == a3[2]))) && (a283.equals("g")))))) && ((input.equals(inputs[7]) && ((243 < a349) && (389 >= a349))) && a391 == a392[2]))) {
    	cf = false;
    	a283 = "g";
    	a373 = 6;
    	a349 = (((((a349 % 72) - -283) * 9) / 10) - -31);
    	a246 = a296;
    	a291 = a307[6];
    	a320 = a299;
    	a263 = 11;
    	a295 = (((((a295 + -16163) * 1) + 36532) * -1) / 10);
    	a285 = "g";
    	a340 = a245[7];
    	a360 = 14;
    	a377 = a204;
    	a279 = (((a279 + -11124) - 17751) + -1215);
    	a261 = a229[6];
    	a381 = a218[0];
    	a201 = 11;
    	a244 = (((a244 + 18935) * 1) * 1);
    	a399 = a269;
    	a310 = "e";
    	a400 = (((a400 + -26274) * 1) / 5);
    	a237 = a328;
    	a391 = a392[6];
    	a365 = "g";
    	a209 = "i";
    	a235 = a240;
    	a390 = (((((a390 % 37) - -270) / 5) + 6319) - 6117);
    	a333 = "g";
    	a312 = a382[0];
    	a24 = (a136 + 3);
    	a103 = (a24 + -2);
    	a215 = 13;
    	a212 = 16;
    	a146 = a3[((a103 + a337) + -15)];
    	a278 = "g";
    	a353 = a343[6];
    	a280 = (((((a280 - -19504) % 39) - -305) - -19163) - 19180);
    	a337 = 6; 
    	output = "Z";
    } 
    if((((a285.equals("g")) && (((243 < a349) && (389 >= a349)) && (((a215 == 12) && (((221 < a279) && (333 >= a279)) && (a190.equals("i")))) && input.equals(inputs[9])))) && ((((cf && (a136 == 9)) && a146 == a3[2]) && a261 == a229[2]) && ((141 < a244) && (256 >= a244))))) {
    	cf = false;
    	a215 = 15;
    	a116 = "i";
    	a390 = ((((a390 / -5) - -19943) * 1) * -1);
    	a146 = a3[((a212 - a263) - -3)];
    	a320 = a217;
    	a279 = ((((a279 + 21583) - -2619) * 10) / 9);
    	a263 = 11;
    	a56 = ((((((a295 * a280) % 14999) - 19119) * 1) + 31355) * -1);
    	a360 = 10;
    	a337 = 12;
    	a349 = (((a349 + -26796) - -44950) + 326);
    	a280 = ((((a280 * 13) / 10) / 5) + 2784);
    	a312 = a382[2];
    	a237 = a328;
    	a353 = a343[0];
    	a261 = a229[3];
    	a283 = "g";
    	a295 = (((((a295 + 26482) - 30406) - 21013) % 95) + 158); 
    	output = "X";
    } 
    if((((((((-75 < a400) && (33 >= a400)) && ((cf && input.equals(inputs[2])) && (a136 == 9))) && (a190.equals("i"))) && a312 == a382[2]) && (a285.equals("g"))) && (((((243 < a349) && (389 >= a349)) && (a283.equals("g"))) && a146 == a3[2]) && (32 == a237[4])))) {
    	cf = false;
    	if((!(a166 == 12) || (((cf && (a278.equals("h"))) || ((-73 < a162) && (42 >= a162))) || 158 < a156))) {
    	a360 = 12;
    	a390 = ((((a390 + -20374) + 20204) - 16275) - -16334);
    	a235 = a374;
    	a312 = a382[4];
    	a340 = a245[2];
    	a302 = "e";
    	a17 = "i";
    	a377 = a281;
    	a244 = ((((((a244 % 57) - -151) - 9) / 5) * 55) / 10);
    	a215 = 16;
    	a291 = a307[2];
    	a280 = (((a280 - 89) - 31) - 2);
    	a373 = 8;
    	a310 = "h";
    	a285 = "f";
    	a400 = (((((a400 * 5) % 53) + -19) - 29158) - -29155);
    	a279 = ((((a279 + -114) * 1) + 11481) + -11482);
    	a146 = a3[(a337 - 8)];
    	a278 = "h";
    	a261 = a229[3];
    	a320 = a299;
    	a349 = (((((a349 % 72) + 280) / 5) * 10) / 2);
    	a283 = "g";
    	a263 = 12;
    	a295 = ((((a295 + 2990) + 20205) - 50073) - -36277);
    	a391 = a392[2];
    	a246 = a332;
    	a399 = a251;
    	a201 = 13;
    	a381 = a218[5];
    	a333 = "h";
    	a353 = a343[7];
    	a209 = "g";
    	a212 = 15;
    	a237 = a265;
    	a266 = a211;
    	a337 = 11; 
    	}else {
    	a340 = a245[7];
    	a283 = "i";
    	a146 = a3[(a263 + -3)];
    	a280 = (((a280 + -93) - 20140) + 20110);
    	a15 = (a212 + -2);
    	a390 = ((((a390 * 4) / 10) * 5) + -412);
    	a377 = a366;
    	a266 = a236;
    	a201 = 8;
    	a391 = a392[5];
    	a235 = a324;
    	a333 = "e";
    	a244 = ((((a244 / 5) - -161) + -23758) - -23737);
    	a246 = a358;
    	a400 = (((((a400 + 16378) % 13) + -90) - -24238) + -24240);
    	a349 = (((a349 * 5) + 13861) - 5270);
    	a237 = a328;
    	a261 = a229[4];
    	a263 = 12;
    	a320 = a299;
    	a209 = "i";
    	a337 = 10;
    	a381 = a218[6];
    	a285 = "g";
    	a310 = "f";
    	a399 = a251;
    	a312 = a382[6];
    	a278 = "i";
    	a64 = a67[((a15 * a215) - 107)];
    	a212 = 13;
    	a279 = (((a279 * 5) * 5) - 10573);
    	a353 = a343[2];
    	a360 = 11;
    	a373 = 7;
    	a291 = a307[1];
    	a215 = 17;
    	}output = "S";
    } 
    if((((a278.equals("g")) && ((((a190.equals("i")) && (input.equals(inputs[3]) && (a146 == a3[2] && cf))) && a353 == a343[2]) && a312 == a382[2])) && ((102 == a399[4]) && ((a136 == 9) && ((28 == a266[3]) && a340 == a245[2]))))) {
    	cf = false;
    	a310 = "i";
    	a285 = "g";
    	a291 = a307[6];
    	a349 = ((((a349 / 5) - 5533) + -14832) + 20596);
    	a333 = "i";
    	a263 = 13;
    	a295 = ((((a295 * 5) % 62) + -48) + -61);
    	a280 = (((a280 - -2779) / 5) * 5);
    	a353 = a343[6];
    	a215 = 12;
    	a399 = a251;
    	a373 = 7;
    	a212 = 14;
    	a246 = a332;
    	a390 = ((((a390 + -100) - 53) - 20751) + 20786);
    	a377 = a366;
    	a283 = "g";
    	a237 = a265;
    	a391 = a392[6];
    	a235 = a374;
    	a279 = (((((a279 * 5) % 55) - -237) + 28116) - 28114);
    	a340 = a245[1];
    	a400 = ((((a400 % 53) - 21) + -1) - 0);
    	a146 = a3[(a337 - 8)];
    	a244 = (((((a244 + -18060) % 57) + 215) / 5) + 118);
    	a337 = 7;
    	a17 = "e";
    	a209 = "i";
    	a201 = 12;
    	a278 = "h";
    	a320 = a299;
    	a360 = 10;
    	a261 = a229[4];
    	a266 = a211;
    	a381 = a218[7];
    	a312 = a382[2];
    	a33 = a111; 
    	output = "Y";
    } 
    if(((a391 == a392[2] && (97 == a246[5])) && ((((251 < a390) && (326 >= a390)) && (((a201 == 8) && (((a146 == a3[2] && (cf && (a190.equals("i")))) && input.equals(inputs[4])) && (a136 == 9))) && ((284 < a280) && (364 >= a280)))) && (a278.equals("g"))))) {
    	cf = false;
    	a365 = "h";
    	a391 = a392[7];
    	a215 = 16;
    	a373 = 8;
    	a212 = 14;
    	a399 = a269;
    	a280 = ((((a280 * 5) + -10963) / 5) - -18836);
    	a400 = (((a400 + 3653) + 10208) - -12458);
    	a263 = 14;
    	a109 = (a136 - 7);
    	a312 = a382[7];
    	a279 = ((((a279 / 5) / 5) * 5) - -23070);
    	a244 = ((((a244 - 2515) + 14140) * 2) * -1);
    	a237 = a336;
    	a333 = "h";
    	a381 = a218[6];
    	a377 = a204;
    	a353 = a343[2];
    	a266 = a221;
    	a349 = ((((a349 % 72) - -264) * 1) - -50);
    	a261 = a229[7];
    	a291 = a307[0];
    	a320 = a217;
    	a209 = "g";
    	a285 = "i";
    	a201 = 6;
    	a340 = a245[6];
    	a235 = a374;
    	a283 = "i";
    	a113 = "f";
    	a146 = a3[((a337 * a109) - 11)];
    	a390 = (((a390 / 5) + 21010) - -6953);
    	a246 = a296;
    	a278 = "e";
    	a360 = 15;
    	a310 = "i";
    	a295 = (((((((a295 % 95) - -87) * 10) / 9) * 5) % 95) - -101);
    	a337 = 10; 
    	output = "S";
    } 
    if((((a136 == 9) && ((a310.equals("g")) && (((a212 == 11) && a340 == a245[2]) && (32 == a237[4])))) && ((a201 == 8) && (((16 < a295) && (208 >= a295)) && ((a190.equals("i")) && (input.equals(inputs[6]) && (cf && a146 == a3[2]))))))) {
    	cf = false;
    	a360 = 11;
    	a212 = 12;
    	a291 = a307[2];
    	a237 = a328;
    	a280 = ((((((a280 * 6) / 10) - 14) - -2616) * 1) / 10);
    	a353 = a343[5];
    	a373 = 5;
    	a399 = a251;
    	a261 = a229[6];
    	a390 = (((a390 - 204) - -27032) - -544);
    	a263 = 10;
    	a377 = a366;
    	a246 = a332;
    	a215 = 16;
    	a337 = 13;
    	a381 = a218[7];
    	a278 = "i";
    	a295 = (((a295 + 7379) - -1462) * 3);
    	a266 = a211;
    	a209 = "i";
    	a244 = (((a244 * 5) * 5) - -17488);
    	a349 = ((((a349 % 72) - -284) + 29) + -64);
    	a310 = "e";
    	a201 = 10;
    	a340 = a245[3];
    	a285 = "i";
    	a235 = a374;
    	a391 = a392[4];
    	a17 = "e";
    	a146 = a3[(a136 - 9)];
    	a333 = "h";
    	a312 = a382[4];
    	a400 = ((((a400 - -16005) + 9580) % 13) - 90);
    	a320 = a299;
    	a283 = "h";
    	a279 = (((a279 / 5) - -27989) / 5);
    	a33 = a111; 
    	output = "S";
    } 
    if((((a373 == 4) && ((69 == a320[2]) && ((97 == a377[3]) && ((a310.equals("g")) && (28 == a266[3]))))) && (a261 == a229[2] && (((a190.equals("i")) && ((a136 == 9) && (input.equals(inputs[8]) && cf))) && a146 == a3[2])))) {
    	cf = false;
    	a146 = a3[(a136 + -4)];
    	a109 = (a360 + -7);
    	a156 = (((98 + -66) + -35) - 4); 
    	output = "S";
    } 
}
private  void calculateOutputm16(String input) {
    if(((((97 == a377[3]) && (a261 == a229[2] && (a365.equals("g")))) && ((284 < a280) && (364 >= a280))) && ((a263 == 10) && (((16 < a295) && (208 >= a295)) && (cf && (a190.equals("g"))))))) {
    	calculateOutputm109(input);
    } 
    if(((a291 == a307[2] && a391 == a392[2]) && ((a381 == a218[2] && ((((284 < a280) && (364 >= a280)) && ((a190.equals("i")) && cf)) && (a212 == 11))) && a353 == a343[2]))) {
    	calculateOutputm111(input);
    } 
}
private  void calculateOutputm112(String input) {
    if((((((97 == a246[5]) && (a337 == 8)) && (a212 == 11)) && a261 == a229[2]) && ((28 == a266[3]) && ((input.equals(inputs[7]) && (((cf && a146 == a3[2]) && (a166 == 9)) && (a136 == 10))) && (a360 == 10))))) {
    	cf = false;
    	a109 = ((a212 - a215) - -6);
    	a155 = "i";
    	a146 = a3[((a212 + a201) + -13)]; 
    	output = "W";
    } 
    if((((input.equals(inputs[5]) && ((a365.equals("g")) && (a136 == 10))) && (102 == a399[4])) && ((a340 == a245[2] && ((a285.equals("g")) && ((a283.equals("g")) && (a146 == a3[2] && ((a166 == 9) && cf))))) && ((141 < a244) && (256 >= a244))))) {
    	a154 -= (a154 - 20) < a154 ? 3 : 0;
    	cf = false;
    	if((a104 == a148[6] || (a146 == a3[5] || ((a365.equals("e")) || a261 == a229[6])))) {
    	a15 = (a166 + -1);
    	a177 = ((a15 * a215) - 95);
    	a146 = a3[(a201 - 1)]; 
    	}else {
    	a146 = a3[(a166 + -3)];
    	a76 = a48;
    	a61 = a28;
    	}output = "T";
    } 
    if((((((28 == a266[3]) && ((284 < a280) && (364 >= a280))) && (a136 == 10)) && a381 == a218[2]) && ((((input.equals(inputs[6]) && (((a166 == 9) && cf) && a146 == a3[2])) && (a212 == 11)) && (a365.equals("g"))) && (97 == a246[5])))) {
    	cf = false;
    	if((((-80 < a193) && (115 >= a193)) || (!(a333.equals("i")) && ((a263 == 9) && (!(a136 == 4) && ((75 < a390) && (251 >= a390))))))) {
    	a146 = a3[(a215 + -8)];
    	a116 = "i";
    	a56 = (((((a244 * a295) % 14999) + 800) / 5) - -11121); 
    	}else {
    	a325 = "g";
    	a116 = "h";
    	a146 = a3[((a263 / a136) + 3)];
    	}output = "T";
    } 
    if(((a391 == a392[2] && ((((243 < a349) && (389 >= a349)) && ((input.equals(inputs[2]) && ((a215 == 12) && a340 == a245[2])) && (a136 == 10))) && (a337 == 8))) && (a312 == a382[2] && (a146 == a3[2] && (cf && (a166 == 9)))))) {
    	cf = false;
    	a127 = a29[(a201 - 4)];
    	a146 = a3[(a201 - 7)];
    	a56 = (((((74 - 27648) - -27681) / 5) * 49) / 10); 
    	output = "Z";
    } 
    if((((a283.equals("g")) && ((a337 == 8) && (((a136 == 10) && (cf && (a166 == 9))) && a146 == a3[2]))) && (((141 < a244) && (256 >= a244)) && (((a278.equals("g")) && (input.equals(inputs[3]) && (a215 == 12))) && a391 == a392[2])))) {
    	cf = false;
    	if((a365.equals("e"))) {
    	a235 = a374;
    	a56 = (((((a280 * a400) + 11939) % 82) - -126) - -3);
    	a333 = "i";
    	a237 = a328;
    	a266 = a221;
    	a127 = a29[(a136 + -10)];
    	a377 = a281;
    	a212 = 14;
    	a246 = a296;
    	a360 = 14;
    	a399 = a269;
    	a312 = a382[4];
    	a373 = 6;
    	a146 = a3[((a136 * a136) + -99)]; 
    	}else {
    	a146 = a3[(a136 + -6)];
    	a116 = "g";
    	a104 = a148[((a201 + a136) - 16)];
    	}output = "Z";
    } 
    if((((a360 == 10) && (a312 == a382[2] && (((((a136 == 10) && ((a166 == 9) && cf)) && ((284 < a280) && (364 >= a280))) && input.equals(inputs[1])) && (102 == a399[4])))) && (a146 == a3[2] && (a381 == a218[2] && (32 == a237[4]))))) {
    	cf = false;
    	a15 = ((a201 / a212) - -7);
    	a338 = (a337 + -3);
    	a146 = a3[((a338 * a337) + -23)]; 
    	output = "Z";
    } 
    if(((a146 == a3[2] && ((a136 == 10) && (((input.equals(inputs[4]) && ((a166 == 9) && cf)) && (a360 == 10)) && (69 == a320[2])))) && ((56 == a235[3]) && ((a285.equals("g")) && ((a283.equals("g")) && ((-75 < a400) && (33 >= a400))))))) {
    	cf = false;
    	if(((a30 == 11) && (((a166 == 14) && 455 < a180) && !(a261 == a229[5])))) {
    	a381 = a218[6];
    	a399 = a269;
    	a390 = (((((a390 % 37) - -268) * 5) % 37) + 283);
    	a56 = (((((a295 * a244) % 14999) + 7241) - -4069) + -8556);
    	a146 = a3[(a166 / a337)];
    	a266 = a221;
    	a349 = (((((a349 * 5) % 109) + 105) / 5) + 89);
    	a246 = a296;
    	a310 = "e";
    	a261 = a229[7];
    	a283 = "i";
    	a353 = a343[6];
    	a280 = ((((a280 % 39) - -289) + -4) - 0);
    	a235 = a240;
    	a377 = a281;
    	a291 = a307[7];
    	a400 = ((((a400 - 747) % 53) + -18) + 23);
    	a263 = 10;
    	a285 = "g";
    	a360 = 11;
    	a391 = a392[2];
    	a373 = 9;
    	a237 = a328;
    	a278 = "h";
    	a212 = 12;
    	a201 = 12;
    	a215 = 17;
    	a312 = a382[5];
    	a333 = "h";
    	a101 = "f";
    	a295 = ((((a295 - 16891) - 6401) - -24946) + -10922);
    	a244 = (((((a244 + 19434) % 57) + 145) + 13085) + -13064);
    	a209 = "i";
    	a365 = "i";
    	a340 = a245[2];
    	a320 = a217;
    	a337 = 9; 
    	}else {
    	a109 = (a337 - a373);
    	a146 = a3[((a136 + a166) - 14)];
    	a82 = a10;
    	}output = "W";
    } 
    if((((a263 == 10) && ((a283.equals("g")) && ((a136 == 10) && a353 == a343[2]))) && (((56 == a235[3]) && ((input.equals(inputs[9]) && ((a166 == 9) && (cf && a146 == a3[2]))) && a312 == a382[2])) && a381 == a218[2]))) {
    	cf = false;
    	if((a79.equals("i"))) {
    	a237 = a265;
    	a279 = (((100 - -13951) - -3335) * -1);
    	a399 = a344;
    	a212 = 10;
    	a309 = (a166 + 5);
    	a349 = (((a349 * 5) / -5) / 5);
    	a320 = a299;
    	a291 = a307[3];
    	a295 = (((a295 + 29162) / 5) - -3588);
    	a246 = a358;
    	a280 = ((((a280 / 5) * 5) * 13) / 10);
    	a201 = 6;
    	a136 = ((a337 * a166) - 65); 
    	}else {
    	a377 = a281;
    	a360 = 14;
    	a340 = a245[4];
    	a283 = "e";
    	a279 = ((((62 * -5) * 10) / 9) / 5);
    	a146 = a3[((a136 * a201) + -73)];
    	a280 = ((((a280 * 10) / 13) / 5) + 174);
    	a19 = (((((((a295 * a390) % 14999) - -640) - 12326) * 2) % 45) + 60);
    	a349 = (((((a349 + -213) * 10) / 9) - -1279) + -1249);
    	a212 = 14;
    	a235 = a374;
    	a373 = 4;
    	a333 = "i";
    	a291 = a307[2];
    	a201 = 13;
    	a263 = 12;
    	a400 = ((((a400 - 9976) * 10) / 9) * 2);
    	a337 = 11;
    	a312 = a382[5];
    	a381 = a218[7];
    	a246 = a358;
    	a390 = ((((((a390 * 5) % 87) - -147) * 5) % 87) + 150);
    	a266 = a211;
    	a15 = (a166 + 4);
    	a310 = "i";
    	a399 = a269;
    	a278 = "h";
    	a391 = a392[1];
    	a353 = a343[4];
    	a365 = "i";
    	a237 = a328;
    	a261 = a229[2];
    	a215 = 15;
    	a209 = "i";
    	a244 = ((((((a244 % 57) + 193) + -30) * 5) % 57) + 168);
    	a320 = a372;
    	a285 = "g";
    	a295 = ((((a295 - -1980) % 62) + -54) - -3);
    	}output = "Z";
    } 
    if(((((((a365.equals("g")) && ((a373 == 4) && (a310.equals("g")))) && input.equals(inputs[0])) && (56 == a235[3])) && (32 == a237[4])) && ((69 == a320[2]) && ((a146 == a3[2] && ((a166 == 9) && cf)) && (a136 == 10))))) {
    	cf = false;
    	a215 = 14;
    	a310 = "h";
    	a237 = a336;
    	a295 = (((a295 - 23137) + -227) + 36696);
    	a390 = (((a390 / 5) + 237) - -21);
    	a128 = (a337 + -5);
    	a320 = a299;
    	a312 = a382[5];
    	a353 = a343[4];
    	a360 = 8;
    	a209 = "i";
    	a116 = "f";
    	a377 = a204;
    	a283 = "g";
    	a261 = a229[4];
    	a146 = a3[((a128 + a212) - 10)]; 
    	output = "W";
    } 
    if(((((102 == a399[4]) && (((a360 == 10) && (((a146 == a3[2] && (input.equals(inputs[8]) && cf)) && (a166 == 9)) && (a136 == 10))) && a353 == a343[2])) && (a209.equals("g"))) && ((a283.equals("g")) && (28 == a266[3])))) {
    	cf = false;
    	a316 = "f";
    	a146 = a3[(a136 + -7)];
    	a24 = ((a201 - a263) + 8); 
    	output = "W";
    } 
}
private  void calculateOutputm113(String input) {
    if((((a263 == 10) && (a365.equals("g"))) && ((((a333.equals("g")) && ((((141 < a244) && (256 >= a244)) && ((a136 == 10) && (a146 == a3[2] && (input.equals(inputs[2]) && cf)))) && (a166 == 12))) && a261 == a229[2]) && a312 == a382[2]))) {
    	cf = false;
    	a109 = (a373 + 2);
    	a309 = ((a109 + a337) - 1);
    	a146 = a3[(a136 - 5)]; 
    	output = "U";
    } 
    if((((((a136 == 10) && (97 == a246[5])) && a291 == a307[2]) && (a365.equals("g"))) && ((input.equals(inputs[9]) && (((32 == a237[4]) && ((a166 == 12) && (a146 == a3[2] && cf))) && (a310.equals("g")))) && a391 == a392[2]))) {
    	cf = false;
    	if((a201 == 12)) {
    	a353 = a343[4];
    	a212 = 14;
    	a246 = a358;
    	a381 = a218[6];
    	a390 = ((((a390 / 5) + -5292) + -13169) - -18667);
    	a391 = a392[5];
    	a278 = "g";
    	a280 = ((((a280 * 10) / 7) - -6581) - -5566);
    	a312 = a382[2];
    	a237 = a265;
    	a399 = a251;
    	a261 = a229[2];
    	a64 = a67[(a337 - 1)];
    	a333 = "g";
    	a340 = a245[4];
    	a15 = ((a263 - a166) - -11);
    	a320 = a372;
    	a360 = 15;
    	a146 = a3[(a201 - 1)];
    	a201 = 9; 
    	}else {
    	a377 = a281;
    	a278 = "i";
    	a400 = ((((a400 % 53) - 21) / 5) + 3);
    	a381 = a218[4];
    	a295 = ((((((a295 % 95) - -38) / 5) / 5) * 319) / 10);
    	a302 = "h";
    	a291 = a307[4];
    	a215 = 15;
    	a285 = "i";
    	a266 = a211;
    	a390 = (((((((a390 * 4) / 10) * 10) / 9) * 5) * 2) / 10);
    	a201 = 13;
    	a17 = "i";
    	a340 = a245[6];
    	a235 = a374;
    	a146 = a3[((a136 / a360) + -1)];
    	a360 = 10;
    	}output = "Z";
    } 
    if((((((((((251 < a390) && (326 >= a390)) && input.equals(inputs[6])) && a146 == a3[2]) && a340 == a245[2]) && (a360 == 10)) && a261 == a229[2]) && (28 == a266[3])) && (((-75 < a400) && (33 >= a400)) && (((a136 == 10) && cf) && (a166 == 12))))) {
    	cf = false;
    	a279 = (((((a279 - -1709) % 55) + 278) + -15646) - -15646);
    	a360 = 11;
    	a244 = (((((a244 % 23) + 105) - 6659) + -21310) - -27967);
    	a312 = a382[7];
    	a391 = a392[6];
    	a302 = "e";
    	a285 = "i";
    	a146 = a3[((a166 * a337) - 96)];
    	a400 = (((((a400 % 53) - 20) - -5012) / 5) - 1053);
    	a377 = a366;
    	a201 = 7;
    	a280 = ((((a280 * 5) * 5) % 39) + 308);
    	a235 = a374;
    	a209 = "g";
    	a399 = a269;
    	a215 = 13;
    	a365 = "g";
    	a310 = "f";
    	a17 = "i";
    	a340 = a245[4];
    	a266 = a211;
    	a263 = 11;
    	a390 = ((((((a390 * 10) / 13) / 5) / 5) * 109) / 10);
    	a291 = a307[1];
    	a237 = a328;
    	a381 = a218[4];
    	a353 = a343[5];
    	a278 = "g";
    	a246 = a358;
    	a373 = 4;
    	a333 = "g";
    	a320 = a372;
    	a261 = a229[4];
    	a212 = 10;
    	a295 = (((((a295 + -26922) % 95) + 122) * 9) / 10);
    	a337 = 13; 
    	output = "X";
    } 
    if((((a373 == 4) && (((221 < a279) && (333 >= a279)) && (((-75 < a400) && (33 >= a400)) && (((a166 == 12) && ((a136 == 10) && ((cf && input.equals(inputs[4])) && a146 == a3[2]))) && (a212 == 11))))) && ((97 == a246[5]) && (a365.equals("g"))))) {
    	cf = false;
    	if(((a119.equals("g")) && a27 <=  28)) {
    	a291 = a307[6];
    	a283 = "i";
    	a237 = a265;
    	a136 = ((a337 - a166) - -10);
    	a244 = (((a244 + 7732) * 3) - -5499);
    	a349 = (((69 - 104) * 5) + -19584);
    	a235 = a374;
    	a180 = ((((((((a390 * a280) % 14999) % 61) - -170) - -33) * 5) % 61) + 196);
    	a280 = ((((a280 - -667) - 7501) * -1) / 10); 
    	}else {
    	a136 = (a263 + -2);
    	a167 = (a201 - 4);
    	}output = "U";
    } 
    if(((a146 == a3[2] && ((28 == a266[3]) && (((a215 == 12) && (a373 == 4)) && (a278.equals("g"))))) && (((((284 < a280) && (364 >= a280)) && ((cf && (a166 == 12)) && input.equals(inputs[3]))) && (102 == a399[4])) && (a136 == 10)))) {
    	cf = false;
    	a146 = a3[(a166 - 8)];
    	a116 = "g";
    	a104 = a148[(a212 + -8)]; 
    	output = "W";
    } 
    if(((((input.equals(inputs[1]) && (cf && a146 == a3[2])) && (a166 == 12)) && ((284 < a280) && (364 >= a280))) && ((((((a136 == 10) && (a360 == 10)) && (32 == a237[4])) && (a215 == 12)) && (a373 == 4)) && (69 == a320[2])))) {
    	a192 -= (a192 - 20) < a192 ? 3 : 0;
    	cf = false;
    	a400 = (((a400 + 2276) * 5) - -13302);
    	a353 = a343[5];
    	a320 = a299;
    	a312 = a382[4];
    	a365 = "h";
    	a235 = a324;
    	a15 = (a337 + 1);
    	a212 = 10;
    	a291 = a307[3];
    	a64 = a67[((a337 / a215) - -1)];
    	a209 = "f";
    	a266 = a236;
    	a333 = "g";
    	a237 = a328;
    	a278 = "i";
    	a280 = (((((a280 - 8952) * 3) + -2238) * -1) / 10);
    	a261 = a229[5];
    	a360 = 10;
    	a340 = a245[6];
    	a373 = 7;
    	a246 = a358;
    	a244 = (((a244 - -26731) / 5) * 5);
    	a337 = 8;
    	a381 = a218[6];
    	a285 = "h";
    	a377 = a366;
    	a279 = (((((a279 % 55) - -240) - -17335) * 1) - 17352);
    	a391 = a392[5];
    	a390 = (((((a390 - 15155) - -35223) * 1) % 37) - -270);
    	a146 = a3[((a263 * a263) - 93)];
    	a399 = a269;
    	a310 = "g";
    	a215 = 17;
    	a201 = 12;
    	a263 = 15; 
    	output = "X";
    } 
    if((((a136 == 10) && (((a201 == 8) && (((16 < a295) && (208 >= a295)) && (a285.equals("g")))) && a146 == a3[2])) && ((56 == a235[3]) && ((a209.equals("g")) && ((input.equals(inputs[8]) && ((a166 == 12) && cf)) && ((284 < a280) && (364 >= a280))))))) {
    	cf = false;
    	a312 = a382[4];
    	a360 = 15;
    	a295 = (((a295 / 5) - -10103) - -53);
    	a285 = "i";
    	a320 = a299;
    	a156 = ((((((a279 * a280) % 14999) - 23628) * 1) * -1) / 10);
    	a353 = a343[6];
    	a373 = 8;
    	a365 = "i";
    	a109 = ((a215 + a263) - 19);
    	a333 = "h";
    	a237 = a336;
    	a291 = a307[2];
    	a391 = a392[3];
    	a201 = 11;
    	a261 = a229[7];
    	a146 = a3[((a136 * a136) + -95)];
    	a246 = a332;
    	a279 = (((a279 * -5) + -14347) - 13927); 
    	output = "Z";
    } 
    if(((((-75 < a400) && (33 >= a400)) && (((a285.equals("g")) && a146 == a3[2]) && a391 == a392[2])) && ((((141 < a244) && (256 >= a244)) && (((a166 == 12) && ((a136 == 10) && (cf && input.equals(inputs[5])))) && (a365.equals("g")))) && (a360 == 10)))) {
    	cf = false;
    	if(((51 == a130[5]) || a104 == a148[0])) {
    	a128 = (a373 + -2);
    	a116 = "f";
    	a146 = a3[(a136 + -6)]; 
    	}else {
    	a291 = a307[4];
    	a146 = a3[(a136 - 3)];
    	a337 = 7;
    	a212 = 11;
    	a266 = a236;
    	a310 = "g";
    	a244 = ((((a244 + -13492) * -1) / 10) - -10224);
    	a340 = a245[4];
    	a278 = "i";
    	a353 = a343[7];
    	a279 = ((((a279 * 10) / 6) * 5) / 5);
    	a285 = "h";
    	a215 = 17;
    	a261 = a229[1];
    	a235 = a324;
    	a373 = 8;
    	a381 = a218[7];
    	a333 = "h";
    	a390 = ((((a390 + 11857) % 37) - -280) - 14);
    	a15 = (a136 + 2);
    	a377 = a281;
    	a237 = a328;
    	a400 = (((a400 + 755) + 23765) - -261);
    	a280 = (((a280 + 7773) * 3) * 1);
    	a201 = 9;
    	a399 = a251;
    	a365 = "f";
    	a295 = (((((a295 * 5) / 5) + -6499) % 95) + 145);
    	a263 = 15;
    	a391 = a392[5];
    	a360 = 15;
    	a209 = "f";
    	a312 = a382[5];
    	a117 = a178[(a15 + -6)];
    	}output = "U";
    } 
    if((((a146 == a3[2] && ((a381 == a218[2] && (a166 == 12)) && (a365.equals("g")))) && a291 == a307[2]) && (((a333.equals("g")) && (((cf && input.equals(inputs[0])) && (a136 == 10)) && (a209.equals("g")))) && a261 == a229[2]))) {
    	cf = false;
    	a381 = a218[6];
    	a244 = (((((a244 * 5) - -323) - 17171) % 57) + 213);
    	a215 = 13;
    	a400 = ((((a400 - -20179) * 10) / 9) * 1);
    	a146 = a3[(a337 + -8)];
    	a263 = 12;
    	a377 = a366;
    	a235 = a324;
    	a360 = 15;
    	a261 = a229[4];
    	a285 = "g";
    	a266 = a236;
    	a373 = 9;
    	a17 = "f";
    	a291 = a307[3];
    	a278 = "g";
    	a152 = a143; 
    	output = "X";
    } 
    if(((((69 == a320[2]) && ((a136 == 10) && a353 == a343[2])) && (a212 == 11)) && (((((a166 == 12) && (input.equals(inputs[7]) && (cf && a146 == a3[2]))) && ((141 < a244) && (256 >= a244))) && ((-75 < a400) && (33 >= a400))) && (a285.equals("g"))))) {
    	cf = false;
    	a340 = a245[4];
    	a266 = a211;
    	a295 = (((((a295 + -24976) % 95) - -146) + 26192) - 26138);
    	a333 = "i";
    	a312 = a382[4];
    	a246 = a358;
    	a17 = "i";
    	a212 = 10;
    	a310 = "i";
    	a279 = ((((a279 - 113) + -1) - 22383) - -22382);
    	a353 = a343[3];
    	a285 = "g";
    	a302 = "i";
    	a278 = "h";
    	a365 = "i";
    	a399 = a269;
    	a377 = a366;
    	a237 = a328;
    	a280 = (((a280 / -5) + -3174) + -18242);
    	a209 = "g";
    	a215 = 14;
    	a381 = a218[7];
    	a400 = (((a400 + 27599) + 2222) * 1);
    	a146 = a3[((a136 / a373) - 2)];
    	a360 = 14;
    	a390 = (((a390 + 23303) + 5755) / 5);
    	a244 = (((a244 - -18567) / 5) * 5);
    	a263 = 10;
    	a320 = a372;
    	a391 = a392[4];
    	a235 = a324;
    	a291 = a307[1];
    	a337 = 9;
    	a201 = 12;
    	a261 = a229[4];
    	a373 = 8; 
    	output = "S";
    } 
}
private  void calculateOutputm17(String input) {
    if(((((-75 < a400) && (33 >= a400)) && (a391 == a392[2] && ((cf && (a166 == 9)) && ((16 < a295) && (208 >= a295))))) && ((a333.equals("g")) && (((251 < a390) && (326 >= a390)) && (a283.equals("g")))))) {
    	calculateOutputm112(input);
    } 
    if(((56 == a235[3]) && (((((32 == a237[4]) && (((a166 == 12) && cf) && (69 == a320[2]))) && (a263 == 10)) && (a310.equals("g"))) && (102 == a399[4])))) {
    	calculateOutputm113(input);
    } 
}
private  void calculateOutputm114(String input) {
    if((((((50 == a235[3]) && (((a201 == 7) && (a24 == 6)) && (a316.equals("e")))) && (89 == a377[1])) && (22 == a237[0])) && ((((156 < a280) && (284 >= a280)) && (a146 == a3[3] && (cf && input.equals(inputs[3])))) && a353 == a343[1]))) {
    	cf = false;
    	a146 = a3[((a360 / a373) - 2)];
    	a349 = ((((a349 * a400) - 997) + -2112) * 1);
    	a101 = "f";
    	a391 = a392[((a263 - a201) + -2)];
    	a365 = "e";
    	a291 = a307[(a201 - 7)];
    	a56 = (((((a280 * a244) % 14999) / 5) / 5) + 23719);
    	a209 = "e";
    	a381 = a218[((a337 - a215) - -4)];
    	a353 = a343[(a373 - 2)]; 
    	output = "Z";
    } 
    if((((22 == a237[0]) && a391 == a392[1]) && (a291 == a307[1] && (a146 == a3[3] && (((a263 == 9) && (((((a24 == 6) && cf) && input.equals(inputs[5])) && a261 == a229[1]) && ((-103 < a400) && (-75 >= a400)))) && (a316.equals("e"))))))) {
    	cf = false;
    	a127 = a29[a24];
    	a390 = (((((a390 * a349) % 14999) - -12572) * -1) - 797);
    	a56 = ((((((a295 * a280) % 14999) % 82) - -128) - -20563) + -20563);
    	a146 = a3[((a24 + a24) - 11)];
    	a201 = (a360 + -3);
    	a278 = "g";
    	a340 = a245[((a360 - a373) + -5)];
    	a381 = a218[(a215 - 11)]; 
    	output = "S";
    } 
}
private  void calculateOutputm116(String input) {
    if(((a391 == a392[1] && ((89 == a377[1]) && (((a24 == 6) && (a310.equals("f"))) && input.equals(inputs[9])))) && ((90 == a246[4]) && (((((a316.equals("g")) && cf) && a146 == a3[3]) && a312 == a382[1]) && (95 == a399[3]))))) {
    	cf = false;
    	a400 = ((((((((a244 * a349) % 14999) % 53) + -44) * 5) + -20346) % 53) + 13);
    	a278 = "g";
    	a399 = a269;
    	a333 = "e";
    	a360 = (a215 - 1);
    	a349 = (((((((a349 * a244) % 14999) + -3927) % 109) + 132) / 5) + 145);
    	a136 = (a215 - 3);
    	a337 = (a360 + -2);
    	a201 = a136;
    	a235 = a374;
    	a283 = "g";
    	a391 = a392[(a215 - 9)];
    	a291 = a307[((a337 - a136) + 2)];
    	a167 = (a24 - 4);
    	a310 = "g";
    	a285 = "g";
    	a295 = ((((((a244 * a244) % 14999) % 95) + 52) + -3676) - -3721);
    	a209 = "f";
    	a212 = (a201 - -3);
    	a146 = a3[(a24 - 4)];
    	a340 = a245[(a215 + -9)];
    	a280 = ((((((((a280 * a295) % 14999) % 39) + 293) * 5) - 27040) % 39) - -349);
    	a279 = (((((((a279 * a390) % 14999) % 55) - -270) - 3) - -8092) - 8109);
    	a263 = (a215 - 3);
    	a390 = ((((((a390 * a400) + -1226) % 37) + 288) + -17722) - -17722);
    	a312 = a382[(a24 - 4)];
    	a246 = a332;
    	a377 = a281;
    	a266 = a236;
    	a381 = a218[(a215 + -9)];
    	a365 = "g";
    	a215 = (a373 + 8); 
    	output = "U";
    } 
    if((((a333.equals("f")) && (((a278.equals("f")) && ((((a24 == 6) && cf) && (a316.equals("g"))) && input.equals(inputs[0]))) && a146 == a3[3])) && (((((-103 < a400) && (-75 >= a400)) && (a365.equals("f"))) && (a285.equals("f"))) && (a283.equals("f"))))) {
    	cf = false;
    	a215 = a212;
    	a400 = ((((a400 * a390) * 1) * 1) * 1);
    	a201 = ((a215 * a212) + -94);
    	a291 = a307[(a201 + -6)];
    	a278 = "e";
    	a17 = "i";
    	a390 = (((((a390 * a349) % 14999) + -17654) + -11729) * 1);
    	a235 = a240;
    	a285 = "e";
    	a146 = a3[(a24 / a360)];
    	a266 = a221;
    	a377 = a204;
    	a302 = "h";
    	a360 = (a337 - -1); 
    	output = "W";
    } 
}
private  void calculateOutputm117(String input) {
    if((((a312 == a382[1] && ((a261 == a229[1] && ((a316.equals("h")) && (input.equals(inputs[5]) && cf))) && (89 == a377[1]))) && (95 == a399[3])) && (((a146 == a3[3] && (a215 == 11)) && (a24 == 6)) && ((23 < a349) && (243 >= a349))))) {
    	cf = false;
    	a283 = "f";
    	a146 = a3[((a24 * a24) + -31)];
    	a320 = a372;
    	a360 = (a215 + -2);
    	a291 = a307[((a337 + a337) - 13)];
    	a381 = a218[(a215 - 10)];
    	a295 = ((((((a280 * a390) % 14999) + -29464) - -42790) % 62) - 77);
    	a278 = "f";
    	a373 = ((a212 * a360) - 87);
    	a109 = a201;
    	a244 = ((((((a349 * a295) / 5) % 23) + 118) / 5) - -109);
    	a266 = a236;
    	a132 = a13; 
    	output = "S";
    } 
    if(((((a285.equals("f")) && ((a24 == 6) && ((a316.equals("h")) && cf))) && (a212 == 10)) && ((((input.equals(inputs[1]) && (((105 < a279) && (221 >= a279)) && (20 == a266[1]))) && a146 == a3[3]) && ((156 < a280) && (284 >= a280))) && (a263 == 9)))) {
    	cf = false;
    	a280 = (((((a280 * a279) % 14999) / 5) / 5) - 6428);
    	a263 = ((a373 - a215) - -17);
    	a189 = "g";
    	a353 = a343[(a263 - 8)];
    	a17 = "h";
    	a285 = "e";
    	a365 = "e";
    	a266 = a221;
    	a312 = a382[(a215 - 11)];
    	a201 = (a373 + 4);
    	a235 = a240;
    	a349 = (((((a244 * a244) % 14999) - -8500) + -23490) * 1);
    	a377 = a204;
    	a399 = a344;
    	a209 = "e";
    	a337 = a24;
    	a400 = ((((((a295 * a349) % 14999) % 14948) - 15050) + -3) + 0);
    	a390 = (((((a390 * a400) % 14999) - 14782) - 65) / 5);
    	a333 = "e";
    	a146 = a3[((a212 / a24) - 1)];
    	a261 = a229[((a215 + a360) - 19)];
    	a212 = (a24 + 3);
    	a215 = (a360 - -2); 
    	output = "W";
    } 
}
private  void calculateOutputm118(String input) {
    if(((((a24 == 6) && ((a333.equals("f")) && ((a285.equals("f")) && ((cf && a146 == a3[3]) && (a316.equals("i")))))) && (a283.equals("f"))) && ((((63 == a320[2]) && ((156 < a280) && (284 >= a280))) && input.equals(inputs[0])) && ((-103 < a400) && (-75 >= a400))))) {
    	cf = false;
    	a399 = a269;
    	a400 = (((((((a349 * a295) % 14999) + 1174) / 5) + -28975) % 53) + -5);
    	a146 = a3[(a212 + -4)];
    	a353 = a343[(a212 - 8)];
    	a246 = a332;
    	a373 = (a201 - 3);
    	a283 = "g";
    	a76 = a70;
    	a279 = ((((((a279 * a349) % 14999) / 5) % 55) - -275) + -39);
    	a235 = a374;
    	a390 = (((((a390 * a400) - 5289) * 1) % 37) + 288);
    	a193 = (((79 - 12330) - 16386) + 39816);
    	a212 = (a373 - -7); 
    	output = "Z";
    } 
    if((((a285.equals("f")) && ((((63 == a320[2]) && (a373 == 3)) && (a316.equals("i"))) && a146 == a3[3])) && (((((input.equals(inputs[4]) && cf) && (a24 == 6)) && (a360 == 9)) && (a212 == 10)) && (a201 == 7)))) {
    	cf = false;
    	 
    	output = "S";
    } 
}
private  void calculateOutputm18(String input) {
    if((((a215 == 11) && (((a360 == 9) && (a381 == a218[1] && (95 == a399[3]))) && (a373 == 3))) && (((a316.equals("e")) && cf) && (a209.equals("f"))))) {
    	calculateOutputm114(input);
    } 
    if(((((a316.equals("g")) && cf) && (95 == a399[3])) && (((75 < a390) && (251 >= a390)) && ((a201 == 7) && ((((156 < a280) && (284 >= a280)) && a291 == a307[1]) && (20 == a266[1])))))) {
    	calculateOutputm116(input);
    } 
    if((((a353 == a343[1] && ((((-103 < a400) && (-75 >= a400)) && (cf && (a316.equals("h")))) && (a333.equals("f")))) && (a337 == 7)) && ((90 == a246[4]) && ((75 < a390) && (251 >= a390))))) {
    	calculateOutputm117(input);
    } 
    if((((((cf && (a316.equals("i"))) && ((75 < a390) && (251 >= a390))) && a381 == a218[1]) && a353 == a343[1]) && ((a201 == 7) && ((a333.equals("f")) && (95 == a399[3]))))) {
    	calculateOutputm118(input);
    } 
}
private  void calculateOutputm119(String input) {
    if((((a283.equals("f")) && (((-110 < a295) && (16 >= a295)) && input.equals(inputs[2]))) && ((((90 == a246[4]) && ((a261 == a229[1] && ((a146 == a3[3] && cf) && (a24 == 7))) && a312 == a382[1])) && a291 == a307[1]) && a162 <=  -73))) {
    	cf = false;
    	a291 = a307[((a24 * a215) + -75)];
    	a390 = ((((((a390 * a295) / 5) * 5) - -16305) % 37) - -288);
    	a266 = a236;
    	a399 = a269;
    	a360 = ((a337 + a263) + -6);
    	a146 = a3[((a215 - a263) - -4)];
    	a391 = a392[((a337 + a215) - 16)];
    	a353 = a343[(a373 - 1)];
    	a76 = a98;
    	a201 = (a215 - 3);
    	a261 = a229[(a373 + -1)];
    	a338 = (a212 - 5);
    	a235 = a374;
    	a373 = (a212 - 6);
    	a215 = ((a201 - a201) + 12); 
    	output = "Z";
    } 
    if((((a312 == a382[1] && (a201 == 7)) && (((90 == a246[4]) && ((((a24 == 7) && ((a162 <=  -73 && (input.equals(inputs[5]) && cf)) && (20 == a266[1]))) && (a215 == 11)) && a146 == a3[3])) && a291 == a307[1])) && a71 <= -25)) {
    	cf = false;
    	a50 = a0[(a263 + -4)];
    	a24 = ((a215 + a373) - 6); 
    	output = "S";
    } 
    if(((a291 == a307[1] && ((a365.equals("f")) && (a162 <=  -73 && (((-110 < a295) && (16 >= a295)) && ((89 == a377[1]) && a146 == a3[3]))))) && (((a285.equals("f")) && (input.equals(inputs[3]) && ((a24 == 7) && cf))) && (22 == a237[0])))) {
    	cf = false;
    	a101 = "f";
    	a349 = ((((((a349 * a280) % 14999) + -342) + -16723) * 10) / 9);
    	a209 = "e";
    	a146 = a3[(a337 + -6)];
    	a278 = "e";
    	a381 = a218[((a337 * a373) + -21)];
    	a291 = a307[(a215 - a215)];
    	a340 = a245[(a373 - 3)];
    	a365 = "e";
    	a56 = (((((a162 * a162) % 14999) / 5) - -8882) + -2150);
    	a353 = a343[(a337 - 6)];
    	a391 = a392[(a212 - 10)]; 
    	output = "W";
    } 
    if((((((((23 < a349) && (243 >= a349)) && (input.equals(inputs[1]) && ((a24 == 7) && cf))) && a312 == a382[1]) && a146 == a3[3]) && a391 == a392[1]) && ((((a360 == 9) && (95 == a399[3])) && a162 <=  -73) && ((156 < a280) && (284 >= a280))))) {
    	cf = false;
    	a278 = "f";
    	a128 = ((a24 / a24) + 3);
    	a280 = (((((((a280 * a390) % 14999) % 39) + 305) + -3) - 28357) + 28377);
    	a209 = "f";
    	a116 = "f";
    	a381 = a218[((a215 / a263) + 1)];
    	a365 = "g";
    	a235 = a374;
    	a146 = a3[(a337 - 3)]; 
    	output = "V";
    } 
}
private  void calculateOutputm121(String input) {
    if(((((a310.equals("f")) && (((((75 < a390) && (251 >= a390)) && ((cf && a146 == a3[3]) && input.equals(inputs[7]))) && (a285.equals("f"))) && (a333.equals("f")))) && (a24 == 7)) && ((((42 < a162) && (146 >= a162)) && (22 == a237[0])) && a353 == a343[1]))) {
    	cf = false;
    	a128 = (a24 - 3);
    	a278 = "f";
    	a146 = a3[(a337 - 3)];
    	a235 = a374;
    	a320 = a372;
    	a365 = "g";
    	a116 = "f";
    	a381 = a218[(a128 - 2)];
    	a246 = a358;
    	a280 = ((((((((a390 * a244) % 14999) % 39) + 322) * 9) / 10) * 10) / 9); 
    	output = "T";
    } 
    if(((a353 == a343[1] && (a146 == a3[3] && ((((((75 < a390) && (251 >= a390)) && (a333.equals("f"))) && a312 == a382[1]) && ((42 < a162) && (146 >= a162))) && (a310.equals("f"))))) && (a291 == a307[1] && ((cf && (a24 == 7)) && input.equals(inputs[2]))))) {
    	cf = false;
    	a263 = (a212 - 2);
    	a312 = a382[(a263 + -8)];
    	a373 = ((a215 / a263) - -1);
    	a15 = (a201 + 5);
    	a377 = a204;
    	a295 = ((((a162 * a162) - 19203) - 6583) - -33);
    	a283 = "e";
    	a340 = a245[(a201 + -7)];
    	a365 = "g";
    	a117 = a178[(a15 + -11)];
    	a390 = ((((((a390 * a244) % 14999) / 5) % 37) + 259) * 1);
    	a146 = a3[(a360 + -2)];
    	a291 = a307[(a15 + -10)];
    	a310 = "e";
    	a201 = (a24 + -1);
    	a360 = (a15 - 4);
    	a261 = a229[(a373 + -2)];
    	a337 = (a24 + -1);
    	a391 = a392[(a24 + -7)];
    	a266 = a236;
    	a285 = "e";
    	a333 = "e";
    	a235 = a240;
    	a280 = ((((((a295 * a295) % 14999) - -11948) + 2606) - 14102) - 18461);
    	a353 = a343[(a215 - 11)];
    	a237 = a336;
    	a212 = ((a215 + a215) + -13);
    	a215 = ((a263 - a263) + 12); 
    	output = "Z";
    } 
    if((((a365.equals("f")) && ((a283.equals("f")) && ((a24 == 7) && (input.equals(inputs[5]) && ((cf && ((42 < a162) && (146 >= a162))) && a146 == a3[3]))))) && ((a209.equals("f")) && (((a201 == 7) && (a373 == 3)) && ((-103 < a400) && (-75 >= a400)))))) {
    	cf = false;
    	if((!(a64 == a67[4]) && ((a103 == 10) || !(a190.equals("e"))))) {
    	a24 = (a337 + 1);
    	a209 = "f";
    	a237 = a336;
    	a391 = a392[(a373 - 3)];
    	a381 = a218[(a360 - 9)];
    	a320 = a372;
    	a50 = a0[(a263 + -2)];
    	a340 = a245[(a212 + -10)];
    	a246 = a296;
    	a285 = "e";
    	a283 = "e";
    	a312 = a382[(a215 + -11)];
    	a215 = (a212 + 2); 
    	}else {
    	a30 = (a263 - -2);
    	a320 = a372;
    	a381 = a218[(a212 - 9)];
    	a278 = "f";
    	a24 = (a215 + -2);
    	a246 = a358;
    	a340 = a245[(a263 - 9)];
    	}output = "U";
    } 
    if(((((input.equals(inputs[6]) && (((75 < a390) && (251 >= a390)) && (a24 == 7))) && (a209.equals("f"))) && ((105 < a279) && (221 >= a279))) && (((94 < a244) && (141 >= a244)) && (a353 == a343[1] && ((((42 < a162) && (146 >= a162)) && (cf && a146 == a3[3])) && (a215 == 11)))))) {
    	cf = false;
    	a391 = a392[(a215 + -11)];
    	a310 = "e";
    	a312 = a382[((a337 / a24) - 1)];
    	a19 = ((((a162 * a162) + 1381) + 5317) * 1);
    	a15 = (a212 + 3);
    	a333 = "e";
    	a212 = (a373 - -6);
    	a146 = a3[((a360 / a360) - -6)];
    	a285 = "e";
    	a237 = a336;
    	a279 = (((((a279 * a244) % 14999) - 19466) * 1) / 5);
    	a390 = (((((a390 * a349) % 14999) + -15965) / 5) - 12205);
    	a201 = (a212 + -3);
    	a235 = a240;
    	a340 = a245[((a212 + a212) - 18)];
    	a349 = (((((a349 * a244) % 14999) / 5) - 5193) + -6362);
    	a360 = ((a24 * a263) - 55); 
    	output = "X";
    } 
}
private  void calculateOutputm122(String input) {
    if(((((a146 == a3[3] && ((-110 < a295) && (16 >= a295))) && ((75 < a390) && (251 >= a390))) && (a283.equals("f"))) && ((a278.equals("f")) && (((((94 < a244) && (141 >= a244)) && (((a24 == 7) && cf) && 146 < a162)) && a261 == a229[1]) && input.equals(inputs[9]))))) {
    	cf = false;
    	a390 = (((((a390 * a162) % 14999) - 13469) - 14638) - 560);
    	a373 = (a24 - 5);
    	a209 = "e";
    	a235 = a240;
    	a400 = ((((((a390 * a280) % 14999) % 14948) + -15050) - 1) - 1);
    	a320 = a217;
    	a261 = a229[(a373 - 2)];
    	a283 = "e";
    	a349 = (((((a349 * a400) % 14999) - -3195) * 2) + -6380);
    	a291 = a307[(a212 + -9)];
    	a146 = a3[(a337 + -7)];
    	a312 = a382[(a337 - 7)];
    	a215 = (a337 - -3);
    	a333 = "e";
    	a201 = (a337 - 1);
    	a189 = "g";
    	a399 = a344;
    	a295 = ((((a295 * a244) / 5) - 21505) * 1);
    	a17 = "h";
    	a365 = "e";
    	a263 = (a337 - -1);
    	a244 = (((((a279 * a279) % 14999) + 14289) - -594) * -1);
    	a278 = "e";
    	a360 = ((a201 / a215) - -8);
    	a285 = "e";
    	a337 = (a263 - 2); 
    	output = "Z";
    } 
    if(((((94 < a244) && (141 >= a244)) && (a146 == a3[3] && (a391 == a392[1] && (input.equals(inputs[6]) && ((-110 < a295) && (16 >= a295)))))) && ((a263 == 9) && ((((a24 == 7) && (146 < a162 && cf)) && (95 == a399[3])) && (a283.equals("f")))))) {
    	cf = false;
    	a109 = (a360 + -2);
    	a146 = a3[(a263 + -4)];
    	a132 = a80; 
    	output = "Z";
    } 
}
private  void calculateOutputm19(String input) {
    if(((a353 == a343[1] && ((a162 <=  -73 && cf) && ((-110 < a295) && (16 >= a295)))) && (((-103 < a400) && (-75 >= a400)) && (((a360 == 9) && (89 == a377[1])) && a381 == a218[1])))) {
    	calculateOutputm119(input);
    } 
    if((((a360 == 9) && (((a201 == 7) && (a310.equals("f"))) && ((94 < a244) && (141 >= a244)))) && (((a365.equals("f")) && (((42 < a162) && (146 >= a162)) && cf)) && a340 == a245[1]))) {
    	calculateOutputm121(input);
    } 
    if(((a291 == a307[1] && (a391 == a392[1] && (63 == a320[2]))) && ((((a209.equals("f")) && (146 < a162 && cf)) && (50 == a235[3])) && ((-110 < a295) && (16 >= a295))))) {
    	calculateOutputm122(input);
    } 
}
private  void calculateOutputm123(String input) {
    if(((((((a50 == a0[0] && cf) && (a24 == 8)) && (a310.equals("f"))) && a353 == a343[1]) && ((105 < a279) && (221 >= a279))) && ((((94 < a244) && (141 >= a244)) && (input.equals(inputs[1]) && ((89 == a377[1]) && ((23 < a349) && (243 >= a349))))) && a146 == a3[3]))) {
    	cf = false;
    	a263 = ((a337 / a201) + 10);
    	a136 = ((a24 * a212) - 74);
    	a279 = ((((((a279 * a244) % 14999) - 15047) * 1) % 55) + 318);
    	a244 = ((((((a244 * a349) % 14999) / 5) / 5) % 23) + 99);
    	a337 = ((a201 - a373) + 3);
    	a353 = a343[(a215 - a263)];
    	a310 = "g";
    	a266 = a236;
    	a349 = (((((((a349 * a390) % 14999) / 5) % 72) + 257) - -26920) + -26903);
    	a146 = a3[((a360 / a373) - 1)];
    	a365 = "g";
    	a400 = (((((a400 * a295) % 53) - 16) + 35) / 5);
    	a180 = (((42 + 105) * 5) + -473);
    	a377 = a281;
    	a280 = (((((((a279 * a279) % 14999) / 5) + 1183) * 5) % 63) + 182);
    	a283 = "f";
    	a291 = a307[((a201 / a360) + 1)];
    	a333 = "g";
    	a212 = (a136 - -5);
    	a237 = a336;
    	a360 = (a373 - -7);
    	a391 = a392[(a263 + -8)];
    	a373 = ((a201 / a136) - -3); 
    	output = "W";
    } 
}
private  void calculateOutputm124(String input) {
    if(((((a209.equals("f")) && a340 == a245[1]) && (a201 == 7)) && (((a146 == a3[3] && ((((a24 == 8) && (input.equals(inputs[4]) && cf)) && ((94 < a244) && (141 >= a244))) && a50 == a0[2])) && (63 == a320[2])) && (90 == a246[4])))) {
    	a59 -= (a59 - 20) < a59 ? 4 : 0;
    	cf = false;
    	if(((((!(a177 == 2) && cf) && (a365.equals("i"))) || 256 < a244) && !(a249 == 8))) {
    	a246 = a358;
    	a280 = (((((a390 * a390) % 14999) + 5886) * 1) * -1);
    	a244 = ((((((a244 * a280) % 14999) * 2) % 15047) - 14952) * 1);
    	a209 = "e";
    	a295 = (((((a295 * a400) - 21870) * 10) / 9) * 1);
    	a337 = ((a201 * a24) + -50);
    	a340 = a245[(a212 + -10)];
    	a399 = a344;
    	a235 = a374;
    	a400 = (((((a400 * a279) * 1) % 13) + -83) * 1);
    	a291 = a307[(a24 + -8)];
    	a333 = "e";
    	a365 = "g";
    	a373 = (a24 + -6);
    	a360 = (a215 - 3);
    	a278 = "f";
    	a146 = a3[(a212 + -10)];
    	a17 = "h";
    	a279 = ((((((a279 * a349) % 14999) + -16590) - 5286) * 10) / 9);
    	a349 = ((((((a349 * a295) % 14999) % 109) + 133) - 1) - 0);
    	a189 = "h";
    	a215 = ((a212 - a212) - -10);
    	a377 = a204;
    	a263 = ((a212 + a201) - 9);
    	a201 = (a212 - 4);
    	a390 = ((((((a390 * a280) % 14999) - 14972) - 12) - -14812) + -14798);
    	a266 = a221;
    	a212 = 9; 
    	}else {
    	a390 = (((((((a244 * a349) % 14999) / 5) % 37) + 257) * 10) / 9);
    	a338 = (a337 - -1);
    	a373 = (a24 + -4);
    	a146 = a3[((a212 - a360) + 5)];
    	a295 = (((((((a295 * a280) % 14999) / 5) % 95) + 111) / 5) - -115);
    	a266 = a236;
    	a333 = "g";
    	a215 = (a337 - -5);
    	a280 = ((((((a400 * a349) % 39) + 337) * 5) % 39) - -300);
    	a285 = "f";
    	a201 = (a337 - -1);
    	a391 = a392[((a337 / a337) - -1)];
    	a399 = a269;
    	a261 = a229[(a337 - 5)];
    	a310 = "g";
    	a212 = (a337 - -4);
    	a263 = ((a215 - a201) - -6);
    	a381 = a218[((a337 - a337) + 2)];
    	a279 = (((((((a279 * a390) % 14999) % 55) + 246) + 11165) + -6304) - 4883);
    	a209 = "g";
    	a353 = a343[((a337 + a337) - 12)];
    	a76 = a98;
    	a312 = a382[(a337 - 5)];
    	a365 = "g";
    	a237 = a328;
    	a291 = a307[((a373 + a338) + -10)];
    	a400 = (((((a400 * a244) % 53) + 30) - -3625) - 3657);
    	a283 = "g";
    	a235 = a374;
    	a337 = ((a338 + a338) + -8);
    	}output = "X";
    } 
    if((((a337 == 7) && ((a333.equals("f")) && (a215 == 11))) && (((-110 < a295) && (16 >= a295)) && ((((a146 == a3[3] && (a50 == a0[2] && (cf && (a24 == 8)))) && input.equals(inputs[0])) && (a209.equals("f"))) && ((23 < a349) && (243 >= a349)))))) {
    	cf = false;
    	a27 = (((((a280 * a390) % 14999) - 28442) + -387) * 1);
    	a24 = (a337 + 3); 
    	output = "Z";
    } 
}
private  void calculateOutputm125(String input) {
    if((((a215 == 11) && ((((a365.equals("f")) && (a50 == a0[4] && (cf && a146 == a3[3]))) && (a24 == 8)) && (a285.equals("f")))) && (a291 == a307[1] && ((input.equals(inputs[2]) && (a333.equals("f"))) && ((-103 < a400) && (-75 >= a400)))))) {
    	cf = false;
    	a295 = ((((((a349 * a244) % 14999) - -10279) - -2504) % 95) + 44);
    	a353 = a343[(a24 + -6)];
    	a212 = (a24 + 3);
    	a390 = (((((((a295 * a349) % 14999) - -10062) % 37) - -286) * 9) / 10);
    	a76 = a98;
    	a312 = a382[((a24 * a24) - 62)];
    	a146 = a3[(a24 - 2)];
    	a266 = a236;
    	a261 = a229[(a24 + -6)];
    	a235 = a374;
    	a337 = ((a215 - a24) + 5);
    	a279 = ((((((a279 * a390) % 14999) / 5) % 55) - -229) - 4);
    	a278 = "g";
    	a237 = a328;
    	a381 = a218[(a212 + -9)];
    	a333 = "g";
    	a280 = (((((a280 * a400) % 39) + 324) * 1) + -1);
    	a365 = "g";
    	a209 = "g";
    	a399 = a269;
    	a283 = "g";
    	a215 = (a212 + 1);
    	a400 = (((((a400 * a349) % 53) + 20) - -28850) + -28858);
    	a338 = a24;
    	a391 = a392[((a212 * a360) + -97)];
    	a263 = (a212 - 1);
    	a310 = "g";
    	a373 = (a360 - 5);
    	a201 = ((a24 / a360) + 8);
    	a291 = a307[(a24 - 6)]; 
    	output = "W";
    } 
    if((((a201 == 7) && ((89 == a377[1]) && ((a50 == a0[4] && ((22 == a237[0]) && ((23 < a349) && (243 >= a349)))) && input.equals(inputs[7])))) && ((((-103 < a400) && (-75 >= a400)) && ((a24 == 8) && (cf && a146 == a3[3]))) && (a365.equals("f"))))) {
    	cf = false;
    	a360 = ((a263 - a373) - -2);
    	a278 = "e";
    	a24 = (a263 - 3);
    	a291 = a307[(a24 - 6)];
    	a316 = "h";
    	a373 = (a263 - 7);
    	a244 = (((((a244 * a279) % 14999) - -5495) * -1) * 1);
    	a381 = a218[(a212 - 10)];
    	a320 = a217;
    	a390 = ((((((a349 * a400) * 1) - 624) + 13494) % 87) - -163); 
    	output = "Z";
    } 
    if(((((20 == a266[1]) && ((a201 == 7) && ((156 < a280) && (284 >= a280)))) && (50 == a235[3])) && ((90 == a246[4]) && (((a310.equals("f")) && (((cf && input.equals(inputs[3])) && a50 == a0[4]) && (a24 == 8))) && a146 == a3[3])))) {
    	cf = false;
    	a381 = a218[(a215 + -11)];
    	a17 = "e";
    	a360 = ((a263 - a215) - -10);
    	a146 = a3[(a337 - 7)];
    	a266 = a221;
    	a244 = ((((((a244 * a280) % 14999) + -27862) * 1) - -32899) * -1);
    	a373 = (a212 + -8);
    	a201 = (a215 + -5);
    	a212 = ((a24 / a360) - -8);
    	a377 = a204;
    	a400 = ((((a400 * a279) + -5331) + -1376) - 280);
    	a291 = a307[(a360 - 8)];
    	a235 = a240;
    	a33 = a84;
    	a215 = (a24 + 2); 
    	output = "U";
    } 
    if(((((23 < a349) && (243 >= a349)) && (a50 == a0[4] && (a209.equals("f")))) && ((a212 == 10) && ((63 == a320[2]) && (((a337 == 7) && (((a24 == 8) && (cf && a146 == a3[3])) && input.equals(inputs[4]))) && ((94 < a244) && (141 >= a244))))))) {
    	cf = false;
    	a320 = a217;
    	a24 = ((a337 * a263) + -57);
    	a316 = "h";
    	a381 = a218[((a360 + a373) - 12)];
    	a278 = "e";
    	a244 = (((((a244 * a279) % 14999) - 29338) + -139) + -97);
    	a373 = (a201 + -5);
    	a360 = (a212 - 2);
    	a291 = a307[((a215 + a212) - 21)];
    	a390 = (((((((a349 * a280) % 14999) - -2000) * 1) - 20501) % 87) - -193); 
    	output = "S";
    } 
}
private  void calculateOutputm127(String input) {
    if((((95 == a399[3]) && (((a310.equals("f")) && ((cf && input.equals(inputs[6])) && a50 == a0[7])) && ((75 < a390) && (251 >= a390)))) && (((156 < a280) && (284 >= a280)) && ((a146 == a3[3] && ((a24 == 8) && (89 == a377[1]))) && (a333.equals("f")))))) {
    	cf = false;
    	a349 = ((((((a279 * a280) % 14999) + -20555) + -3622) * 10) / 9);
    	a19 = ((((a244 * a295) + 21271) + 142) + 2972);
    	a235 = a240;
    	a15 = (a24 - -5);
    	a279 = (((((((a279 * a349) % 14999) * 2) + -1) - 0) % 15052) + -14946);
    	a146 = a3[((a337 * a24) - 49)];
    	a320 = a217;
    	a212 = ((a360 + a360) + -9);
    	a310 = "e";
    	a390 = (((((a390 * a349) % 14999) - -1225) + -16201) + -23);
    	a333 = "e";
    	a360 = ((a201 * a263) - 55);
    	a201 = (a373 + 3); 
    	output = "X";
    } 
    if((((((-103 < a400) && (-75 >= a400)) && ((75 < a390) && (251 >= a390))) && ((23 < a349) && (243 >= a349))) && (((-110 < a295) && (16 >= a295)) && (a50 == a0[7] && ((a291 == a307[1] && ((input.equals(inputs[7]) && (a146 == a3[3] && cf)) && (a24 == 8))) && (a373 == 3)))))) {
    	cf = false;
    	a116 = "f";
    	a215 = (a24 + 3);
    	a278 = "f";
    	a285 = "f";
    	a391 = a392[(a215 - 10)];
    	a128 = (a360 - 5);
    	a237 = a265;
    	a146 = a3[((a212 * a337) + -66)];
    	a246 = a358;
    	a280 = ((((((a280 * a349) % 14999) - -10736) + -20573) % 39) + 324);
    	a340 = a245[(a128 - 3)];
    	a312 = a382[((a201 / a373) + -1)];
    	a283 = "f";
    	a365 = "g";
    	a235 = a374;
    	a381 = a218[(a360 + -7)]; 
    	output = "T";
    } 
    if((((20 == a266[1]) && ((((cf && input.equals(inputs[5])) && (a24 == 8)) && ((75 < a390) && (251 >= a390))) && a146 == a3[3])) && (((a50 == a0[7] && ((a360 == 9) && (95 == a399[3]))) && a353 == a343[1]) && (a373 == 3)))) {
    	cf = false;
    	a333 = "e";
    	a244 = (((((a400 * a400) / 5) + 8374) - -6902) + -19633);
    	a390 = ((((((a390 * a280) % 14999) - 11916) / 5) + 15012) + -38639);
    	a349 = ((((((a280 * a244) % 14999) - 14993) - -15512) / 5) - 22678);
    	a399 = a344;
    	a15 = ((a337 + a337) - 7);
    	a295 = ((((a295 * a279) - 5870) + -17) * 1);
    	a338 = (a24 + 1);
    	a261 = a229[(a337 + -7)];
    	a353 = a343[((a360 / a337) - 1)];
    	a377 = a204;
    	a146 = a3[((a201 * a212) - 63)];
    	a291 = a307[((a373 + a15) + -10)];
    	a235 = a240;
    	a279 = ((((((a280 * a349) % 14999) + -14987) - -18438) / 5) - 25105);
    	a373 = (a15 + -5);
    	a263 = (a337 + 1);
    	a209 = "e";
    	a212 = ((a337 - a15) + 9);
    	a310 = "e";
    	a320 = a217;
    	a360 = (a15 + 1);
    	a201 = (a337 - 1);
    	a337 = (a263 - 2); 
    	output = "U";
    } 
    if((((63 == a320[2]) && (20 == a266[1])) && ((a310.equals("f")) && (((((-110 < a295) && (16 >= a295)) && (input.equals(inputs[2]) && (a146 == a3[3] && (a50 == a0[7] && ((a24 == 8) && cf))))) && a353 == a343[1]) && (a263 == 9))))) {
    	cf = false;
    	a261 = a229[(a337 - 7)];
    	a212 = ((a24 / a373) + 7);
    	a235 = a240;
    	a15 = (a360 - -3);
    	a353 = a343[(a24 / a263)];
    	a333 = "e";
    	a201 = (a373 + 3);
    	a377 = a204;
    	a117 = a178[(a360 + -8)];
    	a291 = a307[(a201 - 4)];
    	a295 = ((((a295 * a244) * 1) / 5) + -10920);
    	a310 = "e";
    	a146 = a3[((a337 * a373) + -14)];
    	a266 = a236;
    	a263 = (a373 + 5);
    	a280 = ((((((a280 * a390) % 14999) + -20120) * 10) / 9) / 5);
    	a360 = ((a373 * a201) + -10);
    	a365 = "g";
    	a337 = ((a373 + a212) + -6);
    	a390 = ((((((a390 * a279) % 14999) % 37) - -266) - -9) - -8);
    	a373 = (a201 + -4); 
    	output = "Z";
    } 
}
private  void calculateOutputm20(String input) {
    if(((cf && a50 == a0[0]) && (((-103 < a400) && (-75 >= a400)) && ((a333.equals("f")) && ((((a373 == 3) && a353 == a343[1]) && a391 == a392[1]) && (a212 == 10)))))) {
    	calculateOutputm123(input);
    } 
    if((((90 == a246[4]) && ((95 == a399[3]) && (a310.equals("f")))) && (((-110 < a295) && (16 >= a295)) && (((cf && a50 == a0[2]) && (a360 == 9)) && (89 == a377[1]))))) {
    	calculateOutputm124(input);
    } 
    if(((((a50 == a0[4] && cf) && (a278.equals("f"))) && a391 == a392[1]) && ((a263 == 9) && (((22 == a237[0]) && (a201 == 7)) && a381 == a218[1])))) {
    	calculateOutputm125(input);
    } 
    if((((a212 == 10) && (((-110 < a295) && (16 >= a295)) && ((a337 == 7) && a261 == a229[1]))) && (a353 == a343[1] && ((50 == a235[3]) && (cf && a50 == a0[7]))))) {
    	calculateOutputm127(input);
    } 
}
private  void calculateOutputm128(String input) {
    if(((((63 == a320[2]) && (((a360 == 9) && ((a146 == a3[3] && cf) && input.equals(inputs[0]))) && (a30 == 9))) && (a263 == 9)) && (((a201 == 7) && (a340 == a245[1] && (a24 == 9))) && a391 == a392[1]))) {
    	cf = false;
    	a113 = "e";
    	a109 = (a360 + -7);
    	a146 = a3[(a109 - -3)]; 
    	output = "W";
    } 
    if((((a24 == 9) && ((a337 == 7) && ((-103 < a400) && (-75 >= a400)))) && ((20 == a266[1]) && (((((a263 == 9) && (input.equals(inputs[6]) && ((a30 == 9) && cf))) && a146 == a3[3]) && a381 == a218[1]) && (a212 == 10))))) {
    	cf = false;
    	if(((a360 == 15) && a261 == a229[3])) {
    	a261 = a229[(a337 - 7)];
    	a320 = a217;
    	a295 = (((((((a295 * a390) % 14999) % 14945) - 15054) + 6209) * 1) - 6209);
    	a201 = (a30 - 3);
    	a283 = "e";
    	a266 = a221;
    	a146 = a3[(a212 + -3)];
    	a263 = ((a373 - a30) - -15);
    	a285 = "e";
    	a333 = "e";
    	a117 = a178[(a24 - 9)];
    	a340 = a245[(a337 / a360)];
    	a15 = (a24 - -3);
    	a209 = "e";
    	a212 = a360;
    	a237 = a336;
    	a360 = (a24 - 1); 
    	}else {
    	a215 = (a30 + 1);
    	a146 = a3[(a360 - 9)];
    	a291 = a307[(a373 - 2)];
    	a235 = a240;
    	a263 = (a215 - 2);
    	a381 = a218[(a337 - 7)];
    	a349 = (((((a280 * a279) % 14999) + -24356) * 1) / 5);
    	a279 = (((((a279 * a400) * 10) / 9) * 1) * 1);
    	a17 = "f";
    	a391 = a392[(a360 + -9)];
    	a201 = (a263 - 2);
    	a212 = a24;
    	a261 = a229[(a373 + -2)];
    	a360 = (a215 - 2);
    	a266 = a221;
    	a295 = ((((((a295 * a349) % 14999) * 2) + 0) % 14945) + -15054);
    	a237 = a336;
    	a333 = "e";
    	a246 = a296;
    	a152 = a197;
    	}output = "X";
    } 
}
private  void calculateOutputm129(String input) {
    if((((a285.equals("f")) && ((a146 == a3[3] && ((a24 == 9) && (((input.equals(inputs[5]) && cf) && (a30 == 11)) && a391 == a392[1]))) && (a360 == 9))) && ((a312 == a382[1] && (a278.equals("f"))) && a381 == a218[1]))) {
    	cf = false;
    	a209 = "f";
    	a237 = a336;
    	a24 = (a373 - -5);
    	a246 = a296;
    	a312 = a382[((a360 - a201) + -2)];
    	a50 = a0[((a373 + a263) + -5)];
    	a381 = a218[(a263 + -9)];
    	a285 = "e";
    	a283 = "e";
    	a278 = "e";
    	a215 = (a30 - -1);
    	a391 = a392[(a263 - 9)]; 
    	output = "U";
    } 
    if((((a283.equals("f")) && ((a24 == 9) && ((input.equals(inputs[6]) && cf) && a146 == a3[3]))) && ((((20 == a266[1]) && (((a30 == 11) && a353 == a343[1]) && a391 == a392[1])) && ((-103 < a400) && (-75 >= a400))) && (90 == a246[4])))) {
    	cf = false;
    	a360 = (a373 - -5);
    	a235 = a240;
    	a15 = (a263 - -4);
    	a146 = a3[((a201 / a337) + 6)];
    	a391 = a392[(a360 - 8)];
    	a320 = a217;
    	a285 = "e";
    	a333 = "e";
    	a312 = a382[(a360 + -8)];
    	a278 = "e";
    	a237 = a336;
    	a201 = (a24 - 3);
    	a279 = (((((a279 * a349) % 14999) - 20580) + 22647) * -1);
    	a349 = (((((a244 * a400) - -33689) / 5) / 5) + -9422);
    	a212 = (a30 + -2);
    	a390 = ((((((a390 * a295) % 15037) + -14961) - -29321) * 1) - 29321);
    	a310 = "e";
    	a19 = (((13 * 5) + 18005) * 1); 
    	output = "X";
    } 
    if((((90 == a246[4]) && ((input.equals(inputs[2]) && ((75 < a390) && (251 >= a390))) && (63 == a320[2]))) && (((a333.equals("f")) && (a312 == a382[1] && (a146 == a3[3] && ((a30 == 11) && (cf && (a24 == 9)))))) && ((94 < a244) && (141 >= a244))))) {
    	cf = false;
    	a295 = (((((a349 * a349) % 14999) - 29235) * 1) * 1);
    	a266 = a236;
    	a390 = ((((((a390 * a349) % 14999) - -12702) % 37) - -276) + -14);
    	a373 = (a360 - 7);
    	a283 = "e";
    	a381 = a218[(a373 + -2)];
    	a117 = a178[(a30 / a360)];
    	a212 = ((a373 * a360) + -9);
    	a237 = a336;
    	a337 = (a360 + -3);
    	a146 = a3[((a263 + a24) + -11)];
    	a291 = a307[(a360 - 7)];
    	a246 = a296;
    	a377 = a204;
    	a278 = "e";
    	a333 = "e";
    	a285 = "e";
    	a201 = (a373 + 4);
    	a310 = "e";
    	a312 = a382[(a373 + -2)];
    	a261 = a229[((a360 * a360) - 81)];
    	a391 = a392[((a360 * a263) - 81)];
    	a15 = (a215 - -1);
    	a353 = a343[((a360 * a360) - 81)];
    	a235 = a240;
    	a280 = (((((a280 * a295) % 14999) - -29012) + 328) - 35823);
    	a365 = "g";
    	a215 = ((a373 - a337) - -16);
    	a263 = (a360 - 1);
    	a360 = 8; 
    	output = "Z";
    } 
    if(((((a30 == 11) && ((a215 == 11) && ((63 == a320[2]) && (a291 == a307[1] && ((a24 == 9) && (a333.equals("f"))))))) && (a337 == 7)) && ((90 == a246[4]) && ((cf && input.equals(inputs[7])) && a146 == a3[3])))) {
    	cf = false;
    	a116 = "f";
    	a146 = a3[((a24 / a30) - -4)];
    	a340 = a245[(a24 - 8)];
    	a235 = a374;
    	a381 = a218[((a373 + a263) - 10)];
    	a365 = "g";
    	a128 = (a201 - 3);
    	a280 = ((((((a280 * a244) % 14999) / 5) % 39) - -291) * 1); 
    	output = "T";
    } 
}
private  void calculateOutputm21(String input) {
    if((((a209.equals("f")) && ((((a30 == 9) && cf) && (a365.equals("f"))) && (a283.equals("f")))) && ((((156 < a280) && (284 >= a280)) && (a285.equals("f"))) && (90 == a246[4])))) {
    	calculateOutputm128(input);
    } 
    if(((((a30 == 11) && cf) && (a310.equals("f"))) && (a312 == a382[1] && (((156 < a280) && (284 >= a280)) && ((((105 < a279) && (221 >= a279)) && (20 == a266[1])) && (a201 == 7)))))) {
    	calculateOutputm129(input);
    } 
}
private  void calculateOutputm136(String input) {
    if((((((156 < a280) && (284 >= a280)) && ((-194 < a1) && (-114 >= a1))) && ((105 < a279) && (221 >= a279))) && (a381 == a218[1] && ((((((a24 == 11) && (a146 == a3[3] && cf)) && input.equals(inputs[5])) && (a212 == 10)) && (63 == a320[2])) && a353 == a343[1])))) {
    	cf = false;
    	a295 = (((((((a400 * a349) % 62) + 3) - 14135) + 14624) * -1) / 10);
    	a283 = "f";
    	a146 = a3[(a215 + -6)];
    	a95 = "i";
    	a109 = (a201 - -1);
    	a278 = "e";
    	a353 = a343[(a263 + -8)];
    	a381 = a218[(a360 - 9)];
    	a244 = (((((((a280 * a280) % 14999) % 23) + 110) + -9086) - -22480) + -13391); 
    	output = "S";
    } 
    if((((63 == a320[2]) && (a146 == a3[3] && (input.equals(inputs[7]) && a340 == a245[1]))) && ((a285.equals("f")) && ((a360 == 9) && (((((a24 == 11) && cf) && ((-194 < a1) && (-114 >= a1))) && a381 == a218[1]) && (a373 == 3)))))) {
    	cf = false;
    	a381 = a218[(a360 + -9)];
    	a278 = "e";
    	a24 = 6;
    	a320 = a217;
    	a291 = a307[((a212 / a212) + -1)];
    	a316 = "h";
    	a360 = ((a263 / a337) + 7);
    	a373 = (a215 + -9); 
    	output = "S";
    } 
    if(((((a360 == 9) && ((a340 == a245[1] && (((-194 < a1) && (-114 >= a1)) && (20 == a266[1]))) && input.equals(inputs[4]))) && (a278.equals("f"))) && (a381 == a218[1] && ((a146 == a3[3] && (cf && (a24 == 11))) && (89 == a377[1]))))) {
    	cf = false;
    	a244 = (((21 - -159) - 27) + 47);
    	a136 = (a337 - -1);
    	a349 = (((((((a1 * a1) % 14999) / 5) - -990) / 5) % 72) + 293);
    	a390 = (((((((a244 * a349) % 14999) - -3819) % 37) - -278) + 29211) - 29214);
    	a167 = (a212 - 2);
    	a400 = ((((((a400 * a390) % 14999) % 53) + -20) + -2) - -2);
    	a312 = a382[(a136 - 8)];
    	a381 = a218[(a136 + -6)];
    	a278 = "g";
    	a399 = a269;
    	a263 = (a360 + 1);
    	a237 = a336;
    	a215 = (a136 + 4);
    	a310 = "g";
    	a283 = "g";
    	a246 = a332;
    	a280 = (((((((a280 * a349) % 14999) - -7692) % 39) + 286) * 10) / 9);
    	a377 = a281;
    	a291 = a307[(a201 - 7)];
    	a295 = (((((((a244 * a244) % 14999) - 23798) % 95) + 204) * 9) / 10);
    	a360 = ((a373 + a24) - 6);
    	a285 = "g";
    	a209 = "g";
    	a146 = a3[((a212 * a212) - 98)];
    	a279 = ((((((a279 * a295) % 14999) - 15150) - -18297) * 1) * -1);
    	a266 = a236;
    	a201 = (a263 - 2);
    	a353 = a343[((a373 * a215) + -34)];
    	a261 = a229[(a136 + -6)];
    	a333 = "g";
    	a365 = "g";
    	a373 = (a215 + -10);
    	a235 = a240;
    	a212 = ((a136 + a337) - 4);
    	a340 = a245[(a215 + -10)];
    	a320 = a299;
    	a391 = a392[(a337 - 7)];
    	a337 = ((a215 + a136) + -12); 
    	output = "Z";
    } 
}
private  void calculateOutputm23(String input) {
    if((((((a263 == 9) && (a381 == a218[1] && ((-103 < a400) && (-75 >= a400)))) && (22 == a237[0])) && (a201 == 7)) && ((((-194 < a1) && (-114 >= a1)) && cf) && ((156 < a280) && (284 >= a280))))) {
    	calculateOutputm136(input);
    } 
}
private  void calculateOutputm140(String input) {
    if(((((((cf && input.equals(inputs[7])) && a146 == a3[3]) && a291 == a307[1]) && (a215 == 11)) && ((105 < a279) && (221 >= a279))) && ((((a24 == 12) && ((a337 == 7) && (a103 == 10))) && ((75 < a390) && (251 >= a390))) && (a333.equals("f"))))) {
    	cf = false;
    	a64 = a67[(a103 - 6)];
    	a15 = (a201 + 2);
    	a146 = a3[(a103 - 3)]; 
    	output = "Y";
    } 
    if((((a209.equals("f")) && ((a337 == 7) && ((a103 == 10) && (((156 < a280) && (284 >= a280)) && (90 == a246[4]))))) && ((63 == a320[2]) && (((input.equals(inputs[0]) && (a146 == a3[3] && cf)) && (a24 == 12)) && a340 == a245[1])))) {
    	cf = false;
    	a279 = (((a279 - -20294) - 36976) + 43310);
    	a285 = "h";
    	a365 = "h";
    	a278 = "i";
    	a261 = a229[3];
    	a136 = (a337 - 2);
    	a235 = a324;
    	a130 = a160;
    	a295 = (((a295 * 5) * 5) + 21335);
    	a244 = (((a244 - -7626) / 5) * 5);
    	a146 = a3[(a263 - 7)];
    	a215 = 17;
    	a333 = "h";
    	a399 = a251;
    	a381 = a218[3];
    	a390 = (((a390 - -14370) + 2048) + 10448);
    	a337 = 11; 
    	output = "S";
    } 
    if(((((-103 < a400) && (-75 >= a400)) && ((a146 == a3[3] && ((a201 == 7) && (input.equals(inputs[9]) && ((a103 == 10) && cf)))) && (a215 == 11))) && ((((a337 == 7) && (a24 == 12)) && (a360 == 9)) && a391 == a392[1]))) {
    	cf = false;
    	a19 = ((((((a295 * a280) % 14999) * 2) % 14855) + 15144) + 0);
    	a278 = "h";
    	a312 = a382[1];
    	a201 = 13;
    	a285 = "i";
    	a279 = ((((((a279 % 57) - -157) * 5) - 26663) % 57) - -171);
    	a333 = "f";
    	a212 = 12;
    	a391 = a392[2];
    	a235 = a374;
    	a15 = (a360 + 4);
    	a310 = "g";
    	a146 = a3[(a15 + -6)];
    	a349 = (((a349 - -19087) + 5787) / 5);
    	a390 = (((((a390 % 37) - -272) * 5) % 37) - -253);
    	a340 = a245[4];
    	a320 = a299;
    	a360 = 14; 
    	output = "Z";
    } 
    if((((a333.equals("f")) && ((((a146 == a3[3] && (((-110 < a295) && (16 >= a295)) && ((a103 == 10) && (((a24 == 12) && cf) && input.equals(inputs[3]))))) && (a212 == 10)) && (a209.equals("f"))) && (a263 == 9))) && ((-103 < a400) && (-75 >= a400)))) {
    	cf = false;
    	a215 = 16;
    	a349 = (((((a349 + -18680) + -268) * 1) % 72) + 333);
    	a291 = a307[1];
    	a266 = a236;
    	a285 = "f";
    	a146 = a3[(a263 + -9)];
    	a17 = "f";
    	a377 = a366;
    	a263 = 11;
    	a373 = 6;
    	a400 = ((((a400 / 5) / 5) + 8492) + -8533);
    	a381 = a218[2];
    	a360 = 13;
    	a278 = "i";
    	a261 = a229[4];
    	a244 = (((a244 * 5) * 5) / 5);
    	a235 = a324;
    	a152 = a143; 
    	output = "Y";
    } 
    if((((a283.equals("f")) && ((50 == a235[3]) && ((23 < a349) && (243 >= a349)))) && ((a146 == a3[3] && (a353 == a343[1] && (a261 == a229[1] && ((a103 == 10) && ((cf && input.equals(inputs[8])) && (a24 == 12)))))) && a391 == a392[1]))) {
    	cf = false;
    	a56 = ((((a244 * a295) - 8729) * 1) + -2361);
    	a88 = (((((((a56 * a56) % 14999) % 56) + 75) - -1) + -8429) + 8430);
    	a266 = a236;
    	a237 = a328;
    	a285 = "f";
    	a146 = a3[(a201 - 6)]; 
    	output = "Y";
    } 
    if(((((a212 == 10) && (input.equals(inputs[4]) && (a285.equals("f")))) && ((-103 < a400) && (-75 >= a400))) && (((a310.equals("f")) && ((((23 < a349) && (243 >= a349)) && ((a24 == 12) && (cf && a146 == a3[3]))) && (a103 == 10))) && (a373 == 3)))) {
    	cf = false;
    	if(((!(a310.equals("g")) || ((-103 < a400) && (-75 >= a400))) || !(a291 == a307[0]))) {
    	a391 = a392[7];
    	a246 = a358;
    	a50 = a0[a337];
    	a312 = a382[4];
    	a340 = a245[1];
    	a209 = "g";
    	a215 = 10;
    	a283 = "f";
    	a285 = "h";
    	a278 = "g";
    	a381 = a218[5];
    	a266 = a221;
    	a24 = ((a360 / a103) + 8); 
    	}else {
    	a340 = a245[6];
    	a24 = (a103 - 1);
    	a237 = a336;
    	a266 = a221;
    	a30 = (a103 + 1);
    	}output = "U";
    } 
    if((((a310.equals("f")) && ((input.equals(inputs[5]) && (((cf && a146 == a3[3]) && (a24 == 12)) && (a337 == 7))) && ((94 < a244) && (141 >= a244)))) && (((a278.equals("f")) && ((a103 == 10) && a312 == a382[1])) && (a212 == 10)))) {
    	cf = false;
    	if((a312 == a382[5] || !(a209.equals("h")))) {
    	a155 = "i";
    	a109 = ((a201 - a263) + 7);
    	a146 = a3[(a215 + -6)]; 
    	}else {
    	a399 = a251;
    	a312 = a382[4];
    	a15 = ((a337 * a103) + -61);
    	a377 = a281;
    	a261 = a229[5];
    	a320 = a372;
    	a353 = a343[2];
    	a373 = 4;
    	a400 = ((((a400 / 5) - 35) + -23109) - -23165);
    	a285 = "h";
    	a310 = "g";
    	a349 = ((((a349 / 5) - -22723) + -29122) - -32414);
    	a381 = a218[6];
    	a244 = (((((a244 - -17403) % 23) + 99) + -4921) + 4939);
    	a340 = a245[3];
    	a246 = a358;
    	a215 = 15;
    	a391 = a392[5];
    	a360 = 11;
    	a263 = 9;
    	a291 = a307[3];
    	a278 = "h";
    	a146 = a3[(a24 - 5)];
    	a64 = a67[(a212 - 9)];
    	a283 = "g";
    	a280 = ((((a280 + -25272) / 5) / 5) - -1313);
    	a266 = a211;
    	a235 = a374;
    	a337 = 7;
    	a365 = "f";
    	a209 = "g";
    	a201 = 10;
    	a295 = (((a295 - 7393) + -14862) * 1);
    	a390 = ((((((a390 % 37) + 256) * 10) / 9) * 9) / 10);
    	a212 = 14;
    	}output = "S";
    } 
    if(((((((a310.equals("f")) && input.equals(inputs[1])) && (a373 == 3)) && ((-103 < a400) && (-75 >= a400))) && (95 == a399[3])) && ((a285.equals("f")) && ((a103 == 10) && ((a146 == a3[3] && ((a24 == 12) && cf)) && a381 == a218[1]))))) {
    	a192 -= (a192 - 20) < a192 ? 4 : 0;
    	cf = false;
    	a295 = ((((a295 - 2328) + 2504) + 26553) + -26598);
    	a237 = a328;
    	a79 = "i";
    	a391 = a392[4];
    	a266 = a236;
    	a24 = (a263 - -4); 
    	output = "Z";
    } 
    if((((a360 == 9) && ((a261 == a229[1] && a381 == a218[1]) && input.equals(inputs[2]))) && ((a146 == a3[3] && ((a285.equals("f")) && (((a103 == 10) && ((a24 == 12) && cf)) && (a333.equals("f"))))) && (a278.equals("f"))))) {
    	cf = false;
    	a337 = 7;
    	a212 = 15;
    	a285 = "h";
    	a309 = ((a263 * a263) + -73);
    	a381 = a218[1];
    	a365 = "f";
    	a310 = "e";
    	a136 = a201;
    	a291 = a307[1];
    	a278 = "f";
    	a261 = a229[0];
    	a146 = a3[((a201 + a215) - 16)];
    	a215 = 14;
    	a263 = 13;
    	a377 = a204;
    	a235 = a240;
    	a201 = 6; 
    	output = "S";
    } 
    if(((((63 == a320[2]) && (a337 == 7)) && (a24 == 12)) && ((a373 == 3) && (((a212 == 10) && ((a278.equals("f")) && (((a146 == a3[3] && cf) && input.equals(inputs[6])) && (a103 == 10)))) && a381 == a218[1])))) {
    	cf = false;
    	a146 = a3[(a103 - 4)];
    	a76 = a48;
    	a61 = a28; 
    	output = "Z";
    } 
}
private  void calculateOutputm141(String input) {
    if((((((a103 == 12) && (((input.equals(inputs[6]) && cf) && (a24 == 12)) && (a337 == 7))) && a381 == a218[1]) && a391 == a392[1]) && (((((156 < a280) && (284 >= a280)) && (a360 == 9)) && a146 == a3[3]) && (a373 == 3)))) {
    	cf = false;
    	if(((!(a146 == 4) || (a340 == a245[2] && a156 <=  -10)) || (a353 == 3))) {
    	a285 = "i";
    	a399 = a269;
    	a337 = 10;
    	a365 = "h";
    	a212 = 13;
    	a340 = a245[7];
    	a381 = a218[2];
    	a244 = (((a244 + -9097) + 9210) + -53);
    	a237 = a328;
    	a291 = a307[4];
    	a349 = ((((a349 * 5) + 26579) % 109) + 132);
    	a400 = ((((a400 / 5) - 73) * 9) / 10);
    	a146 = a3[(a263 + -2)];
    	a261 = a229[3];
    	a263 = 10;
    	a353 = a343[1];
    	a377 = a281;
    	a246 = a358;
    	a201 = 7;
    	a15 = (a373 + 7);
    	a360 = 14;
    	a312 = a382[1];
    	a119 = "e";
    	a235 = a374;
    	a278 = "i";
    	a373 = 7; 
    	}else {
    	a391 = a392[5];
    	a263 = 13;
    	a237 = a265;
    	a377 = a281;
    	a295 = (((a295 - -25236) - -3026) * 1);
    	a333 = "f";
    	a146 = a3[(a360 + -9)];
    	a246 = a332;
    	a291 = a307[1];
    	a373 = 4;
    	a279 = ((((a279 % 55) + 225) - 2) - -5);
    	a353 = a343[6];
    	a209 = "g";
    	a261 = a229[3];
    	a201 = 12;
    	a312 = a382[7];
    	a278 = "f";
    	a215 = 16;
    	a152 = a197;
    	a212 = 11;
    	a381 = a218[1];
    	a17 = "f";
    	a266 = a211;
    	a349 = (((a349 - -17145) - -7633) - -3775);
    	a235 = a374;
    	a360 = 14;
    	}output = "U";
    } 
    if(((a146 == a3[3] && (input.equals(inputs[3]) && ((a215 == 11) && (((a24 == 12) && cf) && (a103 == 12))))) && ((22 == a237[0]) && ((a381 == a218[1] && (a291 == a307[1] && (63 == a320[2]))) && (a278.equals("f")))))) {
    	cf = false;
    	a263 = 14;
    	a377 = a204;
    	a235 = a324;
    	a209 = "i";
    	a349 = (((a349 * 5) + 3047) - 31703);
    	a381 = a218[7];
    	a320 = a372;
    	a266 = a211;
    	a167 = (a24 + -10);
    	a215 = 16;
    	a136 = ((a24 + a212) + -14);
    	a365 = "f";
    	a353 = a343[4];
    	a283 = "h";
    	a201 = 9;
    	a244 = ((((a244 + -17382) * 10) / 9) - 972);
    	a295 = (((a295 - 18826) + -1826) * 1);
    	a291 = a307[7];
    	a237 = a265;
    	a337 = 11;
    	a399 = a251;
    	a285 = "h";
    	a246 = a296;
    	a360 = 13;
    	a279 = (((a279 * 5) - 6206) * 5);
    	a333 = "i";
    	a280 = (((((a280 * 24) / 10) + 4797) + -12880) + 24748);
    	a310 = "h";
    	a146 = a3[(a373 - 1)];
    	a278 = "i";
    	a400 = ((((((a400 + -9078) % 13) - 75) / 5) * 59) / 10);
    	a391 = a392[7];
    	a373 = 6;
    	a340 = a245[4];
    	a390 = (((a390 - 1260) + -12832) / 5);
    	a212 = 10; 
    	output = "S";
    } 
    if(((((a333.equals("f")) && (((((cf && (a24 == 12)) && a146 == a3[3]) && (a215 == 11)) && input.equals(inputs[4])) && (a103 == 12))) && (20 == a266[1])) && (((95 == a399[3]) && ((75 < a390) && (251 >= a390))) && a391 == a392[1]))) {
    	cf = false;
    	if((a17.equals("i"))) {
    	a101 = "g";
    	a312 = a382[3];
    	a146 = a3[(a373 - 2)];
    	a56 = (((1 - -14798) * 2) / 5); 
    	}else {
    	a333 = "h";
    	a390 = ((((((a390 % 87) + 127) * 9) / 10) - 9360) - -9344);
    	a365 = "h";
    	a212 = 16;
    	a373 = 9;
    	a15 = ((a201 - a215) - -16);
    	a266 = a211;
    	a261 = a229[7];
    	a201 = 13;
    	a280 = ((((a280 % 39) + 297) + 8) + -12);
    	a237 = a265;
    	a312 = a382[4];
    	a117 = a178[((a15 / a263) + 3)];
    	a381 = a218[7];
    	a279 = ((((((a279 * 5) % 55) - -238) * 5) % 55) - -224);
    	a285 = "f";
    	a360 = 9;
    	a246 = a332;
    	a353 = a343[2];
    	a235 = a374;
    	a310 = "h";
    	a215 = 16;
    	a278 = "i";
    	a291 = a307[2];
    	a340 = a245[7];
    	a391 = a392[4];
    	a283 = "i";
    	a244 = ((((a244 * 10) / 3) / 5) - -25512);
    	a320 = a372;
    	a377 = a281;
    	a349 = (((((a349 * 5) / 5) + 13335) % 109) + 88);
    	a399 = a251;
    	a146 = a3[a337];
    	a400 = ((((a400 + 104) * 10) / 9) - 20);
    	a337 = 11;
    	a263 = 15;
    	}output = "U";
    } 
    if((((a353 == a343[1] && ((((23 < a349) && (243 >= a349)) && (a103 == 12)) && a146 == a3[3])) && a391 == a392[1]) && ((a381 == a218[1] && (((a24 == 12) && (input.equals(inputs[5]) && cf)) && (a333.equals("f")))) && (a263 == 9)))) {
    	cf = false;
    	a244 = (((a244 + -8593) * 3) - 1804);
    	a146 = a3[(a360 + -3)];
    	a263 = 9;
    	a266 = a221;
    	a340 = a245[6];
    	a400 = ((((a400 * 5) * 5) * 10) / 9);
    	a320 = a372;
    	a76 = a70;
    	a193 = (((((((a295 * a280) % 14999) % 16) + -95) + -9306) - -32347) + -23041);
    	a373 = 7;
    	a285 = "e";
    	a283 = "f";
    	a212 = 15;
    	a235 = a324;
    	a295 = ((((a295 % 62) - 47) / 5) - -5);
    	a279 = (((a279 - 19147) + 45901) * -1);
    	a310 = "f";
    	a237 = a336;
    	a381 = a218[3];
    	a333 = "f";
    	a278 = "h";
    	a349 = (((a349 + -26943) - 982) + -1526);
    	a246 = a358;
    	a215 = 17;
    	a390 = (((((a390 + 24797) % 87) + 92) + -25342) - -25363);
    	a291 = a307[4];
    	a353 = a343[3];
    	a209 = "h";
    	a360 = 15;
    	a391 = a392[3];
    	a337 = 9;
    	a377 = a204;
    	a201 = 10;
    	a365 = "f";
    	a399 = a251;
    	a280 = ((((a280 / -5) - -20338) - -6252) - 38234); 
    	output = "W";
    } 
    if((((-110 < a295) && (16 >= a295)) && (((((a381 == a218[1] && ((((input.equals(inputs[7]) && cf) && a146 == a3[3]) && (a103 == 12)) && (a310.equals("f")))) && (a278.equals("f"))) && ((75 < a390) && (251 >= a390))) && (a360 == 9)) && (a24 == 12)))) {
    	cf = false;
    	if((a261 == 7)) {
    	a103 = (a215 - 5); 
    	}else {
    	a337 = 9;
    	a320 = a372;
    	a246 = a332;
    	a295 = (((a295 + -23159) * 1) - -39937);
    	a201 = 13;
    	a391 = a392[1];
    	a15 = (a212 + -3);
    	a244 = ((((a244 + 66) / 5) - -14870) + -14710);
    	a310 = "i";
    	a340 = a245[1];
    	a283 = "f";
    	a349 = (((((a349 % 72) - -253) / 5) - -16657) - 16377);
    	a237 = a328;
    	a338 = (a15 - 3);
    	a261 = a229[7];
    	a381 = a218[2];
    	a399 = a251;
    	a285 = "g";
    	a365 = "h";
    	a333 = "i";
    	a377 = a366;
    	a353 = a343[7];
    	a312 = a382[2];
    	a280 = ((((a280 * 5) + -26598) % 39) + 361);
    	a400 = ((((((a400 - -20599) % 13) - 93) * 5) % 13) + -80);
    	a390 = (((a390 - -23897) + 233) / 5);
    	a146 = a3[(a103 + -5)];
    	a266 = a211;
    	a291 = a307[6];
    	a263 = 14;
    	a360 = 13;
    	a235 = a324;
    	a278 = "f";
    	a373 = 6;
    	a215 = 13;
    	a279 = (((((a279 + -10344) * 2) + 13665) % 55) + 299);
    	a212 = 11;
    	}output = "W";
    } 
    if((((a103 == 12) && (((a278.equals("f")) && (a24 == 12)) && (50 == a235[3]))) && (((a215 == 11) && ((a381 == a218[1] && ((cf && a146 == a3[3]) && input.equals(inputs[9]))) && (a373 == 3))) && (a365.equals("f"))))) {
    	cf = false;
    	a280 = (((a280 + -27289) + -559) - 120);
    	a136 = ((a24 / a212) - -8);
    	a381 = a218[3];
    	a377 = a366;
    	a266 = a221;
    	a337 = 7;
    	a320 = a217;
    	a190 = "e";
    	a285 = "e";
    	a365 = "i";
    	a146 = a3[(a215 + -9)];
    	a399 = a251;
    	a310 = "f";
    	a237 = a336;
    	a215 = 17; 
    	output = "W";
    } 
    if((((23 < a349) && (243 >= a349)) && ((50 == a235[3]) && ((a278.equals("f")) && ((a215 == 11) && ((a365.equals("f")) && (input.equals(inputs[2]) && (((105 < a279) && (221 >= a279)) && ((a103 == 12) && (((a24 == 12) && cf) && a146 == a3[3])))))))))) {
    	cf = false;
    	if(((!(a155.equals("i")) && ((!(a64 == a67[2]) || (79 == a282[3])) || (a17.equals("g")))) || (a17.equals("e")))) {
    	a310 = "g";
    	a365 = "g";
    	a237 = a328;
    	a353 = a343[4];
    	a266 = a211;
    	a295 = ((((a295 * 5) * 5) % 62) - 45);
    	a399 = a269;
    	a261 = a229[2];
    	a381 = a218[2];
    	a244 = ((((a244 / 5) / 5) * 857) / 10);
    	a400 = ((((a400 % 13) - 75) / 5) + -69);
    	a291 = a307[7];
    	a17 = "h";
    	a283 = "h";
    	a377 = a366;
    	a333 = "g";
    	a278 = "i";
    	a340 = a245[7];
    	a312 = a382[7];
    	a279 = (((((a279 % 57) - -122) - -28) * 9) / 10);
    	a146 = a3[(a337 - 7)];
    	a320 = a299;
    	a390 = ((((a390 * 5) % 37) + 279) + -2);
    	a349 = (((a349 - 24819) + 54172) - -37);
    	a189 = "e";
    	a391 = a392[7];
    	a263 = 15;
    	a235 = a374;
    	a212 = 11;
    	a246 = a358;
    	a201 = 7;
    	a360 = 13;
    	a285 = "h";
    	a280 = ((((a280 * 24) / 10) * 5) * 5);
    	a215 = 13;
    	a373 = 3;
    	a337 = 13; 
    	}else {
    	a116 = "i";
    	a312 = a382[4];
    	a146 = a3[((a24 + a263) + -17)];
    	a261 = a229[6];
    	a56 = ((((a400 * a400) / 5) - 16950) * 1);
    	}output = "Z";
    } 
    if(((((23 < a349) && (243 >= a349)) && (((((a285.equals("f")) && ((94 < a244) && (141 >= a244))) && (a103 == 12)) && a353 == a343[1]) && (a24 == 12))) && (((a146 == a3[3] && (cf && input.equals(inputs[0]))) && a391 == a392[1]) && (89 == a377[1])))) {
    	cf = false;
    	if((a283.equals("g"))) {
    	a337 = 11;
    	a391 = a392[2];
    	a377 = a281;
    	a291 = a307[0];
    	a212 = 13;
    	a295 = (((a295 / 5) * 5) + 1);
    	a283 = "f";
    	a261 = a229[5];
    	a373 = 3;
    	a381 = a218[1];
    	a365 = "e";
    	a340 = a245[1];
    	a237 = a328;
    	a353 = a343[2];
    	a215 = 14;
    	a280 = (((a280 + 29259) / 5) / 5);
    	a390 = (((a390 - -23688) * 1) / 5);
    	a263 = 14;
    	a285 = "f";
    	a235 = a324;
    	a15 = a24;
    	a360 = 11;
    	a278 = "f";
    	a117 = a178[(a15 + -11)];
    	a310 = "h";
    	a246 = a358;
    	a333 = "f";
    	a266 = a221;
    	a201 = 12;
    	a312 = a382[2];
    	a146 = a3[(a103 + -5)]; 
    	}else {
    	a116 = "i";
    	a146 = a3[(a373 + 1)];
    	a56 = (((((a390 * a295) + 18725) - -5480) % 14823) + 15175);
    	}output = "W";
    } 
    if(((((105 < a279) && (221 >= a279)) && (((a365.equals("f")) && ((a103 == 12) && ((((input.equals(inputs[8]) && cf) && a146 == a3[3]) && (95 == a399[3])) && (a24 == 12)))) && (90 == a246[4]))) && ((a310.equals("f")) && (50 == a235[3])))) {
    	cf = false;
    	a56 = ((((((((a390 * a244) % 14999) % 70) + 213) - 19876) - -18292) * -2) / 10);
    	a133 = "g";
    	a146 = a3[((a337 + a212) + -16)]; 
    	output = "W";
    } 
    if(((a391 == a392[1] && ((50 == a235[3]) && (a146 == a3[3] && ((input.equals(inputs[1]) && cf) && (a103 == 12))))) && (((a201 == 7) && (((a285.equals("f")) && ((23 < a349) && (243 >= a349))) && (a24 == 12))) && (20 == a266[1])))) {
    	cf = false;
    	if(a391 == a392[5]) {
    	a337 = 7;
    	a349 = (((a349 + 8939) * 3) - -796);
    	a283 = "e";
    	a244 = ((((a244 * 28) / 10) - 2360) + 28015);
    	a279 = ((((a279 % 57) - -107) / 5) + 119);
    	a377 = a366;
    	a291 = a307[3];
    	a309 = ((a201 / a373) + 11);
    	a400 = (((a400 * 5) + 12589) / 5);
    	a399 = a344;
    	a391 = a392[1];
    	a285 = "h";
    	a266 = a221;
    	a263 = 12;
    	a280 = ((((a280 - -20355) + -17406) % 63) - -216);
    	a365 = "e";
    	a235 = a240;
    	a278 = "f";
    	a360 = 14;
    	a333 = "h";
    	a295 = ((((a295 + -15943) * 10) / -9) / 5);
    	a381 = a218[5];
    	a209 = "e";
    	a310 = "i";
    	a237 = a336;
    	a340 = a245[1];
    	a136 = ((a103 / a309) + 7);
    	a246 = a358;
    	a312 = a382[3];
    	a373 = 6;
    	a215 = 14;
    	a390 = ((((a390 / 5) / -5) - -3529) * -5);
    	a146 = a3[((a24 / a201) - -1)];
    	a353 = a343[6];
    	a320 = a217;
    	a212 = 15;
    	a201 = 11; 
    	}else {
    	a177 = (a103 - 8);
    	a15 = ((a177 / a24) + 8);
    	a146 = a3[a337];
    	}output = "U";
    } 
}
private  void calculateOutputm24(String input) {
    if((((a337 == 7) && a340 == a245[1]) && ((89 == a377[1]) && ((a212 == 10) && (((75 < a390) && (251 >= a390)) && ((cf && (a103 == 10)) && (a365.equals("f")))))))) {
    	calculateOutputm140(input);
    } 
    if((((((89 == a377[1]) && (((a103 == 12) && cf) && a291 == a307[1])) && (95 == a399[3])) && ((-103 < a400) && (-75 >= a400))) && (((75 < a390) && (251 >= a390)) && (a263 == 9)))) {
    	calculateOutputm141(input);
    } 
}
private  void calculateOutputm142(String input) {
    if(((a340 == a245[1] && (((input.equals(inputs[8]) && (20 == a266[1])) && ((75 < a390) && (251 >= a390))) && (a24 == 13))) && (((a215 == 11) && ((a278.equals("f")) && (a146 == a3[3] && (cf && (a79.equals("f")))))) && a291 == a307[1]))) {
    	cf = false;
    	a24 = ((a201 / a337) - -11);
    	a103 = a201; 
    	output = "Z";
    } 
    if((((a283.equals("f")) && ((a312 == a382[1] && (a310.equals("f"))) && (a79.equals("f")))) && ((89 == a377[1]) && ((input.equals(inputs[1]) && ((63 == a320[2]) && ((cf && a146 == a3[3]) && (a24 == 13)))) && (20 == a266[1]))))) {
    	cf = false;
    	a280 = ((((((a279 * a279) % 14999) - 26360) * 10) / 9) - 284);
    	a390 = (((((a279 * a280) % 14999) - 14939) - 54) / 5);
    	a146 = a3[(a215 + -4)];
    	a349 = ((((((a349 * a390) % 14999) * 2) % 15011) + -14987) - 2);
    	a312 = a382[(a201 + -7)];
    	a15 = a201;
    	a235 = a240;
    	a266 = a236;
    	a400 = (((((((a400 * a349) % 14999) % 14948) + -15050) / 5) * 5) - 3);
    	a338 = (a360 + 2);
    	a381 = a218[(a337 + -7)];
    	a283 = "e";
    	a263 = ((a201 * a201) - 41);
    	a278 = "e";
    	a337 = (a24 + -7);
    	a237 = a336;
    	a320 = a217;
    	a377 = a204;
    	a244 = (((((((a349 * a390) % 14999) - 4228) % 23) - -118) + -5275) - -5275);
    	a291 = a307[((a201 - a215) + 4)];
    	a399 = a344;
    	a340 = a245[(a373 + -2)];
    	a360 = (a215 - 3);
    	a246 = a296;
    	a310 = "e";
    	a215 = ((a212 + a212) + -8);
    	a201 = ((a212 - a373) - 1); 
    	output = "Y";
    } 
}
private  void calculateOutputm144(String input) {
    if(((((a209.equals("f")) && ((a340 == a245[1] && a261 == a229[1]) && (a215 == 11))) && a312 == a382[1]) && (((a146 == a3[3] && (input.equals(inputs[9]) && ((a79.equals("h")) && cf))) && ((105 < a279) && (221 >= a279))) && (a24 == 13)))) {
    	cf = false;
    	a209 = "e";
    	a285 = "f";
    	a101 = "f";
    	a295 = ((((((a279 * a279) % 14999) % 62) - 85) / 5) * 5);
    	a278 = "e";
    	a146 = a3[(a337 + -6)];
    	a390 = (((((((a280 * a295) % 14999) / 5) / 5) / 5) % 87) - -164);
    	a291 = a307[((a360 - a373) - 6)];
    	a365 = "e";
    	a381 = a218[(a373 - 3)];
    	a349 = (((((a349 * a390) % 14999) - 26019) + -2651) + -864);
    	a283 = "f";
    	a340 = a245[(a212 - a212)];
    	a201 = (a24 - 6);
    	a353 = a343[(a215 + -10)];
    	a56 = (((64 + 3070) + 25107) + 336); 
    	output = "X";
    } 
    if(((((-103 < a400) && (-75 >= a400)) && ((input.equals(inputs[8]) && ((89 == a377[1]) && (a310.equals("f")))) && (a373 == 3))) && (a340 == a245[1] && (a146 == a3[3] && (((156 < a280) && (284 >= a280)) && ((a79.equals("h")) && ((a24 == 13) && cf))))))) {
    	cf = false;
    	a127 = a29[(a360 - 9)];
    	a56 = (((((a400 * a349) - -21773) + 960) % 82) - -126);
    	a146 = a3[(a24 - 12)]; 
    	output = "W";
    } 
    if(((((a353 == a343[1] && (input.equals(inputs[4]) && ((95 == a399[3]) && (a209.equals("f"))))) && (a278.equals("f"))) && a291 == a307[1]) && ((a79.equals("h")) && (((a24 == 13) && (cf && a146 == a3[3])) && a381 == a218[1])))) {
    	cf = false;
    	if(((-79 < a54) && (134 >= a54))) {
    	 
    	}else {
    	a116 = "f";
    	a283 = "f";
    	a146 = a3[((a337 / a337) + 3)];
    	a285 = "f";
    	a295 = (((((a244 * a400) - 5375) / 5) % 62) + 13);
    	a128 = (a360 - 1);
    	a201 = ((a215 * a24) - 136);
    	a390 = (((((((a280 * a349) % 14999) % 87) + 100) - -8) * 10) / 9);
    	a391 = a392[((a263 + a215) - 19)];
    	}output = "Z";
    } 
    if((((63 == a320[2]) && ((a278.equals("f")) && ((a333.equals("f")) && ((a146 == a3[3] && cf) && (a24 == 13))))) && ((a215 == 11) && (((a79.equals("h")) && (input.equals(inputs[3]) && ((156 < a280) && (284 >= a280)))) && a353 == a343[1])))) {
    	cf = false;
    	a117 = a178[(a24 - 12)];
    	a278 = "e";
    	a373 = ((a201 / a201) + 1);
    	a333 = "e";
    	a266 = a236;
    	a246 = a296;
    	a237 = a336;
    	a15 = ((a215 - a215) - -12);
    	a291 = a307[(a263 + -7)];
    	a261 = a229[((a373 * a201) - 12)];
    	a381 = a218[(a201 + -6)];
    	a337 = (a263 - 3);
    	a235 = a240;
    	a360 = ((a373 / a263) + 8);
    	a377 = a204;
    	a312 = a382[(a373 + -2)];
    	a365 = "g";
    	a146 = a3[(a212 - 3)];
    	a215 = (a263 - -3);
    	a310 = "e";
    	a353 = a343[(a360 / a212)];
    	a340 = a245[(a263 + -9)];
    	a280 = (((((a280 * a295) % 14999) + -9158) + 25691) / -5);
    	a212 = a263;
    	a263 = ((a201 - a201) - -8); 
    	output = "X";
    } 
}
private  void calculateOutputm145(String input) {
    if(((input.equals(inputs[8]) && ((((((a209.equals("f")) && ((a79.equals("i")) && (cf && (a24 == 13)))) && a146 == a3[3]) && (a337 == 7)) && (a263 == 9)) && (a283.equals("f")))) && ((22 == a237[0]) && ((-103 < a400) && (-75 >= a400))))) {
    	cf = false;
    	if(((a379 == 8) || !(a353 == a343[3]))) {
    	a146 = a3[a201];
    	a15 = (a215 + -4);
    	a338 = (a373 + 5); 
    	}else {
    	a280 = (((((a280 + 14243) * 10) / 9) * 10) / 9);
    	a312 = a382[7];
    	a360 = 15;
    	a391 = a392[5];
    	a373 = 4;
    	a117 = a178[((a337 / a215) - -1)];
    	a15 = (a201 + 5);
    	a278 = "i";
    	a263 = 15;
    	a381 = a218[4];
    	a146 = a3[a337];
    	a283 = "f";
    	a215 = 10;
    	a310 = "h";
    	a261 = a229[7];
    	a237 = a328;
    	a390 = (((a390 + 23689) / -5) - -3079);
    	a365 = "f";
    	a246 = a358;
    	a377 = a281;
    	a333 = "i";
    	a285 = "h";
    	a291 = a307[5];
    	a353 = a343[5];
    	a266 = a211;
    	a340 = a245[4];
    	a212 = 16;
    	a235 = a374;
    	a337 = 7;
    	a201 = 12;
    	}output = "S";
    } 
    if(((((((input.equals(inputs[2]) && ((a79.equals("i")) && cf)) && (a285.equals("f"))) && (a201 == 7)) && (a333.equals("f"))) && a312 == a382[1]) && (((a24 == 13) && (a146 == a3[3] && (a337 == 7))) && (a310.equals("f"))))) {
    	cf = false;
    	a360 = 9;
    	a285 = "h";
    	a246 = a358;
    	a333 = "i";
    	a215 = 16;
    	a136 = (a201 + -4);
    	a381 = a218[7];
    	a400 = (((((a400 * 5) - 15857) * 1) % 13) - 77);
    	a244 = (((a244 / 5) - -4041) - -23227);
    	a237 = a265;
    	a373 = 5;
    	a279 = ((((a279 * -5) / 5) * 10) / 9);
    	a337 = 12;
    	a212 = 10;
    	a249 = ((a24 + a24) - 14);
    	a365 = "i";
    	a349 = ((((a349 + 23713) + -24990) * -4) / 10);
    	a278 = "i";
    	a310 = "f";
    	a261 = a229[4];
    	a340 = a245[6];
    	a291 = a307[3];
    	a399 = a251;
    	a377 = a204;
    	a320 = a217;
    	a280 = (((a280 - -2659) / 5) - 316);
    	a209 = "e";
    	a283 = "e";
    	a235 = a240;
    	a312 = a382[5];
    	a266 = a211;
    	a201 = 9;
    	a295 = ((((53 * 10) / -4) - 19621) * 1);
    	a390 = ((((a390 + -13207) - 9979) * 10) / 9);
    	a263 = 9;
    	a146 = a3[(a136 + -1)]; 
    	output = "X";
    } 
    if((((a24 == 13) && (((a79.equals("i")) && (cf && input.equals(inputs[4]))) && a340 == a245[1])) && (((a146 == a3[3] && ((90 == a246[4]) && ((a365.equals("f")) && (a310.equals("f"))))) && ((156 < a280) && (284 >= a280))) && ((75 < a390) && (251 >= a390))))) {
    	cf = false;
    	a15 = ((a215 + a215) + -11);
    	a54 = (((((((a279 * a279) % 14999) % 106) - 23) + 45) + -6419) - -6413);
    	a146 = a3[(a212 - 3)]; 
    	output = "W";
    } 
    if(((((a79.equals("i")) && (a312 == a382[1] && a381 == a218[1])) && input.equals(inputs[3])) && ((a337 == 7) && (a261 == a229[1] && ((a310.equals("f")) && (a340 == a245[1] && (a146 == a3[3] && (cf && (a24 == 13))))))))) {
    	cf = false;
    	if(((a312 == 10) && (!(a117 == a178[0]) && (((94 < a244) && (141 >= a244)) || a391 == a392[6])))) {
    	a177 = ((a263 - a215) + 4);
    	a15 = (a24 - 5);
    	a146 = a3[(a177 - -5)]; 
    	}else {
    	a116 = "f";
    	a146 = a3[((a201 - a337) + 4)];
    	a128 = ((a24 / a201) - -8);
    	}output = "Y";
    } 
    if((((a365.equals("f")) && ((a373 == 3) && input.equals(inputs[0]))) && ((((a79.equals("i")) && ((50 == a235[3]) && (((cf && (a24 == 13)) && a146 == a3[3]) && (63 == a320[2])))) && ((94 < a244) && (141 >= a244))) && a312 == a382[1]))) {
    	cf = false;
    	a353 = a343[3];
    	a209 = "e";
    	a399 = a251;
    	a360 = 14;
    	a390 = ((((a390 - -4815) - 17248) - -9913) + 10966);
    	a291 = a307[5];
    	a373 = 2;
    	a235 = a240;
    	a76 = a98;
    	a146 = a3[(a215 - 5)];
    	a266 = a211;
    	a261 = a229[3];
    	a338 = (a201 - 2);
    	a278 = "f";
    	a215 = 13;
    	a201 = 13; 
    	output = "W";
    } 
    if((((((94 < a244) && (141 >= a244)) && ((input.equals(inputs[9]) && cf) && (a24 == 13))) && a340 == a245[1]) && (a146 == a3[3] && ((a79.equals("i")) && ((89 == a377[1]) && ((a283.equals("f")) && ((a263 == 9) && ((156 < a280) && (284 >= a280))))))))) {
    	cf = false;
    	if((82 == a246[2])) {
    	a127 = a29[(a360 - 9)];
    	a56 = (((78 / 5) + -10905) - -10975);
    	a146 = a3[(a24 + -12)]; 
    	}else {
    	a400 = (((((a400 * -1) / 10) / 5) * 10) / 9);
    	a283 = "i";
    	a278 = "h";
    	a340 = a245[1];
    	a15 = ((a215 - a201) - -5);
    	a215 = 15;
    	a320 = a372;
    	a373 = 9;
    	a209 = "g";
    	a399 = a269;
    	a390 = ((((a390 - 6220) - -25140) * 10) / 9);
    	a244 = (((a244 - 10814) - -10863) * 1);
    	a235 = a324;
    	a266 = a211;
    	a377 = a281;
    	a353 = a343[3];
    	a146 = a3[((a24 - a263) - -3)];
    	a360 = 10;
    	a349 = (((((a349 % 72) - -314) * 5) % 72) + 302);
    	a337 = 12;
    	a312 = a382[5];
    	a280 = (((((a280 - 9221) * 3) * 1) % 63) + 225);
    	a295 = ((((8 + -16797) / 5) / 5) - -23337);
    	a263 = 14;
    	a246 = a358;
    	a261 = a229[7];
    	a391 = a392[5];
    	a381 = a218[7];
    	a291 = a307[7];
    	a64 = a67[(a24 + -12)];
    	a285 = "i";
    	a365 = "g";
    	a212 = 14;
    	a237 = a328;
    	a310 = "h";
    	a201 = 13;
    	}output = "W";
    } 
    if((((((input.equals(inputs[6]) && ((a79.equals("i")) && cf)) && (63 == a320[2])) && a353 == a343[1]) && (a278.equals("f"))) && ((a360 == 9) && ((a209.equals("f")) && ((a24 == 13) && ((a310.equals("f")) && a146 == a3[3])))))) {
    	cf = false;
    	a76 = a98;
    	a353 = a343[1];
    	a291 = a307[7];
    	a215 = 15;
    	a261 = a229[0];
    	a338 = (a201 + -2);
    	a278 = "f";
    	a360 = 13;
    	a146 = a3[((a337 - a24) + 12)];
    	a373 = 3;
    	a235 = a240;
    	a209 = "f";
    	a266 = a221;
    	a399 = a344;
    	a390 = (((((a390 % 87) - -142) * 5) % 87) + 79);
    	a201 = 10; 
    	output = "X";
    } 
    if(((((((cf && (a24 == 13)) && (a79.equals("i"))) && (a209.equals("f"))) && (a215 == 11)) && input.equals(inputs[5])) && ((a212 == 10) && (((95 == a399[3]) && (a146 == a3[3] && (90 == a246[4]))) && ((23 < a349) && (243 >= a349)))))) {
    	cf = false;
    	a177 = (a215 + -10);
    	a15 = ((a177 / a24) - -8);
    	a146 = a3[(a15 + -1)]; 
    	output = "S";
    } 
    if((((a146 == a3[3] && (((a24 == 13) && (input.equals(inputs[7]) && cf)) && (a79.equals("i")))) && a261 == a229[1]) && (((23 < a349) && (243 >= a349)) && (((((75 < a390) && (251 >= a390)) && (a373 == 3)) && (20 == a266[1])) && (90 == a246[4]))))) {
    	cf = false;
    	if((!(a104 == 3) || (a64 == 5))) {
    	a136 = (a24 - 5);
    	a146 = a3[(a337 - 5)];
    	a167 = (a263 - 4); 
    	}else {
    	a167 = (a24 + -8);
    	a136 = ((a212 / a337) - -7);
    	a146 = a3[((a337 * a263) - 70)];
    	}output = "S";
    } 
    if(((((75 < a390) && (251 >= a390)) && (((a146 == a3[3] && ((a24 == 13) && cf)) && (a79.equals("i"))) && input.equals(inputs[1]))) && (a291 == a307[1] && ((a337 == 7) && ((22 == a237[0]) && (((-103 < a400) && (-75 >= a400)) && ((23 < a349) && (243 >= a349)))))))) {
    	cf = false;
    	a338 = ((a24 + a373) - 11);
    	a15 = (a263 - 2);
    	a146 = a3[a15]; 
    	output = "W";
    } 
}
private  void calculateOutputm25(String input) {
    if((((22 == a237[0]) && (a312 == a382[1] && (a291 == a307[1] && ((a79.equals("f")) && cf)))) && (((a283.equals("f")) && (a285.equals("f"))) && a381 == a218[1]))) {
    	calculateOutputm142(input);
    } 
    if((((((a373 == 3) && ((a212 == 10) && a381 == a218[1])) && (90 == a246[4])) && (95 == a399[3])) && (((a79.equals("h")) && cf) && (a310.equals("f"))))) {
    	calculateOutputm144(input);
    } 
    if(((((94 < a244) && (141 >= a244)) && ((a278.equals("f")) && ((a365.equals("f")) && (90 == a246[4])))) && (((a215 == 11) && ((a79.equals("i")) && cf)) && (50 == a235[3])))) {
    	calculateOutputm145(input);
    } 
}
private  void calculateOutputm147(String input) {
    if((((cf && (a116.equals("e"))) && a146 == a3[4]) && (((a353 == a343[1] && ((a333.equals("f")) && (((a215 == 11) && (((21 < a129) && (60 >= a129)) && (a278.equals("f")))) && a312 == a382[1]))) && input.equals(inputs[8])) && (a212 == 10)))) {
    	cf = false;
    	a283 = "e";
    	a360 = (a337 + 2);
    	a17 = "e";
    	a365 = "e";
    	a373 = ((a215 / a212) - -1);
    	a146 = a3[(a212 - 10)];
    	a377 = a204;
    	a201 = ((a337 / a360) - -6);
    	a215 = ((a263 + a360) + -6);
    	a291 = a307[(a373 + -2)];
    	a390 = (((((a390 * a295) % 15037) + -14961) + -1) + -2);
    	a33 = a124; 
    	output = "W";
    } 
    if((((a365.equals("f")) && (input.equals(inputs[7]) && ((a116.equals("e")) && (a201 == 7)))) && (((((((21 < a129) && (60 >= a129)) && (a146 == a3[4] && cf)) && a261 == a229[1]) && (89 == a377[1])) && (a278.equals("f"))) && ((75 < a390) && (251 >= a390))))) {
    	cf = false;
    	a333 = "e";
    	a291 = a307[((a373 * a201) + -19)];
    	a15 = 13;
    	a146 = a3[((a212 + a15) - 16)];
    	a278 = "e";
    	a19 = (((((a244 * a390) % 14999) / 5) / 5) + -20401);
    	a280 = (((((a19 * a349) % 14999) - 14877) - 101) + -8);
    	a209 = "f";
    	a377 = a204;
    	a283 = "e";
    	a244 = (((((a349 * a400) % 14999) + -14984) * 1) + -10);
    	a285 = "e";
    	a365 = "e";
    	a295 = (((((a295 * a279) + -4690) * 1) + 18076) + -17337);
    	a312 = a382[(a360 - 9)];
    	a246 = a296;
    	a360 = (a212 - 2);
    	a261 = a229[(a201 - 7)];
    	a215 = ((a337 - a15) - -17);
    	a353 = a343[(a215 - 10)];
    	a373 = ((a337 + a15) - 17);
    	a266 = a236;
    	a212 = (a15 + -4);
    	a201 = (a263 + -2); 
    	output = "S";
    } 
}
private  void calculateOutputm26(String input) {
    if((((a283.equals("f")) && (a312 == a382[1] && ((a215 == 11) && (a209.equals("f"))))) && ((a212 == 10) && (a353 == a343[1] && (((21 < a129) && (60 >= a129)) && cf))))) {
    	calculateOutputm147(input);
    } 
}
private  void calculateOutputm150(String input) {
    if((((((-103 < a400) && (-75 >= a400)) && (((a146 == a3[4] && ((95 == a399[3]) && (90 == a246[4]))) && a340 == a245[1]) && ((23 < a349) && (243 >= a349)))) && (((89 == a377[1]) && ((a128 == 4) && (cf && input.equals(inputs[0])))) && (a116.equals("f")))) && a192 >= 11)) {
    	cf = false;
    	a79 = "g";
    	a365 = "f";
    	a24 = ((a215 - a212) - -12);
    	a235 = a324;
    	a146 = a3[(a201 - 4)]; 
    	output = "X";
    } 
    if(((((a201 == 7) && (((a116.equals("f")) && (a146 == a3[4] && (cf && input.equals(inputs[9])))) && (a285.equals("f")))) && a340 == a245[1]) && ((a353 == a343[1] && (a291 == a307[1] && (a128 == 4))) && (63 == a320[2])))) {
    	cf = false;
    	 
    	output = "U";
    } 
    if((((((75 < a390) && (251 >= a390)) && (a146 == a3[4] && (90 == a246[4]))) && ((a278.equals("f")) && ((a333.equals("f")) && ((a212 == 10) && ((a128 == 4) && (a353 == a343[1] && (((a116.equals("f")) && cf) && input.equals(inputs[6])))))))) && a59 <= -53)) {
    	cf = false;
    	a201 = ((a128 * a128) + -8);
    	a278 = "g";
    	a263 = ((a201 + a201) + -6);
    	a136 = (a360 + -2);
    	a285 = "g";
    	a146 = a3[(a212 + -8)];
    	a266 = a236;
    	a377 = a281;
    	a310 = "g";
    	a261 = a229[(a136 - 5)];
    	a215 = (a201 - -4);
    	a337 = (a212 - 2);
    	a291 = a307[((a201 + a136) - 13)];
    	a309 = (a136 + 1);
    	a212 = (a263 - -1); 
    	output = "W";
    } 
    if(((a391 == a392[1] && ((20 == a266[1]) && ((95 == a399[3]) && (a201 == 7)))) && ((22 == a237[0]) && ((((input.equals(inputs[1]) && ((a116.equals("f")) && cf)) && a146 == a3[4]) && (a215 == 11)) && (a128 == 4))))) {
    	cf = false;
    	a337 = (a373 + 5);
    	a261 = a229[((a360 - a373) + -4)];
    	a266 = a236;
    	a190 = "f";
    	a312 = a382[((a263 * a337) + -70)];
    	a285 = "g";
    	a333 = "g";
    	a278 = "g";
    	a146 = a3[((a201 + a215) + -16)];
    	a136 = (a201 - -2);
    	a215 = (a128 - -8);
    	a373 = (a263 - 5);
    	a320 = a299;
    	a377 = a281;
    	a291 = a307[(a263 - 7)]; 
    	output = "X";
    } 
    if(((((a285.equals("f")) && ((a373 == 3) && ((((cf && (a116.equals("f"))) && a146 == a3[4]) && input.equals(inputs[2])) && (a215 == 11)))) && (((89 == a377[1]) && (((75 < a390) && (251 >= a390)) && (a128 == 4))) && a340 == a245[1])) && a35 <= -61)) {
    	cf = false;
    	a310 = "e";
    	a237 = a336;
    	a15 = a337;
    	a390 = ((((((a390 * a244) % 14999) + -10499) * 2) * 1) + -8945);
    	a146 = a3[((a263 * a128) - 29)];
    	a291 = a307[((a15 + a128) + -11)];
    	a261 = a229[(a212 + -10)];
    	a338 = (a215 + -5);
    	a353 = a343[((a263 * a15) - 63)];
    	a278 = "e";
    	a312 = a382[(a360 - 9)];
    	a246 = a296;
    	a360 = ((a212 / a337) - -7);
    	a340 = a245[(a15 - 7)];
    	a212 = (a15 + 2);
    	a373 = (a15 - 5);
    	a399 = a344;
    	a377 = a204;
    	a295 = ((((a295 * a400) + -8162) + -4884) + -10100);
    	a263 = (a201 + 1); 
    	output = "S";
    } 
    if((((((a360 == 9) && ((75 < a390) && (251 >= a390))) && input.equals(inputs[8])) && a312 == a382[1]) && (a291 == a307[1] && (((-110 < a295) && (16 >= a295)) && (((a116.equals("f")) && (a146 == a3[4] && (cf && (a128 == 4)))) && (89 == a377[1])))))) {
    	cf = false;
    	a235 = a324;
    	a381 = a218[(a360 - 9)];
    	a391 = a392[((a212 + a128) + -14)];
    	a280 = ((((((a244 * a349) % 14999) % 63) - -179) + -20) * 1);
    	a365 = "f";
    	a56 = (((((a390 * a390) % 14999) - 18318) - 3958) / 5);
    	a146 = a3[(a373 + -2)];
    	a278 = "e";
    	a390 = ((((((((a390 * a280) % 14999) - 23369) % 37) - -299) / 5) * 49) / 10);
    	a88 = (((((a56 * a56) % 14999) + -14989) + -2) / 5); 
    	output = "T";
    } 
}
private  void calculateOutputm151(String input) {
    if(((((90 == a246[4]) && ((50 == a235[3]) && ((a146 == a3[4] && ((a333.equals("f")) && (89 == a377[1]))) && (a128 == 5)))) && ((94 < a244) && (141 >= a244))) && (((75 < a390) && (251 >= a390)) && (input.equals(inputs[9]) && ((a116.equals("f")) && cf))))) {
    	cf = false;
    	a340 = a245[(a212 / a337)];
    	a263 = (a215 - 2);
    	a235 = a374;
    	a280 = ((((((((a280 * a390) % 14999) % 39) - -285) - -35) / 5) * 45) / 10);
    	a285 = "f";
    	a320 = a372;
    	a128 = ((a360 + a212) - 15);
    	a349 = ((((((a244 * a400) / 5) - 12796) * 1) % 109) - -149);
    	a381 = a218[(a212 - 8)]; 
    	output = "S";
    } 
    if(((((a312 == a382[1] && (a333.equals("f"))) && ((75 < a390) && (251 >= a390))) && (a212 == 10)) && (((a146 == a3[4] && ((a128 == 5) && ((cf && input.equals(inputs[3])) && (a116.equals("f"))))) && ((105 < a279) && (221 >= a279))) && ((-103 < a400) && (-75 >= a400))))) {
    	cf = false;
    	a285 = "f";
    	a128 = (a201 + -3);
    	a280 = (((((((a280 * a390) % 14999) % 39) - -293) * 1) + 23010) - 22987);
    	a263 = (a215 + -2);
    	a340 = a245[(a212 / a337)];
    	a235 = a374;
    	a320 = a372;
    	a381 = a218[((a337 * a215) + -75)];
    	a349 = (((((((a244 * a295) * 1) % 109) + 133) * 5) % 109) - -120); 
    	output = "V";
    } 
    if(((((((94 < a244) && (141 >= a244)) && (89 == a377[1])) && (a283.equals("f"))) && ((75 < a390) && (251 >= a390))) && (((a116.equals("f")) && ((((cf && a146 == a3[4]) && input.equals(inputs[8])) && (a128 == 5)) && (a333.equals("f")))) && (a201 == 7)))) {
    	cf = false;
    	a215 = ((a360 - a360) - -11);
    	a365 = "g";
    	a373 = (a360 - 6); 
    	output = "S";
    } 
    if(((((((input.equals(inputs[6]) && ((a116.equals("f")) && (a146 == a3[4] && ((a128 == 5) && cf)))) && (50 == a235[3])) && (a310.equals("f"))) && a291 == a307[1]) && (22 == a237[0])) && (((156 < a280) && (284 >= a280)) && (a278.equals("f"))))) {
    	cf = false;
    	a278 = "e";
    	a310 = "e";
    	a360 = ((a212 + a212) - 12);
    	a377 = a204;
    	a295 = (((((((a295 * a349) % 14999) % 14945) + -15054) / 5) * 10) / 2);
    	a312 = a382[((a360 * a360) - 64)];
    	a237 = a336;
    	a15 = (a201 + 6);
    	a146 = a3[((a337 * a337) - 42)];
    	a333 = "e";
    	a283 = "e";
    	a212 = (a360 + 1);
    	a201 = (a128 - -1);
    	a391 = a392[(a263 - 8)];
    	a209 = "e";
    	a19 = ((((38 + 68) * 1) * 5) - 388); 
    	output = "S";
    } 
}
private  void calculateOutputm152(String input) {
    if((((((((94 < a244) && (141 >= a244)) && (((cf && (a116.equals("f"))) && input.equals(inputs[6])) && a146 == a3[4])) && (a128 == 7)) && (a215 == 11)) && (a209.equals("f"))) && (((105 < a279) && (221 >= a279)) && (a391 == a392[1] && (a212 == 10))))) {
    	cf = false;
    	a390 = (((((a400 * a295) / 5) / 5) / 5) - 18703);
    	a285 = "e";
    	a312 = a382[(a215 + -11)];
    	a310 = "e";
    	a279 = (((((a279 * a390) % 14999) / 5) / 5) + -7709);
    	a15 = (a360 + 4);
    	a333 = "e";
    	a235 = a240;
    	a19 = ((((a244 * a244) + 835) * 1) * 1);
    	a349 = (((((a349 * a295) / 5) / 5) - -23958) - 45600);
    	a146 = a3[(a15 + -6)];
    	a201 = ((a128 / a373) - -4);
    	a360 = ((a128 * a212) + -62);
    	a340 = a245[(a212 + -10)];
    	a212 = (a215 - 2);
    	a320 = a217;
    	a391 = a392[((a128 + a263) + -16)]; 
    	output = "X";
    } 
    if(((((((input.equals(inputs[2]) && cf) && a146 == a3[4]) && (a128 == 7)) && (a360 == 9)) && a312 == a382[1]) && ((a285.equals("f")) && ((a263 == 9) && (((a116.equals("f")) && (95 == a399[3])) && ((156 < a280) && (284 >= a280))))))) {
    	cf = false;
    	a291 = a307[((a201 * a360) - 61)];
    	a391 = a392[(a201 + -7)];
    	a117 = a178[((a212 - a373) - 6)];
    	a261 = a229[(a215 - a215)];
    	a373 = ((a201 - a360) + 4);
    	a146 = a3[a201];
    	a377 = a204;
    	a312 = a382[(a360 + -9)];
    	a337 = (a215 - 5);
    	a15 = ((a263 - a360) + 12);
    	a285 = "e";
    	a212 = (a201 + 2);
    	a390 = (((((((a390 * a349) % 14999) % 37) + 258) + 11) + 1466) + -1473);
    	a310 = "e";
    	a333 = "e";
    	a283 = "e";
    	a280 = ((((((a280 * a244) % 14999) - 17196) * 10) / 9) * 1);
    	a340 = a245[(a215 + -11)];
    	a263 = (a360 - 1);
    	a235 = a240;
    	a295 = ((((a295 * a244) * 1) + -9021) + 1960);
    	a360 = (a215 - 3);
    	a201 = ((a215 * a128) - 71);
    	a215 = (a337 - -6); 
    	output = "Z";
    } 
    if(((((a215 == 11) && ((((a116.equals("f")) && (((-103 < a400) && (-75 >= a400)) && (input.equals(inputs[5]) && (cf && (a128 == 7))))) && a261 == a229[1]) && a340 == a245[1])) && ((94 < a244) && (141 >= a244))) && (a146 == a3[4] && ((-110 < a295) && (16 >= a295))))) {
    	a192 -= (a192 - 20) < a192 ? 3 : 0;
    	cf = false;
    	if((!(a316.equals("f")) && (a180 <=  144 || !(a117 == 7)))) {
    	a30 = (a128 - -4);
    	a246 = a358;
    	a365 = "f";
    	a24 = ((a212 - a212) + 9);
    	a146 = a3[(a215 / a373)];
    	a353 = a343[(a24 - 8)];
    	a237 = a265;
    	a278 = "f";
    	a266 = a211;
    	a340 = a245[(a373 + -3)];
    	a381 = a218[(a201 - 6)]; 
    	}else {

    	}output = "U";
    } 
    if(((((a340 == a245[1] && a261 == a229[1]) && ((105 < a279) && (221 >= a279))) && ((156 < a280) && (284 >= a280))) && (((a146 == a3[4] && (((cf && (a128 == 7)) && input.equals(inputs[7])) && (50 == a235[3]))) && (63 == a320[2])) && (a116.equals("f"))))) {
    	cf = false;
    	a280 = (((((((a280 * a244) % 14999) / 5) % 39) - -322) * 9) / 10);
    	a246 = a358;
    	a128 = ((a201 * a337) - 45);
    	a235 = a374;
    	a353 = a343[((a215 * a215) + -120)];
    	a266 = a211;
    	a237 = a265;
    	a278 = "f";
    	a381 = a218[(a201 - 5)]; 
    	output = "T";
    } 
}
private  void calculateOutputm153(String input) {
    if(((((63 == a320[2]) && ((((a128 == 8) && (input.equals(inputs[9]) && cf)) && (a116.equals("f"))) && a146 == a3[4])) && (95 == a399[3])) && (((90 == a246[4]) && ((a373 == 3) && ((105 < a279) && (221 >= a279)))) && a381 == a218[1]))) {
    	cf = false;
    	a340 = a245[(a201 - 7)];
    	a278 = "e";
    	a56 = ((((((a279 * a244) % 14999) - -13905) + 566) + -36120) + 32854);
    	a209 = "e";
    	a365 = "e";
    	a381 = a218[(a263 - 9)];
    	a146 = a3[(a128 - 7)];
    	a291 = a307[(a373 - 3)];
    	a353 = a343[((a337 * a201) - 48)];
    	a101 = "f";
    	a391 = a392[((a337 * a128) - 56)];
    	a349 = (((((a279 * a390) % 14999) + -15246) - 12411) + -33); 
    	output = "X";
    } 
    if(((((input.equals(inputs[3]) && (a146 == a3[4] && cf)) && (a215 == 11)) && (a373 == 3)) && (((89 == a377[1]) && (((a116.equals("f")) && ((a201 == 7) && (a283.equals("f")))) && (a128 == 8))) && a340 == a245[1]))) {
    	cf = false;
    	a353 = a343[(a360 - 9)];
    	a365 = "g";
    	a212 = (a215 - 2);
    	a146 = a3[a337];
    	a235 = a240;
    	a263 = ((a128 + a128) - 8);
    	a333 = "e";
    	a391 = a392[(a215 - 11)];
    	a377 = a204;
    	a15 = (a201 - -5);
    	a278 = "e";
    	a280 = (((((a280 * a279) % 14999) - 26103) + -2459) * 1);
    	a340 = a245[((a128 - a215) - -3)];
    	a390 = ((((((a390 * a244) % 14999) % 37) + 255) + -5409) + 5436);
    	a117 = a178[((a360 * a360) + -80)];
    	a201 = (a215 + -5);
    	a295 = (((((a295 * a244) + -5788) * 10) / 9) * 1);
    	a246 = a296;
    	a310 = "e";
    	a381 = a218[((a263 + a212) + -17)];
    	a360 = a128;
    	a266 = a236;
    	a285 = "e";
    	a337 = ((a215 + a215) - 16);
    	a283 = "e";
    	a373 = (a215 - 9);
    	a312 = a382[(a215 - 11)];
    	a261 = a229[(a215 - 11)];
    	a237 = a336;
    	a291 = a307[(a128 - 6)];
    	a215 = 12; 
    	output = "X";
    } 
    if((((20 == a266[1]) && (a360 == 9)) && (((22 == a237[0]) && (((a337 == 7) && ((a128 == 8) && ((a212 == 10) && ((cf && input.equals(inputs[8])) && a146 == a3[4])))) && (a116.equals("f")))) && a353 == a343[1]))) {
    	cf = false;
    	a146 = a3[(a337 + -6)];
    	a56 = (((((90 * 5) - 338) / 5) * 21) / 10);
    	a127 = a29[(a360 + -9)]; 
    	output = "W";
    } 
    if((((a128 == 8) && (a146 == a3[4] && ((a116.equals("f")) && cf))) && (input.equals(inputs[4]) && (((((a283.equals("f")) && (((75 < a390) && (251 >= a390)) && (22 == a237[0]))) && a261 == a229[1]) && (a263 == 9)) && a381 == a218[1])))) {
    	cf = false;
    	a146 = a3[(a128 + -3)];
    	a349 = (((((((a279 * a279) % 14999) % 109) - -29) / 5) + -25420) + 25455);
    	a400 = ((((((a244 * a279) % 14999) % 13) - 91) - 20541) + 20530);
    	a1 = (((((a280 * a295) % 14999) + 14969) - -30) + 2);
    	a109 = ((a337 * a201) - 48);
    	a209 = "e";
    	a381 = a218[((a215 + a373) + -14)];
    	a340 = a245[((a201 + a337) + -14)]; 
    	output = "Z";
    } 
}
private  void calculateOutputm27(String input) {
    if(((((a278.equals("f")) && ((94 < a244) && (141 >= a244))) && a391 == a392[1]) && ((((cf && (a128 == 4)) && (20 == a266[1])) && ((-103 < a400) && (-75 >= a400))) && a312 == a382[1]))) {
    	calculateOutputm150(input);
    } 
    if(((a381 == a218[1] && ((((95 == a399[3]) && ((a128 == 5) && cf)) && a391 == a392[1]) && (20 == a266[1]))) && (((156 < a280) && (284 >= a280)) && a353 == a343[1]))) {
    	calculateOutputm151(input);
    } 
    if(((((((a333.equals("f")) && ((94 < a244) && (141 >= a244))) && ((105 < a279) && (221 >= a279))) && (50 == a235[3])) && ((23 < a349) && (243 >= a349))) && ((89 == a377[1]) && (cf && (a128 == 7))))) {
    	calculateOutputm152(input);
    } 
    if((((a360 == 9) && (cf && (a128 == 8))) && ((a278.equals("f")) && ((((a373 == 3) && ((-110 < a295) && (16 >= a295))) && ((75 < a390) && (251 >= a390))) && a353 == a343[1])))) {
    	calculateOutputm153(input);
    } 
}
private  void calculateOutputm161(String input) {
    if((((20 == a266[1]) && (a261 == a229[1] && ((a337 == 7) && ((a201 == 7) && ((a116.equals("g")) && (a278.equals("f"))))))) && (((a104 == a148[7] && (input.equals(inputs[0]) && cf)) && a146 == a3[4]) && (90 == a246[4])))) {
    	cf = false;
    	a109 = (a337 + -4);
    	a146 = a3[((a263 - a212) - -6)];
    	a156 = ((((8 + 64) - -23) + -25990) + 25991); 
    	output = "V";
    } 
    if(((((a373 == 3) && ((((63 == a320[2]) && (a201 == 7)) && a353 == a343[1]) && input.equals(inputs[1]))) && a340 == a245[1]) && ((a283.equals("f")) && (a146 == a3[4] && ((a116.equals("g")) && (cf && a104 == a148[7])))))) {
    	cf = false;
    	a246 = a296;
    	a285 = "e";
    	a353 = a343[(a215 + -11)];
    	a291 = a307[((a373 / a373) + 1)];
    	a146 = a3[(a263 - 2)];
    	a391 = a392[(a215 + -11)];
    	a117 = a178[((a360 / a212) - -1)];
    	a390 = (((((((a390 * a280) % 14999) % 37) + 284) + -23053) * 1) + 23023);
    	a295 = ((((a295 * a279) * 1) / 5) - 25131);
    	a261 = a229[((a212 - a263) - 1)];
    	a15 = 12;
    	a360 = (a373 + 5);
    	a310 = "e";
    	a365 = "g";
    	a340 = a245[(a373 + -3)];
    	a278 = "e";
    	a337 = ((a373 - a373) + 6);
    	a280 = (((((a280 - 21666) * 10) / 9) * 10) / 9);
    	a235 = a240;
    	a283 = "e";
    	a215 = (a212 - -2);
    	a266 = a236;
    	a377 = a204;
    	a333 = "e";
    	a312 = a382[((a337 + a337) - 12)];
    	a263 = (a201 + 1);
    	a212 = (a201 - -2);
    	a201 = (a373 - -3);
    	a373 = 2; 
    	output = "Z";
    } 
    if(((a261 == a229[1] && ((((a209.equals("f")) && ((156 < a280) && (284 >= a280))) && a104 == a148[7]) && (89 == a377[1]))) && (input.equals(inputs[6]) && ((a283.equals("f")) && ((63 == a320[2]) && ((a116.equals("g")) && (cf && a146 == a3[4]))))))) {
    	a187 -= (a187 - 20) < a187 ? 4 : 0;
    	a35 -= (a35 - 20) < a35 ? 4 : 0;
    	cf = false;
    	a365 = "g";
    	a116 = "f";
    	a128 = (a263 - 5);
    	a235 = a374;
    	a280 = ((((((a280 * a349) % 14999) + 4389) % 39) + 293) - -20);
    	a237 = a265;
    	a381 = a218[(a373 - 1)]; 
    	output = "U";
    } 
}
private  void calculateOutputm28(String input) {
    if(((((-110 < a295) && (16 >= a295)) && (cf && a104 == a148[7])) && (a391 == a392[1] && ((a209.equals("f")) && ((a310.equals("f")) && (a353 == a343[1] && (63 == a320[2]))))))) {
    	calculateOutputm161(input);
    } 
}
private  void calculateOutputm168(String input) {
    if((((a312 == a382[1] && ((a285.equals("f")) && ((a209.equals("f")) && (((156 < a280) && (284 >= a280)) && (a310.equals("f")))))) && (89 == a377[1])) && (input.equals(inputs[1]) && ((((a109 == 1) && cf) && a146 == a3[5]) && ((-194 < a1) && (-114 >= a1)))))) {
    	cf = false;
    	a365 = "g";
    	a116 = "f";
    	a280 = ((((((a280 * a279) % 14999) / 5) - -26139) % 39) - -292);
    	a235 = a374;
    	a278 = "f";
    	a146 = a3[(a263 - 5)];
    	a128 = (a201 - 3);
    	a381 = a218[((a360 + a215) - 18)]; 
    	output = "V";
    } 
    if((((((a373 == 3) && ((63 == a320[2]) && ((94 < a244) && (141 >= a244)))) && a353 == a343[1]) && (a109 == 1)) && ((((-194 < a1) && (-114 >= a1)) && ((a310.equals("f")) && ((input.equals(inputs[2]) && cf) && a146 == a3[5]))) && (a215 == 11)))) {
    	cf = false;
    	a76 = a98;
    	a146 = a3[((a109 - a263) + 14)];
    	a338 = ((a337 - a212) + 8);
    	a261 = a229[(a373 + -1)];
    	a291 = a307[((a373 - a212) - -9)];
    	a209 = "g";
    	a266 = a236;
    	a390 = ((((((a390 * a244) % 14999) % 37) + 260) * 1) * 1);
    	a235 = a374;
    	a201 = (a337 - -1);
    	a353 = a343[((a338 * a337) + -33)];
    	a399 = a269;
    	a215 = (a338 + 7);
    	a373 = (a337 + -3);
    	a360 = (a337 - -3);
    	a391 = a392[((a337 / a338) + 1)]; 
    	output = "Z";
    } 
    if((((a291 == a307[1] && ((a212 == 10) && (((-194 < a1) && (-114 >= a1)) && (((input.equals(inputs[5]) && (cf && a146 == a3[5])) && (a109 == 1)) && (a360 == 9))))) && (((a283.equals("f")) && ((-110 < a295) && (16 >= a295))) && ((23 < a349) && (243 >= a349)))) && a71 <= -25)) {
    	cf = false;
    	a146 = a3[(a212 + -7)];
    	a24 = (a337 + 1);
    	a50 = a0[((a24 - a360) + 6)]; 
    	output = "S";
    } 
    if(((a391 == a392[1] && ((90 == a246[4]) && ((20 == a266[1]) && ((a310.equals("f")) && (((input.equals(inputs[3]) && cf) && (a109 == 1)) && ((75 < a390) && (251 >= a390))))))) && (a146 == a3[5] && (((-194 < a1) && (-114 >= a1)) && (a283.equals("f")))))) {
    	cf = false;
    	a146 = a3[(a212 - 9)];
    	a209 = "e";
    	a56 = (((((a1 * a1) % 14999) + 12517) - -770) + 919);
    	a278 = "e";
    	a349 = (((((a349 * a56) % 14999) + -28717) * 1) - 266);
    	a381 = a218[(a373 - 3)];
    	a391 = a392[(a201 + -7)];
    	a291 = a307[((a360 - a109) - 8)];
    	a101 = "f";
    	a340 = a245[(a212 + -10)];
    	a365 = "e";
    	a353 = a343[(a212 + -9)]; 
    	output = "W";
    } 
}
private  void calculateOutputm169(String input) {
    if(((((-60 < a1 && ((a146 == a3[5] && cf) && (a109 == 1))) && (a360 == 9)) && (a201 == 7)) && ((((105 < a279) && (221 >= a279)) && (input.equals(inputs[8]) && ((a310.equals("f")) && a312 == a382[1]))) && (a285.equals("f"))))) {
    	cf = false;
    	a56 = (((((((a279 * a279) % 14999) % 82) + 81) / 5) + 23940) - 23795);
    	a127 = a29[(a263 - 9)];
    	a146 = a3[(a373 + -2)]; 
    	output = "W";
    } 
    if((((a215 == 11) && ((a146 == a3[5] && a353 == a343[1]) && -60 < a1)) && (((a212 == 10) && ((((105 < a279) && (221 >= a279)) && ((input.equals(inputs[4]) && cf) && (a109 == 1))) && ((75 < a390) && (251 >= a390)))) && (95 == a399[3])))) {
    	cf = false;
    	a349 = ((((((((a279 * a244) % 14999) / 5) % 109) - -39) * 5) % 109) + 56);
    	a381 = a218[((a373 * a109) + -3)];
    	a340 = a245[((a201 + a212) + -17)];
    	a209 = "e";
    	a400 = ((((((a390 * a295) % 13) + -89) / 5) + 14950) - 15031); 
    	output = "Z";
    } 
    if((((90 == a246[4]) && (a146 == a3[5] && (input.equals(inputs[9]) && ((a278.equals("f")) && (a337 == 7))))) && (a391 == a392[1] && (((a285.equals("f")) && ((cf && (a109 == 1)) && -60 < a1)) && (a283.equals("f")))))) {
    	cf = false;
    	a278 = "e";
    	a353 = a343[((a373 * a109) - 2)];
    	a56 = (((((a280 * a390) % 14999) / 5) - -7858) * 2);
    	a365 = "e";
    	a349 = (((((a244 * a56) % 14999) + -5367) - 13998) * 1);
    	a146 = a3[(a201 + -6)];
    	a101 = "f";
    	a391 = a392[(a109 + -1)];
    	a291 = a307[(a201 - 7)]; 
    	output = "X";
    } 
    if((((((input.equals(inputs[3]) && (a146 == a3[5] && cf)) && (a109 == 1)) && (89 == a377[1])) && ((75 < a390) && (251 >= a390))) && (a312 == a382[1] && (((-60 < a1 && (63 == a320[2])) && ((94 < a244) && (141 >= a244))) && ((105 < a279) && (221 >= a279)))))) {
    	cf = false;
    	a15 = ((a337 - a215) - -16);
    	a333 = "e";
    	a263 = (a109 - -7);
    	a283 = "e";
    	a280 = (((((a280 * a1) % 14999) - 14866) - 136) - 0);
    	a353 = a343[(a215 + -11)];
    	a235 = a240;
    	a146 = a3[a201];
    	a285 = "e";
    	a212 = ((a15 / a263) - -8);
    	a310 = "e";
    	a117 = a178[((a373 * a360) + -26)];
    	a365 = "g";
    	a266 = a236;
    	a312 = a382[(a212 - a360)];
    	a237 = a336;
    	a391 = a392[((a109 + a109) - 2)];
    	a390 = (((((a390 * a295) / 5) * 5) % 37) - -288);
    	a337 = (a263 - 2);
    	a295 = ((((a295 * a244) + -8086) / 5) * 5);
    	a373 = (a263 + -6);
    	a261 = a229[(a263 + -8)];
    	a246 = a296;
    	a201 = ((a109 - a337) + 11);
    	a360 = (a15 + -4);
    	a278 = "e";
    	a377 = a204;
    	a215 = a15;
    	a291 = a307[((a212 + a212) - 16)]; 
    	output = "X";
    } 
}
private  void calculateOutputm31(String input) {
    if(((((((-194 < a1) && (-114 >= a1)) && cf) && (a209.equals("f"))) && (a283.equals("f"))) && (((a381 == a218[1] && (a337 == 7)) && ((-110 < a295) && (16 >= a295))) && (a360 == 9)))) {
    	calculateOutputm168(input);
    } 
    if(((a391 == a392[1] && (a353 == a343[1] && (a312 == a382[1] && (63 == a320[2])))) && ((50 == a235[3]) && ((a201 == 7) && (-60 < a1 && cf))))) {
    	calculateOutputm169(input);
    } 
}
private  void calculateOutputm171(String input) {
    if((((22 == a237[0]) && (a391 == a392[1] && (((a113.equals("f")) && (input.equals(inputs[6]) && cf)) && a146 == a3[5]))) && ((a278.equals("f")) && ((95 == a399[3]) && (((63 == a320[2]) && ((156 < a280) && (284 >= a280))) && (a109 == 2)))))) {
    	cf = false;
    	a310 = "h";
    	a391 = a392[1];
    	a320 = a299;
    	a244 = (((((((a244 % 23) - -97) * 10) / 9) * 5) % 23) + 102);
    	a235 = a324;
    	a146 = a3[(a337 - 7)];
    	a390 = ((((a390 % 37) + 253) + 19478) + -19466);
    	a353 = a343[3];
    	a365 = "f";
    	a209 = "i";
    	a333 = "h";
    	a399 = a269;
    	a377 = a281;
    	a373 = 4;
    	a283 = "i";
    	a400 = (((((a400 + -29010) % 13) + -85) / 5) + -62);
    	a381 = a218[5];
    	a263 = 9;
    	a291 = a307[3];
    	a266 = a236;
    	a212 = 13;
    	a215 = 14;
    	a337 = 11;
    	a261 = a229[5];
    	a280 = (((((a280 * 5) / 5) * 5) % 39) - -319);
    	a278 = "f";
    	a285 = "h";
    	a237 = a328;
    	a349 = ((((82 - 14640) * 2) / 5) + 6146);
    	a17 = "f";
    	a340 = a245[4];
    	a360 = 14;
    	a201 = 7;
    	a279 = (((((a279 / 5) + -29179) / 5) * -1) / 10);
    	a312 = a382[6];
    	a152 = a2; 
    	output = "W";
    } 
    if((((((a113.equals("f")) && (((a278.equals("f")) && ((input.equals(inputs[8]) && (a146 == a3[5] && cf)) && ((75 < a390) && (251 >= a390)))) && (a109 == 2))) && (22 == a237[0])) && a381 == a218[1]) && (((105 < a279) && (221 >= a279)) && (63 == a320[2])))) {
    	cf = false;
    	a15 = a337;
    	a266 = a236;
    	a381 = a218[4];
    	a235 = a324;
    	a237 = a328;
    	a261 = a229[2];
    	a263 = 11;
    	a400 = ((((a400 % 13) + -83) * 1) + 8);
    	a283 = "i";
    	a360 = 15;
    	a399 = a269;
    	a278 = "h";
    	a373 = 3;
    	a201 = 10;
    	a279 = (((a279 - -21748) + -20055) * 5);
    	a340 = a245[6];
    	a337 = 11;
    	a377 = a281;
    	a212 = 10;
    	a246 = a332;
    	a291 = a307[5];
    	a390 = ((((((a390 % 87) + 106) + 27) / 5) * 31) / 10);
    	a353 = a343[4];
    	a320 = a299;
    	a244 = ((((a244 - -1271) - 1927) + -19889) + 20602);
    	a365 = "e";
    	a310 = "h";
    	a280 = (((((a280 % 39) - -288) * 1) - 29304) + 29340);
    	a215 = 14;
    	a391 = a392[4];
    	a285 = "g";
    	a146 = a3[((a15 / a337) + 6)];
    	a312 = a382[2];
    	a338 = (a15 + 3); 
    	output = "Y";
    } 
    if((((((a146 == a3[5] && (cf && (a109 == 2))) && (95 == a399[3])) && (a113.equals("f"))) && input.equals(inputs[5])) && ((((a291 == a307[1] && ((105 < a279) && (221 >= a279))) && a340 == a245[1]) && (89 == a377[1])) && (50 == a235[3])))) {
    	cf = false;
    	a30 = ((a109 * a212) - 7);
    	a146 = a3[(a263 - 6)];
    	a24 = ((a212 * a373) + -21); 
    	output = "Y";
    } 
    if((((((a340 == a245[1] && (((a113.equals("f")) && cf) && (a109 == 2))) && (a365.equals("f"))) && a146 == a3[5]) && ((156 < a280) && (284 >= a280))) && ((a333.equals("f")) && (a353 == a343[1] && ((a310.equals("f")) && input.equals(inputs[0])))))) {
    	a35 += (a35 + 20) > a35 ? 4 : 0;
    	cf = false;
    	a146 = a3[(a263 - 6)];
    	a103 = ((a360 * a360) - 74);
    	a24 = (a103 - -5); 
    	output = "S";
    } 
    if(((a312 == a382[1] && (a146 == a3[5] && ((22 == a237[0]) && (89 == a377[1])))) && (a261 == a229[1] && (((a109 == 2) && (((cf && input.equals(inputs[3])) && (a113.equals("f"))) && (90 == a246[4]))) && (a365.equals("f")))))) {
    	cf = false;
    	if((!(a103 == 8) || (a116.equals("f")))) {
    	a333 = "g";
    	a391 = a392[7];
    	a15 = (a201 - -5);
    	a244 = (((a244 + 25756) + -36556) - -18069);
    	a237 = a328;
    	a209 = "h";
    	a353 = a343[3];
    	a340 = a245[2];
    	a266 = a211;
    	a400 = (((a400 - -11699) + 8257) + 5482);
    	a390 = ((((a390 % 87) + 131) + -3553) + 3537);
    	a117 = a178[((a15 - a337) - -2)];
    	a360 = 15;
    	a399 = a269;
    	a320 = a217;
    	a291 = a307[2];
    	a365 = "f";
    	a381 = a218[3];
    	a337 = 10;
    	a235 = a324;
    	a146 = a3[(a212 + -3)];
    	a280 = (((a280 + 16505) / 5) + 4555);
    	a312 = a382[2];
    	a349 = ((((28 * 10) / 1) * 5) - 1069);
    	a279 = ((((a279 % 55) - -247) * 5) / 5);
    	a215 = 11;
    	a310 = "h";
    	a263 = 14;
    	a377 = a366;
    	a246 = a358;
    	a373 = 8;
    	a278 = "f";
    	a283 = "f";
    	a212 = 12;
    	a201 = 7; 
    	}else {
    	a24 = a263;
    	a30 = (a24 - -6);
    	a146 = a3[(a24 + -6)];
    	}output = "U";
    } 
    if(((((a109 == 2) && (((105 < a279) && (221 >= a279)) && (((((a113.equals("f")) && (cf && input.equals(inputs[2]))) && (a263 == 9)) && (22 == a237[0])) && (a283.equals("f"))))) && a353 == a343[1]) && ((a278.equals("f")) && a146 == a3[5]))) {
    	cf = false;
    	if((a249 == 9)) {
    	a279 = ((((((a279 % 57) + 163) - -1) * 5) % 57) - -147);
    	a215 = 14;
    	a266 = a211;
    	a400 = (((a400 - -5371) * 5) - -1000);
    	a399 = a251;
    	a365 = "g";
    	a312 = a382[2];
    	a244 = (((a244 + 28158) / 5) + -5481);
    	a349 = ((((68 * 5) * 5) - -21505) - 22865);
    	a283 = "g";
    	a285 = "g";
    	a353 = a343[1];
    	a377 = a281;
    	a237 = a265;
    	a390 = (((((a390 % 87) - -101) + -10) + -5130) + 5197);
    	a235 = a374;
    	a246 = a332;
    	a333 = "g";
    	a302 = "i";
    	a391 = a392[3];
    	a381 = a218[3];
    	a320 = a299;
    	a146 = a3[((a263 + a373) - 12)];
    	a261 = a229[5];
    	a337 = 10;
    	a340 = a245[2];
    	a360 = 12;
    	a209 = "f";
    	a373 = 7;
    	a310 = "f";
    	a278 = "h";
    	a17 = "i";
    	a201 = 11;
    	a212 = 16;
    	a291 = a307[2];
    	a263 = 9; 
    	}else {
    	a340 = a245[6];
    	a278 = "h";
    	a24 = (a109 - -4);
    	a295 = ((((26 / 5) * 249) / 10) - 6);
    	a316 = "e";
    	a146 = a3[((a24 / a201) + 3)];
    	}output = "V";
    } 
    if(((a340 == a245[1] && a312 == a382[1]) && ((((a113.equals("f")) && (((a109 == 2) && ((input.equals(inputs[1]) && (cf && a146 == a3[5])) && ((-103 < a400) && (-75 >= a400)))) && (50 == a235[3]))) && (a283.equals("f"))) && a261 == a229[1]))) {
    	cf = false;
    	if((a117 == a178[0] && (!(a310.equals("i")) && (((105 < a19) && (289 >= a19)) || (a333.equals("i")))))) {
    	a381 = a218[5];
    	a95 = "i";
    	a295 = ((((100 - 65) / 5) - -10651) + -10510);
    	a278 = "h";
    	a353 = a343[0];
    	a109 = ((a337 + a215) + -10); 
    	}else {
    	a295 = (((37 + 27483) - -1740) + 193);
    	a340 = a245[4];
    	a146 = a3[(a109 - -1)];
    	a278 = "h";
    	a316 = "e";
    	a24 = (a201 + -1);
    	}output = "S";
    } 
    if((((input.equals(inputs[9]) && ((((94 < a244) && (141 >= a244)) && (a201 == 7)) && (a109 == 2))) && (a215 == 11)) && ((((22 == a237[0]) && ((cf && a146 == a3[5]) && (a113.equals("f")))) && (a310.equals("f"))) && (50 == a235[3])))) {
    	cf = false;
    	if((!(a261 == 12) && ((a17.equals("g")) && ((a64 == 9) && ((243 < a349) && (389 >= a349)))))) {
    	a244 = (((((a244 % 23) + 95) - 0) * 10) / 9);
    	a24 = (a360 + -3);
    	a261 = a229[7];
    	a373 = 8;
    	a381 = a218[7];
    	a353 = a343[7];
    	a320 = a372;
    	a237 = a336;
    	a340 = a245[3];
    	a316 = "g";
    	a146 = a3[((a263 + a212) - 16)]; 
    	}else {
    	a215 = 12;
    	a146 = a3[a201];
    	a212 = 14;
    	a320 = a372;
    	a283 = "f";
    	a15 = (a109 + 5);
    	a261 = a229[2];
    	a399 = a251;
    	a377 = a281;
    	a340 = a245[1];
    	a390 = (((((a390 + 17029) % 87) - -122) / 5) + 121);
    	a266 = a236;
    	a201 = 10;
    	a235 = a324;
    	a337 = 9;
    	a338 = ((a373 / a263) - -10);
    	a381 = a218[6];
    	a285 = "g";
    	a365 = "e";
    	a373 = 8;
    	a278 = "g";
    	a353 = a343[7];
    	a312 = a382[3];
    	a391 = a392[2];
    	a310 = "g";
    	a237 = a265;
    	a360 = 14;
    	a246 = a332;
    	a280 = (((((a280 - 2935) % 63) + 278) * 9) / 10);
    	a279 = (((((a279 % 57) - -144) - 5) - 26274) + 26243);
    	a244 = ((((a244 + 60) / 5) * 10) / 2);
    	a400 = (((a400 - -24063) - -5708) - -158);
    	a291 = a307[5];
    	a263 = 11;
    	}output = "Z";
    } 
    if((((a285.equals("f")) && ((a215 == 11) && (a113.equals("f")))) && ((a201 == 7) && (a312 == a382[1] && ((a263 == 9) && ((((input.equals(inputs[7]) && cf) && a146 == a3[5]) && (22 == a237[0])) && (a109 == 2))))))) {
    	cf = false;
    	a353 = a343[0];
    	a373 = 9;
    	a283 = "e";
    	a237 = a336;
    	a136 = (a109 - -2);
    	a263 = 14;
    	a320 = a217;
    	a360 = 9;
    	a295 = (((((95 * -5) / 10) * 10) / 9) / 5);
    	a209 = "e";
    	a349 = (((37 * -5) - 25961) - 2985);
    	a333 = "i";
    	a365 = "i";
    	a235 = a240;
    	a337 = 13;
    	a146 = a3[(a212 + -8)];
    	a280 = (((a280 / -5) * 5) + -1927);
    	a261 = a229[3];
    	a340 = a245[4];
    	a246 = a358;
    	a266 = a221;
    	a400 = ((((a400 % 13) - 87) + -3) - -4);
    	a310 = "f";
    	a381 = a218[0];
    	a377 = a204;
    	a215 = 17;
    	a142 = a112;
    	a244 = (((a244 / 5) * 5) - 0);
    	a399 = a251;
    	a391 = a392[6];
    	a390 = ((((a390 / 5) * 5) - 27094) - -42858);
    	a285 = "f";
    	a291 = a307[1];
    	a312 = a382[5];
    	a279 = (((((a279 - 16304) - -40304) - -2086) % 57) + 144);
    	a201 = 6;
    	a278 = "h";
    	a212 = 10; 
    	output = "W";
    } 
    if((((a333.equals("f")) && ((a201 == 7) && (22 == a237[0]))) && ((a212 == 10) && ((((a113.equals("f")) && (((cf && (a109 == 2)) && input.equals(inputs[4])) && ((105 < a279) && (221 >= a279)))) && a146 == a3[5]) && (a373 == 3))))) {
    	cf = false;
    	a285 = "i";
    	a166 = (a263 - -3);
    	a244 = (((a244 / 5) + 108) + -14);
    	a312 = a382[7];
    	a280 = ((((a280 * 10) / 4) + 9110) * 3);
    	a400 = ((((a400 % 13) - 89) + -1) - 0);
    	a212 = 15;
    	a333 = "i";
    	a340 = a245[5];
    	a377 = a204;
    	a209 = "i";
    	a373 = 7;
    	a381 = a218[3];
    	a360 = 15;
    	a390 = (((((a390 % 87) - -126) - 50) / 5) - -147);
    	a201 = 6;
    	a391 = a392[6];
    	a261 = a229[1];
    	a266 = a211;
    	a237 = a336;
    	a283 = "f";
    	a349 = ((((48 + 87) + 13293) + 12073) + -25467);
    	a235 = a240;
    	a146 = a3[a109];
    	a279 = ((((((a279 * 5) * 10) / 9) + -29556) * -1) / 10);
    	a215 = 15;
    	a278 = "h";
    	a337 = 10;
    	a353 = a343[4];
    	a399 = a344;
    	a136 = (a109 + 8);
    	a291 = a307[1];
    	a295 = ((((7 / 5) + -17413) - -45734) + -28349);
    	a246 = a296;
    	a310 = "f";
    	a365 = "i";
    	a320 = a217;
    	a263 = 11; 
    	output = "S";
    } 
}
private  void calculateOutputm173(String input) {
    if(((((((156 < a280) && (284 >= a280)) && ((a310.equals("f")) && (a373 == 3))) && (a285.equals("f"))) && a261 == a229[1]) && ((90 == a246[4]) && ((a109 == 2) && ((((a113.equals("h")) && cf) && input.equals(inputs[3])) && a146 == a3[5]))))) {
    	cf = false;
    	a365 = "g";
    	a212 = (a201 - -3);
    	a349 = ((((((a295 * a280) % 14999) + -4903) + 16748) % 109) - -133);
    	a128 = ((a263 * a373) + -23);
    	a146 = a3[(a201 + -3)];
    	a237 = a265;
    	a381 = a218[(a212 + -8)];
    	a235 = a374;
    	a116 = "f";
    	a340 = a245[(a201 - 6)];
    	a377 = a366;
    	a280 = ((((((a280 * a349) % 14999) + 9126) % 39) + 308) + -9); 
    	output = "V";
    } 
    if((((a146 == a3[5] && ((a109 == 2) && cf)) && ((-110 < a295) && (16 >= a295))) && ((a373 == 3) && ((63 == a320[2]) && (((a283.equals("f")) && (input.equals(inputs[6]) && ((a201 == 7) && (a113.equals("h"))))) && ((75 < a390) && (251 >= a390))))))) {
    	cf = false;
    	a295 = ((((a295 * a244) + -1039) / 5) + -15843);
    	a15 = ((a109 + a337) - -4);
    	a146 = a3[(a109 + 5)];
    	a285 = "e";
    	a19 = (((((71 * 5) * 10) / 13) / 5) - -200);
    	a201 = (a109 + 4);
    	a278 = "e";
    	a333 = "e";
    	a320 = a217;
    	a209 = "e";
    	a360 = ((a373 * a109) - -2);
    	a312 = a382[(a212 + -9)];
    	a283 = "e";
    	a310 = "e";
    	a391 = a392[(a373 + -3)];
    	a263 = (a373 - -5); 
    	output = "S";
    } 
    if((((a312 == a382[1] && ((((((-103 < a400) && (-75 >= a400)) && a391 == a392[1]) && a146 == a3[5]) && (a113.equals("h"))) && ((156 < a280) && (284 >= a280)))) && (a201 == 7)) && ((63 == a320[2]) && ((a109 == 2) && (input.equals(inputs[8]) && cf))))) {
    	cf = false;
    	a377 = a366;
    	a146 = a3[(a360 + -5)];
    	a263 = (a109 - -6);
    	a237 = a265;
    	a212 = (a215 + -1);
    	a320 = a217;
    	a285 = "e";
    	a128 = (a109 - -3);
    	a365 = "g";
    	a116 = "f";
    	a373 = (a215 + -8);
    	a215 = (a360 + 2); 
    	output = "S";
    } 
    if((((a215 == 11) && ((a373 == 3) && (a365.equals("f")))) && (((94 < a244) && (141 >= a244)) && (((105 < a279) && (221 >= a279)) && (((a113.equals("h")) && (((input.equals(inputs[9]) && cf) && a146 == a3[5]) && (a109 == 2))) && (a278.equals("f"))))))) {
    	cf = false;
    	a116 = "f";
    	a146 = a3[((a215 * a263) - 95)];
    	a365 = "g";
    	a280 = (((((((a280 * a244) % 14999) / 5) % 39) - -322) + -25663) + 25660);
    	a235 = a374;
    	a349 = ((((((a390 * a390) % 14999) % 109) - -50) - 16789) + 16776);
    	a340 = a245[((a201 - a337) - -1)];
    	a237 = a265;
    	a128 = (a201 + -3);
    	a377 = a366;
    	a212 = (a360 - -1);
    	a381 = a218[a109]; 
    	output = "S";
    } 
}
private  void calculateOutputm32(String input) {
    if((((((cf && (a113.equals("f"))) && (50 == a235[3])) && (a337 == 7)) && (a278.equals("f"))) && (((75 < a390) && (251 >= a390)) && ((63 == a320[2]) && (89 == a377[1]))))) {
    	calculateOutputm171(input);
    } 
    if((((a353 == a343[1] && (a333.equals("f"))) && (90 == a246[4])) && ((((cf && (a113.equals("h"))) && (a373 == 3)) && ((-110 < a295) && (16 >= a295))) && ((-103 < a400) && (-75 >= a400))))) {
    	calculateOutputm173(input);
    } 
}
private  void calculateOutputm177(String input) {
    if((((a337 == 7) && (a146 == a3[5] && (((105 < a279) && (221 >= a279)) && ((input.equals(inputs[4]) && cf) && (54 == a82[0]))))) && ((a312 == a382[1] && ((a109 == 4) && (a353 == a343[1] && (90 == a246[4])))) && (22 == a237[0])))) {
    	cf = false;
    	a279 = (((((a349 * a349) % 14999) / 5) - -18070) + -21542);
    	a353 = a343[(a360 + -9)];
    	a278 = "e";
    	a246 = a296;
    	a244 = (((((a279 * a279) % 14999) - 14911) / 5) - 2751);
    	a261 = a229[((a109 + a212) + -14)];
    	a365 = "e";
    	a400 = ((((((a244 * a244) % 14999) - -6210) % 14948) + -15050) * 1);
    	a237 = a336;
    	a283 = "e";
    	a295 = (((((a295 * a280) % 14999) * 2) / 5) - 6584);
    	a146 = a3[((a360 + a373) - 5)];
    	a263 = (a360 - 1);
    	a15 = (a212 + -3);
    	a338 = a337;
    	a390 = (((((a390 * a400) % 14999) + -655) * 1) / 5);
    	a399 = a344;
    	a310 = "e";
    	a215 = (a201 - -3);
    	a340 = a245[((a263 / a201) + -1)];
    	a333 = "e";
    	a337 = ((a360 / a201) - -5);
    	a320 = a217;
    	a291 = a307[(a360 + -9)];
    	a373 = ((a201 * a201) + -47);
    	a381 = a218[((a338 + a215) + -17)];
    	a212 = a360;
    	a312 = a382[(a360 + -9)];
    	a209 = "e";
    	a360 = (a201 + 1);
    	a201 = 6; 
    	output = "S";
    } 
    if(((((75 < a390) && (251 >= a390)) && ((a146 == a3[5] && (a291 == a307[1] && a261 == a229[1])) && (a365.equals("f")))) && (((54 == a82[0]) && ((input.equals(inputs[7]) && ((a109 == 4) && cf)) && a381 == a218[1])) && a353 == a343[1]))) {
    	a192 -= (a192 - 20) < a192 ? 4 : 0;
    	cf = false;
    	a24 = (a337 - -1);
    	a399 = a269;
    	a340 = a245[(a360 / a109)];
    	a146 = a3[(a212 - 7)];
    	a285 = "g";
    	a201 = (a360 - 1);
    	a320 = a299;
    	a278 = "g";
    	a312 = a382[(a109 + -2)];
    	a261 = a229[(a215 + -9)];
    	a246 = a332;
    	a390 = ((((((a390 * a295) % 37) - -288) * 1) - -17639) + -17638);
    	a381 = a218[((a109 - a215) - -9)];
    	a50 = a0[(a373 + -3)];
    	a209 = "g";
    	a215 = (a24 + 4);
    	a295 = ((((((a295 * a400) - 10760) - 1421) - 2739) % 95) + 153); 
    	output = "W";
    } 
}
private  void calculateOutputm34(String input) {
    if(((a381 == a218[1] && ((a360 == 9) && ((23 < a349) && (243 >= a349)))) && ((((-110 < a295) && (16 >= a295)) && (((75 < a390) && (251 >= a390)) && ((54 == a82[0]) && cf))) && ((156 < a280) && (284 >= a280))))) {
    	calculateOutputm177(input);
    } 
}
private  void calculateOutputm184(String input) {
    if((((a312 == a382[1] && ((a360 == 9) && ((a209.equals("f")) && ((a283.equals("f")) && (a337 == 7))))) && a146 == a3[5]) && ((63 == a320[2]) && ((a309 == 11) && (((a109 == 6) && cf) && input.equals(inputs[9])))))) {
    	a154 -= (a154 - 20) < a154 ? 2 : 0;
    	cf = false;
    	a109 = ((a309 + a263) + -17);
    	a156 = ((((56 - 59) + -1) + 29967) - 29934); 
    	output = "W";
    } 
    if(((((cf && a146 == a3[5]) && (a109 == 6)) && ((23 < a349) && (243 >= a349))) && ((((a212 == 10) && ((((a360 == 9) && input.equals(inputs[4])) && (a309 == 11)) && (63 == a320[2]))) && (a263 == 9)) && a291 == a307[1]))) {
    	cf = false;
    	a24 = (a337 + 2);
    	a30 = ((a24 + a309) + -5);
    	a146 = a3[((a109 * a30) + -87)]; 
    	output = "Z";
    } 
    if(((((50 == a235[3]) && (((input.equals(inputs[2]) && (a212 == 10)) && (a310.equals("f"))) && ((-110 < a295) && (16 >= a295)))) && (a337 == 7)) && ((a373 == 3) && (a146 == a3[5] && (((a309 == 11) && cf) && (a109 == 6)))))) {
    	cf = false;
    	a340 = a245[2];
    	a24 = (a109 + 6);
    	a279 = ((((97 / -5) * 5) + 3749) * -5);
    	a391 = a392[7];
    	a377 = a281;
    	a237 = a265;
    	a266 = a211;
    	a103 = ((a212 / a24) + 10);
    	a280 = (((95 - -10155) / 5) + 11920);
    	a146 = a3[(a103 - 7)]; 
    	output = "S";
    } 
    if((((((23 < a349) && (243 >= a349)) && ((a309 == 11) && (a209.equals("f")))) && (a333.equals("f"))) && (((a263 == 9) && ((((a109 == 6) && (input.equals(inputs[3]) && cf)) && a146 == a3[5]) && (a283.equals("f")))) && ((-103 < a400) && (-75 >= a400))))) {
    	cf = false;
    	a116 = "g";
    	a104 = a148[(a109 + -4)];
    	a146 = a3[((a360 * a337) - 59)]; 
    	output = "Y";
    } 
    if((((a278.equals("f")) && ((input.equals(inputs[7]) && (a209.equals("f"))) && a353 == a343[1])) && (((((a333.equals("f")) && ((cf && (a309 == 11)) && (a109 == 6))) && a146 == a3[5]) && ((-110 < a295) && (16 >= a295))) && ((-103 < a400) && (-75 >= a400))))) {
    	cf = false;
    	a113 = "g";
    	a109 = (a337 - 5); 
    	output = "X";
    } 
    if((((a373 == 3) && (a312 == a382[1] && (((-110 < a295) && (16 >= a295)) && ((input.equals(inputs[6]) && ((a109 == 6) && cf)) && a353 == a343[1])))) && (a291 == a307[1] && (a146 == a3[5] && ((a309 == 11) && (a285.equals("f"))))))) {
    	cf = false;
    	a15 = (a109 - -3);
    	a146 = a3[a337];
    	a64 = a67[(a373 - -2)]; 
    	output = "Z";
    } 
    if((((a215 == 11) && (a291 == a307[1] && ((a109 == 6) && (input.equals(inputs[8]) && (a201 == 7))))) && (((a353 == a343[1] && ((cf && (a309 == 11)) && a146 == a3[5])) && (90 == a246[4])) && ((23 < a349) && (243 >= a349))))) {
    	cf = false;
    	if(((a79.equals("f")) && (a212 == 9))) {
    	a209 = "h";
    	a333 = "f";
    	a246 = a358;
    	a215 = 15;
    	a312 = a382[7];
    	a146 = a3[((a373 - a263) + 6)];
    	a353 = a343[2];
    	a263 = 14;
    	a278 = "g";
    	a381 = a218[7];
    	a244 = (((a244 - -12288) / 5) + 2661);
    	a291 = a307[1];
    	a235 = a374;
    	a237 = a328;
    	a285 = "i";
    	a373 = 5;
    	a365 = "g";
    	a400 = (((((a400 % 13) - 78) - 13548) + 28865) - 15327);
    	a320 = a372;
    	a17 = "e";
    	a390 = ((((a390 * 5) * 10) / 9) + 5982);
    	a261 = a229[7];
    	a283 = "i";
    	a349 = (((((a349 / 5) + -2041) * 5) % 109) + 157);
    	a360 = 10;
    	a295 = ((((a295 + -5993) - -6164) - 7376) - -7392);
    	a399 = a269;
    	a212 = 16;
    	a201 = 13;
    	a337 = 11;
    	a33 = a111; 
    	}else {
    	a310 = "g";
    	a278 = "f";
    	a391 = a392[5];
    	a312 = a382[7];
    	a373 = 4;
    	a279 = (((80 * 5) * 5) + -30597);
    	a246 = a332;
    	a353 = a343[1];
    	a349 = ((((a349 + 12963) % 109) + 127) - -1);
    	a266 = a236;
    	a333 = "i";
    	a237 = a265;
    	a280 = ((((45 + 247) * 1) + 6009) - 5944);
    	a309 = (a215 - -4);
    	}output = "W";
    } 
    if(((a291 == a307[1] && ((a109 == 6) && (cf && (a309 == 11)))) && (((23 < a349) && (243 >= a349)) && ((input.equals(inputs[0]) && ((a285.equals("f")) && ((a263 == 9) && (a146 == a3[5] && ((-103 < a400) && (-75 >= a400)))))) && (a310.equals("f")))))) {
    	cf = false;
    	a381 = a218[1];
    	a201 = 7;
    	a283 = "g";
    	a146 = a3[(a263 - 9)];
    	a365 = "f";
    	a215 = 12;
    	a17 = "e";
    	a337 = 7;
    	a390 = (((((((a390 % 87) - -126) * 10) / 9) * 5) % 87) - -140);
    	a291 = a307[5];
    	a373 = 6;
    	a263 = 15;
    	a360 = 13;
    	a33 = a124; 
    	output = "Z";
    } 
    if((((a283.equals("f")) && (a381 == a218[1] && ((22 == a237[0]) && ((a333.equals("f")) && ((94 < a244) && (141 >= a244)))))) && ((((a309 == 11) && ((a109 == 6) && (cf && input.equals(inputs[5])))) && a146 == a3[5]) && (a360 == 9)))) {
    	cf = false;
    	if(((86 == a142[4]) || (a104 == a148[7] || (a24 == 7)))) {
    	a15 = (a109 - -1);
    	a338 = ((a15 - a109) + 4);
    	a146 = a3[(a373 - -4)]; 
    	}else {
    	a146 = a3[(a201 + -3)];
    	a116 = "e";
    	a129 = (((18 - 14832) * 2) + -338);
    	}output = "Y";
    } 
    if((((((a263 == 9) && input.equals(inputs[1])) && (a278.equals("f"))) && ((-103 < a400) && (-75 >= a400))) && ((22 == a237[0]) && (((90 == a246[4]) && (a146 == a3[5] && ((cf && (a309 == 11)) && (a109 == 6)))) && (95 == a399[3]))))) {
    	cf = false;
    	if(((a391 == 2) && ((((a119.equals("i")) && ((60 < a129) && (94 >= a129))) || (a15 == 11)) && (a261 == 9)))) {
    	a381 = a218[0];
    	a310 = "e";
    	a399 = a344;
    	a373 = 3;
    	a377 = a204;
    	a333 = "i";
    	a295 = ((((a295 / 5) - 14106) - -27535) + -13331);
    	a136 = (a201 - 3);
    	a261 = a229[5];
    	a291 = a307[3];
    	a266 = a221;
    	a235 = a324;
    	a209 = "i";
    	a285 = "e";
    	a146 = a3[((a337 - a212) - -5)];
    	a280 = (((47 * 5) * 5) / 5);
    	a353 = a343[1];
    	a360 = 13;
    	a340 = a245[6];
    	a337 = 13;
    	a390 = ((((((a390 % 87) - -88) * 10) / 9) + -9628) - -9626);
    	a279 = ((((84 * -5) * 10) / 9) - 9879);
    	a400 = ((((((a400 * 10) / 14) * 9) / 10) * 10) / 9);
    	a215 = 13;
    	a320 = a299;
    	a391 = a392[6];
    	a212 = 15;
    	a283 = "e";
    	a263 = 14;
    	a244 = (((a244 - -23742) + -23682) + 36);
    	a142 = a92; 
    	}else {
    	a109 = a337;
    	a377 = a281;
    	a333 = "g";
    	a400 = ((((a400 * 5) % 53) - 22) + 0);
    	a209 = "f";
    	a390 = (((((a390 % 87) + 81) * 1) - -15255) + -15178);
    	a320 = a299;
    	a212 = 16;
    	a266 = a221;
    	a279 = (((((86 * 10) / 3) + 15940) / 5) + -2973);
    	a340 = a245[6];
    	a391 = a392[4];
    	a353 = a343[4];
    	a132 = a99;
    	}output = "W";
    } 
}
private  void calculateOutputm186(String input) {
    if((((((a337 == 7) && (a146 == a3[5] && (cf && input.equals(inputs[8])))) && a261 == a229[1]) && ((-103 < a400) && (-75 >= a400))) && (((((a109 == 6) && a391 == a392[1]) && (a309 == 15)) && ((156 < a280) && (284 >= a280))) && a291 == a307[1]))) {
    	cf = false;
    	a337 = a109;
    	a390 = ((((a390 * a400) - 1219) * 1) + -527);
    	a146 = a3[((a212 - a360) - 1)];
    	a381 = a218[(a373 - 2)];
    	a17 = "e";
    	a266 = a221;
    	a360 = ((a263 - a337) + 5);
    	a291 = a307[(a215 + -11)];
    	a283 = "e";
    	a215 = (a373 - -8);
    	a33 = a124;
    	a365 = "e";
    	a201 = (a373 + 4);
    	a263 = (a109 + a373); 
    	output = "W";
    } 
    if((((20 == a266[1]) && ((a209.equals("f")) && ((a215 == 11) && (a261 == a229[1] && (a109 == 6))))) && (a381 == a218[1] && ((((75 < a390) && (251 >= a390)) && (input.equals(inputs[7]) && (cf && a146 == a3[5]))) && (a309 == 15))))) {
    	cf = false;
    	a212 = ((a337 + a337) + -5);
    	a365 = "e";
    	a15 = (a263 + 4);
    	a400 = ((((a400 * a280) * 1) * 1) * 1);
    	a19 = ((((a295 * a279) * 1) * 1) + -4754);
    	a261 = a229[(a309 - 15)];
    	a209 = "f";
    	a283 = "e";
    	a391 = a392[((a337 - a15) - -6)];
    	a244 = (((((a244 * a400) % 14999) + -9250) * 1) * 1);
    	a266 = a236;
    	a263 = ((a337 - a109) - -7);
    	a381 = a218[((a201 / a109) + -1)];
    	a285 = "e";
    	a146 = a3[(a309 + -8)];
    	a320 = a217;
    	a291 = a307[(a201 + -5)];
    	a280 = (((((a400 * a390) % 14999) + -8668) * 1) / 5);
    	a235 = a240;
    	a373 = (a15 + -11);
    	a215 = (a15 + -3);
    	a201 = ((a109 + a360) + -9);
    	a360 = (a337 - -1);
    	a295 = (((((((a295 * a349) % 14999) % 14945) - 15054) - 1) / 5) + -11065);
    	a337 = ((a15 + a212) - 16); 
    	output = "S";
    } 
}
private  void calculateOutputm36(String input) {
    if((((a365.equals("f")) && ((((23 < a349) && (243 >= a349)) && ((90 == a246[4]) && (a291 == a307[1] && (22 == a237[0])))) && a381 == a218[1])) && (cf && (a309 == 11)))) {
    	calculateOutputm184(input);
    } 
    if(((((a285.equals("f")) && (((75 < a390) && (251 >= a390)) && (((105 < a279) && (221 >= a279)) && (a283.equals("f"))))) && (63 == a320[2])) && ((cf && (a309 == 15)) && ((-103 < a400) && (-75 >= a400))))) {
    	calculateOutputm186(input);
    } 
}
private  void calculateOutputm187(String input) {
    if(((((105 < a279) && (221 >= a279)) && (((a278.equals("f")) && (a340 == a245[1] && (((a109 == 7) && (a333.equals("f"))) && a146 == a3[5]))) && a312 == a382[1])) && (((cf && (43 == a132[4])) && input.equals(inputs[5])) && (a337 == 7)))) {
    	cf = false;
    	a101 = "g";
    	a146 = a3[(a212 - 9)];
    	a56 = (((11 - 16507) + 39579) - -4942); 
    	output = "V";
    } 
    if(((((156 < a280) && (284 >= a280)) && ((a360 == 9) && (input.equals(inputs[2]) && ((a365.equals("f")) && a146 == a3[5])))) && ((a337 == 7) && (((a278.equals("f")) && ((cf && (43 == a132[4])) && (a109 == 7))) && a261 == a229[1])))) {
    	a59 -= (a59 - 20) < a59 ? 1 : 0;
    	cf = false;
    	a312 = a382[((a109 / a373) - 1)];
    	a261 = a229[(a373 - 2)];
    	a266 = a211;
    	a390 = ((((a280 * a400) - 523) * 1) / 5);
    	a295 = (((((a295 * a400) + -27085) / 5) * 10) / 9);
    	a399 = a251;
    	a50 = a0[((a360 + a109) - 12)];
    	a283 = "e";
    	a146 = a3[(a201 - 4)];
    	a353 = a343[(a212 - 9)];
    	a24 = ((a215 + a109) - 10);
    	a340 = a245[(a373 - 2)]; 
    	output = "Y";
    } 
    if((((((a109 == 7) && (cf && a146 == a3[5])) && (43 == a132[4])) && a391 == a392[1]) && (((-110 < a295) && (16 >= a295)) && (((((a333.equals("f")) && input.equals(inputs[4])) && (a337 == 7)) && (a201 == 7)) && (a360 == 9))))) {
    	cf = false;
    	a278 = "g";
    	a146 = a3[(a201 - 4)];
    	a237 = a328;
    	a316 = "i";
    	a340 = a245[((a337 + a215) + -16)];
    	a312 = a382[(a360 + -7)];
    	a295 = ((((((a295 * a280) % 14999) - 2198) % 95) - -111) + 0);
    	a24 = ((a337 - a360) - -8);
    	a391 = a392[((a201 + a212) - 15)]; 
    	output = "S";
    } 
}
private  void calculateOutputm188(String input) {
    if(((((a373 == 3) && (22 == a237[0])) && (a310.equals("f"))) && (((105 < a279) && (221 >= a279)) && (((23 < a349) && (243 >= a349)) && (a381 == a218[1] && ((((cf && (a109 == 7)) && a146 == a3[5]) && input.equals(inputs[6])) && (48 == a132[3]))))))) {
    	cf = false;
    	a132 = a80; 
    	output = "Z";
    } 
    if((((a283.equals("f")) && ((input.equals(inputs[9]) && (((95 == a399[3]) && (22 == a237[0])) && (48 == a132[3]))) && ((94 < a244) && (141 >= a244)))) && (((23 < a349) && (243 >= a349)) && ((a365.equals("f")) && ((cf && (a109 == 7)) && a146 == a3[5]))))) {
    	cf = false;
    	a285 = "e";
    	a215 = (a109 - -3);
    	a235 = a240;
    	a146 = a3[(a263 - 9)];
    	a189 = "g";
    	a278 = "e";
    	a283 = "e";
    	a399 = a344;
    	a295 = ((((((a295 * a244) + -13393) - 291) - -36938) * -1) / 10);
    	a360 = ((a201 / a109) - -7);
    	a17 = "h";
    	a261 = a229[(a215 - 10)];
    	a381 = a218[((a201 + a109) - 14)];
    	a266 = a221;
    	a349 = (((((a349 * a279) % 14999) + -27348) + -143) * 1);
    	a337 = ((a360 - a212) + 7);
    	a312 = a382[(a215 - 10)];
    	a373 = (a215 + -8);
    	a291 = a307[((a263 * a201) + -63)];
    	a201 = ((a215 - a109) + 3);
    	a377 = a204;
    	a244 = ((((((a244 * a279) % 14999) - 24427) / 5) - -12784) * -2);
    	a365 = "e";
    	a263 = (a109 - -1); 
    	output = "Z";
    } 
}
private  void calculateOutputm37(String input) {
    if((((((43 == a132[4]) && cf) && (a373 == 3)) && (63 == a320[2])) && (a381 == a218[1] && (a261 == a229[1] && ((22 == a237[0]) && ((-103 < a400) && (-75 >= a400))))))) {
    	calculateOutputm187(input);
    } 
    if((((((23 < a349) && (243 >= a349)) && (cf && (48 == a132[3]))) && (a373 == 3)) && ((90 == a246[4]) && (((89 == a377[1]) && (20 == a266[1])) && ((-110 < a295) && (16 >= a295)))))) {
    	calculateOutputm188(input);
    } 
}
private  void calculateOutputm191(String input) {
    if((((a391 == a392[1] && ((((a312 == a382[1] && (a209.equals("f"))) && ((75 < a390) && (251 >= a390))) && a146 == a3[5]) && (a201 == 7))) && ((23 < a349) && (243 >= a349))) && (((input.equals(inputs[3]) && cf) && (a109 == 8)) && (a95.equals("i"))))) {
    	cf = false;
    	a340 = a245[((a360 + a201) - 16)];
    	a353 = a343[(a215 + -10)];
    	a101 = "f";
    	a56 = (((((a295 * a295) - -8743) * 10) / 9) + 4407);
    	a209 = "e";
    	a391 = a392[(a109 + -8)];
    	a365 = "e";
    	a146 = a3[((a109 - a109) + 1)];
    	a291 = a307[(a201 / a212)];
    	a349 = (((((a349 * a390) % 14999) - 29243) + -144) * 1); 
    	output = "Z";
    } 
    if((((20 == a266[1]) && (((input.equals(inputs[5]) && (cf && (a109 == 8))) && a146 == a3[5]) && (a285.equals("f")))) && (((a283.equals("f")) && ((a95.equals("i")) && (a391 == a392[1] && ((105 < a279) && (221 >= a279))))) && a312 == a382[1]))) {
    	cf = false;
    	a127 = a29[((a109 - a201) + 5)];
    	a146 = a3[((a360 - a263) - -1)];
    	a201 = (a373 + 3);
    	a278 = "g";
    	a56 = (((71 + 6390) + -6341) - -39);
    	a390 = ((((a390 * a295) / 5) + -22536) - 1571); 
    	output = "S";
    } 
}
private  void calculateOutputm38(String input) {
    if((((a360 == 9) && (a312 == a382[1] && (a310.equals("f")))) && ((a261 == a229[1] && ((cf && (a95.equals("i"))) && (95 == a399[3]))) && a340 == a245[1]))) {
    	calculateOutputm191(input);
    } 
}
private  void calculateOutputm195(String input) {
    if((((a365.equals("g")) && (((243 < a349) && (389 >= a349)) && ((141 < a244) && (256 >= a244)))) && ((((97 == a377[3]) && (a146 == a3[6] && (((a338 == 4) && (input.equals(inputs[5]) && cf)) && (96 == a76[2])))) && a312 == a382[2]) && (a337 == 8)))) {
    	cf = false;
    	a349 = (((((a349 * a279) % 14999) - 14983) - 6) + -6);
    	a261 = a229[(a338 - 4)];
    	a209 = "e";
    	a201 = (a263 + -4);
    	a266 = a221;
    	a365 = "e";
    	a320 = a217;
    	a212 = ((a201 + a263) - 7);
    	a381 = a218[((a201 + a215) - 16)];
    	a391 = a392[((a360 - a373) + -4)];
    	a312 = a382[(a201 + -6)];
    	a377 = a204;
    	a399 = a344;
    	a146 = a3[(a263 - 10)];
    	a278 = "e";
    	a17 = "g";
    	a291 = a307[((a337 + a373) + -12)];
    	a235 = a240;
    	a280 = (((((((a279 * a244) % 14999) % 39) - -323) + 2) + 2535) - 2534);
    	a263 = ((a337 + a337) - 8);
    	a353 = a343[((a201 - a215) - -4)];
    	a244 = (((((a244 * a390) % 14999) + -14981) + -4) / 5);
    	a333 = "e";
    	a373 = ((a215 / a263) + 1);
    	a246 = a296;
    	a282 = a205;
    	a337 = (a360 + -2); 
    	output = "S";
    } 
    if(((69 == a320[2]) && (a146 == a3[6] && ((a365.equals("g")) && ((a337 == 8) && ((a278.equals("g")) && (((a201 == 8) && ((input.equals(inputs[0]) && (cf && (96 == a76[2]))) && (56 == a235[3]))) && (a338 == 4)))))))) {
    	cf = false;
    	a353 = a343[(a337 / a212)];
    	a391 = a392[((a212 + a212) - 22)];
    	a312 = a382[((a337 * a360) + -64)];
    	a381 = a218[(a373 / a337)];
    	a333 = "e";
    	a399 = a344;
    	a320 = a217;
    	a15 = (a212 - 2);
    	a278 = "e";
    	a146 = a3[(a212 + -4)];
    	a261 = a229[((a212 / a201) - 1)];
    	a201 = ((a212 + a337) + -13);
    	a64 = a67[((a337 * a15) - 65)];
    	a212 = (a263 - 1); 
    	output = "U";
    } 
}
private  void calculateOutputm197(String input) {
    if(((a261 == a229[2] && ((69 == a320[2]) && input.equals(inputs[8]))) && (((a215 == 12) && (a391 == a392[2] && ((a146 == a3[6] && ((a338 == 6) && ((96 == a76[2]) && cf))) && ((251 < a390) && (326 >= a390))))) && (97 == a377[3])))) {
    	cf = false;
    	a399 = a251;
    	a246 = a358;
    	a146 = a3[((a263 + a215) - 19)];
    	a235 = a324;
    	a24 = (a263 - -2);
    	a209 = "f";
    	a103 = (a338 - -1);
    	a280 = (((((((a280 * a279) % 14999) % 63) - -196) * 5) % 63) + 160);
    	a349 = ((((((((a349 * a390) % 14999) + 10831) % 109) - -79) / 5) * 16) / 10); 
    	output = "Z";
    } 
    if(((((a391 == a392[2] && (a333.equals("g"))) && ((284 < a280) && (364 >= a280))) && (a373 == 4)) && (((((96 == a76[2]) && ((cf && a146 == a3[6]) && input.equals(inputs[1]))) && (a338 == 6)) && (a310.equals("g"))) && ((243 < a349) && (389 >= a349))))) {
    	cf = false;
    	a337 = (a263 - 4);
    	a381 = a218[(a263 - a263)];
    	a283 = "e";
    	a261 = a229[(a373 + -4)];
    	a246 = a296;
    	a390 = (((((a280 * a280) % 14999) / 5) - 17390) - 7541);
    	a377 = a204;
    	a340 = a245[(a337 - 6)];
    	a235 = a240;
    	a338 = (a201 + 3);
    	a291 = a307[(a337 - 6)];
    	a400 = (((83 + 22903) - 40669) * 1);
    	a310 = "e";
    	a320 = a217;
    	a399 = a344;
    	a391 = a392[(a337 - 6)];
    	a146 = a3[((a201 / a201) + 6)];
    	a15 = ((a338 / a338) - -6);
    	a333 = "e";
    	a266 = a236;
    	a215 = a263;
    	a360 = (a373 + 4);
    	a280 = (((((a280 * a400) % 14999) - 9758) + 29153) - 19847);
    	a349 = (((((a349 * a390) % 14999) - -7095) - 19455) - 2623);
    	a373 = (a360 - 6);
    	a278 = "e";
    	a353 = a343[(a201 - 7)];
    	a201 = ((a215 * a263) - 94);
    	a244 = ((((((a349 * a390) % 14999) % 23) - -117) + 0) - -2);
    	a263 = (a212 - 1); 
    	output = "Y";
    } 
}
private  void calculateOutputm198(String input) {
    if(((a391 == a392[2] && ((a285.equals("g")) && (input.equals(inputs[4]) && (cf && (96 == a76[2]))))) && (((251 < a390) && (326 >= a390)) && ((((a338 == 7) && (((243 < a349) && (389 >= a349)) && a146 == a3[6])) && a312 == a382[2]) && a353 == a343[2])))) {
    	cf = false;
    	if((308 < a27 || (a117 == 10))) {
    	a212 = 15;
    	a312 = a382[2];
    	a261 = a229[2];
    	a360 = 15;
    	a390 = (((a390 / 5) + 236) + 4);
    	a235 = a240;
    	a391 = a392[0];
    	a399 = a344;
    	a381 = a218[6];
    	a104 = a148[(a337 + -2)];
    	a116 = "g";
    	a310 = "i";
    	a215 = 15;
    	a279 = (((((a279 * -5) * 10) / 9) - -27866) * -1);
    	a146 = a3[(a338 - 3)]; 
    	}else {
    	a146 = a3[(a338 - 4)];
    	a24 = a338;
    	a162 = ((((39 / 5) + -68) - -27688) + -27670);
    	}output = "Z";
    } 
    if(((((a201 == 8) && ((56 == a235[3]) && (a146 == a3[6] && ((96 == a76[2]) && cf)))) && (a360 == 10)) && (((28 == a266[3]) && (((a333.equals("g")) && input.equals(inputs[9])) && (a338 == 7))) && (a373 == 4)))) {
    	cf = false;
    	a146 = a3[(a215 - 7)];
    	a155 = "i";
    	a109 = (a337 - 3); 
    	output = "Y";
    } 
    if((((a360 == 10) && ((97 == a246[5]) && ((102 == a399[4]) && (input.equals(inputs[6]) && (69 == a320[2]))))) && ((96 == a76[2]) && ((a310.equals("g")) && ((a146 == a3[6] && ((a338 == 7) && cf)) && (32 == a237[4])))))) {
    	cf = false;
    	a117 = a178[(a263 + -9)];
    	a15 = (a338 - -5);
    	a353 = a343[7];
    	a261 = a229[5];
    	a312 = a382[2];
    	a360 = 9;
    	a391 = a392[3];
    	a212 = 14;
    	a278 = "f";
    	a279 = (((((a279 % 55) - -229) * 5) % 55) - -225);
    	a295 = (((74 * 5) - -4372) - -11709);
    	a280 = (((a280 / 5) / 5) + 306);
    	a365 = "i";
    	a381 = a218[6];
    	a400 = ((((a400 - 8670) * 10) / 9) + -19286);
    	a237 = a328;
    	a244 = ((((a244 * 5) * 10) / 9) + 3951);
    	a146 = a3[((a337 + a15) + -13)];
    	a235 = a324;
    	a310 = "h";
    	a349 = (((a349 * 5) - -17168) - -10244);
    	a201 = 9;
    	a337 = 13;
    	a373 = 9;
    	a246 = a358;
    	a285 = "h";
    	a340 = a245[7];
    	a399 = a269;
    	a283 = "g";
    	a377 = a281;
    	a333 = "f";
    	a263 = 13; 
    	output = "W";
    } 
    if(((((97 == a246[5]) && ((96 == a76[2]) && (a146 == a3[6] && cf))) && (56 == a235[3])) && (((284 < a280) && (364 >= a280)) && (((a337 == 8) && (((a333.equals("g")) && (a338 == 7)) && input.equals(inputs[8]))) && (97 == a377[3]))))) {
    	cf = false;
    	if((289 < a19 && ((49 < a156) && (158 >= a156)))) {
    	a333 = "g";
    	a291 = a307[6];
    	a337 = 8;
    	a285 = "h";
    	a340 = a245[4];
    	a237 = a265;
    	a283 = "h";
    	a119 = "e";
    	a146 = a3[((a373 + a373) - 1)];
    	a15 = a263;
    	a391 = a392[4];
    	a244 = ((((a244 % 23) + 105) / 5) - -90);
    	a400 = ((((a400 - -24445) / 5) + 21220) - 26194);
    	a381 = a218[5];
    	a263 = 11;
    	a209 = "i";
    	a280 = ((((a280 - -18100) * 10) / 9) - -3385);
    	a399 = a251;
    	a215 = 17;
    	a349 = ((((a349 - 22139) + 21940) + 4501) + -4497);
    	a235 = a374;
    	a261 = a229[4];
    	a278 = "g";
    	a320 = a217;
    	a353 = a343[5];
    	a212 = 16;
    	a246 = a358;
    	a312 = a382[6];
    	a266 = a221;
    	a279 = ((((a279 * 10) / 6) * 5) * 5);
    	a360 = 11;
    	a377 = a366;
    	a201 = 11;
    	a373 = 6; 
    	}else {
    	a15 = ((a263 + a338) + -6);
    	a54 = ((((((a390 * a279) % 14999) % 106) - 58) + 78) - -3);
    	a146 = a3[((a15 / a263) - -6)];
    	}output = "Y";
    } 
    if((((a381 == a218[2] && ((a338 == 7) && ((97 == a377[3]) && ((a146 == a3[6] && cf) && input.equals(inputs[7]))))) && (a333.equals("g"))) && ((a291 == a307[2] && (((221 < a279) && (333 >= a279)) && (96 == a76[2]))) && (a283.equals("g"))))) {
    	cf = false;
    	if(244 < a88) {
    	a291 = a307[2];
    	a136 = ((a360 + a215) + -12);
    	a166 = ((a337 * a338) + -47);
    	a295 = (((74 - -12467) + 1626) / 5);
    	a279 = ((((a279 * 10) / 6) / 5) + 3670);
    	a365 = "e";
    	a146 = a3[(a166 + -7)]; 
    	}else {
    	a235 = a374;
    	a377 = a204;
    	a279 = ((((a279 + -17331) * 10) / -9) * 1);
    	a280 = ((((a280 - -20756) * 10) / 9) * 1);
    	a390 = (((((a390 + 1320) + -29037) - 1203) % 37) + 313);
    	a295 = (((81 + 13519) * 2) - -1828);
    	a109 = ((a337 * a201) + -62);
    	a246 = a332;
    	a244 = ((((a244 * 5) - -4741) * 10) / 9);
    	a312 = a382[6];
    	a353 = a343[2];
    	a215 = 13;
    	a237 = a328;
    	a113 = "f";
    	a291 = a307[6];
    	a399 = a344;
    	a373 = 5;
    	a266 = a221;
    	a349 = (((a349 - -16764) + 7265) - -5136);
    	a212 = 9;
    	a146 = a3[(a109 + 3)];
    	a391 = a392[6];
    	a360 = 12;
    	a320 = a299;
    	a365 = "e";
    	a209 = "g";
    	a263 = 12;
    	a381 = a218[3];
    	a283 = "e";
    	a333 = "h";
    	a278 = "g";
    	a201 = 6;
    	a400 = (((a400 - 8698) + -8983) * 1);
    	a285 = "e";
    	a261 = a229[4];
    	a310 = "i";
    	a340 = a245[0];
    	a337 = 8;
    	}output = "W";
    } 
    if(((((a312 == a382[2] && (97 == a246[5])) && a381 == a218[2]) && (a333.equals("g"))) && ((a291 == a307[2] && ((96 == a76[2]) && ((a146 == a3[6] && (cf && (a338 == 7))) && input.equals(inputs[1])))) && (a209.equals("g"))))) {
    	cf = false;
    	a146 = a3[((a337 - a338) - -3)];
    	a349 = (((((a349 + 24019) % 72) + 312) + -13887) - -13828);
    	a215 = 15;
    	a337 = 9;
    	a312 = a382[6];
    	a279 = (((a279 + -9638) * 3) - 530);
    	a390 = (((a390 - 11120) - 13941) * 1);
    	a360 = 12;
    	a116 = "i";
    	a280 = ((((a280 * -5) + -24987) * 10) / 9);
    	a353 = a343[4];
    	a283 = "g";
    	a237 = a328;
    	a261 = a229[0];
    	a263 = 15;
    	a320 = a217;
    	a56 = (((9 + -12059) + -8233) * 1); 
    	output = "U";
    } 
    if((((a215 == 12) && (a391 == a392[2] && ((243 < a349) && (389 >= a349)))) && (((a312 == a382[2] && ((28 == a266[3]) && (((a338 == 7) && (cf && (96 == a76[2]))) && a146 == a3[6]))) && input.equals(inputs[5])) && (32 == a237[4])))) {
    	cf = false;
    	a377 = a366;
    	a379 = ((a212 / a263) - -9);
    	a246 = a332;
    	a353 = a343[2];
    	a283 = "g";
    	a279 = (((((a279 / 5) * 25) / 10) + -13925) + 13975);
    	a280 = ((((a280 % 39) - -305) * 1) * 1);
    	a209 = "f";
    	a391 = a392[4];
    	a310 = "h";
    	a285 = "g";
    	a390 = (((((a390 % 37) + 274) / 5) + -25888) + 26089);
    	a312 = a382[1];
    	a340 = a245[1];
    	a295 = (((((49 / 5) * 10) / 9) + -20669) + 20596);
    	a373 = 5;
    	a381 = a218[6];
    	a215 = 13;
    	a235 = a374;
    	a333 = "g";
    	a146 = a3[(a360 + -3)];
    	a244 = ((((a244 % 57) - -163) / 5) - -172);
    	a15 = (a379 + 4);
    	a266 = a236;
    	a212 = 10;
    	a291 = a307[1];
    	a400 = (((((a400 * 5) * 5) / 5) % 53) - 19);
    	a349 = (((a349 / 5) / 5) + 272);
    	a237 = a265;
    	a337 = 9;
    	a263 = 9;
    	a320 = a372;
    	a399 = a269;
    	a278 = "g";
    	a360 = 9; 
    	output = "S";
    } 
    if((((a338 == 7) && ((((a353 == a343[2] && a312 == a382[2]) && a340 == a245[2]) && (a215 == 12)) && (96 == a76[2]))) && ((a278.equals("g")) && ((a146 == a3[6] && (cf && input.equals(inputs[3]))) && a381 == a218[2])))) {
    	cf = false;
    	a295 = (((8 - -16978) - 2213) + -25604);
    	a244 = (((a244 - -25249) - -1323) * 1);
    	a190 = "g";
    	a146 = a3[(a337 - 6)];
    	a365 = "i";
    	a136 = (a338 + 2); 
    	output = "W";
    } 
    if(((((input.equals(inputs[2]) && ((96 == a76[2]) && (cf && a146 == a3[6]))) && a261 == a229[2]) && (a263 == 10)) && ((a353 == a343[2] && (((a338 == 7) && (a337 == 8)) && ((243 < a349) && (389 >= a349)))) && ((-75 < a400) && (33 >= a400))))) {
    	cf = false;
    	if(((((!(a201 == 10) || (a261 == 6)) || !(a353 == a343[4])) && (a201 == 11)) && (a379 == 8))) {
    	a310 = "h";
    	a201 = 8;
    	a312 = a382[0];
    	a266 = a221;
    	a391 = a392[4];
    	a244 = (((a244 / 5) - -126) - 8);
    	a237 = a328;
    	a340 = a245[2];
    	a278 = "g";
    	a377 = a204;
    	a390 = ((((a390 - 28424) * -1) / 10) - -21888);
    	a320 = a299;
    	a400 = (((a400 / 5) - -8) / 5);
    	a279 = (((((a279 % 55) + 277) + 29061) - -78) - 29158);
    	a146 = a3[((a373 * a360) + -37)];
    	a24 = (a360 + 3);
    	a79 = "f";
    	a235 = a240;
    	a349 = (((a349 * 5) + -8212) + -12670);
    	a280 = ((((a280 + 24978) - -1787) + -16623) - 37176);
    	a381 = a218[0];
    	a212 = 10;
    	a365 = "e";
    	a246 = a332;
    	a209 = "g";
    	a263 = 13;
    	a291 = a307[6];
    	a261 = a229[7];
    	a353 = a343[4];
    	a285 = "e";
    	a399 = a344;
    	a333 = "f";
    	a283 = "g";
    	a215 = 10;
    	a337 = 10;
    	a360 = 15;
    	a373 = 3; 
    	}else {
    	a136 = ((a338 * a338) + -44);
    	a130 = a87;
    	a146 = a3[(a360 + -8)];
    	}output = "W";
    } 
    if((((69 == a320[2]) && (a381 == a218[2] && (((251 < a390) && (326 >= a390)) && ((a338 == 7) && (cf && a146 == a3[6]))))) && (((96 == a76[2]) && ((input.equals(inputs[0]) && (a263 == 10)) && ((284 < a280) && (364 >= a280)))) && ((141 < a244) && (256 >= a244))))) {
    	cf = false;
    	a146 = a3[((a373 + a215) - 16)];
    	a400 = ((((a400 / 5) - 25673) / 5) + 5050);
    	a360 = 11;
    	a302 = "h";
    	a266 = a211;
    	a377 = a281;
    	a278 = "g";
    	a381 = a218[1];
    	a390 = (((((a390 + -24809) + 26392) * 5) % 87) - -139);
    	a17 = "i";
    	a285 = "i";
    	a295 = ((((66 * 10) / 9) / 5) * 5);
    	a291 = a307[2];
    	a235 = a374;
    	a201 = 9;
    	a340 = a245[2];
    	a215 = 16; 
    	output = "V";
    } 
}
private  void calculateOutputm199(String input) {
    if(((((16 < a295) && (208 >= a295)) && (a391 == a392[2] && (((a338 == 8) && (a333.equals("g"))) && ((221 < a279) && (333 >= a279))))) && (a291 == a307[2] && (((96 == a76[2]) && (a146 == a3[6] && (cf && input.equals(inputs[3])))) && (a201 == 8))))) {
    	cf = false;
    	a310 = "f";
    	a291 = a307[(a360 - 8)];
    	a128 = (a212 + -7);
    	a261 = a229[(a360 - 8)];
    	a146 = a3[a128];
    	a390 = ((((((a390 * a280) % 14999) % 87) + 162) + -76) + -5);
    	a263 = (a215 - 3);
    	a373 = (a263 - 6);
    	a201 = ((a338 * a337) - 57);
    	a353 = a343[(a215 + -11)];
    	a209 = "f";
    	a266 = a211;
    	a116 = "f";
    	a312 = a382[((a338 * a337) - 63)];
    	a279 = ((((((a279 * a295) % 14999) - -11060) + 39) % 57) + 125);
    	a283 = "f";
    	a337 = (a215 + -5);
    	a237 = a265;
    	a391 = a392[(a215 - 11)];
    	a215 = (a360 + 2);
    	a212 = (a360 + 1);
    	a278 = "f";
    	a400 = (((((a400 * a244) * 2) - -13627) % 13) + -87);
    	a333 = "f";
    	a399 = a251;
    	a295 = (((((((a295 * a349) % 14999) % 62) + -95) / 5) - 15569) + 15518); 
    	output = "W";
    } 
    if(((((a338 == 8) && (a146 == a3[6] && ((221 < a279) && (333 >= a279)))) && ((284 < a280) && (364 >= a280))) && ((((((input.equals(inputs[2]) && cf) && (96 == a76[2])) && (a201 == 8)) && (a283.equals("g"))) && (a333.equals("g"))) && ((251 < a390) && (326 >= a390))))) {
    	cf = false;
    	a312 = a382[(a338 - 7)];
    	a201 = (a212 - 4);
    	a209 = "f";
    	a295 = (((((30 * 5) * -1) / 10) * 10) / 9);
    	a261 = a229[((a373 * a201) + -28)];
    	a278 = "g";
    	a237 = a336;
    	a353 = a343[(a201 + -7)];
    	a212 = (a215 + -2);
    	a280 = ((((((a280 * a295) % 14999) + -9613) % 63) - -219) + 0);
    	a400 = (((((a400 * a390) / 5) * 5) % 13) - 89);
    	a146 = a3[((a263 + a337) - 15)];
    	a399 = a251;
    	a365 = "f";
    	a283 = "f";
    	a50 = a0[((a338 + a338) - 14)];
    	a24 = a337;
    	a266 = a211;
    	a390 = (((((((a349 * a349) % 14999) - 11925) + 21652) * 1) % 87) - -79);
    	a285 = "e";
    	a391 = a392[((a215 / a373) + -3)];
    	a279 = ((((((a279 * a244) % 14999) + 12433) % 57) - -160) - 34);
    	a263 = ((a201 * a360) - 54);
    	a310 = "f";
    	a333 = "f";
    	a291 = a307[((a360 - a215) - -4)];
    	a337 = ((a201 / a201) + 6);
    	a235 = a324;
    	a381 = a218[(a215 + -12)];
    	a373 = (a215 - 9);
    	a215 = ((a201 * a201) + -38); 
    	output = "S";
    } 
    if((((a215 == 12) && ((input.equals(inputs[5]) && (a261 == a229[2] && ((96 == a76[2]) && ((a338 == 8) && (cf && a146 == a3[6]))))) && (a201 == 8))) && (((a337 == 8) && (32 == a237[4])) && (a373 == 4)))) {
    	cf = false;
    	a215 = ((a263 - a338) - -9);
    	a390 = (((((((a390 * a280) % 14999) - -13662) * 1) / 5) % 87) + 80);
    	a291 = a307[(a263 - 9)];
    	a261 = a229[((a373 / a201) - -1)];
    	a237 = a265;
    	a353 = a343[(a212 - 10)];
    	a295 = (((((((a295 * a280) % 14999) - -3640) * 1) * 1) % 62) - 61);
    	a209 = "f";
    	a128 = (a338 + -5);
    	a279 = (((((a279 * a400) % 57) + 164) / 5) + 86);
    	a116 = "f";
    	a283 = "f";
    	a310 = "f";
    	a146 = a3[(a128 + 1)];
    	a312 = a382[(a338 - 7)]; 
    	output = "T";
    } 
}
private  void calculateOutputm200(String input) {
    if(((input.equals(inputs[3]) && ((a360 == 10) && ((a373 == 4) && ((97 == a246[5]) && (28 == a266[3]))))) && ((a365.equals("g")) && (a146 == a3[6] && (((cf && (a338 == 10)) && (96 == a76[2])) && (a209.equals("g"))))))) {
    	cf = false;
    	a360 = (a337 - -1);
    	a201 = ((a360 + a360) - 11);
    	a295 = ((((((a400 * a280) % 14999) + 15318) + 2100) % 62) + -73);
    	a399 = a251;
    	a285 = "f";
    	a128 = (a337 + -4);
    	a349 = (((((((a349 * a280) % 14999) % 109) - -72) * 5) % 109) - -106);
    	a146 = a3[((a212 - a215) + 5)];
    	a381 = a218[(a360 + -7)];
    	a212 = a338;
    	a377 = a366;
    	a373 = (a201 - 4);
    	a244 = ((((((a244 * a390) % 14999) + 14809) % 23) - -117) + 2);
    	a215 = (a337 - -3);
    	a310 = "f";
    	a246 = a358;
    	a390 = ((((((a280 * a279) % 14999) / 5) / 5) % 87) + 100);
    	a266 = a211;
    	a261 = a229[(a128 + -3)];
    	a209 = "f";
    	a291 = a307[(a360 - 8)];
    	a116 = "f";
    	a391 = a392[(a337 + -7)];
    	a340 = a245[((a128 + a128) - 7)];
    	a353 = a343[(a201 + -6)];
    	a237 = a265;
    	a278 = "f";
    	a333 = "f";
    	a263 = ((a337 - a337) + 9);
    	a312 = a382[((a337 * a360) + -71)];
    	a337 = (a263 - 2); 
    	output = "S";
    } 
    if(((((284 < a280) && (364 >= a280)) && ((102 == a399[4]) && (96 == a76[2]))) && ((a146 == a3[6] && ((97 == a246[5]) && ((((cf && input.equals(inputs[0])) && (a338 == 10)) && (32 == a237[4])) && (a373 == 4)))) && ((251 < a390) && (326 >= a390))))) {
    	cf = false;
    	a291 = a307[(a338 - 9)];
    	a353 = a343[(a215 - 11)];
    	a365 = "f";
    	a280 = ((((((((a280 * a244) % 14999) % 63) + 165) * 10) / 9) - -14544) - 14532);
    	a285 = "f";
    	a109 = (a201 + -4);
    	a201 = ((a215 + a338) - 15);
    	a373 = (a360 - 7);
    	a146 = a3[((a212 * a212) - 116)];
    	a340 = a245[(a337 - 7)];
    	a82 = a18;
    	a312 = a382[(a212 + -10)];
    	a215 = a212;
    	a337 = a201;
    	a261 = a229[((a201 / a360) - -1)];
    	a360 = (a212 - 2); 
    	output = "S";
    } 
    if((((a146 == a3[6] && (a312 == a382[2] && (((a285.equals("g")) && ((cf && (96 == a76[2])) && input.equals(inputs[4]))) && (28 == a266[3])))) && ((251 < a390) && (326 >= a390))) && (((243 < a349) && (389 >= a349)) && ((a333.equals("g")) && (a338 == 10))))) {
    	cf = false;
    	a117 = a178[(a338 - 9)];
    	a212 = (a337 - -1);
    	a244 = ((((((((a244 * a349) % 14999) - -12854) % 23) - -95) * 5) % 23) + 95);
    	a261 = a229[(a212 + -9)];
    	a246 = a296;
    	a333 = "e";
    	a15 = (a337 - -4);
    	a278 = "e";
    	a283 = "e";
    	a373 = ((a337 * a215) + -94);
    	a391 = a392[(a215 - 12)];
    	a312 = a382[((a337 + a337) - 16)];
    	a353 = a343[(a337 + -8)];
    	a146 = a3[((a360 * a201) + -73)];
    	a360 = (a212 + -1);
    	a285 = "e";
    	a201 = ((a263 * a215) - 90);
    	a235 = a240;
    	a340 = a245[((a373 - a212) - -7)];
    	a349 = (((((((a280 * a390) % 14999) - 21966) % 109) - -141) * 10) / 9);
    	a237 = a336;
    	a399 = a251;
    	a337 = (a215 - 6);
    	a381 = a218[(a215 - 12)];
    	a280 = (((((a280 * a390) % 14999) / 5) + -7166) * 4); 
    	output = "X";
    } 
}
private  void calculateOutputm40(String input) {
    if((((a333.equals("g")) && (cf && (a338 == 4))) && (((a312 == a382[2] && (((141 < a244) && (256 >= a244)) && (a212 == 11))) && a381 == a218[2]) && (a283.equals("g"))))) {
    	calculateOutputm195(input);
    } 
    if((((28 == a266[3]) && ((((97 == a246[5]) && (a360 == 10)) && a391 == a392[2]) && ((243 < a349) && (389 >= a349)))) && ((cf && (a338 == 6)) && (a209.equals("g"))))) {
    	calculateOutputm197(input);
    } 
    if(((((((a310.equals("g")) && (102 == a399[4])) && (a209.equals("g"))) && a391 == a392[2]) && ((141 < a244) && (256 >= a244))) && (((221 < a279) && (333 >= a279)) && ((a338 == 7) && cf)))) {
    	calculateOutputm198(input);
    } 
    if((((a263 == 10) && (cf && (a338 == 8))) && (((a312 == a382[2] && ((a310.equals("g")) && (a333.equals("g")))) && ((-75 < a400) && (33 >= a400))) && ((221 < a279) && (333 >= a279))))) {
    	calculateOutputm199(input);
    } 
    if((((a278.equals("g")) && (cf && (a338 == 10))) && ((((a337 == 8) && (a340 == a245[2] && (32 == a237[4]))) && (a212 == 11)) && ((141 < a244) && (256 >= a244))))) {
    	calculateOutputm200(input);
    } 
}
private  void calculateOutputm201(String input) {
    if(((((a283.equals("g")) && (a391 == a392[2] && ((a278.equals("g")) && (a215 == 12)))) && a146 == a3[6]) && ((28 == a266[3]) && (((104 == a76[4]) && ((input.equals(inputs[0]) && cf) && ((-113 < a193) && (-80 >= a193)))) && (97 == a246[5]))))) {
    	cf = false;
    	a56 = (((((a193 * a193) % 82) + 64) + 2716) + -2706);
    	a127 = a29[7];
    	a146 = a3[(a263 - 9)]; 
    	output = "Y";
    } 
    if(((((32 == a237[4]) && ((56 == a235[3]) && ((a310.equals("g")) && ((((104 == a76[4]) && (input.equals(inputs[2]) && cf)) && a146 == a3[6]) && ((-113 < a193) && (-80 >= a193)))))) && (a209.equals("g"))) && (((251 < a390) && (326 >= a390)) && (102 == a399[4])))) {
    	cf = false;
    	a15 = ((a201 - a263) - -9);
    	a146 = a3[(a337 + -1)];
    	a338 = (a212 - 6); 
    	output = "W";
    } 
    if(((((104 == a76[4]) && ((a337 == 8) && ((((-113 < a193) && (-80 >= a193)) && cf) && a146 == a3[6]))) && (a373 == 4)) && ((((16 < a295) && (208 >= a295)) && ((input.equals(inputs[3]) && (102 == a399[4])) && (56 == a235[3]))) && (a278.equals("g"))))) {
    	cf = false;
    	a116 = "g";
    	a146 = a3[4];
    	a104 = a148[(a201 + -6)]; 
    	output = "W";
    } 
    if((((a215 == 12) && (((97 == a377[3]) && ((251 < a390) && (326 >= a390))) && (a285.equals("g")))) && (((a278.equals("g")) && (((((-113 < a193) && (-80 >= a193)) && ((104 == a76[4]) && cf)) && a146 == a3[6]) && input.equals(inputs[4]))) && ((-75 < a400) && (33 >= a400))))) {
    	cf = false;
    	a136 = ((a373 * a337) + -25);
    	a391 = a392[5];
    	a235 = a374;
    	a312 = a382[0];
    	a340 = a245[3];
    	a146 = a3[(a215 + -10)];
    	a400 = ((((a400 + 11371) * -1) / 10) + -4079);
    	a353 = a343[2];
    	a320 = a217;
    	a309 = (a212 + -1);
    	a349 = ((((a349 - -10586) - 3407) % 72) + 277);
    	a237 = a265;
    	a373 = 6; 
    	output = "W";
    } 
    if((((a212 == 11) && ((97 == a377[3]) && (((a285.equals("g")) && ((284 < a280) && (364 >= a280))) && a146 == a3[6]))) && (((28 == a266[3]) && ((((-113 < a193) && (-80 >= a193)) && ((104 == a76[4]) && cf)) && input.equals(inputs[9]))) && (a283.equals("g"))))) {
    	cf = false;
    	a146 = a3[((a212 * a212) - 119)];
    	a249 = ((a373 * a201) - 26);
    	a136 = (a249 + -3); 
    	output = "W";
    } 
    if(((((a146 == a3[6] && (((243 < a349) && (389 >= a349)) && (a201 == 8))) && a381 == a218[2]) && (a360 == 10)) && (((16 < a295) && (208 >= a295)) && ((a312 == a382[2] && ((((-113 < a193) && (-80 >= a193)) && cf) && input.equals(inputs[5]))) && (104 == a76[4]))))) {
    	cf = false;
    	a237 = a336;
    	a291 = a307[4];
    	a360 = 10;
    	a246 = a332;
    	a24 = (a263 + 1);
    	a279 = ((((a279 + -5) % 55) - -250) - -13);
    	a235 = a240;
    	a1 = ((((((a193 * a193) + -29219) - 5105) / 5) % 26) - 71);
    	a337 = 10;
    	a353 = a343[0];
    	a349 = (((((a349 % 72) + 252) - -27132) / 5) - 5206);
    	a146 = a3[(a215 + -9)];
    	a244 = ((((a244 * 10) / 5) - -1787) / 5);
    	a365 = "h";
    	a261 = a229[5];
    	a333 = "e";
    	a400 = (((((a400 % 53) + -19) - 2) + -11528) + 11529);
    	a312 = a382[6];
    	a263 = 10; 
    	output = "W";
    } 
    if((((32 == a237[4]) && (((a201 == 8) && ((a365.equals("g")) && ((input.equals(inputs[8]) && (cf && ((-113 < a193) && (-80 >= a193)))) && (104 == a76[4])))) && (28 == a266[3]))) && ((a391 == a392[2] && a146 == a3[6]) && a261 == a229[2]))) {
    	cf = false;
    	a50 = a0[(a263 - 5)];
    	a360 = 11;
    	a291 = a307[2];
    	a399 = a344;
    	a24 = ((a215 + a337) - 12);
    	a390 = ((((a390 / -5) * 10) / 9) + -6541);
    	a235 = a374;
    	a400 = (((a400 * 5) - 28583) + -857);
    	a373 = 8;
    	a146 = a3[(a337 + -5)];
    	a320 = a217;
    	a349 = (((a349 * -5) / 5) / 5);
    	a261 = a229[2];
    	a365 = "i";
    	a263 = 10;
    	a266 = a236;
    	a279 = (((a279 - -5735) * 4) + -51820);
    	a337 = 9; 
    	output = "U";
    } 
    if(((((a209.equals("g")) && ((104 == a76[4]) && (a146 == a3[6] && ((a310.equals("g")) && (97 == a377[3]))))) && (a333.equals("g"))) && (((input.equals(inputs[6]) && (cf && ((-113 < a193) && (-80 >= a193)))) && ((16 < a295) && (208 >= a295))) && (a212 == 11)))) {
    	cf = false;
    	a193 = ((((a193 * a400) - -15866) - -276) * 1); 
    	output = "X";
    } 
    if(((((243 < a349) && (389 >= a349)) && (69 == a320[2])) && ((a209.equals("g")) && (((141 < a244) && (256 >= a244)) && (a146 == a3[6] && (input.equals(inputs[1]) && ((((104 == a76[4]) && (cf && ((-113 < a193) && (-80 >= a193)))) && a261 == a229[2]) && (a373 == 4)))))))) {
    	cf = false;
    	a146 = a3[(a360 + -8)];
    	a249 = (a337 - 3);
    	a136 = (a360 - 7); 
    	output = "X";
    } 
    if(((a261 == a229[2] && (((((cf && ((-113 < a193) && (-80 >= a193))) && a146 == a3[6]) && a391 == a392[2]) && a381 == a218[2]) && (a201 == 8))) && ((((104 == a76[4]) && (28 == a266[3])) && input.equals(inputs[7])) && ((141 < a244) && (256 >= a244))))) {
    	cf = false;
    	a325 = "h";
    	a116 = "h";
    	a146 = a3[(a201 - 4)]; 
    	output = "T";
    } 
}
private  void calculateOutputm41(String input) {
    if(((((a337 == 8) && (a365.equals("g"))) && (32 == a237[4])) && (((251 < a390) && (326 >= a390)) && (a291 == a307[2] && ((((-113 < a193) && (-80 >= a193)) && cf) && a381 == a218[2]))))) {
    	calculateOutputm201(input);
    } 
}
private  void calculateOutputm204(String input) {
    if(((a381 == a218[0] && ((a333.equals("e")) && ((a283.equals("e")) && (a400 <=  -103 && (a285.equals("e")))))) && (((a338 == 4) && (((a146 == a3[7] && cf) && (a15 == 7)) && input.equals(inputs[5]))) && (56 == a320[1])))) {
    	cf = false;
    	a399 = a344;
    	a280 = ((((((a400 * a349) % 14999) % 39) + 323) * 1) + 0);
    	a244 = (((((a244 * a349) % 14999) + -7620) + -7339) - 7);
    	a246 = a296;
    	a333 = "e";
    	a17 = "g";
    	a146 = a3[((a360 * a201) + -48)];
    	a353 = a343[(a15 + -7)];
    	a283 = "g";
    	a373 = ((a212 * a215) - 88);
    	a282 = a205; 
    	output = "S";
    } 
    if((((input.equals(inputs[0]) && ((a15 == 7) && cf)) && (a263 == 8)) && ((a338 == 4) && (((a340 == a245[0] && ((90 == a399[4]) && ((20 == a237[4]) && (a310.equals("e"))))) && a146 == a3[7]) && a400 <=  -103)))) {
    	cf = false;
    	a15 = ((a373 * a212) - 9);
    	a64 = a67[(a215 - 3)]; 
    	output = "U";
    } 
}
private  void calculateOutputm207(String input) {
    if((((a278.equals("e")) && (a353 == a343[0] && (input.equals(inputs[4]) && ((a338 == 7) && ((a15 == 7) && (cf && a146 == a3[7])))))) && ((((90 == a399[4]) && (a337 == 6)) && a312 == a382[0]) && a244 <=  94))) {
    	cf = false;
    	a310 = "g";
    	a167 = a360;
    	a246 = a332;
    	a353 = a343[((a201 / a167) + 2)];
    	a209 = "g";
    	a285 = "g";
    	a283 = "g";
    	a337 = a167;
    	a333 = "g";
    	a349 = (((((((a295 * a295) % 14999) % 72) + 296) / 5) * 45) / 10);
    	a280 = ((((((a279 * a279) % 14999) % 39) + 323) - 0) - 0);
    	a235 = a240;
    	a261 = a229[(a167 + -6)];
    	a146 = a3[((a338 + a338) - 12)];
    	a340 = a245[(a15 + -5)];
    	a381 = a218[(a337 - 6)];
    	a136 = (a212 + -1);
    	a212 = (a263 + 3);
    	a320 = a299;
    	a390 = (((((((a390 * a349) % 14999) - 523) % 37) - -289) + 4400) - 4399);
    	a201 = ((a15 - a15) + 8);
    	a400 = (((((((a400 * a349) % 14999) % 53) + -20) - 2) + -16423) - -16424);
    	a278 = "g";
    	a263 = ((a338 + a215) - 7);
    	a399 = a269;
    	a215 = (a167 - -4);
    	a266 = a236;
    	a377 = a281;
    	a244 = ((((((a244 * a280) % 14999) / 5) - 7614) % 57) - -240);
    	a365 = "g";
    	a391 = a392[(a15 + -7)];
    	a295 = ((((((a295 * a279) % 14999) * 2) % 95) + 112) - -2); 
    	output = "Z";
    } 
    if((((a201 == 6) && ((56 == a320[1]) && (a400 <=  -103 && (((a212 == 9) && a295 <=  -110) && input.equals(inputs[5]))))) && ((((cf && (a338 == 7)) && a146 == a3[7]) && (a15 == 7)) && a390 <=  75))) {
    	cf = false;
    	a279 = (((((((a349 * a280) % 14999) % 57) - -139) + 7) * 9) / 10);
    	a24 = ((a215 - a201) - -2);
    	a261 = a229[(a24 - 5)];
    	a263 = (a360 + 1);
    	a283 = "f";
    	a295 = ((((((((a279 * a349) % 14999) + 8523) % 62) - 53) * 5) % 62) + -45);
    	a400 = (((((((a400 * a279) % 14999) % 13) - 87) / 5) * 51) / 10);
    	a201 = a15;
    	a399 = a251;
    	a310 = "f";
    	a291 = a307[((a24 * a215) + -59)];
    	a353 = a343[(a212 + -8)];
    	a316 = "e";
    	a209 = "f";
    	a373 = (a215 - 7);
    	a246 = a358;
    	a244 = ((((((a244 * a279) % 14999) - 12040) % 23) - -118) - 1);
    	a237 = a265;
    	a146 = a3[(a337 + -3)];
    	a360 = a263;
    	a390 = ((((((a390 * a295) % 14999) % 87) - -162) * 1) - 0);
    	a312 = a382[(a24 - 5)];
    	a337 = a338;
    	a320 = a372;
    	a365 = "f";
    	a333 = "f";
    	a381 = a218[(a201 - 6)];
    	a212 = ((a373 + a215) + -3);
    	a215 = ((a263 - a263) - -11); 
    	output = "S";
    } 
    if(((((cf && input.equals(inputs[7])) && a146 == a3[7]) && (a283.equals("e"))) && (a400 <=  -103 && (((a278.equals("e")) && ((a333.equals("e")) && ((a310.equals("e")) && ((a338 == 7) && a279 <=  105)))) && (a15 == 7))))) {
    	cf = false;
    	a146 = a3[(a212 - 6)];
    	a263 = (a360 - -1);
    	a261 = a229[((a201 + a360) + -13)];
    	a24 = (a360 - 2);
    	a237 = a265;
    	a337 = ((a263 / a263) + 6);
    	a212 = ((a360 * a338) + -46);
    	a353 = a343[((a15 * a263) - 62)];
    	a246 = a358;
    	a209 = "f";
    	a316 = "h";
    	a215 = ((a337 / a263) - -11);
    	a279 = (((((((a279 * a295) % 14999) % 57) + 163) / 5) * 51) / 10);
    	a390 = (((((((a390 * a295) % 14999) / 5) / 5) + -9644) % 87) + 239);
    	a312 = a382[(a338 - 6)];
    	a333 = "f";
    	a201 = (a215 - 4);
    	a399 = a251;
    	a310 = "f";
    	a365 = "f";
    	a400 = ((((((((a400 * a349) % 14999) % 13) + -89) + 2) * 5) % 13) - 79);
    	a340 = a245[(a360 + -7)]; 
    	output = "S";
    } 
}
private  void calculateOutputm209(String input) {
    if((((a390 <=  75 && a312 == a382[0]) && (a310.equals("e"))) && (((a212 == 9) && ((41 == a235[0]) && (input.equals(inputs[5]) && (a146 == a3[7] && ((a338 == 9) && ((a15 == 7) && cf)))))) && a279 <=  105))) {
    	cf = false;
    	a360 = ((a263 * a263) - 55);
    	a209 = "f";
    	a50 = a0[((a338 * a15) - 56)];
    	a377 = a366;
    	a283 = "e";
    	a215 = (a360 - -3);
    	a390 = (((((((a390 * a280) % 14999) % 87) + 163) - 18593) + -4444) + 23037);
    	a295 = (((((((a295 * a280) % 14999) / 5) + 27222) / 5) % 62) + -74);
    	a353 = a343[(a360 + -8)];
    	a24 = (a337 + 2);
    	a279 = ((((((a279 * a349) % 14999) * 2) * 1) % 57) + 164);
    	a349 = ((((((a244 * a400) % 14999) * 2) % 109) + 133) * 1);
    	a337 = (a263 - 1);
    	a399 = a251;
    	a261 = a229[(a263 - 7)];
    	a146 = a3[((a201 + a263) + -11)];
    	a201 = (a263 + -1);
    	a246 = a296;
    	a291 = a307[(a212 - 8)];
    	a235 = a324;
    	a212 = (a360 + 1);
    	a244 = (((((((a244 * a390) % 14999) % 23) + 118) + -3387) - -10369) + -6981);
    	a310 = "f";
    	a333 = "f";
    	a320 = a372;
    	a373 = (a360 - 6);
    	a381 = a218[(a360 + -9)];
    	a263 = (a373 + 6); 
    	output = "U";
    } 
    if((((90 == a399[4]) && (a338 == 9)) && (a295 <=  -110 && (a349 <=  23 && ((a285.equals("e")) && (a146 == a3[7] && (a244 <=  94 && (((a15 == 7) && (cf && input.equals(inputs[6]))) && (a209.equals("e")))))))))) {
    	cf = false;
    	a19 = ((((((a244 * a244) % 14999) + 11953) * 1) % 14855) - -15144);
    	a15 = (a337 + 7); 
    	output = "X";
    } 
    if((((input.equals(inputs[7]) && (((a146 == a3[7] && (a263 == 8)) && (a360 == 8)) && (a310.equals("e")))) && (a278.equals("e"))) && ((((cf && (a338 == 9)) && (a15 == 7)) && (82 == a246[2])) && (85 == a377[3])))) {
    	cf = false;
    	a212 = (a360 + 2);
    	a263 = a338;
    	a283 = "f";
    	a337 = ((a15 / a15) - -6);
    	a235 = a374;
    	a399 = a251;
    	a391 = a392[(a360 + -7)];
    	a373 = (a15 + -4);
    	a365 = "g";
    	a310 = "f";
    	a237 = a265;
    	a128 = (a15 + -3);
    	a244 = (((((((a390 * a349) % 14999) / 5) % 23) + 117) + -9362) - -9362);
    	a215 = (a360 + 3);
    	a209 = "f";
    	a116 = "f";
    	a278 = "f";
    	a340 = a245[(a15 + -6)];
    	a295 = (((((((a295 * a244) % 14999) % 62) + -46) * 5) % 62) + -46);
    	a353 = a343[(a337 - 6)];
    	a261 = a229[(a215 - 10)];
    	a320 = a372;
    	a146 = a3[(a360 - 4)];
    	a377 = a366;
    	a312 = a382[((a263 + a215) + -19)];
    	a291 = a307[(a360 - 7)];
    	a279 = (((((((a279 * a390) % 14999) % 57) - -163) * 1) + -9725) + 9726);
    	a381 = a218[(a360 + -6)];
    	a349 = ((((((a349 * a390) % 14999) + -5916) / 5) % 109) + 133);
    	a285 = "f";
    	a333 = "f";
    	a201 = a15;
    	a390 = (((((((a390 * a279) % 14999) - -9470) + 1807) - -3600) % 87) + 164);
    	a280 = (((((a400 * a400) / 5) % 39) + 295) + -9);
    	a246 = a358;
    	a360 = (a337 + 2); 
    	output = "T";
    } 
    if(((((a15 == 7) && (56 == a320[1])) && (a360 == 8)) && ((((a338 == 9) && (((a310.equals("e")) && (a146 == a3[7] && (cf && input.equals(inputs[2])))) && (a333.equals("e")))) && a312 == a382[0]) && a353 == a343[0]))) {
    	cf = false;
    	a279 = (((((((a279 * a390) % 14999) - -7230) + 4839) - 19339) % 57) + 162);
    	a266 = a236;
    	a117 = a178[((a212 * a212) - 80)];
    	a365 = "g";
    	a15 = (a373 - -10);
    	a280 = ((((((a295 * a390) % 14999) * 2) % 15078) - 14921) * 1);
    	a399 = a251;
    	a291 = a307[(a337 - 4)];
    	a349 = (((((((a349 * a244) % 14999) % 109) + 134) - 2) / 5) + 175);
    	a244 = (((((((a244 * a280) % 14999) + 6054) % 23) + 117) - 23418) + 23418);
    	a390 = (((((((a390 * a295) % 14999) % 37) - -289) - 1) + -26186) + 26187); 
    	output = "Z";
    } 
}
private  void calculateOutputm210(String input) {
    if((((a201 == 6) && ((a15 == 7) && a291 == a307[0])) && (a295 <=  -110 && (((82 == a246[2]) && (input.equals(inputs[9]) && ((((a338 == 10) && cf) && a146 == a3[7]) && a391 == a392[0]))) && (41 == a235[0]))))) {
    	cf = false;
    	a146 = a3[(a201 - 4)];
    	a333 = "e";
    	a212 = (a201 - -5);
    	a278 = "g";
    	a246 = a332;
    	a400 = ((((((a244 * a244) % 14999) / 5) % 53) + -19) / 5);
    	a391 = a392[(a360 + -6)];
    	a136 = a263;
    	a340 = a245[(a338 + -8)];
    	a337 = (a212 - 3);
    	a390 = (((((((a390 * a400) % 14999) % 37) - -289) + -1) - -15122) - 15120);
    	a295 = ((((((a295 * a280) % 14999) % 95) - -111) + 0) * 1);
    	a209 = "f";
    	a167 = (a215 - a136);
    	a201 = ((a373 / a360) - -8);
    	a291 = a307[((a15 - a360) + 3)];
    	a381 = a218[(a373 - 2)];
    	a235 = a374;
    	a261 = a229[(a337 - 6)];
    	a320 = a299;
    	a377 = a281;
    	a349 = ((((((a390 * a244) % 14999) - -11757) / 5) % 109) - -133);
    	a266 = a236;
    	a399 = a269;
    	a280 = ((((((a390 * a390) % 14999) + 3401) * 1) % 39) - -305);
    	a237 = a328;
    	a215 = (a212 - -1);
    	a263 = (a373 + 4);
    	a285 = "g";
    	a310 = "g";
    	a312 = a382[(a337 + -6)];
    	a244 = ((((((a244 * a279) % 14999) - -11782) % 57) + 199) + -1);
    	a360 = (a373 - -6); 
    	output = "U";
    } 
    if(((((85 == a377[3]) && ((a15 == 7) && ((a338 == 10) && (input.equals(inputs[0]) && (a146 == a3[7] && cf))))) && a280 <=  156) && ((a390 <=  75 && ((a360 == 8) && (82 == a246[2]))) && (a310.equals("e"))))) {
    	cf = false;
    	a302 = "h";
    	a17 = "i";
    	a146 = a3[(a263 - 8)]; 
    	output = "W";
    } 
}
private  void calculateOutputm211(String input) {
    if(((a381 == a218[0] && ((90 == a399[4]) && (a146 == a3[7] && (cf && (a15 == 7))))) && ((a349 <=  23 && (input.equals(inputs[5]) && (((a338 == 11) && (a310.equals("e"))) && (a215 == 10)))) && (85 == a377[3])))) {
    	cf = false;
    	a156 = ((((((a400 * a390) % 14999) % 14920) + 15078) * 1) - 0);
    	a320 = a372;
    	a237 = a265;
    	a109 = (a337 + -3);
    	a333 = "f";
    	a360 = (a337 + 3);
    	a201 = (a215 + -3);
    	a291 = a307[(a263 - 7)];
    	a261 = a229[(a263 + -7)];
    	a312 = a382[((a109 - a212) - -7)];
    	a146 = a3[(a212 + -4)];
    	a246 = a358;
    	a373 = (a338 + -8);
    	a391 = a392[(a215 - 9)]; 
    	output = "V";
    } 
    if(((a312 == a382[0] && (a391 == a392[0] && ((a338 == 11) && ((((cf && a146 == a3[7]) && input.equals(inputs[2])) && (90 == a399[4])) && (a263 == 8))))) && ((56 == a320[1]) && ((a15 == 7) && a349 <=  23)))) {
    	a187 += (a187 + 20) > a187 ? 1 : 0;
    	cf = false;
    	a291 = a307[(a337 - 4)];
    	a365 = "g";
    	a285 = "e";
    	a117 = a178[((a338 * a263) - 87)];
    	a15 = ((a201 - a360) + 14);
    	a215 = ((a373 + a212) + 1);
    	a399 = a251;
    	a353 = a343[0];
    	a349 = (((((((a349 * a400) % 14999) * 2) % 109) - -134) - -4641) + -4641);
    	a295 = (((((a390 * a390) % 14999) / 5) + -19964) + -6381);
    	a400 = ((((((a400 * a390) % 14999) - -14388) + 593) % 13) + -87);
    	a390 = (((((((a390 * a280) % 14999) * 2) % 37) - -288) / 5) - -204); 
    	output = "V";
    } 
    if(((((((a283.equals("e")) && a146 == a3[7]) && (a338 == 11)) && a340 == a245[0]) && a312 == a382[0]) && ((a263 == 8) && (a291 == a307[0] && (((cf && (a15 == 7)) && input.equals(inputs[8])) && (a333.equals("e"))))))) {
    	cf = false;
    	a117 = a178[((a212 - a373) - 6)];
    	a295 = (((((a390 * a280) % 14999) + 2108) / 5) - 13750);
    	a349 = ((((((a349 * a390) % 14999) * 2) % 109) + 132) * 1);
    	a400 = ((((((a400 * a295) % 14999) % 13) + -100) * 5) / 5);
    	a285 = "e";
    	a365 = "g";
    	a291 = a307[(a338 + -9)];
    	a15 = ((a215 - a373) + 4);
    	a215 = ((a338 / a337) - -11);
    	a399 = a251;
    	a353 = a343[((a201 + a263) + -14)];
    	a390 = (((((((a390 * a280) % 14999) % 37) - -289) * 1) - 21078) - -21078); 
    	output = "W";
    } 
}
private  void calculateOutputm42(String input) {
    if(((a400 <=  -103 && ((a338 == 4) && cf)) && (((a285.equals("e")) && (((a278.equals("e")) && a244 <=  94) && (82 == a246[2]))) && (20 == a237[4])))) {
    	calculateOutputm204(input);
    } 
    if((((cf && (a338 == 7)) && a400 <=  -103) && (((((a209.equals("e")) && a381 == a218[0]) && a390 <=  75) && (a365.equals("e"))) && a291 == a307[0]))) {
    	calculateOutputm207(input);
    } 
    if((((41 == a235[0]) && (a353 == a343[0] && ((a360 == 8) && ((a338 == 9) && cf)))) && (((a310.equals("e")) && (a263 == 8)) && a340 == a245[0]))) {
    	calculateOutputm209(input);
    } 
    if((((a263 == 8) && ((a244 <=  94 && (56 == a320[1])) && (a360 == 8))) && ((((a338 == 10) && cf) && (a201 == 6)) && (a212 == 9)))) {
    	calculateOutputm210(input);
    } 
    if(((((a215 == 10) && (a333.equals("e"))) && (41 == a235[0])) && (a280 <=  156 && (a261 == a229[0] && ((a337 == 6) && ((a338 == 11) && cf)))))) {
    	calculateOutputm211(input);
    } 
}
private  void calculateOutputm217(String input) {
    if((((((a15 == 9) && (a146 == a3[7] && (cf && a64 == a67[1]))) && input.equals(inputs[0])) && a353 == a343[0]) && ((a365.equals("e")) && ((a212 == 9) && ((a285.equals("e")) && ((85 == a377[3]) && (a278.equals("e")))))))) {
    	cf = false;
    	if((a340 == a245[3] || (((a127 == 5) && !(a340 == a245[1])) || !(20 == a266[1])))) {
    	a15 = (a212 + -2);
    	a338 = ((a215 + a373) + -7); 
    	}else {
    	a237 = a336;
    	a146 = a3[(a212 + -6)];
    	a244 = ((((a244 % 15047) - 14952) * 1) - 2);
    	a349 = ((((a349 % 15011) - 14987) * 1) - 1);
    	a24 = (a15 - -2);
    	a353 = a343[7];
    	a365 = "i";
    	a291 = a307[6];
    	a246 = a296;
    	a360 = 12;
    	a235 = a374;
    	a337 = 8;
    	a261 = a229[4];
    	a400 = ((((a400 / 5) * 5) % 14948) + -103);
    	a312 = a382[0];
    	a263 = 14;
    	a1 = (((((51 * 5) * -3) / 10) * 9) / 10);
    	}output = "T";
    } 
    if(((a353 == a343[0] && ((((a201 == 6) && a146 == a3[7]) && a381 == a218[0]) && (a263 == 8))) && (a312 == a382[0] && ((a64 == a67[1] && ((cf && (a15 == 9)) && input.equals(inputs[9]))) && a390 <=  75)))) {
    	cf = false;
    	a209 = "f";
    	a285 = "i";
    	a215 = 16;
    	a136 = (a15 - 5);
    	a365 = "h";
    	a201 = 6;
    	a212 = 16;
    	a266 = a221;
    	a310 = "e";
    	a349 = ((((a349 % 14805) + 15194) - 0) + 1);
    	a400 = (((((a400 % 13) + -84) + -3) * 9) / 10);
    	a340 = a245[4];
    	a381 = a218[7];
    	a278 = "f";
    	a377 = a204;
    	a312 = a382[5];
    	a244 = ((((a244 % 15047) + -14952) - 1) - 0);
    	a279 = ((((35 - -3238) - 18169) * -1) / 10);
    	a399 = a251;
    	a360 = 12;
    	a390 = (((((a390 % 87) + 162) / 5) / 5) + 159);
    	a283 = "h";
    	a261 = a229[0];
    	a353 = a343[5];
    	a280 = ((((a280 % 15078) + -14921) - 1) + -1);
    	a320 = a217;
    	a146 = a3[(a136 - 2)];
    	a391 = a392[3];
    	a373 = 8;
    	a246 = a296;
    	a235 = a240;
    	a237 = a265;
    	a291 = a307[1];
    	a263 = 11;
    	a333 = "i";
    	a337 = 7;
    	a142 = a112; 
    	output = "Z";
    } 
    if(((((a310.equals("e")) && ((input.equals(inputs[7]) && ((a64 == a67[1] && (((a15 == 9) && cf) && a146 == a3[7])) && (a263 == 8))) && (a278.equals("e")))) && (a209.equals("e"))) && (a291 == a307[0] && (41 == a235[0])))) {
    	cf = false;
    	a365 = "i";
    	a244 = (((((a244 / 5) - 6519) - 15133) % 57) + 242);
    	a237 = a328;
    	a235 = a374;
    	a279 = ((((23 + 160) + 22744) + -41975) - -19181);
    	a285 = "h";
    	a209 = "e";
    	a212 = 10;
    	a201 = 6;
    	a310 = "i";
    	a337 = 12;
    	a390 = (((a390 * 1) - 0) * 1);
    	a320 = a217;
    	a278 = "h";
    	a146 = a3[a373];
    	a312 = a382[4];
    	a400 = ((((((a400 % 13) + -77) - -2) / 5) * 59) / 10);
    	a360 = 14;
    	a246 = a296;
    	a373 = 9;
    	a353 = a343[6];
    	a399 = a344;
    	a136 = (a215 - 4);
    	a333 = "e";
    	a283 = "h";
    	a340 = a245[0];
    	a381 = a218[5];
    	a349 = ((((a349 - -5415) * 1) % 109) - -132);
    	a391 = a392[1];
    	a280 = ((((a280 % 15078) + -14921) / 5) / 5);
    	a215 = 10;
    	a263 = 11;
    	a377 = a204;
    	a266 = a211;
    	a291 = a307[5];
    	a261 = a229[1];
    	a180 = (((((85 * 18) / 10) - -10245) * 2) + -20573); 
    	output = "T";
    } 
    if((((a353 == a343[0] && (((input.equals(inputs[3]) && ((a15 == 9) && cf)) && a64 == a67[1]) && (a283.equals("e")))) && (a278.equals("e"))) && (a400 <=  -103 && (((a365.equals("e")) && (20 == a237[4])) && a146 == a3[7])))) {
    	cf = false;
    	a50 = a0[(a201 + -6)];
    	a209 = "e";
    	a244 = ((((a244 * 1) - 0) / 5) + 13399);
    	a266 = a236;
    	a285 = "f";
    	a353 = a343[2];
    	a373 = 4;
    	a340 = a245[6];
    	a215 = 13;
    	a349 = (((((a349 - -22691) * 1) - 8133) % 14805) - -15194);
    	a146 = a3[(a15 - 6)];
    	a246 = a296;
    	a24 = ((a360 * a360) + -56);
    	a381 = a218[4];
    	a377 = a281;
    	a399 = a251;
    	a235 = a374;
    	a391 = a392[0];
    	a263 = 14;
    	a261 = a229[0];
    	a212 = 12;
    	a310 = "h";
    	a320 = a217;
    	a312 = a382[1];
    	a390 = ((((((a390 * 1) % 87) + 162) * 5) % 87) + 118);
    	a291 = a307[3];
    	a400 = (((((a400 % 53) + 30) * 5) % 53) + -19);
    	a337 = 6;
    	a360 = 12;
    	a278 = "f";
    	a365 = "g";
    	a201 = 13; 
    	output = "U";
    } 
    if((((((a64 == a67[1] && cf) && a146 == a3[7]) && (a15 == 9)) && input.equals(inputs[4])) && ((18 == a266[5]) && ((a353 == a343[0] && (((a285.equals("e")) && a244 <=  94) && a390 <=  75)) && a280 <=  156)))) {
    	cf = false;
    	a381 = a218[1];
    	a136 = (a212 + -2);
    	a309 = (a337 - -9);
    	a377 = a366;
    	a365 = "h";
    	a283 = "h";
    	a237 = a265;
    	a278 = "h";
    	a246 = a296;
    	a291 = a307[1];
    	a285 = "h";
    	a261 = a229[1];
    	a310 = "h";
    	a146 = a3[a373];
    	a333 = "f";
    	a280 = (((a280 / 5) + -11061) / 5);
    	a373 = 9;
    	a266 = a211;
    	a215 = 16;
    	a337 = 12; 
    	output = "T";
    } 
    if((((((a146 == a3[7] && a280 <=  156) && a391 == a392[0]) && a390 <=  75) && (a278.equals("e"))) && (((a373 == 2) && ((a15 == 9) && ((a64 == a67[1] && cf) && input.equals(inputs[8])))) && a261 == a229[0]))) {
    	cf = false;
    	a333 = "i";
    	a295 = ((((24 / 5) + 5963) * 5) + -29920);
    	a379 = (a337 - -3);
    	a279 = ((((26 + 111) / 5) - -14040) + -13877);
    	a15 = (a212 - -5); 
    	output = "W";
    } 
    if(((a349 <=  23 && ((41 == a235[0]) && ((56 == a320[1]) && (a64 == a67[1] && a340 == a245[0])))) && (((((cf && input.equals(inputs[5])) && a146 == a3[7]) && (a15 == 9)) && a381 == a218[0]) && a291 == a307[0]))) {
    	cf = false;
    	if((!(102 == a399[4]) && (((!(a177 == 2) || a146 == a3[2]) && (a365.equals("e"))) || cf))) {
    	a24 = (a263 - -4);
    	a146 = a3[((a360 - a263) + 3)];
    	a103 = a337; 
    	}else {
    	a379 = (a212 + -2);
    	a15 = ((a212 + a373) - -3);
    	}output = "X";
    } 
    if(((((a64 == a67[1] && (input.equals(inputs[1]) && (cf && (a15 == 9)))) && (a360 == 8)) && a291 == a307[0]) && (((((a365.equals("e")) && a146 == a3[7]) && a312 == a382[0]) && (82 == a246[2])) && a391 == a392[0]))) {
    	cf = false;
    	if(((a133.equals("f")) || (a117 == 10))) {
    	a246 = a296;
    	a333 = "e";
    	a146 = a3[a373];
    	a215 = 11;
    	a278 = "h";
    	a399 = a251;
    	a373 = 5;
    	a391 = a392[1];
    	a291 = a307[6];
    	a283 = "e";
    	a244 = ((((((a244 % 57) + 199) - 1) * 5) % 57) + 197);
    	a349 = (((((a349 % 109) - -134) / 5) - -5529) + -5501);
    	a279 = (((34 * 5) - -14241) + -36114);
    	a340 = a245[5];
    	a310 = "f";
    	a266 = a211;
    	a360 = 13;
    	a237 = a265;
    	a377 = a366;
    	a381 = a218[1];
    	a201 = 9;
    	a212 = 13;
    	a261 = a229[0];
    	a390 = ((((a390 / 5) / 5) % 87) + 162);
    	a280 = ((((a280 + 22586) % 15078) - 14921) - 1);
    	a312 = a382[1];
    	a285 = "h";
    	a400 = (((a400 * 1) - -22915) + 7151);
    	a337 = 11;
    	a136 = (a15 - 3);
    	a353 = a343[4];
    	a235 = a240;
    	a263 = 11;
    	a209 = "i";
    	a365 = "h";
    	a320 = a372;
    	a180 = ((((21 - -132) / 5) * 49) / 10); 
    	}else {
    	a24 = (a215 + 1);
    	a146 = a3[((a201 - a337) - -3)];
    	a1 = ((((77 * -26) / 10) * 5) - 5310);
    	}output = "Z";
    } 
    if(((a400 <=  -103 && (a353 == a343[0] && (((a64 == a67[1] && ((a146 == a3[7] && cf) && input.equals(inputs[2]))) && (a215 == 10)) && (a360 == 8)))) && (((a263 == 8) && (a15 == 9)) && a312 == a382[0]))) {
    	cf = false;
    	a136 = ((a15 / a263) + 7);
    	a167 = (a212 + -4);
    	a146 = a3[(a212 + -7)]; 
    	output = "Z";
    } 
    if(((a391 == a392[0] && (((a360 == 8) && (((a15 == 9) && ((a64 == a67[1] && cf) && a146 == a3[7])) && a291 == a307[0])) && (90 == a399[4]))) && (a280 <=  156 && (a353 == a343[0] && input.equals(inputs[6]))))) {
    	cf = false;
    	if((!(a79.equals("i")) && ((cf || ((94 < a244) && (141 >= a244))) || !(a340 == 12)))) {
    	a283 = "g";
    	a235 = a324;
    	a15 = (a201 + 7);
    	a333 = "g";
    	a337 = 6;
    	a19 = (((((((a400 * a390) % 14999) + 4126) / 5) + -10692) % 45) + 78);
    	a244 = ((((a244 * 1) % 15047) + -14952) / 5);
    	a295 = (((86 - -24) * 5) - 441);
    	a279 = ((((55 * 10) / 1) - -12525) / 5);
    	a390 = (((((a390 % 15037) - 14961) + 7511) + 21978) - 29490);
    	a266 = a221;
    	a377 = a366;
    	a209 = "i";
    	a400 = ((((a400 * 1) % 53) + -15) / 5); 
    	}else {
    	a381 = a218[3];
    	a391 = a392[0];
    	a365 = "h";
    	a377 = a366;
    	a209 = "h";
    	a244 = ((((a244 * 1) % 15047) - 14952) * 1);
    	a295 = ((((49 - 8372) + 8278) * 10) / 9);
    	a310 = "h";
    	a309 = (a212 - -5);
    	a291 = a307[7];
    	a278 = "f";
    	a235 = a240;
    	a400 = (((((a400 % 14948) - 103) * 1) * 10) / 9);
    	a312 = a382[5];
    	a353 = a343[6];
    	a146 = a3[(a309 - 12)];
    	a349 = ((((a349 % 72) + 317) + 15235) - 15234);
    	a279 = (((((87 * 5) * 5) + -23436) * -1) / 10);
    	a136 = ((a360 * a263) + -57);
    	a340 = a245[3];
    	a333 = "e";
    	a201 = 11;
    	a263 = 11;
    	a283 = "e";
    	a390 = (((a390 * 1) * 1) * 1);
    	a373 = 6;
    	a215 = 15;
    	a285 = "e";
    	a337 = 6;
    	a266 = a221;
    	a320 = a299;
    	a261 = a229[3];
    	a399 = a344;
    	a280 = ((((a280 % 15078) + -14921) - 1) + -1);
    	a360 = 9;
    	}output = "W";
    } 
}
private  void calculateOutputm218(String input) {
    if(((input.equals(inputs[9]) && (((41 == a235[0]) && (((cf && (a15 == 9)) && a146 == a3[7]) && (a212 == 9))) && a64 == a67[3])) && (((a391 == a392[0] && (a360 == 8)) && (a283.equals("e"))) && (90 == a399[4])))) {
    	cf = false;
    	a360 = (a215 - 2);
    	a312 = a382[((a15 + a215) + -19)];
    	a244 = ((((((a244 * a390) % 14999) % 23) - -118) * 1) - -1);
    	a310 = "f";
    	a283 = "f";
    	a237 = a265;
    	a209 = "f";
    	a349 = (((((((a279 * a279) % 14999) % 109) - -35) * 5) % 109) + 125);
    	a400 = (((((((a279 * a279) % 14999) % 13) + -93) + -1) / 5) + -80);
    	a201 = ((a215 - a215) - -7);
    	a353 = a343[((a360 + a263) + -16)];
    	a261 = a229[(a215 + -10)];
    	a128 = ((a263 - a212) + 5);
    	a285 = "f";
    	a116 = "f";
    	a295 = (((((((a349 * a279) % 14999) / 5) % 62) + -63) * 10) / 9);
    	a235 = a374;
    	a291 = a307[(a360 + -8)];
    	a146 = a3[((a373 / a373) + 3)];
    	a390 = (((((((a295 * a280) % 14999) % 87) + 163) + -1) / 5) - -113);
    	a333 = "f";
    	a340 = a245[((a201 - a373) - 4)];
    	a373 = ((a215 / a263) - -2);
    	a381 = a218[((a215 - a263) - 1)];
    	a337 = (a263 - 1);
    	a212 = ((a215 - a215) + 10);
    	a246 = a358;
    	a320 = a372;
    	a377 = a366;
    	a266 = a211;
    	a280 = (((((((a280 * a400) % 14999) * 2) * 1) + 3) % 39) + 324);
    	a278 = "f";
    	a391 = a392[(a215 + -10)];
    	a399 = a251;
    	a263 = a360; 
    	output = "S";
    } 
    if(((((a381 == a218[0] && (41 == a235[0])) && (a278.equals("e"))) && (a337 == 6)) && ((((a212 == 9) && (a391 == a392[0] && ((input.equals(inputs[6]) && cf) && a64 == a67[3]))) && a146 == a3[7]) && (a15 == 9)))) {
    	cf = false;
    	a19 = (((((((a280 * a244) % 14999) * 2) / 5) / 5) % 91) + 197);
    	a15 = (a360 - -5); 
    	output = "S";
    } 
    if((((a353 == a343[0] && (((input.equals(inputs[3]) && cf) && a64 == a67[3]) && (a360 == 8))) && (a15 == 9)) && ((((a291 == a307[0] && (18 == a266[5])) && a146 == a3[7]) && a340 == a245[0]) && a400 <=  -103))) {
    	cf = false;
    	a349 = (((((((a400 * a400) % 14999) % 109) - -40) + 56) * 9) / 10);
    	a377 = a366;
    	a360 = (a201 - -3);
    	a244 = ((((((a349 * a400) % 14999) % 23) + 117) + 28798) - 28797);
    	a128 = ((a201 * a373) - 8);
    	a116 = "f";
    	a353 = a343[(a212 + -8)];
    	a209 = "f";
    	a390 = (((((((a390 * a244) % 14999) % 87) + 164) * 1) - 16206) - -16205);
    	a278 = "f";
    	a312 = a382[(a360 + -8)];
    	a212 = (a201 + 4);
    	a291 = a307[(a360 + -8)];
    	a266 = a211;
    	a391 = a392[(a201 - 5)];
    	a285 = "f";
    	a295 = (((((((a400 * a400) % 14999) - 10816) + -1442) / 5) % 62) - 46);
    	a337 = ((a15 * a15) - 74);
    	a310 = "f";
    	a235 = a374;
    	a381 = a218[(a360 + -7)];
    	a280 = (((((((a280 * a349) % 14999) / 5) * 5) / 5) % 39) - -325);
    	a320 = a372;
    	a246 = a358;
    	a146 = a3[(a263 + -4)];
    	a263 = a360;
    	a373 = (a15 + -6);
    	a237 = a265;
    	a261 = a229[(a215 + -10)];
    	a201 = ((a360 / a128) - -5);
    	a399 = a251;
    	a333 = "f";
    	a400 = (((((((a400 * a279) % 14999) % 13) - 88) - 1) / 5) - 79);
    	a283 = "f";
    	a340 = a245[(a360 - 8)]; 
    	output = "V";
    } 
    if((((a285.equals("e")) && (((input.equals(inputs[8]) && (a146 == a3[7] && cf)) && a261 == a229[0]) && a391 == a392[0])) && (((a212 == 9) && (((a263 == 8) && a64 == a67[3]) && (a15 == 9))) && (41 == a235[0])))) {
    	cf = false;
    	if((!(a64 == a67[0]) || ((a283.equals("i")) && a146 == a3[0]))) {
    	a295 = (((((92 + -187) * 10) / 9) * 9) / 10);
    	a235 = a324;
    	a333 = "f";
    	a337 = (a201 - -1);
    	a209 = "f";
    	a310 = "f";
    	a146 = a3[(a212 + -5)];
    	a353 = a343[(a263 + -7)];
    	a212 = (a337 + 3);
    	a391 = a392[(a201 - 5)];
    	a237 = a265;
    	a128 = (a360 + -3);
    	a278 = "f";
    	a390 = ((((((((a390 * a400) % 14999) % 87) - -162) + 2) * 5) % 87) - -85);
    	a399 = a251;
    	a312 = a382[((a201 - a337) - -2)];
    	a377 = a366;
    	a283 = "f";
    	a215 = (a212 + 1);
    	a261 = a229[(a201 - 5)];
    	a246 = a358;
    	a381 = a218[(a360 - 7)];
    	a400 = ((((((a244 * a295) % 14999) % 13) + -88) - -14394) - 14393);
    	a201 = (a360 - 1);
    	a373 = (a201 - 4);
    	a266 = a211;
    	a280 = ((((((a280 * a279) % 14999) % 63) - -221) + 1) + -1);
    	a365 = "g";
    	a244 = ((((((a295 * a279) % 23) + 118) / 5) - -25466) + -25379);
    	a291 = a307[(a15 - 8)];
    	a116 = "f";
    	a360 = ((a337 * a337) + -40); 
    	}else {
    	a278 = "f";
    	a246 = a358;
    	a295 = ((((((a279 * a279) % 14999) + -2825) % 62) + -47) + 1);
    	a209 = "f";
    	a353 = a343[(a373 - 1)];
    	a280 = (((((((a390 * a244) % 14999) % 63) - -220) * 1) + -16794) + 16795);
    	a381 = a218[((a373 - a373) + 1)];
    	a109 = (a15 - 7);
    	a291 = a307[(a373 - 1)];
    	a333 = "f";
    	a399 = a251;
    	a400 = (((((((a400 * a295) % 14999) % 13) - 87) * 5) % 13) - 86);
    	a390 = ((((((a390 * a280) % 14999) % 87) + 163) - -2) + -2);
    	a146 = a3[(a360 - 3)];
    	a310 = "f";
    	a337 = ((a201 / a373) + 4);
    	a312 = a382[(a15 + -8)];
    	a285 = "f";
    	a201 = ((a373 + a15) - 4);
    	a283 = "f";
    	a261 = a229[((a373 - a337) - -6)];
    	a360 = a212;
    	a320 = a372;
    	a113 = "h";
    	a263 = a15;
    	a365 = "f";
    	a391 = a392[(a215 - 10)];
    	a244 = ((((((a280 * a280) % 14999) + 1489) % 23) - -113) - -3);
    	a266 = a211;
    	a235 = a324;
    	a373 = (a263 - 6);
    	}output = "S";
    } 
}
private  void calculateOutputm44(String input) {
    if(((((a64 == a67[1] && cf) && (41 == a235[0])) && a349 <=  23) && ((a278.equals("e")) && ((a310.equals("e")) && (a244 <=  94 && (a365.equals("e"))))))) {
    	calculateOutputm217(input);
    } 
    if((((a312 == a382[0] && ((a261 == a229[0] && (cf && a64 == a67[3])) && a391 == a392[0])) && (a337 == 6)) && ((82 == a246[2]) && (90 == a399[4])))) {
    	calculateOutputm218(input);
    } 
}
private  void calculateOutputm222(String input) {
    if((((((a244 <=  94 && ((a119.equals("e")) && ((a15 == 10) && (41 == a235[0])))) && (a365.equals("e"))) && (a209.equals("e"))) && a400 <=  -103) && ((a212 == 9) && ((input.equals(inputs[6]) && cf) && a146 == a3[7])))) {
    	cf = false;
    	a381 = a218[((a263 + a360) - 15)];
    	a146 = a3[(a337 + -3)];
    	a209 = "f";
    	a30 = ((a360 / a263) + 8);
    	a399 = a251;
    	a400 = ((((((a244 * a280) % 14999) * 2) % 13) - 89) - 1);
    	a291 = a307[((a337 / a212) - -1)];
    	a310 = "e";
    	a312 = a382[(a201 - 6)];
    	a353 = a343[((a212 / a263) + -1)];
    	a24 = (a373 - -7);
    	a365 = "f";
    	a237 = a265;
    	a278 = "e";
    	a349 = (((((((a349 * a400) % 14999) / 5) * 5) / 5) % 109) + 134);
    	a360 = (a201 + 3);
    	a373 = (a212 - 7);
    	a337 = (a15 - 3);
    	a340 = a245[(a212 / a212)];
    	a390 = ((((((a244 * a400) % 14999) + -14945) - 55) + 17588) - 17521);
    	a377 = a204;
    	a246 = a358;
    	a235 = a324;
    	a201 = (a263 + -1);
    	a263 = a212;
    	a285 = "f";
    	a212 = a15; 
    	output = "X";
    } 
    if((((a337 == 6) && ((a365.equals("e")) && (a312 == a382[0] && a349 <=  23))) && (((a201 == 6) && (((a119.equals("e")) && ((cf && input.equals(inputs[0])) && (a15 == 10))) && a146 == a3[7])) && a381 == a218[0]))) {
    	cf = false;
    	a109 = ((a360 - a212) - -3);
    	a291 = a307[(a373 + -1)];
    	a146 = a3[(a263 + -3)];
    	a209 = "f";
    	a360 = (a201 - -3);
    	a365 = "f";
    	a113 = "e";
    	a285 = "f";
    	a201 = ((a109 - a15) - -15);
    	a399 = a251;
    	a246 = a358;
    	a400 = (((((((a400 * a244) % 14999) * 2) + -3) / 5) % 13) - 87); 
    	output = "W";
    } 
}
private  void calculateOutputm223(String input) {
    if((((((a263 == 8) && (56 == a320[1])) && a261 == a229[0]) && (a337 == 6)) && ((a365.equals("e")) && ((((a146 == a3[7] && (input.equals(inputs[5]) && cf)) && (a119.equals("g"))) && a391 == a392[0]) && (a15 == 10))))) {
    	cf = false;
    	if((!cf || ((a263 == 12) || (a136 == 7)))) {
    	a295 = (((((93 + -88) * 9) / 10) * 10) / 9);
    	a310 = "f";
    	a365 = "f";
    	a381 = a218[((a212 * a337) + -54)];
    	a279 = (((((((a279 * a295) % 14999) * 2) - 0) / 5) % 57) - -162);
    	a399 = a251;
    	a390 = (((((a295 * a295) % 87) + 162) + 22183) + -22182);
    	a235 = a324;
    	a320 = a372;
    	a201 = ((a212 - a15) - -8);
    	a261 = a229[(a212 + -8)];
    	a283 = "e";
    	a353 = a343[(a263 - 7)];
    	a50 = a0[(a337 - -1)];
    	a246 = a296;
    	a400 = ((((((a295 * a295) + 18022) - -88) - -4) % 13) - 88);
    	a24 = ((a360 + a212) + -9);
    	a209 = "f";
    	a244 = (((((a390 * a400) / 5) * 5) % 23) + 120);
    	a146 = a3[(a24 - 5)];
    	a337 = ((a215 / a360) - -6);
    	a263 = (a15 - 1);
    	a349 = ((((((a349 * a295) % 14999) % 109) - -133) + -14559) + 14559);
    	a280 = ((((((a280 * a244) % 14999) % 63) - -220) - 1) - 0);
    	a215 = ((a15 / a15) - -11);
    	a360 = (a373 - -7);
    	a333 = "f";
    	a373 = (a212 + -6);
    	a212 = ((a201 - a15) + 13); 
    	}else {
    	a279 = ((((((a279 * a400) % 14999) * 2) % 55) - -276) + 0);
    	a209 = "f";
    	a399 = a269;
    	a390 = ((((((((a279 * a279) % 14999) % 37) + 289) * 5) + 12858) % 37) + 263);
    	a249 = ((a15 * a360) - 69);
    	a215 = (a263 - -4);
    	a146 = a3[((a15 - a15) + 2)];
    	a349 = ((((((a349 * a279) % 14999) * 2) / 5) % 72) + 315);
    	a337 = ((a215 / a373) - -2);
    	a360 = ((a201 + a373) + 2);
    	a278 = "g";
    	a353 = a343[(a201 + -4)];
    	a285 = "g";
    	a246 = a332;
    	a261 = a229[((a263 * a373) + -14)];
    	a244 = (((((((a244 * a390) % 14999) % 57) - -198) + 2) / 5) - -120);
    	a340 = a245[(a263 + -6)];
    	a237 = a328;
    	a312 = a382[(a263 - 6)];
    	a377 = a281;
    	a136 = (a201 + -3);
    	a266 = a236;
    	a381 = a218[(a212 + -7)];
    	a280 = ((((((a280 * a295) % 14999) * 2) + -3) % 39) + 323);
    	a391 = a392[(a201 - 4)];
    	a365 = "g";
    	a295 = ((((((a295 * a400) % 14999) - 13432) % 95) - -112) - -1);
    	a201 = ((a373 * a373) - -4);
    	a263 = (a373 - -8);
    	a333 = "g";
    	a235 = a374;
    	a373 = 4;
    	a400 = ((((((a400 * a279) % 14999) - 2438) % 13) + -85) + -1);
    	}output = "U";
    } 
    if(((((a261 == a229[0] && ((a365.equals("e")) && (a390 <=  75 && ((cf && input.equals(inputs[6])) && (a119.equals("g")))))) && (a333.equals("e"))) && (a15 == 10)) && (((a263 == 8) && (a201 == 6)) && a146 == a3[7]))) {
    	cf = false;
    	a15 = (a212 + 4);
    	a19 = ((((((a400 * a349) % 14999) / 5) - -11831) * 10) / 9); 
    	output = "X";
    } 
    if(((((((a337 == 6) && a312 == a382[0]) && (a209.equals("e"))) && a353 == a343[0]) && a244 <=  94) && ((41 == a235[0]) && ((((a146 == a3[7] && cf) && input.equals(inputs[7])) && (a15 == 10)) && (a119.equals("g")))))) {
    	cf = false;
    	a263 = (a373 - -7);
    	a295 = (((((((a279 * a279) % 14999) % 62) + -47) + 5628) / 5) - 1156);
    	a381 = a218[(a263 + -7)];
    	a244 = (((((((a244 * a295) % 14999) / 5) % 23) - -118) - 7533) + 7533);
    	a146 = a3[(a15 - 6)];
    	a278 = "f";
    	a310 = "f";
    	a390 = (((((84 * 10) / 9) * 10) / 9) + 8);
    	a285 = "f";
    	a280 = ((((((a280 * a349) % 14999) * 2) % 39) - -323) * 1);
    	a391 = a392[(a263 - 8)];
    	a235 = a374;
    	a261 = a229[(a373 - 1)];
    	a201 = (a263 - 2);
    	a360 = a212;
    	a128 = (a373 + 2);
    	a312 = a382[(a201 - 6)];
    	a349 = ((((((((a244 * a390) % 14999) % 109) + 110) * 9) / 10) + 19258) - 19315);
    	a337 = ((a373 + a215) + -5);
    	a333 = "f";
    	a237 = a265;
    	a399 = a251;
    	a340 = a245[(a360 - 8)];
    	a209 = "f";
    	a400 = (((((22 + -23576) - -23477) / 5) * 59) / 10);
    	a116 = "f";
    	a353 = a343[(a373 + -1)];
    	a283 = "f";
    	a212 = ((a360 * a360) - 71);
    	a365 = "g";
    	a215 = (a373 - -9);
    	a279 = (((((((a279 * a400) % 14999) - -11313) % 57) - -162) - -20345) - 20342);
    	a320 = a372;
    	a246 = a358;
    	a373 = (a263 + -6); 
    	output = "T";
    } 
    if((((a119.equals("g")) && ((a215 == 10) && a381 == a218[0])) && (a295 <=  -110 && ((a209.equals("e")) && ((a15 == 10) && ((a310.equals("e")) && ((a365.equals("e")) && (a146 == a3[7] && (input.equals(inputs[2]) && cf))))))))) {
    	cf = false;
    	a377 = a204;
    	a399 = a251;
    	a15 = 12;
    	a365 = "g";
    	a390 = (((((((a390 * a295) % 14999) / 5) - 17532) + -4246) % 37) + 323);
    	a291 = a307[(a360 - 6)];
    	a279 = ((((((((a279 * a349) % 14999) + 5159) % 57) - -163) * 5) % 57) + 145);
    	a349 = (((((((a349 * a295) % 14999) % 109) + 134) - -1) + -26494) + 26491);
    	a244 = ((((((((a244 * a400) % 14999) % 23) + 117) * 5) - 7470) % 23) - -123);
    	a117 = a178[(a215 - 9)];
    	a266 = a236;
    	a400 = ((((((((a295 * a295) % 14999) / 5) % 13) + -96) * 5) % 13) + -82);
    	a215 = (a373 + 10); 
    	output = "Z";
    } 
}
private  void calculateOutputm45(String input) {
    if(((82 == a246[2]) && (a291 == a307[0] && (((((a373 == 2) && (cf && (a119.equals("e")))) && a312 == a382[0]) && (a201 == 6)) && (85 == a377[3]))))) {
    	calculateOutputm222(input);
    } 
    if((((a119.equals("g")) && cf) && (((a337 == 6) && (a244 <=  94 && ((20 == a237[4]) && (a279 <=  105 && (a310.equals("e")))))) && a280 <=  156))) {
    	calculateOutputm223(input);
    } 
}
private  void calculateOutputm224(String input) {
    if((((((a54 <=  -79 && ((cf && (a15 == 11)) && input.equals(inputs[6]))) && a391 == a392[0]) && (a201 == 6)) && a295 <=  -110) && ((a373 == 2) && (((a215 == 10) && (a278.equals("e"))) && a146 == a3[7])))) {
    	cf = false;
    	if(((((268 < a180) && (455 >= a180)) && (((19 < a88) && (133 >= a88)) || ((-113 < a193) && (-80 >= a193)))) && !(a146 == 3))) {
    	a263 = ((a215 - a360) + 6);
    	a381 = a218[(a212 + -9)];
    	a266 = a211;
    	a283 = "f";
    	a235 = a240;
    	a353 = a343[(a360 + -8)]; 
    	}else {
    	a320 = a372;
    	a295 = ((((((a295 * a54) % 14999) - -4058) % 62) + -51) - -3);
    	a215 = (a360 - -3);
    	a119 = "e";
    	a279 = ((((((a279 * a390) % 14999) + -8480) % 57) + 163) - 1);
    	a280 = ((((((a280 * a54) % 14999) / 5) + -13484) % 63) - -272);
    	a15 = (a201 + 4);
    	a291 = a307[(a263 - 8)];
    	a391 = a392[(a373 + -1)];
    	a285 = "e";
    	a246 = a296;
    	a333 = "f";
    	a365 = "e";
    	a400 = ((((((a349 * a349) % 14999) % 14948) - 15050) * 1) - 3);
    	}output = "X";
    } 
    if((((85 == a377[3]) && (a146 == a3[7] && (a54 <=  -79 && (cf && (a15 == 11))))) && (input.equals(inputs[0]) && ((a209.equals("e")) && ((a212 == 9) && ((90 == a399[4]) && ((56 == a320[1]) && a244 <=  94))))))) {
    	cf = false;
    	a391 = a392[(a373 + -1)];
    	a333 = "f";
    	a215 = (a337 - -5);
    	a146 = a3[((a15 * a15) - 116)];
    	a201 = (a373 + 5);
    	a113 = "e";
    	a209 = "f";
    	a399 = a251;
    	a360 = (a215 + -2);
    	a109 = (a337 + -4); 
    	output = "W";
    } 
}
private  void calculateOutputm46(String input) {
    if((((56 == a320[1]) && ((a212 == 9) && (((a54 <=  -79 && cf) && a280 <=  156) && a390 <=  75))) && ((a310.equals("e")) && (a360 == 8)))) {
    	calculateOutputm224(input);
    } 
}
private  void calculateOutputm227(String input) {
    if(((a353 == a343[0] && (((a340 == a245[0] && ((a212 == 9) && (a373 == 2))) && (18 == a266[5])) && a295 <=  -110)) && ((input.equals(inputs[6]) && ((cf && a117 == a178[0]) && a146 == a3[7])) && (a15 == 12)))) {
    	cf = false;
    	a209 = "f";
    	a295 = ((((((a295 * a390) % 14999) + 11248) % 62) - 47) / 5);
    	a30 = (a373 + 7);
    	a24 = ((a15 - a201) - -3);
    	a201 = (a360 - 1);
    	a312 = a382[(a263 + -8)];
    	a212 = (a373 - -8);
    	a390 = ((((((a280 * a295) % 14999) - 14931) / 5) - -6427) - 17038);
    	a285 = "f";
    	a266 = a211;
    	a333 = "f";
    	a278 = "e";
    	a283 = "f";
    	a146 = a3[((a201 * a24) - 60)];
    	a340 = a245[(a373 + -1)];
    	a261 = a229[(a360 + -7)];
    	a377 = a204;
    	a360 = a24;
    	a310 = "e";
    	a353 = a343[(a24 + -9)];
    	a237 = a265;
    	a320 = a372;
    	a263 = (a373 - -7);
    	a373 = (a15 + -10); 
    	output = "X";
    } 
    if((((a209.equals("e")) && ((18 == a266[5]) && ((a333.equals("e")) && (((a15 == 12) && (cf && a117 == a178[0])) && a390 <=  75)))) && (a146 == a3[7] && (input.equals(inputs[0]) && (a261 == a229[0] && a312 == a382[0]))))) {
    	cf = false;
    	a113 = "e";
    	a333 = "f";
    	a146 = a3[(a15 - 7)];
    	a360 = (a201 - -3);
    	a201 = ((a373 / a373) - -6);
    	a261 = a229[((a263 - a373) + -5)];
    	a209 = "f";
    	a285 = "f";
    	a109 = (a212 - 7); 
    	output = "W";
    } 
}
private  void calculateOutputm228(String input) {
    if((((((a360 == 8) && ((a15 == 12) && (a353 == a343[0] && a146 == a3[7]))) && a391 == a392[0]) && (41 == a235[0])) && ((((cf && a117 == a178[1]) && input.equals(inputs[1])) && a295 <=  -110) && (a373 == 2)))) {
    	cf = false;
    	a310 = "f";
    	a391 = a392[(a373 + -1)];
    	a266 = a211;
    	a24 = ((a15 + a263) - 10);
    	a295 = ((((((a295 * a244) % 14999) + 14361) * 2) % 62) + -45);
    	a146 = a3[(a201 + -3)];
    	a285 = "f";
    	a337 = ((a373 * a373) - -3);
    	a235 = a324;
    	a365 = "f";
    	a373 = (a24 + -7);
    	a27 = (((28 - -6133) * 4) - -4499); 
    	output = "W";
    } 
    if((((((a373 == 2) && (((a280 <=  156 && ((a15 == 12) && (cf && input.equals(inputs[5])))) && a312 == a382[0]) && (a278.equals("e")))) && (a337 == 6)) && ((a391 == a392[0] && a117 == a178[1]) && a146 == a3[7])) && a187 <= -41)) {
    	cf = false;
    	a377 = a281;
    	a309 = ((a337 / a337) - -14);
    	a310 = "g";
    	a136 = ((a373 / a263) - -7);
    	a261 = a229[(a212 + -7)];
    	a237 = a328;
    	a373 = (a360 - 4);
    	a381 = a218[(a201 - 4)];
    	a283 = "g";
    	a337 = (a309 + -7);
    	a285 = "g";
    	a333 = "g";
    	a278 = "g";
    	a280 = ((((((a280 * a295) % 14999) / 5) * 5) % 39) + 323);
    	a246 = a332;
    	a146 = a3[(a337 - 6)]; 
    	output = "S";
    } 
    if(((((a263 == 8) && ((a333.equals("e")) && (a285.equals("e")))) && (((a360 == 8) && (a312 == a382[0] && (a146 == a3[7] && (input.equals(inputs[2]) && (((a15 == 12) && cf) && a117 == a178[1]))))) && a261 == a229[0])) && a157 <= -33)) {
    	cf = false;
    	a261 = a229[((a212 / a212) + 1)];
    	a285 = "g";
    	a146 = a3[(a337 + -4)];
    	a278 = "g";
    	a333 = "g";
    	a136 = (a360 - 3);
    	a381 = a218[a373];
    	a130 = a160;
    	a295 = ((((((a295 * a280) % 14999) / 5) - 1311) % 95) + 113);
    	a235 = a374;
    	a279 = ((((((a295 * a390) % 14999) / 5) % 55) - -246) - 16);
    	a399 = a269;
    	a337 = ((a201 - a212) + 11);
    	a244 = ((((((a390 * a279) % 14999) / 5) + -29253) % 57) - -222); 
    	output = "S";
    } 
    if((((((a285.equals("e")) && ((a146 == a3[7] && (input.equals(inputs[9]) && cf)) && (a15 == 12))) && (a278.equals("e"))) && (a373 == 2)) && (((a295 <=  -110 && a117 == a178[1]) && (a283.equals("e"))) && a340 == a245[0]))) {
    	cf = false;
    	 
    	output = "Z";
    } 
    if((((((20 == a237[4]) && (((a278.equals("e")) && ((a15 == 12) && ((cf && input.equals(inputs[6])) && a117 == a178[1]))) && a146 == a3[7])) && (85 == a377[3])) && a312 == a382[0]) && ((a310.equals("e")) && (41 == a235[0])))) {
    	cf = false;
    	 
    	output = "Z";
    } 
}
private  void calculateOutputm229(String input) {
    if((((a15 == 12) && ((a117 == a178[2] && cf) && input.equals(inputs[4]))) && (((85 == a377[3]) && (((((90 == a399[4]) && (82 == a246[2])) && a146 == a3[7]) && (a360 == 8)) && (a365.equals("e")))) && (20 == a237[4])))) {
    	cf = false;
    	a283 = "f";
    	a235 = a374;
    	a333 = "f";
    	a310 = "f";
    	a244 = ((((((a279 * a280) % 14999) + 2775) - 13565) % 23) + 117);
    	a291 = a307[((a337 * a215) - 59)];
    	a391 = a392[(a360 + -7)];
    	a280 = ((((((a280 * a244) % 14999) % 39) + 324) - 1) + 0);
    	a400 = ((((((a400 * a295) % 14999) % 13) + -87) + 27438) + -27440);
    	a116 = "f";
    	a399 = a251;
    	a237 = a265;
    	a209 = "f";
    	a146 = a3[((a337 - a15) - -10)];
    	a128 = (a201 + -2);
    	a377 = a366;
    	a353 = a343[(a360 - 7)];
    	a365 = "g";
    	a263 = (a373 + 7);
    	a390 = (((((a244 * a244) / 5) * 5) % 87) - -136);
    	a312 = a382[(a212 / a263)];
    	a337 = (a360 - 1);
    	a261 = a229[(a360 + -7)];
    	a278 = "f";
    	a285 = "f";
    	a201 = (a360 + -1);
    	a215 = ((a263 / a360) + 10);
    	a266 = a211;
    	a340 = a245[(a360 + -7)];
    	a246 = a358;
    	a381 = a218[(a212 - 7)];
    	a373 = ((a360 / a360) + 2);
    	a212 = (a360 - -2);
    	a360 = ((a263 / a263) + 8); 
    	output = "Z";
    } 
    if(((a244 <=  94 && ((a278.equals("e")) && (a209.equals("e")))) && (((a280 <=  156 && ((a146 == a3[7] && (a117 == a178[2] && (cf && (a15 == 12)))) && input.equals(inputs[7]))) && (a283.equals("e"))) && (a201 == 6)))) {
    	cf = false;
    	a24 = (a373 - -7);
    	a30 = (a201 - -6);
    	a365 = "f";
    	a246 = a358;
    	a146 = a3[((a263 + a212) - 14)];
    	a391 = a392[(a360 - 7)];
    	a400 = (((((((a400 * a244) % 14999) + 1490) / 5) - 20531) % 13) + -82);
    	a237 = a265;
    	a280 = ((((((((a280 * a279) % 14999) / 5) % 63) - -220) * 5) % 63) + 207);
    	a212 = ((a24 + a201) - 5);
    	a381 = a218[((a215 * a30) + -119)];
    	a377 = a366;
    	a337 = (a24 + -2); 
    	output = "S";
    } 
    if(((a391 == a392[0] && (((a212 == 9) && a261 == a229[0]) && (a365.equals("e")))) && (((((a15 == 12) && (a117 == a178[2] && (a146 == a3[7] && cf))) && input.equals(inputs[2])) && a400 <=  -103) && (a215 == 10)))) {
    	cf = false;
    	a295 = ((((((a280 * a280) % 14999) * 2) % 14945) + -15054) - 2);
    	a266 = a236;
    	a117 = a178[(a360 + -7)];
    	a235 = a240;
    	a400 = ((((((a400 * a244) % 14999) + -12309) + 19309) % 13) - 89);
    	a399 = a251;
    	a365 = "g";
    	a244 = (((((((a280 * a295) % 14999) + 8588) % 23) - -117) / 5) - -90);
    	a215 = (a201 + 6);
    	a291 = a307[((a263 * a15) + -94)]; 
    	output = "U";
    } 
}
private  void calculateOutputm231(String input) {
    if(((((a212 == 9) && (((cf && a146 == a3[7]) && (a15 == 12)) && a117 == a178[4])) && a244 <=  94) && ((a291 == a307[0] && (a279 <=  105 && (a391 == a392[0] && input.equals(inputs[1])))) && (a337 == 6)))) {
    	cf = false;
    	a146 = a3[(a263 + -5)];
    	a30 = ((a201 * a337) + -23);
    	a24 = (a201 + 3); 
    	output = "T";
    } 
    if((((input.equals(inputs[6]) && ((a280 <=  156 && ((cf && a117 == a178[4]) && a146 == a3[7])) && (a15 == 12))) && (a209.equals("e"))) && ((((41 == a235[0]) && (56 == a320[1])) && a261 == a229[0]) && (20 == a237[4])))) {
    	a71 += (a71 + 20) > a71 ? 3 : 0;
    	cf = false;
    	a146 = a3[(a360 + -2)];
    	a261 = a229[3];
    	a360 = 8;
    	a278 = "i";
    	a266 = a211;
    	a391 = a392[7];
    	a291 = a307[7];
    	a399 = a251;
    	a390 = ((((a390 % 14836) - -15162) + 2) + 0);
    	a76 = a98;
    	a353 = a343[7];
    	a373 = 3;
    	a209 = "e";
    	a338 = (a201 - 1);
    	a215 = 11;
    	a235 = a324;
    	a201 = 12; 
    	output = "Z";
    } 
    if((((a391 == a392[0] && ((input.equals(inputs[8]) && (cf && a146 == a3[7])) && a117 == a178[4])) && (a360 == 8)) && (a353 == a343[0] && ((((a263 == 8) && (a15 == 12)) && (41 == a235[0])) && a291 == a307[0])))) {
    	cf = false;
    	a15 = (a337 + 1);
    	a244 = ((((a244 % 57) - -198) + 0) * 1);
    	a266 = a211;
    	a353 = a343[4];
    	a279 = ((((a279 % 55) + 278) - 2) + 3);
    	a285 = "i";
    	a365 = "e";
    	a338 = (a15 - -4); 
    	output = "X";
    } 
    if(((a117 == a178[4] && (((90 == a399[4]) && ((a365.equals("e")) && (85 == a377[3]))) && a146 == a3[7])) && (((41 == a235[0]) && ((a285.equals("e")) && ((input.equals(inputs[5]) && cf) && (a15 == 12)))) && (18 == a266[5])))) {
    	cf = false;
    	if(((!(a79.equals("e")) || ((a316.equals("e")) || !(a249 == 12))) || ((-79 < a54) && (134 >= a54)))) {
    	a54 = (((((((a400 * a400) % 14999) % 106) - -1) - 25316) - -26561) - 1223);
    	a15 = (a263 - -3); 
    	}else {
    	a237 = a328;
    	a280 = ((((a280 % 15078) + -14921) - 2) / 5);
    	a399 = a344;
    	a381 = a218[3];
    	a244 = (((((a244 - 0) * 1) - -17386) % 15047) - 14952);
    	a279 = (((((a279 - 0) - -20157) + 1274) % 15052) - 14946);
    	a337 = 12;
    	a377 = a204;
    	a103 = (a373 + 10);
    	a333 = "h";
    	a291 = a307[3];
    	a320 = a299;
    	a278 = "i";
    	a340 = a245[6];
    	a146 = a3[((a103 + a201) - 15)];
    	a390 = ((((a390 / 5) * 5) % 37) + 289);
    	a283 = "h";
    	a312 = a382[5];
    	a353 = a343[3];
    	a400 = ((((a400 % 53) + -21) + -7353) - -7406);
    	a365 = "i";
    	a246 = a296;
    	a212 = 9;
    	a263 = 14;
    	a391 = a392[4];
    	a360 = 11;
    	a261 = a229[7];
    	a310 = "e";
    	a24 = (a215 + 2);
    	a285 = "h";
    	a349 = (((((a349 + 0) * 1) + 0) % 14805) + 15194);
    	a235 = a374;
    	a373 = 8;
    	a266 = a236;
    	a201 = 8;
    	a215 = 17;
    	}output = "W";
    } 
    if(((((a285.equals("e")) && (((a117 == a178[4] && cf) && (a15 == 12)) && (a215 == 10))) && (a278.equals("e"))) && ((a212 == 9) && ((input.equals(inputs[9]) && ((20 == a237[4]) && a291 == a307[0])) && a146 == a3[7])))) {
    	cf = false;
    	a235 = a374;
    	a244 = (((((a244 + 0) % 15047) - 14952) - -16932) - 16932);
    	a212 = 15;
    	a103 = (a201 - -6);
    	a280 = (((((a280 - -18826) % 14817) - -15181) - 23706) - -23709);
    	a246 = a296;
    	a266 = a236;
    	a283 = "i";
    	a215 = 15;
    	a399 = a269;
    	a373 = 5;
    	a24 = a15;
    	a381 = a218[5];
    	a291 = a307[4];
    	a333 = "g";
    	a263 = 8;
    	a340 = a245[4];
    	a146 = a3[(a337 - 3)];
    	a353 = a343[7];
    	a201 = 10;
    	a390 = ((((a390 % 14836) - -15162) - 25968) - -25971);
    	a377 = a204;
    	a310 = "e";
    	a261 = a229[7];
    	a278 = "h";
    	a285 = "h";
    	a237 = a328;
    	a349 = (((a349 / 5) + -17832) * 1);
    	a400 = (((a400 - 0) - -16396) - -13701);
    	a360 = 13;
    	a279 = ((((a279 - -17078) - -5869) % 55) - -276);
    	a312 = a382[4];
    	a391 = a392[0];
    	a365 = "h";
    	a320 = a217;
    	a337 = 8; 
    	output = "Z";
    } 
    if((((a146 == a3[7] && (a280 <=  156 && ((90 == a399[4]) && (a117 == a178[4] && (input.equals(inputs[0]) && cf))))) && (a15 == 12)) && (a349 <=  23 && (((a365.equals("e")) && (a263 == 8)) && a353 == a343[0])))) {
    	cf = false;
    	a390 = ((((a390 % 87) + 163) - 5792) - -5793);
    	a167 = (a15 + -4);
    	a244 = ((((a244 * 1) % 15047) - 14952) - 1);
    	a285 = "i";
    	a295 = ((((60 - 79) + -18487) / 5) + 3659);
    	a136 = (a201 - -2);
    	a283 = "f";
    	a400 = (((a400 - -30044) - 19302) - -19357);
    	a146 = a3[(a136 - 6)];
    	a349 = ((((a349 % 15011) + -14987) - 2) - 1);
    	a266 = a221;
    	a377 = a204;
    	a209 = "i";
    	a278 = "i";
    	a333 = "f";
    	a381 = a218[1];
    	a212 = 12;
    	a353 = a343[5];
    	a261 = a229[1];
    	a340 = a245[5];
    	a365 = "h";
    	a320 = a372;
    	a310 = "e";
    	a280 = ((((a280 % 15078) + -14921) + -2) - 0);
    	a263 = 9;
    	a399 = a251;
    	a215 = 15;
    	a246 = a296;
    	a337 = 10;
    	a201 = 7; 
    	output = "W";
    } 
    if(((a244 <=  94 && ((a15 == 12) && ((a333.equals("e")) && ((a381 == a218[0] && (a146 == a3[7] && (input.equals(inputs[2]) && cf))) && a117 == a178[4])))) && ((a278.equals("e")) && (a261 == a229[0] && (a365.equals("e")))))) {
    	cf = false;
    	a377 = a204;
    	a312 = a382[0];
    	a127 = a29[(a337 + -3)];
    	a400 = (((a400 / 5) - -22725) + 85);
    	a56 = (((((((a390 * a279) % 14999) % 82) + 126) * 5) % 82) + 116);
    	a337 = 10;
    	a391 = a392[7];
    	a215 = 12;
    	a278 = "g";
    	a235 = a240;
    	a340 = a245[2];
    	a261 = a229[4];
    	a201 = 9;
    	a333 = "h";
    	a283 = "e";
    	a353 = a343[4];
    	a285 = "h";
    	a209 = "i";
    	a399 = a344;
    	a246 = a296;
    	a320 = a299;
    	a244 = (((((a244 % 57) + 199) - -23998) / 5) - 4678);
    	a279 = ((((((a279 % 55) + 276) * 5) - 10956) % 55) + 290);
    	a146 = a3[(a15 - 11)];
    	a291 = a307[5];
    	a237 = a328;
    	a212 = 12;
    	a310 = "f";
    	a280 = ((((a280 * 1) % 39) + 323) + 2);
    	a365 = "g";
    	a360 = 10;
    	a373 = 8;
    	a349 = ((((a349 % 14805) + 15194) - 0) - 0);
    	a266 = a221;
    	a381 = a218[0];
    	a263 = 12;
    	a390 = ((((((a390 % 37) - -289) + 2261) / 5) * 6) / 10); 
    	output = "U";
    } 
    if((((a353 == a343[0] && ((a201 == 6) && a146 == a3[7])) && (a212 == 9)) && (((a360 == 8) && ((82 == a246[2]) && (((a15 == 12) && (input.equals(inputs[3]) && cf)) && a117 == a178[4]))) && a349 <=  23))) {
    	cf = false;
    	a338 = (a337 - -2);
    	a15 = ((a215 + a263) - 11); 
    	output = "Z";
    } 
    if(((a117 == a178[4] && ((a263 == 8) && ((56 == a320[1]) && (a279 <=  105 && (20 == a237[4]))))) && (((((cf && (a15 == 12)) && a146 == a3[7]) && a340 == a245[0]) && a291 == a307[0]) && input.equals(inputs[4])))) {
    	cf = false;
    	a377 = a204;
    	a246 = a332;
    	a381 = a218[5];
    	a365 = "h";
    	a391 = a392[4];
    	a237 = a336;
    	a146 = a3[(a201 - 3)];
    	a212 = 16;
    	a280 = ((((a280 - 0) % 14817) + 15181) - -2);
    	a349 = (((((a349 + 0) % 72) + 315) - -7098) + -7095);
    	a337 = 11;
    	a235 = a240;
    	a24 = (a360 - -1);
    	a400 = ((((a400 / 5) % 53) - -29) + -9);
    	a279 = ((((a279 * 1) % 14833) + 15166) * 1);
    	a30 = (a24 + 3); 
    	output = "W";
    } 
    if(((((a263 == 8) && (((((a365.equals("e")) && ((cf && (a15 == 12)) && a117 == a178[4])) && a146 == a3[7]) && input.equals(inputs[7])) && (a285.equals("e")))) && a390 <=  75) && ((a201 == 6) && (a360 == 8)))) {
    	a154 -= (a154 - 20) < a154 ? 2 : 0;
    	cf = false;
    	if(((a146 == 4) && (!(a177 == 1) || (((a30 == 10) || 33 < a400) && !(a167 == 2))))) {
    	a360 = 15;
    	a377 = a204;
    	a279 = (((((a279 % 15052) + -14946) + -2) + 25467) - 25466);
    	a400 = ((((a400 - 0) / 5) - -921) - -17793);
    	a365 = "i";
    	a280 = ((((a280 * 1) % 39) + 324) + -1);
    	a312 = a382[5];
    	a209 = "h";
    	a278 = "g";
    	a373 = 6;
    	a390 = ((((a390 - -3979) - 1462) % 15037) - 14961);
    	a283 = "e";
    	a285 = "i";
    	a353 = a343[0];
    	a261 = a229[7];
    	a146 = a3[((a337 * a201) - 33)];
    	a24 = a337;
    	a391 = a392[5];
    	a337 = 11;
    	a244 = ((((a244 - 0) % 15047) + -14952) / 5);
    	a291 = a307[0];
    	a235 = a374;
    	a246 = a332;
    	a320 = a372;
    	a237 = a265;
    	a212 = 15;
    	a349 = ((((a349 * 1) % 72) - -315) - -1);
    	a333 = "e";
    	a266 = a236;
    	a316 = "g";
    	a215 = 16;
    	a310 = "g";
    	a399 = a344;
    	a295 = ((((45 + -107) * 5) + 21371) + -21072);
    	a201 = 9; 
    	}else {
    	a283 = "i";
    	a295 = ((((83 * 9) / 10) / 5) + 161);
    	a353 = a343[5];
    	a373 = 7;
    	a279 = (((((a279 + 15741) % 57) + 163) + -26610) + 26609);
    	a338 = (a337 - -4);
    	a365 = "f";
    	a15 = (a201 - -1);
    	}output = "T";
    } 
}
private  void calculateOutputm232(String input) {
    if(((((a333.equals("e")) && ((a390 <=  75 && (a381 == a218[0] && a146 == a3[7])) && a349 <=  23)) && (18 == a266[5])) && (((((a15 == 12) && cf) && input.equals(inputs[9])) && a117 == a178[6]) && a244 <=  94))) {
    	cf = false;
    	a379 = ((a360 * a212) + -60);
    	a15 = (a373 + 12); 
    	output = "V";
    } 
    if((((41 == a235[0]) && ((a15 == 12) && (a117 == a178[6] && (cf && input.equals(inputs[1]))))) && ((a333.equals("e")) && ((a312 == a382[0] && (a244 <=  94 && (a146 == a3[7] && a390 <=  75))) && (a360 == 8))))) {
    	cf = false;
    	if(((a333.equals("i")) || ((94 < a244) && (141 >= a244)))) {
    	a325 = "e";
    	a116 = "h";
    	a146 = a3[((a201 + a15) - 14)]; 
    	}else {
    	a237 = a265;
    	a373 = 9;
    	a261 = a229[1];
    	a365 = "h";
    	a146 = a3[(a15 + -10)];
    	a377 = a366;
    	a266 = a221;
    	a291 = a307[1];
    	a280 = ((((a280 * 1) % 14817) - -15181) * 1);
    	a310 = "i";
    	a333 = "i";
    	a136 = ((a263 * a263) + -57);
    	a285 = "i";
    	a278 = "h";
    	a309 = (a337 - -9);
    	a283 = "f";
    	a381 = a218[1];
    	a215 = 14;
    	a337 = 13;
    	}output = "U";
    } 
    if((((90 == a399[4]) && (((85 == a377[3]) && (a212 == 9)) && a400 <=  -103)) && ((input.equals(inputs[2]) && ((a146 == a3[7] && (a117 == a178[6] && (cf && (a15 == 12)))) && (41 == a235[0]))) && (20 == a237[4])))) {
    	cf = false;
    	a261 = a229[3];
    	a310 = "e";
    	a215 = 13;
    	a337 = 6;
    	a201 = 6;
    	a312 = a382[0];
    	a285 = "i";
    	a365 = "e";
    	a235 = a374;
    	a360 = 14;
    	a340 = a245[3];
    	a349 = ((((a349 + 3077) % 15011) + -14987) / 5);
    	a109 = ((a15 - a15) - -7);
    	a278 = "i";
    	a237 = a336;
    	a373 = 7;
    	a132 = a80;
    	a146 = a3[((a212 - a109) + 3)]; 
    	output = "W";
    } 
    if((((a333.equals("e")) && (a117 == a178[6] && (((input.equals(inputs[7]) && (cf && a146 == a3[7])) && a295 <=  -110) && (a360 == 8)))) && ((((a337 == 6) && (a15 == 12)) && a381 == a218[0]) && a400 <=  -103))) {
    	cf = false;
    	a249 = (a15 - 6);
    	a136 = (a360 + -5);
    	a146 = a3[(a337 - 4)]; 
    	output = "U";
    } 
    if(((a391 == a392[0] && ((a283.equals("e")) && (input.equals(inputs[5]) && ((a15 == 12) && cf)))) && (a146 == a3[7] && ((a212 == 9) && (((41 == a235[0]) && (a117 == a178[6] && (a285.equals("e")))) && a349 <=  23))))) {
    	cf = false;
    	a246 = a358;
    	a17 = "e";
    	a291 = a307[4];
    	a310 = "g";
    	a320 = a372;
    	a146 = a3[((a212 * a360) - 72)];
    	a33 = a111; 
    	output = "S";
    } 
    if(((((a15 == 12) && ((a283.equals("e")) && a261 == a229[0])) && (a365.equals("e"))) && ((a212 == 9) && (((((cf && a146 == a3[7]) && input.equals(inputs[0])) && a117 == a178[6]) && a279 <=  105) && (a263 == 8))))) {
    	cf = false;
    	a15 = ((a263 - a215) + 10);
    	a177 = (a15 + -6); 
    	output = "S";
    } 
    if(((((a365.equals("e")) && ((input.equals(inputs[8]) && (a283.equals("e"))) && a312 == a382[0])) && a340 == a245[0]) && (a353 == a343[0] && ((a146 == a3[7] && (((a15 == 12) && cf) && a117 == a178[6])) && a261 == a229[0])))) {
    	cf = false;
    	if((a325.equals("f"))) {
    	a261 = a229[4];
    	a333 = "f";
    	a320 = a299;
    	a201 = 13;
    	a146 = a3[((a360 - a360) - -2)];
    	a295 = ((((a295 % 14895) + 15103) - -5680) + 6392);
    	a312 = a382[6];
    	a209 = "e";
    	a399 = a344;
    	a136 = (a337 - 3);
    	a244 = ((((((a244 % 23) + 118) + -1) / 5) * 51) / 10);
    	a279 = ((((a279 % 14833) - -15166) * 1) + 0);
    	a237 = a265;
    	a215 = 11;
    	a400 = (((a400 - -30072) * 1) + 20);
    	a349 = ((((a349 % 15011) - 14987) - 0) + -1);
    	a337 = 6;
    	a249 = ((a136 * a263) - 13);
    	a377 = a204;
    	a373 = 9;
    	a390 = ((((a390 - -3105) - 2343) % 14836) + 15162);
    	a353 = a343[3];
    	a266 = a211;
    	a391 = a392[3];
    	a278 = "i";
    	a235 = a240;
    	a381 = a218[5];
    	a280 = ((((a280 % 15078) - 14921) + -1) + -1);
    	a365 = "i";
    	a285 = "e";
    	a360 = 15;
    	a340 = a245[0];
    	a263 = 11; 
    	}else {
    	a379 = ((a15 - a373) + -4);
    	a15 = ((a201 * a201) + -22);
    	}output = "Z";
    } 
    if(((a244 <=  94 && (a400 <=  -103 && (a390 <=  75 && a381 == a218[0]))) && ((a295 <=  -110 && (a117 == a178[6] && (input.equals(inputs[6]) && (a146 == a3[7] && (cf && (a15 == 12)))))) && (a360 == 8)))) {
    	cf = false;
    	if(((75 == a282[5]) && (((a333.equals("h")) && ((a101.equals("h")) && (65 == a82[5]))) && ((-10 < a156) && (49 >= a156))))) {
    	a136 = (a212 - 1);
    	a167 = (a337 - 2);
    	a146 = a3[((a373 / a136) - -2)]; 
    	}else {
    	a190 = "e";
    	a312 = a382[4];
    	a266 = a221;
    	a285 = "e";
    	a261 = a229[7];
    	a237 = a336;
    	a381 = a218[7];
    	a337 = 10;
    	a146 = a3[((a201 - a373) - 2)];
    	a280 = ((((a280 % 15078) + -14921) - 1) + -1);
    	a310 = "i";
    	a377 = a366;
    	a365 = "i";
    	a399 = a251;
    	a215 = 17;
    	a136 = (a263 + 1);
    	}output = "T";
    } 
    if(((((((a15 == 12) && a280 <=  156) && (18 == a266[5])) && a390 <=  75) && (a209.equals("e"))) && (((a146 == a3[7] && (a117 == a178[6] && (input.equals(inputs[4]) && cf))) && (a278.equals("e"))) && (a365.equals("e"))))) {
    	cf = false;
    	if((a291 == 7)) {
    	a95 = "f";
    	a146 = a3[(a15 + -7)];
    	a109 = (a201 + 2); 
    	}else {
    	a146 = a3[(a201 - 1)];
    	a109 = (a263 + -4);
    	a82 = a86;
    	}output = "W";
    } 
    if((((a337 == 6) && (((a381 == a218[0] && (a279 <=  105 && (85 == a377[3]))) && a146 == a3[7]) && (90 == a399[4]))) && ((a15 == 12) && ((a117 == a178[6] && (cf && input.equals(inputs[3]))) && (a263 == 8))))) {
    	cf = false;
    	a180 = ((((((a295 * a280) % 14999) / 5) * 5) / 5) - -8715);
    	a146 = a3[(a263 - 6)];
    	a136 = a337; 
    	output = "W";
    } 
}
private  void calculateOutputm233(String input) {
    if((((a209.equals("e")) && (((20 == a237[4]) && ((a263 == 8) && a312 == a382[0])) && (a15 == 12))) && (a381 == a218[0] && (input.equals(inputs[6]) && (a390 <=  75 && ((cf && a146 == a3[7]) && a117 == a178[7])))))) {
    	cf = false;
    	if(((!(a64 == 9) && (!(a261 == a229[4]) || ((a17.equals("i")) && (a167 == 8)))) && 455 < a180)) {
    	a17 = "e";
    	a146 = a3[(a373 - 2)];
    	a33 = a124; 
    	}else {
    	a109 = (a201 - 3);
    	a373 = 4;
    	a291 = a307[3];
    	a340 = a245[7];
    	a333 = "h";
    	a295 = (((((a295 % 95) + 131) + 26750) * 1) + -26765);
    	a312 = a382[2];
    	a365 = "i";
    	a263 = 13;
    	a279 = ((((a279 / 5) - 7226) * 10) / 9);
    	a360 = 10;
    	a201 = 10;
    	a246 = a296;
    	a235 = a374;
    	a146 = a3[((a337 / a109) + 3)];
    	a156 = (((((((a349 * a390) % 14999) % 54) - -104) * 5) % 54) + 54);
    	}output = "X";
    } 
    if((((a215 == 10) && a279 <=  105) && ((a263 == 8) && ((a310.equals("e")) && ((a117 == a178[7] && (a381 == a218[0] && (a146 == a3[7] && ((cf && (a15 == 12)) && input.equals(inputs[1]))))) && (18 == a266[5])))))) {
    	cf = false;
    	a399 = a344;
    	a295 = ((((((a295 % 62) - 34) * 10) / 9) + 1360) - 1308);
    	a246 = a358;
    	a76 = a70;
    	a283 = "h";
    	a146 = a3[((a263 * a337) + -42)];
    	a212 = 12;
    	a278 = "e";
    	a391 = a392[5];
    	a279 = (((((a279 - 0) % 14833) + 15166) + -12612) - -12614);
    	a373 = 2;
    	a353 = a343[1];
    	a381 = a218[1];
    	a266 = a221;
    	a390 = ((((a390 - 0) % 87) - -162) * 1);
    	a193 = ((((((a244 * a244) % 14999) % 97) + 18) + -1) + 0); 
    	output = "U";
    } 
    if((((((cf && a117 == a178[7]) && a146 == a3[7]) && (a15 == 12)) && (82 == a246[2])) && ((a295 <=  -110 && ((a312 == a382[0] && ((a215 == 10) && input.equals(inputs[5]))) && (a360 == 8))) && (a283.equals("e"))))) {
    	cf = false;
    	a400 = ((((88 - -3863) - 4035) / 5) + -75);
    	a280 = (((((a280 % 14817) + 15181) + -18785) * 1) + 18786);
    	a261 = a229[4];
    	a302 = "i";
    	a17 = "i";
    	a320 = a372;
    	a285 = "i";
    	a146 = a3[((a360 * a201) - 48)]; 
    	output = "S";
    } 
    if((((((a373 == 2) && (90 == a399[4])) && a117 == a178[7]) && a340 == a245[0]) && (((((a365.equals("e")) && (a146 == a3[7] && (cf && (a15 == 12)))) && (82 == a246[2])) && a244 <=  94) && input.equals(inputs[8])))) {
    	cf = false;
    	if(((a373 == 3) || (((44 < a56) && (210 >= a56)) && ((a360 == 12) || !(a117 == 14))))) {
    	a360 = 11;
    	a320 = a299;
    	a116 = "i";
    	a390 = ((((a390 % 14836) + 15162) + -14749) + 14750);
    	a337 = 12;
    	a312 = a382[4];
    	a146 = a3[(a201 - 2)];
    	a283 = "i";
    	a215 = 13;
    	a263 = 13;
    	a280 = (((a280 / 5) / 5) - -6220);
    	a349 = ((((a349 % 15011) - 14987) + 13460) + -13461);
    	a295 = ((((((a295 % 95) + 134) * 5) * 5) % 95) - -42);
    	a237 = a328;
    	a279 = (((((a279 % 14833) + 15166) - -1) / 5) + 12936);
    	a353 = a343[7];
    	a56 = (((99 + 19099) * -1) / 5); 
    	}else {
    	a189 = "i";
    	a17 = "h";
    	a146 = a3[((a201 / a337) + -1)];
    	}output = "Z";
    } 
    if(((((a337 == 6) && (((a15 == 12) && cf) && a117 == a178[7])) && a279 <=  105) && (((a333.equals("e")) && ((((a212 == 9) && a391 == a392[0]) && a146 == a3[7]) && input.equals(inputs[7]))) && a291 == a307[0]))) {
    	cf = false;
    	a209 = "i";
    	a279 = ((((a279 / 5) * 5) % 15052) + -14946);
    	a237 = a336;
    	a390 = ((((a390 * 1) - -7654) % 15037) + -14961);
    	a291 = a307[3];
    	a146 = a3[(a215 + -6)];
    	a312 = a382[5];
    	a116 = "f";
    	a295 = ((((a295 % 14895) + 15103) - -14182) * 1);
    	a353 = a343[6];
    	a320 = a299;
    	a283 = "g";
    	a360 = 10;
    	a377 = a204;
    	a310 = "h";
    	a128 = ((a373 + a373) + -1);
    	a215 = 16; 
    	output = "Z";
    } 
    if(((((82 == a246[2]) && ((((a333.equals("e")) && (input.equals(inputs[0]) && (cf && a146 == a3[7]))) && (a215 == 10)) && a349 <=  23)) && a312 == a382[0]) && (a117 == a178[7] && ((a365.equals("e")) && (a15 == 12))))) {
    	cf = false;
    	if(((a365.equals("i")) && !(a117 == a178[7]))) {
    	a24 = a212;
    	a30 = (a24 + 4);
    	a146 = a3[(a212 - 6)]; 
    	}else {
    	a127 = a29[((a360 * a212) + -65)];
    	a56 = ((((((a244 * a244) % 14999) / 5) + -22674) % 82) + 201);
    	a146 = a3[(a215 + -9)];
    	}output = "Y";
    } 
    if((((a365.equals("e")) && (a15 == 12)) && ((a215 == 10) && ((a353 == a343[0] && (((a391 == a392[0] && (a117 == a178[7] && (cf && a146 == a3[7]))) && a390 <=  75) && input.equals(inputs[2]))) && (a263 == 8))))) {
    	cf = false;
    	if(((a189.equals("h")) || (!(a263 == 10) && (a128 == 2)))) {
    	a295 = ((((a295 * 1) % 95) - -176) - -10);
    	a310 = "i";
    	a353 = a343[7];
    	a399 = a344;
    	a215 = 12;
    	a337 = 11;
    	a209 = "i";
    	a235 = a374;
    	a312 = a382[5];
    	a333 = "g";
    	a56 = (((97 / -5) / 5) / 5);
    	a280 = (((a280 / 5) + -20544) + -1507);
    	a283 = "h";
    	a373 = 5;
    	a266 = a221;
    	a246 = a332;
    	a377 = a204;
    	a212 = 14;
    	a146 = a3[(a360 - 7)];
    	a291 = a307[0];
    	a237 = a328;
    	a263 = 15;
    	a201 = 8;
    	a340 = a245[3];
    	a320 = a299;
    	a88 = (((((a56 * a56) % 14999) - 14981) + -6) * 1);
    	a400 = (((76 - 27727) - 707) - 1156);
    	a244 = (((((a244 % 14871) - -15127) - -2) + -27949) + 27949);
    	a365 = "i";
    	a390 = (((((a390 % 14836) - -15162) + 1) / 5) - -21897);
    	a349 = ((((a349 % 72) - -315) * 1) + 0);
    	a279 = ((((a279 % 14833) + 15166) + 0) - -1);
    	a360 = 12; 
    	}else {
    	a285 = "i";
    	a309 = (a337 - -6);
    	a136 = ((a15 + a309) + -17);
    	a340 = a245[7];
    	a263 = 11;
    	a381 = a218[1];
    	a261 = a229[4];
    	a244 = (((((a244 % 15047) - 14952) * 1) - -11317) - 11318);
    	a390 = (((((a390 + 5910) * 1) * 1) % 14836) + 15162);
    	a312 = a382[0];
    	a266 = a221;
    	a278 = "f";
    	a310 = "e";
    	a399 = a344;
    	a235 = a324;
    	a215 = 15;
    	a320 = a299;
    	a377 = a366;
    	a365 = "f";
    	a280 = ((((a280 * 1) % 63) + 220) * 1);
    	a337 = 13;
    	a291 = a307[3];
    	a279 = (((((a279 - -25161) % 55) + 276) - -18802) + -18801);
    	a295 = ((((((a295 % 14895) - -15103) * 10) / 9) * 10) / 9);
    	a360 = 12;
    	a212 = 12;
    	a146 = a3[(a337 + -6)];
    	}output = "Z";
    } 
    if((((((cf && input.equals(inputs[3])) && a146 == a3[7]) && (a278.equals("e"))) && a117 == a178[7]) && ((20 == a237[4]) && (((((41 == a235[0]) && (90 == a399[4])) && (a15 == 12)) && a390 <=  75) && a291 == a307[0])))) {
    	cf = false;
    	a266 = a221;
    	a310 = "h";
    	a340 = a245[6];
    	a381 = a218[4];
    	a283 = "h";
    	a377 = a281;
    	a365 = "e";
    	a295 = ((((a295 % 14945) + -110) / 5) - 25464);
    	a201 = 12;
    	a333 = "g";
    	a56 = (((89 - -16668) * 1) * -1);
    	a391 = a392[6];
    	a237 = a328;
    	a246 = a332;
    	a235 = a374;
    	a360 = 8;
    	a244 = (((a244 / 5) / 5) * 5);
    	a280 = ((((((a280 + 13109) % 39) - -325) * 5) % 39) + 297);
    	a146 = a3[(a337 - 5)];
    	a349 = ((((a349 % 15011) + -14987) - -27765) - 27767);
    	a320 = a299;
    	a312 = a382[5];
    	a291 = a307[7];
    	a285 = "f";
    	a88 = ((((((a390 * a56) % 14999) % 56) + 76) - -2) - 1);
    	a278 = "g";
    	a263 = 8;
    	a215 = 10;
    	a390 = (((((a390 + 0) % 15037) + -14961) - -9426) + -9426);
    	a400 = (((3 - 18421) * 1) + 23316);
    	a353 = a343[4];
    	a212 = 16;
    	a209 = "i";
    	a399 = a344;
    	a373 = 5;
    	a279 = (((((a279 * 1) % 55) + 276) + 13614) + -13611);
    	a337 = 10; 
    	output = "Z";
    } 
    if(((((a15 == 12) && ((85 == a377[3]) && (input.equals(inputs[4]) && (cf && a146 == a3[7])))) && (a201 == 6)) && ((a365.equals("e")) && ((a381 == a218[0] && ((a373 == 2) && a117 == a178[7])) && a390 <=  75)))) {
    	cf = false;
    	a365 = "h";
    	a279 = (((((a279 % 55) - -276) / 5) / 5) - -299);
    	a320 = a299;
    	a295 = ((((((a295 % 14945) - 110) + 16712) * 1) * -1) / 10);
    	a266 = a221;
    	a353 = a343[2];
    	a400 = (((28 / 5) - 9507) + 9519);
    	a244 = (((((a244 / 5) % 57) - -198) - 19385) - -19385);
    	a338 = (a212 + 2);
    	a261 = a229[4];
    	a15 = (a338 + -4); 
    	output = "Z";
    } 
    if(((a390 <=  75 && ((a209.equals("e")) && (a310.equals("e")))) && (a391 == a392[0] && ((a263 == 8) && (a349 <=  23 && ((((cf && a146 == a3[7]) && (a15 == 12)) && a117 == a178[7]) && input.equals(inputs[9]))))))) {
    	cf = false;
    	a146 = a3[(a263 + -4)];
    	a116 = "g";
    	a104 = a148[((a215 - a201) - 1)]; 
    	output = "S";
    } 
}
private  void calculateOutputm47(String input) {
    if(((((20 == a237[4]) && ((cf && a117 == a178[0]) && (a333.equals("e")))) && (a285.equals("e"))) && ((85 == a377[3]) && ((a283.equals("e")) && (56 == a320[1]))))) {
    	calculateOutputm227(input);
    } 
    if(((a381 == a218[0] && (((82 == a246[2]) && (a212 == 9)) && a340 == a245[0])) && ((a373 == 2) && ((a117 == a178[1] && cf) && a261 == a229[0])))) {
    	calculateOutputm228(input);
    } 
    if((((a263 == 8) && ((18 == a266[5]) && a381 == a218[0])) && ((85 == a377[3]) && (a291 == a307[0] && ((cf && a117 == a178[2]) && a400 <=  -103))))) {
    	calculateOutputm229(input);
    } 
    if(((a391 == a392[0] && ((41 == a235[0]) && (a209.equals("e")))) && (((56 == a320[1]) && ((a117 == a178[4] && cf) && (82 == a246[2]))) && a381 == a218[0]))) {
    	calculateOutputm231(input);
    } 
    if((((((85 == a377[3]) && ((a117 == a178[6] && cf) && a340 == a245[0])) && a295 <=  -110) && a390 <=  75) && ((a333.equals("e")) && (a373 == 2)))) {
    	calculateOutputm232(input);
    } 
    if(((a381 == a218[0] && ((a279 <=  105 && a390 <=  75) && a280 <=  156)) && (a391 == a392[0] && ((cf && a117 == a178[7]) && (a263 == 8))))) {
    	calculateOutputm233(input);
    } 
}
private  void calculateOutputm234(String input) {
    if(((((((41 == a235[0]) && (82 == a246[2])) && input.equals(inputs[8])) && (a310.equals("e"))) && (a278.equals("e"))) && ((85 == a377[3]) && ((a333.equals("e")) && (a146 == a3[7] && ((a15 == 13) && (a19 <=  14 && cf))))))) {
    	cf = false;
    	a310 = "f";
    	a391 = a392[((a201 + a15) + -18)];
    	a104 = a148[((a212 - a337) - -3)];
    	a261 = a229[(a15 - 12)];
    	a146 = a3[(a15 + -9)];
    	a312 = a382[(a263 + -7)];
    	a360 = (a215 - 1);
    	a116 = "g";
    	a295 = ((((((a295 * a390) % 14999) / 5) % 62) - 45) - 1);
    	a235 = a324;
    	a212 = ((a263 - a215) + 12);
    	a381 = a218[(a360 + -8)];
    	a215 = (a15 + -2); 
    	output = "W";
    } 
    if(((((a215 == 10) && ((a146 == a3[7] && ((cf && input.equals(inputs[4])) && (a15 == 13))) && (82 == a246[2]))) && a244 <=  94) && (((a201 == 6) && ((a310.equals("e")) && a19 <=  14)) && (85 == a377[3])))) {
    	cf = false;
    	a349 = (((((((a349 * a244) % 14999) % 109) - -134) * 1) - 8818) - -8818);
    	a117 = a178[((a15 - a15) + 1)];
    	a15 = ((a215 - a212) + 11);
    	a400 = ((((((a400 * a295) % 14999) % 13) + -91) + -1804) - -1805);
    	a365 = "g";
    	a215 = (a263 - -4);
    	a244 = (((((((a244 * a280) % 14999) * 2) * 1) + 1) % 23) + 118);
    	a390 = ((((((a280 * a19) % 14999) % 37) - -288) - -2) - 1); 
    	output = "Z";
    } 
    if(((((56 == a320[1]) && (85 == a377[3])) && a353 == a343[0]) && (a391 == a392[0] && (a400 <=  -103 && (input.equals(inputs[1]) && (a19 <=  14 && (((a15 == 13) && (cf && a146 == a3[7])) && (a337 == 6)))))))) {
    	cf = false;
    	a246 = a358;
    	a291 = a307[(a337 - 5)];
    	a215 = (a15 - 2);
    	a280 = (((((((a279 * a279) % 14999) + 12430) + 1622) + -39141) % 39) + 352);
    	a310 = "f";
    	a320 = a372;
    	a261 = a229[((a263 + a215) - 18)];
    	a400 = ((((((a400 * a279) % 14999) - 3257) % 13) + -81) * 1);
    	a340 = a245[(a215 - 10)];
    	a333 = "f";
    	a349 = (((((((a349 * a244) % 14999) % 109) + 134) * 5) % 109) + 85);
    	a116 = "f";
    	a353 = a343[(a215 / a337)];
    	a128 = (a263 + -4);
    	a365 = "g";
    	a373 = (a337 + -3);
    	a235 = a374;
    	a146 = a3[((a212 * a337) + -50)];
    	a381 = a218[(a373 - 1)];
    	a212 = ((a215 + a360) - 9);
    	a391 = a392[(a215 - 10)];
    	a283 = "f";
    	a278 = "f";
    	a295 = ((((((a295 * a390) % 14999) - 3613) - -29296) % 62) - 101);
    	a266 = a211;
    	a312 = a382[(a360 + -7)];
    	a360 = (a263 - -1);
    	a377 = a366;
    	a237 = a265;
    	a201 = (a263 - 1);
    	a244 = ((((((a244 * a19) % 14999) * 2) % 23) - -117) - 0);
    	a285 = "f";
    	a263 = ((a215 / a215) - -8);
    	a337 = (a215 - 4); 
    	output = "Z";
    } 
}
private  void calculateOutputm235(String input) {
    if(((((90 == a399[4]) && a381 == a218[0]) && (82 == a246[2])) && ((a365.equals("e")) && ((a353 == a343[0] && ((input.equals(inputs[0]) && (((14 < a19) && (105 >= a19)) && (cf && (a15 == 13)))) && a146 == a3[7])) && a261 == a229[0])))) {
    	cf = false;
    	a320 = a372;
    	a261 = a229[((a373 + a263) + -9)];
    	a312 = a382[(a373 - 1)];
    	a360 = (a215 + -1);
    	a280 = ((((((a280 * a349) % 14999) / 5) % 63) - -220) - -2);
    	a285 = "f";
    	a201 = (a373 + 5);
    	a109 = ((a373 * a215) + -16);
    	a146 = a3[(a109 - -1)];
    	a373 = (a360 + -6);
    	a291 = a307[(a212 - 8)];
    	a215 = ((a337 / a337) + 10);
    	a365 = "f";
    	a82 = a18;
    	a340 = a245[((a15 + a15) - 25)];
    	a381 = a218[((a337 + a337) - 13)];
    	a353 = a343[(a337 - 6)]; 
    	output = "S";
    } 
    if(((((a146 == a3[7] && (cf && ((14 < a19) && (105 >= a19)))) && (82 == a246[2])) && input.equals(inputs[3])) && (a340 == a245[0] && ((a15 == 13) && ((a310.equals("e")) && ((90 == a399[4]) && ((a360 == 8) && (a365.equals("e"))))))))) {
    	cf = false;
    	a291 = a307[(a212 - 8)];
    	a237 = a265;
    	a116 = "f";
    	a353 = a343[(a212 + -8)];
    	a391 = a392[(a263 - 7)];
    	a128 = (a212 + -5);
    	a320 = a372;
    	a280 = (((((((a280 * a400) % 14999) + -2081) / 5) - -7090) % 39) - -292);
    	a365 = "g";
    	a377 = a366;
    	a310 = "f";
    	a381 = a218[((a15 / a15) - -1)];
    	a333 = "f";
    	a285 = "f";
    	a201 = (a373 + 5);
    	a360 = a212;
    	a146 = a3[((a373 + a128) + -2)];
    	a373 = ((a215 * a201) + -67);
    	a399 = a251;
    	a235 = a374;
    	a295 = (((((a19 * a19) - 16794) % 62) + 6) / 5);
    	a261 = a229[((a337 * a263) - 55)];
    	a390 = ((((((a19 * a19) % 87) - -135) / 5) + -17930) - -18079);
    	a246 = a358;
    	a263 = ((a212 - a212) + 9);
    	a340 = a245[(a360 / a212)];
    	a215 = (a212 - -2);
    	a312 = a382[(a212 + -8)];
    	a266 = a211;
    	a278 = "f";
    	a349 = ((((((a349 * a19) % 14999) + -3806) / 5) % 109) - -132);
    	a212 = ((a360 * a360) + -71); 
    	output = "S";
    } 
    if((((((a146 == a3[7] && (input.equals(inputs[4]) && (((14 < a19) && (105 >= a19)) && cf))) && (90 == a399[4])) && a340 == a245[0]) && a291 == a307[0]) && (a381 == a218[0] && ((a391 == a392[0] && (a15 == 13)) && (a373 == 2))))) {
    	cf = false;
    	a337 = a201;
    	a399 = a251;
    	a117 = a178[(a373 + -1)];
    	a15 = ((a263 + a201) - 2);
    	a365 = "g";
    	a291 = a307[(a263 + -6)];
    	a283 = "e";
    	a349 = ((((((a349 * a280) % 14999) - -3101) % 109) + 132) - 0);
    	a215 = ((a360 / a212) - -12); 
    	output = "X";
    } 
}
private  void calculateOutputm48(String input) {
    if((((cf && a19 <=  14) && (a285.equals("e"))) && (((a365.equals("e")) && (a381 == a218[0] && (a261 == a229[0] && (a263 == 8)))) && a295 <=  -110))) {
    	calculateOutputm234(input);
    } 
    if((((a285.equals("e")) && ((a201 == 6) && (a261 == a229[0] && (a278.equals("e"))))) && ((a373 == 2) && ((((14 < a19) && (105 >= a19)) && cf) && a280 <=  156)))) {
    	calculateOutputm235(input);
    } 
}
private  void calculateOutputm241(String input) {
    if(((((a146 == a3[7] && ((a15 == 14) && (input.equals(inputs[2]) && ((a379 == 9) && cf)))) && (a263 == 8)) && (a283.equals("e"))) && ((((a212 == 9) && (a310.equals("e"))) && a261 == a229[0]) && a312 == a382[0]))) {
    	cf = false;
    	a109 = (a15 + -10);
    	a146 = a3[((a201 - a201) - -5)];
    	a82 = a10; 
    	output = "U";
    } 
    if(((a279 <=  105 && ((a201 == 6) && (85 == a377[3]))) && (a391 == a392[0] && ((a333.equals("e")) && (((((cf && a146 == a3[7]) && input.equals(inputs[1])) && a381 == a218[0]) && (a379 == 9)) && (a15 == 14)))))) {
    	cf = false;
    	a24 = (a15 + -2);
    	a283 = "e";
    	a235 = a240;
    	a244 = ((((a244 % 14871) - -15127) - -2) - 0);
    	a373 = 7;
    	a377 = a281;
    	a312 = a382[7];
    	a310 = "g";
    	a237 = a328;
    	a320 = a299;
    	a340 = a245[5];
    	a399 = a269;
    	a266 = a221;
    	a291 = a307[3];
    	a337 = 6;
    	a295 = ((((a295 % 95) - -165) + 2293) + -2284);
    	a333 = "h";
    	a215 = 14;
    	a278 = "g";
    	a391 = a392[7];
    	a360 = 10;
    	a349 = ((((((a349 % 72) - -317) - -1) * 5) % 72) + 262);
    	a390 = ((((a390 % 14836) + 15162) * 1) - -2);
    	a261 = a229[1];
    	a279 = ((((a279 + 19119) % 14833) + 15166) - -1);
    	a280 = ((((a280 % 15078) + -14921) + -2) - 0);
    	a246 = a296;
    	a381 = a218[3];
    	a353 = a343[3];
    	a365 = "i";
    	a263 = 12;
    	a212 = 14;
    	a103 = (a201 + 6);
    	a285 = "h";
    	a146 = a3[(a15 - 11)];
    	a400 = (((a400 - 0) + 30050) - -47);
    	a201 = 13; 
    	output = "W";
    } 
    if((((a337 == 6) && (a209.equals("e"))) && ((((18 == a266[5]) && (((a379 == 9) && (a146 == a3[7] && ((cf && input.equals(inputs[7])) && (a15 == 14)))) && a400 <=  -103)) && a295 <=  -110) && a390 <=  75))) {
    	cf = false;
    	a280 = (((a280 / 5) + 29930) * 1);
    	a399 = a344;
    	a263 = 15;
    	a136 = (a15 + -6);
    	a312 = a382[1];
    	a167 = (a201 + -4);
    	a377 = a366;
    	a215 = 17;
    	a283 = "f";
    	a340 = a245[4];
    	a235 = a324;
    	a209 = "i";
    	a320 = a372;
    	a400 = (((((a400 % 13) + -75) / 5) * 59) / 10);
    	a146 = a3[((a379 * a167) - 16)];
    	a212 = 14;
    	a291 = a307[6];
    	a285 = "f";
    	a373 = 6;
    	a337 = 13;
    	a279 = (((((a279 % 15052) - 14946) + 1905) - 680) - 1227);
    	a246 = a296;
    	a244 = (((((a244 % 15047) - 14952) - 1) - -18570) - 18570);
    	a261 = a229[3];
    	a310 = "i";
    	a360 = 14;
    	a381 = a218[6];
    	a349 = ((((a349 % 15011) + -14987) + -3) / 5);
    	a353 = a343[3];
    	a390 = ((((a390 % 15037) - 14961) - -17225) + -17226);
    	a266 = a211;
    	a391 = a392[6];
    	a365 = "f";
    	a278 = "h";
    	a237 = a336;
    	a295 = ((((a295 + 0) * 1) % 14895) - -15103);
    	a333 = "i";
    	a201 = 9; 
    	output = "W";
    } 
    if(((a146 == a3[7] && (a381 == a218[0] && (((((cf && input.equals(inputs[3])) && (a15 == 14)) && (a285.equals("e"))) && (a337 == 6)) && a291 == a307[0]))) && ((a379 == 9) && ((a209.equals("e")) && (a278.equals("e")))))) {
    	cf = false;
    	a320 = a217;
    	a390 = ((((a390 - 0) % 14836) - -15162) * 1);
    	a201 = 10;
    	a312 = a382[7];
    	a50 = a0[(a212 / a215)];
    	a391 = a392[0];
    	a373 = 8;
    	a399 = a251;
    	a266 = a236;
    	a291 = a307[5];
    	a212 = 15;
    	a333 = "i";
    	a24 = a360;
    	a360 = 8;
    	a146 = a3[(a337 - 3)];
    	a400 = ((((a400 * 1) - -7079) % 53) - 20);
    	a285 = "i";
    	a261 = a229[5];
    	a246 = a296;
    	a278 = "i";
    	a381 = a218[3];
    	a295 = ((((a295 * 1) % 14895) - -15103) + 14398);
    	a235 = a374;
    	a353 = a343[5];
    	a310 = "h";
    	a340 = a245[0];
    	a263 = 10;
    	a215 = 17;
    	a279 = ((((a279 * 1) % 15052) - 14946) - 2);
    	a244 = ((((a244 / 5) / 5) + -16085) - -41522);
    	a349 = ((((a349 % 72) + 316) / 5) + 301);
    	a209 = "i";
    	a365 = "g";
    	a377 = a281;
    	a337 = 8; 
    	output = "S";
    } 
    if(((((a379 == 9) && (((a15 == 14) && (a146 == a3[7] && cf)) && a244 <=  94)) && a312 == a382[0]) && (((a333.equals("e")) && (((a285.equals("e")) && a280 <=  156) && a279 <=  105)) && input.equals(inputs[6])))) {
    	cf = false;
    	if((326 < a390 || (65 == a82[5]))) {
    	a295 = (((((a295 % 14895) - -15103) * 10) / 9) + 12882);
    	a381 = a218[7];
    	a146 = a3[(a15 - 10)];
    	a280 = ((((a280 / 5) + -280) - -667) + -9582);
    	a244 = ((((a244 % 15047) - 14952) - 2) + 0);
    	a266 = a221;
    	a285 = "e";
    	a353 = a343[4];
    	a209 = "i";
    	a340 = a245[3];
    	a201 = 6;
    	a312 = a382[5];
    	a360 = 13;
    	a349 = (((((a349 - 0) % 72) + 315) - 17663) + 17663);
    	a261 = a229[3];
    	a128 = a263;
    	a237 = a336;
    	a279 = ((((a279 % 15052) + -14946) / 5) + -10498);
    	a337 = 8;
    	a320 = a217;
    	a212 = 15;
    	a291 = a307[7];
    	a246 = a332;
    	a278 = "e";
    	a391 = a392[5];
    	a310 = "g";
    	a283 = "i";
    	a365 = "e";
    	a373 = 5;
    	a377 = a281;
    	a116 = "f";
    	a400 = (((a400 / 5) + 8962) * 3);
    	a390 = ((((a390 / 5) - -11527) * 10) / 9);
    	a235 = a374;
    	a215 = 15;
    	a333 = "e";
    	a399 = a344;
    	a263 = 10; 
    	}else {
    	a209 = "h";
    	a391 = a392[6];
    	a17 = "i";
    	a302 = "e";
    	a146 = a3[(a215 + -10)];
    	}output = "X";
    } 
    if(((((input.equals(inputs[0]) && ((a379 == 9) && (a146 == a3[7] && cf))) && (a360 == 8)) && a280 <=  156) && ((41 == a235[0]) && ((((18 == a266[5]) && (a15 == 14)) && a353 == a343[0]) && (a285.equals("e")))))) {
    	cf = false;
    	if(a353 == a343[6]) {
    	a116 = "h";
    	a325 = "h";
    	a146 = a3[(a373 + 2)]; 
    	}else {
    	a19 = (((((((a390 * a244) % 14999) % 91) - -197) * 1) - -14811) - 14809);
    	a15 = (a379 - -4);
    	}output = "Z";
    } 
    if((((a201 == 6) && ((a379 == 9) && (a146 == a3[7] && ((cf && (a15 == 14)) && input.equals(inputs[8]))))) && (((a310.equals("e")) && (((a337 == 6) && (a365.equals("e"))) && (a212 == 9))) && a291 == a307[0]))) {
    	cf = false;
    	a379 = ((a337 / a15) - -7); 
    	output = "U";
    } 
    if(((a291 == a307[0] && ((((a379 == 9) && (a146 == a3[7] && (input.equals(inputs[4]) && cf))) && (90 == a399[4])) && (82 == a246[2]))) && ((((a373 == 2) && (a15 == 14)) && (a365.equals("e"))) && (a285.equals("e"))))) {
    	cf = false;
    	a133 = "g";
    	a146 = a3[(a379 + -8)];
    	a56 = (((((12 + -13525) + 13798) * 5) * 2) / 10); 
    	output = "V";
    } 
    if((((a146 == a3[7] && (((a15 == 14) && ((a379 == 9) && cf)) && a312 == a382[0])) && (a201 == 6)) && ((a291 == a307[0] && ((a310.equals("e")) && (a390 <=  75 && a279 <=  105))) && input.equals(inputs[5])))) {
    	cf = false;
    	a349 = (((((a349 % 72) + 316) / 5) / 5) + 259);
    	a146 = a3[((a201 + a15) - 17)];
    	a353 = a343[4];
    	a312 = a382[3];
    	a399 = a344;
    	a246 = a296;
    	a291 = a307[5];
    	a391 = a392[7];
    	a337 = 9;
    	a278 = "e";
    	a263 = 15;
    	a215 = 10;
    	a295 = (((((a295 % 95) + 112) - 11439) + 19935) + -8426);
    	a333 = "g";
    	a400 = ((((a400 * 1) % 53) + 10) + 22);
    	a381 = a218[7];
    	a103 = ((a360 - a201) + 10);
    	a310 = "h";
    	a24 = a103;
    	a212 = 14;
    	a261 = a229[7];
    	a201 = 8;
    	a320 = a299;
    	a285 = "i";
    	a279 = ((((a279 % 15052) + -14946) + -3) + 0);
    	a365 = "h";
    	a340 = a245[2];
    	a266 = a236;
    	a390 = ((((((a390 % 37) - -289) - 1) * 5) % 37) + 277);
    	a283 = "h";
    	a377 = a281;
    	a244 = ((((a244 % 15047) + -14952) + -1) - 1);
    	a373 = 4;
    	a280 = (((((a280 % 14817) - -15181) * 1) - 8506) + 8509);
    	a235 = a374;
    	a237 = a336;
    	a360 = 11; 
    	output = "S";
    } 
    if((((a279 <=  105 && ((a379 == 9) && (a146 == a3[7] && cf))) && (a212 == 9)) && (a261 == a229[0] && (((((a15 == 14) && a381 == a218[0]) && input.equals(inputs[9])) && (a360 == 8)) && (a365.equals("e")))))) {
    	cf = false;
    	if((((a167 == 2) && (!(a117 == a178[0]) || (((14 < a19) && (105 >= a19)) && ((-194 < a1) && (-114 >= a1))))) && !(82 == a246[2]))) {
    	a56 = (((((((a349 * a349) % 14999) * 2) % 82) - -126) + -17925) + 17927);
    	a146 = a3[(a15 + -13)];
    	a127 = a29[(a337 + -2)]; 
    	}else {
    	a17 = "h";
    	a189 = "i";
    	a146 = a3[(a337 + -6)];
    	}output = "T";
    } 
}
private  void calculateOutputm242(String input) {
    if(((((input.equals(inputs[1]) && ((85 == a377[3]) && ((a15 == 14) && (a365.equals("e"))))) && (56 == a320[1])) && (a285.equals("e"))) && ((a212 == 9) && ((a263 == 8) && ((a379 == 10) && (cf && a146 == a3[7])))))) {
    	cf = false;
    	a15 = (a379 + 2);
    	a266 = a236;
    	a390 = ((((((((a390 * a280) % 14999) % 37) - -289) - -1) * 5) % 37) - -274);
    	a291 = a307[((a360 - a15) - -6)];
    	a261 = a229[(a373 + -2)];
    	a399 = a251;
    	a365 = "g";
    	a349 = ((((((a349 * a295) % 14999) % 109) - -134) * 1) + 1);
    	a400 = ((((((a400 * a279) % 14999) + -12447) % 13) + -87) + -3);
    	a117 = a178[(a373 + -1)];
    	a201 = (a215 + -4);
    	a279 = ((((((a279 * a280) % 14999) % 57) - -164) * 1) + 1);
    	a215 = (a373 + 10); 
    	output = "W";
    } 
    if((((90 == a399[4]) && (a209.equals("e"))) && ((((((a291 == a307[0] && (((a379 == 10) && cf) && (a15 == 14))) && a312 == a382[0]) && input.equals(inputs[8])) && a146 == a3[7]) && (41 == a235[0])) && a391 == a392[0]))) {
    	cf = false;
    	a365 = "g";
    	a266 = a236;
    	a399 = a269;
    	a190 = "e";
    	a377 = a281;
    	a237 = a328;
    	a312 = a382[((a373 - a15) + 14)];
    	a136 = (a263 + 1);
    	a285 = "g";
    	a320 = a299;
    	a280 = (((((((a280 * a390) % 14999) / 5) / 5) / 5) % 39) + 324);
    	a146 = a3[((a136 / a373) + -2)];
    	a381 = a218[((a136 + a360) - 15)];
    	a337 = (a136 - 1);
    	a310 = "g";
    	a215 = ((a373 - a136) - -19); 
    	output = "S";
    } 
    if(((((input.equals(inputs[4]) && (((a379 == 10) && cf) && (a15 == 14))) && a279 <=  105) && ((a285.equals("e")) && (((a280 <=  156 && (a146 == a3[7] && (18 == a266[5]))) && (a373 == 2)) && a381 == a218[0]))) && a154 >= 6)) {
    	cf = false;
    	a246 = a332;
    	a146 = a3[((a379 + a379) - 18)];
    	a312 = a382[(a263 + -6)];
    	a136 = ((a360 - a337) + 4);
    	a399 = a269;
    	a381 = a218[(a201 - 6)];
    	a360 = a215;
    	a310 = "g";
    	a285 = "g";
    	a215 = ((a337 / a212) - -12);
    	a180 = (((39 / 5) + -26897) + -3062);
    	a266 = a236;
    	a390 = ((((((a390 * a295) % 14999) - -13682) % 37) - -288) * 1);
    	a391 = a392[(a201 + -6)];
    	a337 = (a212 - 1);
    	a212 = (a15 - 3); 
    	output = "Z";
    } 
    if(((input.equals(inputs[9]) && ((((a15 == 14) && (a146 == a3[7] && cf)) && a295 <=  -110) && a349 <=  23)) && (((a379 == 10) && (((a365.equals("e")) && a400 <=  -103) && a390 <=  75)) && a340 == a245[0]))) {
    	cf = false;
    	a333 = "e";
    	a353 = a343[(a263 + -8)];
    	a244 = (((((((a279 * a279) % 14999) % 23) - -118) / 5) * 10) / 2); 
    	output = "Z";
    } 
}
private  void calculateOutputm49(String input) {
    if((((90 == a399[4]) && ((a212 == 9) && (((a379 == 9) && cf) && a280 <=  156))) && (((a263 == 8) && (a285.equals("e"))) && a295 <=  -110))) {
    	calculateOutputm241(input);
    } 
    if((((a263 == 8) && ((18 == a266[5]) && ((cf && (a379 == 10)) && a349 <=  23))) && ((a381 == a218[0] && (82 == a246[2])) && (a337 == 6)))) {
    	calculateOutputm242(input);
    } 
}



@Override public void calculateOutput(String input) {
 	cf = true;
    if(((((18 == a266[5]) && (a215 == 10)) && a291 == a307[0]) && ((a360 == 8) && (((85 == a377[3]) && (a146 == a3[0] && cf)) && a381 == a218[0])))) {
    	if((a291 == a307[0] && (((a381 == a218[0] && (((a215 == 10) && ((a17.equals("e")) && cf)) && (a201 == 6))) && a390 <=  75) && (a373 == 2)))) {
    		calculateOutputm1(input);
    	} 
    	if((((a278.equals("e")) && ((a373 == 2) && a349 <=  23)) && (a381 == a218[0] && (((cf && (a17.equals("f"))) && (a263 == 8)) && (85 == a377[3]))))) {
    		calculateOutputm2(input);
    	} 
    	if(((a390 <=  75 && (((cf && (a17.equals("g"))) && a295 <=  -110) && a391 == a392[0])) && (((a285.equals("e")) && a349 <=  23) && (a212 == 9)))) {
    		calculateOutputm3(input);
    	} 
    	if(((((((a17.equals("h")) && cf) && (a285.equals("e"))) && (90 == a399[4])) && (a212 == 9)) && ((a215 == 10) && ((a333.equals("e")) && (85 == a377[3]))))) {
    		calculateOutputm4(input);
    	} 
    	if((((((((a17.equals("i")) && cf) && a295 <=  -110) && (a285.equals("e"))) && (85 == a377[3])) && (a215 == 10)) && ((a201 == 6) && (a278.equals("e"))))) {
    		calculateOutputm5(input);
    	} 
    } 
    if(((50 == a235[3]) && ((((90 == a246[4]) && ((89 == a377[1]) && ((a146 == a3[1] && cf) && (a212 == 10)))) && a312 == a382[1]) && (a360 == 9)))) {
    	if((((cf && a56 <=  44) && ((23 < a349) && (243 >= a349))) && (((105 < a279) && (221 >= a279)) && ((20 == a266[1]) && (a291 == a307[1] && ((a201 == 7) && (a310.equals("f")))))))) {
    		calculateOutputm6(input);
    	} 
    	if((((cf && ((44 < a56) && (210 >= a56))) && (95 == a399[3])) && (a291 == a307[1] && (((a333.equals("f")) && ((a212 == 10) && (a373 == 3))) && (22 == a237[0]))))) {
    		calculateOutputm7(input);
    	} 
    	if(((((352 < a56 && cf) && (a212 == 10)) && ((94 < a244) && (141 >= a244))) && (((((105 < a279) && (221 >= a279)) && ((-110 < a295) && (16 >= a295))) && (90 == a246[4])) && (50 == a235[3])))) {
    		calculateOutputm9(input);
    	} 
    } 
    if(((a381 == a218[2] && (a215 == 12)) && (((((28 == a266[3]) && (a146 == a3[2] && cf)) && (a337 == 8)) && (a285.equals("g"))) && a261 == a229[2]))) {
    	if(((((284 < a280) && (364 >= a280)) && (((a263 == 10) && (a340 == a245[2] && (97 == a377[3]))) && ((243 < a349) && (389 >= a349)))) && ((a285.equals("g")) && (cf && (a136 == 3))))) {
    		calculateOutputm10(input);
    	} 
    	if(((((251 < a390) && (326 >= a390)) && ((28 == a266[3]) && ((a285.equals("g")) && (cf && (a136 == 4))))) && (((97 == a377[3]) && a353 == a343[2]) && (a215 == 12)))) {
    		calculateOutputm11(input);
    	} 
    	if(((((a360 == 10) && ((251 < a390) && (326 >= a390))) && (a212 == 11)) && (a312 == a382[2] && (a391 == a392[2] && (((a136 == 6) && cf) && (a310.equals("g"))))))) {
    		calculateOutputm13(input);
    	} 
    	if(((cf && (a136 == 7)) && ((a278.equals("g")) && ((a365.equals("g")) && (((97 == a377[3]) && ((28 == a266[3]) && (a310.equals("g")))) && a291 == a307[2]))))) {
    		calculateOutputm14(input);
    	} 
    	if((((97 == a246[5]) && (a340 == a245[2] && ((-75 < a400) && (33 >= a400)))) && (((a310.equals("g")) && ((102 == a399[4]) && ((a136 == 8) && cf))) && (a212 == 11)))) {
    		calculateOutputm15(input);
    	} 
    	if((((((((284 < a280) && (364 >= a280)) && (a215 == 12)) && a312 == a382[2]) && (69 == a320[2])) && (a337 == 8)) && (((a136 == 9) && cf) && (97 == a377[3])))) {
    		calculateOutputm16(input);
    	} 
    	if((((97 == a377[3]) && (((((-75 < a400) && (33 >= a400)) && a391 == a392[2]) && (a278.equals("g"))) && (a209.equals("g")))) && ((a373 == 4) && (cf && (a136 == 10))))) {
    		calculateOutputm17(input);
    	} 
    } 
    if((((50 == a235[3]) && (((23 < a349) && (243 >= a349)) && ((-103 < a400) && (-75 >= a400)))) && ((a337 == 7) && ((a365.equals("f")) && (((105 < a279) && (221 >= a279)) && (a146 == a3[3] && cf)))))) {
    	if(((((a209.equals("f")) && (95 == a399[3])) && (a212 == 10)) && ((a201 == 7) && (((90 == a246[4]) && (cf && (a24 == 6))) && ((75 < a390) && (251 >= a390)))))) {
    		calculateOutputm18(input);
    	} 
    	if((((a283.equals("f")) && (cf && (a24 == 7))) && ((a360 == 9) && (a391 == a392[1] && (a261 == a229[1] && (((75 < a390) && (251 >= a390)) && (a333.equals("f")))))))) {
    		calculateOutputm19(input);
    	} 
    	if((((((a360 == 9) && (cf && (a24 == 8))) && a291 == a307[1]) && (20 == a266[1])) && (((a365.equals("f")) && (a373 == 3)) && (a263 == 9)))) {
    		calculateOutputm20(input);
    	} 
    	if(((((22 == a237[0]) && a381 == a218[1]) && ((-110 < a295) && (16 >= a295))) && ((((-103 < a400) && (-75 >= a400)) && (a391 == a392[1] && ((a24 == 9) && cf))) && (a212 == 10)))) {
    		calculateOutputm21(input);
    	} 
    	if(((a291 == a307[1] && (((23 < a349) && (243 >= a349)) && ((a360 == 9) && (a353 == a343[1] && ((a24 == 11) && cf))))) && ((a263 == 9) && (22 == a237[0])))) {
    		calculateOutputm23(input);
    	} 
    	if(((((a283.equals("f")) && (a381 == a218[1] && (((156 < a280) && (284 >= a280)) && (90 == a246[4])))) && a340 == a245[1]) && (((23 < a349) && (243 >= a349)) && ((a24 == 12) && cf)))) {
    		calculateOutputm24(input);
    	} 
    	if((((((a24 == 13) && cf) && (a263 == 9)) && a353 == a343[1]) && (((20 == a266[1]) && ((89 == a377[1]) && ((105 < a279) && (221 >= a279)))) && (a278.equals("f"))))) {
    		calculateOutputm25(input);
    	} 
    } 
    if(((a261 == a229[1] && (a360 == 9)) && (((-110 < a295) && (16 >= a295)) && (a312 == a382[1] && (((cf && a146 == a3[4]) && ((105 < a279) && (221 >= a279))) && ((75 < a390) && (251 >= a390))))))) {
    	if(((a291 == a307[1] && (((a285.equals("f")) && ((a283.equals("f")) && a312 == a382[1])) && (90 == a246[4]))) && ((cf && (a116.equals("e"))) && (a373 == 3)))) {
    		calculateOutputm26(input);
    	} 
    	if((((89 == a377[1]) && ((a283.equals("f")) && ((a310.equals("f")) && (cf && (a116.equals("f")))))) && (a291 == a307[1] && (((75 < a390) && (251 >= a390)) && (a209.equals("f")))))) {
    		calculateOutputm27(input);
    	} 
    	if((((50 == a235[3]) && (cf && (a116.equals("g")))) && ((a215 == 11) && ((((a212 == 10) && (a310.equals("f"))) && a261 == a229[1]) && a312 == a382[1])))) {
    		calculateOutputm28(input);
    	} 
    } 
    if((((a285.equals("f")) && ((a360 == 9) && (a201 == 7))) && (((a261 == a229[1] && (a146 == a3[5] && cf)) && (a365.equals("f"))) && a291 == a307[1]))) {
    	if((((((a201 == 7) && (((105 < a279) && (221 >= a279)) && a353 == a343[1])) && (63 == a320[2])) && ((75 < a390) && (251 >= a390))) && (((a109 == 1) && cf) && ((-110 < a295) && (16 >= a295))))) {
    		calculateOutputm31(input);
    	} 
    	if(((((a333.equals("f")) && ((((a365.equals("f")) && (cf && (a109 == 2))) && a261 == a229[1]) && (a209.equals("f")))) && (95 == a399[3])) && a391 == a392[1])) {
    		calculateOutputm32(input);
    	} 
    	if((((a381 == a218[1] && (((a109 == 4) && cf) && a312 == a382[1])) && a340 == a245[1]) && ((63 == a320[2]) && ((a215 == 11) && a353 == a343[1])))) {
    		calculateOutputm34(input);
    	} 
    	if(((a261 == a229[1] && (((50 == a235[3]) && (a215 == 11)) && (a365.equals("f")))) && (((94 < a244) && (141 >= a244)) && (((a109 == 6) && cf) && ((75 < a390) && (251 >= a390)))))) {
    		calculateOutputm36(input);
    	} 
    	if(((((a312 == a382[1] && (22 == a237[0])) && (a215 == 11)) && (a278.equals("f"))) && ((((a109 == 7) && cf) && (a337 == 7)) && a261 == a229[1]))) {
    		calculateOutputm37(input);
    	} 
    	if((((a333.equals("f")) && (((a310.equals("f")) && (cf && (a109 == 8))) && (a215 == 11))) && (a312 == a382[1] && ((50 == a235[3]) && a340 == a245[1])))) {
    		calculateOutputm38(input);
    	} 
    } 
    if(((((cf && a146 == a3[6]) && a391 == a392[2]) && (a373 == 4)) && ((((102 == a399[4]) && a353 == a343[2]) && (28 == a266[3])) && (a278.equals("g"))))) {
    	if((((((cf && (96 == a76[2])) && a291 == a307[2]) && (a209.equals("g"))) && (a201 == 8)) && (((56 == a235[3]) && a261 == a229[2]) && (a373 == 4)))) {
    		calculateOutputm40(input);
    	} 
    	if(((((221 < a279) && (333 >= a279)) && ((-75 < a400) && (33 >= a400))) && ((((a283.equals("g")) && (((104 == a76[4]) && cf) && (a212 == 11))) && (97 == a246[5])) && ((251 < a390) && (326 >= a390))))) {
    		calculateOutputm41(input);
    	} 
    } 
    if((((a146 == a3[7] && cf) && a340 == a245[0]) && (a312 == a382[0] && (((a212 == 9) && ((20 == a237[4]) && (a278.equals("e")))) && (a360 == 8))))) {
    	if((((a263 == 8) && (a291 == a307[0] && ((82 == a246[2]) && (a310.equals("e"))))) && ((90 == a399[4]) && (((a15 == 7) && cf) && a261 == a229[0])))) {
    		calculateOutputm42(input);
    	} 
    	if((((56 == a320[1]) && (a280 <=  156 && (cf && (a15 == 9)))) && ((a353 == a343[0] && ((a201 == 6) && a390 <=  75)) && (90 == a399[4])))) {
    		calculateOutputm44(input);
    	} 
    	if((((a365.equals("e")) && (cf && (a15 == 10))) && (((((a285.equals("e")) && (90 == a399[4])) && a381 == a218[0]) && a349 <=  23) && a353 == a343[0]))) {
    		calculateOutputm45(input);
    	} 
    	if((((a337 == 6) && ((cf && (a15 == 11)) && (a333.equals("e")))) && ((a209.equals("e")) && ((a310.equals("e")) && (a279 <=  105 && a349 <=  23))))) {
    		calculateOutputm46(input);
    	} 
    	if(((((20 == a237[4]) && ((a212 == 9) && (cf && (a15 == 12)))) && a312 == a382[0]) && ((a310.equals("e")) && ((a283.equals("e")) && (a263 == 8))))) {
    		calculateOutputm47(input);
    	} 
    	if(((((a285.equals("e")) && a349 <=  23) && (a310.equals("e"))) && ((a333.equals("e")) && ((a391 == a392[0] && ((a15 == 13) && cf)) && (56 == a320[1]))))) {
    		calculateOutputm48(input);
    	} 
    	if(((((a283.equals("e")) && (a209.equals("e"))) && (a215 == 10)) && (a291 == a307[0] && ((a310.equals("e")) && ((a360 == 8) && (cf && (a15 == 14))))))) {
    		calculateOutputm49(input);
    	} 
    } 

    errorCheck();
    if(cf)
    	throw new IllegalArgumentException("Current state has no transition for this input!");
}


public static void main(String[] args) throws Exception {
	// init system and input reader
	Problem6 eca = new Problem6();

	// main i/o-loop
	while(true) {
		//read input
		String input = stdin.readLine();

		 if((input.equals("E")) && (input.equals("F")) && (input.equals("A")) && (input.equals("G")) && (input.equals("B")) && (input.equals("H")) && (input.equals("C")) && (input.equals("I")) && (input.equals("J")) && (input.equals("D")))
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
  a155 = "i";
  a291 = 3;
  a189 = "h";
  a162 = 149;
  a10 = new int[] {54,55,56,57,58,59};
  a18 = new int[] {60,61,62,63,64,65};
  a86 = new int[] {66,67,68,69,70,71};
  a82 = a10;
  a166 = 14;
  a56 = 361;
  a337 = 7;
  a29 = new int[] {3,4,5,6,7,8,9,10};
  a349 = 133;
  a391 = 3;
  a340 = 7;
  a278 = "f";
  a343 = new int[] {1,2,3,4,5,6,7,8};
  a207 = new int[] {70,71,72,73,74,75};
  a385 = new int[] {76,77,78,79,80,81};
  a205 = new int[] {82,83,84,85,86,87};
  a282 = a207;
  a148 = new int[] {3,4,5,6,7,8,9,10};
  a215 = 11;
  a365 = "f";
  a50 = 4;
  a244 = 124;
  a316 = "g";
  a0 = new int[] {3,4,5,6,7,8,9,10};
  a344 = new int[] {86,87,88,89,90,91};
  a251 = new int[] {92,93,94,95,96,97};
  a269 = new int[] {98,99,100,101,102,103};
  a399 = a251;
  a1 = -55;
  a240 = new int[] {41,42,43,44,45,46};
  a324 = new int[] {47,48,49,50,51,52};
  a374 = new int[] {53,54,55,56,57,58};
  a235 = a324;
  a338 = 9;
  a178 = new int[] {7,8,9,10,11,12,13,14};
  a124 = new int[] {58,59,60,61,62,63};
  a111 = new int[] {64,65,66,67,68,69};
  a84 = new int[] {70,71,72,73,74,75};
  a33 = a124;
  a373 = 3;
  a79 = "f";
  a279 = 116;
  a209 = "f";
  a67 = new int[] {5,6,7,8,9,10,11,12};
  a333 = "f";
  a24 = 11;
  a146 = 6;
  a204 = new int[] {82,83,84,85,86,87};
  a366 = new int[] {88,89,90,91,92,93};
  a281 = new int[] {94,95,96,97,98,99};
  a377 = a366;
  a95 = "h";
  a167 = 5;
  a217 = new int[] {55,56,57,58,59,60};
  a372 = new int[] {61,62,63,64,65,66};
  a299 = new int[] {67,68,69,70,71,72};
  a320 = a372;
  a295 = -7;
  a129 = 112;
  a180 = 460;
  a400 = -81;
  a285 = "f";
  a30 = 14;
  a127 = 10;
  a48 = new int[] {88,89,90,91,92,93};
  a98 = new int[] {94,95,96,97,98,99};
  a70 = new int[] {100,101,102,103,104,105};
  a76 = a98;
  a263 = 9;
  a193 = 129;
  a116 = "e";
  a177 = 8;
  a109 = 4;
  a156 = 43;
  a133 = "g";
  cf = true;
  a296 = new int[] {80,81,82,83,84,85};
  a358 = new int[] {86,87,88,89,90,91};
  a332 = new int[] {92,93,94,95,96,97};
  a246 = a358;
  a17 = "h";
  a201 = 7;
  a280 = 175;
  a19 = 279;
  a74 = new int[] {13,14,15,16,17,18};
  a28 = new int[] {19,20,21,22,23,24};
  a53 = new int[] {25,26,27,28,29,30};
  a61 = a28;
  a392 = new int[] {2,3,4,5,6,7,8,9};
  a310 = "f";
  a15 = 13;
  a113 = "g";
  a307 = new int[] {2,3,4,5,6,7,8,9};
  a382 = new int[] {5,6,7,8,9,10,11,12};
  a143 = new int[] {41,42,43,44,45,46};
  a2 = new int[] {47,48,49,50,51,52};
  a197 = new int[] {53,54,55,56,57,58};
  a152 = a2;
  a101 = "e";
  a117 = 14;
  a119 = "e";
  a221 = new int[] {13,14,15,16,17,18};
  a211 = new int[] {19,20,21,22,23,24};
  a236 = new int[] {25,26,27,28,29,30};
  a266 = a211;
  a325 = "g";
  a190 = "e";
  a13 = new int[] {39,40,41,42,43,44};
  a99 = new int[] {45,46,47,48,49,50};
  a80 = new int[] {51,52,53,54,55,56};
  a132 = a13;
  a379 = 13;
  a312 = 6;
  a381 = 9;
  a336 = new int[] {16,17,18,19,20,21};
  a265 = new int[] {22,23,24,25,26,27};
  a328 = new int[] {28,29,30,31,32,33};
  a237 = a265;
  a64 = 12;
  a92 = new int[] {76,77,78,79,80,81};
  a112 = new int[] {82,83,84,85,86,87};
  a57 = new int[] {88,89,90,91,92,93};
  a142 = a57;
  a229 = new int[] {5,6,7,8,9,10,11,12};
  a353 = 2;
  a3 = new int[] {1,2,3,4,5,6,7,8};
  a160 = new int[] {46,47,48,49,50,51};
  a165 = new int[] {52,53,54,55,56,57};
  a87 = new int[] {58,59,60,61,62,63};
  a130 = a160;
  a104 = 8;
  a128 = 4;
  a261 = 6;
  a302 = "g";
  a245 = new int[] {6,7,8,9,10,11,12,13};
  a212 = 10;
  a88 = 246;
  a27 = 300;
  a103 = 12;
  a54 = -80;
  a218 = new int[] {8,9,10,11,12,13,14,15};
  a309 = 13;
  a360 = 9;
  a283 = "f";
  a249 = 9;
  a136 = 6;
  a390 = 250;
  a154 = 0;
  a71 = 1;
  a157 = 1;
  a187 = 1;
  a192 = 1;
  a59 = 1;
  a35 = 1;
}}
