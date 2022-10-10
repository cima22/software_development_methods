class Calculator{
 final Display display;
 final int NUMBER_SIZE = 15;
 float result;
 char[] input;
 int index;
 boolean is_float;
 char op;

 Calculator(Display display){
  this.display = display;
  this.result = 0;
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
  result = inputValue();
  resetInput();
 }

 void minusPressed(){
  display.display("-");
  op = '-';
  result = inputValue();
  resetInput();
 }

 void productPressed(){
  display.display("*");
  op = '*';
  result = inputValue();
  resetInput();
 }

 void dividePressed(){
  display.display("/");
  op = '/';
  result = inputValue();
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
  display.display(""+cipher);
 }

 void dotPressed(){
  is_float = true;
  increaseIndex();
  input[index] = '.';
  display.display(".");
 }

 void equalPressed(){
  switch(op){
	  case '+':
		  result += inputValue();
		  break;
	  case '-':
		  result -= inputValue();
		  break;
	  case '*':
		  result *= inputValue();
		  break;
	  case '/':
		  if(inputValue() == 0){
			  display.display("Cannot divide by 0!");
			  resetInput();
			  return;
		  }
		  result /= inputValue();
		  break;
	  default:
		  return;
  }
  display.display(String.valueOf(result));
 }
}
