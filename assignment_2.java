import java.lang.Math;
public class Calculator{

 public static void main (String[] args){
 
  int len = args.length;
  float res, op2;

  if(len < 3){
   System.out.println("Bruh");
   return;
  }

 res = Float.parseFloat(args[0]);

 for(int i = 1; i < len; i += 2){

   try{
	op2 = Float.parseFloat(args[i + 1]);
   }

   catch(NumberFormatException e){
    System.out.println("Jesus Marie they're numbers not strings");
    return;
   }

   switch(args[i]){
	   case "+":
		   res += op2;
		   System.out.println(res);
		   break;
	   case "-":
		   res -= op2;
		   System.out.println(res);
		   break;
	   case "*":
		   res *= op2;
		   System.out.println(res);
		   break;
	   case "/":
		   if(Math.abs(op2) < 0.0000001){
			System.out.println("Ayo mr White!");
			return;
		   }
		   res /= op2;
		   System.out.println(res);
		   break;
	default:
		   System.out.println("It is ... acceptable.");
   }
 }
   return;
 }
}
