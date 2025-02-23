package nl.utwente.fmt.rers.problems.seq;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import lombok.EqualsAndHashCode;
@EqualsAndHashCode(exclude={"stdin", "inputs", "output", "cf"}) public class Problem25 implements Problem {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

	private String[] inputs = {"B","E","C","A","D"};

	private String a160 = "h";
	private int a186 = 201;
	private int a24 = 9;
	private String a178 = "e";
	private int a95 = 1;
	private int a162 = 15;
	private String a35 = "i";
	private int a46 = 9;
	private int a122 = 66;
	private int a97 = 7;
	private int a44 = 151;
	private int a200 = 69;
	private int a88 = 13;
	private int a106 = 10;
	private String a123 = "h";
	private int a48 = -46;
	private int a168 = 6;
	private String a110 = "g";
	private String a131 = "g";
	private int a118 = 8;
	private int a79 = -177;
	private int a140 = 161;
	private int a85 = 256;
	private int a4 = 4;
	private int a9 = 4;
	private int a169 = 146;
	private int a199 = 65;
	private int a101 = 11;
	private int a56 = 5;
	private int a64 = 4;
	private String a6 = "e";
	private int a80 = 157;
	private int a138 = 4;
	private int a98 = 227;
	private int a145 = 185;
	private int a139 = 6;
	private int a31 = 8;
	private int a36 = 8;
	private int a89 = 1;
	private int a15 = -83;
	private int a146 = 399;
	private int a94 = 9;
	private String a105 = "e";
	private String a19 = "h";
	private int a179 = 17;
	private String a197 = "e";
	private int a68 = 11;
	private int a128 = 178;
	private int a156 = 127;
	private int a120 = 330;
	private int a189 = 155;
	private String a154 = "e";
	private int a90 = -139;
	private int a92 = 193;
	private String a75 = "i";
	private int a133 = 7;
	private String a30 = "i";
	private String a20 = "e";
	private int a57 = -164;
	private String a40 = "e";
	private int a121 = 11;
	private int a50 = 6;
	private int a142 = 160;
	private String a167 = "e";
	private String a102 = "e";
	private int a32 = 8;
	private String a183 = "g";
	private int a129 = 4;
	private int a182 = 8;
	private String a164 = "i";
	private int a137 = 137;
	private String a143 = "f";
	private String a96 = "e";
	private int a157 = 342;
	private String a28 = "h";
	private int a172 = 65;
	private String a78 = "e";
	private int a177 = 5;
	private int a114 = 242;
	private int a53 = 199;
	private String a14 = "g";
	private String a161 = "g";
	private String a81 = "e";
	private int a10 = 9;
	private String a39 = "e";
	private int a72 = 118;
	private String a155 = "e";
	private String a86 = "e";
	private int a29 = 12;
	private String a87 = "e";
	private int a193 = 1;
	private int a171 = 158;
	private String a67 = "e";
	private String a0 = "e";
	private String a180 = "g";
	private int a190 = 60;
	private int a153 = 5;
	private int a165 = 184;
	private int a84 = 8;
	private int a49 = 8;
	private int a187 = 1;
	private String a59 = "g";
	private int a176 = -29;
	private int a60 = 130;
	private boolean cf = true;
	private int a191 = 166;
	private int a175 = 4;
	private String a45 = "e";
	private int a41 = -14;
	private String a33 = "h";
	private String a12 = "e";
	private String a100 = "i";
	private int a108 = 126;
	private int a147 = 56;
	private int a51 = 75;
	private int a8 = -12;
	private int a163 = 164;
	private String a185 = "g";
	private String a192 = "i";
	private String a65 = "e";
	private int a152 = 29;
	private int a150 = 8;
	private String a21 = "e";
	private int a159 = 10;
	private int a132 = -142;
	private String a34 = "e";
	private int a141 = 3;
	private int a148 = 12;
	private int a127 = 2;
	private int a151 = 2;
	private int a74 = 1;
	private int a47 = 3;
	private int a103 = 1;
	private int a135 = 1;
	private int a7 = 1;
	private int a170 = 1;

	private void errorCheck() {
	    if(((((a88 == 13) && (a56 == 7)) && (a178.equals("h"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(0);
	    }
	    if((((a152 <=  -104 && 54 < a132) && (a59.equals("f"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(1);
	    }
	    if(((((a110.equals("g")) && ((145 < a44) && (175 >= a44))) && 326 < a122) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(2);
	    }
	    if((((a186 <=  164 && ((228 < a163) && (348 >= a163))) && (a59.equals("e"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(3);
	    }
	    if(((((a45.equals("e")) && a171 <=  -52) && (a100.equals("g"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(4);
	    }
	    if(((((a33.equals("e")) && (a182 == 11)) && (a100.equals("i"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(5);
	    }
	    if(((((a175 == 9) && ((11 < a172) && (199 >= a172))) && (a178.equals("e"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(6);
	    }
	    if(((((a19.equals("h")) && (a178.equals("e"))) && (a59.equals("h"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(7);
	    }
	    if(((((a97 == 11) && ((104 < a176) && (221 >= a176))) && (a100.equals("f"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(8);
	    }
	    if((((((193 < a165) && (278 >= a165)) && 282 < a142) && a122 <=  79) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(9);
	    }
	    if(((((a192.equals("g")) && (a36 == 15)) && (a100.equals("h"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(10);
	    }
	    if(((((a180.equals("g")) && (a56 == 4)) && (a178.equals("h"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(11);
	    }
	    if(((((a97 == 10) && ((104 < a176) && (221 >= a176))) && (a100.equals("f"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(12);
	    }
	    if(((((a180.equals("f")) && (a56 == 4)) && (a178.equals("h"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(13);
	    }
	    if(((((a101 == 9) && (a161.equals("g"))) && ((125 < a122) && (326 >= a122))) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(14);
	    }
	    if((((((16 < a152) && (63 >= a152)) && ((192 < a142) && (282 >= a142))) && a122 <=  79) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(15);
	    }
	    if(((((a30.equals("e")) && (a56 == 6)) && (a178.equals("h"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(16);
	    }
	    if(((((a50 == 9) && a171 <=  -52) && (a178.equals("f"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(17);
	    }
	    if((((a48 <=  -126 && (a29 == 9)) && ((79 < a122) && (125 >= a122))) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(18);
	    }
	    if(((((a175 == 5) && ((278 < a165) && (308 >= a165))) && (a178.equals("i"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(19);
	    }
	    if(((((a162 == 16) && (a56 == 10)) && (a178.equals("h"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(20);
	    }
	    if((((a146 <=  31 && 308 < a165) && (a178.equals("i"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(21);
	    }
	    if((((((-95 < a190) && (32 >= a190)) && (a110.equals("i"))) && (a178.equals("g"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(22);
	    }
	    if((((185 < a190 && (a110.equals("i"))) && (a178.equals("g"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(23);
	    }
	    if(((((a101 == 12) && (a161.equals("g"))) && ((125 < a122) && (326 >= a122))) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(24);
	    }
	    if((((290 < a145 && ((199 < a172) && (335 >= a172))) && (a178.equals("e"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(25);
	    }
	    if(((((a197.equals("f")) && a44 <=  145) && 326 < a122) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(26);
	    }
	    if(((((a110.equals("e")) && ((145 < a44) && (175 >= a44))) && 326 < a122) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(27);
	    }
	    if(((((a4 == 8) && ((-52 < a171) && (126 >= a171))) && (a100.equals("g"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(28);
	    }
	    if(((((a138 == 2) && ((-52 < a171) && (126 >= a171))) && (a178.equals("f"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(29);
	    }
	    if(((((a88 == 9) && (a56 == 7)) && (a178.equals("h"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(30);
	    }
	    if(((((a20.equals("e")) && (a56 == 5)) && (a178.equals("h"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(31);
	    }
	    if(((((a148 == 13) && (a29 == 12)) && ((79 < a122) && (125 >= a122))) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(32);
	    }
	    if(((((a123.equals("h")) && (a185.equals("g"))) && (a100.equals("e"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(33);
	    }
	    if(((((a29 == 15) && ((-131 < a132) && (-54 >= a132))) && (a59.equals("f"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(34);
	    }
	    if((((((-95 < a190) && (32 >= a190)) && (a29 == 14)) && ((79 < a122) && (125 >= a122))) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(35);
	    }
	    if((((((185 < a120) && (322 >= a120)) && (a161.equals("h"))) && ((125 < a122) && (326 >= a122))) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(36);
	    }
	    if((((a114 <=  -74 && (a162 == 10)) && (a59.equals("g"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(37);
	    }
	    if(((((a35.equals("g")) && (a182 == 12)) && (a100.equals("i"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(38);
	    }
	    if(((((a46 == 8) && (a161.equals("f"))) && ((125 < a122) && (326 >= a122))) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(39);
	    }
	    if(((((a97 == 4) && ((104 < a176) && (221 >= a176))) && (a100.equals("f"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(40);
	    }
	    if((((326 < a122 && (a36 == 13)) && (a100.equals("h"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(41);
	    }
	    if(((((a160.equals("g")) && (a182 == 15)) && (a100.equals("i"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(42);
	    }
	    if(((((a46 == 9) && (a161.equals("f"))) && ((125 < a122) && (326 >= a122))) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(43);
	    }
	    if(((((a183.equals("e")) && (a182 == 14)) && (a100.equals("i"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(44);
	    }
	    if(((((a182 == 14) && (a162 == 12)) && (a59.equals("g"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(45);
	    }
	    if(((((a101 == 11) && (a161.equals("g"))) && ((125 < a122) && (326 >= a122))) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(46);
	    }
	    if(((((a24 == 5) && (a36 == 12)) && (a100.equals("h"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(47);
	    }
	    if(((((a175 == 3) && ((278 < a165) && (308 >= a165))) && (a178.equals("i"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(48);
	    }
	    if(((((a133 == 8) && a172 <=  11) && (a178.equals("e"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(49);
	    }
	    if(((((a50 == 12) && a171 <=  -52) && (a178.equals("f"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(50);
	    }
	    if(((((a178.equals("f")) && ((175 < a44) && (354 >= a44))) && 326 < a122) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(51);
	    }
	    if(((((a179 == 10) && ((126 < a171) && (162 >= a171))) && (a100.equals("g"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(52);
	    }
	    if(((((a192.equals("e")) && (a36 == 15)) && (a100.equals("h"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(53);
	    }
	    if(((((a28.equals("g")) && a176 <=  -24) && (a100.equals("f"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(54);
	    }
	    if(((((a138 == 9) && (a185.equals("e"))) && (a100.equals("e"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(55);
	    }
	    if(((((a4 == 5) && ((-52 < a171) && (126 >= a171))) && (a100.equals("g"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(56);
	    }
	    if(((((a101 == 14) && (a161.equals("g"))) && ((125 < a122) && (326 >= a122))) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(57);
	    }
	    if(((((a162 == 15) && a132 <=  -131) && (a59.equals("f"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(58);
	    }
	    if(((((a175 == 10) && ((11 < a172) && (199 >= a172))) && (a178.equals("e"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(59);
	    }
	    if(((((a49 == 3) && (a162 == 13)) && (a59.equals("g"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(60);
	    }
	    if((((a145 <=  106 && ((199 < a172) && (335 >= a172))) && (a178.equals("e"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(61);
	    }
	    if((((((121 < a85) && (212 >= a85)) && (a36 == 11)) && (a100.equals("h"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(62);
	    }
	    if(((((a24 == 6) && (a36 == 12)) && (a100.equals("h"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(63);
	    }
	    if(((((a28.equals("f")) && (a29 == 10)) && ((79 < a122) && (125 >= a122))) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(64);
	    }
	    if((((a122 <=  79 && a157 <=  150) && (a59.equals("i"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(65);
	    }
	    if(((((a50 == 11) && a171 <=  -52) && (a178.equals("f"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(66);
	    }
	    if((((221 < a176 && ((126 < a171) && (162 >= a171))) && (a178.equals("f"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(67);
	    }
	    if((((322 < a120 && (a161.equals("h"))) && ((125 < a122) && (326 >= a122))) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(68);
	    }
	    if(((((a131.equals("i")) && ((331 < a157) && (361 >= a157))) && (a59.equals("i"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(69);
	    }
	    if(((((a97 == 5) && ((104 < a176) && (221 >= a176))) && (a100.equals("f"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(70);
	    }
	    if((((((-126 < a48) && (46 >= a48)) && (a162 == 14)) && (a59.equals("g"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(71);
	    }
	    if((((177 < a72 && (a162 == 17)) && (a59.equals("g"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(72);
	    }
	    if(((((a182 == 10) && (a162 == 12)) && (a59.equals("g"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(73);
	    }
	    if(((((a24 == 3) && (a36 == 12)) && (a100.equals("h"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(74);
	    }
	    if((((((145 < a44) && (175 >= a44)) && (a36 == 9)) && (a100.equals("h"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(75);
	    }
	    if((((((92 < a41) && (202 >= a41)) && (a29 == 11)) && ((79 < a122) && (125 >= a122))) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(76);
	    }
	    if(((((a185.equals("h")) && (a182 == 9)) && (a100.equals("i"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(77);
	    }
	    if(((((a33.equals("g")) && (a182 == 11)) && (a100.equals("i"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(78);
	    }
	    if(((((a162 == 16) && (a110.equals("e"))) && (a178.equals("g"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(79);
	    }
	    if(((((a138 == 3) && ((-52 < a171) && (126 >= a171))) && (a178.equals("f"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(80);
	    }
	    if((((((164 < a186) && (225 >= a186)) && ((228 < a163) && (348 >= a163))) && (a59.equals("e"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(81);
	    }
	    if(((((a121 == 14) && (a161.equals("i"))) && ((125 < a122) && (326 >= a122))) && 225 < a147)){
	    	cf = false;
	    	Errors.__VERIFIER_error(82);
	    }
	    if(((((a183.equals("i")) && (a182 == 14)) && (a100.equals("i"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(83);
	    }
	    if(((((a49 == 7) && (a162 == 13)) && (a59.equals("g"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(84);
	    }
	    if(((((a75.equals("f")) && a165 <=  193) && (a178.equals("i"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(85);
	    }
	    if(((((a179 == 11) && ((126 < a171) && (162 >= a171))) && (a100.equals("g"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(86);
	    }
	    if((((((32 < a190) && (185 >= a190)) && (a110.equals("i"))) && (a178.equals("g"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(87);
	    }
	    if((((a122 <=  79 && (a36 == 13)) && (a100.equals("h"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(88);
	    }
	    if(((((a160.equals("i")) && (a182 == 15)) && (a100.equals("i"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(89);
	    }
	    if(((((a29 == 12) && ((-131 < a132) && (-54 >= a132))) && (a59.equals("f"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(90);
	    }
	    if(((((a29 == 13) && ((-54 < a132) && (54 >= a132))) && (a59.equals("f"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(91);
	    }
	    if(((((a192.equals("h")) && (a36 == 15)) && (a100.equals("h"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(92);
	    }
	    if(((((a29 == 15) && ((-54 < a132) && (54 >= a132))) && (a59.equals("f"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(93);
	    }
	    if(((((a101 == 8) && (a162 == 16)) && (a59.equals("g"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(94);
	    }
	    if(((((a160.equals("e")) && (a182 == 15)) && (a100.equals("i"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(95);
	    }
	    if(((((a179 == 12) && ((126 < a171) && (162 >= a171))) && (a100.equals("g"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(96);
	    }
	    if(((((a175 == 8) && ((278 < a165) && (308 >= a165))) && (a178.equals("i"))) && ((116 < a147) && (225 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(97);
	    }
	    if(((((a164.equals("i")) && 348 < a163) && (a59.equals("e"))) && a147 <=  63)){
	    	cf = false;
	    	Errors.__VERIFIER_error(98);
	    }
	    if(((((a33.equals("h")) && (a182 == 11)) && (a100.equals("i"))) && ((63 < a147) && (116 >= a147)))){
	    	cf = false;
	    	Errors.__VERIFIER_error(99);
	    }
	}private  void calculateOutputm20(String input) {
    if((((a49 == 4) && ((a59.equals("e")) && ((a200 <=  89 && ((a89 == 1) && (a129 == 4))) && a169 <=  154))) && (a147 <=  63 && (a199 <=  68 && (a80 <=  165 && ((a163 <=  183 && cf) && (input.equals("D")))))))) {
    	cf = false;
    	if(((116 < a147) && (225 >= a147))) {
    	a178 = "e";
    	a89 = (a150 - 5);
    	a81 = "f";
    	a169 = (((((((a169 * a163) % 14999) - -7221) / 5) / 5) % 34) - -214);
    	a8 = ((((((a168 * a140) % 14999) - -8739) % 26) - -19) - 0);
    	a67 = "g";
    	a51 = (((((((a156 * a200) % 14999) % 29) + 115) - -17261) / 5) + -3349);
    	a150 = ((a31 + a153) - 3);
    	a154 = "f";
    	a156 = (((((((a15 * a80) % 14999) % 75) - -219) - -2) + 17672) - 17672);
    	a65 = "f";
    	a155 = "g";
    	a200 = (((((((a15 * a137) % 14999) % 61) + 150) - -6331) + 9172) - 15502);
    	a95 = (a129 - 2);
    	a59 = "h";
    	a191 = ((((((a191 * a147) % 14999) - 14995) / 5) % 89) - -275);
    	a86 = "f";
    	a39 = "f";
    	a53 = ((((((a199 * a90) % 14999) + -2983) % 42) + 242) * 1);
    	a64 = (a84 - 3);
    	a187 = ((a118 - a177) - 1);
    	a19 = "g";
    	a193 = (a32 - 5); 
    	}else {
    	a57 = (((37 + -147) - 22293) + 22305);
    	a168 = ((((((a57 * a57) - -6067) + -15222) / 5) % 65) - -265);
    	a141 = ((a89 / a89) + 3);
    	a182 = ((a193 / a89) + 8);
    	a169 = (((((((a169 * a191) % 14999) % 12) - -166) - 0) - -26579) - 26577);
    	a185 = "e";
    	a153 = ((a141 - a182) - -11);
    	a21 = "g";
    	a155 = "g";
    	a128 = (((((((a128 * a57) % 14999) % 91) + 288) + -19936) * 1) - -19936);
    	a67 = "f";
    	a139 = ((a177 / a89) + 2);
    	a96 = "f";
    	a102 = "f";
    	a9 = ((a182 / a182) - -4);
    	a78 = "f";
    	a191 = (((((((a199 * a57) % 14999) % 89) - -276) * 1) + -5731) + 5730);
    	a140 = ((((((a140 * a51) % 14999) % 70) - -248) * 1) * 1);
    	a199 = ((((((((a53 * a53) % 14999) / 5) % 92) + 93) * 5) % 92) - -104);
    	a39 = "f";
    	a15 = ((((((a15 * a137) % 14999) * 2) / 5) % 47) + -28);
    	a137 = ((((((a53 * a53) % 14999) % 41) - -169) - -10369) - 10369);
    	a118 = (a182 + 1);
    	a79 = (((((((a79 * a53) % 14999) - 14179) - -32467) - 31337) % 10) + -140);
    	a40 = "f";
    	a100 = "i";
    	a95 = (a64 - 3);
    	a34 = "f";
    	a0 = "f";
    	a80 = (((((((a80 * a51) % 14999) % 101) + 268) * 5) % 101) - -233);
    	a193 = (a153 - 4);
    	a84 = (a10 - -1);
    	a10 = (a182 - -2);
    	a150 = a182;
    	a147 = (((((((a147 * a163) % 14999) * 2) % 26) - -89) / 5) + 54);
    	a129 = (a49 + 1);
    	a156 = (((((((a156 * a200) % 14999) % 75) - -221) * 5) % 75) - -164);
    	a200 = (((((((a200 * a53) % 14999) % 61) + 151) * 1) + 17752) - 17752);
    	a32 = (a9 - -4);
    	a167 = "g";
    	a90 = ((((((a80 * a51) % 14999) % 68) + -73) / 5) / 5);
    	a31 = (a153 - -3);
    	a89 = (a32 + -6);
    	}output = "S";
    } 
}
private  void calculateOutputm21(String input) {
    if(((((a159 == 10) && (((a40.equals("e")) && ((((183 < a163) && (228 >= a163)) && cf) && a147 <=  63)) && a108 <=  146)) && (input.equals("D"))) && ((((a189 <=  164 && (a12.equals("e"))) && (a59.equals("e"))) && (a95 == 1)) && a168 <=  13))) {
    	cf = false;
    	a100 = "h";
    	a44 = ((((((a163 * a163) % 14999) % 14) + 151) / 5) * 5);
    	a36 = ((a9 / a129) + 8);
    	a147 = (((((((a147 * a189) % 14999) % 26) - -89) - -2751) + -22233) - -19483); 
    	output = "T";
    } 
    if((((((a59.equals("e")) && ((a153 == 5) && (((cf && ((183 < a163) && (228 >= a163))) && (input.equals("C"))) && a90 <=  -131))) && (a155.equals("e"))) && (a167.equals("e"))) && ((a147 <=  63 && (a189 <=  164 && a53 <=  200)) && a168 <=  13))) {
    	cf = false;
    	a147 = (((((((a147 * a80) % 14999) % 26) - -89) - -1) + 7185) + -7185);
    	a100 = "g";
    	a179 = (a150 + 4);
    	a171 = ((((((a163 * a163) % 14999) % 17) - -143) + -22887) - -22885); 
    	output = "Y";
    } 
    if((((a155.equals("e")) && (a200 <=  89 && (a147 <=  63 && (a189 <=  164 && (((a9 == 4) && (a141 == 3)) && (a59.equals("e"))))))) && (((a86.equals("e")) && ((input.equals("B")) && (cf && ((183 < a163) && (228 >= a163))))) && (a96.equals("e"))))) {
    	cf = false;
    	if((a137 <=  157 || (344 < a156 && a60 <=  6))) {
    	a100 = "f";
    	a176 = ((((((a57 * a200) % 14999) / 5) * 5) % 58) - -162);
    	a97 = (a64 + 7);
    	a147 = ((((((a147 * a163) % 14999) % 26) - -90) + -1) + 0); 
    	}else {
    	a171 = ((((((a163 * a189) % 14999) % 88) + 37) - 1) + 0);
    	a100 = "g";
    	a4 = ((a84 / a177) - -7);
    	a147 = ((((((a147 * a156) % 14999) % 26) - -89) * 5) / 5);
    	}output = "Y";
    } 
    if((((((a191 <=  186 && ((a34.equals("e")) && ((cf && a147 <=  63) && a189 <=  164))) && ((183 < a163) && (228 >= a163))) && (a95 == 1)) && (a59.equals("e"))) && ((((a159 == 10) && a90 <=  -131) && a53 <=  200) && (input.equals("E"))))) {
    	cf = false;
    	if((308 < a165 && (((225 < a186) && (414 >= a186)) || (a185.equals("g"))))) {
    	a100 = "e";
    	a138 = (a153 + 4);
    	a185 = "e";
    	a147 = (((((((a147 * a163) % 14999) * 2) + -3) + 0) % 26) - -90); 
    	}else {
    	a176 = ((((((a80 * a147) % 14999) - -6454) - 7005) % 58) - -162);
    	a97 = ((a32 - a153) - -2);
    	a100 = "f";
    	a147 = (((((((a147 * a163) % 14999) % 26) + 89) - -22681) + -19629) + -3050);
    	}output = "Z";
    } 
    if(((((a67.equals("e")) && ((((cf && ((183 < a163) && (228 >= a163))) && (a59.equals("e"))) && a191 <=  186) && (a10 == 9))) && (a86.equals("e"))) && (((input.equals("A")) && (a189 <=  164 && (a15 <=  -76 && a147 <=  63))) && (a129 == 4)))) {
    	cf = false;
    	a176 = ((((((a163 * a147) % 14999) % 58) - -163) / 5) * 5);
    	a100 = "f";
    	a147 = ((((((((a147 * a163) % 14999) % 26) + 90) + 1) * 5) % 26) - -71);
    	a97 = ((a159 + a187) + -6); 
    	output = "S";
    } 
}
private  void calculateOutputm24(String input) {
    if((((((input.equals("E")) && ((a108 <=  146 && (a167.equals("e"))) && a156 <=  144)) && (a40.equals("e"))) && (a81.equals("e"))) && ((a96.equals("e")) && (a147 <=  63 && ((((a59.equals("e")) && cf) && 348 < a163) && (a164.equals("f"))))))) {
    	a151 -= (a151 - 20) < a151 ? 3 : 0;
    	cf = false;
    	a59 = "h";
    	a178 = "e";
    	a19 = "h"; 
    	output = "S";
    } 
    if(((a140 <=  176 && ((input.equals("C")) && (((a164.equals("f")) && (cf && (a59.equals("e")))) && (a167.equals("e"))))) && ((a155.equals("e")) && (((a156 <=  144 && (a147 <=  63 && (a96.equals("e")))) && 348 < a163) && (a141 == 3))))) {
    	cf = false;
    	if(((!(a182 == 8) || ((a167.equals("i")) || (a161.equals("i")))) && !(a29 == 13))) {
    	a155 = "g";
    	a9 = ((a177 / a177) - -4);
    	a89 = (a9 - 3);
    	a79 = (((((((a163 * a168) % 14999) % 90) - 74) + -60) - 2843) + 2901);
    	a139 = ((a89 * a177) + -3);
    	a21 = "f";
    	a39 = "f";
    	a137 = ((((((a137 * a108) % 14999) * 2) * 1) % 41) + 198);
    	a140 = ((((((a140 * a199) % 14999) % 70) - -248) + 1) * 1);
    	a156 = (((((((a156 * a108) % 14999) - 371) % 75) - -219) - 19524) - -19525);
    	a185 = "g";
    	a31 = ((a64 / a64) - -8);
    	a10 = (a64 - -5);
    	a141 = (a10 - 6);
    	a81 = "g";
    	a191 = (((((((a191 * a128) % 14999) % 89) + 275) / 5) - -18613) - 18449);
    	a78 = "f";
    	a187 = (a31 - 6);
    	a123 = "e";
    	a118 = (a177 - -5);
    	a32 = (a64 + 4);
    	a193 = (a177 + -3);
    	a128 = ((((((a140 * a199) % 14999) + -21466) % 91) - -340) - 51);
    	a100 = "e";
    	a108 = (((((((a108 * a8) % 14999) % 22) + 169) / 5) - -731) + -604);
    	a129 = ((a84 / a32) - -5);
    	a102 = "f";
    	a96 = "f";
    	a84 = (a193 - -7);
    	a200 = ((((((((a200 * a15) % 14999) % 61) - -150) + 1) * 5) % 61) - -116);
    	a167 = "f";
    	a177 = ((a150 / a95) + 2);
    	a40 = "g";
    	a147 = ((((((a147 * a163) % 14999) % 26) + 90) * 1) * 1); 
    	}else {
    	a53 = ((((((((a137 * a80) % 14999) % 42) + 243) * 5) * 5) % 42) - -217);
    	a159 = 11;
    	a32 = (a159 - 2);
    	a40 = "g";
    	a78 = "f";
    	a118 = ((a159 + a32) - 11);
    	a139 = (a10 - 2);
    	a39 = "f";
    	a102 = "f";
    	a89 = (a129 - 1);
    	a100 = "i";
    	a31 = a32;
    	a79 = ((((((a168 * a168) % 14999) - 21694) % 10) - 138) * 1);
    	a64 = (a159 + -5);
    	a150 = ((a32 / a32) + 9);
    	a193 = (a139 - 5);
    	a9 = ((a32 + a159) + -15);
    	a96 = "f";
    	a182 = (a84 - -2);
    	a177 = (a118 + -3);
    	a141 = (a95 + 2);
    	a154 = "f";
    	a81 = "f";
    	a21 = "g";
    	a167 = "f";
    	a105 = "g";
    	a84 = ((a9 * a139) - 26);
    	a147 = ((((((a147 * a156) % 14999) - -5806) % 26) - -89) + 2);
    	a200 = (((((((a200 * a128) % 14999) % 61) + 150) - 0) / 5) - -127);
    	a10 = (a118 - -2);
    	a156 = (((((a8 * a8) - -27639) - -45) % 75) - -220);
    	a187 = (a129 - 2);
    	a68 = (a182 - 2);
    	a191 = ((((((a191 * a140) % 14999) % 89) - -276) * 5) / 5);
    	a108 = ((((((a108 * a51) % 14999) + -6396) - 1701) % 97) - -288);
    	a129 = (a187 - -3);
    	a128 = (((((((a128 * a137) % 14999) * 2) % 91) - -288) - -20950) - 20949);
    	a155 = "f";
    	a137 = (((((((a137 * a79) % 14999) % 41) + 199) - 1) / 5) + 169);
    	}output = "S";
    } 
}
private  void calculateOutputm1(String input) {
    if((((((a177 == 5) && (cf && a163 <=  183)) && (a95 == 1)) && a79 <=  -157) && ((a156 <=  144 && (a67.equals("e"))) && a15 <=  -76))) {
    	if((((a177 == 5) && (((cf && (a49 == 4)) && (a84 == 8)) && (a129 == 4))) && ((a78.equals("e")) && ((a150 == 8) && a169 <=  154)))) {
    		calculateOutputm20(input);
    	} 
    } 
    if((((a78.equals("e")) && ((a89 == 1) && (((a21.equals("e")) && (((183 < a163) && (228 >= a163)) && cf)) && (a187 == 1)))) && (a80 <=  165 && (a32 == 8)))) {
    	if((((a79 <=  -157 && (cf && a189 <=  164)) && (a118 == 8)) && (a53 <=  200 && (((a139 == 6) && (a102.equals("e"))) && (a154.equals("e")))))) {
    		calculateOutputm21(input);
    	} 
    } 
    if((((a21.equals("e")) && ((cf && 348 < a163) && (a187 == 1))) && ((a139 == 6) && (((a89 == 1) && (a102.equals("e"))) && a108 <=  146)))) {
    	if(((((a177 == 5) && (a191 <=  186 && ((cf && (a164.equals("f"))) && (a84 == 8)))) && (a141 == 3)) && ((a129 == 4) && a200 <=  89))) {
    		calculateOutputm24(input);
    	} 
    } 
}
private  void calculateOutputm27(String input) {
    if(((((a59.equals("f")) && ((a65.equals("e")) && (((a96.equals("e")) && (a51 <=  86 && (a64 == 4))) && (input.equals("A"))))) && ((((-131 < a132) && (-54 >= a132)) && (a168 <=  13 && ((cf && (a29 == 11)) && a147 <=  63))) && (a6.equals("e")))) && a135 <= -27)) {
    	cf = false;
    	a96 = "f";
    	a36 = ((a153 + a187) + 9);
    	a168 = ((((((a90 * a79) % 14999) % 92) - -33) - -5) - -25);
    	a147 = ((((((a147 * a80) % 14999) + 370) - 9328) % 26) - -90);
    	a51 = (((((((a51 * a147) % 14999) % 29) - -115) - 23226) + -5405) + 28632);
    	a192 = "h";
    	a102 = "f";
    	a15 = (((((((a15 * a169) % 14999) % 47) - 27) + -1) + -2724) + 2723);
    	a118 = (a150 - -1);
    	a128 = (((((((a128 * a199) % 14999) + -2183) + -1069) - -17292) % 91) - -287);
    	a199 = ((((((a53 * a168) % 14999) % 92) + 160) - -20705) - 20702);
    	a193 = ((a139 * a89) + -5);
    	a187 = a95;
    	a39 = "f";
    	a137 = (((((((a137 * a168) % 14999) - -1877) + -834) / 5) % 41) - -198);
    	a100 = "h";
    	a200 = (((((((a200 * a79) % 14999) / 5) * 5) * 2) % 61) + 150);
    	a78 = "f";
    	a34 = "f";
    	a90 = ((((((a90 * a57) % 14999) / 5) % 68) + -92) - 3); 
    	output = "Y";
    } 
    if((((((-131 < a132) && (-54 >= a132)) && (a156 <=  144 && ((a78.equals("e")) && ((((input.equals("E")) && cf) && a147 <=  63) && (a29 == 11))))) && (((a59.equals("f")) && ((a159 == 10) && ((a40.equals("e")) && (a12.equals("e"))))) && a108 <=  146)) && a103 <= -23)) {
    	cf = false;
    	a67 = "f";
    	a80 = ((((((a79 * a168) % 14999) % 101) - -268) + 1748) - 1747);
    	a161 = "h";
    	a159 = ((a29 * a29) + -110);
    	a53 = ((((((a80 * a51) % 14999) - 14666) - -8756) % 42) - -243);
    	a147 = (((((((a147 * a132) % 14999) % 14887) + 15112) * 1) / 5) + 8775);
    	a128 = (((((((a128 * a53) % 14999) % 91) - -287) / 5) / 5) + 325);
    	a96 = "f";
    	a120 = ((((((a199 * a156) % 14999) % 68) + 253) - 0) - -2);
    	a167 = "f";
    	a105 = "f";
    	a177 = (a159 + -5);
    	a122 = ((((((a147 * a120) % 14999) % 100) - -169) - -13057) - 13030);
    	a108 = (((((((a108 * a169) % 14999) % 22) - -168) + -9342) / 5) - -2004);
    	a156 = ((((((a156 * a168) % 14999) - 8638) % 75) - -219) - 0); 
    	output = "T";
    } 
    if((((((-131 < a132) && (-54 >= a132)) && ((((a89 == 1) && (a29 == 11)) && (a59.equals("f"))) && (a78.equals("e")))) && (a65.equals("e"))) && ((a167.equals("e")) && ((a79 <=  -157 && ((cf && (input.equals("D"))) && a147 <=  63)) && (a187 == 1))))) {
    	cf = false;
    	a138 = ((a150 * a193) + -5);
    	a199 = ((((((a199 * a80) % 14999) % 10) - -265) - -21913) + -21913);
    	a21 = "g";
    	a57 = (((((((a79 * a156) % 14999) * 2) - -1) + 1) % 18) + -48);
    	a167 = "g";
    	a67 = "g";
    	a139 = (a129 - -2);
    	a39 = "g";
    	a78 = "g";
    	a40 = "g";
    	a178 = "f";
    	a128 = ((((((a128 * a132) % 14999) / 5) % 72) - -453) - 1);
    	a15 = (((((((a15 * a147) % 14999) - -11624) / 5) / 5) % 20) + 41);
    	a79 = ((((((((a79 * a200) % 14999) * 2) % 90) - 44) * 5) % 90) + -44);
    	a108 = (((((((a108 * a140) % 14999) % 97) + 289) + -13478) + -10011) - -23488);
    	a187 = (a139 + -5);
    	a6 = "g";
    	a12 = "g";
    	a171 = (((((((a147 * a147) % 14999) % 88) + 37) + 2) + -19884) + 19881);
    	a147 = (((((((a147 * a90) % 14999) % 54) + 171) / 5) + -4016) - -4112);
    	a53 = ((((((a53 * a169) % 14999) * 2) % 47) - -335) + 1); 
    	output = "S";
    } 
    if(((((a65.equals("e")) && ((a29 == 11) && (((((-131 < a132) && (-54 >= a132)) && cf) && (a59.equals("f"))) && a147 <=  63))) && (a177 == 5)) && (((a137 <=  157 && (a53 <=  200 && a169 <=  154)) && (input.equals("C"))) && a90 <=  -131))) {
    	cf = false;
    	a8 = (((((((a156 * a140) % 14999) * 2) + -1) - 0) % 26) + 19);
    	a86 = "f";
    	a12 = "f";
    	a39 = "f";
    	a108 = (((((((a168 * a168) % 14999) % 22) - -168) * 1) / 5) - -145);
    	a78 = "f";
    	a84 = ((a150 + a139) - 6);
    	a40 = "f";
    	a96 = "f";
    	a159 = ((a89 + a89) + 9);
    	a102 = "f";
    	a168 = ((((((a79 * a108) % 14999) % 92) - -105) - 0) * 1);
    	a67 = "f";
    	a177 = ((a153 / a153) + 5);
    	a100 = "i";
    	a53 = ((((((((a132 * a108) % 42) - -279) * 9) / 10) / 5) * 48) / 10);
    	a65 = "f";
    	a182 = ((a10 + a29) + -10);
    	a137 = ((((((((a53 * a128) % 14999) % 41) - -198) + 0) * 5) % 41) - -177);
    	a15 = ((((((a15 * a156) % 14999) % 47) + -27) + -2) + 0);
    	a147 = (((((((a147 * a199) % 14999) + -3621) % 26) - -90) + 6182) + -6182);
    	a141 = (a187 - -2);
    	a90 = ((((((a90 * a137) % 14999) % 68) - 62) - 1) + 1);
    	a105 = "f";
    	a64 = (a84 - 4);
    	a10 = (a31 - -1);
    	a118 = (a95 + 6);
    	a140 = (((((((a140 * a57) % 14999) * 2) + -1) - 0) % 70) + 247);
    	a169 = (((((((a169 * a191) % 14999) % 12) + 166) * 5) % 12) - -159);
    	a51 = (((((((a51 * a137) % 14999) % 29) + 116) + 1) / 5) - -85);
    	a150 = (a153 + 4);
    	a156 = (((((((a199 * a200) % 14999) % 75) - -219) - -2) / 5) - -180);
    	a34 = "f";
    	a199 = ((((((a199 * a80) % 14999) * 2) - 2) % 92) + 162);
    	a129 = (a32 - 4);
    	a80 = (((((((a80 * a108) % 14999) - 2729) - -10500) / 5) % 101) + 267);
    	a68 = (a182 + 2); 
    	output = "Y";
    } 
}
private  void calculateOutputm30(String input) {
    if((((a137 <=  157 && ((a59.equals("f")) && ((a29 == 10) && cf))) && a168 <=  13) && ((a153 == 5) && ((a129 == 4) && ((input.equals("D")) && ((((a193 == 1) && ((-54 < a132) && (54 >= a132))) && (a40.equals("e"))) && a147 <=  63)))))) {
    	cf = false;
    	a65 = "f";
    	a105 = "f";
    	a57 = ((((((a57 * a132) % 14999) % 18) + -49) + -1) * 1);
    	a81 = "f";
    	a53 = ((((((a15 * a80) % 14999) % 42) + 242) + 15646) - 15644);
    	a86 = "f";
    	a163 = ((((((a147 * a147) % 14999) / 5) + 19479) / 5) + -6976);
    	a51 = (((((((a199 * a137) % 14999) % 29) + 115) / 5) * 5) + 4);
    	a6 = "f";
    	a154 = "f";
    	a49 = (a159 + -6);
    	a12 = "f";
    	a59 = "e";
    	a64 = (a118 + -3);
    	a187 = ((a193 / a193) - -1); 
    	output = "Z";
    } 
    if(((((a84 == 8) && (((a64 == 4) && a191 <=  186) && a79 <=  -157)) && a169 <=  154) && ((input.equals("A")) && ((((a118 == 8) && ((cf && (a59.equals("f"))) && ((-54 < a132) && (54 >= a132)))) && (a29 == 10)) && a147 <=  63)))) {
    	cf = false;
    	a150 = ((a29 + a118) - 8);
    	a153 = (a150 - 3);
    	a34 = "g";
    	a180 = "e";
    	a141 = ((a150 + a29) + -17);
    	a67 = "g";
    	a159 = (a150 + 2);
    	a95 = (a153 - 4);
    	a57 = (((((((a57 * a53) % 14999) + -5172) % 40) + -78) - 4575) - -4544);
    	a12 = "g";
    	a79 = ((((((a79 * a132) % 14999) % 90) + -42) + -2) / 5);
    	a168 = (((((((a168 * a128) % 14999) + 2641) % 65) + 264) + -18904) - -18904);
    	a169 = ((((((a169 * a137) % 14999) * 2) % 34) - -214) + -1);
    	a147 = ((((((((a147 * a132) % 14999) * 2) % 54) - -171) * 5) % 54) - -135);
    	a32 = (a118 + 2);
    	a80 = ((((((a132 * a132) % 52) - -422) * 1) + 2651) + -2650);
    	a108 = (((((a200 * a132) % 14999) + -5659) - 9307) * 1);
    	a56 = a129;
    	a6 = "f";
    	a40 = "g";
    	a15 = ((((((a15 * a191) % 14999) % 47) - 28) + -1) - -1);
    	a140 = (((((((a140 * a53) % 14999) % 59) + 378) - 29960) * 1) + 29960);
    	a84 = a32;
    	a139 = a118;
    	a89 = (a29 + -7);
    	a178 = "h";
    	a64 = (a89 + 2);
    	a199 = ((((((a199 * a200) % 14999) + -13398) % 92) + 161) + 1);
    	a90 = (((((((a80 * a132) * 1) % 68) + -62) * 5) % 68) + -61);
    	a21 = "g";
    	a129 = (a139 + -2);
    	a0 = "g";
    	a10 = ((a29 - a193) - -2);
    	a78 = "g";
    	a167 = "g";
    	a81 = "g";
    	a118 = a29; 
    	output = "U";
    } 
}
private  void calculateOutputm31(String input) {
    if(((((input.equals("A")) && ((a67.equals("e")) && a147 <=  63)) && (a78.equals("e"))) && (a90 <=  -131 && (((a102.equals("e")) && ((a59.equals("f")) && ((((a29 == 12) && cf) && ((-54 < a132) && (54 >= a132))) && (a141 == 3)))) && (a6.equals("e")))))) {
    	a127 += (a127 + 20) > a127 ? 1 : 0;
    	a47 += (a47 + 20) > a47 ? 1 : 0;
    	cf = false;
    	a108 = (((((a199 * a132) % 14999) - 14906) - 3) / 5);
    	a90 = ((((((a90 * a79) % 14999) - -5263) % 68) + -62) + -45);
    	a9 = (a29 - 8);
    	a6 = "f";
    	a159 = ((a29 + a84) + -8);
    	a95 = ((a153 - a153) - -2);
    	a177 = ((a139 * a139) - 31);
    	a153 = (a29 - 6);
    	a21 = "e";
    	a59 = "e";
    	a12 = "f";
    	a164 = "f";
    	a154 = "g";
    	a64 = ((a177 - a89) + 1);
    	a39 = "e";
    	a199 = ((((((a199 * a191) % 14999) % 92) - -161) + 11098) - 11098);
    	a96 = "e";
    	a67 = "g";
    	a40 = "e";
    	a163 = ((((((a147 * a147) % 14999) % 14825) + 15173) * 1) + 0); 
    	output = "Y";
    } 
    if((((a139 == 6) && ((a31 == 8) && (((a29 == 12) && (cf && (input.equals("D")))) && a147 <=  63))) && (a79 <=  -157 && (((a59.equals("f")) && ((a141 == 3) && (((-54 < a132) && (54 >= a132)) && (a6.equals("e"))))) && (a153 == 5))))) {
    	cf = false;
    	a139 = (a193 - -6);
    	a64 = (a139 + -2);
    	a100 = "g";
    	a199 = (((((((a90 * a57) % 14999) % 92) - -80) + 27347) + -56855) - -29524);
    	a90 = ((((((a90 * a200) % 14999) % 68) + -61) - -20267) - 20268);
    	a200 = (((((((a200 * a199) % 14999) % 61) - -150) * 1) - 11824) - -11824);
    	a171 = (((((((a132 * a147) % 14999) % 17) + 145) / 5) + 3599) - 3471);
    	a147 = ((((((a147 * a171) % 14999) % 26) + 89) - -1) - 1);
    	a179 = (a84 - -3);
    	a89 = (a177 - 4);
    	a191 = ((((((a191 * a140) % 14999) % 89) - -276) + 1) - 2);
    	a141 = (a95 + 3); 
    	output = "U";
    } 
}
private  void calculateOutputm33(String input) {
    if((((((a141 == 3) && ((a59.equals("f")) && a200 <=  89)) && (a40.equals("e"))) && (a139 == 6)) && ((a29 == 14) && (((((cf && (input.equals("D"))) && ((-54 < a132) && (54 >= a132))) && (a6.equals("e"))) && a147 <=  63) && (a167.equals("e")))))) {
    	cf = false;
    	a34 = "i";
    	a15 = (((((a15 - 0) - 0) + 29006) % 20) + 41);
    	a140 = ((((a140 % 15088) - 14911) - -22680) - 22680);
    	a105 = "i";
    	a90 = ((((a90 % 100) + 143) - 21438) - -21494);
    	a53 = (((((a53 % 14808) - -15190) + 0) - 20053) - -20055);
    	a199 = (((((a199 % 10) - -264) + 0) - 7460) + 7460);
    	a147 = (((((((a147 * a80) % 14999) % 54) + 170) / 5) * 5) + 4);
    	a78 = "f";
    	a86 = "g";
    	a57 = (((((a57 % 18) + -37) * 9) / 10) - -2);
    	a64 = 11;
    	a153 = 5;
    	a169 = ((((a169 % 12) + 167) + -25561) - -25560);
    	a67 = "e";
    	a84 = 8;
    	a139 = 11;
    	a56 = (a177 + -1);
    	a129 = 8;
    	a81 = "f";
    	a0 = "i";
    	a180 = "e";
    	a167 = "f";
    	a150 = 14;
    	a40 = "e";
    	a89 = 2;
    	a79 = ((((a79 % 10) - 136) / 5) * 5);
    	a178 = "h";
    	a159 = 10;
    	a6 = "g";
    	a12 = "h";
    	a118 = 8;
    	a10 = 14;
    	a32 = 9;
    	a80 = ((((a80 * 1) % 15082) + -14916) * 1); 
    	output = "V";
    } 
    if((((((a29 == 14) && ((input.equals("C")) && (((-54 < a132) && (54 >= a132)) && (a147 <=  63 && cf)))) && (a6.equals("e"))) && (a193 == 1)) && ((a139 == 6) && ((a12.equals("e")) && (a15 <=  -76 && ((a59.equals("f")) && (a81.equals("e")))))))) {
    	cf = false;
    	a100 = "i";
    	a33 = "g";
    	a147 = ((((((a147 * a57) % 14999) % 26) + 90) - -1) - 1);
    	a182 = (a153 - -6); 
    	output = "Z";
    } 
    if((((a12.equals("e")) && (((input.equals("B")) && ((cf && (a59.equals("f"))) && a147 <=  63)) && (a31 == 8))) && ((a40.equals("e")) && ((a29 == 14) && (((a0.equals("e")) && ((a89 == 1) && a169 <=  154)) && ((-54 < a132) && (54 >= a132))))))) {
    	cf = false;
    	a131 = "i";
    	a59 = "i";
    	a157 = ((((((a147 * a132) % 14999) % 14) + 345) + 0) + 0); 
    	output = "S";
    } 
    if(((((a39.equals("e")) && ((a64 == 4) && ((((cf && (a59.equals("f"))) && (a29 == 14)) && ((-54 < a132) && (54 >= a132))) && (a67.equals("e"))))) && (a96.equals("e"))) && (a79 <=  -157 && (((a177 == 5) && a147 <=  63) && (input.equals("E")))))) {
    	cf = false;
    	if((!(a129 == 9) || ((a193 == 5) || ((((193 < a165) && (278 >= a165)) || (a45.equals("h"))) && ((-76 < a15) && (19 >= a15)))))) {
    	a51 = ((((9 + 2588) - 2494) + -19902) + 19889);
    	a199 = ((((a199 % 14862) - -15137) + -25318) + 25320);
    	a89 = 1;
    	a153 = 5;
    	a191 = (((25 / -5) + -1486) - 15515);
    	a162 = (a141 + 9);
    	a108 = (((((a108 * 1) * 1) - -9136) % 22) + 168);
    	a178 = "h";
    	a147 = ((((((a147 * a156) % 14999) - -12867) % 54) + 171) * 1);
    	a56 = ((a31 / a32) - -9);
    	a67 = "h";
    	a159 = 16;
    	a10 = 14;
    	a102 = "i";
    	a53 = ((((a53 % 15100) - 14899) + -1) - 1);
    	a168 = ((((18 - 16287) + 40405) * 10) / 9);
    	a139 = 10;
    	a40 = "h";
    	a169 = ((((((a169 % 34) + 213) * 1) * 5) % 34) - -186);
    	a140 = ((((a140 % 14781) - -15218) - -1) * 1);
    	a86 = "h";
    	a80 = (((((a80 / 5) + -16342) / 5) * -2) / 10);
    	a187 = 4;
    	a129 = 8;
    	a118 = 14;
    	a57 = (((a57 * -1) + 0) * 1);
    	a137 = (((a137 / 5) - -11409) * -2);
    	a105 = "i";
    	a141 = 4;
    	a79 = (((a79 * 1) - -30080) + 60);
    	a167 = "e";
    	a32 = 8;
    	a84 = 8;
    	a64 = 5;
    	a150 = 13;
    	a177 = 6;
    	a31 = 13;
    	a81 = "f";
    	a34 = "f";
    	a200 = (((a200 / 5) / 5) - -28206);
    	a156 = ((((a156 % 75) + 220) - -2) - 1); 
    	}else {
    	a6 = "i";
    	a10 = 15;
    	a193 = 5;
    	a140 = ((((((a140 / 5) % 70) + 246) * 5) % 70) + 195);
    	a177 = 9;
    	a79 = ((((a79 % 14921) + -157) + -12881) + -678);
    	a94 = (a84 + 6);
    	a81 = "f";
    	a9 = 7;
    	a51 = ((((24 * 5) - -21184) * 10) / 9);
    	a40 = "h";
    	a191 = (((12 + 270) + -19528) + 19442);
    	a53 = (((((a53 % 47) - -333) + -12982) + -15377) - -28359);
    	a86 = "f";
    	a159 = 17;
    	a108 = ((((a108 - 0) % 14806) + 15193) + 0);
    	a128 = (((((a128 % 91) - -286) / 5) * 5) - -2);
    	a187 = 2;
    	a0 = "f";
    	a89 = 5;
    	a199 = ((((a199 % 14862) - -15137) - -1) + 0);
    	a105 = "e";
    	a57 = ((((((a57 / 5) % 40) - 73) * 5) % 40) - 107);
    	a178 = "f";
    	a156 = (((((a156 % 75) + 221) - 18757) / 5) - -3896);
    	a139 = 7;
    	a12 = "i";
    	a67 = "e";
    	a141 = 8;
    	a155 = "h";
    	a15 = ((((a15 % 20) - -52) - 25766) + 25753);
    	a169 = ((((a169 - -20390) % 14875) + 15123) - -2);
    	a78 = "h";
    	a96 = "h";
    	a31 = 9;
    	a150 = 13;
    	a153 = 11;
    	a147 = ((((((a147 * a90) % 14999) / 5) % 54) - -171) * 1);
    	a171 = ((((((a90 * a200) % 14999) % 14918) - -15080) / 5) + 15719);
    	a80 = (((((a80 + 17759) * 1) - 8012) % 52) - -421);
    	a167 = "h";
    	a34 = "i";
    	a32 = 12;
    	a39 = "e";
    	a118 = 8;
    	a65 = "f";
    	a90 = ((((a90 / 5) + -23842) * 1) + 35899);
    	a129 = 11;
    	a137 = ((((a137 + 12646) % 82) - -325) - 2);
    	a84 = 14;
    	a200 = ((((a200 / 5) - 17906) % 61) + 179);
    	}output = "Y";
    } 
    if((((a29 == 14) && ((a80 <=  165 && ((a108 <=  146 && (a78.equals("e"))) && a199 <=  68)) && (a129 == 4))) && ((a59.equals("f")) && ((((cf && (input.equals("A"))) && a147 <=  63) && (a159 == 10)) && ((-54 < a132) && (54 >= a132)))))) {
    	cf = false;
    	a157 = ((((a132 * a132) - 3680) / 5) - 28018);
    	a59 = "i";
    	a122 = (((((a157 * a132) % 14999) - 14959) + -39) - 3); 
    	output = "Y";
    } 
}
private  void calculateOutputm2(String input) {
    if((((a12.equals("e")) && ((a128 <=  195 && a15 <=  -76) && (a105.equals("e")))) && ((a34.equals("e")) && ((a65.equals("e")) && (((-131 < a132) && (-54 >= a132)) && cf))))) {
    	if((((((a39.equals("e")) && (a167.equals("e"))) && a51 <=  86) && (a10 == 9)) && ((a153 == 5) && ((a6.equals("e")) && ((a29 == 11) && cf))))) {
    		calculateOutputm27(input);
    	} 
    } 
    if(((a140 <=  176 && ((a64 == 4) && (((a6.equals("e")) && (((-54 < a132) && (54 >= a132)) && cf)) && (a81.equals("e"))))) && ((a167.equals("e")) && a200 <=  89))) {
    	if(((a57 <=  -149 && (((a81.equals("e")) && a169 <=  154) && (a95 == 1))) && ((a15 <=  -76 && ((a29 == 10) && cf)) && (a10 == 9)))) {
    		calculateOutputm30(input);
    	} 
    	if(((((a191 <=  186 && (a193 == 1)) && (a32 == 8)) && (a89 == 1)) && ((a95 == 1) && (((a29 == 12) && cf) && (a10 == 9))))) {
    		calculateOutputm31(input);
    	} 
    	if(((a140 <=  176 && (((((a29 == 14) && cf) && (a40.equals("e"))) && (a167.equals("e"))) && (a141 == 3))) && (a53 <=  200 && (a64 == 4)))) {
    		calculateOutputm33(input);
    	} 
    } 
}
private  void calculateOutputm37(String input) {
    if((((a9 == 4) && (((a59.equals("g")) && (a67.equals("e"))) && (a159 == 10))) && ((a162 == 11) && ((a79 <=  -157 && (((a89 == 1) && ((input.equals("A")) && ((a133 == 10) && cf))) && a147 <=  63)) && (a193 == 1))))) {
    	cf = false;
    	if((282 < a142 && ((193 < a165) && (278 >= a165)))) {
    	a122 = (((((((a147 * a147) % 14999) - -989) + -866) - -1993) % 100) + 226);
    	a9 = ((a118 / a139) - -4);
    	a159 = (a84 + 3);
    	a40 = "f";
    	a108 = ((((((((a108 * a156) % 14999) / 5) % 22) - -168) / 5) * 51) / 10);
    	a6 = "f";
    	a150 = a10;
    	a0 = "f";
    	a147 = ((((((a147 * a80) % 14999) - -9648) * 1) / 5) + 1981);
    	a139 = (a9 + 2);
    	a67 = "f";
    	a57 = (((((((a199 * a140) % 14999) % 40) + -108) * 5) % 40) - 89);
    	a121 = (a95 + 12);
    	a95 = ((a9 + a9) - 8);
    	a154 = "f";
    	a105 = "f";
    	a10 = (a159 - 1);
    	a168 = (((((((a57 * a137) % 14999) % 92) - -106) + -26618) - 448) + 27065);
    	a129 = (a153 + -1);
    	a39 = "f";
    	a90 = ((((((((a90 * a128) % 14999) % 68) - 62) + 1) * 5) % 68) + -61);
    	a89 = (a31 - 6);
    	a191 = ((((((a90 * a122) % 14999) % 89) - -275) + 0) * 1);
    	a80 = ((((((a122 * a199) % 14999) / 5) % 101) - -268) - 1);
    	a177 = (a193 - -5);
    	a193 = (a64 + -2);
    	a34 = "g";
    	a51 = ((((((a51 * a168) % 14999) % 29) - -115) - -9700) + -9699);
    	a153 = (a141 + 3);
    	a21 = "f";
    	a65 = "f";
    	a199 = (((((((a15 * a90) % 14999) % 92) + 160) - -14427) - -2519) - 16945);
    	a81 = "e";
    	a32 = ((a133 + a162) + -12);
    	a118 = ((a9 / a9) - -8);
    	a12 = "f";
    	a96 = "f";
    	a141 = (a9 - 1);
    	a200 = (((((((a191 * a191) % 14999) - -14829) % 61) - -124) - 1310) + 1287);
    	a64 = ((a9 - a9) - -5);
    	a156 = ((((((a156 * a79) % 14999) % 75) + 220) + 18647) + -18647);
    	a79 = (((((((a79 * a15) % 14999) % 10) - 153) + -1) / 5) + -108);
    	a161 = "i";
    	a15 = ((((((a15 * a191) % 14999) % 47) - 28) - 29661) + 29660); 
    	}else {
    	a129 = (a31 + -4);
    	a191 = (((((((a156 * a156) % 14999) % 76) - -442) * 1) + 10111) + -10109);
    	a6 = "g";
    	a53 = ((((((a90 * a90) % 14999) % 47) + 320) + 6) + 3);
    	a139 = (a162 + -3);
    	a57 = ((((((a191 * a137) % 14999) % 18) + -48) / 5) - 34);
    	a108 = ((((((a108 * a80) % 14999) - 14553) * 1) % 97) + 290);
    	a64 = (a32 - 2);
    	a200 = (((((((a156 * a156) % 14999) % 61) + 151) + -1) / 5) - -142);
    	a141 = (a159 + -5);
    	a199 = ((((((((a15 * a15) % 14999) % 10) - -259) + -1) * 5) % 10) - -257);
    	a178 = "i";
    	a84 = ((a64 - a133) - -14);
    	a177 = (a193 - -6);
    	a140 = ((((((a140 * a128) % 14999) % 59) + 377) * 1) + 2);
    	a12 = "g";
    	a168 = (((((((a168 * a57) % 14999) % 65) + 264) - -2) - -1115) + -1117);
    	a102 = "g";
    	a51 = ((((((a51 * a137) % 14999) / 5) % 18) + 164) * 1);
    	a153 = ((a10 - a89) - 1);
    	a39 = "f";
    	a165 = (((((a147 * a147) % 14999) - 14895) * 1) + -61);
    	a8 = (((((((a199 * a169) % 14999) - -13016) % 91) + 115) * 9) / 10);
    	a78 = "e";
    	a95 = ((a139 - a32) + 2);
    	a15 = (((((((a15 * a191) % 14999) / 5) % 20) + 41) - 15958) + 15957);
    	a67 = "g";
    	a75 = "e";
    	a34 = "g";
    	a21 = "f";
    	a79 = ((((((a79 * a137) % 14999) % 90) + -42) / 5) - -38);
    	a89 = (a9 + -1);
    	a81 = "g";
    	a65 = "g";
    	a187 = ((a159 / a139) + 2);
    	a118 = (a32 + 2);
    	a0 = "f";
    	a96 = "g";
    	a105 = "f";
    	a147 = ((((((a147 * a80) % 14999) % 54) + 171) - 12020) + 12020);
    	a9 = ((a32 * a159) + -74);
    	a80 = ((((((a156 * a108) % 14999) / 5) - -20742) % 101) + 266);
    	a90 = (((((((a90 * a191) % 14999) % 68) + -62) + 22276) / 5) + -4543);
    	a167 = "g";
    	a154 = "f";
    	a159 = (a187 + 8);
    	a150 = (a32 - -1);
    	}output = "T";
    } 
    if(((((a64 == 4) && ((a32 == 8) && (a199 <=  68 && (((cf && (a162 == 11)) && (input.equals("E"))) && (a167.equals("e")))))) && (a59.equals("g"))) && ((a147 <=  63 && ((a34.equals("e")) && a90 <=  -131)) && (a133 == 10)))) {
    	cf = false;
    	a167 = "f";
    	a0 = "g";
    	a187 = (a153 - 3);
    	a6 = "g";
    	a34 = "f";
    	a39 = "g";
    	a137 = ((((((a137 * a199) % 14999) % 41) - -199) * 1) + 1);
    	a10 = (a84 - -3);
    	a51 = (((((((a51 * a108) % 14999) + 2140) % 18) + 164) + 28186) + -28186);
    	a106 = (a141 - -2);
    	a31 = (a84 + 1);
    	a177 = ((a89 * a89) - -5);
    	a128 = ((((((a128 * a80) % 14999) % 91) - -286) * 5) / 5);
    	a65 = "f";
    	a199 = ((((((((a79 * a53) % 14999) % 92) - -161) - 14879) * 2) % 92) - -204);
    	a96 = "f";
    	a95 = ((a162 - a162) + 2);
    	a100 = "e";
    	a64 = (a95 + 3);
    	a147 = ((((a147 * 1) % 26) + 89) + 1);
    	a32 = (a129 + 4);
    	a108 = ((((((a108 * a140) % 14999) * 2) % 22) + 169) + 1);
    	a84 = (a89 - -8);
    	a154 = "f";
    	a155 = "g";
    	a80 = (((((a8 * a53) % 101) + 268) / 5) - -157);
    	a89 = (a133 + -8);
    	a105 = "f";
    	a156 = ((((((a156 * a79) % 14999) % 23) - -319) / 5) + 250);
    	a15 = ((((((a8 * a53) % 47) - 28) - -27319) + -37502) - -10183);
    	a57 = ((((((a57 * a15) % 14999) * 2) * 1) % 40) + -107);
    	a193 = ((a159 * a118) + -78);
    	a21 = "g";
    	a9 = (a141 - -2);
    	a168 = ((((((a168 * a128) % 14999) + 4455) * 1) % 92) + 106);
    	a140 = (((((((a140 * a79) % 14999) / 5) * 5) + 4825) % 70) - -248);
    	a118 = (a139 + 3);
    	a200 = ((((42 - 2990) * 5) - -1948) + 12882);
    	a185 = "i";
    	a102 = "f";
    	a159 = (a139 + a9);
    	a67 = "g";
    	a191 = ((((43 + 360) + 94) * 5) + -2014);
    	a139 = (a187 - -5);
    	a12 = "g";
    	a90 = ((((((a90 * a15) % 14999) % 68) + -61) - -279) + -280);
    	a79 = ((((((a79 * a53) % 14999) / 5) % 90) - 44) - -1);
    	a141 = (a187 - -2); 
    	output = "Y";
    } 
    if(((((a59.equals("g")) && ((((a133 == 10) && a57 <=  -149) && (a67.equals("e"))) && (a139 == 6))) && (a95 == 1)) && ((a65.equals("e")) && ((((a147 <=  63 && cf) && (input.equals("C"))) && (a162 == 11)) && (a6.equals("e")))))) {
    	a7 -= (a7 - 20) < a7 ? 2 : 0;
    	cf = false;
    	a200 = ((((((a128 * a128) % 14999) - -13654) / 5) % 61) - -151);
    	a167 = "g";
    	a10 = (a89 - -9);
    	a191 = ((((((a128 * a128) % 14999) % 89) - -275) + 0) - 0);
    	a21 = "g";
    	a64 = ((a162 * a129) + -50);
    	a154 = "f";
    	a39 = "f";
    	a193 = (a162 + -8);
    	a78 = "g";
    	a6 = "g";
    	a102 = "f";
    	a187 = (a10 + -8);
    	a40 = "f";
    	a139 = (a31 + -1);
    	a68 = ((a84 / a95) - -5);
    	a108 = ((((((a108 * a15) % 14999) % 22) + 169) + 1) - 2);
    	a153 = (a187 + 4);
    	a51 = ((((((((a51 * a191) % 14999) % 29) - -116) * 1) * 5) % 29) + 99);
    	a67 = "f";
    	a89 = ((a10 / a162) - -2);
    	a90 = ((((((a90 * a200) % 14999) % 68) + -61) * 5) / 5);
    	a84 = ((a141 * a10) + -20);
    	a15 = ((((((a53 * a128) % 14999) % 47) + -28) + -1) + 2);
    	a182 = (a118 - -2);
    	a79 = (((((((a79 * a137) % 14999) + 10539) * 1) + -10126) % 90) + -42);
    	a95 = (a159 + -8);
    	a147 = (((((a147 % 26) - -89) + -28681) * 1) - -28681);
    	a105 = "f";
    	a168 = (((((((a168 * a128) % 14999) * 2) * 1) - 2) % 65) - -263);
    	a31 = (a139 - -2);
    	a156 = ((((((a156 * a53) % 14999) + 2484) % 75) - -221) + -1);
    	a141 = ((a10 / a162) + 4);
    	a177 = (a32 + -2);
    	a34 = "g";
    	a137 = ((((((a137 * a128) % 14999) + -6043) * 1) % 41) + 200);
    	a100 = "i";
    	a32 = (a9 - -5);
    	a9 = ((a10 * a159) - 95);
    	a140 = ((((((a140 * a80) % 14999) + 10299) - 9654) % 70) + 248);
    	a12 = "g";
    	a80 = (((((((a53 * a57) % 14999) % 52) - -422) + -5777) / 5) - -1500);
    	a65 = "f";
    	a159 = (a133 - -1);
    	a57 = (((((((a57 * a191) % 14999) / 5) % 40) - 108) + 13123) - 13122);
    	a118 = ((a162 / a139) + 8);
    	a155 = "f";
    	a0 = "f";
    	a96 = "f";
    	a199 = ((((((((a199 * a8) % 14999) * 2) % 92) - -162) * 5) % 92) - -119);
    	a128 = (((((((a128 * a51) % 14999) % 91) - -288) + -3177) * -1) / 10); 
    	output = "T";
    } 
    if(((a84 == 8) && ((a133 == 10) && (((a31 == 8) && (a15 <=  -76 && (((a162 == 11) && ((a147 <=  63 && ((a59.equals("g")) && ((input.equals("B")) && cf))) && a140 <=  176)) && (a67.equals("e"))))) && (a159 == 10))))) {
    	cf = false;
    	a59 = "e";
    	a164 = "i";
    	a163 = ((((((a147 * a147) % 14999) + -10236) % 14825) + 15173) + 1); 
    	output = "U";
    } 
}
private  void calculateOutputm38(String input) {
    if((((((a8 <=  -7 && ((a182 == 8) && (a84 == 8))) && a147 <=  63) && (a95 == 1)) && (a65.equals("e"))) && (a90 <=  -131 && (((a162 == 12) && (((a59.equals("g")) && cf) && (input.equals("C")))) && (a139 == 6))))) {
    	cf = false;
    	if(((((a78.equals("g")) || (a185.equals("e"))) && ((-7 < a8) && (46 >= a8))) && !(a34.equals("g")))) {
    	a65 = "h";
    	a40 = "h";
    	a141 = 8;
    	a147 = ((((((a147 * a168) % 14999) - -1463) % 26) + 90) * 1);
    	a0 = "e";
    	a8 = (((((a8 % 14996) - 7) / 5) * 71) / 10);
    	a199 = ((((a199 % 15034) - 14965) + 0) + -1);
    	a32 = 14;
    	a123 = "e";
    	a169 = (((((64 * 10) / 2) + 7218) * 10) / 9);
    	a51 = ((((a51 * 1) % 14908) + 15090) * 1);
    	a153 = 10;
    	a96 = "i";
    	a84 = 14;
    	a95 = 4;
    	a79 = (((((a79 * 1) - -8062) * 1) % 10) - 144);
    	a105 = "e";
    	a39 = "e";
    	a108 = ((((a108 / 5) % 97) + 290) * 1);
    	a185 = "g";
    	a191 = (((a191 * 1) + 0) + 0);
    	a139 = 8;
    	a129 = 7;
    	a10 = 14;
    	a159 = 11;
    	a89 = 6;
    	a6 = "e";
    	a34 = "i";
    	a67 = "e";
    	a156 = ((((a156 % 23) - -320) + -1) - 0);
    	a80 = ((((a80 * 1) % 52) + 421) + 2);
    	a78 = "e";
    	a137 = ((((a137 + 11655) % 14796) + 15203) - 0);
    	a86 = "e";
    	a140 = ((((a140 % 14781) + 15218) / 5) + 23446);
    	a100 = "e";
    	a12 = "h";
    	a90 = ((((((a90 % 14934) - 131) / 5) / 5) * 262) / 10);
    	a102 = "e";
    	a177 = 10;
    	a128 = ((((a128 * 1) % 15097) + -14901) + -1);
    	a200 = ((((a200 * 1) * 1) % 59) + 272);
    	a57 = (((((a57 % 18) - 36) / 5) * 59) / 10);
    	a154 = "f";
    	a53 = ((((3 + 209) - 13302) * 2) - -26403);
    	a64 = 7;
    	a118 = 8;
    	a167 = "h";
    	a31 = 15;
    	a168 = (((a168 / 5) - -17285) * -1); 
    	}else {
    	a200 = ((((a200 + 17334) + 9005) % 59) - -272);
    	a34 = "h";
    	a177 = 7;
    	a122 = ((((((a147 * a80) % 14999) * 2) % 100) + 226) + -1);
    	a89 = 7;
    	a108 = (((((a108 % 97) + 289) + 26433) * 1) + -26433);
    	a9 = 8;
    	a46 = (a182 + -1);
    	a8 = (((((a8 / 5) % 91) - -158) * 10) / 9);
    	a139 = 9;
    	a40 = "h";
    	a156 = ((((a156 % 15072) + -14927) - -17670) - 17671);
    	a0 = "h";
    	a90 = ((((((a90 % 100) - -146) * 5) + 19312) % 100) - -48);
    	a128 = (((((a128 % 91) - -287) * 5) % 91) - -271);
    	a79 = ((((a79 % 14921) + -157) * 1) - 14587);
    	a78 = "i";
    	a150 = 9;
    	a6 = "h";
    	a84 = 15;
    	a95 = 6;
    	a129 = 4;
    	a191 = ((((a191 % 15093) + -14906) + -1) + -1);
    	a153 = 5;
    	a161 = "f";
    	a187 = 3;
    	a39 = "g";
    	a118 = 14;
    	a168 = ((((a168 % 14834) - -15164) * 1) - 0);
    	a105 = "i";
    	a147 = ((((((a147 * a199) % 14999) % 14887) - -15112) / 5) - -15200);
    	a65 = "e";
    	a57 = ((((a57 + 0) % 18) - 33) + -6);
    	a137 = (((((a137 % 15078) + -14920) - 2) + 20135) - 20133);
    	a64 = 4;
    	a96 = "g";
    	a167 = "i";
    	a31 = 15;
    	a51 = ((((a51 % 29) - -116) / 5) - -79);
    	a10 = 16;
    	a12 = "i";
    	a32 = 13;
    	a86 = "g";
    	a199 = ((((a199 % 14862) - -15137) - 0) - 0);
    	a141 = 5;
    	a80 = ((((a80 - -2591) - 912) % 52) + 421);
    	}output = "Y";
    } 
    if((((input.equals("A")) && ((a96.equals("e")) && a147 <=  63)) && ((a31 == 8) && ((a6.equals("e")) && ((a40.equals("e")) && (((((a162 == 12) && ((a59.equals("g")) && cf)) && a108 <=  146) && (a182 == 8)) && a128 <=  195)))))) {
    	cf = false;
    	a29 = (a118 + 2);
    	a28 = "f";
    	a122 = ((((((a51 * a108) % 14999) * 2) * 1) % 22) + 101);
    	a147 = (((((((a147 * a79) % 14999) % 14887) - -15112) - -1) - 5634) + 5634); 
    	output = "S";
    } 
    if(((((a0.equals("e")) && (((a86.equals("e")) && (input.equals("D"))) && (a89 == 1))) && a191 <=  186) && ((((a182 == 8) && (a57 <=  -149 && ((cf && a147 <=  63) && (a162 == 12)))) && (a59.equals("g"))) && (a167.equals("e"))))) {
    	cf = false;
    	a147 = ((((a147 % 14887) + 15112) - 0) + 1);
    	a161 = "i";
    	a121 = ((a177 - a129) - -13);
    	a122 = (((((((a200 * a199) % 14999) % 100) - -225) / 5) * 51) / 10); 
    	output = "T";
    } 
    if((((a199 <=  68 && (((cf && a147 <=  63) && (a59.equals("g"))) && (a162 == 12))) && (a65.equals("e"))) && ((a6.equals("e")) && ((a12.equals("e")) && (((a8 <=  -7 && (input.equals("B"))) && (a95 == 1)) && (a182 == 8)))))) {
    	a127 -= (a127 - 20) < a127 ? 3 : 0;
    	cf = false;
    	a183 = "e";
    	a147 = ((((a147 % 26) + 89) * 1) * 1);
    	a100 = "i";
    	a182 = (a153 + 9); 
    	output = "Y";
    } 
    if(((a137 <=  157 && ((a59.equals("g")) && (a78.equals("e")))) && (a79 <=  -157 && ((a8 <=  -7 && (a200 <=  89 && ((input.equals("E")) && ((a182 == 8) && (a147 <=  63 && ((a162 == 12) && cf)))))) && (a39.equals("e")))))) {
    	cf = false;
    	if(((!(a110.equals("e")) && (225 < a147 && !(a67.equals("f")))) && !(a139 == 6))) {
    	a101 = (a95 - -10);
    	a191 = (((((a191 % 14740) - -15259) + -26807) - -14197) + 12612);
    	a161 = "g";
    	a10 = 16;
    	a156 = ((((a156 % 23) - -321) + 1) + -1);
    	a140 = (((((a140 / 5) - 8999) + -11633) * -1) / 10);
    	a80 = ((((a80 % 14762) - -15236) - -2) - 0);
    	a122 = ((((((((a147 * a147) % 14999) % 100) - -226) - 1) * 5) % 100) - -220);
    	a105 = "i";
    	a64 = 9;
    	a153 = 12;
    	a108 = ((((a108 % 15073) - 14926) - -10859) + -10859);
    	a89 = 8;
    	a86 = "h";
    	a168 = ((((a168 % 14834) + 15164) + 2) * 1);
    	a147 = (((((a147 * a122) % 14999) + -4630) / 5) + 8321); 
    	}else {
    	a191 = ((((a191 - -22627) % 15093) + -14906) + 0);
    	a122 = (((((((a147 * a147) % 14999) * 2) % 100) - -225) + 17633) + -17632);
    	a80 = ((((a80 % 15082) + -14916) - -8176) + -8177);
    	a96 = "g";
    	a57 = ((((a57 - -21982) % 18) + -49) * 1);
    	a139 = 9;
    	a156 = (((((a156 % 23) + 321) * 1) / 5) - -275);
    	a161 = "h";
    	a120 = (((((((a122 * a147) % 14999) % 68) - -254) + 26276) * 1) - 26275);
    	a108 = ((((a108 / 5) * 5) % 14806) + 15193);
    	a167 = "e";
    	a177 = 7;
    	a128 = (((a128 / 5) + 29063) - -357);
    	a105 = "e";
    	a141 = 3;
    	a147 = ((((((a147 * a122) % 14999) % 14887) + 15112) - 0) - 0);
    	}output = "X";
    } 
}
private  void calculateOutputm40(String input) {
    if((((a182 == 13) && (((((a105.equals("e")) && (((input.equals("B")) && cf) && (a162 == 12))) && (a153 == 5)) && a169 <=  154) && (a67.equals("e")))) && ((a147 <=  63 && ((a39.equals("e")) && (a89 == 1))) && (a59.equals("g"))))) {
    	cf = false;
    	a118 = ((a10 * a10) + -72);
    	a199 = (((((((a57 * a80) % 14999) % 92) - -161) + 1) - 14832) + 14832);
    	a96 = "f";
    	a193 = (a129 + -2);
    	a122 = (((((((a147 * a147) % 14999) % 14836) + 15162) - 0) / 5) - -759);
    	a100 = "h";
    	a102 = "f";
    	a137 = (((((((a137 * a199) % 14999) % 41) - -200) * 5) % 41) - -187);
    	a36 = (a84 - -5);
    	a141 = (a31 + -4);
    	a147 = (((((((a147 * a57) % 14999) % 26) + 90) * 5) % 26) - -79);
    	a57 = (((((((a57 * a168) % 14999) % 40) + -107) - -754) - -12955) - 13709); 
    	output = "Y";
    } 
    if(((((a95 == 1) && ((((cf && (a162 == 12)) && (a182 == 13)) && a147 <=  63) && (a6.equals("e")))) && (a155.equals("e"))) && ((a118 == 8) && (((input.equals("C")) && ((a10 == 9) && (a154.equals("e")))) && (a59.equals("g")))))) {
    	a151 += (a151 + 20) > a151 ? 2 : 0;
    	a135 -= (a135 - 20) < a135 ? 2 : 0;
    	cf = false;
    	a59 = "f";
    	a15 = ((((((a80 * a90) % 14999) * 2) % 14962) + -15037) * 1);
    	a34 = "e";
    	a31 = (a193 + 8);
    	a154 = "f";
    	a57 = (((((((a57 * a79) % 14999) - 21632) - -5951) * 1) % 40) - 108);
    	a8 = ((((((a156 * a53) % 14999) * 2) % 91) - -137) + 2);
    	a65 = "e";
    	a200 = (((((a169 * a128) % 14999) + -14944) - 41) + -17);
    	a95 = (a129 + -2);
    	a141 = (a153 + -1);
    	a132 = ((((((a147 * a147) % 14999) % 38) - 92) + 1) - 2);
    	a32 = (a153 - -4);
    	a29 = (a129 + 7);
    	a84 = (a89 + 9);
    	a118 = ((a162 + a159) - 12);
    	a129 = (a150 + -2); 
    	output = "U";
    } 
}
private  void calculateOutputm45(String input) {
    if(((((a81.equals("e")) && (a39.equals("e"))) && a147 <=  63) && ((a32 == 8) && (a140 <=  176 && ((a6.equals("e")) && ((a59.equals("g")) && (((a162 == 15) && (((a160.equals("g")) && cf) && (input.equals("E")))) && (a150 == 8)))))))) {
    	cf = false;
    	a140 = ((((((a140 * a191) % 14999) * 2) / 5) % 59) + 378);
    	a10 = ((a141 + a162) + -9);
    	a175 = a84;
    	a169 = ((((((a169 * a156) % 14999) + -13468) / 5) % 34) + 214);
    	a165 = (((((((a8 * a147) % 14999) + 1614) % 14) + 292) + 14) + -11);
    	a178 = "i";
    	a21 = "g";
    	a79 = ((((((a79 * a168) % 14999) % 90) - 42) - -16262) + -16262);
    	a167 = "g";
    	a84 = (a187 + 9);
    	a102 = "g";
    	a96 = "g";
    	a147 = ((((((a147 * a51) % 14999) - -2798) / 5) % 54) - -170); 
    	output = "Y";
    } 
    if((((((input.equals("A")) && ((a59.equals("g")) && ((((a160.equals("g")) && cf) && (a162 == 15)) && (a153 == 5)))) && (a32 == 8)) && (a0.equals("e"))) && ((((a86.equals("e")) && a147 <=  63) && a169 <=  154) && a191 <=  186))) {
    	cf = false;
    	a105 = "f";
    	a86 = "f";
    	a118 = ((a193 - a177) - -12);
    	a154 = "f";
    	a89 = (a159 + -8);
    	a137 = (((((((a128 * a79) % 14999) - -12198) % 41) - -198) + -12349) + 12349);
    	a96 = "e";
    	a129 = ((a89 - a95) + 4);
    	a140 = (((((((a200 * a137) % 14999) + -26004) % 70) + 284) / 5) - -182);
    	a21 = "f";
    	a32 = ((a89 / a9) - -9);
    	a31 = (a162 - 6);
    	a187 = ((a150 - a31) + 3);
    	a39 = "f";
    	a40 = "f";
    	a199 = (((((a80 * a200) % 14999) + -13748) * 2) - 2458);
    	a147 = ((((a147 % 14887) + 15112) + -11225) + 11227);
    	a156 = (((((((a156 * a140) % 14999) * 2) - 0) / 5) % 75) - -219);
    	a81 = "g";
    	a51 = ((((((a51 * a137) % 14999) % 29) - -116) - -1) - 1);
    	a57 = (((((((a8 * a90) % 14999) - -2878) - 15340) - 2497) % 14925) + -15073);
    	a128 = ((((((a128 * a53) % 14999) % 91) + 288) * 1) - 1);
    	a65 = "e";
    	a67 = "f";
    	a44 = (((((((a79 * a169) % 14999) % 89) + 265) + -1) - -17257) - 17255);
    	a155 = "f";
    	a34 = "f";
    	a167 = "g";
    	a108 = ((((((a90 * a200) % 22) + 169) * 1) - -7012) - 7011);
    	a122 = ((((((a44 * a147) % 14999) + 2582) - 4481) / 5) - -9260);
    	a169 = ((((((a15 * a108) % 12) - -166) + -25545) - -30672) - 5126);
    	a153 = (a150 + -2);
    	a141 = ((a150 + a64) + -9);
    	a102 = "e";
    	a0 = "f";
    	a159 = (a118 + 3);
    	a191 = ((((((a191 * a168) % 14999) % 76) - -441) * 1) - -1);
    	a178 = "g";
    	a10 = (a84 + 2);
    	a8 = ((((((a15 * a15) + -2151) % 26) - -20) - 18464) - -18463);
    	a168 = ((((((((a168 * a53) % 14999) % 65) - -264) + -1) * 5) % 65) + 263);
    	a84 = (a118 - -1);
    	a6 = "f";
    	a79 = ((((((a79 * a108) % 14999) % 90) - 42) - 3) / 5);
    	a150 = (a177 + 4);
    	a177 = (a89 + 3); 
    	output = "V";
    } 
}
private  void calculateOutputm46(String input) {
    if(((a53 <=  200 && ((a167.equals("e")) && (((a65.equals("e")) && a147 <=  63) && (a155.equals("e"))))) && ((a187 == 1) && ((a118 == 8) && (((a160.equals("h")) && ((a59.equals("g")) && ((input.equals("A")) && cf))) && (a162 == 15)))))) {
    	cf = false;
    	a153 = ((a159 - a193) - 2);
    	a67 = "g";
    	a168 = ((((((a168 * a200) % 14999) % 65) - -265) + -10425) - -10423);
    	a78 = "g";
    	a139 = a118;
    	a53 = ((((((a53 * a140) % 14999) * 2) % 47) + 333) + 0);
    	a86 = "f";
    	a15 = ((((((a168 * a199) % 14999) % 47) + -27) - 1) - 1);
    	a80 = ((((((((a140 * a8) % 14999) % 52) + 422) * 5) * 5) % 52) - -381);
    	a81 = "g";
    	a95 = (a153 + -4);
    	a65 = "f";
    	a199 = (((((((a128 * a168) % 14999) * 2) % 92) + 161) + 2264) - 2263);
    	a154 = "g";
    	a10 = ((a64 / a64) + 10);
    	a32 = a159;
    	a84 = ((a141 + a129) - -3);
    	a79 = (((((((a191 * a137) % 14999) - -11103) - -1253) * 1) % 90) - 43);
    	a159 = (a162 - 3);
    	a12 = "g";
    	a8 = ((((((a156 * a128) % 14999) * 2) * 1) % 26) - -20);
    	a180 = "e";
    	a169 = ((((((a79 * a140) % 14999) / 5) % 34) + 213) - -1);
    	a34 = "g";
    	a89 = ((a139 / a187) - 5);
    	a167 = "g";
    	a105 = "f";
    	a90 = ((((((a168 * a168) % 14999) % 68) - 65) - -3) / 5);
    	a40 = "g";
    	a51 = ((((((((a168 * a168) % 14999) - -1663) % 29) + 87) * 5) % 29) - -97);
    	a140 = ((((((a168 * a57) % 14999) % 59) + 378) + -1) + 1);
    	a56 = a64;
    	a6 = "f";
    	a129 = (a187 - -5);
    	a118 = (a139 + 2);
    	a0 = "g";
    	a147 = ((((a147 % 54) - -171) - -1) + -2);
    	a150 = (a89 - -7);
    	a57 = ((((((a168 * a168) % 14999) - -6592) * 1) % 40) + -116);
    	a178 = "h";
    	a21 = "g";
    	a64 = ((a139 - a153) - -4); 
    	output = "U";
    } 
    if(((((((a141 == 3) && (a147 <=  63 && ((a59.equals("g")) && (cf && (a162 == 15))))) && (a160.equals("h"))) && (a193 == 1)) && a191 <=  186) && ((input.equals("D")) && (a57 <=  -149 && ((a6.equals("e")) && (a65.equals("e"))))))) {
    	cf = false;
    	if((((68 < a199) && (254 >= a199)) || (a46 == 7))) {
    	a64 = (a118 + -3);
    	a141 = (a187 - -4);
    	a105 = "f";
    	a59 = "e";
    	a6 = "f";
    	a154 = "f";
    	a49 = ((a129 + a32) + -8);
    	a108 = (((((((((a8 * a15) % 14999) % 97) + 267) * 9) / 10) * 5) % 97) + 280);
    	a65 = "f";
    	a86 = "f";
    	a57 = ((((((((a57 * a168) % 14999) % 18) - 49) * 1) * 5) % 18) - 34);
    	a53 = (((((((a53 * a80) % 14999) / 5) % 42) - -244) + 4348) + -4349);
    	a163 = ((((((a147 * a147) % 14999) + -9749) * 1) - 4017) - 1233);
    	a81 = "f";
    	a187 = (a10 + -7);
    	a12 = "f";
    	a51 = ((((((a79 * a147) % 14999) % 29) - -116) + 15329) + -15328); 
    	}else {
    	a53 = ((((((a140 * a57) % 14999) / 5) % 42) + 242) + 0);
    	a90 = (((((((a53 * a53) % 14999) % 68) - 72) - 2223) / 5) - -421);
    	a67 = "f";
    	a40 = "g";
    	a79 = (((((((a8 * a137) % 14999) % 14921) + -15077) / 5) + 24549) - 25503);
    	a167 = "e";
    	a122 = (((((((a199 * a147) % 14999) + -6318) - -3450) * 1) % 22) + 102);
    	a96 = "e";
    	a9 = ((a64 * a129) - 11);
    	a0 = "e";
    	a108 = ((((((a168 * a53) % 14999) - 7099) * 1) % 22) - -168);
    	a51 = ((((((a53 * a8) % 14999) / 5) + -4583) + 17495) - 31273);
    	a21 = "f";
    	a139 = (a187 + 6);
    	a81 = "f";
    	a65 = "f";
    	a12 = "f";
    	a95 = (a141 - 1);
    	a199 = (((((((a200 * a122) % 14999) + 3724) / 5) + -6916) % 92) - -213);
    	a200 = ((((((((a53 * a53) % 14999) % 61) + 133) / 5) / 5) * 209) / 10);
    	a129 = (a193 - -5);
    	a193 = (a141 - 1);
    	a29 = (a162 + 1);
    	a31 = ((a162 + a10) + -15);
    	a163 = ((((((a122 * a147) % 14999) / 5) % 22) + 206) + -1);
    	a153 = (a118 - 2);
    	a168 = (((((a137 * a108) % 14999) + -14997) + -1) - 3);
    	a128 = (((((((a128 * a191) % 14999) % 91) + 287) + -1) / 5) + 213);
    	a150 = (a159 - 1);
    	a169 = ((((((a122 * a199) % 14999) + 10968) + -34339) - -27084) + -31262);
    	a140 = (((((((a140 * a57) % 14999) % 70) - -247) * 1) - -19106) + -19105);
    	a84 = (a10 - 1);
    	a15 = ((((((a108 * a57) % 14999) / 5) + -23047) % 47) - 4);
    	a191 = (((((a191 * a53) % 14999) + 3313) - -3396) - 21604);
    	a39 = "f";
    	a64 = (a32 - 3);
    	a78 = "f";
    	a105 = "f";
    	a154 = "f";
    	a34 = "g";
    	a102 = "e";
    	a156 = (((((((a156 * a122) % 14999) * 2) % 75) + 221) / 5) - -120);
    	a6 = "e";
    	a155 = "g";
    	a177 = (a139 - 1);
    	a32 = (a141 - -6);
    	a137 = (((((a137 * a108) % 14999) + 9769) + -24670) * 1);
    	a80 = (((((((a57 * a122) % 14999) + 18046) % 101) - -238) * 9) / 10);
    	a86 = "f";
    	a159 = (a150 + 1);
    	a187 = (a118 + -7);
    	a8 = (((((a8 * a53) % 14999) + -13838) - -28134) + -15241);
    	a89 = a141;
    	a57 = (((((((a53 * a53) % 14999) - 17467) % 18) - 35) * 9) / 10);
    	a118 = (a141 - -7);
    	a147 = (((((((a147 * a163) % 14999) % 14887) - -15112) + -26592) + -1045) + 27638);
    	a10 = ((a139 / a150) - -9);
    	a141 = 5;
    	}output = "Z";
    } 
}
private  void calculateOutputm48(String input) {
    if((((a108 <=  146 && ((((a141 == 3) && (a162 == 17)) && (a177 == 5)) && (a84 == 8))) && (a129 == 4)) && ((a154.equals("e")) && (((a59.equals("g")) && (((30 < a72) && (177 >= a72)) && ((input.equals("C")) && cf))) && a147 <=  63)))) {
    	cf = false;
    	a132 = ((((((a72 * a147) % 14999) % 38) - 92) - 11656) - -11655);
    	a59 = "f";
    	a29 = ((a9 * a159) + -28); 
    	output = "Y";
    } 
    if(((((((a57 <=  -149 && a128 <=  195) && (a59.equals("g"))) && (input.equals("A"))) && (a153 == 5)) && (a102.equals("e"))) && (((((a147 <=  63 && cf) && (a162 == 17)) && a200 <=  89) && ((30 < a72) && (177 >= a72))) && a199 <=  68))) {
    	cf = false;
    	a122 = ((((((a168 * a90) % 14999) / 5) + -14167) * 10) / 9);
    	a100 = "h";
    	a147 = (((((((a147 * a122) % 14999) % 26) - -89) * 5) % 26) + 76);
    	a36 = (a32 - -5); 
    	output = "Y";
    } 
    if(((((a81.equals("e")) && ((a95 == 1) && ((a59.equals("g")) && ((a162 == 17) && (a86.equals("e")))))) && (a105.equals("e"))) && ((a21.equals("e")) && (a108 <=  146 && (((((30 < a72) && (177 >= a72)) && cf) && (input.equals("E"))) && a147 <=  63))))) {
    	a103 += (a103 + 20) > a103 ? 1 : 0;
    	cf = false;
    	a80 = ((((a80 - 0) % 15082) + -14916) - 2);
    	a95 = 7;
    	a150 = 15;
    	a6 = "h";
    	a53 = ((((a53 % 42) + 244) - 2) - -2);
    	a167 = "e";
    	a140 = ((((a140 - -18169) % 70) + 247) * 1);
    	a21 = "i";
    	a105 = "e";
    	a75 = "e";
    	a102 = "f";
    	a165 = (((((a199 * a156) % 14999) - 14887) / 5) - 18647);
    	a118 = 11;
    	a168 = ((((((a168 + 22426) % 92) + 105) * 5) % 92) - -70);
    	a8 = ((((a8 % 26) - -34) - -11) / 5);
    	a177 = 8;
    	a0 = "h";
    	a96 = "f";
    	a178 = "i";
    	a86 = "h";
    	a159 = 14;
    	a141 = 6;
    	a154 = "g";
    	a139 = 12;
    	a64 = 4;
    	a90 = (((((a90 / 5) % 100) - -128) * 9) / 10);
    	a81 = "h";
    	a200 = ((((a200 * 1) % 15044) + -14954) / 5);
    	a153 = 12;
    	a9 = 7;
    	a147 = ((((((a147 * a72) % 14999) + 7483) / 5) % 54) + 170);
    	a108 = ((((a108 - -3868) + 13534) % 14806) + 15193);
    	a89 = 1;
    	a57 = (((a57 / 5) + -14262) + -993);
    	a84 = 15;
    	a187 = 2;
    	a199 = ((((a199 % 92) + 160) - -2) * 1); 
    	output = "Y";
    } 
    if((((((30 < a72) && (177 >= a72)) && ((a187 == 1) && ((input.equals("D")) && ((a154.equals("e")) && (a147 <=  63 && (((a59.equals("g")) && cf) && (a162 == 17))))))) && (a31 == 8)) && ((a80 <=  165 && (a86.equals("e"))) && a200 <=  89))) {
    	a127 -= (a127 - 20) < a127 ? 3 : 0;
    	cf = false;
    	if((a154.equals("g"))) {
    	a162 = (a139 - -7);
    	a49 = (a162 - 10); 
    	}else {
    	a100 = "f";
    	a147 = ((((((a147 * a72) % 14999) - 6076) % 26) + 90) - -1);
    	a176 = (((((((a72 * a147) % 58) + 108) + -1) * 5) % 58) - -160);
    	a97 = (a84 - -3);
    	}output = "T";
    } 
    if(((a8 <=  -7 && ((input.equals("B")) && (a156 <=  144 && ((a0.equals("e")) && a147 <=  63)))) && ((a59.equals("g")) && (((a96.equals("e")) && ((a95 == 1) && ((((30 < a72) && (177 >= a72)) && cf) && (a162 == 17)))) && (a139 == 6))))) {
    	a127 -= (a127 - 20) < a127 ? 1 : 0;
    	cf = false;
    	if((((200 < a53) && (286 >= a53)) && (!(a183.equals("h")) && (((11 < a172) && (199 >= a172)) || !(a28.equals("g")))))) {
    	a178 = "g";
    	a110 = "i";
    	a147 = (((((((a147 * a72) % 14999) % 54) - -170) - 20175) / 5) - -4195);
    	a190 = (((((((a72 * a147) % 14999) % 63) - 32) - 7) + -12344) - -12324); 
    	}else {
    	a100 = "h";
    	a24 = (a141 + 2);
    	a36 = ((a150 - a10) - -13);
    	a147 = ((((((a147 * a72) % 14999) - 1603) % 26) - -90) * 1);
    	}output = "X";
    } 
}
private  void calculateOutputm3(String input) {
    if(((a108 <=  146 && ((a102.equals("e")) && ((((a162 == 11) && cf) && (a12.equals("e"))) && a128 <=  195))) && ((a155.equals("e")) && (a177 == 5)))) {
    	if((((a51 <=  86 && ((a31 == 8) && ((a154.equals("e")) && (cf && (a133 == 10))))) && (a0.equals("e"))) && ((a10 == 9) && (a84 == 8)))) {
    		calculateOutputm37(input);
    	} 
    } 
    if((((a141 == 3) && (((a162 == 12) && cf) && (a64 == 4))) && (a80 <=  165 && ((a167.equals("e")) && ((a129 == 4) && a199 <=  68))))) {
    	if((((a191 <=  186 && (((a182 == 8) && cf) && (a10 == 9))) && a199 <=  68) && (((a39.equals("e")) && a79 <=  -157) && a57 <=  -149))) {
    		calculateOutputm38(input);
    	} 
    	if((((a78.equals("e")) && ((a39.equals("e")) && (a193 == 1))) && (((a129 == 4) && ((a31 == 8) && ((a182 == 13) && cf))) && a137 <=  157))) {
    		calculateOutputm40(input);
    	} 
    } 
    if(((((a10 == 9) && a156 <=  144) && (a102.equals("e"))) && ((a187 == 1) && ((a159 == 10) && ((a32 == 8) && (cf && (a162 == 15))))))) {
    	if(((((a156 <=  144 && (a191 <=  186 && ((a160.equals("g")) && cf))) && (a21.equals("e"))) && (a177 == 5)) && ((a31 == 8) && (a154.equals("e"))))) {
    		calculateOutputm45(input);
    	} 
    	if((((((((a160.equals("h")) && cf) && (a154.equals("e"))) && (a12.equals("e"))) && (a105.equals("e"))) && (a31 == 8)) && (a8 <=  -7 && a200 <=  89))) {
    		calculateOutputm46(input);
    	} 
    } 
    if((((a6.equals("e")) && a108 <=  146) && (((a81.equals("e")) && ((a64 == 4) && ((cf && (a162 == 17)) && a53 <=  200))) && (a89 == 1)))) {
    	if((a140 <=  176 && (a168 <=  13 && (a137 <=  157 && ((((a10 == 9) && (cf && ((30 < a72) && (177 >= a72)))) && a108 <=  146) && (a118 == 8)))))) {
    		calculateOutputm48(input);
    	} 
    } 
}
private  void calculateOutputm50(String input) {
    if((((a59.equals("h")) && (a147 <=  63 && ((a10 == 9) && ((a19.equals("g")) && ((input.equals("A")) && cf))))) && ((a153 == 5) && (((a168 <=  13 && ((a159 == 10) && (a178.equals("e")))) && (a0.equals("e"))) && a15 <=  -76)))) {
    	cf = false;
    	a31 = (a84 - -1);
    	a167 = "g";
    	a40 = "f";
    	a96 = "f";
    	a137 = (((((((a168 * a128) % 14999) + 4968) % 41) - -199) - -3616) - 3615);
    	a159 = (a177 + 6);
    	a32 = (a153 - -4);
    	a102 = "f";
    	a67 = "f";
    	a79 = ((((((((a79 * a15) % 14999) % 90) - 67) - 45) * 5) % 90) - -8);
    	a68 = (a84 + 5);
    	a168 = ((((((a128 * a137) % 14999) % 65) - -265) + 28532) + -28532);
    	a153 = ((a187 - a64) + 9);
    	a78 = "g";
    	a80 = ((((((a80 * a137) % 14999) - -10767) + 15) % 52) + 422);
    	a182 = (a139 - -4);
    	a89 = (a64 + -3);
    	a12 = "g";
    	a118 = ((a95 - a64) + 12);
    	a141 = ((a159 - a187) - 5);
    	a57 = (((((((a137 * a137) % 14999) % 40) + -138) * 5) % 40) + -83);
    	a6 = "g";
    	a10 = (a9 - -6);
    	a21 = "g";
    	a0 = "f";
    	a155 = "f";
    	a90 = (((((((a90 * a140) % 14999) - 7430) / 5) * 5) % 68) + -61);
    	a9 = (a118 + -4);
    	a105 = "f";
    	a139 = (a32 + -2);
    	a15 = (((((((a200 * a200) % 14999) % 47) - 43) * 5) % 47) + -28);
    	a108 = (((((((a128 * a137) % 14999) + -11865) / 5) + 15950) % 22) + 161);
    	a147 = ((((((a147 * a199) % 14999) % 26) + 90) - 17661) + 17661);
    	a34 = "g";
    	a140 = (((((((a140 * a8) % 14999) - -2183) % 70) - -246) + -10522) + 10524);
    	a84 = ((a129 + a159) - 5);
    	a129 = a177;
    	a100 = "i";
    	a199 = ((((((a199 * a191) % 14999) % 92) - -162) + 1) + -3);
    	a177 = (a159 - 5);
    	a128 = (((((((a128 * a53) % 14999) - 2951) % 91) - -287) + -6597) - -6598); 
    	output = "V";
    } 
    if((((a139 == 6) && ((a21.equals("e")) && (((a9 == 4) && ((a59.equals("h")) && ((a178.equals("e")) && cf))) && (a34.equals("e"))))) && ((((input.equals("E")) && ((a177 == 5) && a137 <=  157)) && a147 <=  63) && (a19.equals("g"))))) {
    	cf = false;
    	a147 = (((((a147 % 54) - -170) * 5) % 54) + 154);
    	a129 = (a89 + 3);
    	a102 = "g";
    	a139 = a31;
    	a199 = ((((((a199 * a168) % 14999) % 10) - -265) + 1) + -1);
    	a84 = ((a159 + a139) + -8);
    	a21 = "g";
    	a167 = "g";
    	a175 = ((a118 * a32) + -56);
    	a178 = "i";
    	a140 = ((((((a140 * a80) % 14999) % 59) + 377) + 4283) + -4282);
    	a40 = "g";
    	a79 = ((((((a79 * a57) % 14999) + -8649) / 5) % 90) + -44);
    	a96 = "g";
    	a165 = ((((((a147 * a147) % 14999) % 14) - -281) + 7) - 8);
    	a10 = ((a159 * a118) - 69);
    	a34 = "g";
    	a118 = (a129 - -4); 
    	output = "Y";
    } 
}
private  void calculateOutputm52(String input) {
    if((((((a96.equals("e")) && (a41 <=  2 && ((a102.equals("e")) && (input.equals("C"))))) && (a139 == 6)) && (a95 == 1)) && (a79 <=  -157 && (a80 <=  165 && (((a178.equals("f")) && ((a59.equals("h")) && cf)) && a147 <=  63))))) {
    	cf = false;
    	a131 = "i";
    	a59 = "i";
    	a157 = (((((((a200 * a200) % 14999) - -8661) * 1) - 5485) % 14) + 346); 
    	output = "Y";
    } 
    if(((((input.equals("E")) && ((a178.equals("f")) && (a140 <=  176 && a128 <=  195))) && (a159 == 10)) && ((a95 == 1) && (a41 <=  2 && ((a191 <=  186 && ((cf && (a59.equals("h"))) && a147 <=  63)) && (a187 == 1)))))) {
    	cf = false;
    	a193 = ((a177 * a84) - 53);
    	a108 = (((((((a53 * a128) % 14999) / 5) - -13690) + 9655) % 97) + 211);
    	a12 = "f";
    	a187 = ((a193 + a141) - 5);
    	a86 = "f";
    	a78 = "g";
    	a10 = (a141 + 6);
    	a150 = ((a89 + a64) - -1);
    	a139 = ((a89 + a84) + -3);
    	a95 = (a84 + -5);
    	a96 = "f";
    	a79 = ((((((a79 * a108) % 14999) + -14469) % 90) + -24) + 65);
    	a147 = (((((((a147 * a41) % 14999) * 2) % 54) + 170) + -6457) - -6457);
    	a80 = (((((((a80 * a53) % 14999) % 101) + 267) + 14289) - -8206) - 22494);
    	a159 = ((a9 - a95) - -11);
    	a20 = "f";
    	a118 = (a84 - -2);
    	a167 = "g";
    	a31 = (a64 + 3);
    	a155 = "g";
    	a9 = (a187 - -3);
    	a67 = "g";
    	a137 = (((((((a137 * a168) % 14999) % 41) + 200) / 5) * 10) / 2);
    	a178 = "h";
    	a56 = (a84 + -3);
    	a191 = ((((((a191 * a140) % 14999) / 5) / 5) % 89) + 275);
    	a34 = "g";
    	a200 = (((((((a200 * a53) % 14999) % 61) - -151) - 1) - 17360) + 17360);
    	a84 = (a187 - -7); 
    	output = "T";
    } 
}
private  void calculateOutputm53(String input) {
    if((((((input.equals("C")) && (((((a59.equals("h")) && cf) && (a178.equals("g"))) && a147 <=  63) && (a32 == 8))) && (a182 == 12)) && a140 <=  176) && (((a65.equals("e")) && ((a21.equals("e")) && a137 <=  157)) && a15 <=  -76))) {
    	a151 += (a151 + 20) > a151 ? 2 : 0;
    	a135 -= (a135 - 20) < a135 ? 2 : 0;
    	cf = false;
    	a9 = (a89 + 4);
    	a57 = (((((((a57 * a79) % 14999) - -5510) % 40) - 107) + -4198) + 4172);
    	a59 = "f";
    	a84 = (a118 - -2);
    	a34 = "e";
    	a21 = "f";
    	a132 = ((((((a200 * a156) % 14999) % 38) + -92) + -1) * 1);
    	a139 = (a153 + 2);
    	a8 = ((((((((a51 * a79) % 14999) % 91) - -137) * 1) * 5) % 91) - -111);
    	a29 = ((a32 + a118) + -5);
    	a86 = "g";
    	a118 = (a64 - -6);
    	a32 = ((a159 / a177) + 7);
    	a31 = (a187 - -8); 
    	output = "U";
    } 
    if(((a169 <=  154 && ((a84 == 8) && ((a118 == 8) && (a59.equals("h"))))) && ((((a78.equals("e")) && (a168 <=  13 && ((((input.equals("B")) && cf) && (a182 == 12)) && (a178.equals("g"))))) && a147 <=  63) && (a86.equals("e"))))) {
    	cf = false;
    	a147 = ((((((a147 * a108) % 14999) % 26) + 90) - 1) - -1);
    	a102 = "f";
    	a118 = (a193 - -8);
    	a200 = ((((((a200 * a128) % 14999) - -9595) - 16784) % 61) + 151);
    	a137 = ((((((a15 * a79) % 14999) / 5) + -5094) % 41) - -226);
    	a139 = (a118 - 2);
    	a65 = "f";
    	a15 = ((((((((a169 * a140) % 14999) - -3908) % 47) + -27) * 5) % 47) - 27);
    	a122 = (((((((a199 * a147) % 14999) % 14836) + 15162) / 5) * 5) - -3);
    	a96 = "f";
    	a36 = (a193 - -12);
    	a57 = ((((((((a57 * a137) % 14999) - -23599) % 40) - 128) * 5) % 40) + -95);
    	a193 = (a141 + -2);
    	a100 = "h";
    	a9 = ((a177 * a32) + -35);
    	a199 = (((((((a199 * a8) % 14999) - 2289) + 749) * 1) % 92) + 162); 
    	output = "Y";
    } 
}
private  void calculateOutputm54(String input) {
    if(((((((cf && (a178.equals("h"))) && (a87.equals("g"))) && a8 <=  -7) && (a59.equals("h"))) && (a40.equals("e"))) && (((a32 == 8) && ((((a34.equals("e")) && a147 <=  63) && (input.equals("C"))) && a53 <=  200)) && a140 <=  176))) {
    	cf = false;
    	a86 = "f";
    	a34 = "f";
    	a161 = "g";
    	a147 = (((((((a147 * a156) % 14999) + 7604) % 14887) - -15112) + -1732) + 1734);
    	a101 = ((a139 - a84) + 13);
    	a53 = (((((((a53 * a8) % 14999) % 42) + 244) * 1) - 26565) + 26563);
    	a10 = (a177 - -5);
    	a156 = (((((((a53 * a53) % 14999) % 75) + 169) + 3) * 10) / 9);
    	a122 = (((((((a147 * a147) % 14999) % 100) - -211) - -15604) + -24284) + 8648);
    	a89 = (a64 - 2);
    	a108 = (((((((a108 * a122) % 14999) + -10041) % 22) + 169) - 18309) + 18308);
    	a154 = "f";
    	a80 = (((((((a80 * a108) % 14999) + 1247) % 101) - -266) / 5) - -187);
    	a140 = (((((((a140 * a191) % 14999) % 70) - -247) / 5) + -9057) + 9276);
    	a21 = "f";
    	a64 = ((a187 + a153) - 2);
    	a168 = ((((((a168 * a200) % 14999) % 92) + 106) + -1) + 0); 
    	output = "V";
    } 
    if(((a147 <=  63 && (((a168 <=  13 && a200 <=  89) && (a87.equals("g"))) && a79 <=  -157)) && ((a59.equals("h")) && (((((input.equals("E")) && ((a178.equals("h")) && cf)) && (a6.equals("e"))) && (a10 == 9)) && (a86.equals("e")))))) {
    	cf = false;
    	 
    	output = "Y";
    } 
    if((((a59.equals("h")) && (a199 <=  68 && ((a21.equals("e")) && ((a178.equals("h")) && (cf && (input.equals("A"))))))) && (((((a86.equals("e")) && ((a96.equals("e")) && (a87.equals("g")))) && a147 <=  63) && (a102.equals("e"))) && (a187 == 1)))) {
    	a170 -= (a170 - 20) < a170 ? 2 : 0;
    	a135 += (a135 + 20) > a135 ? 4 : 0;
    	cf = false;
    	a137 = (((((((a79 * a147) % 14999) / 5) * 5) * 2) % 41) + 199);
    	a34 = "f";
    	a32 = ((a10 + a10) + -9);
    	a141 = (a10 + -4);
    	a102 = "f";
    	a108 = ((((((a108 * a147) % 14999) / 5) * 5) % 22) + 169);
    	a64 = (a139 + -1);
    	a9 = (a32 - 4);
    	a129 = (a9 + 1);
    	a105 = "f";
    	a159 = (a10 + 2);
    	a128 = (((((((a128 * a168) % 14999) * 2) - 1) - 0) % 91) - -287);
    	a199 = ((((((a199 * a169) % 14999) % 92) - -162) - -1) * 1);
    	a200 = ((((((a57 * a8) % 14999) - 12783) % 61) - -150) + 0);
    	a118 = (a153 - -3);
    	a167 = "f";
    	a100 = "i";
    	a65 = "f";
    	a80 = (((((((a80 * a137) % 14999) % 101) + 268) + -29986) + -100) + 30085);
    	a8 = ((((((a108 * a137) % 14999) + 9299) + -32123) * 10) / 9);
    	a150 = ((a32 * a193) - 8);
    	a177 = ((a10 + a139) - 9);
    	a6 = "f";
    	a51 = ((((((a51 * a191) % 14999) * 2) * 1) % 29) + 115);
    	a96 = "f";
    	a53 = (((((((a53 * a156) % 14999) % 42) + 243) + 1) + -17660) - -17658);
    	a0 = "f";
    	a12 = "f";
    	a78 = "e";
    	a84 = a10;
    	a154 = "f";
    	a140 = (((((a140 * a80) % 14999) - 14908) - 3) + -43);
    	a21 = "f";
    	a89 = (a139 - 4);
    	a156 = ((((((a90 * a137) % 14999) / 5) / 5) % 75) - -220);
    	a185 = "g";
    	a31 = (a9 + 4);
    	a147 = (((((a147 % 26) - -90) - -1) / 5) - -89);
    	a40 = "f";
    	a182 = (a187 + 8);
    	a139 = ((a193 + a193) + 3);
    	a86 = "f";
    	a79 = (((((((a79 * a137) % 14999) - -2119) / 5) - -26270) * -1) / 10);
    	a187 = ((a95 * a153) + -11);
    	a168 = (((((((a168 * a200) % 14999) * 2) % 92) + 105) - 12668) - -12668);
    	a10 = ((a193 + a95) + 5); 
    	output = "S";
    } 
}
private  void calculateOutputm55(String input) {
    if(((a15 <=  -76 && ((a84 == 8) && ((a128 <=  195 && (((a178.equals("i")) && a57 <=  -149) && (a160.equals("i")))) && (a86.equals("e"))))) && (a191 <=  186 && (((input.equals("D")) && ((a59.equals("h")) && cf)) && a147 <=  63)))) {
    	cf = false;
    	a51 = ((((((((a108 * a169) % 14999) % 18) + 163) - -1) * 5) % 18) - -163);
    	a15 = (((((((a15 * a169) % 14999) / 5) + -5097) - -8171) % 20) - -41);
    	a89 = (a159 - 7);
    	a156 = ((((((((a156 * a51) % 14999) / 5) % 23) + 321) * 5) % 23) - -311);
    	a6 = "g";
    	a140 = (((((((a140 * a51) % 14999) - 3647) / 5) + 1363) % 59) + 378);
    	a178 = "h";
    	a165 = ((((((((a147 * a8) % 14999) % 42) - -235) * 5) + 27980) % 42) + 231);
    	a153 = (a10 - 2);
    	a40 = "g";
    	a39 = "f";
    	a139 = (a89 + 5);
    	a21 = "g";
    	a78 = "g";
    	a147 = ((((((a147 * a165) % 14999) % 54) + 170) + 1) - 1);
    	a108 = ((((((a108 * a200) % 14999) + 5186) * 1) % 97) + 289);
    	a200 = ((((((a199 * a165) % 14999) - 2687) / 5) % 61) - -151);
    	a57 = ((((((((a57 * a15) % 14999) - -11466) % 18) + -48) * 5) % 18) + -36);
    	a96 = "f";
    	a10 = (a153 - -4);
    	a191 = (((((((a191 * a169) % 14999) % 76) + 442) + 2) + 24198) - 24198);
    	a79 = (((((((a79 * a137) % 14999) + 10205) * 1) - -901) % 90) - 43);
    	a84 = (a64 - -6);
    	a154 = "g";
    	a141 = (a95 + 3);
    	a167 = "g";
    	a137 = (((((((a137 * a8) % 14999) % 41) - -198) - 0) - 452) + 452);
    	a67 = "g";
    	a90 = ((((((a90 * a128) % 14999) * 2) + 1) % 100) - -107);
    	a32 = (a129 + 4);
    	a56 = (a187 + 7);
    	a128 = (((((((a199 * a199) % 14999) % 72) + 451) + 0) + 7964) + -7962);
    	a8 = (((((a165 * a51) % 14999) - 28386) + -764) + -73);
    	a86 = "f";
    	a64 = (a153 - 2);
    	a81 = "g";
    	a0 = "f";
    	a95 = (a89 - 1);
    	a177 = ((a9 * a9) - 9);
    	a31 = (a193 - -9);
    	a155 = "f";
    	a118 = a150;
    	a65 = "f";
    	a187 = (a89 - 1);
    	a159 = (a84 + 1);
    	a102 = "g";
    	a193 = (a153 - 6);
    	a9 = ((a150 / a89) + 2);
    	a199 = ((((((((a199 * a169) % 14999) % 10) + 265) - 15218) * 2) % 10) - -268); 
    	output = "V";
    } 
    if(((((a193 == 1) && (((a160.equals("i")) && (((cf && (a59.equals("h"))) && a147 <=  63) && (a154.equals("e")))) && (a21.equals("e")))) && (a178.equals("i"))) && (((a15 <=  -76 && a200 <=  89) && (a6.equals("e"))) && (input.equals("A"))))) {
    	cf = false;
    	a89 = ((a129 / a150) - -3);
    	a155 = "f";
    	a6 = "g";
    	a128 = ((((((a128 * a200) % 14999) % 72) - -453) + -17556) + 17555);
    	a0 = "f";
    	a140 = ((((((a140 * a90) % 14999) % 59) + 378) + -17679) - -17679);
    	a177 = (a10 + -2);
    	a84 = ((a64 * a89) - 2);
    	a167 = "g";
    	a32 = (a31 + 2);
    	a79 = (((((((a79 * a191) % 14999) * 2) + 1) / 5) % 90) - 44);
    	a40 = "g";
    	a165 = (((((((a147 * a147) % 14999) % 42) - -236) - -23920) - -169) + -24089);
    	a81 = "g";
    	a21 = "g";
    	a139 = (a129 - -2);
    	a56 = ((a193 - a153) - -12);
    	a78 = "g";
    	a102 = "g";
    	a96 = "f";
    	a15 = ((((((((a15 * a128) % 14999) % 20) - -40) - -4868) * 5) % 20) - -28);
    	a31 = (a177 - -3);
    	a187 = (a31 - 8);
    	a108 = (((((((a108 * a128) % 14999) / 5) - 16780) + -9900) % 97) - -331);
    	a86 = "f";
    	a193 = (a32 + -9);
    	a191 = ((((((a51 * a140) % 14999) % 76) - -442) * 1) + 2);
    	a153 = (a159 + -3);
    	a199 = (((((((a199 * a15) % 14999) % 10) - -264) - -1) + 26170) - 26170);
    	a159 = (a56 - -3);
    	a67 = "g";
    	a141 = (a150 - 6);
    	a200 = ((((((a191 * a51) % 14999) % 61) - -151) + -1) - -1);
    	a95 = (a9 + -2);
    	a156 = (((((((a156 * a137) % 14999) / 5) % 23) - -321) - 21871) + 21869);
    	a137 = (((((((a137 * a191) % 14999) % 41) + 198) - -2) - 16024) - -16024);
    	a154 = "g";
    	a118 = ((a9 / a10) + 10);
    	a64 = (a9 + 1);
    	a39 = "f";
    	a51 = ((((((((a128 * a57) % 14999) / 5) % 18) - -163) * 5) % 18) - -155);
    	a90 = ((((((((a90 * a8) % 14999) % 100) + 80) + 23) * 5) % 100) - -27);
    	a9 = ((a10 + a150) - 14);
    	a178 = "h";
    	a8 = (((((a8 * a140) % 14999) + -4813) - -3193) / 5);
    	a57 = ((((((((a57 * a140) % 14999) / 5) % 18) + -49) * 5) % 18) - 43);
    	a65 = "f";
    	a10 = (a129 - -5);
    	a147 = ((((((a147 * a165) % 14999) % 54) + 170) + -7631) + 7632); 
    	output = "U";
    } 
    if(((a156 <=  144 && (((a199 <=  68 && ((cf && (a178.equals("i"))) && a147 <=  63)) && (a160.equals("i"))) && (a65.equals("e")))) && ((a78.equals("e")) && (((a59.equals("h")) && ((a39.equals("e")) && (input.equals("C")))) && (a159 == 10))))) {
    	a74 += (a74 + 20) > a74 ? 3 : 0;
    	cf = false;
    	a95 = (a10 - 7);
    	a10 = ((a193 + a84) - -1);
    	a199 = ((((((a200 * a108) % 14999) + -11130) + -1595) % 92) + 160);
    	a32 = (a159 + -1);
    	a147 = (((((((a147 * a156) % 14999) + -11384) % 26) - -89) - 2917) + 2918);
    	a21 = "f";
    	a118 = ((a84 + a177) - 5);
    	a167 = "f";
    	a102 = "f";
    	a100 = "f";
    	a97 = a64;
    	a193 = (a153 + -3);
    	a15 = (((((((a15 * a140) % 14999) % 47) - 28) / 5) - -22934) + -22948);
    	a57 = ((((((((a57 * a128) % 14999) + -5091) % 40) + -108) * 5) % 40) - 73);
    	a90 = ((((((a90 * a199) % 14999) % 68) - 62) - 1) + 0);
    	a96 = "f";
    	a9 = ((a32 * a118) - 76);
    	a176 = (((((((a51 * a147) % 14999) + -293) + -14318) - -27683) % 58) - -163);
    	a139 = (a64 - -3);
    	a51 = (((((((a191 * a57) % 14999) % 29) - -115) - -1211) / 5) - 152);
    	a187 = (a153 - 3); 
    	output = "U";
    } 
    if(((((((a78.equals("e")) && (a178.equals("i"))) && a108 <=  146) && (input.equals("E"))) && a51 <=  86) && ((a15 <=  -76 && ((a84 == 8) && ((((a59.equals("h")) && cf) && a147 <=  63) && (a155.equals("e"))))) && (a160.equals("i"))))) {
    	cf = false;
    	a150 = (a84 + 1);
    	a8 = (((((((a8 * a15) % 14999) % 26) - -5) - -17958) / 5) + -3589);
    	a80 = ((((((a199 * a140) % 14999) % 101) - -268) + 1) + -1);
    	a51 = (((((((a51 * a199) % 14999) * 2) % 29) + 115) / 5) - -76);
    	a129 = (a84 + -4);
    	a34 = "g";
    	a118 = ((a9 - a32) + 12);
    	a57 = (((((((a57 * a137) % 14999) * 2) - 0) + 0) % 40) - 107);
    	a169 = (((((((a79 * a90) % 14999) % 34) + 211) / 5) + -8009) - -8196);
    	a39 = "f";
    	a21 = "f";
    	a168 = ((((((a156 * a140) % 14999) - 14728) % 92) - -106) - -1);
    	a159 = (a89 - -10);
    	a156 = (((((a156 * a15) % 14999) + -14925) - 15) - 37);
    	a81 = "e";
    	a96 = "f";
    	a155 = "e";
    	a187 = (a31 - 7);
    	a53 = (((((((a108 * a191) % 14999) % 47) - -334) + -1) + 2195) - 2192);
    	a154 = "f";
    	a9 = (a95 + 4);
    	a59 = "f";
    	a105 = "f";
    	a132 = (((((((a147 * a147) % 14999) % 53) - 1) + 3) + 591) + -591);
    	a86 = "f";
    	a29 = (a84 - -4);
    	a15 = (((((((a15 * a90) % 14999) % 47) + -49) * 9) / 10) / 5);
    	a65 = "f";
    	a0 = "f";
    	a108 = ((((((a108 * a199) % 14999) / 5) % 22) + 168) * 1); 
    	output = "S";
    } 
}
private  void calculateOutputm4(String input) {
    if(((((a32 == 8) && (((a178.equals("e")) && cf) && (a78.equals("e")))) && (a139 == 6)) && (((a129 == 4) && (a40.equals("e"))) && (a10 == 9)))) {
    	if(((a80 <=  165 && a140 <=  176) && ((((a10 == 9) && (((a19.equals("g")) && cf) && a79 <=  -157)) && a90 <=  -131) && (a31 == 8)))) {
    		calculateOutputm50(input);
    	} 
    } 
    if(((((a155.equals("e")) && a80 <=  165) && a108 <=  146) && ((a86.equals("e")) && (((a12.equals("e")) && ((a178.equals("f")) && cf)) && a137 <=  157)))) {
    	if(((((a96.equals("e")) && ((a139 == 6) && ((a31 == 8) && (cf && a41 <=  2)))) && a79 <=  -157) && ((a167.equals("e")) && (a67.equals("e"))))) {
    		calculateOutputm52(input);
    	} 
    } 
    if((((a102.equals("e")) && ((cf && (a178.equals("g"))) && (a139 == 6))) && (a79 <=  -157 && ((a137 <=  157 && (a193 == 1)) && (a177 == 5))))) {
    	if((((a139 == 6) && ((a84 == 8) && (((a182 == 12) && cf) && (a32 == 8)))) && ((a53 <=  200 && a57 <=  -149) && (a64 == 4)))) {
    		calculateOutputm53(input);
    	} 
    } 
    if((((a80 <=  165 && ((a31 == 8) && (a6.equals("e")))) && (a34.equals("e"))) && (((cf && (a178.equals("h"))) && a108 <=  146) && (a12.equals("e"))))) {
    	if((((a64 == 4) && ((a65.equals("e")) && (a51 <=  86 && ((a154.equals("e")) && ((a87.equals("g")) && cf))))) && ((a89 == 1) && (a177 == 5)))) {
    		calculateOutputm54(input);
    	} 
    } 
    if((((a9 == 4) && (((a32 == 8) && (a193 == 1)) && (a139 == 6))) && (a8 <=  -7 && (((a178.equals("i")) && cf) && (a31 == 8))))) {
    	if((((a84 == 8) && ((a160.equals("i")) && cf)) && ((a8 <=  -7 && (a200 <=  89 && (a137 <=  157 && a90 <=  -131))) && (a95 == 1)))) {
    		calculateOutputm55(input);
    	} 
    } 
}
private  void calculateOutputm58(String input) {
    if((((a138 == 6) && (((a185.equals("e")) && (((a12.equals("f")) && (((((63 < a147) && (116 >= a147)) && cf) && (input.equals("A"))) && (a40.equals("f")))) && ((195 < a128) && (379 >= a128)))) && (a100.equals("e")))) && (((a154.equals("f")) && (a187 == 2)) && ((144 < a156) && (296 >= a156))))) {
    	cf = false;
    	if(((((181 < a145) && (290 >= a145)) || (a40.equals("f"))) && (a24 == 6))) {
    	a129 = 8;
    	a145 = (((((a199 * a200) % 14999) + -28106) + -920) * 1);
    	a140 = (((((a140 * 5) * 5) + -21637) % 70) + 308);
    	a118 = 11;
    	a12 = "i";
    	a155 = "i";
    	a178 = "e";
    	a168 = (((a168 / 5) / -5) - 20476);
    	a78 = "f";
    	a84 = 13;
    	a141 = 3;
    	a172 = ((((((a156 * a147) % 14999) / 5) + -818) % 67) + 266);
    	a102 = "f";
    	a177 = 8;
    	a139 = 11;
    	a21 = "f";
    	a15 = ((((a15 - 24388) % 47) + 2) - 22);
    	a40 = "i";
    	a147 = ((((((a147 * a145) % 14999) % 54) - -171) - -1) * 1); 
    	}else {
    	a67 = "e";
    	a6 = "i";
    	a128 = ((((a128 - -28381) - 18133) + -14329) - -31734);
    	a199 = ((((a199 * 5) / 5) * 41) / 10);
    	a21 = "f";
    	a154 = "g";
    	a10 = 14;
    	a102 = "i";
    	a78 = "i";
    	a12 = "g";
    	a156 = (((((a156 * 24) / 10) - 6081) * 5) + 43360);
    	a53 = (((((a53 / 5) - 9101) - 2929) * -1) / 10);
    	a168 = (((((a168 / 5) - -2071) + -15924) * -1) / 10);
    	a80 = (((((a80 + 13487) + -479) + -34164) * -1) / 10);
    	a108 = (((((a108 - -28585) - 22058) + 11843) % 22) + 166);
    	a178 = "h";
    	a34 = "g";
    	a139 = 13;
    	a96 = "h";
    	a89 = 2;
    	a177 = 12;
    	a40 = "f";
    	a9 = 9;
    	a87 = "g";
    	a187 = 4;
    	a140 = ((((((a140 % 70) + 200) * 10) / 9) - 29906) - -29882);
    	a118 = 15;
    	a59 = "h";
    	a64 = 7;
    	a137 = (((((a137 / 5) * 79) / 10) - 14222) + 14220);
    	a200 = ((((((a200 + 25912) % 59) + 213) * 5) % 59) - -246);
    	a193 = 3;
    	a8 = ((((a8 + 130) / 5) + -15161) - -15221);
    	a84 = 12;
    	a79 = (((47 + -3050) + 10371) - 7517);
    	a167 = "f";
    	a147 = (((a147 + -16172) / 5) - 18550);
    	}output = "V";
    } 
    if(((((((68 < a199) && (254 >= a199)) && ((((176 < a140) && (318 >= a140)) && (a138 == 6)) && (a9 == 5))) && ((63 < a147) && (116 >= a147))) && (a100.equals("e"))) && ((a40.equals("f")) && (((a64 == 5) && ((input.equals("C")) && (cf && (a185.equals("e"))))) && (a150 == 9))))) {
    	cf = false;
    	a122 = (((((a147 * a147) + -13886) * 10) / 9) + -11393);
    	a165 = (((((((a199 * a57) % 14999) % 42) - -235) + 0) + 13879) + -13877);
    	a147 = (((((((a147 * a122) % 14999) % 14887) + 15112) + 1) / 5) + 14666);
    	a142 = ((((((a122 * a165) % 14999) % 14858) - -15140) + 0) + 0); 
    	output = "Y";
    } 
    if((((a154.equals("f")) && (((input.equals("B")) && (((63 < a147) && (116 >= a147)) && ((a185.equals("e")) && (((a138 == 6) && cf) && (a100.equals("e")))))) && (a39.equals("f")))) && ((a81.equals("f")) && (((165 < a80) && (369 >= a80)) && (((200 < a53) && (286 >= a53)) && (a118 == 9)))))) {
    	cf = false;
    	a118 = 13;
    	a65 = "e";
    	a31 = 15;
    	a29 = ((a159 - a10) - -8);
    	a193 = 3;
    	a67 = "e";
    	a10 = 12;
    	a79 = (((35 / 5) * 5) + -19138);
    	a147 = (((a147 - -21887) * 1) + 2687);
    	a167 = "h";
    	a48 = ((((((a108 * a168) % 14999) + 4789) * 1) % 71) + 114);
    	a34 = "h";
    	a9 = 5;
    	a86 = "i";
    	a32 = 12;
    	a51 = (((47 + -27310) / 5) - 14199);
    	a155 = "e";
    	a8 = ((((a8 + -7995) * 10) / 9) / 5);
    	a105 = "e";
    	a122 = (((((((a147 * a48) % 14999) - 10924) + -13114) - -36548) % 22) + 94); 
    	output = "V";
    } 
    if((((((a100.equals("e")) && (((a138 == 6) && (((cf && (input.equals("E"))) && (a185.equals("e"))) && ((63 < a147) && (116 >= a147)))) && ((154 < a169) && (179 >= a169)))) && ((165 < a80) && (369 >= a80))) && (a81.equals("f"))) && ((a21.equals("f")) && ((a187 == 2) && (a102.equals("f")))))) {
    	cf = false;
    	if((((a157 <=  150 || (a9 == 9)) || (a141 == 9)) && !(a193 == 2))) {
    	a132 = (((((a147 * a147) + -18447) * 10) / -9) * 1);
    	a59 = "f";
    	a147 = ((((a147 * a199) * 1) + 66) / -5);
    	a152 = (((((a132 * a132) % 14999) + -23186) * 1) + -3546); 
    	}else {
    	a100 = "g";
    	a179 = (a138 + 6);
    	a171 = (((((a147 * a199) + -14625) % 17) - -145) + -1);
    	}output = "Y";
    } 
    if((((((a40.equals("f")) && ((a154.equals("f")) && ((((a185.equals("e")) && cf) && (a100.equals("e"))) && (a138 == 6)))) && ((63 < a147) && (116 >= a147))) && (a118 == 9)) && ((((a155.equals("f")) && (a129 == 5)) && (a141 == 4)) && (input.equals("D"))))) {
    	cf = false;
    	a137 = (((((a137 / 5) + -6859) - 10779) * -1) / 10);
    	a167 = "i";
    	a59 = "f";
    	a12 = "i";
    	a168 = ((((a168 / 5) * 1655) / 10) + 4384);
    	a200 = ((((((a200 % 59) - -266) * 9) / 10) * 10) / 9);
    	a140 = (((((a140 * 5) % 70) + 211) * 10) / 9);
    	a147 = (((a147 + -4416) - 11797) * 1);
    	a29 = (a187 - -11);
    	a79 = ((((11 + -165) + -2) + -18918) + 18923);
    	a10 = 13;
    	a78 = "i";
    	a64 = 7;
    	a128 = ((((a128 - -1750) / 5) * 6) / 10);
    	a132 = ((((((a147 * a199) % 14999) + 9264) % 53) - -1) - -1);
    	a81 = "h";
    	a89 = 2;
    	a6 = "f";
    	a177 = 9;
    	a102 = "h";
    	a139 = 12;
    	a199 = (((((a199 / 5) + 106) + -2318) * -1) / 10); 
    	output = "X";
    } 
}
private  void calculateOutputm60(String input) {
    if((((input.equals("C")) && ((a31 == 9) && (((a193 == 2) && (((89 < a200) && (212 >= a200)) && (a78.equals("f")))) && (a95 == 2)))) && (((a100.equals("e")) && ((a32 == 9) && ((a123.equals("e")) && ((a185.equals("g")) && cf)))) && ((63 < a147) && (116 >= a147))))) {
    	cf = false;
    	a84 = (a187 - -7);
    	a6 = "g";
    	a89 = (a64 + -2);
    	a39 = "g";
    	a8 = (((((a8 * a156) + -14163) + -8658) % 91) - -151);
    	a137 = ((((((a51 * a80) % 14999) + -27341) % 82) - -351) - 4);
    	a141 = ((a89 - a150) - -11);
    	a96 = "g";
    	a140 = (((((((a53 * a51) % 14999) % 59) + 331) - 12) / 5) - -283);
    	a9 = (a187 + 3);
    	a200 = ((((((a200 * a53) % 14999) + -18053) + 14688) % 59) - -272);
    	a153 = (a187 + 4);
    	a168 = (((((a168 * a15) % 65) + 265) + 1) + -1);
    	a139 = ((a32 - a118) + 9);
    	a191 = ((((((a191 * a137) % 14999) % 76) - -386) * 1) + -16);
    	a102 = "g";
    	a165 = (((((a51 * a108) % 42) - -195) + -28063) + 28074);
    	a86 = "g";
    	a10 = (a31 - -2);
    	a178 = "i";
    	a21 = "g";
    	a132 = ((((((a165 * a147) % 14999) - -9717) * -1) / 10) - 21059);
    	a193 = ((a95 * a153) + -11);
    	a108 = ((((((a156 * a140) % 14999) - 253) + 11678) % 97) + 258);
    	a12 = "g";
    	a31 = (a89 + 7);
    	a90 = ((((((a79 * a79) * 1) % 100) - -107) * 9) / 10);
    	a167 = "g";
    	a150 = (a187 + 7);
    	a95 = (a153 - 4);
    	a177 = (a129 - -2);
    	a199 = (((((((a199 * a51) % 14999) % 10) + 255) - -16746) / 5) + -3130);
    	a32 = (a153 - -3);
    	a147 = ((((((a147 * a128) % 14999) % 54) + 145) + -13) + -3);
    	a15 = ((((((a15 * a90) + -4538) * 1) - -3010) % 20) - -40);
    	a57 = ((((((a57 * a156) % 14999) - 11447) % 18) + -49) + -1);
    	a51 = ((((((((a51 * a200) % 14999) + -19386) % 18) + 170) * 5) % 18) - -158); 
    	output = "Y";
    } 
    if((((a65.equals("f")) && (((a141 == 4) && (a10 == 10)) && (a100.equals("e")))) && ((((63 < a147) && (116 >= a147)) && ((a21.equals("f")) && ((a185.equals("g")) && (((cf && (input.equals("A"))) && (a123.equals("e"))) && (a6.equals("f")))))) && ((-76 < a15) && (19 >= a15))))) {
    	cf = false;
    	a20 = "f";
    	a89 = (a31 + -6);
    	a9 = (a118 + -4);
    	a141 = ((a150 + a139) + -11);
    	a15 = ((((((a15 * a169) % 20) - -41) - -15393) * 1) + -15393);
    	a56 = (a150 - 4);
    	a108 = ((((((a108 * a168) % 14999) % 97) - -290) - -1) + -15);
    	a21 = "g";
    	a95 = a89;
    	a102 = "e";
    	a64 = (a150 + -3);
    	a178 = "h";
    	a105 = "e";
    	a167 = "g";
    	a147 = (((a147 - -22320) / 5) - 4271);
    	a128 = ((((((a128 * a140) % 14999) - 22102) * 10) / 9) / 5);
    	a78 = "g";
    	a177 = (a56 - -2);
    	a168 = (((((((a168 * a140) % 14999) % 65) + 217) + 7) * 9) / 10);
    	a84 = ((a129 - a129) - -10);
    	a140 = (((((a191 * a80) % 14999) - 17276) * 1) - 5731);
    	a65 = "e";
    	a10 = (a139 + 4);
    	a156 = ((((((a156 * a80) % 14999) - 9489) - 19685) % 23) - -343);
    	a51 = ((((((a51 * a80) % 14999) % 18) - -155) - -7274) - 7266);
    	a139 = (a193 + 6);
    	a39 = "g";
    	a32 = (a84 - 2);
    	a6 = "g";
    	a193 = (a129 - 2);
    	a90 = ((((((a191 * a53) % 14999) / 5) + -4514) * 10) / 9);
    	a150 = ((a159 + a141) - 7); 
    	output = "T";
    } 
    if((((((-7 < a8) && (46 >= a8)) && ((a167.equals("f")) && ((((176 < a140) && (318 >= a140)) && ((a185.equals("g")) && (cf && (a123.equals("e"))))) && (a100.equals("e"))))) && (((a32 == 9) && (((input.equals("B")) && ((144 < a156) && (296 >= a156))) && ((63 < a147) && (116 >= a147)))) && (a102.equals("f")))) && a127 >= 4)) {
    	cf = false;
    	a178 = "h";
    	a56 = ((a177 + a84) - 8);
    	a51 = (((((a51 * a168) - 9431) % 18) + 163) - 0);
    	a89 = ((a32 + a32) - 15);
    	a84 = (a56 - -3);
    	a88 = (a177 + 7);
    	a10 = (a89 + 8);
    	a167 = "g";
    	a21 = "g";
    	a150 = (a141 + 6);
    	a147 = (((a147 / 5) + 136) - 13);
    	a9 = ((a129 / a139) - -6);
    	a105 = "g";
    	a139 = (a56 - -1);
    	a128 = (((((((a128 * a108) % 14999) - 25704) % 72) + 453) * 10) / 9);
    	a129 = ((a31 / a9) + 5); 
    	output = "Y";
    } 
    if((((a6.equals("f")) && (((a193 == 2) && (a123.equals("e"))) && (a10 == 10))) && ((((a84 == 9) && ((((cf && (a100.equals("e"))) && ((63 < a147) && (116 >= a147))) && (input.equals("E"))) && (a185.equals("g")))) && (a129 == 5)) && (a31 == 9)))) {
    	cf = false;
    	a100 = "g";
    	a40 = "f";
    	a179 = ((a64 / a31) + 10);
    	a171 = ((((((a199 * a200) % 14999) % 17) - -129) * 1) * 1); 
    	output = "Y";
    } 
}
private  void calculateOutputm62(String input) {
    if((((a118 == 9) && ((a0.equals("f")) && (((a185.equals("g")) && ((144 < a156) && (296 >= a156))) && (input.equals("B"))))) && ((a187 == 2) && (((a100.equals("e")) && (((195 < a128) && (379 >= a128)) && ((cf && (a123.equals("i"))) && ((63 < a147) && (116 >= a147))))) && (a89 == 2))))) {
    	cf = false;
    	a176 = ((((((a199 * a51) % 14999) - 25753) % 58) + 189) + 1);
    	a167 = "i";
    	a100 = "f";
    	a97 = (a129 + -1); 
    	output = "Y";
    } 
    if((((((186 < a191) && (365 >= a191)) && ((a21.equals("f")) && (a40.equals("f")))) && (a67.equals("f"))) && ((input.equals("C")) && (((63 < a147) && (116 >= a147)) && ((a185.equals("g")) && ((((13 < a168) && (198 >= a168)) && ((a100.equals("e")) && ((a123.equals("i")) && cf))) && (a141 == 4))))))) {
    	cf = false;
    	if(((a6.equals("h")) && ((195 < a128) && (379 >= a128)))) {
    	a78 = "h";
    	a86 = "i";
    	a53 = (((((31 * 10) / 1) - 5) + 17649) - 17659);
    	a199 = (((a199 * 5) * 5) * 4);
    	a168 = ((((a168 - 24897) + 25338) % 92) + 45);
    	a191 = (((((a191 + 22425) - 47695) - 4636) % 89) + 317);
    	a96 = "g";
    	a156 = (((((a156 % 75) + 199) - 42) * 10) / 9);
    	a118 = 9;
    	a51 = (((a51 * 5) * 5) / 5);
    	a81 = "h";
    	a102 = "h";
    	a129 = 8;
    	a90 = ((((a90 + -19057) + 19208) + 8951) + -8912);
    	a40 = "h";
    	a65 = "h";
    	a182 = ((a32 * a64) - 37);
    	a57 = (((a57 / 5) + -86) - 31);
    	a95 = 2;
    	a105 = "i";
    	a59 = "g";
    	a108 = ((((a108 * 5) % 22) + 153) * 1);
    	a79 = (((((14 / 5) * 10) / 9) * 9) / 10);
    	a139 = 9;
    	a6 = "i";
    	a32 = 13;
    	a31 = 13;
    	a162 = ((a193 - a193) - -12);
    	a84 = 14;
    	a167 = "g";
    	a12 = "g";
    	a80 = ((((a80 * 5) % 101) + 223) + -3);
    	a34 = "h";
    	a8 = ((((((a8 % 26) - -20) - -8411) * 3) % 26) - 3);
    	a128 = (((((a128 - 6239) % 72) + 468) * 10) / 9);
    	a10 = 14;
    	a177 = 9;
    	a141 = 7;
    	a64 = 10;
    	a187 = 1;
    	a89 = 6;
    	a39 = "g";
    	a0 = "h";
    	a147 = (((a147 - 24263) * 1) - 3505); 
    	}else {
    	a100 = "i";
    	a35 = "g";
    	a182 = (a84 - -3);
    	}output = "V";
    } 
    if(((((86 < a51) && (145 >= a51)) && ((a185.equals("g")) && ((((a123.equals("i")) && (((input.equals("A")) && (cf && ((63 < a147) && (116 >= a147)))) && ((144 < a156) && (296 >= a156)))) && (a150 == 9)) && (a78.equals("f"))))) && (((a105.equals("f")) && (a89 == 2)) && (a100.equals("e"))))) {
    	cf = false;
    	a84 = 9;
    	a21 = "i";
    	a32 = 15;
    	a80 = ((((a80 - -2535) % 101) - -191) - -65);
    	a139 = 10;
    	a78 = "e";
    	a56 = ((a89 * a150) + -14);
    	a147 = (((((a147 * a90) % 54) + 170) * 1) - 0);
    	a15 = ((((a15 % 47) + -27) + -2) - 0);
    	a178 = "h";
    	a180 = "g";
    	a89 = 4;
    	a10 = 16;
    	a168 = ((((a168 + -18715) + 29089) * 10) / 9);
    	a81 = "e";
    	a40 = "e";
    	a118 = 12;
    	a169 = ((((a169 % 12) - -158) + 14615) + -14608);
    	a108 = ((((a108 % 22) - -151) + 3719) - 3702);
    	a150 = 11; 
    	output = "Y";
    } 
    if((((((63 < a147) && (116 >= a147)) && (((186 < a191) && (365 >= a191)) && (((((a118 == 9) && (((a100.equals("e")) && cf) && (a185.equals("g")))) && (input.equals("E"))) && ((-7 < a8) && (46 >= a8))) && (a10 == 10)))) && ((154 < a169) && (179 >= a169))) && ((a6.equals("f")) && (a123.equals("i"))))) {
    	cf = false;
    	a162 = (a129 - -5);
    	a114 = (((((a108 * a108) % 14999) + 4356) * 1) - 31473);
    	a59 = "g";
    	a147 = ((((a147 * a199) * -1) * 1) / 5); 
    	output = "T";
    } 
    if(((((68 < a199) && (254 >= a199)) && (((165 < a80) && (369 >= a80)) && (((63 < a147) && (116 >= a147)) && ((a100.equals("e")) && (((86 < a51) && (145 >= a51)) && ((a185.equals("g")) && (cf && (a123.equals("i"))))))))) && (((-131 < a90) && (6 >= a90)) && (((a65.equals("f")) && (input.equals("D"))) && ((186 < a191) && (365 >= a191)))))) {
    	a74 -= (a74 - 20) < a74 ? 1 : 0;
    	cf = false;
    	if(a53 <=  200) {
    	a199 = ((((a199 % 92) + 83) - -20663) + -20655);
    	a6 = "f";
    	a118 = 8;
    	a178 = "f";
    	a21 = "h";
    	a108 = ((((a108 / 5) + 149) + 21637) - 21633);
    	a138 = ((a141 / a31) + 3);
    	a15 = (((a15 - -15628) + 1083) - -216);
    	a129 = 9;
    	a84 = 15;
    	a139 = 6;
    	a8 = ((((((a8 - -16460) % 26) + 3) * 5) % 26) + 9);
    	a57 = (((a57 / -5) - -11874) + 6055);
    	a40 = "h";
    	a67 = "h";
    	a187 = 2;
    	a78 = "e";
    	a128 = (((((a128 + -21105) % 91) - -363) + 29544) + -29575);
    	a171 = (((((a147 * a147) % 88) + 19) / 5) + 76);
    	a147 = ((((((a147 * a171) % 54) - -171) - 29780) * 1) - -29780); 
    	}else {
    	a6 = "e";
    	a128 = ((((a128 % 72) + 415) - 28) - 3);
    	a182 = (a177 - -4);
    	a100 = "i";
    	a168 = (((((a168 + 2490) + -7600) + 28087) % 92) - -39);
    	a78 = "e";
    	a169 = ((((a169 / 5) * 10) / 1) - -24454);
    	a12 = "e";
    	a53 = (((78 + 10250) + -35028) * 1);
    	a105 = "h";
    	a193 = 2;
    	a155 = "g";
    	a137 = (((42 - -6017) + 19848) + 362);
    	a80 = (((a80 - -5371) * 5) * 1);
    	a84 = 14;
    	a68 = (a150 - -4);
    	a21 = "f";
    	a86 = "i";
    	a39 = "g";
    	a31 = 11;
    	a200 = ((((55 * 5) / 5) + -16670) + 16829);
    	a140 = (((((72 * 10) / 2) / 5) + 25107) - 24766);
    	a153 = 8;
    	a150 = 12;
    	}output = "U";
    } 
}
private  void calculateOutputm63(String input) {
    if(((((((68 < a199) && (254 >= a199)) && ((((a100.equals("e")) && (a177 == 6)) && ((-149 < a57) && (-68 >= a57))) && (a84 == 9))) && (a106 == 5)) && (a32 == 9)) && (((63 < a147) && (116 >= a147)) && ((a95 == 2) && ((cf && (input.equals("C"))) && (a185.equals("i"))))))) {
    	a151 += (a151 + 20) > a151 ? 2 : 0;
    	a135 -= (a135 - 20) < a135 ? 2 : 0;
    	cf = false;
    	a78 = "g";
    	a81 = "g";
    	a199 = ((((((a51 * a108) % 14999) - 2589) % 10) + 265) - 1);
    	a32 = ((a9 - a9) - -10);
    	a168 = (((((((a168 * a199) % 14999) / 5) + 16607) * 1) % 65) - -221);
    	a95 = (a150 - 7);
    	a96 = "g";
    	a102 = "g";
    	a187 = (a139 - 4);
    	a128 = ((((((a79 * a191) % 14999) % 72) - -452) - -24786) + -24786);
    	a143 = "h";
    	a89 = ((a129 * a139) + -32);
    	a177 = (a150 + -3);
    	a53 = ((((((a169 * a57) % 14999) % 47) - -334) - -1) - -1);
    	a139 = (a32 - 2);
    	a57 = ((((((a79 * a51) % 18) - 49) * 5) % 18) - 31);
    	a129 = ((a193 + a193) - -2);
    	a8 = (((((a8 * a53) % 91) - -137) - 0) * 1);
    	a84 = (a118 - -1);
    	a167 = "g";
    	a178 = "g";
    	a118 = ((a150 - a150) - -10);
    	a15 = ((((((a15 * a156) % 20) - -40) + -1) - -13094) - 13093);
    	a110 = "h";
    	a105 = "g";
    	a34 = "g";
    	a80 = ((((((a80 * a128) % 14999) + -20079) % 52) - -468) + -11);
    	a86 = "g";
    	a147 = (((a147 - -89) - -9) - -8); 
    	output = "U";
    } 
    if((((((195 < a128) && (379 >= a128)) && (input.equals("B"))) && ((-7 < a8) && (46 >= a8))) && (((a9 == 5) && (((((a100.equals("e")) && (((63 < a147) && (116 >= a147)) && (cf && (a185.equals("i"))))) && (a106 == 5)) && (a118 == 9)) && (a84 == 9))) && ((146 < a108) && (191 >= a108))))) {
    	cf = false;
    	a36 = (a106 - -8);
    	a100 = "h";
    	a122 = ((((a147 * a147) + 13315) + 3174) * 1); 
    	output = "Y";
    } 
}
private  void calculateOutputm6(String input) {
    if((((cf && (a185.equals("e"))) && (a89 == 2)) && ((a105.equals("f")) && ((a118 == 9) && (((-149 < a57) && (-68 >= a57)) && ((a96.equals("f")) && ((157 < a137) && (241 >= a137)))))))) {
    	if((((a89 == 2) && ((a39.equals("f")) && (a78.equals("f")))) && ((a177 == 6) && (((a105.equals("f")) && (cf && (a138 == 6))) && (a84 == 9))))) {
    		calculateOutputm58(input);
    	} 
    } 
    if((((((186 < a191) && (365 >= a191)) && (((a64 == 5) && ((-7 < a8) && (46 >= a8))) && ((165 < a80) && (369 >= a80)))) && (a105.equals("f"))) && (((a185.equals("g")) && cf) && ((146 < a108) && (191 >= a108))))) {
    	if(((((-76 < a15) && (19 >= a15)) && ((cf && (a123.equals("e"))) && (a12.equals("f")))) && ((a177 == 6) && ((a39.equals("f")) && ((a102.equals("f")) && (a6.equals("f"))))))) {
    		calculateOutputm60(input);
    	} 
    	if(((((86 < a51) && (145 >= a51)) && ((a64 == 5) && ((a67.equals("f")) && (cf && (a123.equals("i")))))) && (((a105.equals("f")) && (a81.equals("f"))) && (a177 == 6)))) {
    		calculateOutputm62(input);
    	} 
    } 
    if((((cf && (a185.equals("i"))) && (a154.equals("f"))) && (((((a193 == 2) && ((195 < a128) && (379 >= a128))) && (a105.equals("f"))) && (a86.equals("f"))) && ((-7 < a8) && (46 >= a8))))) {
    	if(((((200 < a53) && (286 >= a53)) && (((a167.equals("f")) && (a187 == 2)) && (a78.equals("f")))) && ((a154.equals("f")) && (((a106 == 5) && cf) && ((165 < a80) && (369 >= a80)))))) {
    		calculateOutputm63(input);
    	} 
    } 
}
private  void calculateOutputm67(String input) {
    if((((a97 == 7) && (((63 < a147) && (116 >= a147)) && ((a6.equals("f")) && ((((146 < a108) && (191 >= a108)) && (a67.equals("f"))) && ((157 < a137) && (241 >= a137)))))) && (((((68 < a199) && (254 >= a199)) && (((104 < a176) && (221 >= a176)) && ((a100.equals("f")) && cf))) && (a64 == 5)) && (input.equals("E"))))) {
    	cf = false;
    	a34 = "g";
    	a110 = "h";
    	a10 = (a153 + 2);
    	a199 = (((((a199 * a15) % 10) - -264) * 1) * 1);
    	a9 = ((a89 * a153) + -15);
    	a96 = "g";
    	a108 = (((((a108 * a90) % 97) + 290) + -2) * 1);
    	a139 = (a159 - 4);
    	a105 = "f";
    	a177 = ((a187 + a31) + -4);
    	a51 = ((((((a199 * a108) % 14999) - 17994) + 12538) % 18) - -164);
    	a65 = "g";
    	a53 = (((((((a169 * a128) % 14999) + -3301) + -1240) + 11323) % 47) - -335);
    	a187 = (a64 + -2);
    	a102 = "g";
    	a167 = "g";
    	a80 = ((((((((a80 * a51) % 14999) % 52) - -400) * 5) * 5) % 52) - -398);
    	a6 = "g";
    	a118 = (a9 - -4);
    	a191 = (((((((a51 * a176) % 14999) - -7324) + 5045) - 30161) % 76) - -508);
    	a143 = "f";
    	a39 = "g";
    	a67 = "g";
    	a129 = (a32 - 3);
    	a79 = ((((((a79 * a168) % 14999) + -12227) % 90) + 24) / 5);
    	a40 = "g";
    	a150 = (a129 + 4);
    	a64 = (a150 + -4);
    	a8 = ((((((a53 * a51) % 14999) % 91) - -56) + 27) - 23);
    	a57 = (((((((a57 * a191) % 14999) % 18) + -49) - -1) + 11862) - 11863);
    	a147 = (((((a147 * a176) + 730) - 5306) % 54) - -117);
    	a169 = ((((((a169 * a51) % 14999) % 34) + 182) - -16838) + -16814);
    	a178 = "g";
    	a156 = (((((a51 * a79) + 12459) + -2779) % 75) + 221); 
    	output = "V";
    } 
    if((((((a118 == 9) && ((((146 < a108) && (191 >= a108)) && (a97 == 7)) && ((63 < a147) && (116 >= a147)))) && (a102.equals("f"))) && (a32 == 9)) && (((-157 < a79) && (-135 >= a79)) && ((a31 == 9) && ((a100.equals("f")) && (((input.equals("C")) && cf) && ((104 < a176) && (221 >= a176)))))))) {
    	cf = false;
    	a167 = "g";
    	a65 = "g";
    	a9 = (a32 + -3);
    	a39 = "g";
    	a150 = (a97 - -3);
    	a156 = ((((((a51 * a80) % 14999) + 2952) * 1) % 75) - -217);
    	a178 = "g";
    	a169 = ((((((a169 * a128) % 14999) % 34) - -193) + -30003) + 29992);
    	a118 = (a153 + 3);
    	a64 = (a129 - -1);
    	a57 = ((((((a57 * a15) % 18) - 49) + -20053) * 1) + 20052);
    	a143 = "f";
    	a187 = (a159 - 9);
    	a34 = "g";
    	a199 = ((((((a199 * a140) % 14999) % 10) + 259) / 5) - -212);
    	a53 = (((((((a128 * a169) % 14999) + -26357) * 1) - -18496) % 47) + 333);
    	a108 = (((((a108 * a15) / 5) * 5) % 97) + 288);
    	a79 = (((((a79 * a51) % 90) - -9) + 12093) + -12095);
    	a191 = ((((((a128 * a53) % 14999) % 76) + 376) - 26512) + 26537);
    	a96 = "g";
    	a8 = ((((((a169 * a128) % 14999) % 91) - -88) * 5) / 5);
    	a177 = (a10 - 3);
    	a102 = "g";
    	a129 = (a193 - -3);
    	a105 = "f";
    	a10 = ((a9 / a89) + 7);
    	a67 = "g";
    	a40 = "g";
    	a139 = (a32 + -1);
    	a6 = "g";
    	a51 = ((((((a128 * a8) % 14999) + 5190) % 18) + 158) * 1);
    	a147 = ((((((a147 * a80) % 14999) % 54) - -167) - 49) * 1);
    	a110 = "h";
    	a80 = ((((((a80 * a191) % 14999) % 52) + 404) + 5) - -2); 
    	output = "Y";
    } 
    if(((((157 < a137) && (241 >= a137)) && (((86 < a51) && (145 >= a51)) && ((((a100.equals("f")) && (((63 < a147) && (116 >= a147)) && cf)) && (input.equals("A"))) && ((104 < a176) && (221 >= a176))))) && ((a40.equals("f")) && (((((154 < a169) && (179 >= a169)) && (a129 == 5)) && (a21.equals("f"))) && (a97 == 7))))) {
    	cf = false;
    	a160 = "g";
    	a100 = "i";
    	a182 = (a187 - -13); 
    	output = "S";
    } 
}
private  void calculateOutputm68(String input) {
    if(((((a100.equals("f")) && (((154 < a169) && (179 >= a169)) && (((68 < a199) && (254 >= a199)) && (((a139 == 7) && ((-157 < a79) && (-135 >= a79))) && (a97 == 8))))) && (a89 == 2)) && ((input.equals("C")) && ((((104 < a176) && (221 >= a176)) && (((63 < a147) && (116 >= a147)) && cf)) && ((195 < a128) && (379 >= a128)))))) {
    	a151 += (a151 + 20) > a151 ? 2 : 0;
    	a135 -= (a135 - 20) < a135 ? 2 : 0;
    	cf = false;
    	a8 = ((((((a8 * a156) / 5) / 5) + -11679) % 91) + 148);
    	a102 = "g";
    	a150 = (a97 - -2);
    	a167 = "g";
    	a81 = "g";
    	a79 = (((((((a51 * a156) % 14999) % 90) - 99) * 9) / 10) / 5);
    	a118 = a10;
    	a89 = (a9 + -2);
    	a143 = "h";
    	a34 = "g";
    	a10 = (a118 - -1);
    	a110 = "h";
    	a178 = "g";
    	a128 = ((((((((a128 * a169) % 14999) % 72) - -406) * 5) - 10468) % 72) + 460);
    	a21 = "g";
    	a169 = (((((((a169 * a137) % 14999) - -3234) % 34) - -187) / 5) - -202);
    	a177 = ((a97 - a89) + 2);
    	a199 = (((((((a199 * a90) % 14999) - 7361) + 7002) * 1) % 10) - -264);
    	a12 = "g";
    	a84 = (a129 + 4);
    	a57 = (((((((a57 * a15) + 10806) % 18) + -62) / 5) * 56) / 10);
    	a0 = "g";
    	a15 = ((((((a51 * a80) % 14999) + 13046) % 20) - -41) - -1);
    	a51 = (((((((a51 * a168) % 14999) % 18) + 147) * 1) - -24580) - 24578);
    	a147 = ((((((a147 * a176) % 54) + 137) - 1308) - 21106) + 22402);
    	a187 = (a177 - 4);
    	a139 = ((a97 - a32) - -10);
    	a96 = "g";
    	a156 = ((((((a156 * a79) % 14999) % 23) - -320) / 5) + 248); 
    	output = "U";
    } 
    if((((((86 < a51) && (145 >= a51)) && (((a141 == 4) && ((input.equals("B")) && (((104 < a176) && (221 >= a176)) && cf))) && ((63 < a147) && (116 >= a147)))) && (a102.equals("f"))) && ((a97 == 8) && ((((a167.equals("f")) && ((-7 < a8) && (46 >= a8))) && (a150 == 9)) && (a100.equals("f")))))) {
    	a74 += (a74 + 20) > a74 ? 3 : 0;
    	cf = false;
    	a36 = ((a84 * a84) + -68);
    	a100 = "h";
    	a122 = ((((a147 * a199) + 362) + 173) / 5); 
    	output = "Y";
    } 
}
private  void calculateOutputm71(String input) {
    if((((((63 < a147) && (116 >= a147)) && (((a21.equals("f")) && ((-149 < a57) && (-68 >= a57))) && ((197 < a98) && (265 >= a98)))) && (a153 == 6)) && (((((221 < a176 && ((input.equals("C")) && cf)) && (a100.equals("f"))) && ((200 < a53) && (286 >= a53))) && (a118 == 9)) && (a34.equals("f"))))) {
    	cf = false;
    	a0 = "e";
    	a10 = ((a159 + a159) + -11);
    	a96 = "e";
    	a34 = "e";
    	a139 = a153;
    	a167 = "e";
    	a157 = ((((((a200 * a140) % 14999) + 6147) - 29101) % 14) - -355);
    	a131 = "i";
    	a118 = ((a129 * a139) - 16);
    	a12 = "e";
    	a140 = (((((a176 * a200) % 14999) + -22459) * 1) - 3936);
    	a102 = "e";
    	a147 = (((((a147 * a98) % 14999) - 22522) + -1106) - 1706);
    	a59 = "i";
    	a200 = (((((a200 * a176) % 14999) - 1598) + -16829) / 5); 
    	output = "Y";
    } 
    if((((a6.equals("f")) && ((a118 == 9) && ((a84 == 9) && (input.equals("E"))))) && (((a100.equals("f")) && ((a32 == 9) && ((((-131 < a90) && (6 >= a90)) && (((63 < a147) && (116 >= a147)) && (cf && ((197 < a98) && (265 >= a98))))) && 221 < a176))) && (a12.equals("f"))))) {
    	cf = false;
    	a167 = "g";
    	a10 = (a153 - -5);
    	a193 = ((a10 - a84) + 1);
    	a34 = "g";
    	a118 = ((a193 / a10) + 10);
    	a102 = "e";
    	a95 = ((a153 * a118) - 57);
    	a177 = (a95 - -4);
    	a159 = (a141 + 7);
    	a20 = "f";
    	a81 = "g";
    	a108 = (((((((a98 * a169) % 14999) + 10758) % 97) - -197) / 5) + 159);
    	a155 = "g";
    	a51 = ((((((a51 * a57) + -3191) % 18) - -174) - 9991) - -9984);
    	a6 = "g";
    	a9 = (a64 - -1);
    	a137 = ((((((a108 * a108) % 14999) + -4188) % 41) + 199) + -1);
    	a139 = (a64 + 3);
    	a15 = ((((((a15 * a176) % 14999) * 2) % 20) - -41) * 1);
    	a147 = (((((a147 * a200) * 1) % 54) - -153) - -12);
    	a150 = (a64 + 5);
    	a86 = "f";
    	a32 = (a9 + 2);
    	a140 = (((((a140 * a98) % 14999) + -29130) + -16) - 560);
    	a21 = "g";
    	a178 = "h";
    	a53 = (((((((a53 * a168) % 14999) % 47) + 334) - 20758) / 5) - -4419);
    	a80 = ((((((a79 * a199) % 14999) * 2) * 1) % 101) - -268);
    	a56 = a64;
    	a187 = ((a150 / a177) - -2);
    	a84 = ((a10 / a159) + 10);
    	a90 = (((((((a90 * a191) % 14999) % 14934) + -15064) - -2413) + -1805) + -609);
    	a64 = ((a118 + a9) + -10); 
    	output = "T";
    } 
}
private  void calculateOutputm7(String input) {
    if((((a102.equals("f")) && (((104 < a176) && (221 >= a176)) && cf)) && (((a187 == 2) && (((-131 < a90) && (6 >= a90)) && (((-149 < a57) && (-68 >= a57)) && (a177 == 6)))) && (a81.equals("f"))))) {
    	if(((((a65.equals("f")) && ((cf && (a97 == 7)) && ((157 < a137) && (241 >= a137)))) && (a64 == 5)) && (((a150 == 9) && (a39.equals("f"))) && (a167.equals("f"))))) {
    		calculateOutputm67(input);
    	} 
    	if((((cf && (a97 == 8)) && (a177 == 6)) && ((a12.equals("f")) && ((a21.equals("f")) && (((a9 == 5) && ((157 < a137) && (241 >= a137))) && ((144 < a156) && (296 >= a156))))))) {
    		calculateOutputm68(input);
    	} 
    } 
    if((((a118 == 9) && ((a102.equals("f")) && ((a95 == 2) && (a12.equals("f"))))) && (((221 < a176 && cf) && ((186 < a191) && (365 >= a191))) && ((200 < a53) && (286 >= a53))))) {
    	if((((((((197 < a98) && (265 >= a98)) && cf) && ((86 < a51) && (145 >= a51))) && ((68 < a199) && (254 >= a199))) && ((89 < a200) && (212 >= a200))) && ((a81.equals("f")) && ((a187 == 2) && ((200 < a53) && (286 >= a53)))))) {
    		calculateOutputm71(input);
    	} 
    } 
}
private  void calculateOutputm73(String input) {
    if((((a95 == 2) && ((a39.equals("f")) && (((a171 <=  -52 && ((cf && ((63 < a147) && (116 >= a147))) && (input.equals("A")))) && (a154.equals("f"))) && (a102.equals("f"))))) && ((a45.equals("h")) && ((a100.equals("g")) && (((195 < a128) && (379 >= a128)) && (a187 == 2)))))) {
    	cf = false;
    	a187 = (a32 + -7);
    	a53 = ((((((((a140 * a8) % 14999) % 42) - -243) * 5) + 25600) % 42) - -242);
    	a141 = ((a89 / a177) + 3);
    	a199 = (((((a156 * a140) % 14999) + -14968) - 26) + -5);
    	a200 = (((((a200 * a140) % 14999) + -14922) * 1) * 1);
    	a128 = (((((a128 * a140) % 14999) / 5) - 11664) * 2);
    	a65 = "e";
    	a10 = (a193 + 8);
    	a34 = "g";
    	a108 = ((((a108 * a147) * -1) - -14541) + -21409);
    	a118 = (a177 - -2);
    	a81 = "f";
    	a150 = (a64 - -5);
    	a59 = "h";
    	a31 = ((a32 - a187) - -1);
    	a67 = "e";
    	a96 = "e";
    	a78 = "e";
    	a178 = "i";
    	a102 = "e";
    	a191 = (((((a156 * a57) % 14999) - -21828) + -7795) + -23549);
    	a95 = (a177 - 5);
    	a139 = (a129 - -1);
    	a84 = ((a10 / a193) - 1);
    	a159 = (a64 - -5);
    	a155 = "e";
    	a9 = ((a95 / a64) + 4);
    	a39 = "e";
    	a169 = ((((((((a169 * a137) % 14999) % 34) - -185) * 10) / 9) * 9) / 10);
    	a167 = "e";
    	a79 = ((((((a191 * a156) % 14999) / 5) - 15238) * 10) / 9);
    	a12 = "e";
    	a86 = "e";
    	a80 = ((((((a140 * a140) % 14999) % 52) - -421) - 0) - 0);
    	a160 = "i";
    	a129 = ((a187 + a193) + 4);
    	a154 = "e";
    	a153 = (a187 + 4);
    	a57 = ((((((a57 * a199) % 14999) % 14925) + -15073) * 1) - 2);
    	a90 = (((((((a90 * a199) % 14999) + 12393) % 14934) + -15064) - -11546) - 11548);
    	a15 = ((((((a15 * a140) % 14999) % 14962) + -15037) - 1) + -1);
    	a6 = "e";
    	a89 = ((a187 - a139) + 6);
    	a156 = (((((a156 * a79) % 14999) + -8996) / 5) * 5);
    	a105 = "f";
    	a137 = (((((a137 * a51) % 14999) - 14923) - -14734) + -14752);
    	a40 = "f";
    	a147 = (((((a147 * a171) % 14999) + -3858) * 1) + -1735);
    	a168 = ((((((a8 * a140) % 14999) / 5) % 65) - -264) - -2);
    	a64 = (a84 - 4); 
    	output = "X";
    } 
    if(((((((a155.equals("f")) && ((a39.equals("f")) && ((a100.equals("g")) && (cf && a171 <=  -52)))) && (a45.equals("h"))) && (a118 == 9)) && ((157 < a137) && (241 >= a137))) && (((((63 < a147) && (116 >= a147)) && ((-157 < a79) && (-135 >= a79))) && (input.equals("C"))) && (a65.equals("f"))))) {
    	cf = false;
    	a95 = (a118 + -6);
    	a139 = ((a9 * a177) - 22);
    	a177 = ((a139 + a31) - 10);
    	a79 = ((((((a79 * a108) % 90) - 7) + 20) - -7513) + -7554);
    	a128 = ((((((a128 * a137) % 14999) + 8144) % 72) - -399) * 1);
    	a172 = (((((((((a171 * a171) % 14999) % 93) + 53) * 9) / 10) * 5) % 93) + 94);
    	a86 = "g";
    	a167 = "g";
    	a155 = "g";
    	a178 = "e";
    	a15 = (((((a15 * a199) + -107) * 1) % 20) + 41);
    	a118 = ((a153 * a10) + -67);
    	a40 = "g";
    	a39 = "g";
    	a147 = (((((a147 * a172) % 54) + 124) + 6) - -11);
    	a175 = (a64 + 4); 
    	output = "X";
    } 
}
private  void calculateOutputm74(String input) {
    if((((((63 < a147) && (116 >= a147)) && (((a81.equals("f")) && (a21.equals("f"))) && (a105.equals("f")))) && (a153 == 6)) && ((((-52 < a171) && (126 >= a171)) && ((a4 == 3) && (((89 < a200) && (212 >= a200)) && ((a100.equals("g")) && ((input.equals("B")) && cf))))) && (a86.equals("f"))))) {
    	cf = false;
    	a191 = (((a191 / 5) + 17678) - 46775);
    	a34 = "e";
    	a190 = ((((a51 * a57) - 8523) + -15) + -1);
    	a12 = "e";
    	a65 = "g";
    	a40 = "h";
    	a140 = (((((71 * 5) * 9) / 10) * 10) / 9);
    	a153 = 11;
    	a29 = ((a187 * a187) + 10);
    	a128 = (((((42 * 10) / 1) - -23165) + -47324) - -24135);
    	a78 = "e";
    	a122 = (((((((a190 * a171) % 14999) * 2) + -2) + 0) % 22) + 101);
    	a147 = (((((a147 * a190) % 14999) - -28440) - 20179) - -16427); 
    	output = "Y";
    } 
    if(((((((13 < a168) && (198 >= a168)) && (a32 == 9)) && ((186 < a191) && (365 >= a191))) && (a102.equals("f"))) && ((((a100.equals("g")) && ((((63 < a147) && (116 >= a147)) && ((input.equals("D")) && (cf && ((-52 < a171) && (126 >= a171))))) && (a4 == 3))) && (a39.equals("f"))) && (a9 == 5)))) {
    	cf = false;
    	if((a152 <=  -104 || (((((331 < a157) && (361 >= a157)) || (a88 == 10)) && !(a101 == 11)) || (a0.equals("i"))))) {
    	a153 = 6;
    	a6 = "f";
    	a10 = 14;
    	a178 = "f";
    	a51 = (((a51 / 5) + -7893) - 5123);
    	a90 = (((a90 + -19741) + -6937) / 5);
    	a67 = "i";
    	a108 = ((((36 - 25481) / 5) * 10) / 9);
    	a128 = (((32 + 8335) - -5141) * 2);
    	a65 = "g";
    	a141 = 8;
    	a118 = 15;
    	a79 = (((a79 + -24687) / 5) * 5);
    	a129 = 5;
    	a191 = (((a191 + 4338) + -26753) - 1973);
    	a64 = 7;
    	a187 = 6;
    	a31 = 9;
    	a102 = "i";
    	a105 = "e";
    	a96 = "i";
    	a168 = ((((((a168 * 5) % 92) + 19) / 5) * 69) / 10);
    	a154 = "h";
    	a9 = 8;
    	a147 = (((((a147 * a171) % 54) + 170) - -1595) + -1594);
    	a155 = "i";
    	a32 = 9;
    	a0 = "i";
    	a57 = (((a57 * 5) / -5) - -22545);
    	a21 = "f";
    	a81 = "e";
    	a39 = "e";
    	a177 = 5;
    	a94 = ((a95 - a84) + 21);
    	a95 = 5;
    	a171 = ((((((a171 * a80) % 14999) % 14918) + 15080) * 1) * 1);
    	a150 = 11;
    	a89 = 4;
    	a40 = "h";
    	a139 = 13;
    	a156 = (((a156 - -27243) - 1431) + -26636);
    	a200 = (((((a200 - 16545) * 10) / 9) * 10) / 9);
    	a167 = "f";
    	a199 = (((a199 - -2221) / 5) / -5);
    	a86 = "i";
    	a84 = 13; 
    	}else {
    	a78 = "f";
    	a34 = "e";
    	a128 = ((((47 - -12892) + 16144) + -46501) - -34517);
    	a153 = 11;
    	a147 = ((((a147 * a171) + -11083) + 18445) * 1);
    	a122 = ((((((((a147 * a147) % 14999) - -9598) % 22) + 87) * 5) % 22) - -99);
    	a12 = "i";
    	a191 = (((a191 + -9929) * 3) + -173);
    	a140 = ((((35 + 397) + -54) * 9) / 10);
    	a40 = "h";
    	a65 = "i";
    	a29 = (a150 - -5);
    	a190 = (((((a122 * a200) - -1139) * -1) / 10) + -12501);
    	}output = "X";
    } 
    if(((((a129 == 5) && (((144 < a156) && (296 >= a156)) && ((a100.equals("g")) && ((cf && (a4 == 3)) && (input.equals("E")))))) && (a105.equals("f"))) && (((63 < a147) && (116 >= a147)) && (((-52 < a171) && (126 >= a171)) && (((a95 == 2) && ((-157 < a79) && (-135 >= a79))) && (a34.equals("f"))))))) {
    	cf = false;
    	if((((121 < a85) && (212 >= a85)) && (a89 == 3))) {
    	a100 = "f";
    	a28 = "g";
    	a176 = ((((((a199 * a171) % 14999) * 2) % 14988) + -15011) * 1); 
    	}else {
    	a139 = 13;
    	a191 = (((((a191 + 5412) % 76) + 378) + -22040) + 22097);
    	a79 = ((((a79 % 10) + -138) + -2) - -3);
    	a108 = ((((83 + 72) * 10) / 9) + -2);
    	a177 = 5;
    	a156 = (((a156 + -24405) + -4294) * 1);
    	a31 = 12;
    	a193 = 4;
    	a34 = "i";
    	a187 = 4;
    	a80 = (((a80 * 5) * 5) - -17264);
    	a12 = "g";
    	a32 = 14;
    	a129 = 10;
    	a6 = "f";
    	a141 = 3;
    	a169 = (((a169 + 29470) * 1) * 1);
    	a95 = 7;
    	a67 = "f";
    	a168 = ((((((a168 % 92) - -63) - -1858) / 5) * 1) / 10);
    	a178 = "f";
    	a89 = 4;
    	a154 = "f";
    	a96 = "i";
    	a167 = "h";
    	a137 = (((36 + 3423) - 31641) - -30581);
    	a39 = "f";
    	a10 = 16;
    	a21 = "h";
    	a86 = "h";
    	a0 = "f";
    	a81 = "f";
    	a65 = "i";
    	a59 = "h";
    	a90 = ((((a90 - -14750) + 12202) * 10) / 9);
    	a105 = "f";
    	a64 = 11;
    	a200 = (((((a200 + 4027) % 59) - -262) + 2790) - 2810);
    	a102 = "f";
    	a53 = ((((((94 + 154) * 10) / 9) / 5) * 37) / 10);
    	a78 = "i";
    	a41 = ((((a171 * a171) - -13794) + -36026) * 1);
    	a118 = 11;
    	a128 = (((20 * 5) - -18262) * 1);
    	a84 = 12;
    	a9 = 11;
    	a140 = ((((21 - -355) + -1017) + 11197) + -10211);
    	a51 = (((((a51 + 27936) / 5) - 6643) * -2) / 10);
    	a155 = "f";
    	a15 = (((((a15 - 19802) + 25130) + -27541) * -1) / 10);
    	a150 = 13;
    	a159 = 13;
    	a40 = "f";
    	a147 = ((((a147 * a199) + -26168) + -6385) - 422);
    	}output = "T";
    } 
    if(((((((input.equals("A")) && (a105.equals("f"))) && (a150 == 9)) && ((63 < a147) && (116 >= a147))) && ((-157 < a79) && (-135 >= a79))) && ((a40.equals("f")) && (((((cf && (a100.equals("g"))) && ((-52 < a171) && (126 >= a171))) && (a4 == 3)) && ((-131 < a90) && (6 >= a90))) && ((89 < a200) && (212 >= a200)))))) {
    	a151 -= (a151 - 20) < a151 ? 2 : 0;
    	cf = false;
    	if((((a183.equals("e")) && ((414 < a186 && !(a138 == 5)) && ((331 < a157) && (361 >= a157)))) && !(a24 == 9))) {
    	a33 = "g";
    	a100 = "i";
    	a182 = (a89 - -9); 
    	}else {
    	a122 = (((((a147 * a171) - 1331) + 1023) % 100) + 226);
    	a161 = "f";
    	a46 = (a177 + 3);
    	a147 = ((((a147 * a90) + -14724) - -41925) * 1);
    	}output = "S";
    } 
    if(((((a187 == 2) && (((a4 == 3) && (((-52 < a171) && (126 >= a171)) && cf)) && ((63 < a147) && (116 >= a147)))) && (a155.equals("f"))) && (((a40.equals("f")) && ((a177 == 6) && ((a9 == 5) && ((input.equals("C")) && ((13 < a168) && (198 >= a168)))))) && (a100.equals("g"))))) {
    	cf = false;
    	a84 = 8;
    	a176 = ((((((a171 * a147) - -4949) % 58) + 162) / 5) - -149);
    	a193 = 1;
    	a100 = "f";
    	a89 = 4;
    	a155 = "e";
    	a128 = (((1 - 3000) * 5) / 5);
    	a153 = 12;
    	a141 = 9;
    	a200 = ((((a200 - 23777) % 59) - -325) - -6);
    	a140 = ((((61 * 5) * 15) / 10) + 18361);
    	a159 = 13;
    	a168 = ((((a168 + -10618) * 10) / 9) + -536);
    	a78 = "i";
    	a12 = "i";
    	a86 = "e";
    	a97 = (a64 - -2); 
    	output = "X";
    } 
}
private  void calculateOutputm75(String input) {
    if((((a40.equals("f")) && ((a100.equals("g")) && (((146 < a108) && (191 >= a108)) && (((a39.equals("f")) && ((-76 < a15) && (19 >= a15))) && (a21.equals("f")))))) && ((a89 == 2) && (((((-52 < a171) && (126 >= a171)) && (((63 < a147) && (116 >= a147)) && cf)) && (input.equals("D"))) && (a4 == 4))))) {
    	cf = false;
    	if(((286 < a53) && (382 >= a53))) {
    	a137 = (((94 + -8975) + -9989) * 1);
    	a118 = 13;
    	a21 = "g";
    	a191 = ((((a191 - -19074) * 10) / 9) * 1);
    	a153 = 11;
    	a140 = ((((((a140 % 59) - -350) * 5) - 7130) % 59) + 435);
    	a81 = "h";
    	a51 = ((((a51 + 26740) % 18) - -157) - -2);
    	a95 = 3;
    	a84 = 8;
    	a45 = "h";
    	a193 = 5;
    	a105 = "e";
    	a10 = 16;
    	a79 = ((((50 - -18690) - -8188) - -982) - 27968);
    	a171 = ((((a171 * a147) / 5) - -25860) - 33638); 
    	}else {
    	a9 = 11;
    	a65 = "g";
    	a12 = "f";
    	a105 = "e";
    	a39 = "i";
    	a94 = ((a177 / a139) + 8);
    	a89 = 7;
    	a155 = "h";
    	a40 = "f";
    	a187 = 6;
    	a140 = ((((a140 - 21269) * 10) / 9) + -1909);
    	a10 = 13;
    	a153 = 9;
    	a57 = (((((a57 % 40) + -101) * 5) % 40) - 79);
    	a81 = "h";
    	a86 = "i";
    	a128 = ((((a128 - -12274) % 91) - -214) - 5);
    	a64 = 8;
    	a67 = "e";
    	a191 = (((a191 * 5) - -5692) * 3);
    	a108 = (((((a108 * 5) % 97) - -217) - 9879) + 9856);
    	a80 = (((75 - 3044) * 5) / 5);
    	a31 = 15;
    	a171 = ((((a171 * a147) + -9058) + 18404) * 1);
    	a102 = "h";
    	a193 = 4;
    	a84 = 11;
    	a167 = "i";
    	a147 = (((((((a147 * a171) % 14999) - 6286) * 3) + 1247) % 54) - -170);
    	a178 = "f";
    	a199 = (((((a199 - 21025) % 92) - -202) - -21697) - 21718);
    	a21 = "g";
    	a154 = "i";
    	a200 = (((((((a200 % 61) + 144) * 9) / 10) / 5) * 36) / 10);
    	a139 = 6;
    	a15 = ((((a15 - 5122) - -8714) + -10858) + 29186);
    	a51 = ((((a51 * 10) / 4) + 865) * 5);
    	a159 = 12;
    	a156 = ((((a156 / -5) + -12943) * 10) / 9);
    	a90 = ((((a90 + 13518) % 68) + -65) - -4);
    	a96 = "i";
    	a177 = 10;
    	}output = "T";
    } 
    if((((a100.equals("g")) && ((((a139 == 7) && ((a10 == 10) && (a129 == 5))) && (a150 == 9)) && ((63 < a147) && (116 >= a147)))) && ((a12.equals("f")) && (((a4 == 4) && (((-52 < a171) && (126 >= a171)) && (cf && (input.equals("B"))))) && (a86.equals("f")))))) {
    	cf = false;
    	a157 = (((((a140 * a51) % 14999) - 1654) + -16038) - -1128);
    	a59 = "i";
    	a122 = (((((a171 * a171) + -19652) * 10) / 9) * 1);
    	a147 = (((((a147 * a140) % 14999) + -19195) * 1) + -9427); 
    	output = "U";
    } 
    if((((input.equals("C")) && ((((a155.equals("f")) && (a177 == 6)) && (a4 == 4)) && ((-52 < a171) && (126 >= a171)))) && ((a159 == 11) && (((a81.equals("f")) && ((a64 == 5) && ((cf && (a100.equals("g"))) && ((63 < a147) && (116 >= a147))))) && (a65.equals("f")))))) {
    	cf = false;
    	a147 = ((((((a147 * a171) % 54) + 170) - 27939) - 775) + 28714);
    	a110 = "i";
    	a178 = "g";
    	a190 = ((((((a171 * a147) % 76) - -108) + 0) - -3380) - 3379); 
    	output = "V";
    } 
    if(((((154 < a169) && (179 >= a169)) && ((a84 == 9) && ((a96.equals("f")) && (((63 < a147) && (116 >= a147)) && ((195 < a128) && (379 >= a128)))))) && ((a4 == 4) && ((input.equals("E")) && ((a150 == 9) && (((a100.equals("g")) && (((-52 < a171) && (126 >= a171)) && cf)) && (a64 == 5))))))) {
    	cf = false;
    	if((!(a187 == 1) || ((a178.equals("g")) || (a19.equals("g"))))) {
    	a175 = ((a153 - a187) - -6);
    	a172 = (((((a147 * a147) % 93) - -68) + 36) - 3);
    	a178 = "e";
    	a147 = ((((((a147 * a172) / 5) % 54) - -171) * 9) / 10); 
    	}else {
    	a172 = ((((((a199 * a199) % 14999) - 6234) + 484) % 67) + 266);
    	a129 = 11;
    	a177 = 12;
    	a167 = "h";
    	a15 = (((a15 - -20920) * 1) + 8017);
    	a40 = "e";
    	a139 = 11;
    	a155 = "h";
    	a178 = "e";
    	a34 = "e";
    	a12 = "e";
    	a84 = 13;
    	a21 = "i";
    	a141 = 8;
    	a193 = 8;
    	a140 = ((((a140 % 70) - -205) / 5) * 5);
    	a102 = "e";
    	a147 = ((((((a147 * a171) - 10965) * 1) * 1) % 54) + 170);
    	a145 = (((((a172 * a172) % 14999) + -17039) - 4457) + -7926);
    	}output = "Y";
    } 
    if((((((((((-149 < a57) && (-68 >= a57)) && ((63 < a147) && (116 >= a147))) && (a67.equals("f"))) && (input.equals("A"))) && (a9 == 5)) && (a4 == 4)) && ((-76 < a15) && (19 >= a15))) && (((200 < a53) && (286 >= a53)) && ((a34.equals("f")) && ((cf && ((-52 < a171) && (126 >= a171))) && (a100.equals("g"))))))) {
    	cf = false;
    	if((((-135 < a79) && (47 >= a79)) || (a32 == 15))) {
    	a155 = "f";
    	a10 = 11;
    	a84 = 10;
    	a122 = (((((a156 * a191) % 14999) - 27798) + 30808) + -27164);
    	a199 = (((a199 - -8407) - 17598) / 5);
    	a32 = 15;
    	a118 = 14;
    	a128 = (((((a128 * 27) / 10) * 10) / 9) - -41);
    	a78 = "e";
    	a12 = "g";
    	a142 = (((((((a122 * a122) % 14999) % 44) + 237) * 1) / 5) + 215);
    	a81 = "i";
    	a156 = (((((a156 % 23) + 308) / 5) * 49) / 10);
    	a51 = ((((a51 * 5) * 10) / 9) * 5);
    	a150 = 9;
    	a31 = 10;
    	a57 = (((a57 - 16034) + -7770) + -5372);
    	a187 = 4;
    	a137 = (((((88 * 10) / 2) * 5) * 10) / 9);
    	a152 = (((((a142 * a140) % 14999) - -5661) - -5426) / 5);
    	a79 = (((((57 * -11) / 10) + 2715) * 5) + -13224);
    	a8 = (((4 / 5) + 11152) - -1152);
    	a169 = (((((a169 * 10) / 8) + -1) + -24090) - -24102);
    	a34 = "f";
    	a64 = 9;
    	a140 = ((((((a140 * 5) % 59) - -364) * 5) % 59) + 378);
    	a96 = "f";
    	a129 = 9;
    	a139 = 7;
    	a6 = "g";
    	a105 = "h";
    	a90 = (((((a90 + -7323) - 13368) + -7115) * -1) / 10);
    	a39 = "f";
    	a102 = "i";
    	a95 = 7;
    	a168 = ((((80 - -9837) * 10) / 9) + -4555);
    	a147 = (((((((a147 * a142) % 14999) + 1132) * 10) / 9) * 10) / 9);
    	a191 = ((((a191 - 8453) + -7510) % 76) + 476); 
    	}else {
    	a147 = ((((a147 * a199) * 1) * 1) * 1);
    	a29 = ((a153 * a129) + -16);
    	a122 = ((((((a147 * a147) % 14999) + -28655) + 9012) % 22) - -118);
    	a190 = ((((((a171 * a147) % 14999) * 2) % 63) + -30) + -1);
    	}output = "Y";
    } 
}
private  void calculateOutputm77(String input) {
    if(((((165 < a80) && (369 >= a80)) && ((((a6.equals("f")) && (a4 == 7)) && ((63 < a147) && (116 >= a147))) && (input.equals("B")))) && ((((68 < a199) && (254 >= a199)) && ((((((-52 < a171) && (126 >= a171)) && cf) && (a100.equals("g"))) && (a0.equals("f"))) && (a105.equals("f")))) && (a95 == 2)))) {
    	cf = false;
    	a110 = "i";
    	a178 = "g";
    	a190 = ((((((a147 * a147) % 63) - 93) + -1) + 19626) + -19607);
    	a147 = ((((((a147 * a57) + -6453) + -3880) - 592) % 54) - -181); 
    	output = "V";
    } 
    if((((((a100.equals("g")) && (((195 < a128) && (379 >= a128)) && (((input.equals("D")) && ((a4 == 7) && cf)) && ((-52 < a171) && (126 >= a171))))) && (a167.equals("f"))) && ((63 < a147) && (116 >= a147))) && (((a0.equals("f")) && ((a105.equals("f")) && (a67.equals("f")))) && (a12.equals("f"))))) {
    	cf = false;
    	if((!(a88 == 11) || (!(a118 == 15) && ((a139 == 10) && (a81.equals("e")))))) {
    	a67 = "i";
    	a167 = "f";
    	a56 = a139;
    	a40 = "e";
    	a10 = 13;
    	a129 = 5;
    	a118 = 13;
    	a88 = ((a4 - a56) + 13);
    	a105 = "f";
    	a84 = 8;
    	a128 = ((((a128 * 10) / 3) / 5) + 5301);
    	a21 = "i";
    	a150 = 8;
    	a178 = "h";
    	a9 = 7;
    	a89 = 7;
    	a147 = (((((a147 * a171) + -4663) * 2) % 54) + 170);
    	a34 = "h";
    	a139 = 12; 
    	}else {
    	a197 = "f";
    	a122 = ((((a147 * a171) - -12989) - 5773) + 4884);
    	a147 = (((((a147 * a122) % 14999) - -683) / 5) * 5);
    	a44 = (((((a122 * a171) % 14999) - 14978) + -3) - 8);
    	}output = "S";
    } 
    if(((((((((-52 < a171) && (126 >= a171)) && (cf && (input.equals("E")))) && (a64 == 5)) && ((176 < a140) && (318 >= a140))) && (a105.equals("f"))) && ((63 < a147) && (116 >= a147))) && (((((a89 == 2) && (a100.equals("g"))) && (a4 == 7)) && (a78.equals("f"))) && (a31 == 9)))) {
    	cf = false;
    	if((!(a153 == 8) || (!(a180.equals("f")) || (a150 == 11)))) {
    	a190 = (((((a200 * a57) % 14999) + 20933) - 32290) + -3516);
    	a78 = "i";
    	a122 = ((((((((a156 * a171) % 14999) % 22) + 102) - 1) / 5) * 51) / 10);
    	a168 = (((13 - -235) * 5) / 5);
    	a79 = (((99 - -22444) / 5) * 5);
    	a51 = ((((54 + 12411) - 41589) * -1) / 10);
    	a40 = "h";
    	a141 = 10;
    	a65 = "i";
    	a187 = 5;
    	a29 = (a10 + 4);
    	a128 = ((((a128 * 10) / 3) - 28810) - -47751);
    	a12 = "e";
    	a191 = ((((71 * 74) / 10) - -28611) / 5);
    	a153 = 9;
    	a140 = ((((a140 / 5) - 8094) - -18470) * -2);
    	a34 = "e";
    	a81 = "g";
    	a155 = "e";
    	a147 = ((((a147 * a122) / 5) * 5) / 5); 
    	}else {
    	a128 = (((((a128 * 10) / 3) * 10) / 9) * 5);
    	a95 = 2;
    	a177 = 11;
    	a118 = 9;
    	a108 = (((((a108 % 22) - -168) * 5) % 22) + 161);
    	a154 = "f";
    	a140 = ((((((a140 % 70) - -180) + 66) / 5) * 39) / 10);
    	a57 = ((((((a57 % 40) - 94) * 9) / 10) / 5) - 96);
    	a147 = ((((((a147 * a53) % 14999) + -3117) / 5) % 54) + 170);
    	a31 = 15;
    	a94 = (a84 + 5);
    	a89 = 7;
    	a139 = 11;
    	a102 = "i";
    	a105 = "i";
    	a199 = (((a199 / 5) / 5) - -6655);
    	a96 = "e";
    	a64 = 9;
    	a78 = "h";
    	a200 = (((a200 - 16771) * 1) * 1);
    	a65 = "f";
    	a129 = 8;
    	a9 = 9;
    	a86 = "f";
    	a10 = 15;
    	a90 = (((a90 + 2418) - -544) - -18189);
    	a12 = "i";
    	a150 = 9;
    	a167 = "i";
    	a67 = "f";
    	a32 = 8;
    	a156 = ((((a156 - 15388) - 4314) - 6744) + 55529);
    	a171 = ((((((a171 * a147) + 138) * 1) - -1118) % 14918) + 15080);
    	a0 = "e";
    	a6 = "f";
    	a39 = "h";
    	a178 = "f";
    	a40 = "e";
    	a21 = "f";
    	a84 = 11;
    	}output = "S";
    } 
    if(((((input.equals("A")) && (((-131 < a90) && (6 >= a90)) && (((-52 < a171) && (126 >= a171)) && ((a100.equals("g")) && cf)))) && (a150 == 9)) && ((a12.equals("f")) && (((((63 < a147) && (116 >= a147)) && ((a4 == 7) && ((195 < a128) && (379 >= a128)))) && (a139 == 7)) && (a118 == 9))))) {
    	cf = false;
    	a53 = (((a53 - -28616) * -1) - -7011);
    	a9 = 9;
    	a140 = (((a140 + 9132) - -1259) * 2);
    	a102 = "i";
    	a105 = "i";
    	a78 = "f";
    	a178 = "g";
    	a193 = 8;
    	a81 = "g";
    	a10 = 15;
    	a199 = ((((a199 / 5) + 142) + 7269) + -7315);
    	a129 = 4;
    	a167 = "f";
    	a80 = (((a80 * -5) - 2784) * 5);
    	a34 = "f";
    	a128 = ((((a128 - -1560) * 5) * 10) / 9);
    	a118 = 13;
    	a96 = "e";
    	a156 = (((a156 * 5) - 29492) - 998);
    	a139 = 13;
    	a143 = "f";
    	a8 = (((a8 + 27160) - -867) + 1628);
    	a57 = ((((a57 + 23112) * 10) / 9) - -1138);
    	a89 = 8;
    	a86 = "i";
    	a108 = (((((a108 - -12972) * 2) * 1) % 22) + 149);
    	a159 = 15;
    	a169 = ((((a169 % 12) + 163) + -8) + 1);
    	a110 = "h";
    	a64 = 8;
    	a6 = "i";
    	a84 = 13;
    	a177 = 12;
    	a200 = (((a200 / 5) + 22741) / 5);
    	a39 = "f";
    	a150 = 12;
    	a67 = "h";
    	a40 = "e";
    	a147 = (((((((a147 * a171) % 54) + 171) * 1) * 5) % 54) - -136); 
    	output = "V";
    } 
    if(((((a4 == 7) && (((-52 < a171) && (126 >= a171)) && cf)) && (input.equals("C"))) && ((((((146 < a108) && (191 >= a108)) && (((-76 < a15) && (19 >= a15)) && (((195 < a128) && (379 >= a128)) && (((165 < a80) && (369 >= a80)) && (a34.equals("f")))))) && (a100.equals("g"))) && ((63 < a147) && (116 >= a147))) && ((176 < a140) && (318 >= a140))))) {
    	cf = false;
    	a185 = "h";
    	a100 = "i";
    	a182 = (a193 + 7); 
    	output = "X";
    } 
}
private  void calculateOutputm79(String input) {
    if(((((157 < a137) && (241 >= a137)) && (((a32 == 9) && ((input.equals("C")) && (((200 < a53) && (286 >= a53)) && ((a100.equals("g")) && ((-157 < a79) && (-135 >= a79)))))) && (a65.equals("f")))) && (((154 < a169) && (179 >= a169)) && ((a4 == 9) && ((cf && ((-52 < a171) && (126 >= a171))) && ((63 < a147) && (116 >= a147))))))) {
    	a151 += (a151 + 20) > a151 ? 2 : 0;
    	a135 -= (a135 - 20) < a135 ? 2 : 0;
    	cf = false;
    	a156 = ((((((a171 * a128) % 14999) * 2) + 0) % 15072) + -14927);
    	a53 = (((((a53 * a199) % 14999) + -27016) / 5) * 5);
    	a59 = "f";
    	a15 = ((((((a15 * a156) % 14999) % 14962) + -15037) * 1) * 1);
    	a29 = ((a153 - a95) + 7);
    	a89 = (a4 - 8);
    	a8 = (((((((a171 * a108) % 14999) - 1617) % 91) - -137) - -22285) + -22284);
    	a169 = ((((a169 * a57) - 1653) + -1619) + -143);
    	a96 = "e";
    	a118 = (a187 + 9);
    	a199 = (((((a80 * a57) % 14999) - 14954) + -11) * 1);
    	a177 = ((a10 / a150) - -4);
    	a86 = "g";
    	a65 = "e";
    	a67 = "e";
    	a193 = ((a159 - a159) - -1);
    	a137 = (((((a137 * a79) % 14999) + 9721) + -16017) * 1);
    	a167 = "e";
    	a10 = (a187 + 8);
    	a90 = ((((((a90 * a168) % 14999) % 14934) - 15064) - 3) + 0);
    	a34 = "e";
    	a132 = ((((((a147 * a147) * 2) + 1159) * 1) % 38) + -113);
    	a200 = (((((a200 * a140) % 14999) + -14958) + -43) / 5);
    	a79 = (((((a79 * a51) % 14999) / 5) - 6679) * 3);
    	a147 = (((((a147 * a132) - 1736) * 1) + 33998) + -30413);
    	a102 = "e";
    	a64 = ((a177 / a139) - -4);
    	a78 = "e";
    	a39 = "e";
    	a40 = "e";
    	a153 = ((a139 + a193) + -3); 
    	output = "U";
    } 
    if(((((a118 == 9) && ((((a4 == 9) && (a139 == 7)) && (input.equals("B"))) && ((-76 < a15) && (19 >= a15)))) && (a40.equals("f"))) && (((((a100.equals("g")) && (cf && ((63 < a147) && (116 >= a147)))) && ((-52 < a171) && (126 >= a171))) && (a141 == 4)) && (a10 == 10)))) {
    	cf = false;
    	a36 = (a10 - -3);
    	a100 = "h";
    	a122 = ((((((a156 * a171) % 14999) - 13067) % 14836) + 15162) + 2); 
    	output = "Y";
    } 
}
private  void calculateOutputm83(String input) {
    if((((((68 < a199) && (254 >= a199)) && (((63 < a147) && (116 >= a147)) && ((((126 < a171) && (162 >= a171)) && cf) && (a100.equals("g"))))) && (a102.equals("f"))) && (((input.equals("B")) && ((((154 < a169) && (179 >= a169)) && ((a6.equals("f")) && (a78.equals("f")))) && (a179 == 17))) && (a89 == 2)))) {
    	cf = false;
    	a122 = (((((a108 * a8) - -82) % 100) - -225) + 2);
    	a161 = "h";
    	a120 = (((((a171 * a122) % 14999) + 9348) - -5067) + 145);
    	a147 = ((((((a147 * a156) % 14999) / 5) / 5) / 5) + 25407); 
    	output = "T";
    } 
    if((((((((63 < a147) && (116 >= a147)) && ((input.equals("C")) && cf)) && (a39.equals("f"))) && (a179 == 17)) && (a100.equals("g"))) && ((((a0.equals("f")) && ((a102.equals("f")) && ((a40.equals("f")) && (a159 == 11)))) && ((126 < a171) && (162 >= a171))) && (a12.equals("f"))))) {
    	cf = false;
    	if((((((a56 == 11) || (a131.equals("i"))) && ((32 < a190) && (185 >= a190))) && !(a30.equals("f"))) && (a78.equals("f")))) {
    	a122 = (((((((a199 * a199) % 14999) - 23324) + -3357) / 5) % 100) + 295);
    	a161 = "g";
    	a147 = (((((a147 * a122) % 14999) - -7816) - -6371) + 37);
    	a101 = (a179 - 5); 
    	}else {
    	a178 = "i";
    	a75 = "f";
    	a147 = (((((((a147 * a171) / 5) % 54) + 121) / 5) * 49) / 10);
    	a165 = ((((a108 * a90) * 1) + 4059) + -7119);
    	}output = "V";
    } 
    if(((((126 < a171) && (162 >= a171)) && ((input.equals("E")) && (((a65.equals("f")) && ((13 < a168) && (198 >= a168))) && (a32 == 9)))) && (((186 < a191) && (365 >= a191)) && ((a9 == 5) && (((63 < a147) && (116 >= a147)) && (((a100.equals("g")) && (cf && (a179 == 17))) && ((89 < a200) && (212 >= a200)))))))) {
    	cf = false;
    	a171 = ((((((a171 * a147) * 1) % 88) + 6) - 18987) + 18997);
    	a4 = (a31 + -4); 
    	output = "Y";
    } 
    if(((((-76 < a15) && (19 >= a15)) && (((((200 < a53) && (286 >= a53)) && ((89 < a200) && (212 >= a200))) && ((68 < a199) && (254 >= a199))) && ((126 < a171) && (162 >= a171)))) && ((((a179 == 17) && ((a100.equals("g")) && ((input.equals("D")) && (((63 < a147) && (116 >= a147)) && cf)))) && ((-149 < a57) && (-68 >= a57))) && ((146 < a108) && (191 >= a108))))) {
    	cf = false;
    	if((47 < a79 && ((((241 < a137) && (407 >= a137)) && (a21.equals("h"))) || (a87.equals("g"))))) {
    	a118 = 11;
    	a150 = 8;
    	a187 = 8;
    	a100 = "i";
    	a137 = ((((23 / -5) * 5) * 10) / 9);
    	a84 = 11;
    	a129 = 11;
    	a169 = ((((a169 + 3192) / 5) / 5) - -10172);
    	a10 = 9;
    	a128 = (((49 - -28852) - -261) / 5);
    	a193 = 4;
    	a168 = (((((a168 * 5) % 92) + 51) * 9) / 10);
    	a167 = "i";
    	a68 = (a177 - -7);
    	a105 = "e";
    	a155 = "h";
    	a34 = "e";
    	a12 = "f";
    	a21 = "e";
    	a78 = "e";
    	a80 = (((53 - -7426) * 4) - 29609);
    	a31 = 15;
    	a79 = ((((((20 + -155) * 10) / 9) / 5) * 49) / 10);
    	a6 = "f";
    	a182 = (a153 + 4); 
    	}else {
    	a102 = "h";
    	a0 = "i";
    	a147 = ((((((a147 * a140) % 14999) + 5105) * 1) * 10) / 9);
    	a118 = 13;
    	a89 = 7;
    	a29 = (a159 - -5);
    	a128 = (((((79 + 358) - -2737) - 3994) * -5) / 10);
    	a10 = 9;
    	a153 = 12;
    	a122 = (((((((a147 * a147) % 14999) % 22) - -81) - -23) - 9161) + 9146);
    	a34 = "g";
    	a40 = "e";
    	a187 = 8;
    	a141 = 8;
    	a79 = (((((96 * 10) / -6) + 14413) - 11387) + -15308);
    	a12 = "h";
    	a193 = 8;
    	a84 = 12;
    	a163 = ((((a90 * a200) * 1) - 1213) / 5);
    	}output = "X";
    } 
    if((((a96.equals("f")) && ((a153 == 6) && (((144 < a156) && (296 >= a156)) && (a40.equals("f"))))) && (((63 < a147) && (116 >= a147)) && ((a100.equals("g")) && ((((((input.equals("A")) && cf) && (a179 == 17)) && (a141 == 4)) && ((126 < a171) && (162 >= a171))) && (a159 == 11)))))) {
    	cf = false;
    	a168 = (((((a168 * 237) / 10) + -19951) * 1) - -43310);
    	a31 = 12;
    	a80 = ((((1 * 4751) / 10) * 5) * 5);
    	a140 = ((((a140 - 17347) - 5426) * -1) / 10);
    	a139 = 10;
    	a86 = "f";
    	a21 = "g";
    	a78 = "h";
    	a178 = "h";
    	a167 = "i";
    	a102 = "g";
    	a32 = 13;
    	a40 = "g";
    	a8 = (((((a8 % 26) - -19) / 5) + -21507) + 21502);
    	a199 = ((((a199 % 10) + 265) / 5) + 218);
    	a156 = ((((a156 % 75) + 162) / 5) * 5);
    	a108 = (((((a108 % 22) - -148) * 5) % 22) + 157);
    	a154 = "g";
    	a200 = (((a200 + -21724) + 25438) - -3419);
    	a6 = "i";
    	a89 = 6;
    	a177 = 8;
    	a87 = "g";
    	a9 = 10;
    	a51 = (((((99 * 9) / 10) + -13055) + -10151) - -23239);
    	a59 = "h";
    	a96 = "f";
    	a65 = "f";
    	a64 = 5;
    	a53 = ((((a53 * 5) % 42) - -221) - 15);
    	a12 = "h";
    	a147 = ((((a147 * a171) / -5) * 5) / 5); 
    	output = "Y";
    } 
}
private  void calculateOutputm8(String input) {
    if((((a159 == 11) && ((((a89 == 2) && ((a171 <=  -52 && cf) && (a129 == 5))) && (a40.equals("f"))) && (a118 == 9))) && (a31 == 9))) {
    	if(((((a86.equals("f")) && (a167.equals("f"))) && ((144 < a156) && (296 >= a156))) && ((((154 < a169) && (179 >= a169)) && ((cf && (a45.equals("h"))) && ((146 < a108) && (191 >= a108)))) && ((157 < a137) && (241 >= a137))))) {
    		calculateOutputm73(input);
    	} 
    } 
    if(((((((154 < a169) && (179 >= a169)) && (((-52 < a171) && (126 >= a171)) && cf)) && (a167.equals("f"))) && (a154.equals("f"))) && (((a40.equals("f")) && (a102.equals("f"))) && (a64 == 5)))) {
    	if(((((a4 == 3) && cf) && (a86.equals("f"))) && ((a65.equals("f")) && ((((-76 < a15) && (19 >= a15)) && (((-131 < a90) && (6 >= a90)) && (a118 == 9))) && (a187 == 2))))) {
    		calculateOutputm74(input);
    	} 
    	if((((((-131 < a90) && (6 >= a90)) && ((154 < a169) && (179 >= a169))) && (a40.equals("f"))) && ((((a141 == 4) && (cf && (a4 == 4))) && (a167.equals("f"))) && (a193 == 2)))) {
    		calculateOutputm75(input);
    	} 
    	if(((((-7 < a8) && (46 >= a8)) && ((a129 == 5) && ((a159 == 11) && (a95 == 2)))) && (((a6.equals("f")) && (cf && (a4 == 7))) && (a21.equals("f"))))) {
    		calculateOutputm77(input);
    	} 
    	if((((a67.equals("f")) && ((((a4 == 9) && cf) && (a78.equals("f"))) && (a39.equals("f")))) && ((((89 < a200) && (212 >= a200)) && ((200 < a53) && (286 >= a53))) && ((186 < a191) && (365 >= a191))))) {
    		calculateOutputm79(input);
    	} 
    } 
    if(((((a96.equals("f")) && ((186 < a191) && (365 >= a191))) && (a141 == 4)) && (((a21.equals("f")) && ((a40.equals("f")) && (((126 < a171) && (162 >= a171)) && cf))) && ((68 < a199) && (254 >= a199))))) {
    	if(((((13 < a168) && (198 >= a168)) && (((cf && (a179 == 17)) && (a159 == 11)) && (a31 == 9))) && (((a64 == 5) && ((-7 < a8) && (46 >= a8))) && (a102.equals("f"))))) {
    		calculateOutputm83(input);
    	} 
    } 
}
private  void calculateOutputm90(String input) {
    if((((a36 == 13) && ((a31 == 9) && (a6.equals("f")))) && ((((68 < a199) && (254 >= a199)) && ((a10 == 10) && (((a139 == 7) && ((a64 == 5) && (((63 < a147) && (116 >= a147)) && (((79 < a122) && (125 >= a122)) && cf)))) && (a100.equals("h"))))) && (input.equals("A"))))) {
    	cf = false;
    	a64 = ((a32 + a36) + -17);
    	a9 = (a193 + 2);
    	a31 = ((a187 * a36) + -5);
    	a21 = "e";
    	a6 = "e";
    	a87 = "g";
    	a147 = (((((a147 * a156) % 14999) + -25339) * 1) - 3502);
    	a118 = (a177 - -3);
    	a168 = (((((a168 * a137) % 14999) - -1756) + -19154) + -181);
    	a89 = ((a139 * a9) + -27);
    	a137 = (((((a15 * a8) % 14999) / 5) / 5) - 16045);
    	a167 = "e";
    	a12 = "e";
    	a78 = "e";
    	a10 = ((a9 / a141) - -8);
    	a200 = ((((((a200 * a156) % 14999) - 25898) * 1) * 10) / 9);
    	a53 = (((((a140 * a156) % 14999) + -14910) - 81) + -9);
    	a139 = (a64 - -2);
    	a59 = "h";
    	a80 = ((((((a156 * a57) % 14999) - -3039) + -15023) - -36877) * -1);
    	a51 = (((((a156 * a156) % 14999) - 28502) - -24237) - 11533);
    	a108 = (((((a140 * a156) % 14999) + -14974) - -18421) + -18304);
    	a154 = "e";
    	a34 = "e";
    	a199 = (((((a199 * a8) % 14999) / 5) + -437) - 7904);
    	a178 = "h";
    	a128 = ((((((a128 * a80) % 14999) * 2) % 15097) - 14901) - 2);
    	a96 = "e";
    	a156 = (((((a156 * a108) % 14999) + -14925) + -69) - 6); 
    	output = "Y";
    } 
    if((((((((63 < a147) && (116 >= a147)) && cf) && (a36 == 13)) && (a100.equals("h"))) && ((195 < a128) && (379 >= a128))) && ((a9 == 5) && ((((input.equals("C")) && (((-76 < a15) && (19 >= a15)) && ((a78.equals("f")) && (a67.equals("f"))))) && ((79 < a122) && (125 >= a122))) && ((-149 < a57) && (-68 >= a57)))))) {
    	cf = false;
    	a161 = "h";
    	a147 = ((((a147 * a122) - -4407) - -2669) / 5);
    	a122 = ((((((a122 * a147) % 14999) % 100) + 135) * 1) + 59);
    	a120 = (((((a122 * a122) % 14999) / 5) + 7774) * 2); 
    	output = "Y";
    } 
}
private  void calculateOutputm9(String input) {
    if((((a118 == 9) && ((a139 == 7) && (a34.equals("f")))) && ((a141 == 4) && (((cf && (a36 == 13)) && ((-76 < a15) && (19 >= a15))) && (a81.equals("f")))))) {
    	if((((((a89 == 2) && ((a12.equals("f")) && (a193 == 2))) && (a155.equals("f"))) && ((13 < a168) && (198 >= a168))) && ((a167.equals("f")) && (((79 < a122) && (125 >= a122)) && cf)))) {
    		calculateOutputm90(input);
    	} 
    } 
}
private  void calculateOutputm95(String input) {
    if((((((a182 == 8) && (((a100.equals("i")) && ((200 < a53) && (286 >= a53))) && 226 < a114)) && (a193 == 2)) && ((68 < a199) && (254 >= a199))) && ((a167.equals("f")) && ((a129 == 5) && ((a155.equals("f")) && ((cf && ((63 < a147) && (116 >= a147))) && (input.equals("A")))))))) {
    	cf = false;
    	a139 = (a95 - -4);
    	a84 = (a9 + 3);
    	a10 = (a9 + 4);
    	a137 = (((((a137 * a90) % 14999) + -4768) - 7035) / 5);
    	a79 = (((((a90 * a90) % 14999) - 24611) * 1) / 5);
    	a154 = "e";
    	a169 = (((((((a156 * a114) % 14999) + 2499) + -25114) * 1) % 34) + 243);
    	a153 = a129;
    	a160 = "i";
    	a150 = (a139 - -4);
    	a40 = "f";
    	a12 = "e";
    	a168 = (((((a15 * a53) % 65) + 265) + -1) - -1);
    	a128 = (((((a128 * a108) % 14999) / 5) + -27557) + -2092);
    	a118 = ((a141 / a32) + 8);
    	a159 = (a139 + 4);
    	a6 = "e";
    	a108 = (((((a108 * a156) % 14999) - 26657) * 1) - 964);
    	a193 = (a118 + -7);
    	a95 = (a182 - 7);
    	a39 = "e";
    	a105 = "f";
    	a140 = (((((a53 * a53) % 14999) - -11215) / 5) * -5);
    	a191 = (((((a90 * a128) % 14999) + -14847) - 5) / 5);
    	a59 = "h";
    	a80 = (((((((a90 * a156) % 14999) - 2150) % 52) + 424) - -2645) + -2629);
    	a200 = (((((a200 * a79) % 14999) + 27060) + -40536) - 771);
    	a147 = (((((a147 * a114) % 14999) - 24924) / 5) * 5);
    	a141 = ((a193 * a129) + -2);
    	a51 = (((((a51 * a114) % 14999) / 5) - 7202) / 5);
    	a199 = ((((((a199 * a191) % 14999) * 2) / 5) / 5) + -14562);
    	a86 = "e";
    	a187 = (a31 - 8);
    	a57 = ((((((a57 * a140) % 14999) % 14925) + -15073) - 1) + -1);
    	a178 = "i";
    	a89 = (a153 + -4);
    	a34 = "g";
    	a64 = ((a153 / a31) - -4);
    	a129 = ((a31 - a31) + 6);
    	a15 = ((((a15 * a53) - 7936) + -281) + -331);
    	a167 = "e";
    	a155 = "e";
    	a156 = (((((a8 * a53) % 14999) + -4543) * 1) / 5);
    	a53 = ((((((((a53 * a137) % 14999) % 42) + 242) * 1) * 5) % 42) + 243);
    	a177 = a139;
    	a67 = "e";
    	a31 = ((a9 * a84) + -32);
    	a96 = "e";
    	a78 = "e";
    	a9 = (a10 + -5); 
    	output = "X";
    } 
    if((((a141 == 4) && (((((63 < a147) && (116 >= a147)) && ((a182 == 8) && cf)) && (input.equals("C"))) && (a100.equals("i")))) && (((((a78.equals("f")) && ((a86.equals("f")) && 226 < a114)) && (a40.equals("f"))) && (a193 == 2)) && (a0.equals("f"))))) {
    	cf = false;
    	a175 = ((a31 - a64) - -5);
    	a155 = "g";
    	a139 = ((a177 / a64) - -7);
    	a86 = "g";
    	a178 = "e";
    	a167 = "g";
    	a172 = ((((((a156 * a140) % 14999) + -20348) * 1) % 93) - -130);
    	a81 = "g";
    	a128 = (((((((a128 * a191) % 14999) % 72) - -440) / 5) * 45) / 10);
    	a40 = "g";
    	a15 = ((((((((a15 * a114) % 14999) % 20) + 41) + -1423) / 5) * -1) / 10);
    	a191 = ((((((a191 * a147) % 14999) + 6125) - -6217) % 76) + 383);
    	a147 = ((((((((a147 * a172) % 54) + 123) * 10) / 9) * 5) % 54) - -154);
    	a78 = "g";
    	a95 = (a153 - 4); 
    	output = "X";
    } 
}
private  void calculateOutputm96(String input) {
    if((((((input.equals("A")) && ((a185.equals("e")) && ((a67.equals("f")) && (a154.equals("f"))))) && ((200 < a53) && (286 >= a53))) && (a141 == 4)) && ((((((a100.equals("i")) && cf) && (a182 == 9)) && ((63 < a147) && (116 >= a147))) && ((-157 < a79) && (-135 >= a79))) && (a12.equals("f"))))) {
    	cf = false;
    	a108 = ((((((a53 * a80) % 14999) - -2953) % 22) - -164) + -1);
    	a8 = (((((((a200 * a108) % 14999) - -14583) % 26) + -1) + -11679) - -11678);
    	a81 = "g";
    	a139 = ((a182 + a95) + -3);
    	a21 = "f";
    	a96 = "e";
    	a10 = (a64 + 5);
    	a65 = "e";
    	a177 = ((a193 - a32) - -12);
    	a178 = "g";
    	a155 = "f";
    	a191 = ((((((a191 * a140) % 14999) - 20721) % 76) + 480) * 1);
    	a159 = ((a150 / a9) + 11);
    	a118 = a31;
    	a79 = ((((((a79 * a169) % 90) + -33) - -12468) + 1726) - 14187);
    	a89 = ((a9 + a150) - 12);
    	a122 = ((((a147 * a147) - -15140) + -17072) * 2);
    	a57 = (((((a57 * a199) % 14999) - -4151) + -11838) + -5025);
    	a129 = (a9 - 1);
    	a199 = (((((a199 * a90) % 14999) + -14997) - 2) - 2);
    	a102 = "e";
    	a147 = (((((a147 * a122) % 14999) - -1268) - -515) * 1);
    	a44 = ((((((a147 * a122) % 14999) - 27107) + 39219) % 89) + 231); 
    	output = "V";
    } 
    if((((((176 < a140) && (318 >= a140)) && ((((63 < a147) && (116 >= a147)) && ((-157 < a79) && (-135 >= a79))) && (a182 == 9))) && (a39.equals("f"))) && ((a65.equals("f")) && ((a9 == 5) && ((a34.equals("f")) && ((a185.equals("e")) && ((cf && (input.equals("E"))) && (a100.equals("i"))))))))) {
    	cf = false;
    	a96 = "g";
    	a147 = ((((a147 - -69) * 9) / 10) + 6);
    	a178 = "i";
    	a139 = ((a32 + a182) - 10);
    	a140 = ((((((a140 * a15) * 1) + 22197) / 5) % 59) + 377);
    	a141 = ((a153 * a84) + -55);
    	a57 = (((((a57 * a15) * 2) % 18) - 48) * 1);
    	a129 = (a141 + 1);
    	a67 = "g";
    	a79 = (((((((a79 * a80) % 14999) % 90) - 42) + -3) - -25271) - 25269);
    	a165 = ((((((a147 * a147) % 14999) / 5) + 14433) % 14) + 285);
    	a40 = "g";
    	a175 = ((a64 / a64) + 7);
    	a34 = "g";
    	a199 = ((((((a199 * a191) % 14999) % 10) + 265) + -30141) + 30138);
    	a102 = "g";
    	a169 = ((((((a169 * a80) % 14999) - 26049) + 19165) % 34) + 213); 
    	output = "Y";
    } 
}
private  void calculateOutputm97(String input) {
    if(((((((63 < a147) && (116 >= a147)) && ((a182 == 9) && (((-131 < a90) && (6 >= a90)) && (a185.equals("g"))))) && ((86 < a51) && (145 >= a51))) && (a67.equals("f"))) && ((a34.equals("f")) && (((a84 == 9) && ((input.equals("E")) && (cf && (a100.equals("i"))))) && ((-149 < a57) && (-68 >= a57)))))) {
    	cf = false;
    	a12 = "e";
    	a40 = "e";
    	a84 = (a187 - -7);
    	a156 = ((((a191 * a15) / 5) / 5) / 5);
    	a89 = (a84 + -7);
    	a137 = (((((a137 * a51) % 14999) + -15868) - -28456) * -1);
    	a177 = ((a193 + a89) + 2);
    	a32 = ((a95 - a153) + 12);
    	a80 = (((((a80 * a108) % 14999) + -25636) + 30231) - 28044);
    	a118 = (a193 + 6);
    	a59 = "h";
    	a154 = "e";
    	a199 = (((((a199 * a156) % 14999) - -211) + -15170) * 1);
    	a34 = "e";
    	a200 = ((((((a200 * a8) % 14999) / 5) - 7252) - -33212) * -1);
    	a21 = "e";
    	a86 = "e";
    	a87 = "g";
    	a31 = (a193 + 6);
    	a147 = ((((a147 * a108) - 31749) * 1) / 5);
    	a96 = "e";
    	a168 = ((((((a169 * a140) % 14999) - -278) * 1) - -3474) + -18738);
    	a64 = ((a118 / a177) + 3);
    	a139 = (a182 - 3);
    	a53 = (((((a53 * a128) % 14999) + 8242) + 4021) / -5);
    	a178 = "h";
    	a6 = "e";
    	a51 = ((((a51 * a15) + -7084) + -6510) / 5);
    	a65 = "e";
    	a9 = (a10 + -5);
    	a102 = "e";
    	a167 = "e";
    	a128 = ((((a169 * a90) - 2680) * 1) - 3100);
    	a108 = ((((a108 * a90) + -3632) - 1076) + -344); 
    	output = "Y";
    } 
    if(((((89 < a200) && (212 >= a200)) && ((a182 == 9) && (((165 < a80) && (369 >= a80)) && (((63 < a147) && (116 >= a147)) && (a193 == 2))))) && (((157 < a137) && (241 >= a137)) && ((a6.equals("f")) && ((((input.equals("C")) && (cf && (a185.equals("g")))) && (a100.equals("i"))) && (a154.equals("f"))))))) {
    	cf = false;
    	a8 = ((((((a147 * a147) % 91) - -71) + -16211) - 166) + 16398);
    	a140 = (((((((a8 * a147) / 5) % 59) + 351) * 5) % 59) + 331);
    	a53 = (((((a57 * a169) % 47) + 369) + 5) + -14);
    	a34 = "g";
    	a178 = "g";
    	a78 = "g";
    	a156 = ((((((a147 * a90) + -6917) / 5) - 1094) % 75) + 236);
    	a118 = (a193 + 8);
    	a167 = "g";
    	a139 = (a95 + 6);
    	a110 = "h";
    	a67 = "g";
    	a168 = (((((((a140 * a108) % 14999) % 65) + 215) * 5) % 65) + 206);
    	a84 = (a193 * a141);
    	a128 = ((((((a137 * a140) % 14999) % 72) - -418) * 1) + -9);
    	a199 = (((((((a199 * a90) % 14999) % 10) + 265) - -1) - 18538) + 18537);
    	a159 = (a193 + 10);
    	a79 = (((((a147 * a147) - 5360) / 5) % 90) + -42);
    	a200 = ((((a200 * a15) - 7641) * 1) + -221);
    	a187 = (a129 + -3);
    	a57 = (((((a15 * a168) % 18) - 48) * 1) - 1);
    	a39 = "g";
    	a65 = "g";
    	a191 = (((((((a191 * a79) % 14999) % 76) - -441) / 5) * 5) - -3);
    	a177 = ((a182 * a150) - 83);
    	a108 = ((((((a108 * a147) % 97) - -223) + 62) - -9295) - 9356);
    	a105 = "f";
    	a51 = ((((((((a51 * a128) % 14999) % 18) + 146) * 10) / 9) + -19378) - -19366);
    	a102 = "g";
    	a155 = "g";
    	a64 = (a118 + -4);
    	a9 = (a193 + 4);
    	a86 = "g";
    	a153 = (a118 + -3);
    	a80 = (((((((a80 * a53) % 14999) + 2175) % 52) + 378) / 5) - -376);
    	a169 = (((((((a169 * a128) % 14999) % 34) - -200) + -918) - 23942) + 24847);
    	a40 = "g";
    	a89 = (a32 - 6);
    	a193 = (a159 - 9);
    	a96 = "g";
    	a143 = "f";
    	a6 = "g";
    	a147 = ((((a147 * 5) % 54) - -132) - 9); 
    	output = "V";
    } 
    if((((a84 == 9) && (((input.equals("D")) && ((((a182 == 9) && cf) && (a185.equals("g"))) && ((-76 < a15) && (19 >= a15)))) && ((89 < a200) && (212 >= a200)))) && (((a21.equals("f")) && (((63 < a147) && (116 >= a147)) && ((a32 == 9) && (a100.equals("i"))))) && ((200 < a53) && (286 >= a53))))) {
    	cf = false;
    	a147 = (((a147 - -12272) - -9093) + 4907);
    	a122 = (((((((a108 * a128) % 14999) % 22) + 94) * 5) % 22) - -83);
    	a29 = ((a95 + a95) - -5);
    	a48 = (((((a147 * a147) % 14999) - 24581) * 1) - 603); 
    	output = "T";
    } 
}
private  void calculateOutputm99(String input) {
    if((((a155.equals("f")) && (((144 < a156) && (296 >= a156)) && ((a100.equals("i")) && (((63 < a147) && (116 >= a147)) && (a118 == 9))))) && ((a102.equals("f")) && ((a86.equals("f")) && ((((a68 == 8) && ((a182 == 10) && cf)) && (a141 == 4)) && (input.equals("A"))))))) {
    	cf = false;
    	a177 = ((a31 * a31) - 74);
    	a187 = (a129 - 2);
    	a84 = (a64 + 4);
    	a159 = (a187 - -9);
    	a141 = ((a150 / a182) + 4);
    	a118 = (a177 + 3);
    	a95 = (a68 - 5);
    	a53 = ((((((a53 * a200) % 14999) % 47) - -298) * 1) - -32);
    	a56 = (a32 + -4);
    	a90 = ((((((a199 * a137) % 14999) + 6599) + -32014) + 22639) + -12980);
    	a15 = (((((a15 * a128) % 20) - -41) * 1) - -1);
    	a78 = "g";
    	a6 = "g";
    	a155 = "g";
    	a105 = "e";
    	a128 = ((((((a79 * a199) % 14999) - 14814) - 96) - -33844) * -1);
    	a81 = "g";
    	a156 = (((((((a156 * a108) % 14999) + 5102) + 623) * 1) % 23) - -308);
    	a147 = (((((((a147 * a51) * 1) % 54) - -143) * 5) % 54) - -148);
    	a51 = (((((a57 * a79) / 5) % 18) - -154) + -1);
    	a32 = (a193 - -6);
    	a168 = ((((((((a168 * a169) % 14999) % 65) - -207) * 5) + -55) % 65) - -210);
    	a139 = ((a10 + a182) - 13);
    	a167 = "g";
    	a20 = "f";
    	a154 = "g";
    	a65 = "e";
    	a102 = "e";
    	a9 = (a95 - -3);
    	a178 = "h";
    	a39 = "g";
    	a193 = a187;
    	a79 = ((((((a79 * a191) % 14999) - 10051) / 5) % 90) + 26); 
    	output = "T";
    } 
    if(((((-157 < a79) && (-135 >= a79)) && ((a129 == 5) && ((a78.equals("f")) && (((input.equals("C")) && ((86 < a51) && (145 >= a51))) && (a182 == 10))))) && ((a167.equals("f")) && ((a68 == 8) && (((-76 < a15) && (19 >= a15)) && ((cf && ((63 < a147) && (116 >= a147))) && (a100.equals("i")))))))) {
    	a170 += (a170 + 20) > a170 ? 4 : 0;
    	cf = false;
    	a140 = (((((((a191 * a191) % 14999) % 59) + 349) + 2725) / 5) + -281);
    	a154 = "g";
    	a105 = "f";
    	a118 = (a141 + 6);
    	a96 = "g";
    	a90 = ((((((a191 * a128) % 14999) % 100) + 81) / 5) + 123);
    	a53 = (((((((a140 * a199) % 14999) % 47) + 323) / 5) / 5) - -275);
    	a187 = (a193 + 1);
    	a15 = ((((((a15 * a53) - -5704) - 3738) - -9269) % 20) + 39);
    	a39 = "g";
    	a57 = ((((((a140 * a140) % 14999) % 18) + -52) - 15567) - -15563);
    	a32 = (a68 + 2);
    	a177 = ((a182 + a84) + -12);
    	a153 = ((a84 + a31) + -11);
    	a51 = ((((((a51 * a80) % 14999) % 18) + 163) / 5) - -120);
    	a167 = "g";
    	a159 = (a187 + 9);
    	a79 = ((((((a156 * a90) % 14999) % 90) - 44) / 5) - 74);
    	a139 = (a9 - -3);
    	a102 = "g";
    	a95 = (a118 + -7);
    	a84 = a182;
    	a12 = "g";
    	a200 = ((((((a200 * a79) % 59) - -273) / 5) - 14533) + 14793);
    	a155 = "g";
    	a165 = ((((((a168 * a147) / 5) * 5) + 6440) % 42) - -216);
    	a141 = (a182 + -5);
    	a199 = (((((((a199 * a140) % 14999) / 5) + 20133) * 1) % 10) + 264);
    	a8 = (((((((a156 * a140) % 14999) - -11226) + -32449) + 17015) % 91) + 137);
    	a86 = "g";
    	a81 = "g";
    	a9 = (a129 + 1);
    	a137 = ((((((((a137 * a108) % 14999) % 82) - -304) * 9) / 10) * 10) / 9);
    	a147 = (((((((a147 * a165) % 14999) % 54) - -151) * 5) % 54) - -140);
    	a6 = "g";
    	a168 = (((((((((a191 * a8) % 14999) % 65) + 217) * 10) / 9) / 5) * 45) / 10);
    	a193 = (a177 - 4);
    	a31 = a182;
    	a191 = ((((((a191 * a57) % 76) - -458) * 5) % 76) - -423);
    	a178 = "i";
    	a132 = (((((a147 * a165) % 14999) + 14127) - 38860) / 5); 
    	output = "Y";
    } 
    if(((((((a68 == 8) && (((68 < a199) && (254 >= a199)) && (a12.equals("f")))) && (a100.equals("i"))) && (a187 == 2)) && (((-7 < a8) && (46 >= a8)) && (((((cf && ((63 < a147) && (116 >= a147))) && (a182 == 10)) && (a159 == 11)) && (input.equals("B"))) && (a6.equals("f"))))) && a127 >= 4)) {
    	cf = false;
    	a81 = "g";
    	a79 = ((((((a79 * a15) / 5) - 12826) - 955) % 90) - 12);
    	a88 = (a95 - -11);
    	a56 = ((a68 + a95) - 3);
    	a178 = "h";
    	a139 = (a150 - 2);
    	a167 = "g";
    	a129 = ((a118 - a193) - 1);
    	a51 = (((((a51 * a147) * 1) * 1) % 18) + 151);
    	a147 = ((((((a147 * a128) % 14999) + 8259) / 5) % 54) - -155);
    	a118 = (a10 + -1);
    	a9 = (a89 * a187);
    	a128 = (((((a8 * a191) % 72) + 452) / 5) * 5);
    	a155 = "g";
    	a84 = ((a182 * a32) - 80);
    	a187 = (a32 - 6); 
    	output = "T";
    } 
    if((((a155.equals("f")) && (((-7 < a8) && (46 >= a8)) && (((a6.equals("f")) && ((input.equals("E")) && ((cf && (a182 == 10)) && (a68 == 8)))) && (a193 == 2)))) && (((((63 < a147) && (116 >= a147)) && (a31 == 9)) && (a100.equals("i"))) && ((-76 < a15) && (19 >= a15))))) {
    	cf = false;
    	a171 = ((((((a147 * a147) % 17) - -133) - 1) - -9941) + -9941);
    	a179 = (a84 + 1);
    	a105 = "f";
    	a40 = "f";
    	a21 = "f";
    	a100 = "g";
    	a89 = ((a32 - a129) - 2); 
    	output = "Y";
    } 
}
private  void calculateOutputm100(String input) {
    if((((a177 == 6) && (((63 < a147) && (116 >= a147)) && ((a100.equals("i")) && ((input.equals("C")) && (cf && (a182 == 10)))))) && (((a67.equals("f")) && ((((a10 == 10) && ((146 < a108) && (191 >= a108))) && (a68 == 12)) && (a102.equals("f")))) && ((-131 < a90) && (6 >= a90))))) {
    	cf = false;
    	a161 = "g";
    	a101 = a84;
    	a122 = (((((a147 * a147) % 100) - -126) + -8949) - -9008);
    	a147 = (((((((a147 * a122) % 14999) + 7918) * 10) / 9) * 10) / 9); 
    	output = "S";
    } 
    if(((((-149 < a57) && (-68 >= a57)) && (((input.equals("A")) && cf) && (a182 == 10))) && ((a68 == 12) && (((63 < a147) && (116 >= a147)) && (((((a105.equals("f")) && ((a96.equals("f")) && (a139 == 7))) && (a100.equals("i"))) && (a78.equals("f"))) && (a0.equals("f"))))))) {
    	cf = false;
    	if((!(a129 == 6) || (((a153 == 10) || ((a40.equals("f")) && (a139 == 7))) || (a143.equals("g"))))) {
    	a80 = (((((a169 * a57) * 1) / 5) * 10) / 9);
    	a150 = (a64 - -3);
    	a187 = ((a84 / a10) - -1);
    	a21 = "f";
    	a118 = (a129 + 4);
    	a129 = (a95 - -4);
    	a141 = (a31 + -5);
    	a193 = (a182 + -8);
    	a4 = ((a68 + a177) - 9);
    	a153 = (a118 - 3);
    	a155 = "e";
    	a31 = (a9 + 4);
    	a100 = "g";
    	a89 = (a177 + -4);
    	a140 = (((((a199 * a90) % 14999) + -1428) / 5) - 11949);
    	a105 = "e";
    	a171 = (((((a147 * a147) % 88) - -28) + 4782) - 4796);
    	a200 = (((((((a137 * a191) % 14999) % 61) + 146) - -26470) + 1331) + -27844);
    	a79 = ((((((a53 * a51) % 14999) + -9474) % 10) - 146) - -1);
    	a51 = (((((a51 * a156) % 14999) - 18511) * 1) + -3968);
    	a0 = "f";
    	a84 = (a64 + 5);
    	a128 = (((((a108 * a15) - 11617) * 1) * 10) / 9);
    	a168 = ((((((a147 * a191) % 14999) - 279) + -24695) * 10) / 9);
    	a167 = "f";
    	a12 = "e";
    	a159 = (a141 - -6);
    	a6 = "e";
    	a108 = (((((a108 * a191) % 14999) + -28641) + -910) - 42); 
    	}else {
    	a128 = (((((a8 * a108) % 91) - -286) - -16838) + -16836);
    	a187 = ((a68 + a139) - 17);
    	a168 = ((((((a15 * a15) * 5) * 1) + -19951) % 65) + 265);
    	a95 = ((a129 * a187) - 7);
    	a176 = ((((((a147 * a147) * 2) / 5) + -30817) % 58) + 192);
    	a105 = "g";
    	a97 = (a84 + -1);
    	a78 = "g";
    	a100 = "f";
    	a191 = ((((((a191 * a90) % 14999) % 76) - -443) / 5) - -371);
    	a32 = (a97 + 2);
    	a141 = (a31 - 5);
    	a67 = "g";
    	a79 = (((((((a156 * a128) % 14999) % 10) + -144) + -4) - -22125) + -22130);
    	a86 = "g";
    	a53 = ((((((a53 * a57) % 14999) - 14552) % 47) - -364) * 1);
    	a6 = "g";
    	a89 = (a64 + -3);
    	a40 = "g";
    	a80 = (((((a79 * a108) / 5) / 5) % 52) - -444);
    	a129 = (a182 + -4);
    	a167 = "f";
    	a200 = ((((((a128 * a8) - 14458) * 1) + 21407) % 61) - -134);
    	a155 = "g";
    	a39 = "g";
    	a193 = (a150 + -7);
    	a118 = (a68 + -3);
    	}output = "X";
    } 
    if((((a12.equals("f")) && ((((cf && (a68 == 12)) && (input.equals("E"))) && (a100.equals("i"))) && (a21.equals("f")))) && ((a102.equals("f")) && ((a96.equals("f")) && (((-149 < a57) && (-68 >= a57)) && ((((-76 < a15) && (19 >= a15)) && ((63 < a147) && (116 >= a147))) && (a182 == 10))))))) {
    	a103 -= (a103 - 20) < a103 ? 2 : 0;
    	cf = false;
    	a150 = (a68 - 2);
    	a78 = "f";
    	a8 = ((((((((a53 * a53) % 14999) % 26) + 2) - -13) * 5) % 26) - -11);
    	a177 = (a118 + -3);
    	a80 = (((((a53 * a79) % 14999) + -4997) / 5) - 15456);
    	a169 = (((((((a79 * a79) % 14999) - 26221) % 34) + 229) + -22989) - -22983);
    	a59 = "g";
    	a168 = (((((a53 * a79) % 14999) / 5) + -18536) / 5);
    	a15 = (((((a15 * a168) % 14999) * 2) / 5) - 21224);
    	a10 = ((a129 / a177) - -8);
    	a65 = "e";
    	a102 = "e";
    	a64 = (a129 + -1);
    	a139 = (a9 + 1);
    	a9 = ((a129 * a182) - 46);
    	a86 = "f";
    	a133 = (a31 + 1);
    	a162 = (a129 - -6);
    	a51 = ((((a51 * a108) * -1) + -654) + 9110);
    	a156 = (((((a79 * a53) % 14999) + -7833) * 1) / 5);
    	a154 = "e";
    	a32 = (a141 + 5);
    	a191 = (((((a191 * a156) % 14999) + -14823) / 5) - 10077);
    	a57 = ((((((a168 * a128) % 14999) % 14925) - 15073) / 5) - 19100);
    	a40 = "g";
    	a81 = "f";
    	a39 = "e";
    	a140 = (((((a80 * a80) % 14999) / 5) + 258) - 23778);
    	a147 = (((a147 * 5) + -24256) - 4955);
    	a0 = "e";
    	a105 = "e";
    	a108 = (((((a80 * a80) % 14999) + -14899) + -68) - 4);
    	a199 = ((((((a199 * a57) % 14999) + 931) - 10281) * 10) / 9);
    	a96 = "e";
    	a21 = "e";
    	a67 = "e";
    	a12 = "e";
    	a137 = (((((a137 * a140) % 14999) / 5) - 4424) * 4);
    	a95 = (a141 - 2);
    	a90 = ((((((a90 * a53) % 14999) % 14934) + -15064) + -2) - 1);
    	a84 = (a153 + 3);
    	a31 = a118;
    	a159 = (a89 + 9);
    	a34 = "e";
    	a53 = ((((((a53 * a15) % 14999) / 5) / 5) % 42) + 242);
    	a129 = (a118 - 3); 
    	output = "U";
    } 
}
private  void calculateOutputm101(String input) {
    if((((((157 < a137) && (241 >= a137)) && ((((a182 == 10) && (cf && ((63 < a147) && (116 >= a147)))) && (a39.equals("f"))) && (a40.equals("f")))) && (input.equals("D"))) && ((a68 == 13) && ((a100.equals("i")) && ((((146 < a108) && (191 >= a108)) && (a64 == 5)) && (a0.equals("f"))))))) {
    	cf = false;
    	a40 = "g";
    	a56 = ((a89 - a182) + 12);
    	a139 = ((a129 - a68) - -16);
    	a118 = (a32 - -1);
    	a180 = "f";
    	a147 = ((((a147 - 26938) + 27004) - -29328) - 29315);
    	a10 = a159;
    	a178 = "h";
    	a141 = (a193 - -2);
    	a81 = "g";
    	a32 = (a187 - -8);
    	a191 = ((((((a191 * a79) % 14999) % 76) - -443) * 1) + 1);
    	a89 = (a84 - 7); 
    	output = "V";
    } 
    if((((a141 == 4) && (((((63 < a147) && (116 >= a147)) && ((a102.equals("f")) && (((a182 == 10) && ((a68 == 13) && cf)) && (input.equals("A"))))) && ((200 < a53) && (286 >= a53))) && ((-7 < a8) && (46 >= a8)))) && (((a100.equals("i")) && (a129 == 5)) && (a159 == 11)))) {
    	cf = false;
    	a84 = (a10 + -1);
    	a177 = (a68 - 6);
    	a150 = a118;
    	a15 = (((((a15 * a108) % 20) + 40) + 1) + -2);
    	a44 = ((((((a140 * a57) % 14999) / 5) % 14) - -159) * 1);
    	a169 = (((((((a90 * a191) % 14999) + 14509) + 290) * 1) % 12) + 167);
    	a140 = (((((((a156 * a199) % 14999) % 59) + 376) - -3) + 25567) - 25589);
    	a122 = ((((((a57 * a51) * 10) / -9) / 5) * 10) / 9);
    	a167 = "f";
    	a32 = ((a9 / a182) - -10);
    	a96 = "g";
    	a64 = ((a89 / a118) + 6);
    	a141 = ((a95 + a153) - 3);
    	a147 = (((((a147 * a44) * 1) + 367) * 10) / 9);
    	a21 = "f";
    	a110 = "h";
    	a139 = ((a84 * a153) + -46);
    	a79 = (((((((a128 * a191) % 14999) % 10) + -150) * 5) % 10) - 146);
    	a9 = ((a10 - a159) + 7);
    	a80 = ((((((a90 * a8) - -7298) / 5) + -9640) % 101) + 286);
    	a159 = ((a118 / a68) + 12); 
    	output = "V";
    } 
    if((((a182 == 10) && ((input.equals("E")) && (a154.equals("f")))) && (((a100.equals("i")) && (((((144 < a156) && (296 >= a156)) && (((((63 < a147) && (116 >= a147)) && cf) && (a68 == 13)) && ((-149 < a57) && (-68 >= a57)))) && ((89 < a200) && (212 >= a200))) && ((86 < a51) && (145 >= a51)))) && (a81.equals("f"))))) {
    	cf = false;
    	if((a121 == 9)) {
    	a129 = (a141 - -2);
    	a12 = "e";
    	a31 = (a182 - 1);
    	a150 = (a10 - 2);
    	a21 = "f";
    	a4 = (a10 + -1);
    	a169 = (((((a199 * a8) - -3464) % 12) - -155) - 0);
    	a167 = "f";
    	a140 = ((((((a140 * a191) % 14999) - 26951) * 10) / 9) + -26);
    	a108 = (((((a108 * a53) % 14999) + 5756) - 16923) - 7842);
    	a168 = ((((a147 * a15) + -13287) * 1) - -511);
    	a0 = "f";
    	a84 = ((a177 * a10) + -50);
    	a159 = (a95 - -8);
    	a78 = "f";
    	a79 = (((((((a156 * a53) % 14999) / 5) + 19523) / 5) % 10) - 150);
    	a155 = "e";
    	a6 = "e";
    	a80 = (((((a191 * a53) % 14999) + -26105) + 5357) * 1);
    	a105 = "e";
    	a100 = "g";
    	a193 = (a32 + -7);
    	a51 = ((((a51 * a147) / 5) + 21564) + -45455);
    	a171 = ((((((((a147 * a147) % 88) + 18) * 9) / 10) * 5) % 88) + -10);
    	a34 = "f";
    	a128 = (((((a90 * a57) - 8835) + -12280) * 10) / 9);
    	a187 = (a4 + -8); 
    	}else {
    	a155 = "g";
    	a169 = ((((((a108 * a8) + -23570) - 3164) - 1205) % 12) - -173);
    	a97 = ((a141 / a187) - -6);
    	a153 = (a139 + -2);
    	a176 = ((((((a199 * a156) % 14999) - -7741) % 58) + 145) + 1);
    	a167 = "f";
    	a53 = (((((((a53 * a169) % 14999) % 47) - -321) / 5) + 6724) + -6492);
    	a39 = "g";
    	a86 = "g";
    	a84 = (a64 + 4);
    	a191 = (((((((a191 * a199) % 14999) % 76) + 414) * 5) % 76) - -401);
    	a40 = "g";
    	a32 = (a97 - -2);
    	a129 = (a159 + -5);
    	a21 = "f";
    	a34 = "f";
    	a150 = ((a159 + a182) + -12);
    	a67 = "g";
    	a100 = "f";
    	a95 = (a10 - 7);
    	a79 = ((((((a176 * a199) % 14999) % 10) + -155) + -14799) + 14805);
    	a105 = "g";
    	a12 = "f";
    	a193 = a89;
    	}output = "S";
    } 
}
private  void calculateOutputm106(String input) {
    if(((((13 < a168) && (198 >= a168)) && ((((input.equals("A")) && (((a100.equals("i")) && ((157 < a137) && (241 >= a137))) && (a187 == 2))) && ((63 < a147) && (116 >= a147))) && ((-149 < a57) && (-68 >= a57)))) && ((a0.equals("f")) && (((a182 == 13) && (cf && ((127 < a92) && (153 >= a92)))) && ((68 < a199) && (254 >= a199)))))) {
    	a170 += (a170 + 20) > a170 ? 4 : 0;
    	cf = false;
    	a59 = "h";
    	a139 = (a10 + -3);
    	a32 = ((a95 * a64) - 2);
    	a87 = "g";
    	a51 = ((((((a51 * a140) % 14999) - 14958) + -44) + 3252) + -3213);
    	a156 = ((((((a168 * a128) % 14999) * 2) % 15072) + -14927) - 2);
    	a31 = ((a182 + a9) + -10);
    	a21 = "e";
    	a9 = ((a177 + a182) + -14);
    	a147 = ((((a147 * a92) * -1) * 1) + -7581);
    	a137 = ((((a137 * a15) + -7302) + -2157) / 5);
    	a199 = ((((((a199 * a191) % 14999) + -26745) * 10) / 9) + -276);
    	a53 = (((((a53 * a51) % 14999) + -14809) / 5) * 5);
    	a65 = "e";
    	a154 = "e";
    	a80 = (((((a80 * a51) % 14999) - 14970) + -32) * 1);
    	a200 = (((((a200 * a168) % 14999) + 13522) + -31172) * 1);
    	a96 = "e";
    	a167 = "e";
    	a178 = "h";
    	a187 = ((a84 - a95) - 5);
    	a168 = (((((((a168 * a128) % 14999) * 2) + -3) * 1) % 15006) - 14992);
    	a102 = "e";
    	a108 = (((((a8 * a128) % 14999) + 13530) * 1) - 28486);
    	a86 = "e";
    	a64 = (a89 - -3); 
    	output = "Y";
    } 
    if((((((86 < a51) && (145 >= a51)) && ((a86.equals("f")) && ((a32 == 9) && (((154 < a169) && (179 >= a169)) && ((a65.equals("f")) && (((186 < a191) && (365 >= a191)) && ((127 < a92) && (153 >= a92)))))))) && ((63 < a147) && (116 >= a147))) && ((input.equals("C")) && ((a182 == 13) && (cf && (a100.equals("i"))))))) {
    	cf = false;
    	a147 = ((((a147 * a199) - -407) + -11868) - -9983);
    	a161 = "h";
    	a120 = (((((a147 * a92) % 14999) - -3063) * 1) / 5);
    	a122 = (((((((a169 * a92) - 33979) % 100) - -303) * 5) % 100) + 200); 
    	output = "Y";
    } 
}
private  void calculateOutputm108(String input) {
    if(((((a153 == 6) && (((a182 == 14) && ((a159 == 11) && (a150 == 9))) && (a193 == 2))) && (input.equals("B"))) && ((((a100.equals("i")) && (((a183.equals("f")) && cf) && ((63 < a147) && (116 >= a147)))) && (a31 == 9)) && (a39.equals("f"))))) {
    	cf = false;
    	a0 = "e";
    	a185 = "e";
    	a51 = ((((a51 - 16860) % 18) + 166) + 2);
    	a67 = "g";
    	a100 = "e";
    	a167 = "f";
    	a31 = 10;
    	a34 = "f";
    	a6 = "h";
    	a86 = "i";
    	a193 = 7;
    	a65 = "i";
    	a141 = 10;
    	a32 = 11;
    	a138 = (a182 + -8); 
    	output = "S";
    } 
    if(((((a183.equals("f")) && ((((a84 == 9) && ((154 < a169) && (179 >= a169))) && (a100.equals("i"))) && ((63 < a147) && (116 >= a147)))) && ((68 < a199) && (254 >= a199))) && (((-149 < a57) && (-68 >= a57)) && (((a89 == 2) && ((cf && (input.equals("A"))) && (a182 == 14))) && (a95 == 2))))) {
    	a47 -= (a47 - 20) < a47 ? 2 : 0;
    	cf = false;
    	a100 = "h";
    	a122 = ((((a147 * a147) * -2) + -169) / 5);
    	a36 = (a84 - -4); 
    	output = "S";
    } 
    if(((((186 < a191) && (365 >= a191)) && ((a10 == 10) && (((-131 < a90) && (6 >= a90)) && (a12.equals("f"))))) && (((68 < a199) && (254 >= a199)) && (((63 < a147) && (116 >= a147)) && ((a100.equals("i")) && ((input.equals("D")) && ((((a182 == 14) && cf) && (a183.equals("f"))) && (a193 == 2)))))))) {
    	cf = false;
    	a155 = "f";
    	a100 = "g";
    	a81 = "i";
    	a171 = (((((a147 * a147) % 88) - 20) - 1661) + 1678);
    	a168 = (((a168 - -11325) + 14172) / 5);
    	a153 = 6;
    	a51 = ((((a51 - -11096) * 2) / 5) + -32251);
    	a65 = "e";
    	a191 = ((((a191 * 5) * 5) % 89) + 266);
    	a4 = ((a129 / a187) - -5);
    	a187 = 6; 
    	output = "V";
    } 
    if((((a67.equals("f")) && ((((input.equals("E")) && ((a183.equals("f")) && (cf && (a100.equals("i"))))) && ((-7 < a8) && (46 >= a8))) && (a64 == 5))) && ((((((13 < a168) && (198 >= a168)) && (a182 == 14)) && ((63 < a147) && (116 >= a147))) && (a154.equals("f"))) && ((-131 < a90) && (6 >= a90))))) {
    	cf = false;
    	a46 = ((a182 + a84) + -15);
    	a122 = (((((a147 * a147) % 100) + 213) - -9) + 2);
    	a161 = "f";
    	a147 = ((((a147 * a199) + -4855) * 1) - -4479); 
    	output = "T";
    } 
    if((((((a155.equals("f")) && (((a100.equals("i")) && cf) && (input.equals("C")))) && ((-131 < a90) && (6 >= a90))) && ((144 < a156) && (296 >= a156))) && (((((63 < a147) && (116 >= a147)) && (((a105.equals("f")) && ((186 < a191) && (365 >= a191))) && (a182 == 14))) && (a9 == 5)) && (a183.equals("f"))))) {
    	cf = false;
    	a56 = (a95 - -8);
    	a89 = 4;
    	a187 = 5;
    	a64 = 7;
    	a153 = 6;
    	a137 = ((((a137 * 5) % 41) + 186) + 2);
    	a118 = 13;
    	a108 = (((92 * 5) - 22104) - -7233);
    	a31 = 11;
    	a10 = 14;
    	a178 = "h";
    	a167 = "e";
    	a81 = "i";
    	a200 = (((95 + -14995) + -4367) - 7322);
    	a177 = 5;
    	a191 = ((((a191 - -29618) / 5) - -4609) + -25854);
    	a84 = 13;
    	a199 = (((a199 + -28178) - 1294) + -167);
    	a34 = "h";
    	a147 = (((((((a147 * a140) % 14999) - -8837) % 54) - -159) * 9) / 10);
    	a21 = "e";
    	a80 = (((31 - -2715) + 26299) / 5);
    	a102 = "i";
    	a129 = 7;
    	a32 = 8;
    	a40 = "i";
    	a139 = 10;
    	a86 = "f";
    	a154 = "f";
    	a51 = (((a51 - 19699) - 4686) * 1);
    	a162 = (a150 - -3);
    	a105 = "e";
    	a53 = (((a53 + 23771) / 5) * 5);
    	a57 = ((((a57 / 5) * 115) / 10) - 19013);
    	a156 = (((a156 * 5) - 12986) * 2);
    	a150 = 14; 
    	output = "Y";
    } 
}
private  void calculateOutputm10(String input) {
    if((((((a159 == 11) && (a187 == 2)) && (a12.equals("f"))) && (a81.equals("f"))) && (((a141 == 4) && (cf && (a182 == 8))) && ((195 < a128) && (379 >= a128))))) {
    	if(((((a34.equals("f")) && ((146 < a108) && (191 >= a108))) && ((68 < a199) && (254 >= a199))) && (((157 < a137) && (241 >= a137)) && (((89 < a200) && (212 >= a200)) && ((a96.equals("f")) && (226 < a114 && cf)))))) {
    		calculateOutputm95(input);
    	} 
    } 
    if(((((165 < a80) && (369 >= a80)) && (a40.equals("f"))) && (((154 < a169) && (179 >= a169)) && (((a34.equals("f")) && (((a182 == 9) && cf) && (a32 == 9))) && (a153 == 6))))) {
    	if((((a102.equals("f")) && ((165 < a80) && (369 >= a80))) && ((((((68 < a199) && (254 >= a199)) && (cf && (a185.equals("e")))) && ((89 < a200) && (212 >= a200))) && (a129 == 5)) && (a139 == 7)))) {
    		calculateOutputm96(input);
    	} 
    	if(((((((157 < a137) && (241 >= a137)) && (cf && (a185.equals("g")))) && (a65.equals("f"))) && (a102.equals("f"))) && (((89 < a200) && (212 >= a200)) && ((a81.equals("f")) && (a64 == 5))))) {
    		calculateOutputm97(input);
    	} 
    } 
    if(((a32 == 9) && (((a65.equals("f")) && ((((cf && (a182 == 10)) && ((86 < a51) && (145 >= a51))) && ((-76 < a15) && (19 >= a15))) && (a96.equals("f")))) && (a39.equals("f"))))) {
    	if((((a96.equals("f")) && (((89 < a200) && (212 >= a200)) && ((165 < a80) && (369 >= a80)))) && ((((157 < a137) && (241 >= a137)) && ((a193 == 2) && (cf && (a68 == 8)))) && ((186 < a191) && (365 >= a191))))) {
    		calculateOutputm99(input);
    	} 
    	if(((((a65.equals("f")) && (((-131 < a90) && (6 >= a90)) && (cf && (a68 == 12)))) && (a64 == 5)) && (((a84 == 9) && (a21.equals("f"))) && ((157 < a137) && (241 >= a137))))) {
    		calculateOutputm100(input);
    	} 
    	if((((a40.equals("f")) && (((186 < a191) && (365 >= a191)) && (a96.equals("f")))) && ((a32 == 9) && (((cf && (a68 == 13)) && (a0.equals("f"))) && (a118 == 9))))) {
    		calculateOutputm101(input);
    	} 
    } 
    if(((((-149 < a57) && (-68 >= a57)) && ((a64 == 5) && ((((157 < a137) && (241 >= a137)) && ((a182 == 13) && cf)) && ((89 < a200) && (212 >= a200))))) && ((a102.equals("f")) && (a31 == 9)))) {
    	if(((((86 < a51) && (145 >= a51)) && (((200 < a53) && (286 >= a53)) && (((154 < a169) && (179 >= a169)) && ((165 < a80) && (369 >= a80))))) && ((a150 == 9) && ((cf && ((127 < a92) && (153 >= a92))) && (a155.equals("f")))))) {
    		calculateOutputm106(input);
    	} 
    } 
    if((((a167.equals("f")) && (((-149 < a57) && (-68 >= a57)) && (a89 == 2))) && (((((a182 == 14) && cf) && ((13 < a168) && (198 >= a168))) && ((157 < a137) && (241 >= a137))) && (a39.equals("f"))))) {
    	if((((a183.equals("f")) && cf) && ((a65.equals("f")) && (((a89 == 2) && ((a95 == 2) && ((a0.equals("f")) && (a78.equals("f"))))) && (a159 == 11))))) {
    		calculateOutputm108(input);
    	} 
    } 
}
private  void calculateOutputm118(String input) {
    if((((((((((19 < a15) && (61 >= a15)) && ((318 < a140) && (437 >= a140))) && 335 < a172) && (a86.equals("g"))) && (a154.equals("g"))) && (a10 == 11)) && (a105.equals("g"))) && ((a14.equals("h")) && ((a178.equals("e")) && ((input.equals("E")) && (((116 < a147) && (225 >= a147)) && cf)))))) {
    	cf = false;
    	a105 = "e";
    	a178 = "h";
    	a159 = ((a177 * a89) + -9);
    	a193 = (a159 - 9);
    	a56 = (a139 - 3);
    	a200 = ((((((a15 * a191) % 14999) - 7323) / 5) % 61) - -150);
    	a12 = "f";
    	a153 = a64;
    	a150 = (a9 - -4);
    	a20 = "f";
    	a137 = ((((((((a137 * a169) % 14999) - -11892) % 41) + 167) * 5) % 41) - -180);
    	a86 = "f";
    	a102 = "e";
    	a80 = ((((((a108 * a156) % 14999) % 101) + 197) + -22243) + 22271);
    	a31 = (a150 + -1);
    	a57 = ((((((a57 * a108) % 40) - 75) - -17237) + -20382) + 3124);
    	a191 = (((((((a191 * a169) % 14999) - -13449) - 5542) / 5) % 89) - -210);
    	a96 = "f";
    	a140 = ((((((a140 * a79) % 14999) + -14940) + 19345) * 1) - 19260); 
    	output = "T";
    } 
    if(((((191 < a108) && (387 >= a108)) && ((a39.equals("g")) && ((a14.equals("h")) && (((116 < a147) && (225 >= a147)) && (((input.equals("C")) && cf) && 335 < a172))))) && ((a9 == 6) && ((a21.equals("g")) && ((a178.equals("e")) && ((a86.equals("g")) && ((365 < a191) && (519 >= a191)))))))) {
    	cf = false;
    	a34 = "e";
    	a10 = (a84 + -1);
    	a86 = "e";
    	a59 = "i";
    	a155 = "e";
    	a118 = ((a10 / a95) + 5);
    	a108 = (((((a108 * a80) % 14999) - -3450) - 18303) - 129);
    	a157 = ((((((a57 * a147) + -4332) * 1) / 5) % 14) - -345);
    	a105 = "e";
    	a102 = "e";
    	a131 = "i";
    	a167 = "e";
    	a147 = (((((a147 * a172) % 14999) - -4180) / -5) * 5);
    	a137 = ((((((a137 * a147) % 14999) + -349) + -14543) + 14952) + -14903);
    	a139 = ((a31 + a193) + -5);
    	a140 = ((((((a140 * a200) % 14999) - 14905) * 1) - -25735) - 25670); 
    	output = "Y";
    } 
}
private  void calculateOutputm11(String input) {
    if(((((a102.equals("g")) && (a139 == 8)) && ((198 < a168) && (330 >= a168))) && ((a21.equals("g")) && (((335 < a172 && cf) && (a118 == 10)) && (a187 == 3))))) {
    	if(((((a153 == 7) && ((241 < a137) && (407 >= a137))) && (a34.equals("g"))) && ((a177 == 7) && (((a31 == 10) && (cf && (a14.equals("h")))) && (a95 == 3))))) {
    		calculateOutputm118(input);
    	} 
    } 
}
private  void calculateOutputm125(String input) {
    if(((((116 < a147) && (225 >= a147)) && (((input.equals("A")) && (((296 < a156) && (344 >= a156)) && ((a153 == 7) && (a102.equals("g"))))) && (a94 == 8))) && (((((cf && (a178.equals("f"))) && 162 < a171) && (a89 == 3)) && ((212 < a200) && (332 >= a200))) && (a31 == 10)))) {
    	cf = false;
    	a9 = ((a31 * a84) - 96);
    	a129 = (a89 - -3);
    	a10 = (a94 + 1);
    	a168 = (((((((a147 * a140) % 14999) / 5) % 65) - -218) + -10539) + 10545);
    	a156 = (((((a156 * a147) % 14999) + -29164) - 725) - 61);
    	a39 = "e";
    	a105 = "f";
    	a199 = (((((a199 * a147) % 14999) - 14396) + -1437) * 1);
    	a15 = ((((((a51 * a147) % 14999) % 14962) - 15037) - 1) * 1);
    	a81 = "f";
    	a191 = (((((a140 * a140) % 14999) + -12168) + -6721) - 1518);
    	a40 = "f";
    	a139 = ((a153 + a64) + -5);
    	a6 = "e";
    	a102 = "e";
    	a31 = (a10 - 1);
    	a153 = ((a84 / a10) + 4);
    	a141 = ((a10 * a10) - 78);
    	a177 = ((a89 / a118) - -6);
    	a128 = ((((((a128 * a80) % 14999) + -26266) * 10) / 9) - 431);
    	a12 = "e";
    	a193 = (a9 + -3);
    	a200 = (((((a200 * a137) % 14999) + -14931) + -52) + -16);
    	a57 = ((((((a57 * a137) % 14999) % 14925) - 15073) - 3) - 0);
    	a90 = (((((a90 * a8) % 14999) + -879) + -2505) * 1);
    	a53 = ((((((((a171 * a171) % 14999) % 42) + 244) + 1) / 5) * 45) / 10);
    	a67 = "e";
    	a160 = "i";
    	a95 = a193;
    	a178 = "i";
    	a59 = "h";
    	a96 = "e";
    	a150 = a159;
    	a78 = "e";
    	a118 = ((a84 + a187) - 5);
    	a154 = "e";
    	a167 = "e";
    	a89 = ((a139 + a95) - 6);
    	a80 = ((((((a171 * a147) % 14999) - -10715) % 52) + 382) * 1);
    	a84 = (a95 - -7);
    	a79 = ((((((a79 * a140) % 14999) + -5596) % 14921) - 15077) + -1);
    	a34 = "g";
    	a169 = ((((((a108 * a108) % 14999) % 34) + 213) + 0) - -2);
    	a187 = (a9 + -3);
    	a86 = "e";
    	a155 = "e";
    	a140 = ((((((a140 * a156) % 14999) - 14992) * 1) - -5043) - 4934);
    	a147 = (((((a147 * a171) % 14999) - 16181) / 5) * 5); 
    	output = "X";
    } 
    if((((a187 == 3) && (((a178.equals("f")) && cf) && (input.equals("C")))) && ((((116 < a147) && (225 >= a147)) && (((254 < a199) && (275 >= a199)) && (((a94 == 8) && ((((318 < a140) && (437 >= a140)) && ((6 < a90) && (207 >= a90))) && (a193 == 3))) && 162 < a171))) && (a153 == 7)))) {
    	cf = false;
    	a172 = ((((((a80 * a80) % 14999) + -5547) * 3) % 93) + 104);
    	a178 = "e";
    	a175 = (a84 - 1); 
    	output = "X";
    } 
}
private  void calculateOutputm126(String input) {
    if(((((19 < a15) && (61 >= a15)) && ((a67.equals("g")) && ((a94 == 11) && ((a178.equals("f")) && (a95 == 3))))) && (((a65.equals("g")) && (((a0.equals("g")) && ((cf && (input.equals("C"))) && ((116 < a147) && (225 >= a147)))) && 162 < a171)) && (a105.equals("g"))))) {
    	cf = false;
    	if(((388 < a146 && ((a40.equals("f")) && ((192 < a142) && (282 >= a142)))) || (a65.equals("g")))) {
    	a8 = (((((2 * 439) / 10) * 10) / 9) - -107);
    	a80 = (((a80 / 5) * 5) + -1238);
    	a141 = 9;
    	a12 = "i";
    	a84 = 15;
    	a90 = ((((98 + -3792) * -1) / 10) - -1689);
    	a96 = "g";
    	a32 = 10;
    	a128 = (((a128 + -18237) + 30390) / -5);
    	a39 = "h";
    	a155 = "e";
    	a10 = 15;
    	a193 = 3;
    	a105 = "h";
    	a4 = ((a118 * a177) + -66);
    	a21 = "i";
    	a200 = (((a200 / 5) / -5) * 5);
    	a40 = "i";
    	a34 = "g";
    	a64 = 8;
    	a199 = (((64 - 22838) - 33) * 1);
    	a169 = (((a169 - 3818) - -23026) + 3697);
    	a150 = 12;
    	a171 = (((((((a171 * a147) % 14999) % 88) + -14) / 5) + -22182) + 22288);
    	a57 = (((a57 - -3944) * 5) / 5);
    	a53 = (((a53 - 15717) * 1) + 27283);
    	a187 = 4;
    	a167 = "h";
    	a9 = 9;
    	a159 = 12;
    	a108 = ((((a108 / -5) + -23648) * 10) / 9);
    	a81 = "g";
    	a191 = (((1 * 5) + -5327) + 25781);
    	a65 = "g";
    	a95 = 5;
    	a102 = "i";
    	a153 = 7;
    	a154 = "i";
    	a15 = ((((a15 * 10) / -2) * 5) - 13822);
    	a147 = ((((((((a147 * a51) % 14999) - -11468) % 26) - -70) / 5) * 46) / 10);
    	a67 = "i";
    	a137 = (((((a137 - -25409) % 82) + 311) * 9) / 10);
    	a51 = (((((a51 % 18) - -146) / 5) / 5) - -154);
    	a156 = ((((((a156 + -26187) * -1) / 10) + -23004) * -1) / 10);
    	a140 = (((a140 * 5) * 5) + -18562);
    	a0 = "i";
    	a89 = 3;
    	a139 = 9;
    	a86 = "i";
    	a129 = 8;
    	a100 = "g";
    	a177 = 5; 
    	}else {
    	a122 = (((((((a200 * a169) % 14999) + 8377) * 1) - -6185) % 100) - -142);
    	a161 = "f";
    	a147 = ((((((a147 * a122) % 14999) + -26688) * 10) / -9) * 1);
    	a46 = (a153 - -1);
    	}output = "Y";
    } 
    if((((((a94 == 11) && (((212 < a200) && (332 >= a200)) && 162 < a171)) && ((369 < a80) && (474 >= a80))) && ((318 < a140) && (437 >= a140))) && ((a12.equals("g")) && (((a96.equals("g")) && ((input.equals("B")) && ((((116 < a147) && (225 >= a147)) && cf) && (a178.equals("f"))))) && (a84 == 10))))) {
    	cf = false;
    	a163 = ((((((a156 * a128) % 14999) % 59) - -280) + -1) - 8);
    	a147 = ((((((a147 * a80) % 14999) - -7496) * 1) / 5) * -5);
    	a59 = "e";
    	a186 = (((((((a140 * a163) % 14999) % 30) - -187) / 5) / 5) - -200); 
    	output = "S";
    } 
    if(((((a178.equals("f")) && (((191 < a108) && (387 >= a108)) && ((a96.equals("g")) && (a105.equals("g"))))) && (a94 == 11)) && (((((-68 < a57) && (-31 >= a57)) && (((116 < a147) && (225 >= a147)) && (((input.equals("A")) && cf) && 162 < a171))) && (a67.equals("g"))) && (a10 == 11)))) {
    	cf = false;
    	if(((a102.equals("h")) || (((a155.equals("f")) || 525 < a128) && (a21.equals("g"))))) {
    	a165 = ((((((a147 * a147) % 14999) % 14) + 287) - -6) + -8);
    	a178 = "i";
    	a175 = ((a84 * a129) - 52); 
    	}else {
    	a162 = (a95 - -9);
    	a182 = ((a193 / a162) - -14);
    	a59 = "g";
    	a147 = (((((a147 * a200) % 14999) - 29575) - -32553) + -18103);
    	}output = "T";
    } 
    if(((((((241 < a137) && (407 >= a137)) && (((a153 == 7) && ((a65.equals("g")) && ((198 < a168) && (330 >= a168)))) && (a94 == 11))) && (a95 == 3)) && (a178.equals("f"))) && ((a187 == 3) && (((cf && (input.equals("D"))) && ((116 < a147) && (225 >= a147))) && 162 < a171)))) {
    	cf = false;
    	a172 = (((((((a147 * a171) % 14999) - -3029) % 93) + 76) * 9) / 10);
    	a178 = "e";
    	a175 = (a89 + 6); 
    	output = "Z";
    } 
    if(((((((a0.equals("g")) && (input.equals("E"))) && 162 < a171) && (a81.equals("g"))) && (a21.equals("g"))) && (((((((a94 == 11) && cf) && (a178.equals("f"))) && (a9 == 6)) && ((145 < a51) && (182 >= a51))) && ((116 < a147) && (225 >= a147))) && (a141 == 5)))) {
    	a7 += (a7 + 20) > a7 ? 1 : 0;
    	cf = false;
    	if(a114 <=  -74) {
    	a86 = "h";
    	a80 = (((a80 * 5) + 2637) - 23236);
    	a122 = ((((((a147 * a147) % 14999) - -13641) + -9186) % 22) - -90);
    	a156 = (((((a156 % 23) + 315) + 3) - -27218) - 27237);
    	a96 = "i";
    	a168 = ((((a168 - 17023) * 10) / 9) * 1);
    	a140 = ((((a140 * 14) / 10) * 5) - -7918);
    	a21 = "g";
    	a154 = "h";
    	a29 = (a32 - -6);
    	a15 = (((a15 - -16843) - -1053) + -45255);
    	a191 = (((34 + 3236) * 5) / -5);
    	a139 = 10;
    	a137 = ((((((a137 % 82) + 313) * 5) + -18801) % 82) - -398);
    	a128 = (((a128 * -5) - -10939) - 27882);
    	a105 = "g";
    	a163 = ((((a147 * a122) + 664) / 5) + -28515);
    	a64 = 6;
    	a39 = "i";
    	a51 = (((((a51 % 18) - -155) * 5) % 18) - -156);
    	a155 = "g";
    	a90 = ((((24 - 23997) * 10) / 9) - 1840);
    	a129 = 9;
    	a78 = "e";
    	a67 = "i";
    	a65 = "i";
    	a153 = 10;
    	a95 = 5;
    	a159 = 16;
    	a169 = ((((a169 * 5) * 10) / 9) - -22360);
    	a102 = "g";
    	a150 = 13;
    	a177 = 11;
    	a12 = "f";
    	a0 = "g";
    	a32 = 13;
    	a53 = ((((a53 - -23195) * 1) + -159) * -1);
    	a167 = "e";
    	a57 = ((((a57 - -18974) - -1240) % 18) - 55);
    	a187 = 1;
    	a9 = 11;
    	a34 = "h";
    	a10 = 13;
    	a6 = "h";
    	a200 = ((((a200 + 25980) * 10) / 9) - -744);
    	a108 = (((a108 / -5) - 21894) * 1);
    	a81 = "e";
    	a199 = ((((23 - -251) + 11616) + 10396) + -22025);
    	a147 = (((((((a147 * a163) % 14999) - -13366) - 18782) + 6729) % 14887) + 15112); 
    	}else {
    	a57 = (((a57 - -5393) / 5) + 6266);
    	a140 = (((a140 - 132) * 1) - -6);
    	a191 = (((60 - 20924) + 12683) / 5);
    	a128 = (((((a128 / 5) - -372) * 5) % 72) + 411);
    	a137 = ((((a137 - -15291) + 8905) * 10) / 9);
    	a12 = "e";
    	a153 = 10;
    	a65 = "g";
    	a105 = "g";
    	a200 = (((a200 + 29087) * 1) * 1);
    	a86 = "g";
    	a80 = ((((a80 / 5) * 10) / 2) * 1);
    	a20 = "f";
    	a102 = "i";
    	a178 = "h";
    	a96 = "g";
    	a199 = ((((((13 + -24580) * -1) / 10) + -7859) * -1) / 10);
    	a32 = 13;
    	a56 = ((a95 + a64) + -4);
    	}output = "S";
    } 
}
private  void calculateOutputm127(String input) {
    if(((((318 < a140) && (437 >= a140)) && (((((-68 < a57) && (-31 >= a57)) && ((a95 == 3) && (a141 == 5))) && ((365 < a191) && (519 >= a191))) && ((116 < a147) && (225 >= a147)))) && ((a94 == 14) && ((((254 < a199) && (275 >= a199)) && (162 < a171 && (cf && (input.equals("A"))))) && (a178.equals("f")))))) {
    	cf = false;
    	a33 = "g";
    	a100 = "i";
    	a182 = ((a9 + a94) - 9);
    	a147 = (((((((a147 * a140) % 14999) + 7857) % 26) - -80) * 10) / 9); 
    	output = "Y";
    } 
    if((((((a81.equals("g")) && (((a178.equals("f")) && cf) && (a94 == 14))) && (a67.equals("g"))) && (a21.equals("g"))) && (((379 < a128) && (525 >= a128)) && (((input.equals("E")) && ((((116 < a147) && (225 >= a147)) && (a10 == 11)) && 162 < a171)) && (a95 == 3))))) {
    	cf = false;
    	if((202 < a41 && (a20.equals("i")))) {
    	a147 = ((((((a147 * a171) % 14999) + 5068) * 10) / 9) / 5);
    	a110 = "e";
    	a122 = (((((a108 * a200) % 14999) + 4075) + -2348) - -5864);
    	a44 = (((((((a171 * a147) % 14999) + 5753) + -27461) / 5) % 14) + 170); 
    	}else {
    	a51 = ((((a51 + -25404) * 1) - -49257) * -1);
    	a6 = "h";
    	a154 = "i";
    	a21 = "h";
    	a139 = 13;
    	a191 = ((((a191 - 5806) * 10) / 9) * 4);
    	a81 = "e";
    	a33 = "e";
    	a100 = "i";
    	a57 = (((((a57 + 2506) % 18) - 52) + -19540) - -19532);
    	a182 = ((a32 * a95) - 19);
    	a147 = ((((((((a147 * a171) % 14999) % 26) + 82) + 9) * 5) % 26) + 65);
    	a12 = "h";
    	a9 = 11;
    	a140 = ((((a140 / -5) + 16742) + 6321) * -1);
    	a177 = 10;
    	a96 = "g";
    	a199 = (((((a199 + -11970) % 10) - -272) + 1856) - 1856);
    	a95 = 7;
    	}output = "S";
    } 
    if(((((a187 == 3) && ((input.equals("D")) && ((((254 < a199) && (275 >= a199)) && (a177 == 7)) && (a78.equals("g"))))) && ((379 < a128) && (525 >= a128))) && ((((198 < a168) && (330 >= a168)) && ((a178.equals("f")) && ((cf && (a94 == 14)) && ((116 < a147) && (225 >= a147))))) && 162 < a171))) {
    	cf = false;
    	a34 = "e";
    	a178 = "h";
    	a20 = "e";
    	a159 = 11;
    	a56 = (a150 + -5); 
    	output = "Y";
    } 
    if(((162 < a171 && ((254 < a199) && (275 >= a199))) && ((((a129 == 6) && ((input.equals("B")) && (((((116 < a147) && (225 >= a147)) && ((a94 == 14) && ((a178.equals("f")) && cf))) && (a96.equals("g"))) && (a187 == 3)))) && (a78.equals("g"))) && (a31 == 10)))) {
    	cf = false;
    	a122 = (((((a156 * a51) % 14999) + 5771) - 31058) + -693);
    	a147 = (((((a147 * a171) % 14999) + 7693) + 2536) - -3009);
    	a152 = ((((((a122 * a51) % 14999) % 23) + 40) - -15163) + -15163);
    	a142 = (((((((a122 * a171) % 14999) / 5) - 5816) + -535) % 44) - -245); 
    	output = "Y";
    } 
    if((((a178.equals("f")) && ((a0.equals("g")) && ((162 < a171 && (((116 < a147) && (225 >= a147)) && (((a94 == 14) && cf) && (input.equals("C"))))) && (a9 == 6)))) && ((a105.equals("g")) && ((a78.equals("g")) && (((-135 < a79) && (47 >= a79)) && ((-68 < a57) && (-31 >= a57))))))) {
    	cf = false;
    	if((a143.equals("e"))) {
    	a9 = 4;
    	a0 = "h";
    	a96 = "f";
    	a200 = ((((a200 % 59) + 253) + 3000) + -2991);
    	a193 = 4;
    	a122 = (((((a51 * a156) % 14999) + -3910) + 10519) - -6959);
    	a15 = (((((6 * -127) / 10) * 10) / 9) - 24205);
    	a39 = "i";
    	a177 = 7;
    	a105 = "e";
    	a79 = (((a79 + 29206) * 1) / 5);
    	a95 = 3;
    	a90 = (((a90 - 13473) + 2499) + -17189);
    	a154 = "e";
    	a57 = (((a57 / 5) - 28530) + 28432);
    	a129 = 10;
    	a118 = 8;
    	a156 = ((((a156 * 5) % 23) + 320) - 1);
    	a168 = (((((a168 % 65) - -251) * 5) % 65) - -245);
    	a21 = "h";
    	a41 = (((((a147 * a147) % 14999) - 18331) - 8549) - 88);
    	a187 = 5;
    	a44 = (((((((a122 * a122) % 14999) - -6689) + -15369) * 3) % 14822) + 15176);
    	a51 = ((((a51 * 13) / 10) + 8315) - -1409);
    	a141 = 9;
    	a159 = 17;
    	a31 = 12;
    	a108 = ((((a108 + -7377) % 97) + 291) * 1);
    	a67 = "h";
    	a191 = (((a191 - -20890) + 1207) + 2280);
    	a199 = ((((a199 + 4077) % 10) - -255) - -10);
    	a32 = 10;
    	a140 = (((a140 / -5) / 5) - 8418);
    	a150 = 15;
    	a147 = ((((((a147 * a122) % 14999) / 5) + 9014) * 10) / 9); 
    	}else {
    	a0 = "g";
    	a199 = (((a199 + -14323) + 18819) - -15575);
    	a64 = 11;
    	a140 = (((a140 - 21615) - -43631) * 1);
    	a81 = "i";
    	a96 = "h";
    	a141 = 8;
    	a31 = 13;
    	a156 = (((((a156 % 23) + 319) / 5) * 10) / 2);
    	a32 = 12;
    	a21 = "h";
    	a40 = "e";
    	a155 = "g";
    	a78 = "g";
    	a9 = 6;
    	a8 = ((((89 + -90) + 14630) - 31313) + 16720);
    	a51 = (((a51 * 5) + -2890) + -20986);
    	a108 = (((a108 + -11853) / 5) - 17999);
    	a139 = 13;
    	a187 = 5;
    	a95 = 5;
    	a100 = "i";
    	a182 = (a118 - 2);
    	a167 = "i";
    	a90 = ((((((a90 % 68) - 81) - -15) * 5) % 68) + -62);
    	a12 = "h";
    	a191 = ((((a191 + 28018) % 76) - -398) + 20);
    	a154 = "g";
    	a200 = (((a200 / 5) - 16425) * 1);
    	a128 = ((((a128 * 10) / 7) / 5) - -10472);
    	a86 = "e";
    	a147 = (((((((a147 * a171) % 14999) - 27664) % 26) + 103) * 10) / 9);
    	a57 = ((((a57 + 10173) + -28168) + -11297) - -43126);
    	a129 = 11;
    	a114 = (((((a171 * a171) % 14999) + 13886) + 390) + 60);
    	}output = "Y";
    } 
}
private  void calculateOutputm12(String input) {
    if((((a177 == 7) && ((a84 == 10) && (a154.equals("g")))) && (((a167.equals("g")) && ((a12.equals("g")) && (162 < a171 && cf))) && ((-68 < a57) && (-31 >= a57))))) {
    	if((((a40.equals("g")) && ((a9 == 6) && (a96.equals("g")))) && (((-135 < a79) && (47 >= a79)) && (((cf && (a94 == 8)) && (a154.equals("g"))) && (a139 == 8))))) {
    		calculateOutputm125(input);
    	} 
    	if((((a6.equals("g")) && (((a154.equals("g")) && ((19 < a15) && (61 >= a15))) && (a89 == 3))) && ((((a94 == 11) && cf) && ((179 < a169) && (248 >= a169))) && ((286 < a53) && (382 >= a53))))) {
    		calculateOutputm126(input);
    	} 
    	if(((((6 < a90) && (207 >= a90)) && ((a21.equals("g")) && ((a81.equals("g")) && (a153 == 7)))) && ((a150 == 10) && ((cf && (a94 == 14)) && (a31 == 10))))) {
    		calculateOutputm127(input);
    	} 
    } 
}
private  void calculateOutputm129(String input) {
    if((((((241 < a137) && (407 >= a137)) && ((a95 == 3) && (a178.equals("g")))) && ((254 < a199) && (275 >= a199))) && ((a141 == 5) && (((a139 == 8) && ((a84 == 10) && (((116 < a147) && (225 >= a147)) && ((cf && (a110.equals("f"))) && 282 < a142)))) && (input.equals("A")))))) {
    	cf = false;
    	a193 = 6;
    	a56 = ((a141 - a84) - -13);
    	a165 = (((((((a147 * a147) % 14999) % 42) - -233) - 32) + 23564) + -23530);
    	a8 = (((14 - -6028) * 4) * 1);
    	a96 = "h";
    	a105 = "e";
    	a200 = ((((a200 - 18101) - 9649) * -1) / 10);
    	a155 = "i";
    	a53 = ((((a53 * 5) * 5) % 47) - -304);
    	a137 = ((((a137 - 11123) / 5) + 10474) + -8046);
    	a64 = 11;
    	a65 = "g";
    	a39 = "g";
    	a159 = 15;
    	a178 = "h";
    	a187 = 7;
    	a95 = 6;
    	a0 = "i";
    	a9 = 8;
    	a141 = 8; 
    	output = "T";
    } 
    if((((a65.equals("g")) && ((a78.equals("g")) && ((a96.equals("g")) && 282 < a142))) && ((((318 < a140) && (437 >= a140)) && ((a178.equals("g")) && (((116 < a147) && (225 >= a147)) && (((a110.equals("f")) && (cf && (input.equals("E")))) && (a118 == 10))))) && (a193 == 3)))) {
    	cf = false;
    	a102 = "g";
    	a152 = (((((((a53 * a156) % 14999) % 59) + -101) - 1) + -20652) - -20692);
    	a122 = ((((((a142 * a147) % 14999) + -21619) + 24076) / 5) - 17263);
    	a105 = "e";
    	a154 = "g";
    	a118 = 13;
    	a79 = ((((a79 % 90) - 43) - -1) - 2);
    	a200 = (((((a200 % 59) + 229) / 5) + -12339) - -12590);
    	a21 = "e";
    	a80 = (((a80 / -5) / 5) * 5);
    	a193 = 6;
    	a65 = "i";
    	a140 = (((a140 - -15185) + 13219) + 947);
    	a6 = "i";
    	a51 = (((15 + 4736) / -5) * 5);
    	a191 = ((((8 * 651) / 10) + 13154) - -11807);
    	a177 = 8;
    	a167 = "h";
    	a32 = 11;
    	a64 = 4;
    	a139 = 6;
    	a199 = ((((a199 / 5) - -204) + 29691) - 29687);
    	a141 = 5;
    	a90 = ((((62 * 10) / 9) + 19915) - 19855);
    	a67 = "i";
    	a137 = ((((a137 * 5) / 5) * 10) / 5);
    	a142 = (((((((a142 * a147) % 14999) - 12663) + -10241) - 3498) % 44) + 251);
    	a128 = ((((75 - -4602) + -4321) * 9) / 10);
    	a53 = (((a53 + -11660) / 5) + -16569);
    	a81 = "e";
    	a39 = "e";
    	a31 = 13;
    	a89 = 4;
    	a84 = 13;
    	a96 = "h";
    	a10 = 14;
    	a187 = 4;
    	a153 = 11;
    	a15 = (((a15 / 5) + 5194) - -20700);
    	a95 = 4;
    	a129 = 9;
    	a12 = "i";
    	a40 = "i";
    	a108 = ((((33 / 5) + -2159) - 16696) + 19151);
    	a147 = ((((a147 * a57) * 1) - -19574) * 1);
    	a57 = (((((((a57 % 18) + -47) * 9) / 10) * 5) % 18) + -49); 
    	output = "S";
    } 
    if((((a150 == 10) && (((a84 == 10) && (a187 == 3)) && ((241 < a137) && (407 >= a137)))) && (((a177 == 7) && (282 < a142 && (((116 < a147) && (225 >= a147)) && (((a110.equals("f")) && ((input.equals("C")) && cf)) && (a178.equals("g")))))) && ((369 < a80) && (474 >= a80))))) {
    	cf = false;
    	a172 = (((((a142 * a147) % 14999) + -19500) - 8479) / 5);
    	a178 = "e";
    	a133 = (a32 + -2); 
    	output = "Y";
    } 
    if(((a153 == 7) && ((input.equals("B")) && (((a81.equals("g")) && (((((((cf && 282 < a142) && (a110.equals("f"))) && (a178.equals("g"))) && ((369 < a80) && (474 >= a80))) && (a167.equals("g"))) && ((116 < a147) && (225 >= a147))) && (a105.equals("g")))) && (a96.equals("g")))))) {
    	cf = false;
    	if(((!(a87.equals("e")) && (a110.equals("i"))) && (a94 == 8))) {
    	a39 = "h";
    	a65 = "g";
    	a141 = 8;
    	a57 = ((((a57 - 531) / 5) * 5) * -5);
    	a167 = "h";
    	a193 = 8;
    	a153 = 12;
    	a102 = "i";
    	a156 = (((a156 * -5) / 5) - 5139);
    	a199 = (((a199 + 23367) - 34223) - 5065);
    	a6 = "h";
    	a68 = (a150 - 2);
    	a51 = (((10 - -137) * 5) - 563);
    	a128 = (((16 * -5) * 5) - 9032);
    	a95 = 6;
    	a182 = a118;
    	a177 = 7;
    	a147 = ((((((a147 * a142) % 14999) / 5) + 440) % 26) + 76);
    	a32 = 15;
    	a154 = "i";
    	a53 = (((a53 * -5) + 22763) + -25452);
    	a79 = (((a79 + -10764) / 5) - -1016);
    	a139 = 12;
    	a200 = (((((a200 % 59) - -221) + -27822) - 295) + 28150);
    	a96 = "g";
    	a31 = 15;
    	a155 = "e";
    	a90 = (((82 * 5) / 5) * 5);
    	a84 = 15;
    	a81 = "e";
    	a80 = (((((a80 - -13947) - 41748) * 1) * -1) / 10);
    	a168 = (((23 / 5) + 223) + -15);
    	a187 = 7;
    	a191 = (((((31 - -394) - -9721) / 5) * 2) / 10);
    	a100 = "i";
    	a15 = (((a15 / 5) + 4635) - -15958);
    	a140 = ((((a140 - -9123) - 9250) - 17229) - -17224);
    	a78 = "g";
    	a137 = ((((a137 % 82) - -302) + 9037) - 9081);
    	a129 = 8;
    	a12 = "i";
    	a118 = 14; 
    	}else {
    	a65 = "i";
    	a108 = (((60 - -5848) - 13605) - 6224);
    	a161 = "f";
    	a80 = ((((a80 / 5) - 28208) - -56318) + -27740);
    	a12 = "g";
    	a96 = "h";
    	a199 = (((a199 - 11995) / 5) - 8693);
    	a177 = 10;
    	a89 = 1;
    	a84 = 14;
    	a191 = (((((68 * 54) / 10) + 138) * 9) / 10);
    	a137 = (((((a137 % 82) - -288) * 9) / 10) * 1);
    	a141 = 9;
    	a102 = "i";
    	a187 = 3;
    	a15 = ((((a15 * 5) - -25808) * -1) / 10);
    	a156 = (((a156 - -17741) * 1) + -32453);
    	a90 = ((((78 - 6916) - -6969) * 10) / 9);
    	a140 = ((((((a140 % 59) + 329) * 10) / 9) + -2198) - -2159);
    	a139 = 9;
    	a105 = "i";
    	a57 = ((((a57 % 18) + -41) - -6127) - 6120);
    	a147 = (((((a147 * a142) % 14999) - -3228) - -6379) - -3632);
    	a154 = "e";
    	a32 = 12;
    	a64 = 10;
    	a39 = "e";
    	a118 = 10;
    	a153 = 12;
    	a193 = 4;
    	a200 = (((a200 * -5) * 5) / 5);
    	a9 = 9;
    	a10 = 15;
    	a46 = (a95 + 4);
    	a21 = "h";
    	a78 = "i";
    	a79 = ((((((a79 % 90) + -43) * 5) - 27985) % 90) + 29);
    	a31 = 15;
    	a169 = (((a169 * -5) * 5) + -18000);
    	a53 = (((a53 - 24798) - 4160) + -1201);
    	a122 = ((((((a142 * a147) % 14999) + 14695) / 5) % 100) + 200);
    	a67 = "g";
    	a95 = 5;
    	}output = "S";
    } 
    if((((((((a153 == 7) && 282 < a142) && ((116 < a147) && (225 >= a147))) && (a84 == 10)) && (a129 == 6)) && ((212 < a200) && (332 >= a200))) && ((a67.equals("g")) && (((a110.equals("f")) && ((a178.equals("g")) && (cf && (input.equals("D"))))) && ((241 < a137) && (407 >= a137)))))) {
    	cf = false;
    	a147 = (((((a147 * a199) % 14999) + 14219) - -535) - -56);
    	a110 = "g";
    	a44 = ((((((a79 * a15) % 14) - -161) * 5) % 14) - -153);
    	a122 = ((((((a44 * a147) % 14999) / 5) - 11772) * -1) / 10); 
    	output = "U";
    } 
}
private  void calculateOutputm130(String input) {
    if((((a78.equals("g")) && ((a64 == 6) && (((((-126 < a48) && (46 >= a48)) && ((input.equals("D")) && (((116 < a147) && (225 >= a147)) && ((a110.equals("g")) && cf)))) && (a21.equals("g"))) && (a178.equals("g"))))) && ((a177 == 7) && ((a155.equals("g")) && ((198 < a168) && (330 >= a168)))))) {
    	a103 += (a103 + 20) > a103 ? 3 : 0;
    	cf = false;
    	if((((a88 == 6) && (a192.equals("i"))) || ((197 < a98) && (265 >= a98)))) {
    	a40 = "h";
    	a153 = 8;
    	a89 = 8;
    	a150 = 14;
    	a92 = (((((((a48 * a48) % 12) - -139) + -412) / 5) * -25) / 10);
    	a193 = 6;
    	a140 = (((((a140 % 59) - -341) - -34) * 9) / 10);
    	a6 = "h";
    	a108 = (((a108 / 5) / 5) + -13541);
    	a128 = ((((57 + 28987) + -47027) * 1) + 18485);
    	a154 = "e";
    	a156 = (((((a156 % 23) + 309) / 5) / 5) + 287);
    	a100 = "i";
    	a21 = "g";
    	a182 = ((a159 + a129) - 5);
    	a34 = "i";
    	a53 = (((((a53 % 47) - -295) * 1) / 5) + 231);
    	a78 = "i";
    	a139 = 9;
    	a177 = 12;
    	a118 = 10;
    	a167 = "e";
    	a168 = (((((a168 % 65) + 251) + -2017) / 5) + 617);
    	a64 = 10;
    	a96 = "g";
    	a12 = "h";
    	a169 = ((((a169 * -5) * 10) / 9) * 5);
    	a10 = 13;
    	a80 = (((a80 + 20669) + 2365) + 3663);
    	a9 = 10;
    	a155 = "h";
    	a67 = "i";
    	a200 = ((((a200 * -5) * 5) + 27581) - 23259);
    	a8 = (((((a8 * 5) * 5) + 9315) % 26) - 3);
    	a147 = ((((((((a147 * a199) % 14999) - -1328) % 26) + 67) * 5) % 26) + 90);
    	a84 = 13;
    	a39 = "h";
    	a79 = ((((a79 + 26175) * 1) % 10) - 149);
    	a32 = 8;
    	a51 = ((((a51 * 13) / 10) + -27452) + 40307);
    	a159 = 17;
    	a191 = ((((a191 - 16018) * 1) % 76) + 518);
    	a199 = (((a199 * 5) * 5) - 12632); 
    	}else {
    	a147 = (((((a147 * a48) % 15031) - 14967) * 1) + -2);
    	a59 = "g";
    	a162 = (a129 + 11);
    	a72 = (((((a147 * a147) % 14999) / 5) + 7614) * 2);
    	}output = "Y";
    } 
    if(((((a78.equals("g")) && (((212 < a200) && (332 >= a200)) && (a178.equals("g")))) && (a153 == 7)) && (((a155.equals("g")) && ((a154.equals("g")) && (((116 < a147) && (225 >= a147)) && ((input.equals("A")) && (((-126 < a48) && (46 >= a48)) && (cf && (a110.equals("g")))))))) && (a84 == 10)))) {
    	a127 -= (a127 - 20) < a127 ? 2 : 0;
    	cf = false;
    	if(((a6.equals("g")) || (a161.equals("i")))) {
    	a200 = ((((((a200 * 10) / 6) + 7805) + -18814) * -1) / 10);
    	a9 = 8;
    	a96 = "h";
    	a199 = ((((a199 / 5) * 55) / 10) + 19864);
    	a193 = 5;
    	a156 = ((((a156 + -25290) % 23) - -323) * 1);
    	a100 = "g";
    	a177 = 9;
    	a40 = "g";
    	a21 = "i";
    	a39 = "g";
    	a139 = 11;
    	a171 = ((((((((a147 * a147) % 14999) % 17) - -145) + 1) * 5) % 17) + 132);
    	a191 = (((a191 + -12728) / 5) + -3366);
    	a147 = ((((((a147 * a48) % 26) + 89) * 5) % 26) - -87);
    	a179 = a84; 
    	}else {
    	a110 = "i";
    	a190 = ((((((a156 * a108) % 14999) + -24480) - -28656) % 76) - -38);
    	}output = "Y";
    } 
    if((((a84 == 10) && (((212 < a200) && (332 >= a200)) && ((191 < a108) && (387 >= a108)))) && (((46 < a8) && (229 >= a8)) && ((a153 == 7) && ((a193 == 3) && ((input.equals("B")) && (((a110.equals("g")) && (((116 < a147) && (225 >= a147)) && (cf && (a178.equals("g"))))) && ((-126 < a48) && (46 >= a48))))))))) {
    	cf = false;
    	a100 = "h";
    	a200 = ((((a200 % 59) + 236) / 5) - -255);
    	a39 = "h";
    	a51 = ((((a51 * 10) / 7) * 5) - -6236);
    	a36 = ((a193 / a193) + 14);
    	a199 = ((((a199 - 19941) - -14987) * 10) / 9);
    	a154 = "g";
    	a78 = "g";
    	a34 = "e";
    	a9 = 6;
    	a139 = 11;
    	a96 = "i";
    	a192 = "h";
    	a147 = (((((((a147 * a156) % 14999) - 5577) - 4128) * 3) % 26) - -89);
    	a168 = ((((a168 - -13878) / 5) + -25981) + 24281);
    	a118 = 8;
    	a193 = 7; 
    	output = "Y";
    } 
    if(((((a150 == 10) && (((145 < a51) && (182 >= a51)) && (((-126 < a48) && (46 >= a48)) && (a34.equals("g"))))) && ((46 < a8) && (229 >= a8))) && ((a96.equals("g")) && (((((a110.equals("g")) && (((116 < a147) && (225 >= a147)) && cf)) && ((286 < a53) && (382 >= a53))) && (input.equals("E"))) && (a178.equals("g")))))) {
    	cf = false;
    	if(((225 < a147 && (a14.equals("g"))) && 298 < a85)) {
    	a59 = "g";
    	a160 = "h";
    	a162 = ((a32 / a177) + 14);
    	a147 = (((((a147 * a156) % 14999) - 16080) - -12174) + -16767); 
    	}else {
    	a159 = 16;
    	a90 = ((((62 / 5) + 12556) * 10) / 9);
    	a10 = 10;
    	a40 = "f";
    	a147 = (((((a147 * a156) % 14999) + -20778) * 1) + -5922);
    	a191 = ((((a191 * 5) + -25196) % 76) + 478);
    	a169 = ((((a169 % 34) - -194) - -6) + 11);
    	a84 = 11;
    	a79 = (((a79 / 5) / 5) + 45);
    	a168 = (((a168 + 25866) * 1) * 1);
    	a132 = ((((((((a108 * a199) % 14999) / 5) % 53) + -24) * 5) % 53) + 2);
    	a96 = "g";
    	a167 = "f";
    	a177 = 8;
    	a57 = ((((60 - 4538) + 4430) * 10) / 9);
    	a34 = "f";
    	a95 = 2;
    	a102 = "g";
    	a118 = 10;
    	a39 = "g";
    	a141 = 4;
    	a128 = (((32 - -367) + -7491) - -7528);
    	a15 = ((((80 - 120) + -10) * 5) - -263);
    	a200 = ((((a200 * 16) / 10) + 16229) + 1696);
    	a155 = "f";
    	a64 = 11;
    	a31 = 14;
    	a21 = "f";
    	a0 = "h";
    	a29 = a32;
    	a153 = 8;
    	a140 = (((a140 - -870) * 5) - -2742);
    	a51 = (((((a51 - 27746) * -1) / 10) + -10178) - -18713);
    	a32 = 14;
    	a8 = ((((((a8 % 91) - -105) * 10) / 9) + -24716) + 24676);
    	a59 = "f";
    	a193 = 6;
    	a137 = (((((5 * 5) * 79) / 10) * 10) / 9);
    	a78 = "g";
    	a139 = 12;
    	a9 = 6;
    	a89 = 5;
    	a187 = 8;
    	a150 = 12;
    	a129 = 6;
    	a67 = "g";
    	a80 = (((a80 - 28895) + 28726) + 52);
    	a199 = (((a199 - -10950) + 17516) - 28632);
    	a81 = "h";
    	a6 = "h";
    	a12 = "g";
    	a156 = ((((((a156 * 10) / 12) * 9) / 10) - 21074) + 21079);
    	}output = "Z";
    } 
    if((((a118 == 10) && (((116 < a147) && (225 >= a147)) && ((((a6.equals("g")) && (a110.equals("g"))) && (a9 == 6)) && ((-126 < a48) && (46 >= a48))))) && ((a32 == 10) && (((286 < a53) && (382 >= a53)) && ((((input.equals("C")) && cf) && (a178.equals("g"))) && (a12.equals("g"))))))) {
    	cf = false;
    	if(((a153 == 8) || (a101 == 12))) {
    	a122 = ((((((a80 * a79) % 14999) % 100) - -226) / 5) - -246);
    	a147 = (((((a147 * a156) % 14999) - 10779) / 5) + 15036);
    	a161 = "i";
    	a121 = ((a10 * a84) + -96); 
    	}else {
    	a161 = "g";
    	a147 = ((((((a147 * a48) * 1) + 2435) * 1) % 14887) + 15112);
    	a122 = ((((((a48 * a147) % 14999) % 100) + 225) * 1) + 2);
    	a101 = (a139 + 4);
    	}output = "S";
    } 
}
private  void calculateOutputm131(String input) {
    if(((((a141 == 5) && (((input.equals("D")) && (((116 < a147) && (225 >= a147)) && ((a178.equals("g")) && cf))) && ((286 < a53) && (382 >= a53)))) && (((318 < a140) && (437 >= a140)) && ((a129 == 6) && ((((a143.equals("f")) && ((198 < a168) && (330 >= a168))) && (a110.equals("h"))) && (a102.equals("g")))))) && a170 <= -35)) {
    	a127 -= (a127 - 20) < a127 ? 3 : 0;
    	cf = false;
    	a132 = ((((((a169 * a80) % 14999) + -13712) * 2) % 53) - 1);
    	a64 = (a177 + -3);
    	a78 = "e";
    	a137 = (((((a108 * a140) % 14999) + -29579) / 5) * 5);
    	a128 = ((((((a128 * a169) % 14999) + -5394) / 5) * 5) - 11012);
    	a102 = "e";
    	a79 = (((((((a79 * a8) % 14999) % 14921) + -15077) + -3) - -25851) + -25848);
    	a29 = (a139 + 5);
    	a89 = (a177 + -6);
    	a167 = "e";
    	a147 = ((((a147 * a132) + 17143) * -1) * 1);
    	a139 = (a141 + 1);
    	a199 = (((((a199 * a108) % 14999) + -744) - 29042) + -16);
    	a140 = (((((a140 * a108) % 14999) - 24348) / 5) + -1542);
    	a12 = "e";
    	a6 = "e";
    	a81 = "e";
    	a177 = (a118 - 5);
    	a67 = "e";
    	a59 = "f";
    	a168 = (((((a168 * a137) % 14999) + -11129) / 5) + -20362); 
    	output = "Y";
    } 
    if(((((a187 == 3) && (((a143.equals("f")) && (((cf && (a110.equals("h"))) && (a178.equals("g"))) && (a40.equals("g")))) && ((-68 < a57) && (-31 >= a57)))) && (a153 == 7)) && (((((365 < a191) && (519 >= a191)) && (a65.equals("g"))) && ((116 < a147) && (225 >= a147))) && (input.equals("A"))))) {
    	cf = false;
    	if((!(a141 == 7) && ((a30.equals("i")) || (a86.equals("e"))))) {
    	a191 = (((((((a191 * a79) % 14999) / 5) * 5) * 2) % 89) - -275);
    	a79 = ((((((a79 * a137) % 14999) - -11125) % 14921) - 15077) - 2);
    	a167 = "f";
    	a78 = "f";
    	a139 = ((a177 - a187) - -3);
    	a118 = (a84 + -1);
    	a32 = ((a129 + a129) - 4);
    	a9 = ((a153 / a139) + 4);
    	a200 = (((((((a137 * a156) % 14999) % 61) + 118) * 9) / 10) - 8);
    	a128 = ((((((((a128 * a8) % 14999) % 91) - -226) * 9) / 10) / 5) + 280);
    	a65 = "e";
    	a57 = (((((a57 * a137) % 40) + -71) - -7872) - 7898);
    	a51 = (((((((a51 * a108) % 14999) % 29) + 102) * 5) % 29) + 100);
    	a153 = ((a159 / a159) + 5);
    	a86 = "e";
    	a84 = ((a139 - a31) + 10);
    	a36 = (a64 + 7);
    	a8 = ((((a57 * a15) - 14974) - -3699) * 2);
    	a155 = "f";
    	a159 = (a193 - -8);
    	a100 = "h";
    	a67 = "f";
    	a64 = (a193 + 2);
    	a10 = (a129 + 4);
    	a122 = ((((((a147 * a147) % 14999) - -1870) / 5) % 22) - -92);
    	a102 = "e";
    	a169 = ((((((((a169 * a200) % 14999) % 12) - -160) - -8) * 5) % 12) - -164);
    	a177 = (a150 + -5);
    	a108 = (((((((a108 * a140) % 14999) / 5) / 5) - 26719) % 22) + 186);
    	a89 = (a187 - 1);
    	a39 = "f";
    	a140 = ((((((a140 * a53) % 14999) - 16940) * 10) / 9) + -10780);
    	a147 = ((((((a147 * a122) % 26) - -64) + -27851) * 1) - -27866);
    	a187 = ((a141 + a193) - 7);
    	a199 = ((((((a199 * a168) % 14999) % 92) - -148) + 12270) - 12342);
    	a96 = "f";
    	a40 = "e";
    	a6 = "f";
    	a193 = (a10 - 8);
    	a34 = "f";
    	a168 = (((((((a168 * a53) % 14999) % 92) + 84) + -14281) * 2) - -28409);
    	a141 = (a129 + -2);
    	a53 = (((((((a53 * a80) % 14999) / 5) / 5) / 5) % 42) - -226);
    	a80 = ((((((a80 * a57) % 14999) / 5) % 101) - -267) + -1); 
    	}else {
    	a86 = "f";
    	a108 = ((((((a8 * a15) / 5) % 22) + 168) + -468) - -469);
    	a40 = "e";
    	a193 = (a141 - 3);
    	a57 = (((((a57 * a108) % 40) + -93) + -21142) - -21151);
    	a96 = "f";
    	a6 = "e";
    	a118 = (a89 - -5);
    	a29 = (a159 - -4);
    	a39 = "f";
    	a128 = ((((((a128 * a51) % 14999) % 91) - -214) / 5) + 276);
    	a163 = (((((a147 * a147) % 14999) - -7585) * 1) - -1350);
    	a147 = (((((a147 * a199) % 14999) - -1464) - -5917) + 92);
    	a34 = "e";
    	a64 = (a193 - -3);
    	a67 = "f";
    	a150 = ((a31 + a141) + -5);
    	a79 = (((((((a79 * a168) % 14999) / 5) + -3619) + 24010) * -1) / 10);
    	a65 = "e";
    	a122 = ((((((a147 * a147) % 14999) + 5743) - -6573) % 22) + 87);
    	a9 = (a150 + -4);
    	a102 = "f";
    	a51 = ((((((a15 * a140) % 14999) * 2) * 1) % 29) - -116);
    	a53 = ((((((a53 * a80) % 14999) % 42) - -232) / 5) * 5);
    	a153 = ((a64 / a64) - -5);
    	a191 = ((((((a191 * a168) % 14999) % 89) - -189) * 1) + -1);
    	a32 = (a141 - -3);
    	a168 = ((((((a140 * a140) % 14999) - 27073) * 1) + 41940) * -1);
    	a12 = "e";
    	a155 = "f";
    	a139 = (a187 + 3);
    	a177 = ((a141 / a187) - -5);
    	a89 = (a84 + -9);
    	a187 = ((a193 - a129) - -5);
    	a159 = ((a129 - a129) + 11);
    	a84 = (a129 - -2);
    	a129 = a141;
    	a8 = ((((((a108 * a108) % 14999) % 26) - -21) * 5) / 5);
    	a78 = "f";
    	a140 = (((((((a140 * a108) % 14999) - -13902) % 70) + 243) - 20670) + 20663);
    	a80 = (((((a108 * a15) % 101) - -268) + 1) * 1);
    	a169 = ((((((a169 * a156) % 14999) - -14187) % 12) - -167) + 1);
    	a167 = "f";
    	a199 = ((((((a199 * a137) % 14999) % 92) + 132) + 26190) + -26218);
    	a141 = 4;
    	}output = "Y";
    } 
    if(((((286 < a53) && (382 >= a53)) && (a193 == 3)) && ((a78.equals("g")) && ((a40.equals("g")) && ((((198 < a168) && (330 >= a168)) && ((((a178.equals("g")) && ((cf && ((116 < a147) && (225 >= a147))) && (input.equals("C")))) && (a110.equals("h"))) && (a143.equals("f")))) && (a86.equals("g"))))))) {
    	cf = false;
    	a57 = (((((((a191 * a90) % 14999) % 40) + -107) * 1) + 3466) - 3467);
    	a39 = "f";
    	a102 = "f";
    	a8 = (((((a8 * a90) % 26) + 19) - 29591) - -29591);
    	a9 = ((a84 * a150) - 95);
    	a65 = "f";
    	a97 = (a193 - -4);
    	a12 = "f";
    	a10 = ((a193 * a89) + 1);
    	a176 = (((((((a108 * a199) % 14999) - -10920) % 58) - -145) - -20497) + -20481);
    	a150 = (a129 + 3);
    	a80 = ((((((a90 * a137) % 14999) + 13309) % 101) - -268) + -2);
    	a100 = "f";
    	a155 = "g";
    	a177 = a129;
    	a108 = (((((a15 * a15) * 5) % 22) - -169) - 1);
    	a79 = ((((((a79 * a57) % 10) + -144) + 3744) - 19299) - -15554);
    	a187 = (a141 + -3);
    	a84 = ((a153 - a141) + 8);
    	a89 = (a118 - 7);
    	a147 = ((((((((a147 * a51) % 14999) % 26) - -75) / 5) / 5) * 219) / 10);
    	a191 = (((((((a191 * a51) % 14999) + -172) - 24188) - -11708) % 89) - -275);
    	a86 = "g";
    	a169 = ((((((a169 * a53) % 14999) % 12) - -158) - -6) + 4);
    	a153 = ((a177 - a187) + 3);
    	a167 = "f";
    	a53 = (((((((a80 * a57) % 14999) - -9882) - -6224) - 19618) % 42) - -272);
    	a199 = ((((((((a168 * a57) % 14999) % 92) - -160) - 0) * 5) % 92) + 144);
    	a140 = ((((((a140 * a90) % 14999) % 59) + 378) / 5) - -328);
    	a139 = (a159 - 5);
    	a64 = ((a10 + a32) - 14);
    	a96 = "f";
    	a129 = ((a193 * a10) - 25);
    	a6 = "f";
    	a200 = (((((a176 * a108) % 14999) - 28089) + -1660) / 5);
    	a128 = ((((((a128 * a57) % 14999) + 23024) * 1) % 72) + 438);
    	a118 = ((a31 * a141) + -36);
    	a40 = "f";
    	a51 = (((((a51 * a90) % 29) - -116) + -26031) - -26030);
    	a141 = (a150 + -4);
    	a34 = "f";
    	a67 = "f";
    	a159 = ((a32 + a10) + -7);
    	a78 = "g";
    	a168 = ((((((a168 * a57) % 14999) + 25333) / 5) % 65) - -220);
    	a193 = (a97 - 4); 
    	output = "V";
    } 
    if(((((379 < a128) && (525 >= a128)) && ((((cf && (a110.equals("h"))) && (input.equals("E"))) && (a178.equals("g"))) && ((116 < a147) && (225 >= a147)))) && (((a96.equals("g")) && ((a159 == 12) && ((a102.equals("g")) && ((a143.equals("f")) && ((46 < a8) && (229 >= a8)))))) && (a89 == 3)))) {
    	cf = false;
    	a182 = ((a141 / a177) - -11);
    	a9 = ((a89 + a118) - 8);
    	a6 = "f";
    	a193 = (a187 + -1);
    	a140 = ((((((((a79 * a169) % 14999) % 70) - -248) * 5) - 1284) % 70) - -247);
    	a147 = (((((((a147 * a51) % 14999) / 5) + -6532) - -25235) % 26) - -72);
    	a96 = "f";
    	a53 = ((((((a53 * a140) % 14999) % 42) + 227) + -8053) - -8064);
    	a191 = (((((((a191 * a128) % 14999) / 5) + -12414) / 5) % 89) - -327);
    	a57 = ((((((a57 * a191) % 40) + -80) + 19558) / 5) - 4030);
    	a139 = ((a193 * a193) - -3);
    	a33 = "e";
    	a34 = "f";
    	a159 = (a153 + 4);
    	a199 = (((((((a199 * a137) % 14999) % 92) - -100) * 10) / 9) - 37);
    	a100 = "i";
    	a51 = (((((((a53 * a15) % 29) + 116) / 5) / 5) * 291) / 10);
    	a177 = (a182 + -5); 
    	output = "V";
    } 
}
private  void calculateOutputm132(String input) {
    if(((((a143.equals("h")) && (((254 < a199) && (275 >= a199)) && ((((116 < a147) && (225 >= a147)) && (a105.equals("g"))) && (a110.equals("h"))))) && (a155.equals("g"))) && ((((286 < a53) && (382 >= a53)) && (((cf && (a178.equals("g"))) && (input.equals("C"))) && (a21.equals("g")))) && ((365 < a191) && (519 >= a191))))) {
    	cf = false;
    	a141 = (a64 + -2);
    	a182 = (a95 - -7);
    	a79 = ((((a79 * a90) + -9779) - 13230) * 1);
    	a68 = (a129 - -6);
    	a89 = (a118 - a31);
    	a177 = (a68 - 6);
    	a118 = (a182 + -2);
    	a39 = "f";
    	a147 = ((((((a147 * a156) % 14999) / 5) % 26) - -75) + 13);
    	a105 = "f";
    	a78 = "f";
    	a139 = ((a95 - a10) - -15);
    	a199 = (((((((a199 * a191) % 14999) % 92) - -142) - -21) - 26837) - -26830);
    	a51 = (((((((a51 * a80) % 14999) - 7922) + -17356) / 5) % 29) - -121);
    	a6 = "e";
    	a155 = "e";
    	a32 = (a182 - 1);
    	a53 = (((((((a53 * a168) % 14999) + 2291) % 42) + 201) + -28466) + 28502);
    	a193 = ((a64 + a64) - 9);
    	a156 = ((((((a108 * a53) % 14999) % 75) + 221) + 1) - 38);
    	a187 = (a64 + -4);
    	a102 = "f";
    	a10 = ((a182 * a182) + -90);
    	a40 = "f";
    	a191 = (((((((a128 * a168) % 14999) / 5) - -12027) * 1) % 89) + 271);
    	a80 = (((((((a128 * a15) % 14999) / 5) % 101) + 267) * 9) / 10);
    	a129 = (a150 - 5);
    	a84 = ((a182 + a177) + -7);
    	a96 = "f";
    	a81 = "f";
    	a86 = "f";
    	a150 = (a177 - -3);
    	a12 = "f";
    	a169 = ((((((a169 * a137) % 14999) % 12) - -167) + 1) - 8);
    	a168 = ((((((a8 * a8) % 14999) + -1829) + -8198) % 92) - -105);
    	a57 = (((((a57 * a51) + -10812) + -7869) % 40) - 75);
    	a100 = "i";
    	a15 = ((((((a15 * a8) - 3317) + 6270) - 14737) % 47) - 27);
    	a21 = "f";
    	a95 = (a9 + -3);
    	a67 = "f";
    	a0 = "f";
    	a8 = (((((a8 * a15) % 26) - -19) / 5) + 4);
    	a34 = "f";
    	a200 = (((((a128 * a128) % 14999) + 14662) / -5) * 5);
    	a167 = "e";
    	a128 = (((((a128 * a108) % 14999) + -17882) - -3907) - 7470); 
    	output = "Y";
    } 
    if(((((a81.equals("g")) && ((a105.equals("g")) && (((a12.equals("g")) && ((a110.equals("h")) && ((a178.equals("g")) && cf))) && ((379 < a128) && (525 >= a128))))) && (((116 < a147) && (225 >= a147)) && (((input.equals("E")) && (((286 < a53) && (382 >= a53)) && (a89 == 3))) && (a143.equals("h"))))) && a103 <= -23)) {
    	cf = false;
    	a21 = "f";
    	a80 = (((((a79 * a79) - 10988) + 12201) % 101) - -267);
    	a122 = ((((((a147 * a147) % 14999) % 100) + 205) * 5) / 5);
    	a191 = (((((((a191 * a80) % 14999) - -9162) % 89) - -217) * 9) / 10);
    	a161 = "h";
    	a139 = ((a10 + a177) - 11);
    	a120 = ((((((a147 * a122) % 14999) - -6327) % 68) + 250) + -57);
    	a57 = ((((((a79 * a169) % 14999) - 6831) % 40) + -107) + -1);
    	a177 = (a150 - 4);
    	a67 = "f";
    	a96 = "f";
    	a53 = (((((((a53 * a199) % 14999) % 42) + 209) * 10) / 9) - -5);
    	a147 = (((((a147 * a51) % 14999) - 3395) + 8180) + 9376);
    	a105 = "f";
    	a156 = ((((((((a156 * a128) % 14999) % 75) + 199) * 5) - -6461) % 75) - -162);
    	a167 = "f";
    	a128 = ((((((a128 * a57) % 14999) % 91) - -288) - -1) * 1); 
    	output = "S";
    } 
    if((((((-68 < a57) && (-31 >= a57)) && (((a0.equals("g")) && ((cf && (input.equals("A"))) && (a143.equals("h")))) && ((116 < a147) && (225 >= a147)))) && (((((a129 == 6) && ((a89 == 3) && ((46 < a8) && (229 >= a8)))) && (a178.equals("g"))) && (a110.equals("h"))) && (a10 == 11))) && a135 <= -27)) {
    	cf = false;
    	a15 = ((((((a200 * a191) % 14999) % 47) - 58) / 5) * 5);
    	a187 = (a150 - 8);
    	a102 = "f";
    	a51 = (((((((a51 * a15) % 29) - -115) + 0) * 5) % 29) - -91);
    	a57 = (((((((((a191 * a51) % 14999) % 40) + -131) * 10) / 9) / 5) * 51) / 10);
    	a95 = ((a118 - a129) + -2);
    	a168 = (((((((a168 * a137) % 14999) / 5) % 92) + 65) - 21576) + 21526);
    	a100 = "h";
    	a128 = ((((((a128 * a79) % 14999) * 2) % 91) - -288) * 1);
    	a39 = "f";
    	a199 = ((((((a199 * a57) % 14999) % 92) - -162) / 5) + 186);
    	a78 = "f";
    	a192 = "h";
    	a147 = ((((a147 % 26) - -70) - 16679) - -16691);
    	a118 = (a187 - -7);
    	a34 = "f";
    	a36 = (a89 - -12);
    	a96 = "f";
    	a139 = (a32 + -3); 
    	output = "S";
    } 
    if((((a110.equals("h")) && ((((a167.equals("g")) && ((((a178.equals("g")) && (cf && (a143.equals("h")))) && (input.equals("D"))) && (a34.equals("g")))) && ((369 < a80) && (474 >= a80))) && (a96.equals("g")))) && (((a86.equals("g")) && (a118 == 10)) && ((116 < a147) && (225 >= a147))))) {
    	a74 += (a74 + 20) > a74 ? 2 : 0;
    	cf = false;
    	a138 = ((a84 * a32) - 97);
    	a108 = ((((((a53 * a168) % 14999) + 2331) * 1) % 97) + 215);
    	a178 = "f";
    	a171 = ((((((a15 * a168) % 88) + -29) * 5) % 88) + 37); 
    	output = "S";
    } 
}
private  void calculateOutputm13(String input) {
    if((((a39.equals("g")) && (((a105.equals("g")) && (a12.equals("g"))) && (a193 == 3))) && ((a10 == 11) && (((a110.equals("f")) && cf) && ((286 < a53) && (382 >= a53)))))) {
    	if((((a67.equals("g")) && (((a154.equals("g")) && ((318 < a140) && (437 >= a140))) && ((-135 < a79) && (47 >= a79)))) && ((a64 == 6) && ((282 < a142 && cf) && ((179 < a169) && (248 >= a169)))))) {
    		calculateOutputm129(input);
    	} 
    } 
    if((((((a110.equals("g")) && cf) && (a12.equals("g"))) && (a39.equals("g"))) && ((((a153 == 7) && (a10 == 11)) && (a9 == 6)) && ((365 < a191) && (519 >= a191))))) {
    	if((((a167.equals("g")) && (((191 < a108) && (387 >= a108)) && (cf && ((-126 < a48) && (46 >= a48))))) && ((((318 < a140) && (437 >= a140)) && (((145 < a51) && (182 >= a51)) && (a34.equals("g")))) && (a40.equals("g"))))) {
    		calculateOutputm130(input);
    	} 
    } 
    if((((a177 == 7) && (((a110.equals("h")) && cf) && (a6.equals("g")))) && ((((a89 == 3) && (a39.equals("g"))) && (a155.equals("g"))) && (a118 == 10)))) {
    	if((((a34.equals("g")) && (cf && (a143.equals("f")))) && ((a40.equals("g")) && ((a39.equals("g")) && ((a9 == 6) && (((379 < a128) && (525 >= a128)) && (a86.equals("g")))))))) {
    		calculateOutputm131(input);
    	} 
    	if((((((a143.equals("h")) && cf) && (a139 == 8)) && (a34.equals("g"))) && ((a102.equals("g")) && ((a0.equals("g")) && ((a167.equals("g")) && ((254 < a199) && (275 >= a199))))))) {
    		calculateOutputm132(input);
    	} 
    } 
}
private  void calculateOutputm136(String input) {
    if(((((318 < a140) && (437 >= a140)) && ((a0.equals("g")) && (((a95 == 3) && ((a10 == 11) && ((cf && ((116 < a147) && (225 >= a147))) && (a178.equals("h"))))) && (input.equals("C"))))) && ((((a129 == 6) && (a153 == 7)) && (a56 == 4)) && (a180.equals("e"))))) {
    	cf = false;
    	a10 = ((a56 - a118) - -15);
    	a21 = "e";
    	a164 = "f";
    	a118 = (a10 - 1);
    	a40 = "e";
    	a168 = ((((((((a168 * a53) % 14999) - 19209) % 92) - -112) / 5) * 69) / 10);
    	a150 = (a32 - 1);
    	a129 = ((a31 * a32) - 76);
    	a80 = (((((((a80 * a191) % 14999) * 2) + -1) * 1) % 101) - -266);
    	a84 = a139;
    	a79 = (((((a79 * a128) % 14999) / 5) - 22912) - 448);
    	a59 = "e";
    	a153 = (a89 - -3);
    	a81 = "e";
    	a163 = ((((((a147 * a147) % 14999) - -7767) * 10) / 9) + 2979);
    	a89 = (a31 - 7);
    	a78 = "e";
    	a95 = (a32 - 8);
    	a147 = (((((a147 * a163) % 14999) + -17878) + 16399) + -24935);
    	a167 = "e";
    	a139 = (a10 - 3);
    	a12 = "f";
    	a0 = "f";
    	a32 = (a141 - -5);
    	a140 = ((((((a140 * a108) % 14999) + 14054) / 5) / 5) + -14110); 
    	output = "Y";
    } 
}
private  void calculateOutputm139(String input) {
    if((((((a34.equals("g")) && (a155.equals("g"))) && ((145 < a51) && (182 >= a51))) && (input.equals("E"))) && ((a32 == 10) && ((a180.equals("h")) && ((a167.equals("g")) && ((((cf && (a56 == 4)) && ((116 < a147) && (225 >= a147))) && (a178.equals("h"))) && (a86.equals("g")))))))) {
    	cf = false;
    	a200 = ((((52 * 10) / 2) - 30) - 14);
    	a64 = 8;
    	a156 = (((((a156 % 23) - -305) + -4) - -10515) - 10513);
    	a86 = "i";
    	a154 = "i";
    	a150 = 10;
    	a178 = "i";
    	a128 = ((((a128 * 14) / 10) - -27147) - -1225);
    	a9 = 5;
    	a165 = (((((a90 * a80) % 14999) - -12025) - 40939) - 1056);
    	a193 = 7;
    	a75 = "e";
    	a8 = (((50 - 19989) - 5370) + -2135);
    	a95 = 4;
    	a105 = "e";
    	a90 = (((((a90 + 22150) / 5) + -25748) * -1) / 10);
    	a31 = 11;
    	a78 = "g";
    	a159 = 12;
    	a0 = "g";
    	a65 = "f";
    	a21 = "e";
    	a39 = "e";
    	a155 = "g";
    	a32 = 10;
    	a10 = 12;
    	a80 = (((a80 / 5) * 5) - -2933); 
    	output = "T";
    } 
    if(((((((116 < a147) && (225 >= a147)) && (a139 == 8)) && (a178.equals("h"))) && (a56 == 4)) && (((179 < a169) && (248 >= a169)) && (((a153 == 7) && ((a154.equals("g")) && (((a180.equals("h")) && ((input.equals("A")) && cf)) && (a141 == 5)))) && (a105.equals("g")))))) {
    	cf = false;
    	a132 = ((((((a51 * a199) % 14999) - 22895) % 53) - -5) - 3);
    	a59 = "f";
    	a29 = (a153 - -8);
    	a147 = ((((a147 * a132) - 5315) + -10298) + -1525); 
    	output = "V";
    } 
    if((((((a6.equals("g")) && ((a141 == 5) && (((a56 == 4) && (cf && (input.equals("D")))) && (a180.equals("h"))))) && (a89 == 3)) && (a193 == 3)) && ((a159 == 12) && ((a178.equals("h")) && (((116 < a147) && (225 >= a147)) && (a39.equals("g"))))))) {
    	a151 -= (a151 - 20) < a151 ? 3 : 0;
    	cf = false;
    	if(229 < a8) {
    	a128 = ((((a128 * 14) / 10) * 5) - -18621);
    	a102 = "i";
    	a139 = 9;
    	a118 = 12;
    	a34 = "h";
    	a167 = "g";
    	a150 = 15;
    	a105 = "i";
    	a147 = (((((a147 * a156) % 14999) + -1046) - 22003) + -2554);
    	a108 = ((((a108 % 97) + 196) / 5) + 167);
    	a80 = (((a80 + 5323) / 5) - -15409);
    	a12 = "h";
    	a140 = (((((a140 - -5445) * 5) / 5) % 59) + 341);
    	a131 = "i";
    	a59 = "i";
    	a193 = 5;
    	a155 = "h";
    	a10 = 10;
    	a86 = "f";
    	a96 = "f";
    	a159 = 15;
    	a157 = (((((((a147 * a147) % 14999) % 14) + 347) + 25632) * 1) + -25632); 
    	}else {
    	a86 = "i";
    	a200 = (((76 - 17322) - 3717) - -21207);
    	a118 = 11;
    	a21 = "i";
    	a96 = "h";
    	a89 = 1;
    	a34 = "g";
    	a100 = "g";
    	a147 = ((((a147 % 26) - -72) + -4) * 1);
    	a154 = "h";
    	a129 = 10;
    	a150 = 14;
    	a32 = 14;
    	a128 = (((a128 / 5) / -5) * 5);
    	a167 = "e";
    	a102 = "g";
    	a15 = (((a15 - 8697) - -17786) - -17169);
    	a84 = 13;
    	a169 = (((((a169 * 14) / 10) * 5) * 10) / 9);
    	a65 = "h";
    	a90 = ((((a90 * 298) / 10) - 17365) - -32329);
    	a171 = (((((((a147 * a147) % 88) + -20) - -15) * 5) % 88) + 36);
    	a140 = ((((a140 / 5) - -280) - -16496) + -16426);
    	a108 = (((a108 - -15898) - -10476) - -1595);
    	a39 = "i";
    	a67 = "i";
    	a156 = (((a156 - -20069) + -24187) - -24058);
    	a6 = "g";
    	a80 = (((((a80 - 26203) % 52) + 465) - -3431) + -3448);
    	a159 = 17;
    	a4 = ((a139 / a177) - -6);
    	a105 = "g";
    	a57 = (((a57 - 14550) * 2) - 275);
    	a193 = 5;
    	a0 = "i";
    	a95 = 4;
    	a10 = 16;
    	a137 = ((((32 - -205) + 119) * 10) / 9);
    	a53 = ((((a53 - -23532) * 10) / 9) * 1);
    	a177 = 11;
    	a199 = (((((a199 * 10) / 9) * 10) / 9) + 12485);
    	a40 = "i";
    	a78 = "i";
    	a12 = "g";
    	a139 = 9;
    	}output = "T";
    } 
    if((((((379 < a128) && (525 >= a128)) && ((((198 < a168) && (330 >= a168)) && (a180.equals("h"))) && (a178.equals("h")))) && (a96.equals("g"))) && ((a89 == 3) && ((a153 == 7) && ((a95 == 3) && (((a56 == 4) && (cf && (input.equals("C")))) && ((116 < a147) && (225 >= a147)))))))) {
    	cf = false;
    	a141 = 6;
    	a187 = 3;
    	a147 = ((((((a147 * a156) % 14999) % 26) - -86) / 5) - -47);
    	a12 = "g";
    	a139 = 10;
    	a8 = ((((60 - -9651) + -9493) * 5) - 1013);
    	a182 = (a10 + -2);
    	a118 = 11;
    	a80 = ((((a80 + 8282) % 52) + 375) + 18);
    	a185 = "g";
    	a128 = ((((a128 * 14) / 10) * 5) + 7518);
    	a32 = 12;
    	a102 = "h";
    	a57 = ((((a57 - -29077) - -753) % 18) - 64);
    	a154 = "i";
    	a6 = "h";
    	a168 = ((((a168 * -5) * 5) + 13818) + -8993);
    	a169 = (((((a169 * 10) / 7) + -15419) * -1) / 10);
    	a79 = ((((a79 - 15624) / 5) % 10) + -142);
    	a137 = (((2 + 15874) * 1) * -1);
    	a86 = "i";
    	a90 = ((((a90 - 24951) * 1) * 10) / 9);
    	a15 = ((((a15 * 5) + -20975) * 1) - -43673);
    	a81 = "h";
    	a159 = 13;
    	a34 = "i";
    	a89 = 5;
    	a84 = 12;
    	a140 = (((a140 + 18581) * 1) + 8201);
    	a105 = "i";
    	a108 = (((a108 + -17899) + -10618) * 1);
    	a51 = (((((a51 / 5) + 26074) - 50763) * -1) / 10);
    	a96 = "i";
    	a53 = (((a53 + 2054) - 20037) + -7105);
    	a0 = "i";
    	a153 = 9;
    	a193 = 5;
    	a78 = "h";
    	a177 = 10;
    	a40 = "i";
    	a129 = 11;
    	a199 = (((a199 + 13232) - -10613) + -49740);
    	a21 = "e";
    	a67 = "i";
    	a10 = 14;
    	a200 = (((67 + 29845) * 1) * 1);
    	a95 = 4;
    	a100 = "i";
    	a150 = 14;
    	a191 = (((((a191 % 76) - -436) + 7) / 5) + 343);
    	a167 = "g";
    	a155 = "i";
    	a39 = "h";
    	a156 = (((a156 - 21099) - 4243) - 2519); 
    	output = "Y";
    } 
    if((((((191 < a108) && (387 >= a108)) && (((198 < a168) && (330 >= a168)) && (((116 < a147) && (225 >= a147)) && ((a178.equals("h")) && ((a56 == 4) && ((input.equals("B")) && cf)))))) && (a10 == 11)) && ((((a180.equals("h")) && ((365 < a191) && (519 >= a191))) && (a67.equals("g"))) && ((286 < a53) && (382 >= a53))))) {
    	a170 += (a170 + 20) > a170 ? 3 : 0;
    	cf = false;
    	if(((a96.equals("h")) && (a183.equals("g")))) {
    	a44 = ((((((a156 * a51) % 14999) + 9500) % 14) + 160) * 1);
    	a110 = "e";
    	a147 = (((((a147 * a156) % 14999) + 14311) * 1) * 1);
    	a122 = (((((a44 * a44) % 14999) - 15367) * 1) + 26268); 
    	}else {
    	a59 = "e";
    	a147 = (((((a147 * a57) - -12744) / 5) / 5) + -17414);
    	a186 = (((((a140 * a108) % 14999) - 18802) / 5) + -6721);
    	a163 = ((((((a147 * a147) % 14999) % 59) - -287) / 5) + 251);
    	}output = "V";
    } 
}
private  void calculateOutputm141(String input) {
    if(((((179 < a169) && (248 >= a169)) && (((145 < a51) && (182 >= a51)) && ((a64 == 6) && (((((116 < a147) && (225 >= a147)) && (a193 == 3)) && ((191 < a108) && (387 >= a108))) && (a20.equals("f")))))) && ((a178.equals("h")) && (((286 < a53) && (382 >= a53)) && ((cf && (a56 == 5)) && (input.equals("C"))))))) {
    	cf = false;
    	a159 = (a84 + 1);
    	a9 = (a89 - -2);
    	a168 = ((((((a168 * a199) % 14999) % 92) + 42) + 27666) - 27634);
    	a64 = (a31 + -4);
    	a36 = (a139 - -3);
    	a51 = (((((((a51 * a168) % 14999) % 29) + 112) - -19163) * 1) + -19159);
    	a187 = (a10 - 9);
    	a100 = "h";
    	a79 = (((((a79 * a200) / 5) % 10) + -145) - 2);
    	a139 = (a56 + 2);
    	a95 = (a159 - 9);
    	a15 = ((((((a15 * a57) * 3) % 47) - -13) + 12457) - 12460);
    	a147 = (((((a147 % 26) - -85) - 11) * 10) / 9);
    	a85 = (((((a147 * a147) - -5034) % 45) - -163) + 1);
    	a193 = ((a9 * a150) + -48); 
    	output = "Y";
    } 
    if((((((a78.equals("g")) && ((116 < a147) && (225 >= a147))) && (a177 == 7)) && ((179 < a169) && (248 >= a169))) && ((a154.equals("g")) && (((a89 == 3) && ((a56 == 5) && ((a20.equals("f")) && ((a178.equals("h")) && ((input.equals("E")) && cf))))) && (a139 == 8))))) {
    	cf = false;
    	a118 = a139;
    	a15 = (((((a15 * a137) * 2) % 47) + -56) / 5);
    	a64 = ((a150 / a89) - -2);
    	a34 = "f";
    	a155 = "f";
    	a129 = (a193 - -1);
    	a105 = "f";
    	a150 = a139;
    	a167 = "f";
    	a9 = (a159 - 7);
    	a187 = (a89 + -1);
    	a139 = (a56 + 2);
    	a21 = "f";
    	a32 = (a89 - -6);
    	a159 = (a64 + 6);
    	a140 = (((((((a168 * a168) % 14999) % 70) + 242) - 25655) * 1) + 25630);
    	a122 = (((((a147 * a147) % 14999) + -25127) * 1) * 1);
    	a79 = ((((((a79 * a199) % 14999) + -10229) / 5) % 10) - 144);
    	a154 = "f";
    	a84 = ((a9 / a193) - -7);
    	a102 = "f";
    	a177 = (a187 - -4);
    	a67 = "f";
    	a92 = (((((((a108 * a156) % 14999) % 28) + 181) - 27) * 10) / 9);
    	a53 = ((((((a53 * a137) % 14999) + -26750) * 1) % 42) + 270);
    	a169 = ((((((((a169 * a80) % 14999) % 12) + 155) * 5) - -25547) % 12) + 163);
    	a6 = "e";
    	a78 = "e";
    	a90 = ((((((((a168 * a200) % 14999) % 68) + -127) * 9) / 10) * 9) / 10);
    	a10 = (a89 + 6);
    	a95 = (a89 - 1);
    	a0 = "f";
    	a51 = ((((a51 * a8) - 27638) - 817) + -237);
    	a96 = "e";
    	a40 = "f";
    	a108 = ((((((((a140 * a137) % 14999) % 22) + 166) - -4) * 5) % 22) - -150);
    	a81 = "f";
    	a39 = "f";
    	a193 = (a89 + -1);
    	a141 = (a31 - 5);
    	a142 = (((((a147 * a92) % 14999) - 2344) - 26693) / 5);
    	a147 = ((((((a147 * a92) % 14999) + -26599) / 5) * 5) - -34136);
    	a156 = ((((((a168 * a80) % 14999) / 5) + 25582) % 75) + 183);
    	a168 = (((((a168 * a137) % 14999) - 17695) - -22043) - 30399);
    	a89 = (a32 + -8); 
    	output = "T";
    } 
    if((((((a78.equals("g")) && (a150 == 10)) && (a39.equals("g"))) && ((a81.equals("g")) && (((((a20.equals("f")) && ((a95 == 3) && (((input.equals("A")) && cf) && (a56 == 5)))) && ((116 < a147) && (225 >= a147))) && (a6.equals("g"))) && (a178.equals("h"))))) && a74 <= -17)) {
    	cf = false;
    	a79 = ((((((a79 * a128) % 14999) % 14921) - 15077) + -1) + -2);
    	a154 = "e";
    	a96 = "e";
    	a153 = (a32 + -3);
    	a51 = (((((a79 * a169) % 14999) + 5191) + 9722) - 17645);
    	a101 = ((a187 / a64) + 8);
    	a159 = ((a56 * a118) - 40);
    	a137 = (((((a168 * a128) % 14999) * 2) / 5) - 11544);
    	a108 = (((((a108 * a53) % 14999) - 21542) * 1) - 366);
    	a162 = (a56 - -11);
    	a139 = (a141 + 1);
    	a81 = "e";
    	a156 = ((((((a156 * a79) % 14999) / 5) + 11148) - -16630) + -49868);
    	a59 = "g";
    	a147 = (((((a147 * a168) % 14999) + 775) * -1) - 6449);
    	a21 = "e";
    	a34 = "e";
    	a67 = "e";
    	a10 = (a141 - -4);
    	a167 = "e";
    	a168 = (((((a168 * a51) % 14999) + -14996) + -1) + -1); 
    	output = "U";
    } 
}
private  void calculateOutputm145(String input) {
    if((((a154.equals("g")) && ((a10 == 11) && (((cf && (input.equals("E"))) && (a178.equals("h"))) && (a56 == 8)))) && ((a129 == 6) && ((((193 < a165) && (278 >= a165)) && (((a40.equals("g")) && ((116 < a147) && (225 >= a147))) && ((191 < a108) && (387 >= a108)))) && ((365 < a191) && (519 >= a191)))))) {
    	cf = false;
    	a128 = (((((((a108 * a140) % 14999) - -10844) % 91) + 239) * 10) / 9);
    	a40 = "f";
    	a89 = a187;
    	a15 = (((((((a156 * a156) % 14999) + -19428) % 47) - 9) - 9725) - -9737);
    	a118 = (a10 - 2);
    	a21 = "e";
    	a90 = (((((a15 * a128) % 68) - 62) - -1) / 5);
    	a199 = (((((((a199 * a191) % 14999) / 5) - 28296) - 1025) % 92) + 228);
    	a79 = (((((a79 * a90) / 5) % 10) - 146) * 1);
    	a156 = ((((((a156 * a140) % 14999) + -2369) * 2) % 75) - -221);
    	a171 = (((((((a147 * a165) % 14999) - -10598) * -1) / 10) * 10) / 9);
    	a177 = ((a139 / a56) + 5);
    	a51 = (((((a51 * a15) * 2) % 15043) - 14956) - 1);
    	a31 = (a56 - -1);
    	a167 = "f";
    	a139 = (a32 + -3);
    	a32 = (a84 - 2);
    	a100 = "g";
    	a154 = "f";
    	a169 = (((((((a140 * a200) % 14999) + 4024) + -27531) / 5) % 12) + 174);
    	a105 = "g";
    	a57 = ((((((a57 * a137) - 1741) - 5918) / 5) % 40) + -91);
    	a45 = "h";
    	a102 = "f";
    	a108 = (((((((a108 * a128) % 14999) + 12256) - 27139) * 2) % 22) - -168);
    	a147 = ((((((((a147 * a171) % 14999) % 26) - -90) * 5) * 5) % 26) - -69);
    	a129 = a9;
    	a140 = (((((a140 * a169) % 14999) + 8173) - 37518) - 417); 
    	output = "S";
    } 
    if((((((379 < a128) && (525 >= a128)) && ((a67.equals("g")) && (((input.equals("D")) && (a139 == 8)) && (a178.equals("h"))))) && ((((116 < a147) && (225 >= a147)) && (((((a56 == 8) && cf) && ((193 < a165) && (278 >= a165))) && ((179 < a169) && (248 >= a169))) && (a153 == 7))) && ((-68 < a57) && (-31 >= a57)))) && a7 <= -31)) {
    	cf = false;
    	a180 = "g";
    	a56 = (a153 + -3); 
    	output = "V";
    } 
    if((((((a153 == 7) && ((a78.equals("g")) && ((a150 == 10) && (a84 == 10)))) && (input.equals("C"))) && (a21.equals("g"))) && ((a56 == 8) && (((((193 < a165) && (278 >= a165)) && (cf && (a178.equals("h")))) && ((116 < a147) && (225 >= a147))) && ((19 < a15) && (61 >= a15)))))) {
    	cf = false;
    	a31 = ((a141 - a84) - -15);
    	a67 = "f";
    	a81 = "f";
    	a108 = (((((((a191 * a128) % 14999) - 20268) % 22) - -172) - 13045) + 13049);
    	a147 = ((((((a147 * a165) % 14999) + -8155) * 3) % 14887) + 15112);
    	a29 = ((a84 * a32) + -89);
    	a6 = "f";
    	a191 = (((((((a191 * a108) % 14999) - 28932) / 5) * 5) % 89) + 278);
    	a122 = ((((((a147 * a165) % 14999) + -10888) * 2) % 22) - -102);
    	a21 = "f";
    	a57 = ((((((((a57 * a128) % 14999) - -10523) % 40) - 108) * 5) % 40) - 70);
    	a154 = "f";
    	a41 = (((((((a156 * a122) % 14999) / 5) % 54) - -108) * 9) / 10);
    	a156 = (((((((a53 * a199) % 14999) % 75) + 146) / 5) * 55) / 10);
    	a80 = ((((((a15 * a90) + -22691) + -3038) + -2567) % 101) - -354);
    	a177 = (a89 - -3);
    	a128 = ((((((a128 * a169) % 14999) % 91) - -251) / 5) + 270); 
    	output = "S";
    } 
}
private  void calculateOutputm146(String input) {
    if((((a21.equals("g")) && ((((cf && (a56 == 10)) && (a178.equals("h"))) && (a162 == 12)) && (a102.equals("g")))) && (((a34.equals("g")) && ((((input.equals("C")) && ((191 < a108) && (387 >= a108))) && (a118 == 10)) && ((116 < a147) && (225 >= a147)))) && (a129 == 6)))) {
    	cf = false;
    	a100 = "g";
    	a4 = (a84 + -2);
    	a147 = (((((((a147 * a51) % 14999) - 12084) + -13929) - 3705) % 26) - -100);
    	a171 = (((((((a156 * a156) % 14999) + 10951) % 88) - 36) - -1235) + -1187); 
    	output = "Y";
    } 
    if((((a154.equals("g")) && (((116 < a147) && (225 >= a147)) && (((a178.equals("h")) && cf) && (a162 == 12)))) && ((((191 < a108) && (387 >= a108)) && (((((a56 == 10) && ((369 < a80) && (474 >= a80))) && (input.equals("D"))) && (a21.equals("g"))) && (a105.equals("g")))) && (a86.equals("g"))))) {
    	cf = false;
    	a161 = "g";
    	a154 = "i";
    	a105 = "g";
    	a101 = ((a187 + a141) + 3);
    	a53 = ((((a53 * 14) / 10) - -27897) + 141);
    	a34 = "h";
    	a153 = 9;
    	a64 = 6;
    	a10 = 9;
    	a122 = (((((((a199 * a199) % 14999) + -4911) / 5) / 5) % 100) + 225);
    	a89 = 1;
    	a156 = (((a156 + -4306) - -26681) * 1);
    	a108 = (((((a108 % 97) + 231) + -21714) - -35663) - 13936);
    	a86 = "g";
    	a191 = (((((a191 / 5) - -11844) + -32212) * -1) / 10);
    	a21 = "g";
    	a80 = (((a80 * -5) / 5) - 10123);
    	a147 = (((((((a147 * a122) % 14999) + 6720) * 10) / 9) * 10) / 9); 
    	output = "Y";
    } 
    if((((a89 == 3) && ((a162 == 12) && (((369 < a80) && (474 >= a80)) && (((input.equals("E")) && cf) && (a56 == 10))))) && ((a10 == 11) && (((((a64 == 6) && (a32 == 10)) && ((116 < a147) && (225 >= a147))) && (a34.equals("g"))) && (a178.equals("h")))))) {
    	cf = false;
    	a178 = "i";
    	a165 = (((((a147 * a147) % 14999) + 12585) - -2414) - 0);
    	a146 = (((((a147 * a51) % 14999) + -24443) * 1) * 1); 
    	output = "Y";
    } 
    if(((((((a178.equals("h")) && cf) && (a56 == 10)) && (a154.equals("g"))) && ((-135 < a79) && (47 >= a79))) && ((((((a81.equals("g")) && ((a105.equals("g")) && (input.equals("A")))) && (a153 == 7)) && (a177 == 7)) && (a162 == 12)) && ((116 < a147) && (225 >= a147))))) {
    	cf = false;
    	a29 = a162;
    	a59 = "f";
    	a132 = (((((((a147 * a147) % 14999) - 8349) + 14779) / 5) % 38) - 113);
    	a147 = ((((a147 * a132) + -132) + -258) - 112); 
    	output = "Y";
    } 
    if(((((241 < a137) && (407 >= a137)) && (((a187 == 3) && (a178.equals("h"))) && (a31 == 10))) && (((145 < a51) && (182 >= a51)) && ((((((-68 < a57) && (-31 >= a57)) && ((input.equals("B")) && (cf && (a56 == 10)))) && (a162 == 12)) && ((116 < a147) && (225 >= a147))) && (a129 == 6))))) {
    	cf = false;
    	a178 = "f";
    	a171 = (((((((a147 * a147) % 14999) + -20086) * 10) / 9) * 10) / 9);
    	a50 = ((a118 * a89) + -18); 
    	output = "V";
    } 
}
private  void calculateOutputm147(String input) {
    if((((a178.equals("h")) && ((a64 == 6) && (((116 < a147) && (225 >= a147)) && (((a162 == 13) && cf) && (a56 == 10))))) && (((a12.equals("g")) && (((((6 < a90) && (207 >= a90)) && (a96.equals("g"))) && (input.equals("D"))) && (a177 == 7))) && ((198 < a168) && (330 >= a168))))) {
    	cf = false;
    	a59 = "h";
    	a81 = "f";
    	a139 = ((a150 - a56) - -6);
    	a86 = "f";
    	a96 = "e";
    	a95 = (a56 + -8);
    	a156 = ((((((a200 * a15) % 14999) % 75) - -221) + -1) - 1);
    	a177 = (a129 + -1);
    	a200 = (((((((a200 * a80) % 14999) % 61) + 151) + -1) - -15830) + -15828);
    	a154 = "f";
    	a168 = (((((a168 * a191) % 14999) + -999) + -17699) * 1);
    	a193 = (a64 - 3);
    	a34 = "e";
    	a167 = "e";
    	a40 = "e";
    	a39 = "f";
    	a65 = "f";
    	a8 = (((((((a15 * a147) % 14999) % 26) - -19) - -2) + 18376) - 18377);
    	a178 = "e";
    	a90 = (((((a90 * a140) % 14999) / 5) - 16218) * 1);
    	a84 = ((a32 / a64) - -7);
    	a191 = (((((((a191 * a90) % 14999) + 4763) - -19592) / 5) % 89) - -254);
    	a79 = ((((((a79 * a90) % 14999) % 14921) + -15077) * 1) - 1);
    	a21 = "e";
    	a51 = ((((((((a199 * a168) % 14999) % 29) + 116) * 5) * 5) % 29) + 108);
    	a118 = (a139 + 2);
    	a150 = (a162 - 3);
    	a10 = (a89 + 6);
    	a137 = (((((a137 * a90) % 14999) - 726) * 1) - 13468);
    	a53 = (((((((a53 * a147) % 14999) % 42) - -235) - -6724) - 21853) + 15111);
    	a19 = "g";
    	a187 = (a32 - a129);
    	a129 = ((a84 * a32) + -60);
    	a153 = (a9 - -1);
    	a64 = (a32 + -3);
    	a147 = ((((a147 * -5) - 836) * 10) / 9); 
    	output = "S";
    } 
}
private  void calculateOutputm148(String input) {
    if((((a10 == 11) && ((a6.equals("g")) && ((input.equals("B")) && (((((116 < a147) && (225 >= a147)) && cf) && (a178.equals("h"))) && ((286 < a53) && (382 >= a53)))))) && ((((6 < a90) && (207 >= a90)) && ((a56 == 10) && ((a78.equals("g")) && ((19 < a15) && (61 >= a15))))) && (a162 == 14)))) {
    	a7 += (a7 + 20) > a7 ? 4 : 0;
    	cf = false;
    	a160 = "i";
    	a182 = ((a162 + a139) - 7);
    	a100 = "i";
    	a147 = (((((a147 % 26) + 78) / 5) + 29392) + -29320); 
    	output = "T";
    } 
    if((((((145 < a51) && (182 >= a51)) && ((a81.equals("g")) && ((a6.equals("g")) && ((a10 == 11) && (((116 < a147) && (225 >= a147)) && (a67.equals("g"))))))) && (a56 == 10)) && ((input.equals("D")) && (((46 < a8) && (229 >= a8)) && (((a178.equals("h")) && cf) && (a162 == 14)))))) {
    	cf = false;
    	a110 = "g";
    	a122 = (((((a156 * a108) % 14999) + 8553) / 5) * 5);
    	a147 = (((((a147 * a53) % 14999) / 5) - -25697) + 788);
    	a44 = (((((((a147 * a122) % 14999) % 14) - -161) + 23831) - -925) - 24758); 
    	output = "S";
    } 
    if(((((a118 == 10) && (((a67.equals("g")) && ((a102.equals("g")) && ((a32 == 10) && ((a178.equals("h")) && ((a56 == 10) && (a141 == 5)))))) && ((116 < a147) && (225 >= a147)))) && (a105.equals("g"))) && ((a162 == 14) && (cf && (input.equals("C")))))) {
    	cf = false;
    	a59 = "f";
    	a147 = (((a147 * 5) + -18638) - 4283);
    	a29 = ((a31 * a31) + -88);
    	a132 = ((((((((a147 * a147) % 14999) + 578) % 38) + -91) * 5) % 38) + -62); 
    	output = "Y";
    } 
    if((((((a12.equals("g")) && ((a86.equals("g")) && (a84 == 10))) && ((116 < a147) && (225 >= a147))) && ((254 < a199) && (275 >= a199))) && (((296 < a156) && (344 >= a156)) && ((a6.equals("g")) && (((a56 == 10) && (((a162 == 14) && cf) && (a178.equals("h")))) && (input.equals("E"))))))) {
    	cf = false;
    	a90 = (((((a90 / 5) * 5) + 2846) % 100) - -70);
    	a199 = ((((a199 + -15681) * 1) * 10) / 9);
    	a153 = 12;
    	a141 = 7;
    	a86 = "h";
    	a137 = (((a137 + -29902) * 1) + 49145);
    	a10 = 14;
    	a40 = "g";
    	a168 = (((((a168 - -5617) + 16116) * 1) % 65) - -232);
    	a139 = 7;
    	a108 = ((((a108 + 28568) % 97) - -192) * 1);
    	a21 = "f";
    	a6 = "g";
    	a89 = 3;
    	a156 = (((((a156 - 58) + 2) / 5) * 39) / 10);
    	a84 = 10;
    	a163 = ((((((a147 * a147) % 14999) - 16034) / 5) + -14065) + 34324);
    	a118 = 13;
    	a129 = 11;
    	a105 = "e";
    	a8 = (((((a8 % 91) + 55) * 10) / 9) + -9);
    	a12 = "h";
    	a164 = "f";
    	a57 = (((a57 + 6986) * 4) + -6865);
    	a167 = "h";
    	a79 = (((((a79 % 10) - 146) * 1) + 6130) + -6130);
    	a39 = "h";
    	a78 = "g";
    	a150 = 14;
    	a32 = 13;
    	a59 = "e";
    	a81 = "f";
    	a15 = (((((a15 / 5) - -34) / 5) * 29) / 10);
    	a102 = "h";
    	a200 = (((((a200 * 10) / 6) * 10) / 9) * 5);
    	a191 = ((((((a191 + 13293) % 76) - -437) / 5) * 45) / 10);
    	a51 = ((((a51 % 18) - -153) - 3) * 1);
    	a31 = 11;
    	a147 = ((((((a147 * a163) % 14999) + 1610) - -12517) - -162) + -44234); 
    	output = "Y";
    } 
    if((((a89 == 3) && ((a40.equals("g")) && (((((a178.equals("h")) && ((a56 == 10) && cf)) && ((254 < a199) && (275 >= a199))) && ((116 < a147) && (225 >= a147))) && ((296 < a156) && (344 >= a156))))) && ((a67.equals("g")) && ((input.equals("A")) && (((-68 < a57) && (-31 >= a57)) && (a162 == 14)))))) {
    	cf = false;
    	a110 = "i";
    	a178 = "g";
    	a190 = ((((((a53 * a57) % 76) + 134) + -8) * 10) / 9); 
    	output = "S";
    } 
}
private  void calculateOutputm150(String input) {
    if((((((a6.equals("g")) && ((((cf && (a162 == 17)) && (a56 == 10)) && (a178.equals("h"))) && ((116 < a147) && (225 >= a147)))) && (a78.equals("g"))) && ((369 < a80) && (474 >= a80))) && ((((a155.equals("g")) && (a167.equals("g"))) && (input.equals("C"))) && (a118 == 10)))) {
    	cf = false;
    	a200 = (((((((a200 * a53) % 14999) + 8249) % 61) + 94) / 5) - -134);
    	a31 = (a153 - -2);
    	a122 = (((((((a90 * a90) % 14999) - 5543) % 100) + 226) / 5) - -167);
    	a84 = ((a150 / a141) + 7);
    	a90 = ((((((a156 * a199) % 14999) - 5916) % 68) - 61) / 5);
    	a86 = "f";
    	a9 = (a31 + -3);
    	a32 = (a153 - -2);
    	a108 = ((((((((a108 * a90) % 14999) % 22) - -168) * 5) * 5) % 22) - -153);
    	a46 = (a64 - -1);
    	a10 = ((a32 * a129) - 44);
    	a137 = (((((((a137 * a156) % 14999) + 3065) * 1) - -4885) % 41) + 199);
    	a128 = ((((((a156 * a156) % 14999) / 5) % 72) - -391) - -23);
    	a79 = ((((((a79 * a156) % 14999) % 10) - 144) + -2) + -1);
    	a78 = "f";
    	a80 = (((((((a80 * a156) % 14999) % 101) - -166) + -3140) - -17647) + -14412);
    	a96 = "f";
    	a53 = (((((((a53 * a156) % 14999) - 10698) - -14203) - -10015) % 42) - -202);
    	a0 = "f";
    	a21 = "f";
    	a39 = "f";
    	a177 = ((a162 / a84) - -5);
    	a147 = (((((a147 * a156) % 14999) + 11847) / 5) / 5);
    	a139 = (a89 + 4);
    	a118 = (a56 - 1);
    	a141 = (a162 + -13);
    	a89 = (a56 - 8);
    	a161 = "f";
    	a193 = ((a31 * a159) + -97);
    	a191 = (((((((a191 * a57) % 14999) % 89) - -276) - 1) / 5) + 164);
    	a64 = (a84 + -4);
    	a153 = (a84 - 3);
    	a156 = (((((a156 * a8) * 1) % 75) + 221) + 1); 
    	output = "S";
    } 
    if((((a39.equals("g")) && (((369 < a80) && (474 >= a80)) && ((((a0.equals("g")) && ((-135 < a79) && (47 >= a79))) && (a153 == 7)) && (a56 == 10)))) && (((a178.equals("h")) && (((((116 < a147) && (225 >= a147)) && cf) && (a162 == 17)) && (a141 == 5))) && (input.equals("E"))))) {
    	cf = false;
    	a59 = "h";
    	a139 = (a89 - -3);
    	a40 = "e";
    	a79 = (((((a79 * a156) % 14999) / 5) + -9662) / 5);
    	a39 = "e";
    	a147 = ((((((a147 * a200) % 14999) + -25578) * 1) * 10) / 9);
    	a78 = "e";
    	a167 = "e";
    	a178 = "e";
    	a137 = (((((a137 * a191) % 14999) + -26676) * 1) + -3095);
    	a156 = ((((((a156 * a140) % 14999) + 9975) - 9083) * 1) + -15856);
    	a129 = ((a84 - a141) - 1);
    	a10 = ((a129 * a32) - 23);
    	a19 = "h";
    	a118 = a31; 
    	output = "S";
    } 
}
private  void calculateOutputm151(String input) {
    if(((((((a56 == 11) && cf) && ((116 < a147) && (225 >= a147))) && ((191 < a108) && (387 >= a108))) && a60 <=  6) && ((input.equals("C")) && (((a178.equals("h")) && (((145 < a51) && (182 >= a51)) && ((a95 == 3) && ((a187 == 3) && (a31 == 10))))) && ((-135 < a79) && (47 >= a79)))))) {
    	cf = false;
    	a90 = (((((((a60 * a191) % 14999) % 68) + -61) + -2) - 26778) - -26778);
    	a178 = "g";
    	a200 = (((((a53 * a140) % 14999) - 27722) - 1783) / 5);
    	a32 = (a64 - -3);
    	a156 = ((((((a60 * a147) % 14999) % 75) + 219) * 1) - 0);
    	a154 = "f";
    	a86 = "g";
    	a21 = "f";
    	a137 = (((((((a147 * a147) % 14999) % 41) + 171) - 4) - 9604) + 9636);
    	a110 = "h";
    	a12 = "f";
    	a81 = "f";
    	a95 = (a141 - 3);
    	a0 = "f";
    	a15 = ((((((a128 * a108) % 14999) + 101) * 1) % 47) + -29);
    	a143 = "f";
    	a105 = "f";
    	a10 = (a159 + -3);
    	a31 = ((a150 + a150) + -11); 
    	output = "X";
    } 
    if((((((369 < a80) && (474 >= a80)) && (((a193 == 3) && (a6.equals("g"))) && (a10 == 11))) && ((((a56 == 11) && ((a105.equals("g")) && ((a65.equals("g")) && (((a178.equals("h")) && cf) && (input.equals("B")))))) && a60 <=  6) && ((116 < a147) && (225 >= a147)))) && a151 >= 14)) {
    	cf = false;
    	a178 = "f";
    	a171 = (((((a60 * a60) % 14999) / 5) / 5) + -20483);
    	a50 = (a9 - -5); 
    	output = "V";
    } 
    if(((((a0.equals("g")) && (((((365 < a191) && (519 >= a191)) && (input.equals("E"))) && (a187 == 3)) && (a159 == 12))) && (a177 == 7)) && (((198 < a168) && (330 >= a168)) && (((116 < a147) && (225 >= a147)) && (a60 <=  6 && (((a56 == 11) && cf) && (a178.equals("h")))))))) {
    	cf = false;
    	a187 = (a10 - 9);
    	a137 = ((((((a169 * a168) % 14999) % 41) - -158) * 5) / 5);
    	a8 = (((((((a169 * a108) % 14999) - -7231) + -918) * 1) * -1) / 10);
    	a200 = ((((((a147 * a169) % 14999) % 61) - -125) - -12242) - 12243);
    	a155 = "f";
    	a56 = (a31 - 2);
    	a159 = (a153 - -4);
    	a39 = "f";
    	a96 = "f";
    	a53 = ((((((a156 * a60) % 14999) / 5) % 42) - -244) + 1);
    	a105 = "f";
    	a141 = ((a177 * a118) + -66);
    	a64 = (a32 + -5);
    	a9 = (a153 + -2);
    	a65 = "f";
    	a0 = "f";
    	a165 = (((((((a60 * a60) % 14999) - 7369) * 1) / 5) % 42) + 235);
    	a193 = (a139 + -7);
    	a95 = (a150 - 8); 
    	output = "X";
    } 
    if((((input.equals("D")) && (((-135 < a79) && (47 >= a79)) && ((a150 == 10) && (a67.equals("g"))))) && (((a139 == 8) && ((((a96.equals("g")) && ((a178.equals("h")) && (cf && (a56 == 11)))) && ((116 < a147) && (225 >= a147))) && a60 <=  6)) && (a102.equals("g"))))) {
    	cf = false;
    	a178 = "e";
    	a172 = (((((a147 * a57) / 5) % 67) + 291) + 17);
    	a145 = ((((((a172 * a60) % 14999) * 2) - 1) % 15053) + -14946); 
    	output = "U";
    } 
}
private  void calculateOutputm152(String input) {
    if(((((179 < a169) && (248 >= a169)) && (((a177 == 7) && ((input.equals("E")) && ((cf && (a178.equals("h"))) && (a56 == 11)))) && ((116 < a147) && (225 >= a147)))) && (206 < a60 && ((a84 == 10) && ((a118 == 10) && ((a96.equals("g")) && (a139 == 8))))))) {
    	cf = false;
    	a171 = (((((((a60 * a60) % 14999) % 17) - -128) / 5) + 19501) + -19378);
    	a86 = "f";
    	a21 = "f";
    	a147 = ((((((a147 * a60) % 14999) - -718) - 11842) % 26) + 89);
    	a100 = "g";
    	a179 = (a139 - -2);
    	a139 = (a193 - -4);
    	a89 = (a141 + -2);
    	a177 = a9;
    	a15 = (((((a15 * a8) % 47) - 31) / 5) - 54);
    	a105 = "f";
    	a193 = (a118 - 8);
    	a40 = "f";
    	a96 = "f";
    	a9 = ((a141 * a159) - 43);
    	a156 = (((((((a156 * a200) % 14999) % 75) - -219) + -71) * 10) / 9); 
    	output = "Y";
    } 
    if((((((206 < a60 && (((19 < a15) && (61 >= a15)) && (a193 == 3))) && (a154.equals("g"))) && (a86.equals("g"))) && ((a95 == 3) && (((((116 < a147) && (225 >= a147)) && (((a56 == 11) && cf) && (a178.equals("h")))) && (input.equals("B"))) && ((318 < a140) && (437 >= a140))))) && a127 >= 4)) {
    	cf = false;
    	a88 = (a159 - -1);
    	a56 = ((a139 * a64) + -41); 
    	output = "S";
    } 
    if((((((46 < a8) && (229 >= a8)) && ((a6.equals("g")) && 206 < a60)) && (a129 == 6)) && (((a40.equals("g")) && ((a178.equals("h")) && (((296 < a156) && (344 >= a156)) && (((a56 == 11) && (cf && (input.equals("C")))) && ((116 < a147) && (225 >= a147)))))) && ((145 < a51) && (182 >= a51))))) {
    	cf = false;
    	a64 = (a9 + -1);
    	a86 = "f";
    	a96 = "f";
    	a0 = "f";
    	a46 = ((a187 + a129) - -2);
    	a67 = "f";
    	a21 = "f";
    	a81 = "f";
    	a129 = a64;
    	a167 = "f";
    	a161 = "f";
    	a6 = "f";
    	a53 = ((((((a140 * a140) % 14999) % 42) - -224) - -27913) + -27929);
    	a105 = "f";
    	a8 = ((((((((a8 * a199) % 14999) / 5) % 26) + -4) * 5) % 26) + 20);
    	a89 = (a193 - 1);
    	a128 = (((((((a200 * a53) % 14999) - 19648) / 5) * 5) % 91) + 322);
    	a122 = (((((((a60 * a108) % 14999) - -5928) % 100) + 176) + 8357) - 8337);
    	a118 = ((a150 - a84) + 9);
    	a84 = (a177 - -2);
    	a147 = ((((((a147 * a122) % 14999) - -4278) - 223) - 25420) + 22123);
    	a156 = (((((((a156 * a51) % 14999) + 13819) % 75) + 166) / 5) + 119);
    	a168 = ((((((a140 * a169) % 14999) % 92) - -17) * 5) / 5);
    	a141 = ((a64 - a9) + 6);
    	a15 = (((((a15 * a128) * 1) % 47) + -43) / 5);
    	a78 = "f";
    	a80 = (((((((a80 * a108) % 14999) - 26506) / 5) - 12792) % 101) + 322);
    	a153 = ((a46 / a187) - -3);
    	a108 = (((((((a108 * a137) % 14999) - 2559) * 2) - 18687) % 22) + 168);
    	a187 = (a56 + -9);
    	a137 = (((((((a137 * a79) % 14999) - -11679) - -1362) - -1842) % 41) + 199);
    	a154 = "f";
    	a177 = ((a56 - a159) - -7);
    	a159 = ((a9 * a139) - 37);
    	a102 = "f";
    	a32 = (a64 + 4); 
    	output = "Y";
    } 
    if(((((((145 < a51) && (182 >= a51)) && ((((a6.equals("g")) && ((cf && (a178.equals("h"))) && (a56 == 11))) && (a102.equals("g"))) && ((241 < a137) && (407 >= a137)))) && ((116 < a147) && (225 >= a147))) && (input.equals("A"))) && ((a153 == 7) && (206 < a60 && (a154.equals("g")))))) {
    	cf = false;
    	a90 = (((((a156 * a80) % 14999) - 17165) * 1) * 1);
    	a141 = ((a139 + a150) + -13);
    	a39 = "g";
    	a20 = "f";
    	a153 = (a89 - -3);
    	a86 = "f";
    	a56 = (a177 + -2);
    	a137 = (((((a137 * a15) - -2659) % 41) - -190) - 28);
    	a105 = "e";
    	a96 = "f";
    	a128 = ((((((a8 * a108) % 14999) + 12129) / 5) + 18474) - 28105);
    	a8 = (((((((a8 * a51) % 14999) % 26) + -3) / 5) + -1292) - -1309);
    	a65 = "e";
    	a102 = "e";
    	a140 = (((((a140 * a53) % 14999) / 5) / 5) - 20941);
    	a80 = ((((((a80 * a51) % 14999) % 101) + 190) + -29750) - -29809); 
    	output = "T";
    } 
}
private  void calculateOutputm14(String input) {
    if(((((((179 < a169) && (248 >= a169)) && (((369 < a80) && (474 >= a80)) && ((a78.equals("g")) && (a118 == 10)))) && ((198 < a168) && (330 >= a168))) && (a32 == 10)) && ((a56 == 4) && cf))) {
    	if((((a95 == 3) && ((((a12.equals("g")) && ((a180.equals("e")) && cf)) && (a153 == 7)) && ((286 < a53) && (382 >= a53)))) && ((a84 == 10) && (a150 == 10)))) {
    		calculateOutputm136(input);
    	} 
    	if(((((((a180.equals("h")) && cf) && (a155.equals("g"))) && ((19 < a15) && (61 >= a15))) && (a39.equals("g"))) && ((((198 < a168) && (330 >= a168)) && (a12.equals("g"))) && (a102.equals("g"))))) {
    		calculateOutputm139(input);
    	} 
    } 
    if(((a159 == 12) && ((a9 == 6) && (((a39.equals("g")) && (((a154.equals("g")) && (cf && (a56 == 5))) && (a84 == 10))) && (a141 == 5))))) {
    	if((((a155.equals("g")) && ((a159 == 12) && ((a67.equals("g")) && ((19 < a15) && (61 >= a15))))) && ((a39.equals("g")) && (((-135 < a79) && (47 >= a79)) && ((a20.equals("f")) && cf))))) {
    		calculateOutputm141(input);
    	} 
    } 
    if(((((((145 < a51) && (182 >= a51)) && (((a56 == 8) && cf) && (a84 == 10))) && ((254 < a199) && (275 >= a199))) && ((6 < a90) && (207 >= a90))) && ((a31 == 10) && ((-135 < a79) && (47 >= a79))))) {
    	if((((a102.equals("g")) && ((a31 == 10) && ((a177 == 7) && ((318 < a140) && (437 >= a140))))) && (((cf && ((193 < a165) && (278 >= a165))) && ((-68 < a57) && (-31 >= a57))) && (a6.equals("g"))))) {
    		calculateOutputm145(input);
    	} 
    } 
    if(((((241 < a137) && (407 >= a137)) && ((a139 == 8) && (a129 == 6))) && ((((cf && (a56 == 10)) && ((365 < a191) && (519 >= a191))) && ((212 < a200) && (332 >= a200))) && ((286 < a53) && (382 >= a53))))) {
    	if(((((a177 == 7) && ((a162 == 12) && cf)) && ((286 < a53) && (382 >= a53))) && ((((a153 == 7) && (a167.equals("g"))) && (a89 == 3)) && (a21.equals("g"))))) {
    		calculateOutputm146(input);
    	} 
    	if((((a6.equals("g")) && (a155.equals("g"))) && (((a153 == 7) && (((cf && (a162 == 13)) && (a12.equals("g"))) && (a10 == 11))) && (a67.equals("g"))))) {
    		calculateOutputm147(input);
    	} 
    	if(((((a39.equals("g")) && (((-68 < a57) && (-31 >= a57)) && (((198 < a168) && (330 >= a168)) && (a153 == 7)))) && (a32 == 10)) && (((19 < a15) && (61 >= a15)) && (cf && (a162 == 14))))) {
    		calculateOutputm148(input);
    	} 
    	if((((a40.equals("g")) && ((((365 < a191) && (519 >= a191)) && ((191 < a108) && (387 >= a108))) && (a39.equals("g")))) && (((a86.equals("g")) && (cf && (a162 == 17))) && ((369 < a80) && (474 >= a80))))) {
    		calculateOutputm150(input);
    	} 
    } 
    if(((a78.equals("g")) && ((a21.equals("g")) && (((369 < a80) && (474 >= a80)) && ((a154.equals("g")) && ((a89 == 3) && (((a56 == 11) && cf) && (a129 == 6)))))))) {
    	if((((a167.equals("g")) && (a139 == 8)) && ((a187 == 3) && ((((379 < a128) && (525 >= a128)) && ((cf && a60 <=  6) && ((191 < a108) && (387 >= a108)))) && ((198 < a168) && (330 >= a168)))))) {
    		calculateOutputm151(input);
    	} 
    	if((((((a40.equals("g")) && ((a0.equals("g")) && (cf && 206 < a60))) && ((191 < a108) && (387 >= a108))) && (a67.equals("g"))) && ((a9 == 6) && ((318 < a140) && (437 >= a140))))) {
    		calculateOutputm152(input);
    	} 
    } 
}
private  void calculateOutputm153(String input) {
    if(((((116 < a147) && (225 >= a147)) && (((a75.equals("e")) && ((input.equals("A")) && cf)) && (a81.equals("g")))) && ((a139 == 8) && ((a9 == 6) && ((((318 < a140) && (437 >= a140)) && (((a102.equals("g")) && (a178.equals("i"))) && (a64 == 6))) && a165 <=  193))))) {
    	a127 += (a127 + 20) > a127 ? 1 : 0;
    	a47 += (a47 + 20) > a47 ? 1 : 0;
    	cf = false;
    	a96 = "e";
    	a141 = ((a31 * a31) - 61);
    	a84 = a31;
    	a177 = (a84 + -3);
    	a163 = (((((((a165 * a165) % 14999) * 2) + 0) - -3) % 14825) + 15173);
    	a89 = ((a141 * a10) + -26);
    	a200 = ((((((a79 * a128) % 14999) / 5) / 5) / 5) + -11228);
    	a9 = a129;
    	a59 = "e";
    	a167 = "e";
    	a147 = (((((a147 * a57) / 5) - 1513) + 20148) * -1);
    	a153 = ((a84 - a89) + -1);
    	a102 = "e";
    	a159 = (a118 - -2);
    	a51 = (((((((a51 * a168) % 14999) + -29624) % 29) + 119) - 20318) - -20324);
    	a12 = "f";
    	a187 = (a139 + -7);
    	a64 = (a118 - 5);
    	a118 = (a141 - -5);
    	a8 = ((((((a8 * a15) % 26) - 2) - -3) * 9) / 10);
    	a168 = (((((((a200 * a128) % 14999) % 92) - -106) * 1) / 5) + 140);
    	a154 = "g";
    	a108 = ((((((a108 * a199) % 14999) + -19639) * 10) / 9) - 4643);
    	a15 = (((((((a15 * a191) % 14999) % 47) - 68) * 5) % 47) - 11);
    	a191 = (((((a191 * a79) % 14999) - 14854) + -32) + -59);
    	a139 = (a141 - -3);
    	a140 = ((((((a140 * a156) % 14999) * 2) - 1) % 15088) - 14911);
    	a81 = "e";
    	a57 = (((((((a57 * a79) % 40) + -108) / 5) - -157) * -9) / 10);
    	a65 = "f";
    	a199 = (((((((a169 * a128) % 14999) % 92) - -162) - 1) + 1400) - 1400);
    	a40 = "e";
    	a21 = "e";
    	a164 = "f";
    	a6 = "f";
    	a39 = "e";
    	a79 = ((((((a79 * a137) % 14999) + 2400) % 14921) + -15077) - 3); 
    	output = "Y";
    } 
    if(((((((179 < a169) && (248 >= a169)) && ((a75.equals("e")) && ((((116 < a147) && (225 >= a147)) && ((a178.equals("i")) && cf)) && (a9 == 6)))) && (a177 == 7)) && (a65.equals("g"))) && ((a165 <=  193 && (((198 < a168) && (330 >= a168)) && ((145 < a51) && (182 >= a51)))) && (input.equals("D"))))) {
    	cf = false;
    	a177 = (a153 - 1);
    	a171 = ((((((((a147 * a199) % 14999) % 17) + 130) * 5) - -22656) % 17) - -128);
    	a147 = ((((((a147 * a171) % 14999) % 26) - -82) + -14121) - -14114);
    	a139 = (a159 - 4);
    	a191 = ((((((a191 * a15) % 14999) - -13552) % 89) - -271) - 41);
    	a108 = ((((((a108 * a57) / 5) % 22) + 182) / 5) - -127);
    	a199 = (((((((a140 * a79) % 14999) + 10885) * 1) - 13329) % 92) + 161);
    	a96 = "f";
    	a179 = (a187 + 8);
    	a9 = (a84 + -5);
    	a141 = (a118 - 6);
    	a57 = ((((((a57 * a51) % 40) - 70) * 5) % 40) - 105);
    	a100 = "g";
    	a40 = "f";
    	a15 = (((((a15 * a169) + -27997) % 47) + -9) + 25);
    	a89 = ((a118 / a84) - -1);
    	a64 = ((a84 - a153) + 2); 
    	output = "U";
    } 
}
private  void calculateOutputm155(String input) {
    if((((((a154.equals("g")) && ((((input.equals("B")) && cf) && (a178.equals("i"))) && (a6.equals("g")))) && ((318 < a140) && (437 >= a140))) && a132 <=  -131) && ((((116 < a147) && (225 >= a147)) && ((a32 == 10) && ((a177 == 7) && ((198 < a168) && (330 >= a168))))) && ((193 < a165) && (278 >= a165))))) {
    	cf = false;
    	a178 = "h";
    	a20 = "e";
    	a56 = ((a187 + a153) + -5); 
    	output = "S";
    } 
    if(((((input.equals("C")) && ((a193 == 3) && ((a81.equals("g")) && (((a178.equals("i")) && cf) && a132 <=  -131)))) && (((((a155.equals("g")) && ((a139 == 8) && ((116 < a147) && (225 >= a147)))) && (a67.equals("g"))) && ((6 < a90) && (207 >= a90))) && ((193 < a165) && (278 >= a165)))) && a47 >= 12)) {
    	cf = false;
    	a96 = "f";
    	a154 = "f";
    	a150 = (a84 - 1);
    	a10 = (a95 + 7);
    	a153 = (a10 - 4);
    	a139 = (a187 + 4);
    	a90 = (((((((a90 * a53) % 14999) - 7188) + -6386) + 26181) % 68) + -123);
    	a199 = ((((((((a199 * a137) % 14999) % 92) + 159) * 5) + 18852) % 92) - -149);
    	a100 = "f";
    	a167 = "f";
    	a177 = ((a89 - a153) + 9);
    	a168 = ((((((a168 * a15) + 6329) % 92) - -59) - -28536) - 28580);
    	a9 = ((a193 - a153) + 8);
    	a176 = ((((((a132 * a132) % 14999) - -14523) * 1) * 1) + -31863);
    	a57 = ((((((a57 * a8) % 40) - 105) + -22361) + -3638) + 26000);
    	a147 = ((((((a147 * a165) % 14999) % 26) + 85) + 25578) + -25588);
    	a118 = (a139 + 2);
    	a28 = "g";
    	a32 = (a89 + 6);
    	a15 = (((((((a15 * a51) % 47) + -69) + 21) * 5) % 47) - -19);
    	a89 = ((a9 / a177) - -2); 
    	output = "U";
    } 
    if(((((((a178.equals("i")) && cf) && ((193 < a165) && (278 >= a165))) && ((241 < a137) && (407 >= a137))) && (a12.equals("g"))) && ((a153 == 7) && ((a32 == 10) && (((19 < a15) && (61 >= a15)) && (((a132 <=  -131 && ((6 < a90) && (207 >= a90))) && (input.equals("A"))) && ((116 < a147) && (225 >= a147)))))))) {
    	a74 -= (a74 - 20) < a74 ? 2 : 0;
    	cf = false;
    	a53 = (((((((a53 * a8) % 14999) / 5) - 17857) - -4063) % 42) + 285);
    	a21 = "f";
    	a29 = ((a187 / a95) - -10);
    	a102 = "f";
    	a96 = "f";
    	a155 = "e";
    	a191 = (((((((a53 * a128) % 14999) % 89) + 252) * 9) / 10) - -29);
    	a154 = "f";
    	a177 = (a32 + -4);
    	a150 = (a84 - 1);
    	a86 = "f";
    	a31 = ((a118 * a153) - 61);
    	a137 = ((((((a137 * a80) % 14999) / 5) - -15190) % 41) - -165);
    	a9 = (a177 + -1);
    	a187 = (a193 + -1);
    	a67 = "f";
    	a147 = ((((((a147 * a200) % 14999) - 24882) * 1) * 10) / -9);
    	a81 = "f";
    	a79 = (((((((a90 * a15) + 15075) % 10) - 149) * 5) % 10) - 140);
    	a167 = "g";
    	a51 = (((((((a51 * a147) % 14999) / 5) + 17730) * 1) % 18) + 146);
    	a40 = "f";
    	a10 = ((a187 - a29) - -18);
    	a122 = (((((((a132 * a132) % 14999) - -10653) / 5) / 5) % 22) - -82);
    	a39 = "f";
    	a12 = "g";
    	a139 = ((a31 * a118) - 83);
    	a78 = "e";
    	a65 = "g";
    	a199 = ((((((a199 * a165) % 14999) % 92) - -121) / 5) * 5);
    	a159 = (a32 - -1);
    	a193 = (a29 + -10);
    	a169 = (((((((a53 * a53) % 14999) + -17703) % 34) + 225) + -29255) + 29260);
    	a89 = ((a95 / a153) - -2);
    	a57 = (((((((a57 * a108) % 40) - 95) * 10) / 9) * 9) / 10);
    	a15 = ((((((a156 * a79) % 14999) - 12267) * 1) % 47) + -29);
    	a6 = "f";
    	a108 = (((((((a108 * a79) % 14999) % 22) + 168) + 1) / 5) - -143);
    	a200 = ((((((a137 * a168) % 14999) % 61) - -123) + -10) + 6);
    	a90 = (((((((a156 * a191) % 14999) % 68) + -68) / 5) - -5609) - 5667);
    	a64 = (a153 - 1);
    	a41 = (((((a165 * a165) % 14999) + 2580) - -3352) + 2271);
    	a34 = "g";
    	a84 = (a153 - -3);
    	a141 = (a150 + -5);
    	a8 = (((((((a8 * a140) % 14999) + 4959) % 91) + 56) * 9) / 10);
    	a140 = ((((((a140 * a165) % 14999) % 59) - -363) - 15401) - -15397);
    	a95 = ((a187 / a177) - -2);
    	a118 = (a153 + 2);
    	a168 = (((((((a128 * a128) % 14999) % 65) + 211) * 10) / 9) - -5);
    	a32 = ((a31 + a31) + -9);
    	a153 = (a177 + 1); 
    	output = "X";
    } 
}
private  void calculateOutputm15(String input) {
    if(((((((318 < a140) && (437 >= a140)) && ((a153 == 7) && (cf && a165 <=  193))) && ((-68 < a57) && (-31 >= a57))) && (a81.equals("g"))) && ((a96.equals("g")) && ((19 < a15) && (61 >= a15))))) {
    	if((((a9 == 6) && (((((a12.equals("g")) && ((46 < a8) && (229 >= a8))) && ((365 < a191) && (519 >= a191))) && ((145 < a51) && (182 >= a51))) && (a6.equals("g")))) && (cf && (a75.equals("e"))))) {
    		calculateOutputm153(input);
    	} 
    } 
    if(((((a9 == 6) && ((46 < a8) && (229 >= a8))) && ((-68 < a57) && (-31 >= a57))) && (((254 < a199) && (275 >= a199)) && ((a6.equals("g")) && ((cf && ((193 < a165) && (278 >= a165))) && (a167.equals("g"))))))) {
    	if((((a102.equals("g")) && (a31 == 10)) && (((a21.equals("g")) && (((145 < a51) && (182 >= a51)) && ((cf && a132 <=  -131) && (a86.equals("g"))))) && ((286 < a53) && (382 >= a53))))) {
    		calculateOutputm155(input);
    	} 
    } 
}
private  void calculateOutputm160(String input) {
    if((((a40.equals("f")) && ((((a32 == 9) && ((153 < a92) && (211 >= a92))) && (a187 == 2)) && a122 <=  79)) && (((68 < a199) && (254 >= a199)) && ((a81.equals("f")) && (((-131 < a90) && (6 >= a90)) && ((225 < a147 && ((input.equals("E")) && cf)) && a142 <=  170)))))) {
    	cf = false;
    	a51 = ((((((a200 * a191) % 14999) % 29) - -105) + 3327) - 3324);
    	a84 = (a139 - -2);
    	a89 = (a177 + -3);
    	a98 = ((((((a199 * a140) % 14999) % 33) - -232) - 15216) + 15202);
    	a79 = (((((a79 * a51) - 1197) % 90) - -21) / 5);
    	a80 = (((((a80 * a92) % 14999) + 927) / 5) + -22452);
    	a108 = (((((a108 * a140) % 14999) / 5) - -6595) - 30649);
    	a39 = "g";
    	a100 = "f";
    	a147 = (((((((a147 * a200) % 14999) % 26) - -84) + 1) * 9) / 10);
    	a141 = ((a9 - a95) - -2);
    	a67 = "g";
    	a118 = (a139 + 2);
    	a155 = "e";
    	a105 = "e";
    	a6 = "f";
    	a96 = "f";
    	a176 = ((((((a142 * a98) % 14999) % 14889) - -15110) + 0) * 1);
    	a168 = ((((((a137 * a200) % 14999) + 5928) * 1) % 65) - -199);
    	a10 = ((a118 - a187) + 3);
    	a40 = "g";
    	a137 = ((((((a137 * a57) % 14999) - 12236) - -30496) + -10571) + -16068);
    	a86 = "e";
    	a78 = "g";
    	a159 = ((a153 / a31) - -10);
    	a169 = (((((a8 * a90) % 34) - -213) + 0) - 0);
    	a193 = (a64 - 4);
    	a154 = "g";
    	a156 = (((((((a156 * a140) % 14999) + -22917) % 23) - -340) - -29359) + -29372); 
    	output = "Y";
    } 
    if(((a142 <=  170 && ((input.equals("C")) && (((((cf && a122 <=  79) && ((153 < a92) && (211 >= a92))) && (a32 == 9)) && (a31 == 9)) && ((-157 < a79) && (-135 >= a79))))) && ((((a187 == 2) && ((146 < a108) && (191 >= a108))) && (a39.equals("f"))) && 225 < a147))) {
    	cf = false;
    	a190 = (((((((a147 * a92) % 14999) + -297) % 63) - 31) - 22314) + 22314);
    	a29 = ((a31 / a141) - -12);
    	a122 = (((((((a122 * a190) % 14999) % 22) + 102) / 5) - -318) - 228); 
    	output = "Y";
    } 
    if(((((-7 < a8) && (46 >= a8)) && (((a139 == 7) && (a122 <=  79 && ((cf && (input.equals("A"))) && 225 < a147))) && ((153 < a92) && (211 >= a92)))) && ((((-131 < a90) && (6 >= a90)) && (((a31 == 9) && a142 <=  170) && (a86.equals("f")))) && (a32 == 9)))) {
    	cf = false;
    	a79 = (((((a92 * a199) % 14999) + -24924) * 1) * 1);
    	a147 = (((((a147 * a142) % 14999) - 4524) + -10429) / 5);
    	a40 = "e";
    	a137 = (((((a137 * a79) % 14999) - 4723) - 1535) - 8241);
    	a140 = (((((a168 * a137) % 14999) - 14878) / 5) - 10179);
    	a59 = "h";
    	a187 = (a141 + -3);
    	a9 = ((a139 - a89) - 2);
    	a12 = "e";
    	a102 = "e";
    	a8 = ((((((a128 * a128) % 14999) - -12883) / 5) - 5572) - 14952);
    	a156 = (((((a156 * a140) % 14999) - 8425) + -6575) - 2);
    	a178 = "h";
    	a86 = "e";
    	a80 = (((((a80 * a8) % 14999) + 10556) - 20622) - -2072);
    	a177 = (a187 - -4);
    	a154 = "e";
    	a64 = (a31 - 5);
    	a34 = "e";
    	a53 = (((((a53 * a90) % 14999) - -2918) - 17730) - 107);
    	a87 = "g";
    	a199 = ((((((a199 * a79) % 14999) - 12034) - -21766) - -563) - 19744);
    	a21 = "e";
    	a200 = ((((((a200 * a108) % 14999) - 22736) / 5) * 10) / 9);
    	a31 = ((a10 + a10) + -10);
    	a167 = "e";
    	a139 = ((a118 * a84) + -58);
    	a32 = ((a9 / a89) + 4);
    	a108 = ((((((a108 * a8) % 14999) - 7109) * 1) * 10) / 9); 
    	output = "Y";
    } 
}
private  void calculateOutputm161(String input) {
    if((((a141 == 4) && ((a0.equals("f")) && ((176 < a140) && (318 >= a140)))) && (((165 < a80) && (369 >= a80)) && ((225 < a147 && ((a81.equals("f")) && (((-104 < a152) && (16 >= a152)) && (((input.equals("C")) && (cf && ((192 < a142) && (282 >= a142)))) && a122 <=  79)))) && (a102.equals("f")))))) {
    	cf = false;
    	a152 = (((((a152 * a90) % 23) + 39) - -12012) + -12010); 
    	output = "Y";
    } 
    if((((((192 < a142) && (282 >= a142)) && (((146 < a108) && (191 >= a108)) && (((input.equals("B")) && (cf && 225 < a147)) && (a86.equals("f"))))) && (a84 == 9)) && (((200 < a53) && (286 >= a53)) && (((a141 == 4) && (((-157 < a79) && (-135 >= a79)) && a122 <=  79)) && ((-104 < a152) && (16 >= a152)))))) {
    	cf = false;
    	if(((a50 == 12) || (a167.equals("g")))) {
    	a141 = 4;
    	a64 = 9;
    	a39 = "f";
    	a177 = 10;
    	a154 = "f";
    	a89 = 5;
    	a10 = 10;
    	a32 = 14;
    	a108 = (((a108 - 21205) + -4611) - 1138);
    	a167 = "e";
    	a178 = "h";
    	a118 = 9;
    	a53 = ((((a53 + 4090) / 5) * 10) / 9);
    	a105 = "h";
    	a187 = 4;
    	a84 = 13;
    	a51 = (((((a51 % 29) + 106) + -10) / 5) + 106);
    	a21 = "e";
    	a15 = (((a15 * 5) * 5) - -15174);
    	a56 = a9;
    	a79 = (((a79 - -14089) * 2) + -16750);
    	a159 = 15;
    	a67 = "f";
    	a90 = (((((a90 - -190) * 5) + 2480) % 100) + 84);
    	a65 = "f";
    	a102 = "g";
    	a193 = 2;
    	a81 = "i";
    	a95 = 5;
    	a20 = "f";
    	a147 = (((((((a147 * a152) % 14999) % 54) - -170) - 11601) / 5) + 2473);
    	a140 = (((((a140 / 5) + 424) + -3615) * -2) / 10);
    	a139 = 10;
    	a6 = "f";
    	a40 = "i";
    	a9 = 7; 
    	}else {
    	a161 = "g";
    	a122 = ((((((((a122 * a199) % 14999) % 100) - -225) * 5) * 5) % 100) - -154);
    	a101 = (a139 - -7);
    	}output = "X";
    } 
    if(((225 < a147 && (((((86 < a51) && (145 >= a51)) && (((146 < a108) && (191 >= a108)) && ((165 < a80) && (369 >= a80)))) && ((-104 < a152) && (16 >= a152))) && ((192 < a142) && (282 >= a142)))) && ((((a122 <=  79 && ((input.equals("A")) && cf)) && (a67.equals("f"))) && ((186 < a191) && (365 >= a191))) && ((-149 < a57) && (-68 >= a57))))) {
    	cf = false;
    	a84 = 12;
    	a81 = "f";
    	a180 = "f";
    	a178 = "h";
    	a79 = (((a79 / 5) + -9280) + -17507);
    	a80 = (((a80 * 5) * 5) + 859);
    	a10 = 10;
    	a21 = "i";
    	a56 = (a32 + -5);
    	a141 = 8;
    	a139 = 13;
    	a147 = ((((((a147 * a199) % 14999) / 5) + -22953) % 54) - -223);
    	a167 = "h";
    	a40 = "f";
    	a191 = ((((((a191 % 89) + 219) * 9) / 10) - 1419) - -1505);
    	a193 = 4;
    	a118 = 13;
    	a89 = 1;
    	a32 = 8; 
    	output = "U";
    } 
    if((((a6.equals("f")) && (((165 < a80) && (369 >= a80)) && (input.equals("D")))) && ((((((-131 < a90) && (6 >= a90)) && (a122 <=  79 && (225 < a147 && ((cf && ((-104 < a152) && (16 >= a152))) && ((192 < a142) && (282 >= a142)))))) && ((68 < a199) && (254 >= a199))) && (a95 == 2)) && (a118 == 9)))) {
    	a7 += (a7 + 20) > a7 ? 3 : 0;
    	cf = false;
    	if(((!(a84 == 12) || ((183 < a163) && (228 >= a163))) || (a160.equals("f")))) {
    	a96 = "h";
    	a102 = "f";
    	a65 = "h";
    	a167 = "i";
    	a156 = ((((35 - -199) - 18544) / 5) - -3809);
    	a155 = "g";
    	a147 = (((((a147 * a152) % 14999) + 14069) - 29046) / 5);
    	a15 = (((((a15 * 5) / 5) - 1966) % 47) - -5);
    	a78 = "g";
    	a187 = 7;
    	a90 = ((((a90 + 5540) % 68) - 74) / 5);
    	a53 = (((a53 - 28191) - -46825) - -5338);
    	a80 = ((((a80 % 101) + 265) + -78) + -1);
    	a159 = 15;
    	a132 = ((((((a147 * a142) % 14999) % 38) - 92) - -16174) - 16173);
    	a84 = 9;
    	a79 = (((a79 - 7556) + 7628) / 5);
    	a200 = (((((a200 * 37) / 10) - -23495) * 10) / 9);
    	a105 = "i";
    	a12 = "g";
    	a153 = 11;
    	a118 = 8;
    	a8 = (((((19 - 14911) + -9774) - -4739) * -1) / 10);
    	a168 = ((((92 - -197) - -12590) / 5) + -2253);
    	a140 = ((((a140 * 25) / 10) * 5) * 5);
    	a89 = 8;
    	a29 = (a64 + 6);
    	a108 = (((a108 / 5) / 5) + 5748);
    	a39 = "i";
    	a137 = ((((71 * 25) / 10) / 5) - -136);
    	a169 = ((((35 * 45) / 10) - -7171) + -7156);
    	a67 = "i";
    	a10 = 12;
    	a86 = "e";
    	a150 = 15;
    	a193 = 7;
    	a51 = ((((a51 % 29) - -116) - 8) - -1);
    	a40 = "f";
    	a59 = "f";
    	a177 = 10;
    	a6 = "i";
    	a199 = (((((a199 * 10) / 2) * 10) / 9) * 5);
    	a34 = "h";
    	a64 = 5; 
    	}else {
    	a178 = "g";
    	a162 = (a187 + 14);
    	a110 = "e";
    	a147 = (((((((a147 * a142) % 14999) % 54) + 159) - -4) + 11478) - 11486);
    	}output = "S";
    } 
    if((((a64 == 5) && ((((-104 < a152) && (16 >= a152)) && (((cf && a122 <=  79) && (input.equals("E"))) && ((192 < a142) && (282 >= a142)))) && (a39.equals("f")))) && (((186 < a191) && (365 >= a191)) && ((((a105.equals("f")) && ((-149 < a57) && (-68 >= a57))) && 225 < a147) && (a89 == 2))))) {
    	cf = false;
    	a178 = "f";
    	a50 = (a177 - -6);
    	a171 = ((((((a122 * a147) % 14999) - 5267) * 1) % 14974) - 15025);
    	a147 = ((((((a147 * a171) % 14999) % 54) + 170) * 1) + 1); 
    	output = "Y";
    } 
}
private  void calculateOutputm163(String input) {
    if((((((a141 == 4) && (63 < a152 && (cf && ((192 < a142) && (282 >= a142))))) && 225 < a147) && (a193 == 2)) && ((a86.equals("f")) && ((a122 <=  79 && ((a153 == 6) && ((a40.equals("f")) && (input.equals("D"))))) && ((13 < a168) && (198 >= a168)))))) {
    	cf = false;
    	a89 = ((a32 / a187) - 6);
    	a108 = ((((((a108 * a169) % 14999) * 2) * 1) % 97) - -289);
    	a168 = ((((a168 * a15) - 14695) + 9857) / 5);
    	a160 = "g";
    	a0 = "e";
    	a153 = (a141 + 1);
    	a67 = "g";
    	a21 = "e";
    	a147 = (((((a147 * a142) % 14999) - 14172) + 2716) - 11158);
    	a167 = "e";
    	a141 = (a84 - 3);
    	a159 = ((a177 * a9) - 20);
    	a86 = "e";
    	a177 = (a193 - -3);
    	a40 = "g";
    	a154 = "e";
    	a162 = (a32 + 6);
    	a59 = "g";
    	a32 = a31; 
    	output = "S";
    } 
}
private  void calculateOutputm16(String input) {
    if((((a159 == 11) && (((a86.equals("f")) && (a9 == 5)) && ((157 < a137) && (241 >= a137)))) && (((144 < a156) && (296 >= a156)) && ((a142 <=  170 && cf) && ((89 < a200) && (212 >= a200)))))) {
    	if(((((a64 == 5) && ((cf && ((153 < a92) && (211 >= a92))) && (a102.equals("f")))) && (a177 == 6)) && ((a159 == 11) && ((a167.equals("f")) && (a187 == 2))))) {
    		calculateOutputm160(input);
    	} 
    } 
    if((((a65.equals("f")) && ((a0.equals("f")) && ((a159 == 11) && ((cf && ((192 < a142) && (282 >= a142))) && (a193 == 2))))) && ((a9 == 5) && ((146 < a108) && (191 >= a108))))) {
    	if(((((a31 == 9) && (a10 == 10)) && (a65.equals("f"))) && ((((a102.equals("f")) && (cf && ((-104 < a152) && (16 >= a152)))) && ((200 < a53) && (286 >= a53))) && ((-131 < a90) && (6 >= a90))))) {
    		calculateOutputm161(input);
    	} 
    	if((((a67.equals("f")) && (((146 < a108) && (191 >= a108)) && (((89 < a200) && (212 >= a200)) && (a89 == 2)))) && ((a153 == 6) && ((cf && 63 < a152) && (a167.equals("f")))))) {
    		calculateOutputm163(input);
    	} 
    } 
}
private  void calculateOutputm166(String input) {
    if(((((a81.equals("f")) && (((a102.equals("f")) && (((79 < a122) && (125 >= a122)) && (((cf && ((46 < a48) && (189 >= a48))) && 225 < a147) && (a29 == 9)))) && (a84 == 9))) && (a40.equals("f"))) && ((input.equals("E")) && ((a39.equals("f")) && (a12.equals("f")))))) {
    	cf = false;
    	if((a79 <=  -157 || ((a141 == 4) || !(a96.equals("f"))))) {
    	a165 = (((((a79 * a168) % 14999) + 1667) - 9923) / 5);
    	a75 = "f";
    	a178 = "i";
    	a147 = ((((((a147 * a90) % 14999) - -2944) % 54) - -170) * 1); 
    	}else {
    	a147 = ((((((((a147 * a122) % 14999) % 26) - -74) * 10) / 9) + 13560) - 13563);
    	a118 = 14;
    	a9 = 6;
    	a10 = 12;
    	a100 = "f";
    	a176 = ((((((a48 * a122) * 1) - -4498) - 29063) % 58) - -215);
    	a97 = (a89 + 2);
    	}output = "X";
    } 
    if((((((a159 == 11) && (a177 == 6)) && (a193 == 2)) && ((89 < a200) && (212 >= a200))) && ((a34.equals("f")) && (((((225 < a147 && (((46 < a48) && (189 >= a48)) && cf)) && (a29 == 9)) && ((79 < a122) && (125 >= a122))) && (input.equals("D"))) && (a139 == 7))))) {
    	a135 += (a135 + 20) > a135 ? 1 : 0;
    	cf = false;
    	if((((241 < a137) && (407 >= a137)) || (a187 == 1))) {
    	a9 = 9;
    	a153 = 10;
    	a78 = "g";
    	a156 = ((((((a156 + -29151) % 23) - -338) / 5) * 48) / 10);
    	a128 = (((((a128 % 72) - -380) + 7011) + -955) - 6002);
    	a108 = ((((a108 % 22) - -151) - -14) + 2);
    	a59 = "f";
    	a200 = (((a200 - 21353) - -34873) + 8214);
    	a132 = ((((((a122 * a147) % 14999) % 38) - 115) / 5) - 45);
    	a84 = 12;
    	a29 = (a187 + 9);
    	a105 = "h";
    	a10 = 11;
    	a167 = "i";
    	a168 = (((((a168 + 18875) % 65) + 236) + -3324) + 3289);
    	a102 = "h";
    	a90 = (((a90 + -16856) - -5789) - -28082);
    	a40 = "i";
    	a155 = "i";
    	a96 = "h";
    	a169 = (((((a169 + -19288) / 5) * 5) % 12) + 171);
    	a67 = "f";
    	a187 = 6;
    	a12 = "g";
    	a86 = "e";
    	a89 = 7;
    	a159 = 15;
    	a79 = ((((a79 * 5) / 5) % 10) + -139);
    	a199 = ((((66 * 39) / 10) + -1) * 1);
    	a53 = (((((a53 / 5) * 5) / 5) * 96) / 10);
    	a34 = "g";
    	a177 = 9;
    	a150 = 14;
    	a6 = "g";
    	a137 = ((((48 * 5) - -1) / 5) - -169);
    	a65 = "h";
    	a64 = 6;
    	a129 = 10;
    	a193 = 7;
    	a80 = ((((a80 - 10097) / 5) * -3) / 10);
    	a147 = (((((a147 * a140) % 14999) - 5310) - -7738) + -25467);
    	a51 = (((((((a51 % 29) + 101) * 9) / 10) * 5) % 29) - -94);
    	a15 = (((a15 / 5) + 6584) * 4);
    	a39 = "i";
    	a140 = ((((a140 * 25) / 10) * 5) - -21163); 
    	}else {
    	a199 = ((((96 * 29) / 10) + -8907) - -36831);
    	a191 = (((((a191 + -5592) % 89) + 330) / 5) - -153);
    	a168 = ((((a168 % 92) + 57) - -38) - 50);
    	a89 = 6;
    	a53 = (((a53 * 5) - -28175) / 5);
    	a169 = ((((a169 * 10) / 6) * 5) - -13838);
    	a67 = "e";
    	a0 = "e";
    	a153 = 11;
    	a40 = "e";
    	a128 = (((a128 + -26357) + 30575) * -5);
    	a167 = "h";
    	a81 = "f";
    	a21 = "h";
    	a143 = "h";
    	a110 = "h";
    	a95 = 8;
    	a129 = 7;
    	a177 = 5;
    	a15 = (((a15 - 24725) * 1) * 1);
    	a86 = "i";
    	a51 = (((a51 * -5) * 5) + -16655);
    	a9 = 10;
    	a96 = "f";
    	a156 = ((((a156 + 9174) * 3) % 75) - -147);
    	a78 = "i";
    	a34 = "i";
    	a178 = "g";
    	a79 = ((((a79 * 10) / 8) / 5) * 5);
    	a12 = "h";
    	a32 = 11;
    	a80 = ((((a80 / 5) * 144) / 10) * 5);
    	a57 = ((((48 * -32) / 10) + -24595) - 123);
    	a187 = 7;
    	a39 = "h";
    	a139 = 10;
    	a84 = 13;
    	a102 = "e";
    	a150 = 11;
    	a147 = (((((((a147 * a122) % 14999) + -19001) % 54) + 187) / 5) - -129);
    	}output = "T";
    } 
    if((((a96.equals("f")) && (((((79 < a122) && (125 >= a122)) && (a95 == 2)) && (a29 == 9)) && (a31 == 9))) && ((a167.equals("f")) && ((((225 < a147 && (((46 < a48) && (189 >= a48)) && cf)) && (input.equals("B"))) && (a84 == 9)) && ((-76 < a15) && (19 >= a15)))))) {
    	cf = false;
    	if(((!(a6.equals("h")) && (a175 == 9)) && 361 < a157)) {
    	a178 = "h";
    	a30 = "e";
    	a56 = (a159 + -5);
    	a147 = ((((((a147 * a48) % 14999) / 5) + -16278) % 54) - -183); 
    	}else {
    	a147 = (((((((a147 * a122) % 14999) % 54) + 123) + -4) - 20694) - -20745);
    	a178 = "f";
    	a176 = (((((a168 * a48) % 14999) + 13837) + 157) * 1);
    	a171 = (((((((a108 * a156) % 14999) / 5) + 15969) / 5) % 17) + 131);
    	}output = "U";
    } 
    if((((a67.equals("f")) && ((((((46 < a48) && (189 >= a48)) && (((a29 == 9) && (cf && 225 < a147)) && (a153 == 6))) && (input.equals("A"))) && (a40.equals("f"))) && (a34.equals("f")))) && ((((-157 < a79) && (-135 >= a79)) && ((186 < a191) && (365 >= a191))) && ((79 < a122) && (125 >= a122))))) {
    	cf = false;
    	if((!(a84 == 12) || ((a175 == 4) && ((a12.equals("f")) && a142 <=  170)))) {
    	a100 = "i";
    	a185 = "h";
    	a147 = ((((((((a147 * a200) % 14999) + -29862) % 26) - -92) / 5) * 51) / 10);
    	a182 = ((a150 * a150) - 72); 
    	}else {
    	a192 = "e";
    	a100 = "h";
    	a36 = (a64 + 10);
    	a147 = ((((((((a147 * a48) % 14999) % 26) - -83) * 9) / 10) * 10) / 9);
    	}output = "Y";
    } 
    if(((((((((input.equals("C")) && (((46 < a48) && (189 >= a48)) && cf)) && ((195 < a128) && (379 >= a128))) && (a21.equals("f"))) && ((79 < a122) && (125 >= a122))) && (a129 == 5)) && ((86 < a51) && (145 >= a51))) && (((a167.equals("f")) && ((a65.equals("f")) && (a29 == 9))) && 225 < a147))) {
    	cf = false;
    	a139 = 6;
    	a79 = (((((a79 * -4) / 10) - -17175) * 10) / 9);
    	a56 = ((a141 / a32) - -7);
    	a89 = 8;
    	a51 = (((a51 - -6238) * 4) + 926);
    	a178 = "h";
    	a81 = "e";
    	a21 = "h";
    	a128 = ((((((a128 % 91) + 283) * 5) * 5) % 91) + 249);
    	a34 = "e";
    	a84 = 13;
    	a187 = 6;
    	a67 = "h";
    	a40 = "h";
    	a129 = 5;
    	a167 = "i";
    	a150 = 13;
    	a88 = (a56 + 6);
    	a147 = (((((((a147 * a122) % 14999) / 5) % 54) - -165) - 14485) + 14452); 
    	output = "X";
    } 
}
private  void calculateOutputm169(String input) {
    if((((a177 == 6) && ((a139 == 7) && (((186 < a191) && (365 >= a191)) && 225 < a147))) && ((a96.equals("f")) && (((a29 == 11) && ((a141 == 4) && (((input.equals("C")) && (202 < a41 && cf)) && ((79 < a122) && (125 >= a122))))) && (a187 == 2))))) {
    	cf = false;
    	a147 = (((((((a147 * a41) % 14999) + -23217) / 5) * 5) % 54) + 215);
    	a79 = ((((((a79 * a128) % 14999) % 90) + -44) + -20876) - -20877);
    	a75 = "e";
    	a31 = ((a64 + a29) + -9);
    	a108 = (((((((a108 * a169) % 14999) / 5) - -5206) - -2451) % 97) - -286);
    	a191 = ((((((a191 * a53) % 14999) % 76) + 417) - 24) * 1);
    	a57 = (((((((a57 * a8) % 14999) % 18) - 48) * 5) % 18) - 47);
    	a102 = "g";
    	a178 = "i";
    	a53 = ((((((a156 * a200) % 14999) % 47) - -297) * 5) / 5);
    	a32 = (a29 - 3);
    	a81 = "g";
    	a199 = ((((((a137 * a122) % 14999) + 12060) * 1) % 10) - -260);
    	a89 = (a64 - 3);
    	a6 = "g";
    	a40 = "g";
    	a165 = (((((a147 * a41) % 14999) + -20530) * 1) + -8659);
    	a187 = ((a29 / a64) + 2);
    	a96 = "g";
    	a15 = (((((((a169 * a147) % 14999) % 20) + 39) - 4) / 5) - -17);
    	a177 = (a64 + 1);
    	a141 = (a153 - 2);
    	a139 = (a89 - -5);
    	a9 = (a150 + -3);
    	a156 = (((((a156 * a128) % 14999) - 16808) - -2012) / 5);
    	a129 = (a84 + -6);
    	a118 = ((a64 + a64) - 2);
    	a67 = "g";
    	a137 = (((((a137 * a169) % 14999) - 29833) * 1) + 11080);
    	a128 = (((((a128 * a57) * 10) / 9) * 1) + 5389); 
    	output = "Y";
    } 
    if(((((-157 < a79) && (-135 >= a79)) && ((a29 == 11) && ((input.equals("B")) && ((225 < a147 && (202 < a41 && cf)) && ((89 < a200) && (212 >= a200)))))) && (((200 < a53) && (286 >= a53)) && ((a81.equals("f")) && (((79 < a122) && (125 >= a122)) && ((a32 == 9) && ((157 < a137) && (241 >= a137)))))))) {
    	cf = false;
    	a147 = ((((((a147 * a122) % 14999) / 5) + -20962) % 26) - -90);
    	a100 = "g";
    	a45 = "e";
    	a171 = (((((a122 * a41) % 14999) + -19812) - 7885) * 1); 
    	output = "T";
    } 
}
private  void calculateOutputm170(String input) {
    if(((((157 < a137) && (241 >= a137)) && ((input.equals("A")) && (cf && (a148 == 11)))) && ((a31 == 9) && ((((((a105.equals("f")) && ((a34.equals("f")) && (a96.equals("f")))) && ((195 < a128) && (379 >= a128))) && (a29 == 12)) && ((79 < a122) && (125 >= a122))) && 225 < a147)))) {
    	cf = false;
    	a35 = "g";
    	a182 = (a177 - -6);
    	a100 = "i";
    	a147 = ((((((a147 * a122) % 14999) % 26) - -88) + -17) + -6); 
    	output = "Y";
    } 
    if((((a9 == 5) && (((input.equals("B")) && (((((79 < a122) && (125 >= a122)) && (cf && (a148 == 11))) && ((195 < a128) && (379 >= a128))) && 225 < a147)) && ((-149 < a57) && (-68 >= a57)))) && ((((a29 == 12) && (a40.equals("f"))) && (a0.equals("f"))) && ((-76 < a15) && (19 >= a15))))) {
    	a135 += (a135 + 20) > a135 ? 2 : 0;
    	cf = false;
    	a110 = "e";
    	a44 = ((((((((a80 * a140) % 14999) - -11091) % 14) + 155) / 5) * 48) / 10);
    	a122 = (((((a122 * a169) * 1) - -5025) - 31878) - -22079); 
    	output = "Y";
    } 
    if((((((144 < a156) && (296 >= a156)) && ((225 < a147 && (((79 < a122) && (125 >= a122)) && ((a148 == 11) && ((input.equals("C")) && (cf && (a29 == 12)))))) && (a105.equals("f")))) && (a31 == 9)) && (((a39.equals("f")) && (a34.equals("f"))) && ((-157 < a79) && (-135 >= a79))))) {
    	cf = false;
    	if(((225 < a186) && (414 >= a186))) {
    	a100 = "i";
    	a147 = (((((((a147 * a122) % 14999) / 5) % 26) - -73) * 9) / 10);
    	a160 = "e";
    	a182 = (a153 - -9); 
    	}else {
    	a118 = 13;
    	a108 = ((((a108 / 5) - -122) + 2026) + -2022);
    	a53 = ((((a53 - -15871) + 9164) % 42) + 235);
    	a167 = "i";
    	a128 = ((((a128 / 5) - -256) * 9) / 10);
    	a78 = "h";
    	a39 = "f";
    	a140 = (((a140 - -8889) - -16120) + 7);
    	a169 = ((((a169 + 4582) % 12) + 163) + -2);
    	a155 = "i";
    	a199 = (((((a199 - 13572) % 92) - -244) - -11960) + -12010);
    	a156 = ((((a156 - 29030) % 23) - -331) - -9);
    	a6 = "h";
    	a10 = 15;
    	a105 = "g";
    	a159 = 14;
    	a59 = "f";
    	a177 = 6;
    	a86 = "f";
    	a12 = "i";
    	a95 = 4;
    	a34 = "f";
    	a15 = ((((a15 % 20) - -39) - -3) + -2);
    	a67 = "g";
    	a102 = "f";
    	a40 = "i";
    	a96 = "h";
    	a137 = ((((((a137 * 26) / 10) + 27712) + -48568) * -1) / 10);
    	a90 = (((((a90 % 68) - 62) - -11867) - -7297) + -19164);
    	a200 = ((((a200 + 13460) / 5) * 10) / 9);
    	a80 = ((((a80 % 101) - -188) / 5) + 248);
    	a8 = (((a8 + -2480) + -19179) * 1);
    	a79 = (((((a79 % 10) + -146) * 5) % 10) + -144);
    	a153 = 12;
    	a147 = (((((a147 * a122) % 14999) + -28800) - 694) * 1);
    	a193 = 6;
    	a89 = 4;
    	a187 = 4;
    	a132 = (((((a122 * a122) / 5) * 5) % 38) + -122);
    	a129 = 11;
    	a84 = 9;
    	a29 = (a139 - -4);
    	}output = "S";
    } 
    if(((((a153 == 6) && (((input.equals("D")) && (((79 < a122) && (125 >= a122)) && ((225 < a147 && cf) && (a148 == 11)))) && (a0.equals("f")))) && ((89 < a200) && (212 >= a200))) && (((a81.equals("f")) && ((a78.equals("f")) && (a118 == 9))) && (a29 == 12)))) {
    	cf = false;
    	if((((a40.equals("h")) && (a79 <=  -157 || (a40.equals("e")))) && !(a138 == 5))) {
    	a10 = 11;
    	a81 = "g";
    	a96 = "f";
    	a21 = "g";
    	a31 = 11;
    	a129 = 5;
    	a137 = (((((a137 % 41) + 194) + -8) * 9) / 10);
    	a177 = 9;
    	a86 = "h";
    	a128 = (((((a128 * 5) % 72) - -427) * 9) / 10);
    	a102 = "i";
    	a6 = "h";
    	a64 = 9;
    	a15 = (((a15 / 5) - -11) - -2);
    	a167 = "i";
    	a65 = "e";
    	a118 = 15;
    	a78 = "g";
    	a80 = (((((a80 + 13766) % 52) + 408) - 30303) - -30294);
    	a139 = 11;
    	a108 = (((a108 * -5) + -8939) + -3198);
    	a169 = (((a169 / 5) + 206) + -15);
    	a147 = ((((((a147 * a200) % 14999) / 5) - 5954) * 10) / 9);
    	a163 = (((((a147 * a122) % 14999) / 5) + -10717) - 5578);
    	a156 = (((((a156 % 23) + 297) * 1) / 5) + 239);
    	a159 = 12;
    	a32 = 14;
    	a34 = "g";
    	a67 = "h";
    	a89 = 4;
    	a39 = "h";
    	a155 = "f";
    	a57 = ((((((a57 % 40) - 83) * 5) * 5) % 40) + -99);
    	a90 = (((a90 + -20532) - -10861) - -9838);
    	a53 = (((a53 - -8493) / 5) * 5);
    	a140 = ((((((a140 % 70) + 244) + -62) * 5) % 70) - -237);
    	a200 = (((((a200 % 59) + 266) - -7124) - 26978) - -19818);
    	a84 = 15;
    	a49 = ((a141 / a187) + 2);
    	a59 = "e";
    	a193 = 5;
    	a199 = (((a199 + 1680) * 5) - -17832);
    	a141 = 9;
    	a191 = ((((a191 % 89) + 266) + 23148) - 23219);
    	a153 = 9;
    	a105 = "h";
    	a95 = 4;
    	a79 = (((a79 * 5) - -13496) - -16786);
    	a51 = (((94 * 5) / 5) - 21109);
    	a12 = "h";
    	a0 = "h";
    	a9 = 11;
    	a40 = "g";
    	a154 = "i";
    	a187 = 6; 
    	}else {
    	a128 = ((((((a128 + -13549) % 72) - -469) * 5) % 72) - -396);
    	a15 = (((((a15 / 5) + 606) * 5) % 20) - -21);
    	a79 = (((((a79 + 4020) - -22525) + -37900) * -1) / 10);
    	a90 = ((((a90 / 5) + -12826) * 10) / 9);
    	a56 = (a148 + -1);
    	a108 = (((a108 / -5) - 28318) + 5101);
    	a0 = "g";
    	a200 = (((a200 + -6715) * 4) * 1);
    	a153 = 12;
    	a57 = ((((a57 - -10674) * 2) + -10009) - 24148);
    	a32 = 10;
    	a31 = 10;
    	a53 = ((((a53 - 10600) / 5) - -29406) - 45089);
    	a64 = 7;
    	a9 = 9;
    	a129 = 8;
    	a12 = "h";
    	a140 = ((((a140 + -27970) % 59) + 420) - -13);
    	a78 = "h";
    	a40 = "e";
    	a177 = 6;
    	a102 = "g";
    	a167 = "e";
    	a191 = (((a191 / 5) * 5) + 9540);
    	a162 = (a148 + 2);
    	a150 = 13;
    	a169 = ((((a169 + 8540) / 5) * 10) / 9);
    	a178 = "h";
    	a137 = ((((((a137 % 41) - -198) + 3) * 5) % 41) - -191);
    	a159 = 12;
    	a84 = 14;
    	a139 = 6;
    	a34 = "f";
    	a141 = 3;
    	a199 = ((((a199 + -22117) * 1) * 10) / -9);
    	a168 = (((91 - 5035) / 5) - -28120);
    	a67 = "h";
    	a96 = "i";
    	a21 = "e";
    	a89 = 4;
    	a118 = 9;
    	a147 = (((((((a147 * a80) % 14999) % 54) - -161) / 5) / 5) - -184);
    	a81 = "f";
    	a80 = (((a80 - -12318) / 5) - -14143);
    	}output = "V";
    } 
    if((((((a96.equals("f")) && (a102.equals("f"))) && (a29 == 12)) && (input.equals("E"))) && (((195 < a128) && (379 >= a128)) && (((a177 == 6) && (((a129 == 5) && ((cf && ((79 < a122) && (125 >= a122))) && (a148 == 11))) && 225 < a147)) && (a167.equals("f")))))) {
    	cf = false;
    	if((a48 <=  -126 || (229 < a8 || (a29 == 9)))) {
    	a156 = ((((a156 % 23) - -316) - 8309) + 8313);
    	a159 = 13;
    	a108 = ((((a108 / 5) * 5) / 5) + 139);
    	a89 = 4;
    	a141 = 4;
    	a167 = "g";
    	a9 = 5;
    	a78 = "i";
    	a53 = ((((a53 / 5) * 5) + -10364) - -10453);
    	a6 = "h";
    	a31 = 11;
    	a155 = "h";
    	a79 = (((((a79 % 10) - 135) * 1) / 5) + -110);
    	a191 = (((a191 + -4157) * 5) / 5);
    	a169 = ((((((a169 / 5) * 51) / 10) * 5) % 12) + 165);
    	a34 = "e";
    	a139 = 8;
    	a147 = ((((((a147 * a8) % 14999) * 2) % 15031) + -14967) + 0);
    	a80 = ((((a80 / 5) + 27485) - 40001) - -13306);
    	a187 = 7;
    	a95 = 5;
    	a140 = (((((((a140 % 59) - -365) * 9) / 10) * 5) % 59) + 329);
    	a162 = (a84 + 8);
    	a59 = "g";
    	a65 = "i";
    	a0 = "h";
    	a51 = (((76 - -26922) * 1) * 1);
    	a193 = 3;
    	a57 = ((((a57 / 5) / 5) - 15191) + 15135);
    	a39 = "g";
    	a8 = ((((a8 + -14484) % 26) + 28) - -15);
    	a81 = "g";
    	a102 = "g";
    	a15 = (((a15 / 5) + 1014) + 21892);
    	a10 = 10;
    	a67 = "f";
    	a128 = (((((a128 % 72) + 414) - 27) - 7096) - -7108);
    	a21 = "h";
    	a90 = ((((a90 - -140) * 9) / 10) + 6);
    	a105 = "g";
    	a137 = ((((a137 * 26) / 10) - 14974) + 24753);
    	a96 = "g";
    	a129 = 10;
    	a12 = "i";
    	a177 = 12;
    	a200 = ((((a200 / 5) * 5) / 5) - -251);
    	a118 = 9;
    	a84 = 10;
    	a199 = ((((a199 * 10) / 2) / 5) - -3515);
    	a86 = "i";
    	a153 = 8;
    	a154 = "i";
    	a32 = 11;
    	a40 = "i";
    	a72 = (((((a122 * a122) + -20365) / 5) % 73) - -160); 
    	}else {
    	a84 = 12;
    	a81 = "h";
    	a178 = "e";
    	a153 = 6;
    	a79 = ((((a79 + 27098) * 10) / -9) - 11);
    	a139 = 11;
    	a40 = "i";
    	a177 = 5;
    	a175 = a31;
    	a39 = "h";
    	a128 = (((((a128 + -7796) + 4998) + 6749) % 91) + 239);
    	a78 = "e";
    	a118 = 8;
    	a86 = "e";
    	a105 = "f";
    	a172 = (((((a122 * a122) % 93) - -89) - -8) + -59);
    	a15 = (((a15 / 5) + -12714) - 9001);
    	a167 = "i";
    	a191 = ((((a191 + -14181) - 12570) * 10) / 9);
    	a147 = (((((((((a147 * a122) % 14999) % 54) - -137) * 9) / 10) / 5) * 49) / 10);
    	}output = "Y";
    } 
}
private  void calculateOutputm172(String input) {
    if((((((146 < a108) && (191 >= a108)) && ((((((-7 < a8) && (46 >= a8)) && ((a29 == 14) && (a190 <=  -95 && cf))) && ((79 < a122) && (125 >= a122))) && 225 < a147) && (a154.equals("f")))) && (a0.equals("f"))) && (((input.equals("A")) && (a6.equals("f"))) && (a193 == 2)))) {
    	cf = false;
    	a155 = "f";
    	a152 = (((((((a80 * a90) % 14999) + 14354) - 8403) * 1) % 59) + -44);
    	a129 = 5;
    	a156 = (((a156 - 29306) + 57360) * 1);
    	a168 = ((((a168 - -6985) - 28691) - -50965) * -1);
    	a169 = (((a169 / 5) + -20625) - -15290);
    	a150 = 14;
    	a142 = (((((((a122 * a122) % 44) + 234) + -35) * 5) % 44) - -193);
    	a122 = (((((a122 * a142) % 14999) - -5026) / 5) + -12607); 
    	output = "V";
    } 
    if(((((157 < a137) && (241 >= a137)) && (225 < a147 && (((a190 <=  -95 && cf) && ((79 < a122) && (125 >= a122))) && ((86 < a51) && (145 >= a51))))) && ((input.equals("B")) && ((((a159 == 11) && ((a129 == 5) && (a167.equals("f")))) && (a29 == 14)) && (a193 == 2))))) {
    	cf = false;
    	a100 = "f";
    	a147 = ((((((a147 * a122) % 14999) - 12933) + 14804) % 26) - -68);
    	a176 = (((((a147 * a122) / 5) % 58) - -107) - 2);
    	a97 = (a177 - 2); 
    	output = "V";
    } 
    if(((((a29 == 14) && ((a141 == 4) && (((a9 == 5) && (a190 <=  -95 && (((79 < a122) && (125 >= a122)) && cf))) && (a118 == 9)))) && 225 < a147) && ((((68 < a199) && (254 >= a199)) && ((input.equals("C")) && (a31 == 9))) && (a96.equals("f"))))) {
    	cf = false;
    	if((((((-131 < a132) && (-54 >= a132)) && (a46 == 13)) && (a68 == 8)) || (a40.equals("h")))) {
    	a49 = ((a129 * a84) + -38);
    	a59 = "g";
    	a147 = (((((a147 * a108) % 14999) - 24319) + -5491) - -6681);
    	a162 = ((a159 - a84) - -11); 
    	}else {
    	a162 = (a64 + 9);
    	a59 = "g";
    	a147 = (((((a147 * a190) % 14999) + -7718) * 1) + -4521);
    	a48 = ((((((a147 * a147) % 14999) % 85) - 40) + -1) - 0);
    	}output = "Y";
    } 
    if((((a187 == 2) && ((a29 == 14) && (((((86 < a51) && (145 >= a51)) && (a139 == 7)) && a190 <=  -95) && (a89 == 2)))) && ((((input.equals("D")) && (((79 < a122) && (125 >= a122)) && (cf && 225 < a147))) && ((144 < a156) && (296 >= a156))) && (a96.equals("f"))))) {
    	cf = false;
    	if((((331 < a157) && (361 >= a157)) && ((a34.equals("e")) && 354 < a44))) {
    	a147 = (((((((a147 * a168) % 14999) - -6521) / 5) + 25490) % 54) + 164);
    	a178 = "f";
    	a171 = (((((((a147 * a190) % 14999) - 1057) / 5) * 5) % 17) + 146);
    	a176 = (((((a171 * a122) + -8129) + -7522) + -18883) + 24793); 
    	}else {
    	a200 = (((((a200 * 5) % 59) - -247) - -20637) + -20662);
    	a147 = (((((a147 * a108) % 14999) - 19828) - 3329) - 3511);
    	a78 = "f";
    	a153 = 12;
    	a156 = ((((a156 / 5) - -203) * 9) / 10);
    	a86 = "h";
    	a118 = 14;
    	a167 = "g";
    	a51 = ((((a51 % 18) - -158) + -26067) - -26072);
    	a141 = 10;
    	a65 = "f";
    	a57 = (((((a57 - -25592) % 18) + -52) * 10) / 9);
    	a0 = "i";
    	a137 = (((a137 - -110) * 1) + -2);
    	a102 = "h";
    	a89 = 6;
    	a168 = (((((a168 % 92) - -92) / 5) * 10) / 9);
    	a187 = 5;
    	a64 = 8;
    	a155 = "f";
    	a34 = "g";
    	a90 = (((a90 * 5) + 541) - -11748);
    	a40 = "h";
    	a39 = "g";
    	a59 = "g";
    	a10 = 14;
    	a12 = "h";
    	a95 = 7;
    	a139 = 8;
    	a96 = "g";
    	a31 = 13;
    	a8 = ((((a8 / 5) + 32) * 10) / 9);
    	a80 = ((((a80 % 52) - -389) * 5) / 5);
    	a162 = (a150 - -3);
    	a140 = (((60 - -19802) - -6360) + 1125);
    	a177 = 12;
    	a182 = ((a162 - a84) - -5);
    	a191 = (((78 + 247) + -27960) + 27989);
    	a129 = 6;
    	a79 = (((a79 * 5) + -21238) - -21949);
    	a199 = (((((a199 * 41) / 10) + -16496) * 10) / -9);
    	a6 = "f";
    	a32 = 10;
    	a81 = "e";
    	a105 = "f";
    	a84 = 12;
    	a108 = (((a108 + 13597) * 2) * 1);
    	}output = "Y";
    } 
    if(((a190 <=  -95 && ((((-157 < a79) && (-135 >= a79)) && (((79 < a122) && (125 >= a122)) && (225 < a147 && cf))) && (a29 == 14))) && (((a150 == 9) && ((((a39.equals("f")) && ((154 < a169) && (179 >= a169))) && (input.equals("E"))) && (a118 == 9))) && (a155.equals("f"))))) {
    	cf = false;
    	if((!(a106 == 8) || (((-52 < a171) && (126 >= a171)) || (((9 < a114) && (226 >= a114)) && (((6 < a90) && (207 >= a90)) || !(a4 == 3)))))) {
    	a160 = "h";
    	a59 = "g";
    	a147 = (((((a147 * a122) % 14999) + 2215) - -9166) * -1);
    	a162 = (a150 + 6); 
    	}else {
    	a191 = ((((39 / 5) - -398) - -3558) - 3562);
    	a32 = 9;
    	a102 = "f";
    	a140 = (((47 - -28613) * 1) / 5);
    	a79 = (((a79 - -116) + -9677) - -9714);
    	a155 = "i";
    	a169 = (((((a169 - -12472) * 10) / 9) * 10) / 9);
    	a200 = ((((a200 / 5) - 12980) / 5) - -2878);
    	a129 = 5;
    	a12 = "i";
    	a0 = "i";
    	a153 = 7;
    	a156 = ((((((a156 % 75) - -173) * 5) - 13631) % 75) - -265);
    	a90 = ((((a90 - -7975) % 68) - 89) + 5);
    	a141 = 4;
    	a95 = 3;
    	a6 = "h";
    	a132 = (((((((a190 * a190) % 14999) - 699) + 9899) / 5) % 53) - -1);
    	a57 = (((((a57 % 40) + -97) + -1) + -24951) - -24967);
    	a64 = 5;
    	a53 = (((a53 / 5) + -4110) - -4301);
    	a108 = (((a108 - 6038) / 5) + 1358);
    	a96 = "f";
    	a168 = ((((a168 % 92) + 71) + -21855) + 21887);
    	a89 = 8;
    	a78 = "i";
    	a199 = (((((a199 % 10) - -264) + 1) - 8792) - -8791);
    	a81 = "h";
    	a21 = "i";
    	a137 = ((((a137 * 26) / 10) / 5) + 3193);
    	a193 = 7;
    	a29 = (a118 - -1);
    	a147 = (((((a147 * a132) % 14999) - 14965) + -11) * 1);
    	a159 = 16;
    	a9 = 6;
    	a150 = 9;
    	a31 = 10;
    	a84 = 9;
    	a80 = (((((a80 % 52) + 414) + 5) * 9) / 10);
    	a39 = "i";
    	a154 = "f";
    	a59 = "f";
    	a139 = 12;
    	a187 = 3;
    	a10 = 13;
    	a67 = "h";
    	a167 = "f";
    	a40 = "h";
    	a177 = 12;
    	a34 = "g";
    	a15 = ((((34 * 19) / 10) - -17121) * 1);
    	a118 = 9;
    	}output = "X";
    } 
}
private  void calculateOutputm174(String input) {
    if(((((a6.equals("f")) && (((185 < a190 && (cf && 225 < a147)) && (a29 == 14)) && (input.equals("C")))) && ((146 < a108) && (191 >= a108))) && (((a95 == 2) && (((79 < a122) && (125 >= a122)) && (((89 < a200) && (212 >= a200)) && (a139 == 7)))) && (a141 == 4)))) {
    	cf = false;
    	a120 = (((((a122 * a80) % 14999) + 8571) - 28888) - -30550);
    	a161 = "h";
    	a122 = (((((((a122 * a140) % 14999) + 6517) / 5) - 22519) % 100) + 299); 
    	output = "Y";
    } 
    if(((((a29 == 14) && (((185 < a190 && (cf && (input.equals("A")))) && ((13 < a168) && (198 >= a168))) && 225 < a147)) && (a177 == 6)) && ((a67.equals("f")) && ((((79 < a122) && (125 >= a122)) && ((a32 == 9) && ((-76 < a15) && (19 >= a15)))) && (a31 == 9))))) {
    	cf = false;
    	a87 = "g";
    	a53 = (((((a53 * a190) % 14999) + -3950) - 22615) + -247);
    	a177 = ((a64 + a29) + -13);
    	a200 = (((((a200 * a140) % 14999) - 27507) - 79) * 1);
    	a108 = ((((((a108 * a128) % 14999) + 680) + -13319) * 1) + -2304);
    	a32 = ((a118 / a141) + 6);
    	a167 = "e";
    	a31 = (a141 - -4);
    	a21 = "e";
    	a154 = "e";
    	a156 = (((((a156 * a57) % 14999) + -1935) / 5) + -22403);
    	a168 = ((((a168 * a57) + -470) * 1) + -17);
    	a6 = "e";
    	a51 = (((((a51 * a199) % 14999) + -14920) + -29) + -47);
    	a65 = "e";
    	a34 = "e";
    	a178 = "h";
    	a140 = (((((a8 * a200) % 14999) / 5) + -24751) * 1);
    	a139 = (a159 - 5);
    	a59 = "h";
    	a80 = (((((a80 * a15) % 15082) + -14916) + 1590) - 1591);
    	a9 = (a177 - 1);
    	a96 = "e";
    	a86 = "e";
    	a147 = (((((a147 * a122) % 14999) / 5) - -21539) / -5); 
    	output = "Y";
    } 
}
private  void calculateOutputm175(String input) {
    if(((225 < a147 && ((13 < a168) && (198 >= a168))) && ((a32 == 9) && ((((((((((79 < a122) && (125 >= a122)) && cf) && (a29 == 16)) && a163 <=  183) && (input.equals("A"))) && ((146 < a108) && (191 >= a108))) && (a154.equals("f"))) && ((-7 < a8) && (46 >= a8))) && (a10 == 10))))) {
    	cf = false;
    	if((a100.equals("e"))) {
    	a147 = (((((a147 * a163) % 14999) - 14960) * 1) + -23);
    	a132 = (((((((a147 * a163) % 14999) % 14934) - 15064) - 1) / 5) - 19883);
    	a59 = "f";
    	a162 = ((a177 + a139) + 2); 
    	}else {
    	a100 = "f";
    	a147 = ((((((a147 * a140) % 14999) + 3899) - -8690) % 26) - -73);
    	a97 = (a29 + -6);
    	a176 = ((((((a147 * a122) % 58) - -128) - -8697) + 11556) + -20240);
    	}output = "U";
    } 
    if((((((a187 == 2) && ((68 < a199) && (254 >= a199))) && ((176 < a140) && (318 >= a140))) && a163 <=  183) && (((((86 < a51) && (145 >= a51)) && (225 < a147 && (((a29 == 16) && (cf && ((79 < a122) && (125 >= a122)))) && (a95 == 2)))) && (input.equals("E"))) && (a105.equals("f"))))) {
    	cf = false;
    	if(((a90 <=  -131 && ((cf && !(a36 == 14)) || (a183.equals("h")))) || (a33.equals("h")))) {
    	a153 = 8;
    	a129 = 7;
    	a118 = 8;
    	a79 = (((45 * 5) - -15606) + -15800);
    	a0 = "e";
    	a193 = 4;
    	a137 = ((((80 - 10850) + 11116) - 25870) - -25909);
    	a40 = "h";
    	a4 = ((a177 + a187) + -5);
    	a140 = (((a140 / -5) * 5) + -26905);
    	a171 = (((((((a163 * a163) % 14999) % 88) - -36) - -1) + 24629) + -24629);
    	a84 = 11;
    	a141 = 6;
    	a100 = "g";
    	a89 = 3;
    	a12 = "e";
    	a78 = "f";
    	a102 = "h";
    	a147 = ((((((((a147 * a171) % 14999) - 1567) % 26) + 89) * 5) % 26) - -90); 
    	}else {
    	a90 = ((((80 * 5) + -360) - -12666) + -12660);
    	a31 = 11;
    	a95 = 4;
    	a141 = 6;
    	a150 = 15;
    	a57 = ((((((a57 * 5) % 40) + -77) * 5) % 40) - 94);
    	a132 = ((((((a199 * a156) % 14999) / 5) % 53) + -11) - -6);
    	a155 = "g";
    	a191 = (((a191 / 5) + 416) + -38);
    	a154 = "f";
    	a147 = (((((a147 * a108) % 14999) + -21014) + 25026) - 19261);
    	a108 = (((a108 / 5) - -23271) + -21157);
    	a105 = "i";
    	a10 = 11;
    	a39 = "g";
    	a128 = (((((a128 % 72) - -398) / 5) + 3522) - 3146);
    	a167 = "g";
    	a40 = "i";
    	a6 = "h";
    	a86 = "h";
    	a169 = ((((a169 * 5) % 34) - -202) + 12);
    	a89 = 5;
    	a53 = (((((a53 * 5) * 5) - 30456) % 42) + 252);
    	a21 = "h";
    	a118 = 11;
    	a67 = "i";
    	a29 = (a64 + 9);
    	a79 = (((67 * 5) * 5) / 5);
    	a168 = (((a168 + 22919) * 1) * 1);
    	a193 = 5;
    	a81 = "i";
    	a32 = 10;
    	a187 = 5;
    	a34 = "g";
    	a139 = 12;
    	a80 = (((((a80 * 5) % 52) + 376) + -22320) + 22318);
    	a59 = "f";
    	a159 = 11;
    	a156 = (((((a156 - -14063) % 75) + 200) / 5) + 212);
    	a64 = 5;
    	a15 = ((((a15 - -702) / 5) - -27813) - 28001);
    	a140 = ((((a140 * 25) / 10) * 5) * 5);
    	a200 = ((((((a200 % 59) + 267) * 9) / 10) * 10) / 9);
    	a9 = 5;
    	a84 = 10;
    	a96 = "i";
    	a78 = "i";
    	a177 = 9;
    	a199 = (((a199 + 2205) - -1855) + 17109);
    	}output = "V";
    } 
    if(((((input.equals("C")) && ((a39.equals("f")) && (((a29 == 16) && cf) && 225 < a147))) && (a150 == 9)) && (((176 < a140) && (318 >= a140)) && ((a65.equals("f")) && (((79 < a122) && (125 >= a122)) && (a163 <=  183 && ((a155.equals("f")) && (a86.equals("f"))))))))) {
    	cf = false;
    	a100 = "i";
    	a147 = (((((((a147 * a122) % 14999) % 26) - -90) + 1) * 9) / 10);
    	a33 = "h";
    	a182 = (a139 - -4); 
    	output = "Y";
    } 
    if(((((-149 < a57) && (-68 >= a57)) && ((a10 == 10) && (a163 <=  183 && ((225 < a147 && cf) && (input.equals("B")))))) && (((195 < a128) && (379 >= a128)) && (((a96.equals("f")) && (((165 < a80) && (369 >= a80)) && (((154 < a169) && (179 >= a169)) && (a29 == 16)))) && ((79 < a122) && (125 >= a122)))))) {
    	cf = false;
    	if(((!(a167.equals("g")) || ((a182 == 8) && (((104 < a176) && (221 >= a176)) || ((19 < a15) && (61 >= a15))))) && !(a19.equals("i")))) {
    	a10 = 14;
    	a193 = 6;
    	a137 = (((92 + 12634) + 14483) * -1);
    	a79 = ((((((94 * -5) / 10) * 10) / 9) - -16844) - 16775);
    	a141 = 10;
    	a187 = 8;
    	a200 = ((((a200 - 3367) % 59) - -298) + 20);
    	a84 = 12;
    	a102 = "g";
    	a139 = 13;
    	a6 = "h";
    	a129 = 11;
    	a34 = "g";
    	a32 = 11;
    	a153 = 10;
    	a168 = (((a168 - -23922) - 16148) / 5);
    	a118 = 12;
    	a65 = "i";
    	a89 = 2;
    	a40 = "i";
    	a163 = (((((a163 * a122) % 14999) * 2) / 5) - -20241); 
    	}else {
    	a84 = 12;
    	a78 = "g";
    	a118 = 15;
    	a141 = 5;
    	a187 = 4;
    	a128 = ((((a128 % 72) - -393) * 5) / 5);
    	a40 = "h";
    	a102 = "g";
    	a12 = "i";
    	a79 = ((((62 * 10) / 9) - -19621) * 1);
    	a8 = (((a8 + 17684) + 7276) * 1);
    	a169 = (((a169 / 5) * 5) / -5);
    	a137 = (((((30 - -10989) - -1229) - 24624) * -1) / 10);
    	a193 = 4;
    	a64 = 9;
    	a89 = 7;
    	a155 = "i";
    	a199 = (((a199 + 25542) - -307) + 1320);
    	a29 = ((a159 + a9) + -2);
    	a10 = 14;
    	a153 = 12;
    	a190 = ((((((a163 * a163) % 14999) - 1146) % 14907) - -15092) * 1);
    	}output = "T";
    } 
    if(((((a6.equals("f")) && (((195 < a128) && (379 >= a128)) && ((input.equals("D")) && (((79 < a122) && (125 >= a122)) && (cf && a163 <=  183))))) && (a167.equals("f"))) && ((a187 == 2) && (((86 < a51) && (145 >= a51)) && ((((89 < a200) && (212 >= a200)) && (a29 == 16)) && 225 < a147))))) {
    	cf = false;
    	if((((125 < a122) && (326 >= a122)) && (a67.equals("g")))) {
    	a147 = ((((((a147 * a191) % 14999) - 29480) - 55) - -24901) - 16329);
    	a59 = "i";
    	a157 = (((((a163 * a147) % 14999) - 14914) - 76) * 1);
    	a122 = (((((a122 * a157) % 14999) + -14932) - 26) + -19); 
    	}else {
    	a10 = 9;
    	a169 = (((((a169 % 12) + 161) - -24827) / 5) + -4820);
    	a21 = "e";
    	a150 = 15;
    	a139 = 11;
    	a81 = "h";
    	a78 = "f";
    	a56 = (a64 - 1);
    	a178 = "h";
    	a34 = "h";
    	a180 = "f";
    	a168 = ((((((a168 - 6447) % 92) - -142) * 5) % 92) - -82);
    	a191 = ((((a191 - -4363) * 5) * 10) / 9);
    	a80 = ((((a80 + 13062) * 10) / 9) + 10248);
    	a167 = "h";
    	a32 = 13;
    	a147 = (((((((a147 * a199) % 14999) - -13953) + -11381) * 1) % 54) + 164);
    	}output = "Y";
    } 
}
private  void calculateOutputm176(String input) {
    if(((((a67.equals("f")) && ((-76 < a15) && (19 >= a15))) && ((79 < a122) && (125 >= a122))) && (((a29 == 16) && ((a39.equals("f")) && ((((((input.equals("D")) && cf) && ((183 < a163) && (228 >= a163))) && ((200 < a53) && (286 >= a53))) && 225 < a147) && (a177 == 6)))) && ((176 < a140) && (318 >= a140))))) {
    	cf = false;
    	if(((a159 == 16) || (61 < a15 && ((-74 < a114) && (9 >= a114))))) {
    	a160 = "g";
    	a162 = ((a32 - a139) - -13);
    	a81 = "e";
    	a199 = (((((a199 * a15) % 10) - -264) + 1) - -1);
    	a177 = ((a9 - a159) + 10);
    	a154 = "e";
    	a105 = "e";
    	a147 = ((((((a147 * a122) % 14999) - 23599) + 9974) / 5) + -2836);
    	a67 = "g";
    	a39 = "e";
    	a21 = "e";
    	a156 = (((((a156 * a108) % 14999) - 1238) - 25446) * 1);
    	a153 = (a10 - 4);
    	a128 = ((((((a128 * a79) % 14999) + -6412) / 5) * 10) / 9);
    	a86 = "e";
    	a139 = ((a187 - a177) - -12);
    	a140 = (((((a140 * a108) % 14999) - 14857) - 13962) + -359);
    	a150 = ((a29 * a162) + -232);
    	a31 = ((a84 + a84) + -8);
    	a32 = ((a177 - a10) - -12);
    	a59 = "g";
    	a108 = (((((((a108 * a80) % 14999) % 97) - -261) / 5) - -18935) - 18779); 
    	}else {
    	a168 = ((((((((a53 * a163) % 14999) + -11518) % 65) - -265) * 5) % 65) + 246);
    	a185 = "e";
    	a167 = "g";
    	a57 = ((((((a15 * a140) - 4119) % 40) + -107) - -20005) + -20006);
    	a108 = (((((a108 * a57) % 97) + 307) - 18065) + 18065);
    	a10 = (a64 - -6);
    	a169 = (((((((a163 * a156) % 14999) + 10151) % 12) + 160) / 5) - -131);
    	a191 = (((((((a53 * a80) % 14999) % 89) + 267) + -73) + 13793) - 13751);
    	a51 = ((((((((a169 * a199) % 14999) + -7852) % 29) + 115) * 5) % 29) - -114);
    	a79 = ((((((a163 * a128) % 14999) % 10) - 146) - -22254) + -22261);
    	a141 = (a9 - 1);
    	a34 = "f";
    	a21 = "g";
    	a40 = "f";
    	a100 = "i";
    	a0 = "f";
    	a102 = "f";
    	a84 = (a139 + 3);
    	a147 = ((((((a147 * a122) % 14999) / 5) % 26) - -90) - 5);
    	a182 = ((a150 + a9) - 5);
    	a6 = "f";
    	a96 = "f";
    	a187 = (a153 - 4);
    	a137 = ((((((a169 * a51) / 5) + 16730) - 45778) % 41) + 214);
    	a129 = ((a9 / a95) + 3);
    	}output = "S";
    } 
}
private  void calculateOutputm177(String input) {
    if((((348 < a163 && ((a102.equals("f")) && ((((cf && 225 < a147) && (a29 == 16)) && ((157 < a137) && (241 >= a137))) && ((176 < a140) && (318 >= a140))))) && (input.equals("C"))) && ((a64 == 5) && (((a86.equals("f")) && (a129 == 5)) && ((79 < a122) && (125 >= a122)))))) {
    	a135 += (a135 + 20) > a135 ? 4 : 0;
    	cf = false;
    	a120 = ((((a8 * a122) - -10810) + 12002) + 890);
    	a161 = "h";
    	a122 = ((((((a122 * a163) % 14999) + -7545) % 100) - -226) - 1); 
    	output = "Y";
    } 
    if(((((154 < a169) && (179 >= a169)) && (((225 < a147 && ((a29 == 16) && (cf && ((79 < a122) && (125 >= a122))))) && 348 < a163) && (a155.equals("f")))) && ((a159 == 11) && ((((-76 < a15) && (19 >= a15)) && ((a193 == 2) && (input.equals("A")))) && (a39.equals("f")))))) {
    	cf = false;
    	a87 = "g";
    	a9 = (a32 + -4);
    	a96 = "e";
    	a140 = (((((a168 * a169) % 14999) + -14901) - 24) / 5);
    	a78 = "e";
    	a80 = ((((((a80 * a199) % 14999) - 24116) / 5) * 10) / 9);
    	a64 = (a193 - -2);
    	a178 = "h";
    	a51 = (((((a15 * a163) % 14999) - 14961) / 5) * 5);
    	a8 = ((((((a8 * a140) % 14999) * 2) % 14996) + -15002) * 1);
    	a128 = (((((a128 * a8) % 14999) + -3634) - -6207) - 5854);
    	a21 = "e";
    	a177 = (a139 + -1);
    	a59 = "h";
    	a31 = (a89 - -7);
    	a102 = "e";
    	a156 = (((((a156 * a199) % 14999) + 14296) + -34104) - 6457);
    	a108 = (((((a108 * a200) % 14999) - 14933) * 1) - 38);
    	a147 = (((((a147 * a199) % 14999) - 20529) + -283) * 1);
    	a53 = ((((((a53 * a137) % 14999) - 23748) * 1) * 10) / 9);
    	a154 = "e";
    	a86 = "e";
    	a137 = ((((a137 * a15) + -10746) + 12262) - 12238);
    	a167 = "e";
    	a199 = (((((a199 * a79) % 14999) + -3849) + 14673) + -20123); 
    	output = "Y";
    } 
}
private  void calculateOutputm17(String input) {
    if(((((cf && (a29 == 9)) && (a21.equals("f"))) && ((200 < a53) && (286 >= a53))) && ((a167.equals("f")) && (((a89 == 2) && (a12.equals("f"))) && (a84 == 9))))) {
    	if((((a78.equals("f")) && ((a96.equals("f")) && ((a154.equals("f")) && (((154 < a169) && (179 >= a169)) && (cf && ((46 < a48) && (189 >= a48))))))) && ((a32 == 9) && ((165 < a80) && (369 >= a80))))) {
    		calculateOutputm166(input);
    	} 
    } 
    if((((a67.equals("f")) && (((((a6.equals("f")) && (a105.equals("f"))) && ((195 < a128) && (379 >= a128))) && (a141 == 4)) && ((-149 < a57) && (-68 >= a57)))) && (cf && (a29 == 11)))) {
    	if((((a0.equals("f")) && (((202 < a41 && cf) && ((186 < a191) && (365 >= a191))) && (a32 == 9))) && (((a105.equals("f")) && (a150 == 9)) && (a102.equals("f"))))) {
    		calculateOutputm169(input);
    	} 
    } 
    if(((((a141 == 4) && (cf && (a29 == 12))) && (a34.equals("f"))) && (((((157 < a137) && (241 >= a137)) && ((195 < a128) && (379 >= a128))) && (a159 == 11)) && (a32 == 9)))) {
    	if((((((a148 == 11) && cf) && ((68 < a199) && (254 >= a199))) && (a89 == 2)) && (((((-131 < a90) && (6 >= a90)) && ((186 < a191) && (365 >= a191))) && (a193 == 2)) && (a12.equals("f"))))) {
    		calculateOutputm170(input);
    	} 
    } 
    if(((cf && (a29 == 14)) && ((a39.equals("f")) && ((a154.equals("f")) && ((a86.equals("f")) && (((a159 == 11) && (a105.equals("f"))) && ((-149 < a57) && (-68 >= a57)))))))) {
    	if((((a84 == 9) && (((165 < a80) && (369 >= a80)) && (a155.equals("f")))) && ((((89 < a200) && (212 >= a200)) && ((a10 == 10) && (cf && a190 <=  -95))) && ((-7 < a8) && (46 >= a8))))) {
    		calculateOutputm172(input);
    	} 
    	if(((((-131 < a90) && (6 >= a90)) && ((a34.equals("f")) && (185 < a190 && cf))) && ((a39.equals("f")) && ((((86 < a51) && (145 >= a51)) && (a65.equals("f"))) && ((144 < a156) && (296 >= a156)))))) {
    		calculateOutputm174(input);
    	} 
    } 
    if((((a150 == 9) && ((-76 < a15) && (19 >= a15))) && ((a105.equals("f")) && ((((68 < a199) && (254 >= a199)) && (((a29 == 16) && cf) && (a9 == 5))) && (a81.equals("f")))))) {
    	if((((((((186 < a191) && (365 >= a191)) && (a95 == 2)) && (a65.equals("f"))) && (a78.equals("f"))) && (a34.equals("f"))) && ((a163 <=  183 && cf) && ((86 < a51) && (145 >= a51))))) {
    		calculateOutputm175(input);
    	} 
    	if(((((a64 == 5) && (a153 == 6)) && ((195 < a128) && (379 >= a128))) && (((a154.equals("f")) && ((a31 == 9) && (((183 < a163) && (228 >= a163)) && cf))) && (a12.equals("f"))))) {
    		calculateOutputm176(input);
    	} 
    	if(((((-7 < a8) && (46 >= a8)) && (((195 < a128) && (379 >= a128)) && (cf && 348 < a163))) && (((a177 == 6) && ((a155.equals("f")) && (a78.equals("f")))) && (a9 == 5)))) {
    		calculateOutputm177(input);
    	} 
    } 
}
private  void calculateOutputm178(String input) {
    if(((((a105.equals("f")) && ((a64 == 5) && ((((a161.equals("f")) && (a31 == 9)) && ((125 < a122) && (326 >= a122))) && (a84 == 9)))) && ((a12.equals("f")) && ((225 < a147 && ((input.equals("B")) && ((a46 == 7) && cf))) && (a89 == 2)))) && a127 >= 4)) {
    	cf = false;
    	a139 = ((a46 - a177) - -7);
    	a105 = "g";
    	a88 = (a159 - -2);
    	a84 = (a88 + -3);
    	a21 = "g";
    	a56 = (a153 - -1);
    	a10 = ((a84 + a139) - 7);
    	a178 = "h";
    	a147 = ((((((a147 * a122) % 14999) % 54) - -143) - -3) - -22);
    	a118 = ((a84 - a32) + 9);
    	a187 = (a31 + -6);
    	a79 = (((((a79 * a108) % 90) - -14) - -25) - 14);
    	a67 = "g";
    	a89 = ((a32 - a150) - -4); 
    	output = "Y";
    } 
    if((((((a32 == 9) && (((((125 < a122) && (326 >= a122)) && (cf && (a46 == 7))) && (a78.equals("f"))) && ((154 < a169) && (179 >= a169)))) && (a161.equals("f"))) && 225 < a147) && (((165 < a80) && (369 >= a80)) && ((a154.equals("f")) && ((a139 == 7) && (input.equals("C"))))))) {
    	cf = false;
    	a154 = "g";
    	a12 = "g";
    	a129 = (a46 + -2);
    	a10 = ((a64 * a153) - 19);
    	a39 = "g";
    	a95 = (a46 + -4);
    	a177 = a46;
    	a140 = ((((((a79 * a79) / 5) % 59) - -372) + 24062) - 24090);
    	a15 = ((((((a168 * a79) % 14999) - -11026) % 20) + 40) + 1);
    	a102 = "g";
    	a90 = ((((((a122 * a140) % 14999) / 5) % 100) + 70) / 5);
    	a31 = (a32 + 1);
    	a108 = ((((((a108 * a90) % 14999) + 11524) % 97) - -221) + 57);
    	a200 = ((((((((a122 * a80) % 14999) % 59) - -218) * 1) * 5) % 59) + 254);
    	a193 = ((a46 / a46) + 2);
    	a137 = ((((((a80 * a169) % 14999) + 9472) % 82) + 289) - -33);
    	a89 = (a31 + -7);
    	a178 = "i";
    	a86 = "g";
    	a159 = (a193 - -9);
    	a165 = (((((((a122 * a147) % 14999) - 1553) - 22529) / 5) % 42) + 253);
    	a199 = (((((((a199 * a191) % 14999) % 10) - -262) - 7) + 17426) - 17416);
    	a67 = "g";
    	a57 = ((((((a57 * a137) % 14999) % 18) + -48) - 1) - 1);
    	a187 = (a31 - a177);
    	a141 = (a46 - 2);
    	a21 = "g";
    	a139 = ((a177 + a32) + -8);
    	a32 = a31;
    	a8 = (((((((a8 * a15) % 91) - -138) + -1) * 5) % 91) + 114);
    	a118 = (a139 - -2);
    	a96 = "g";
    	a153 = ((a46 / a46) - -6);
    	a128 = (((((((a79 * a200) % 14999) / 5) % 91) + 286) + -20017) - -20017);
    	a132 = ((((((a147 * a122) % 14999) - -2865) * 10) / -9) + -6624);
    	a147 = ((((((a147 * a122) % 14999) - -13937) % 54) - -142) + 4);
    	a79 = ((((((a79 * a80) % 14999) % 90) - 43) + 2201) - 2202);
    	a84 = ((a141 * a9) - 20);
    	a53 = (((((((a53 * a51) % 14999) % 47) - -300) + -8) * 10) / 9);
    	a191 = ((((((a191 * a199) % 14999) / 5) % 76) - -393) - -32); 
    	output = "Y";
    } 
    if(((((a21.equals("f")) && ((a95 == 2) && ((a84 == 9) && ((154 < a169) && (179 >= a169))))) && ((125 < a122) && (326 >= a122))) && ((225 < a147 && ((((-7 < a8) && (46 >= a8)) && (((a46 == 7) && cf) && (a161.equals("f")))) && ((68 < a199) && (254 >= a199)))) && (input.equals("A"))))) {
    	a135 += (a135 + 20) > a135 ? 4 : 0;
    	cf = false;
    	a177 = (a10 + -3);
    	a15 = ((((((((a57 * a191) % 14999) / 5) % 20) - -40) * 5) % 20) - -29);
    	a32 = (a139 - -1);
    	a108 = ((((((a122 * a80) % 14999) - -12319) % 97) + 246) - -26);
    	a39 = "g";
    	a193 = ((a46 / a153) + 2);
    	a187 = (a153 - 3);
    	a53 = ((((((a53 * a108) % 14999) + 14271) % 47) - -333) + 3);
    	a79 = (((((a79 * a15) - -22567) % 90) - 58) + 12);
    	a95 = ((a31 - a31) - -3);
    	a169 = (((((((a169 * a199) % 14999) % 34) + 205) - -27623) / 5) + -5382);
    	a21 = "g";
    	a78 = "g";
    	a156 = ((((((a156 * a199) % 14999) % 23) + 310) / 5) + 262);
    	a84 = (a193 + 7);
    	a65 = "e";
    	a128 = ((((a90 * a51) + -2184) + 13469) - 14265);
    	a56 = (a10 + -5);
    	a20 = "f";
    	a154 = "g";
    	a159 = ((a187 * a95) - -3);
    	a139 = (a10 + -2);
    	a141 = (a89 + 3);
    	a105 = "e";
    	a64 = ((a159 + a159) - 18);
    	a147 = (((((((a147 * a199) % 14999) % 54) + 156) - -12) * 9) / 10);
    	a89 = (a150 - 7);
    	a118 = (a187 + 7);
    	a90 = ((((a90 * a8) - 16770) - -741) - 2888);
    	a178 = "h";
    	a67 = "g";
    	a10 = ((a153 * a9) + -25); 
    	output = "T";
    } 
    if(((((((165 < a80) && (369 >= a80)) && ((125 < a122) && (326 >= a122))) && ((-131 < a90) && (6 >= a90))) && (a78.equals("f"))) && ((((input.equals("E")) && ((a187 == 2) && ((((a161.equals("f")) && cf) && 225 < a147) && (a46 == 7)))) && ((-157 < a79) && (-135 >= a79))) && (a105.equals("f"))))) {
    	cf = false;
    	a171 = (((((((a122 * a122) % 14999) - 15200) + 25688) / 5) % 17) - -128);
    	a100 = "g";
    	a147 = ((((((a147 * a171) % 14999) / 5) % 26) + 83) + -16);
    	a40 = "f";
    	a179 = (a177 - -4);
    	a9 = (a179 - 5); 
    	output = "Y";
    } 
}
private  void calculateOutputm181(String input) {
    if(((((a161.equals("f")) && ((a129 == 5) && ((((input.equals("C")) && (((125 < a122) && (326 >= a122)) && cf)) && (a46 == 10)) && (a167.equals("f"))))) && ((200 < a53) && (286 >= a53))) && (((a141 == 4) && ((a81.equals("f")) && 225 < a147)) && ((68 < a199) && (254 >= a199))))) {
    	cf = false;
    	if((!(a45.equals("e")) && a90 <=  -131)) {
    	a100 = "i";
    	a33 = "h";
    	a182 = (a129 + 6);
    	a147 = ((((((((a147 * a122) % 14999) % 26) + 71) * 10) / 9) * 9) / 10); 
    	}else {
    	a108 = ((((((a108 % 22) - -160) - -1) * 5) % 22) - -155);
    	a200 = ((((a200 % 59) + 245) - -12353) + -12374);
    	a6 = "f";
    	a67 = "e";
    	a96 = "f";
    	a191 = ((((a191 - 15232) * 10) / 9) - 8912);
    	a168 = (((a168 * -5) - 5018) + -12386);
    	a139 = 10;
    	a178 = "g";
    	a8 = (((49 * 5) + -9913) / 5);
    	a9 = 4;
    	a78 = "e";
    	a156 = ((((a156 % 23) - -303) / 5) - -255);
    	a118 = 14;
    	a167 = "e";
    	a86 = "e";
    	a110 = "h";
    	a102 = "i";
    	a80 = ((((a80 - 15106) * 10) / 9) - -9027);
    	a199 = (((a199 * -5) * 5) - 10259);
    	a64 = 11;
    	a34 = "h";
    	a177 = 11;
    	a159 = 13;
    	a65 = "h";
    	a57 = (((3 * 5) * 5) + 12354);
    	a187 = 1;
    	a147 = ((((((a147 * a140) % 14999) % 54) + 117) + 0) * 1);
    	a84 = 13;
    	a141 = 4;
    	a53 = ((((a53 + -5007) + 8388) % 42) - -244);
    	a51 = ((((((53 - 15189) * -1) / 10) + -21563) * -1) / 10);
    	a105 = "h";
    	a129 = 10;
    	a143 = "f";
    	a140 = (((((a140 % 70) + 185) * 5) % 70) + 209);
    	}output = "Y";
    } 
    if((((a167.equals("f")) && (((((125 < a122) && (326 >= a122)) && ((225 < a147 && cf) && (input.equals("D")))) && (a139 == 7)) && (a102.equals("f")))) && (((((a32 == 9) && (a46 == 10)) && (a78.equals("f"))) && (a161.equals("f"))) && ((89 < a200) && (212 >= a200))))) {
    	cf = false;
    	a175 = ((a32 - a64) + 1);
    	a178 = "i";
    	a165 = ((((((a147 * a147) % 14999) - 3907) % 14) + 292) + 3);
    	a147 = (((((((a147 * a165) % 14999) % 54) - -171) + -29032) * 1) + 28979); 
    	output = "T";
    } 
    if((((((a6.equals("f")) && ((a86.equals("f")) && (a46 == 10))) && ((125 < a122) && (326 >= a122))) && (a102.equals("f"))) && ((((a84 == 9) && (((68 < a199) && (254 >= a199)) && ((cf && (a161.equals("f"))) && (input.equals("B"))))) && (a95 == 2)) && 225 < a147))) {
    	cf = false;
    	a160 = "g";
    	a100 = "i";
    	a182 = (a118 - -6);
    	a147 = ((((((a147 * a122) % 14999) % 26) + 87) - -3) + 1); 
    	output = "X";
    } 
    if(((((((a78.equals("f")) && ((200 < a53) && (286 >= a53))) && (a139 == 7)) && (input.equals("A"))) && ((125 < a122) && (326 >= a122))) && (((((a105.equals("f")) && ((cf && 225 < a147) && (a161.equals("f")))) && (a46 == 10)) && (a154.equals("f"))) && ((176 < a140) && (318 >= a140))))) {
    	cf = false;
    	a40 = "e";
    	a193 = 1;
    	a182 = a84;
    	a100 = "i";
    	a118 = 15;
    	a39 = "e";
    	a167 = "h";
    	a169 = (((92 - 11047) - -11137) - -41);
    	a21 = "e";
    	a150 = 11;
    	a153 = 8;
    	a147 = (((((((a147 * a122) % 14999) / 5) % 26) + 88) + 17039) + -17050);
    	a10 = 14;
    	a79 = ((((6 * 81) / 10) - -27449) - -973);
    	a128 = ((((15 * 351) / 10) * 5) + 23709);
    	a108 = ((((a108 % 22) - -156) - 7) - 2);
    	a168 = (((((a168 * 5) - -282) / 5) * 48) / 10);
    	a185 = "e";
    	a84 = 13; 
    	output = "Y";
    } 
    if(((((a86.equals("f")) && ((input.equals("E")) && ((a46 == 10) && cf))) && ((165 < a80) && (369 >= a80))) && (((157 < a137) && (241 >= a137)) && (((a161.equals("f")) && (((68 < a199) && (254 >= a199)) && (((a12.equals("f")) && 225 < a147) && ((125 < a122) && (326 >= a122))))) && (a32 == 9))))) {
    	cf = false;
    	if((((265 < a98) && (434 >= a98)) && (((a133 == 12) && (a142 <=  170 && (a96.equals("h")))) && !(a81.equals("g"))))) {
    	a33 = "g";
    	a182 = (a141 + 7);
    	a100 = "i";
    	a147 = (((((((a147 * a108) % 14999) - 19324) + -6538) + -27) % 26) - -112); 
    	}else {
    	a89 = 4;
    	a200 = ((((a200 % 59) + 255) + -196) + 170);
    	a140 = ((((a140 / 5) - -194) - 12812) - -12767);
    	a167 = "i";
    	a155 = "f";
    	a128 = (((58 - -23635) / 5) - -15884);
    	a159 = 13;
    	a96 = "g";
    	a177 = 7;
    	a84 = 10;
    	a21 = "i";
    	a191 = (((((a191 % 76) + 394) / 5) * 10) / 2);
    	a67 = "i";
    	a154 = "g";
    	a137 = (((((((a137 * 10) / 3) * 10) / 9) - 25630) * -1) / 10);
    	a34 = "f";
    	a39 = "h";
    	a163 = (((((((a147 * a122) % 14999) % 22) - -189) * 1) + -15445) + 15454);
    	a141 = 9;
    	a102 = "f";
    	a9 = 8;
    	a86 = "i";
    	a79 = (((35 - 176) - -5492) - 5498);
    	a59 = "e";
    	a90 = (((((74 * 29) / 10) - -9706) + -33096) - -52152);
    	a139 = 8;
    	a129 = 10;
    	a156 = ((((a156 * 5) % 75) - -153) + -4);
    	a118 = 13;
    	a80 = (((((a80 + 3159) - -25370) * 1) % 52) - -404);
    	a153 = 6;
    	a150 = 15;
    	a187 = 3;
    	a15 = (((((7 * 10) / 3) + -13234) * 2) - -26452);
    	a31 = 14;
    	a95 = 3;
    	a32 = 13;
    	a40 = "h";
    	a108 = ((((a108 % 22) + 157) / 5) * 5);
    	a53 = (((((a53 % 42) - -214) - 17918) - 10831) - -28748);
    	a12 = "g";
    	a64 = 9;
    	a168 = (((a168 - -12754) + 6869) / 5);
    	a78 = "f";
    	a189 = (((((a163 * a122) % 14999) / 5) - -10155) / -5);
    	a57 = (((13 + -144) + 12) - -21);
    	a147 = ((((((a147 * a199) % 14999) + -18781) / 5) * 10) / 9);
    	}output = "Z";
    } 
}
private  void calculateOutputm182(String input) {
    if(((((a67.equals("f")) && ((input.equals("B")) && (((a102.equals("f")) && (a167.equals("f"))) && 225 < a147))) && (a64 == 5)) && (((a78.equals("f")) && ((a12.equals("f")) && (((125 < a122) && (326 >= a122)) && (cf && (a46 == 11))))) && (a161.equals("f"))))) {
    	cf = false;
    	a178 = "h";
    	a153 = (a177 - -1);
    	a81 = "g";
    	a167 = "g";
    	a56 = (a46 - 6);
    	a20 = "e";
    	a21 = "g";
    	a200 = (((((((a108 * a140) % 14999) / 5) - -26853) - 3739) % 59) - -242);
    	a147 = ((((((((a147 * a122) % 14999) % 54) + 168) - -2) / 5) * 35) / 10);
    	a191 = (((((((a191 * a200) % 14999) % 76) + 439) - 35) / 5) + 323);
    	a84 = ((a139 - a187) + 4);
    	a154 = "g";
    	a118 = (a159 - 1);
    	a159 = (a153 - -5);
    	a39 = "g";
    	a89 = (a141 - 2); 
    	output = "S";
    } 
    if((((a81.equals("f")) && ((a39.equals("f")) && (((a78.equals("f")) && (((89 < a200) && (212 >= a200)) && (a96.equals("f")))) && (a12.equals("f"))))) && (225 < a147 && ((((a161.equals("f")) && (cf && ((125 < a122) && (326 >= a122)))) && (input.equals("A"))) && (a46 == 11))))) {
    	a74 -= (a74 - 20) < a74 ? 2 : 0;
    	cf = false;
    	a9 = (a89 - -3);
    	a141 = ((a64 / a187) + 2);
    	a140 = ((((((a199 * a53) % 14999) / 5) + -5152) % 59) + 403);
    	a65 = "g";
    	a193 = (a177 / a177);
    	a34 = "g";
    	a167 = "g";
    	a29 = (a89 + 9);
    	a79 = (((((((a108 * a57) % 10) + -140) * 5) - -22686) % 10) + -152);
    	a78 = "e";
    	a150 = ((a32 / a153) - -8);
    	a122 = (((((((a122 * a147) % 14999) / 5) - -23473) / 5) % 22) + 94);
    	a139 = ((a64 / a84) + 7);
    	a155 = "e";
    	a10 = ((a141 + a89) + 3);
    	a64 = ((a46 / a159) - -5);
    	a153 = ((a118 - a31) + 7);
    	a41 = (((((a122 * a147) % 14999) - -7385) + -17340) - -18379);
    	a40 = "f";
    	a168 = (((((((a57 * a57) + 3291) % 65) + 208) / 5) * 49) / 10);
    	a95 = (a32 + -7);
    	a51 = (((((((a80 * a128) % 14999) % 18) - -149) + -3) / 5) + 128);
    	a84 = ((a46 - a46) + 10);
    	a12 = "g";
    	a8 = ((((((a8 * a156) % 91) - -137) - -6226) / 5) - 1125);
    	a169 = (((((((a137 * a137) % 14999) % 34) + 200) - 10644) - -30573) + -19932); 
    	output = "X";
    } 
    if((((((125 < a122) && (326 >= a122)) && (((195 < a128) && (379 >= a128)) && ((a46 == 11) && ((a39.equals("f")) && ((a153 == 6) && (a65.equals("f"))))))) && (((-7 < a8) && (46 >= a8)) && (225 < a147 && ((a187 == 2) && ((input.equals("C")) && ((a161.equals("f")) && cf)))))) && a47 >= 12)) {
    	cf = false;
    	a10 = ((a64 / a118) + 10);
    	a28 = "g";
    	a9 = (a46 + -6);
    	a147 = (((((((a147 * a122) % 14999) % 26) + 82) - 19892) / 5) - -4029);
    	a150 = a84;
    	a139 = ((a187 - a89) - -7);
    	a100 = "f";
    	a176 = (((((a122 * a147) % 14999) - 19759) - 1538) * 1); 
    	output = "Y";
    } 
}
private  void calculateOutputm189(String input) {
    if(((((((86 < a51) && (145 >= a51)) && ((a118 == 9) && ((cf && ((125 < a122) && (326 >= a122))) && (a161.equals("i"))))) && 225 < a147) && (input.equals("C"))) && ((((200 < a53) && (286 >= a53)) && ((a121 == 10) && ((a141 == 4) && (a32 == 9)))) && (a177 == 6)))) {
    	a151 += (a151 + 20) > a151 ? 2 : 0;
    	a135 -= (a135 - 20) < a135 ? 2 : 0;
    	cf = false;
    	a110 = "h";
    	a57 = (((((((a108 * a80) % 14999) + 7188) - -2990) * 1) % 18) + -66);
    	a53 = (((((a53 * a57) * 1) % 47) + 358) - -11);
    	a199 = (((((((a90 * a169) % 14999) - -4976) * 1) - -8570) % 10) + 265);
    	a139 = (a193 + 6);
    	a191 = ((((((a191 * a168) % 14999) % 76) + 422) - -19534) + -19539);
    	a81 = "g";
    	a78 = "g";
    	a96 = "g";
    	a177 = (a84 + -3);
    	a34 = "g";
    	a156 = (((((((a156 * a168) % 14999) % 23) + 321) * 5) % 23) + 321);
    	a147 = (((((((a147 * a168) % 14999) + 3464) % 54) - -171) + -19768) - -19737);
    	a79 = (((((((a79 * a122) % 14999) % 90) - 43) - 23450) * 1) + 23448);
    	a102 = "g";
    	a118 = ((a159 - a121) - -9);
    	a8 = (((((((a108 * a53) % 14999) % 91) - -113) / 5) + -11341) + 11496);
    	a67 = "g";
    	a143 = "h";
    	a178 = "g";
    	a10 = (a89 + 8);
    	a32 = (a177 + 3);
    	a150 = ((a141 / a121) + 10);
    	a168 = ((((((a53 * a199) % 14999) - -1329) % 65) + 209) - 3);
    	a105 = "g";
    	a21 = "g";
    	a15 = (((((a15 * a108) + -14674) % 20) + 43) + -2);
    	a80 = ((((((a80 * a57) % 52) - -460) - -6) * 9) / 10);
    	a51 = (((((((a51 * a122) % 14999) + -27360) + -1643) + -558) % 18) - -170); 
    	output = "U";
    } 
    if((((input.equals("B")) && (((a10 == 10) && (a105.equals("f"))) && (a161.equals("i")))) && (((86 < a51) && (145 >= a51)) && (((-157 < a79) && (-135 >= a79)) && ((a118 == 9) && ((a193 == 2) && (225 < a147 && (((a121 == 10) && cf) && ((125 < a122) && (326 >= a122)))))))))) {
    	cf = false;
    	a36 = (a121 + 3);
    	a100 = "h";
    	a122 = (((((((a122 * a147) % 14999) + -21974) - 7801) + 10346) * -1) / 10);
    	a147 = (((((((a147 * a122) % 14999) + -17088) % 26) - -107) * 9) / 10); 
    	output = "Y";
    } 
}
private  void calculateOutputm190(String input) {
    if(((((-149 < a57) && (-68 >= a57)) && (((((input.equals("A")) && ((-76 < a15) && (19 >= a15))) && (a161.equals("i"))) && ((125 < a122) && (326 >= a122))) && (a32 == 9))) && ((((165 < a80) && (369 >= a80)) && ((225 < a147 && ((a121 == 13) && cf)) && (a193 == 2))) && (a12.equals("f"))))) {
    	a127 += (a127 + 20) > a127 ? 1 : 0;
    	a47 += (a47 + 20) > a47 ? 1 : 0;
    	a170 += (a170 + 20) > a170 ? 2 : 0;
    	cf = false;
    	a164 = "f";
    	a21 = "e";
    	a53 = (((((((a53 * a191) % 14999) / 5) - -24130) + 2608) % 47) - -320);
    	a40 = "e";
    	a154 = "g";
    	a67 = "g";
    	a156 = ((((((a156 * a168) % 14999) - -12436) * 1) * 1) * -1);
    	a10 = ((a9 / a31) + 9);
    	a96 = "e";
    	a139 = (a129 - -2);
    	a191 = (((((a108 * a90) / 5) - 3220) * 10) / 9);
    	a59 = "e";
    	a79 = ((((((a79 * a122) % 14999) + -11515) + -3484) - -15853) - 11018);
    	a141 = (a121 - 10);
    	a39 = "e";
    	a9 = (a139 - 2);
    	a78 = "e";
    	a163 = ((((((a147 * a147) % 14999) - -3612) / 5) + -28681) - -41663);
    	a32 = (a193 + 6);
    	a193 = ((a159 - a118) + -1);
    	a147 = (((((a147 * a163) % 14999) / 5) + -3695) + -24589);
    	a89 = ((a84 + a141) - 10);
    	a177 = ((a187 - a187) + 5);
    	a159 = (a139 - -6);
    	a200 = (((((a15 * a57) + -17122) - 2685) + 11360) - 6201);
    	a118 = (a153 + 2);
    	a108 = ((((a108 * a15) + 14159) + -22526) + -775); 
    	output = "Y";
    } 
    if(((225 < a147 && (((a6.equals("f")) && ((a161.equals("i")) && ((cf && ((125 < a122) && (326 >= a122))) && (input.equals("D"))))) && (a118 == 9))) && ((a121 == 13) && ((((13 < a168) && (198 >= a168)) && ((a9 == 5) && ((-76 < a15) && (19 >= a15)))) && (a153 == 6))))) {
    	cf = false;
    	a147 = ((((((a147 * a156) % 14999) + 3517) + -21741) % 26) - -99);
    	a171 = (((((a147 * a147) + 11223) % 17) + 134) + -5);
    	a100 = "g";
    	a179 = (a153 + 5); 
    	output = "U";
    } 
}
private  void calculateOutputm192(String input) {
    if((((a121 == 16) && ((a159 == 11) && (((a12.equals("f")) && (a167.equals("f"))) && 225 < a147))) && (((68 < a199) && (254 >= a199)) && (((a161.equals("i")) && ((((125 < a122) && (326 >= a122)) && (cf && (input.equals("C")))) && (a10 == 10))) && ((146 < a108) && (191 >= a108)))))) {
    	cf = false;
    	a169 = ((((((a8 * a90) + -136) % 34) + 213) + 23423) + -23421);
    	a153 = (a84 + -3);
    	a81 = "f";
    	a86 = "g";
    	a191 = ((((((a191 * a156) % 14999) % 76) + 439) - -4) + -53);
    	a10 = ((a84 + a95) + -3);
    	a110 = "h";
    	a89 = (a9 - 2);
    	a67 = "g";
    	a147 = (((((((a147 * a122) % 14999) + -1321) + -25718) + -2702) % 54) + 192);
    	a178 = "g";
    	a156 = (((((((a156 * a80) % 14999) % 75) + 212) / 5) * 39) / 10);
    	a31 = (a121 - 7);
    	a64 = (a84 + -4);
    	a193 = (a84 - 7);
    	a129 = (a141 - -1);
    	a167 = "g";
    	a199 = ((((((a199 * a169) % 14999) % 10) - -264) / 5) - -212);
    	a143 = "f";
    	a40 = "g";
    	a9 = a177;
    	a159 = (a129 + 6);
    	a32 = ((a150 * a150) - 91);
    	a177 = ((a139 * a141) + -33);
    	a53 = (((((((a53 * a122) % 14999) % 47) + 307) + -24483) - 3564) + 28067);
    	a80 = ((((((((a80 * a128) % 14999) % 52) + 392) - 18) * 5) % 52) - -383);
    	a105 = "f";
    	a79 = (((((a79 * a57) % 90) - 99) + 33) + 11);
    	a118 = (a121 + -6);
    	a108 = (((((((a108 * a191) % 14999) % 97) - -258) - 17362) - -3638) + 13692);
    	a78 = "g";
    	a200 = (((((a15 * a168) % 15044) + -14954) * 1) + -2); 
    	output = "X";
    } 
    if((((a9 == 5) && ((a121 == 16) && (((125 < a122) && (326 >= a122)) && ((a161.equals("i")) && ((input.equals("D")) && cf))))) && (((((225 < a147 && (a64 == 5)) && ((154 < a169) && (179 >= a169))) && ((-157 < a79) && (-135 >= a79))) && (a21.equals("f"))) && ((200 < a53) && (286 >= a53))))) {
    	cf = false;
    	a147 = ((((((((a147 * a122) % 14999) / 5) % 54) + 157) * 5) % 54) - -143);
    	a79 = ((((((((a79 * a199) % 14999) % 90) - 44) * 5) - 28239) % 90) - 45);
    	a40 = "g";
    	a172 = ((((((a156 * a147) % 14999) - -14670) + 175) % 67) - -208);
    	a118 = ((a64 + a95) + 3);
    	a21 = "g";
    	a178 = "e";
    	a15 = (((((((a15 * a172) % 20) - -41) - -1) * 5) % 20) + 24);
    	a78 = "g";
    	a145 = ((((((a122 * a147) % 14999) / 5) - -24660) / 5) - 12444);
    	a12 = "g";
    	a177 = (a9 - -2);
    	a167 = "g";
    	a129 = (a141 - -1);
    	a193 = (a10 + -7); 
    	output = "U";
    } 
    if(((((a12.equals("f")) && (a10 == 10)) && ((125 < a122) && (326 >= a122))) && (((a118 == 9) && ((a153 == 6) && (((((a121 == 16) && ((a161.equals("i")) && cf)) && ((165 < a80) && (369 >= a80))) && (input.equals("E"))) && 225 < a147))) && ((68 < a199) && (254 >= a199))))) {
    	cf = false;
    	a187 = ((a31 / a31) + 1);
    	a21 = "g";
    	a199 = (((((((a51 * a128) % 14999) + 13436) / 5) * 5) % 10) + 262);
    	a147 = (((((((a147 * a122) % 14999) % 54) - -170) - -2) * 9) / 10);
    	a177 = (a121 - 9);
    	a90 = ((((((a90 * a199) % 14999) - -5694) + 2030) % 100) - -107);
    	a56 = ((a118 * a95) - 10);
    	a79 = ((((((a79 * a53) % 14999) % 90) + -42) + -1) / 5);
    	a154 = "g";
    	a89 = (a64 + -2);
    	a108 = ((((((a57 * a90) + -7135) + -371) / 5) % 97) + 353);
    	a141 = ((a193 + a139) + -6);
    	a169 = (((((((a169 * a140) % 14999) - 12032) * 2) / 5) % 34) - -213);
    	a191 = ((((((a191 * a199) % 14999) + 3788) % 76) - -433) + -32);
    	a153 = (a159 + -4);
    	a95 = ((a31 - a150) - -2);
    	a178 = "h";
    	a78 = "g";
    	a40 = "g";
    	a155 = "f";
    	a96 = "f";
    	a118 = (a159 + -1);
    	a10 = (a121 + -5);
    	a156 = (((((a156 * a15) % 23) - -320) + -27165) + 27165);
    	a165 = ((((((a147 * a122) % 14999) % 42) - -225) - 20) + -2);
    	a200 = (((((((a165 * a90) % 14999) % 61) + 120) + -20376) - 5687) - -26042);
    	a15 = (((((a15 * a137) / 5) % 20) - -40) + 2);
    	a64 = (a150 + -5);
    	a129 = (a193 + 4);
    	a0 = "f";
    	a67 = "g";
    	a8 = (((((a51 * a51) % 14999) + -20203) * 1) + -9222);
    	a80 = (((((((a80 * a108) % 14999) % 52) + 407) - -25825) * 1) - 25837);
    	a193 = (a9 + -4);
    	a39 = "f";
    	a159 = ((a139 / a9) + 10);
    	a137 = (((((((a137 * a51) % 14999) % 41) - -191) * 5) % 41) + 185);
    	a167 = "g";
    	a65 = "f";
    	a9 = (a84 - 5); 
    	output = "X";
    } 
    if((((((-157 < a79) && (-135 >= a79)) && (((-131 < a90) && (6 >= a90)) && (((a161.equals("i")) && (a159 == 11)) && 225 < a147))) && (((((125 < a122) && (326 >= a122)) && ((a40.equals("f")) && ((a121 == 16) && (cf && (input.equals("B")))))) && (a129 == 5)) && (a177 == 6))) && a151 >= 14)) {
    	cf = false;
    	a147 = ((((((a147 * a122) % 14999) % 54) + 146) + -27) + 47);
    	a53 = ((((((a53 * a199) % 14999) / 5) % 47) - -327) - -7);
    	a50 = ((a9 * a10) - 39);
    	a12 = "g";
    	a40 = "g";
    	a137 = ((((((a137 * a79) % 14999) + -10319) - 1769) % 82) + 404);
    	a67 = "g";
    	a118 = (a89 + 8);
    	a171 = ((((((a199 * a199) % 14999) - -4067) / 5) * -1) / 10);
    	a21 = "g";
    	a159 = (a193 - -10);
    	a15 = (((((((a15 * a128) % 14999) + 3126) % 20) - -41) / 5) + 20);
    	a9 = ((a95 - a89) - -6);
    	a79 = ((((((a79 * a15) * 3) + -339) / 5) % 90) + 21);
    	a167 = "g";
    	a178 = "f";
    	a177 = ((a153 + a95) - 1); 
    	output = "V";
    } 
}
private  void calculateOutputm18(String input) {
    if((((a154.equals("f")) && ((((68 < a199) && (254 >= a199)) && ((a161.equals("f")) && cf)) && (a12.equals("f")))) && ((((200 < a53) && (286 >= a53)) && (a118 == 9)) && (a84 == 9)))) {
    	if((((((a46 == 7) && cf) && (a0.equals("f"))) && (a64 == 5)) && (((a84 == 9) && (((-149 < a57) && (-68 >= a57)) && (a65.equals("f")))) && ((68 < a199) && (254 >= a199))))) {
    		calculateOutputm178(input);
    	} 
    	if(((((146 < a108) && (191 >= a108)) && ((a102.equals("f")) && (cf && (a46 == 10)))) && ((a177 == 6) && ((((13 < a168) && (198 >= a168)) && (a81.equals("f"))) && ((186 < a191) && (365 >= a191)))))) {
    		calculateOutputm181(input);
    	} 
    	if(((((195 < a128) && (379 >= a128)) && (a81.equals("f"))) && (((a177 == 6) && (((cf && (a46 == 11)) && (a187 == 2)) && ((-7 < a8) && (46 >= a8)))) && (a65.equals("f"))))) {
    		calculateOutputm182(input);
    	} 
    } 
    if((((a78.equals("f")) && ((-131 < a90) && (6 >= a90))) && (((-76 < a15) && (19 >= a15)) && ((a21.equals("f")) && (((cf && (a161.equals("i"))) && ((-157 < a79) && (-135 >= a79))) && (a105.equals("f"))))))) {
    	if((((a121 == 10) && cf) && ((a159 == 11) && (((((-157 < a79) && (-135 >= a79)) && ((a141 == 4) && (a193 == 2))) && ((200 < a53) && (286 >= a53))) && (a150 == 9))))) {
    		calculateOutputm189(input);
    	} 
    	if((((a89 == 2) && ((a6.equals("f")) && (cf && (a121 == 13)))) && ((a154.equals("f")) && ((a0.equals("f")) && ((a10 == 10) && ((200 < a53) && (286 >= a53))))))) {
    		calculateOutputm190(input);
    	} 
    	if((((a167.equals("f")) && ((a64 == 5) && (a193 == 2))) && ((((a89 == 2) && (cf && (a121 == 16))) && (a9 == 5)) && ((157 < a137) && (241 >= a137))))) {
    		calculateOutputm192(input);
    	} 
    } 
}
private  void calculateOutputm194(String input) {
    if((((a150 == 9) && ((a40.equals("f")) && (((a102.equals("f")) && (((326 < a122 && cf) && 225 < a147) && ((144 < a156) && (296 >= a156)))) && ((89 < a200) && (212 >= a200))))) && ((a197.equals("g")) && (a44 <=  145 && (((68 < a199) && (254 >= a199)) && (input.equals("D"))))))) {
    	cf = false;
    	if((((254 < a199) && (275 >= a199)) || (a177 == 8))) {
    	a172 = ((((((a122 * a147) % 14999) - -4917) * 1) % 67) - -219);
    	a145 = ((((((a44 * a147) % 14999) % 14854) - -15144) * 1) - 0);
    	a178 = "e";
    	a147 = ((((((a147 * a145) % 14999) + -16125) % 54) - -197) - 1); 
    	}else {
    	a39 = "f";
    	a200 = ((((a200 * 5) + 3702) / 5) + -11102);
    	a6 = "e";
    	a139 = 12;
    	a67 = "f";
    	a51 = (((a51 - -13505) * 2) - -1577);
    	a79 = (((85 + -231) + -25199) - -25207);
    	a80 = ((((a80 - 17851) - 7055) % 101) - -291);
    	a53 = (((a53 * 5) + -9985) + -19139);
    	a48 = ((((((a44 * a122) % 14999) - 13789) % 85) + -38) - 2);
    	a191 = (((((25 * 5) * 15) / 10) - -16756) + -16702);
    	a34 = "i";
    	a110 = "g";
    	a177 = 8;
    	a155 = "f";
    	a147 = (((((((a147 * a199) % 14999) + -3524) * 2) * 1) % 54) + 170);
    	a168 = (((a168 / 5) / 5) - -32);
    	a156 = (((((a156 * 5) * 5) * 4) % 75) + 201);
    	a96 = "i";
    	a21 = "i";
    	a108 = ((((a108 * 27) / 10) * 5) + 25828);
    	a64 = 8;
    	a40 = "f";
    	a167 = "f";
    	a32 = 11;
    	a10 = 13;
    	a129 = 10;
    	a81 = "g";
    	a193 = 5;
    	a8 = (((27 + -27) / 5) - -8);
    	a169 = (((a169 / 5) - 1312) * 5);
    	a9 = 4;
    	a118 = 11;
    	a84 = 12;
    	a0 = "h";
    	a159 = 10;
    	a154 = "i";
    	a178 = "g";
    	a150 = 14;
    	a140 = (((a140 - 6045) - -5808) - 6772);
    	a199 = ((((a199 / -5) - 2082) * 10) / 9);
    	}output = "X";
    } 
    if((((input.equals("C")) && ((a81.equals("f")) && ((144 < a156) && (296 >= a156)))) && ((a86.equals("f")) && ((((326 < a122 && (225 < a147 && ((cf && (a197.equals("g"))) && a44 <=  145))) && (a0.equals("f"))) && (a64 == 5)) && (a150 == 9))))) {
    	cf = false;
    	a41 = (((((((a200 * a51) % 14999) % 54) + 136) + 17582) * 1) + -17619);
    	a29 = ((a150 + a10) - 8);
    	a122 = (((((((a122 * a199) % 14999) % 22) + 92) - 9211) / 5) + 1917); 
    	output = "Y";
    } 
    if((((a39.equals("f")) && ((a197.equals("g")) && (((cf && 326 < a122) && 225 < a147) && (a6.equals("f"))))) && ((((((a96.equals("f")) && a44 <=  145) && (a65.equals("f"))) && (input.equals("B"))) && (a21.equals("f"))) && (a89 == 2)))) {
    	cf = false;
    	if((!(a10 == 10) || a171 <=  -52)) {
    	a122 = ((((((a122 * a147) % 14999) % 100) - -185) - -3996) + -3968);
    	a161 = "i";
    	a121 = (a177 - -8); 
    	}else {
    	a179 = (a187 + 8);
    	a100 = "g";
    	a171 = ((((((a147 * a44) % 14999) % 17) + 144) + 1) + 1);
    	a147 = (((((((a147 * a122) % 14999) - 3842) / 5) + 21971) % 26) + 80);
    	}output = "Y";
    } 
    if(((((a159 == 11) && ((((((cf && (input.equals("E"))) && a44 <=  145) && 225 < a147) && ((-76 < a15) && (19 >= a15))) && (a197.equals("g"))) && (a40.equals("f")))) && (a34.equals("f"))) && (((13 < a168) && (198 >= a168)) && ((a31 == 9) && 326 < a122)))) {
    	cf = false;
    	a197 = "f"; 
    	output = "T";
    } 
    if(((((195 < a128) && (379 >= a128)) && ((((-76 < a15) && (19 >= a15)) && (a86.equals("f"))) && 326 < a122)) && (((((((-149 < a57) && (-68 >= a57)) && ((cf && (input.equals("A"))) && a44 <=  145)) && (a64 == 5)) && 225 < a147) && (a197.equals("g"))) && (a95 == 2)))) {
    	cf = false;
    	a122 = ((((((((a122 * a140) % 14999) % 22) - -84) * 5) * 5) % 22) + 98);
    	a153 = 11;
    	a65 = "e";
    	a34 = "h";
    	a12 = "g";
    	a128 = (((((a128 % 91) - -201) - 3) * 10) / 9);
    	a29 = ((a118 - a141) - -9);
    	a140 = (((((a140 * 25) / 10) / 5) * 10) / 2);
    	a40 = "h";
    	a191 = (((43 + 18624) - -6164) - 24103);
    	a78 = "i";
    	a190 = (((((a122 * a147) % 14999) - 22585) - -12388) - 5624); 
    	output = "V";
    } 
}
private  void calculateOutputm197(String input) {
    if((((225 < a147 && ((a187 == 2) && ((195 < a128) && (379 >= a128)))) && (a110.equals("h"))) && (((((145 < a44) && (175 >= a44)) && ((((cf && 326 < a122) && (input.equals("E"))) && (a105.equals("f"))) && ((-131 < a90) && (6 >= a90)))) && (a167.equals("f"))) && (a154.equals("f"))))) {
    	cf = false;
    	a51 = ((((((a8 * a79) + 10977) - -2053) - 7196) % 18) + 163);
    	a150 = (a187 + 8);
    	a200 = ((((((a200 * a137) % 14999) + -3263) + 2595) % 61) - -150);
    	a81 = "g";
    	a96 = "f";
    	a155 = "f";
    	a147 = (((((((a147 * a44) % 14999) % 54) + 168) + 2) - 13818) + 13771);
    	a90 = ((((((a90 * a147) % 100) - -107) + 1) + 16782) + -16783);
    	a40 = "g";
    	a67 = "g";
    	a191 = (((((a15 * a199) + 12215) / 5) % 76) - -414);
    	a169 = (((((((a169 * a51) % 14999) % 34) + 195) - 10001) / 5) - -2159);
    	a159 = (a139 - -3);
    	a187 = ((a139 / a139) + 1);
    	a65 = "f";
    	a0 = "f";
    	a156 = (((((((a156 * a137) % 14999) + 6576) % 23) + 308) + -4682) - -4681);
    	a141 = (a95 - -2);
    	a165 = (((((((a122 * a122) % 14999) % 42) + 225) + -9) - -22457) + -22436);
    	a80 = ((((((a80 * a191) % 14999) % 52) - -401) - 1587) + 1589);
    	a21 = "g";
    	a178 = "h";
    	a64 = (a139 + -3);
    	a108 = ((((((a108 * a137) % 14999) % 97) - -290) + 1) - 84);
    	a9 = (a177 + -2);
    	a56 = ((a10 + a153) - 8);
    	a57 = ((((((a57 * a8) + 9833) % 18) + -66) + 26141) + -26129);
    	a167 = "g";
    	a102 = "g";
    	a128 = (((((((a128 * a51) % 14999) % 72) + 429) + 13) / 5) - -390);
    	a193 = (a177 - 6);
    	a89 = ((a95 - a129) - -6);
    	a118 = ((a150 - a84) + 9);
    	a84 = a150;
    	a129 = ((a95 + a95) - -2);
    	a8 = (((((a140 * a53) % 14999) - 28499) / 5) / 5);
    	a31 = a118;
    	a10 = (a32 + 1);
    	a153 = (a31 + -3);
    	a199 = ((((((((a199 * a137) % 14999) % 10) - -255) - 2587) * 5) % 10) + 265);
    	a79 = (((((((a79 * a51) % 90) + -16) * 10) / 9) - 8861) + 8858);
    	a95 = (a150 + -8);
    	a154 = "g";
    	a137 = ((((((((a137 * a169) % 14999) % 41) - -175) * 5) + -5599) % 41) + 235); 
    	output = "X";
    } 
    if(((((157 < a137) && (241 >= a137)) && (((((a39.equals("f")) && (((a65.equals("f")) && (a167.equals("f"))) && 326 < a122)) && (a110.equals("h"))) && (input.equals("D"))) && (a155.equals("f")))) && (((-157 < a79) && (-135 >= a79)) && ((((145 < a44) && (175 >= a44)) && cf) && 225 < a147)))) {
    	a151 -= (a151 - 20) < a151 ? 3 : 0;
    	cf = false;
    	a147 = (((((((a147 * a44) % 14999) % 54) - -164) / 5) * 37) / 10);
    	a40 = "g";
    	a102 = "g";
    	a21 = "g";
    	a155 = "g";
    	a145 = (((((a200 * a122) % 14999) + -19792) - 4127) * 1);
    	a172 = ((((((((a147 * a44) % 14999) + 1636) % 67) - -209) * 5) % 67) + 215);
    	a178 = "e";
    	a79 = ((((((a79 * a8) / 5) + 10463) + -15883) % 90) + -12);
    	a167 = "g";
    	a84 = ((a153 * a141) + -20);
    	a129 = (a141 + 1);
    	a118 = ((a187 / a177) - -10); 
    	output = "U";
    } 
    if((((((186 < a191) && (365 >= a191)) && ((157 < a137) && (241 >= a137))) && ((a110.equals("h")) && ((input.equals("B")) && (225 < a147 && (((a10 == 10) && (((a0.equals("f")) && (326 < a122 && (((145 < a44) && (175 >= a44)) && cf))) && ((200 < a53) && (286 >= a53)))) && (a129 == 5)))))) && a151 >= 14)) {
    	cf = false;
    	a84 = (a150 + 1);
    	a40 = "g";
    	a147 = (((((((a147 * a122) % 14999) % 54) - -143) + -18576) * 1) + 18599);
    	a171 = (((((a199 * a147) % 14999) + -23071) - 6536) * 1);
    	a50 = (a10 - -1);
    	a8 = ((((((a8 * a51) / 5) / 5) - 7652) % 91) - -202);
    	a67 = "g";
    	a79 = (((((a79 * a15) + 12453) / 5) % 90) + -97);
    	a167 = "g";
    	a39 = "g";
    	a178 = "f";
    	a21 = "g";
    	a65 = "g";
    	a118 = ((a153 - a177) - -11);
    	a128 = ((((((a128 * a200) % 14999) + -18611) - -16520) % 72) + 452);
    	a200 = (((((((a79 * a191) % 14999) - -6383) % 59) + 271) + 18466) - 18464);
    	a53 = (((((((a53 * a137) % 14999) / 5) + 10355) / 5) % 47) + 320);
    	a137 = ((((((a137 * a191) % 14999) % 82) + 306) - 45) + -14); 
    	output = "Y";
    } 
    if(((((145 < a44) && (175 >= a44)) && (((a84 == 9) && (((326 < a122 && cf) && (a110.equals("h"))) && (input.equals("C")))) && (a89 == 2))) && (((a150 == 9) && (((a95 == 2) && ((86 < a51) && (145 >= a51))) && 225 < a147)) && (a40.equals("f"))))) {
    	cf = false;
    	a153 = (a64 + 1);
    	a167 = "g";
    	a178 = "g";
    	a105 = "f";
    	a39 = "g";
    	a65 = "g";
    	a199 = (((((((a199 * a79) % 14999) % 10) + 265) + 1) - -27620) - 27620);
    	a156 = ((((((a156 * a79) % 14999) / 5) % 75) - -220) + 2);
    	a102 = "g";
    	a150 = (a141 - -5);
    	a32 = ((a95 * a139) - 7);
    	a40 = "g";
    	a191 = ((((((a191 * a200) % 14999) % 76) + 433) + -48) - -33);
    	a108 = (((((((a108 * a140) % 14999) % 97) + 202) + -21533) / 5) - -4601);
    	a53 = ((((((a53 * a169) % 14999) % 47) + 316) * 1) * 1);
    	a12 = "f";
    	a129 = (a153 - 1);
    	a187 = a193;
    	a10 = (a187 - -6);
    	a8 = ((((((a8 * a169) - -13451) - 24432) - -19756) % 91) + 135);
    	a57 = ((((((a57 * a140) % 14999) % 18) + -49) - -1) - 1);
    	a155 = "g";
    	a128 = ((((((a200 * a44) % 14999) % 72) - -423) - -16489) - 16467);
    	a89 = (a84 - 6);
    	a67 = "g";
    	a80 = (((((((a80 * a122) % 14999) - 7378) % 52) - -421) / 5) + 329);
    	a118 = a150;
    	a86 = "g";
    	a147 = ((((((((a147 * a122) % 14999) % 54) - -151) - 33) * 5) % 54) + 120);
    	a51 = (((((((a51 * a128) % 14999) - 12861) - -8964) / 5) % 18) + 163);
    	a143 = "f";
    	a84 = a150;
    	a169 = ((((((a169 * a200) % 14999) % 34) + 185) - 4) - 1);
    	a79 = ((((((a79 * a199) % 14999) / 5) % 90) + -43) + -2);
    	a200 = ((((((a200 * a137) % 14999) - -10372) - -2950) / 5) - 13277);
    	a15 = (((((((a90 * a168) % 14999) - 12748) / 5) * 5) % 47) + -27); 
    	output = "X";
    } 
}
private  void calculateOutputm199(String input) {
    if((((a178.equals("g")) && (a95 == 2)) && (225 < a147 && (((((176 < a140) && (318 >= a140)) && ((a187 == 2) && ((((-76 < a15) && (19 >= a15)) && (326 < a122 && (cf && (input.equals("D"))))) && ((175 < a44) && (354 >= a44))))) && (a10 == 10)) && (a40.equals("f")))))) {
    	cf = false;
    	a32 = ((a84 - a187) + 2);
    	a150 = ((a153 / a141) - -9);
    	a141 = (a95 - -3);
    	a193 = (a89 + 1);
    	a56 = (a64 - 1);
    	a34 = "g";
    	a169 = (((((((a169 * a80) % 14999) % 34) + 184) - 2) - 8865) + 8864);
    	a118 = ((a9 * a139) + -30);
    	a178 = "h";
    	a89 = ((a187 * a150) + -17);
    	a40 = "g";
    	a21 = "g";
    	a147 = (((((((a147 * a122) % 14999) - -11523) % 54) - -144) - -5738) - 5745);
    	a78 = "g";
    	a180 = "f";
    	a80 = ((((((a80 * a79) % 14999) - -10675) % 52) + 421) * 1);
    	a10 = (a9 - -6); 
    	output = "V";
    } 
    if((((a12.equals("f")) && ((a34.equals("f")) && (((175 < a44) && (354 >= a44)) && (((a178.equals("g")) && cf) && 225 < a147)))) && ((((89 < a200) && (212 >= a200)) && ((input.equals("A")) && (((a86.equals("f")) && (a89 == 2)) && 326 < a122))) && (a141 == 4)))) {
    	cf = false;
    	a140 = ((((((a140 * a51) % 14999) - 25422) / 5) % 59) + 387);
    	a102 = "f";
    	a141 = (a187 - -3);
    	a57 = ((((((((a44 * a44) % 14999) % 40) - 144) * 5) - 14320) % 40) - 77);
    	a199 = ((((((((a137 * a200) % 14999) - -14211) % 92) - -144) / 5) * 25) / 10);
    	a96 = "g";
    	a32 = (a9 * a89);
    	a65 = "f";
    	a44 = ((((((a44 * a108) % 14999) % 14) - -149) + 4533) + -4528);
    	a177 = (a95 + 5);
    	a34 = "g";
    	a110 = "h";
    	a84 = ((a118 - a9) + 5);
    	a64 = ((a10 + a193) + -6);
    	a191 = (((((((a156 * a128) % 14999) / 5) + 11727) / 5) % 89) + 229);
    	a79 = ((((((((a200 * a156) % 14999) - -1243) % 10) - 145) / 5) * 51) / 10);
    	a129 = ((a10 * a150) - 85);
    	a78 = "g";
    	a81 = "f";
    	a12 = "g";
    	a167 = "f";
    	a15 = ((((((a15 * a80) % 20) + 39) - -3) * 9) / 10);
    	a6 = "g";
    	a193 = ((a84 - a10) - -4);
    	a9 = (a10 - 4); 
    	output = "V";
    } 
    if(((((a9 == 5) && (((input.equals("E")) && cf) && (a178.equals("g")))) && (a6.equals("f"))) && (((175 < a44) && (354 >= a44)) && (((195 < a128) && (379 >= a128)) && ((a0.equals("f")) && ((326 < a122 && (((86 < a51) && (145 >= a51)) && 225 < a147)) && (a64 == 5))))))) {
    	cf = false;
    	if(((a100.equals("i")) && ((((a12.equals("h")) && (a141 == 8)) && (a101 == 9)) || a90 <=  -131))) {
    	a187 = (a177 + -4);
    	a39 = "e";
    	a81 = "f";
    	a168 = (((((a80 * a199) % 14999) + -15001) - 1) + 0);
    	a137 = (((((a137 * a53) % 14999) - 29921) - -28232) + -19539);
    	a21 = "e";
    	a59 = "h";
    	a84 = (a141 + 4);
    	a31 = (a150 - 1);
    	a108 = (((((a108 * a169) % 14999) / 5) - 27451) + -1458);
    	a86 = "e";
    	a128 = (((((a128 * a44) % 14999) + -27634) - 1455) + -221);
    	a67 = "e";
    	a167 = "e";
    	a32 = (a141 - -4);
    	a89 = ((a177 / a95) + -1);
    	a0 = "f";
    	a147 = ((((((a147 * a122) % 14999) + -17363) * 10) / 9) + -2595);
    	a154 = "f";
    	a193 = (a118 + -8);
    	a78 = "e";
    	a12 = "e";
    	a10 = (a84 + 1);
    	a140 = (((((a140 * a199) % 14999) - 14884) + -96) + -2);
    	a6 = "e";
    	a15 = (((((a15 * a90) + -7606) * 2) + -3955) - 5243);
    	a105 = "e";
    	a53 = (((((a169 * a108) % 14999) + -7209) - 3662) + -4084);
    	a95 = ((a177 + a177) - 8);
    	a79 = ((((((a51 * a168) % 14999) / 5) + -18131) * 10) / 9);
    	a40 = "e";
    	a139 = (a141 - -2);
    	a64 = ((a10 / a10) - -3);
    	a156 = (((((a156 * a80) % 14999) - 26970) * 1) - 1066);
    	a182 = (a153 - -6);
    	a191 = (((((((a57 * a57) % 14999) / 5) + 18369) / 5) % 89) - -230);
    	a51 = (((((a15 * a44) % 14999) / 5) - 2651) - -775);
    	a169 = (((((((a169 * a79) % 14999) - 3208) * 10) / 9) * 10) / 9);
    	a118 = (a9 + 3);
    	a90 = ((((((a140 * a80) % 14999) * 2) - -3) / 5) - 8817);
    	a200 = (((((a200 * a137) % 14999) - 14955) - 45) * 1);
    	a9 = (a153 - 2);
    	a153 = (a182 - 7);
    	a155 = "e";
    	a159 = (a31 + 2);
    	a129 = ((a177 / a177) - -5);
    	a150 = (a177 + 3);
    	a80 = (((((a80 * a57) % 14999) - 10098) * 1) / 5); 
    	}else {
    	a193 = (a9 + -4);
    	a80 = (((((a80 * a15) % 15082) - 14916) + -1) * 1);
    	a182 = ((a118 - a31) - -13);
    	a105 = "e";
    	a10 = ((a193 - a193) - -9);
    	a84 = (a150 - 1);
    	a153 = (a187 - -3);
    	a108 = ((((a108 * a15) - 8) - 9523) - 262);
    	a40 = "e";
    	a159 = ((a153 / a10) - -10);
    	a31 = (a10 - 1);
    	a12 = "e";
    	a187 = (a84 / a153);
    	a167 = "e";
    	a168 = ((((((a44 * a53) % 14999) - -11468) / 5) / 5) + -6868);
    	a137 = (((((a137 * a169) % 14999) + -16742) - 6412) / 5);
    	a86 = "g";
    	a39 = "e";
    	a95 = (a153 + -4);
    	a162 = ((a32 + a182) + -10);
    	a155 = "e";
    	a169 = (((((a200 * a128) % 14999) + -19415) + 2710) / 5);
    	a154 = "e";
    	a51 = (((((a51 * a199) % 14999) - 14979) - 5) + -6);
    	a81 = "f";
    	a0 = "f";
    	a140 = ((((((a140 * a122) % 14999) - -231) - 25790) * 10) / 9);
    	a53 = (((((a122 * a80) % 14999) + -2610) / 5) + -15937);
    	a32 = a84;
    	a6 = "e";
    	a150 = (a193 + 7);
    	a141 = (a129 - 1);
    	a147 = ((((((a147 * a128) % 14999) + 2389) * 1) * 1) * -1);
    	a64 = ((a193 - a89) + 5);
    	a21 = "f";
    	a177 = a153;
    	a79 = (((((a122 * a128) % 14999) + 588) - 24670) + -3649);
    	a118 = ((a89 - a193) - -7);
    	a89 = (a141 - 2);
    	a78 = "e";
    	a156 = (((((a156 * a90) % 14999) + -14946) + 568) + -599);
    	a65 = "f";
    	a67 = "e";
    	a90 = ((((((a90 * a80) % 14999) % 14934) + -15064) * 1) * 1);
    	a139 = (a193 + 6);
    	a191 = ((((((a44 * a128) % 14999) % 89) + 236) - 29952) - -29961);
    	a59 = "g";
    	a128 = (((((a128 * a44) % 14999) / 5) - -23508) * -1);
    	}output = "S";
    } 
}
private  void calculateOutputm200(String input) {
    if(((((((((326 < a122 && cf) && 354 < a44) && (input.equals("A"))) && 225 < a147) && (a32 == 9)) && ((-131 < a90) && (6 >= a90))) && ((-157 < a79) && (-135 >= a79))) && ((((a95 == 2) && a41 <=  2) && ((144 < a156) && (296 >= a156))) && ((89 < a200) && (212 >= a200))))) {
    	cf = false;
    	a78 = "e";
    	a89 = (a150 + -8);
    	a169 = ((((((a169 * a8) / 5) % 34) - -213) - -8872) + -8870);
    	a191 = ((((((a191 * a41) % 14999) + -2024) + 16370) / 5) + -18562);
    	a128 = (((((a80 * a191) % 14999) + -14935) - -23708) + -23766);
    	a67 = "e";
    	a153 = ((a177 * a150) - 49);
    	a160 = "i";
    	a86 = "e";
    	a15 = (((((a199 * a80) % 14999) + -351) / 5) + -12092);
    	a59 = "h";
    	a156 = (((((a156 * a168) % 14999) - 18642) + -8070) + -1595);
    	a80 = (((((((a57 * a57) % 14999) - -7091) / 5) * 5) % 52) - -380);
    	a139 = a177;
    	a21 = "e";
    	a95 = ((a159 - a129) + -4);
    	a10 = (a64 + 5);
    	a147 = (((((a147 * a41) % 14999) - -8833) + -12043) - 11739);
    	a32 = (a193 - -7);
    	a155 = "e";
    	a34 = "g";
    	a90 = (((((a128 * a108) % 14999) - -1104) / 5) + -8370);
    	a167 = "e";
    	a129 = (a118 - 3);
    	a200 = (((((a200 * a8) + 5864) / -5) - -15614) * -2);
    	a108 = (((((a108 * a156) % 14999) - 14997) * 1) - 2);
    	a154 = "e";
    	a40 = "f";
    	a9 = a141;
    	a12 = "e";
    	a51 = (((((a51 * a122) % 14999) - 29454) * 1) - 515);
    	a178 = "i";
    	a140 = (((((a140 * a168) % 14999) + -19536) + -8334) + -1221);
    	a84 = a31;
    	a105 = "f";
    	a150 = ((a118 - a141) + 5);
    	a79 = (((((a79 * a90) % 14999) - 19020) * 1) * 1);
    	a137 = (((((a137 * a44) % 14999) + 2047) + -17876) * 1);
    	a141 = ((a118 + a187) - 7);
    	a6 = "e";
    	a39 = "e";
    	a81 = "f";
    	a8 = ((((a8 * a53) + -19862) / 5) + -18941);
    	a118 = a31;
    	a53 = ((((((a57 * a168) % 14999) % 42) + 243) / 5) - -168);
    	a168 = ((((((a168 * a57) % 14999) / 5) % 65) - -263) + 2); 
    	output = "X";
    } 
    if((((((86 < a51) && (145 >= a51)) && ((((-7 < a8) && (46 >= a8)) && (((13 < a168) && (198 >= a168)) && (a129 == 5))) && 354 < a44)) && (a150 == 9)) && (((input.equals("C")) && ((326 < a122 && (225 < a147 && cf)) && a41 <=  2)) && (a39.equals("f"))))) {
    	cf = false;
    	a178 = "e";
    	a172 = ((((((((a41 * a44) % 14999) + 8208) % 93) + 105) * 5) % 93) - -47);
    	a175 = a150;
    	a147 = ((((((a147 * a172) % 14999) % 54) - -152) - -7) + 12);
    	a79 = (((((((a79 * a41) % 14999) + 12326) % 90) + -44) - -18241) - 18240);
    	a95 = (a141 + -1);
    	a177 = ((a129 + a175) - 7);
    	a105 = "g";
    	a39 = "g";
    	a191 = (((((((a191 * a140) % 14999) % 76) + 412) * 5) % 76) - -382);
    	a118 = (a177 + 3); 
    	output = "X";
    } 
}
private  void calculateOutputm19(String input) {
    if(((((a44 <=  145 && cf) && ((68 < a199) && (254 >= a199))) && ((200 < a53) && (286 >= a53))) && (((a150 == 9) && ((a129 == 5) && (a86.equals("f")))) && ((154 < a169) && (179 >= a169))))) {
    	if((((((13 < a168) && (198 >= a168)) && ((cf && (a197.equals("g"))) && ((146 < a108) && (191 >= a108)))) && (a177 == 6)) && (((165 < a80) && (369 >= a80)) && ((a96.equals("f")) && (a102.equals("f")))))) {
    		calculateOutputm194(input);
    	} 
    } 
    if(((((-149 < a57) && (-68 >= a57)) && (((200 < a53) && (286 >= a53)) && ((165 < a80) && (369 >= a80)))) && ((((144 < a156) && (296 >= a156)) && ((a102.equals("f")) && (cf && ((145 < a44) && (175 >= a44))))) && (a31 == 9)))) {
    	if((((((a81.equals("f")) && ((146 < a108) && (191 >= a108))) && (a10 == 10)) && (a89 == 2)) && (((cf && (a110.equals("h"))) && (a105.equals("f"))) && ((-7 < a8) && (46 >= a8))))) {
    		calculateOutputm197(input);
    	} 
    } 
    if((((a187 == 2) && ((a21.equals("f")) && ((a67.equals("f")) && ((-131 < a90) && (6 >= a90))))) && ((a150 == 9) && ((a155.equals("f")) && (((175 < a44) && (354 >= a44)) && cf))))) {
    	if(((((cf && (a178.equals("g"))) && (a193 == 2)) && (a64 == 5)) && ((a39.equals("f")) && (((a95 == 2) && ((157 < a137) && (241 >= a137))) && (a78.equals("f")))))) {
    		calculateOutputm199(input);
    	} 
    } 
    if((((((200 < a53) && (286 >= a53)) && (((157 < a137) && (241 >= a137)) && (cf && 354 < a44))) && (a177 == 6)) && ((a141 == 4) && ((a95 == 2) && ((186 < a191) && (365 >= a191)))))) {
    	if(((((((154 < a169) && (179 >= a169)) && ((a34.equals("f")) && (a9 == 5))) && ((176 < a140) && (318 >= a140))) && ((-157 < a79) && (-135 >= a79))) && (((86 < a51) && (145 >= a51)) && (a41 <=  2 && cf)))) {
    		calculateOutputm200(input);
    	} 
    } 
}



@Override public void calculateOutput(String input) {
 	cf = true;
    if((((a102.equals("e")) && ((a137 <=  157 && (cf && a147 <=  63)) && (a10 == 9))) && (((a167.equals("e")) && a140 <=  176) && a128 <=  195))) {
    	if((((a191 <=  186 && ((a155.equals("e")) && ((a39.equals("e")) && ((a31 == 8) && ((a59.equals("e")) && cf))))) && a140 <=  176) && a200 <=  89)) {
    		calculateOutputm1(input);
    	} 
    	if((((a67.equals("e")) && (a199 <=  68 && (a200 <=  89 && (cf && (a59.equals("f")))))) && ((a167.equals("e")) && (a137 <=  157 && (a12.equals("e")))))) {
    		calculateOutputm2(input);
    	} 
    	if(((((a32 == 8) && a156 <=  144) && (a153 == 5)) && ((((a96.equals("e")) && ((a59.equals("g")) && cf)) && (a105.equals("e"))) && a168 <=  13))) {
    		calculateOutputm3(input);
    	} 
    	if(((((a9 == 4) && (a96.equals("e"))) && a79 <=  -157) && ((a78.equals("e")) && ((a118 == 8) && ((a31 == 8) && (cf && (a59.equals("h")))))))) {
    		calculateOutputm4(input);
    	} 
    } 
    if((((a96.equals("f")) && (((-149 < a57) && (-68 >= a57)) && (cf && ((63 < a147) && (116 >= a147))))) && ((a139 == 7) && (((68 < a199) && (254 >= a199)) && ((a9 == 5) && ((-76 < a15) && (19 >= a15))))))) {
    	if((((((((195 < a128) && (379 >= a128)) && ((a100.equals("e")) && cf)) && ((13 < a168) && (198 >= a168))) && ((-7 < a8) && (46 >= a8))) && (a129 == 5)) && ((a89 == 2) && ((146 < a108) && (191 >= a108))))) {
    		calculateOutputm6(input);
    	} 
    	if((((a167.equals("f")) && (a118 == 9)) && ((a10 == 10) && ((a177 == 6) && ((a0.equals("f")) && (((a100.equals("f")) && cf) && ((-131 < a90) && (6 >= a90)))))))) {
    		calculateOutputm7(input);
    	} 
    	if(((((a39.equals("f")) && (cf && (a100.equals("g")))) && (a177 == 6)) && ((((89 < a200) && (212 >= a200)) && (((-131 < a90) && (6 >= a90)) && (a89 == 2))) && (a86.equals("f"))))) {
    		calculateOutputm8(input);
    	} 
    	if((((((a96.equals("f")) && ((-149 < a57) && (-68 >= a57))) && (a193 == 2)) && ((157 < a137) && (241 >= a137))) && (((89 < a200) && (212 >= a200)) && ((cf && (a100.equals("h"))) && ((-76 < a15) && (19 >= a15)))))) {
    		calculateOutputm9(input);
    	} 
    	if(((((((a100.equals("i")) && cf) && (a154.equals("f"))) && ((200 < a53) && (286 >= a53))) && (a81.equals("f"))) && ((((186 < a191) && (365 >= a191)) && (a95 == 2)) && ((86 < a51) && (145 >= a51))))) {
    		calculateOutputm10(input);
    	} 
    } 
    if((((a118 == 10) && ((((-135 < a79) && (47 >= a79)) && (a139 == 8)) && (a167.equals("g")))) && ((a40.equals("g")) && ((a84 == 10) && (cf && ((116 < a147) && (225 >= a147))))))) {
    	if(((((a178.equals("e")) && cf) && (a177 == 7)) && ((((a155.equals("g")) && ((a6.equals("g")) && (a78.equals("g")))) && (a118 == 10)) && ((19 < a15) && (61 >= a15))))) {
    		calculateOutputm11(input);
    	} 
    	if((((a6.equals("g")) && (cf && (a178.equals("f")))) && ((a67.equals("g")) && (((a167.equals("g")) && ((a39.equals("g")) && ((379 < a128) && (525 >= a128)))) && (a12.equals("g")))))) {
    		calculateOutputm12(input);
    	} 
    	if((((a96.equals("g")) && ((a39.equals("g")) && ((a150 == 10) && ((179 < a169) && (248 >= a169))))) && (((a67.equals("g")) && ((a178.equals("g")) && cf)) && (a139 == 8)))) {
    		calculateOutputm13(input);
    	} 
    	if(((((a81.equals("g")) && (a34.equals("g"))) && (a89 == 3)) && (((((a178.equals("h")) && cf) && (a150 == 10)) && (a10 == 11)) && (a21.equals("g"))))) {
    		calculateOutputm14(input);
    	} 
    	if((((a141 == 5) && (((a89 == 3) && (a84 == 10)) && ((-68 < a57) && (-31 >= a57)))) && ((((a178.equals("i")) && cf) && (a96.equals("g"))) && ((191 < a108) && (387 >= a108))))) {
    		calculateOutputm15(input);
    	} 
    } 
    if((((((146 < a108) && (191 >= a108)) && (((165 < a80) && (369 >= a80)) && ((200 < a53) && (286 >= a53)))) && (a67.equals("f"))) && (((225 < a147 && cf) && (a154.equals("f"))) && (a21.equals("f"))))) {
    	if(((((a177 == 6) && ((a40.equals("f")) && (((-76 < a15) && (19 >= a15)) && (a154.equals("f"))))) && (a167.equals("f"))) && ((cf && a122 <=  79) && ((89 < a200) && (212 >= a200))))) {
    		calculateOutputm16(input);
    	} 
    	if(((((a81.equals("f")) && (((79 < a122) && (125 >= a122)) && cf)) && (a86.equals("f"))) && ((a39.equals("f")) && ((a67.equals("f")) && ((a31 == 9) && ((144 < a156) && (296 >= a156))))))) {
    		calculateOutputm17(input);
    	} 
    	if(((((200 < a53) && (286 >= a53)) && ((((165 < a80) && (369 >= a80)) && (a105.equals("f"))) && (a159 == 11))) && ((((186 < a191) && (365 >= a191)) && (cf && ((125 < a122) && (326 >= a122)))) && ((144 < a156) && (296 >= a156))))) {
    		calculateOutputm18(input);
    	} 
    	if(((((144 < a156) && (296 >= a156)) && (((a105.equals("f")) && ((-131 < a90) && (6 >= a90))) && ((154 < a169) && (179 >= a169)))) && (((a118 == 9) && (cf && 326 < a122)) && ((86 < a51) && (145 >= a51))))) {
    		calculateOutputm19(input);
    	} 
    } 

    errorCheck();
    if(cf)
    	throw new IllegalArgumentException("Current state has no transition for this input!");
}


public static void main(String[] args) throws Exception {
	// init system and input reader
	Problem5 eca = new Problem5();

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
  a160 = "h";
  a186 = 201;
  a24 = 9;
  a178 = "e";
  a95 = 1;
  a162 = 15;
  a35 = "i";
  a46 = 9;
  a122 = 66;
  a97 = 7;
  a44 = 151;
  a200 = 69;
  a88 = 13;
  a106 = 10;
  a123 = "h";
  a48 = -46;
  a168 = 6;
  a110 = "g";
  a131 = "g";
  a118 = 8;
  a79 = -177;
  a140 = 161;
  a85 = 256;
  a4 = 4;
  a9 = 4;
  a169 = 146;
  a199 = 65;
  a101 = 11;
  a56 = 5;
  a64 = 4;
  a6 = "e";
  a80 = 157;
  a138 = 4;
  a98 = 227;
  a145 = 185;
  a139 = 6;
  a31 = 8;
  a36 = 8;
  a89 = 1;
  a15 = -83;
  a146 = 399;
  a94 = 9;
  a105 = "e";
  a19 = "h";
  a179 = 17;
  a197 = "e";
  a68 = 11;
  a128 = 178;
  a156 = 127;
  a120 = 330;
  a189 = 155;
  a154 = "e";
  a90 = -139;
  a92 = 193;
  a75 = "i";
  a133 = 7;
  a30 = "i";
  a20 = "e";
  a57 = -164;
  a40 = "e";
  a121 = 11;
  a50 = 6;
  a142 = 160;
  a167 = "e";
  a102 = "e";
  a32 = 8;
  a183 = "g";
  a129 = 4;
  a182 = 8;
  a164 = "i";
  a137 = 137;
  a143 = "f";
  a96 = "e";
  a157 = 342;
  a28 = "h";
  a172 = 65;
  a78 = "e";
  a177 = 5;
  a114 = 242;
  a53 = 199;
  a14 = "g";
  a161 = "g";
  a81 = "e";
  a10 = 9;
  a39 = "e";
  a72 = 118;
  a155 = "e";
  a86 = "e";
  a29 = 12;
  a87 = "e";
  a193 = 1;
  a171 = 158;
  a67 = "e";
  a0 = "e";
  a180 = "g";
  a190 = 60;
  a153 = 5;
  a165 = 184;
  a84 = 8;
  a49 = 8;
  a187 = 1;
  a59 = "g";
  a176 = -29;
  a60 = 130;
  cf = true;
  a191 = 166;
  a175 = 4;
  a45 = "e";
  a41 = -14;
  a33 = "h";
  a12 = "e";
  a100 = "i";
  a108 = 126;
  a147 = 56;
  a51 = 75;
  a8 = -12;
  a163 = 164;
  a185 = "g";
  a192 = "i";
  a65 = "e";
  a152 = 29;
  a150 = 8;
  a21 = "e";
  a159 = 10;
  a132 = -142;
  a34 = "e";
  a141 = 3;
  a148 = 12;
  a127 = 2;
  a151 = 2;
  a74 = 1;
  a47 = 3;
  a103 = 1;
  a135 = 1;
  a7 = 1;
  a170 = 1;
}}
