public class Test{
 public static void main(String[] args){
  Display disp = new Display();
  Calculator calc = new Calculator(disp);
  calc.cipherPressed('1');
  calc.cipherPressed('0');
  calc.cipherPressed('3');
  calc.cipherPressed('4');
  calc.equalPressed();
 }
}
