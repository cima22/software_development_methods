public class Test{
 public static void main(String[] args){
  Display disp = new Display();
  Calculator calc = new Calculator(disp);
  calc.cipherPressed('1');
  calc.zeroPressed();
  calc.zeroPressed();
  calc.dotPressed();
  calc.cipherPressed('3');
  calc.plusPressed();
  calc.cipherPressed('8');
  calc.cipherPressed('2');
  calc.dotPressed();
  calc.cipherPressed('9');
  calc.equalPressed();
 }
}
