/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemparkir;

/**
 *
 * @author FarrellPC
 */
public class User {
    private int id;
    private String nama;
    private String umur;
    private String status; 

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    class Kuota{
      int kuota = 30; 
      
      void display(){
          System.out.println("Nilai kuota = " + kuota);
      }
    }

}
