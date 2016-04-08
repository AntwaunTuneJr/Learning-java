public class $ {
  
// easier way to write to console $.write*();
  public static void write(Object  arg){
    System.out.println(arg);
}


// Returns a list of properties $.props();
 public static void props(){
   System.getProperties().list(System.out);
  
}
