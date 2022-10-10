class Calculator{
 final Display display;
 final int NUMBER_SIZE = 15;
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
  this.index = -1;
  is_float = false;
  input = new char[NUMBER_SIZE];
 }

 private void increaseIndex(){
   index = index < NUMBER_SIZE - 1 ? index + 1 : index;
 }

 private void resetInput(){
  for(int i = 0; i < NUMBER_SIZE; i++)
   input[i] = 0;
  index = -1;
 }

 private float inputValue(){
  return index < 0 ? 0 : Float.parseFloat(String.valueOf(input));
 }

 void plusPressed(){
  display.display("+");
  op = '+';
  mem1 = inputValue();
  resetInput();
 }

 void minusPressed(){
  display.display("-");
  op = '-';
  mem1 = inputValue();
  resetInput();
 }

 void productPressed(){
  display.display("*");
  op = '*';
  mem1 = inputValue();
  resetInput();
 }

 void dividePressed(){
  display.display("/");
  op = '/';
  mem1 = inputValue();
  resetInput();
 }

 void zeroPressed(){
  if(!is_float && inputValue() == 0)
   return;
  cipherPressed('0');
 }

 void cipherPressed(char cipher){
  increaseIndex();
  input[index] = cipher;
 }

 void dotPressed(){}

 void equalPressed(){
  display.display(String.valueOf(input));
 }
}
