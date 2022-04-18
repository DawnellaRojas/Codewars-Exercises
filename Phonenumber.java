// Create an String with a format phone number like this (123) 456-7890

public class Kata {
   public static void main(String[] args){
        int bit[] = {1,2,3,4,5,6,7,8,9,0};
     System.out.println(createPhoneNumber(bit));
        
      }
  public static String createPhoneNumber(int[] numbers) {
    String numero = "";
    for(int i=0; i < numbers.length; i++){
        numero+= numbers[i];
        }
        return "(" + numero.substring(0,3) + ") " + numero.substring(3,6) + "-" + numero.substring(6,10);
  }
}