public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static boolean validIndex(int[] arr, int num){
		try{
			for(int i = 0; i <= num; i++){
				System.out.println(arr[i]);
			}
			return true;
		}
		catch(ArrayIndexOutOfBoundsException e){
			return false;
		}
	}
	
	public static int divide(int num, int num2){
		int result;
		try{
			result = num/num2;
		}
		catch(ArithmeticException e){
			result = 0;
		}
		return result;
	}

	public static int safeConvertStringtoInt(String word){
		int result;
		try{
			result = Integer.parseInt(word);
		}
		catch(NumberFormatException e){
			result = 0;
		}
		return result;
	}

}
