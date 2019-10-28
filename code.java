public class java{

  public static void main (String[] args) {
    for (int i=2; i<=100; i++){
      FizzBuzz(i); 
    }
  }
  
  public void FizzBuzz(int num){
     if (num%3==0 && num%5==0)
       System.out.println("FizzBuzz"); 
     else if (num%3==0) 
       System.out.println("Fizz"); 
     else if (num%5==0)
       System.out.println("Buzz"); 
     else 
        System.out.println(num); 
  }
}
