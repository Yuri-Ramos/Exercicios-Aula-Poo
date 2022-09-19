package src;
import java.lang.Thread;
public class App {
    
    public static void main(String[] args) {
        try{ 
        System.out.println("************************************");
        Thread.sleep(500);
        System.out.println("*************   Bem Vindo  *********"); 
        Thread.sleep(500);
        System.out.println("***************  G4 bank  **********"); 
        Thread.sleep(500);
        System.out.println("************************************");
        Thread.sleep(500);
        System.out.println("************************************");  
        Thread.sleep(2000);
        limTela();  
    }
    catch (Exception e) {//
            
        // catching the exception
        System.out.println(e);
    }
    
    }

    public static void limTela() {
            for (int i = 0; i<15;i++){
                System.out.println();
            }
    }

   
}
  