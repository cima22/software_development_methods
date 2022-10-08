public class Hello{

 public static void main (String[] args){

 int len = args.length;
 System.out.print("Hello ");

 switch(len){
	 case 0:
	 	System.out.println("everybody!");
	 	break;
	
	case 1:
		System.out.println(args[0] + "!");
		break;
	
	default:
		for(int i = 0; i < len; i++){
			String space = i == len - 1 ? "!" : i == len - 2 ? " and, " : ", ";
			System.out.print(args[i] + space);
		}
 }
   
 }
}
