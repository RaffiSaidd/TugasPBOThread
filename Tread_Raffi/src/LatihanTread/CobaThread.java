/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanTread;
import static java.lang.Thread.sleep;
/**
 *
 * @author USER
 */
public class CobaThread {
  public static void main(String[] args) {
        Thread celana1 = new Thread(new Celana("Celana-1"));
        Thread celana2 = new Thread(new Celana("Celana-2"));
        
        celana1.start();
        celana2.start();
    }
    
}
     String nama;
     //konstruktor
     public Celana(String id) {
         nama = id;
     }
     
     public void run() {
         for (int i = 0; i<5; i++) {
             try {
                 Thread.currentThread().sleep(1000);
             } catch (InterruptedException ie) {
                 System.out.println("Terimakasih");
             }
            System.out.println("Thread " + nama + ":posisi" + i) ;
         }
     }
 }


