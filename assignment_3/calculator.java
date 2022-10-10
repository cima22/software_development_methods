class Calculator{
 final Display display;
 final NUMBER_SIZE = 15;
 float result;
 float mem1;
 char[] input;
 int index;
 boolean is_float;
 char op;

 Calculator(Display display){
  this.display = display;
  this.result = 0;
  this.mem1 = 0;
  is_float = false;
  input = new char[NUMBER_SIZE];
 }

 private void setIndex(){
  if(index < NUMBER_SIZE - 1)
 }

 void plusPressed(){
  display.display("+");
  op = '+';
 }

 void minusPressed(){
  display.display("-");
  op = '-';
 }

 void productPressed(){
  display.display("*");
  op = '*';
 }

 void dividePressed(){
  display.display("/");
  op = '/';
 }

 void zeroPressed(){
  if() 
 }

 void cipherPressed(){}

 void dotPressed(){}

 void equalPressed(){}
}
