public class MultipleException {  
      
        public static void main(String[] args) {  
              
               try{    
                    int a[]=new int[5];    
                    a[5]=30/0;    
                   }    
                   catch(ArithmeticException e)  
                      {  
                       System.out.println("Arithmetic Exception found");  
                      }    
                   catch(ArrayIndexOutOfBoundsException e)  
                      {  
                       System.out.println("ArrayIndexOutOfBounds Exception found");  
                      }    
                   catch(Exception e)  
                      {  
                       System.out.println("IO Exception found");  
                      }             
                   System.out.println("rest of the code");    
        }  
    }  
