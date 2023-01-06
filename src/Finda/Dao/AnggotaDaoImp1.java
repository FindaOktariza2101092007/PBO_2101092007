/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Finda.Dao;
import Finda.model.Anggota;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LENOVO
 */
public class AnggotaDaoImp1 implements AnggotaDao{
    List<Anggota>data= new ArrayList<>();
    @Override
      public Anggota save(Anggota anggota){
          data.add(anggota);
          return anggota;
      }
      public Anggota update(int index, Anggota anggota){
          data.set(index, anggota);
          return anggota;
      }
      public boolean delete(Anggota anggota){
          return data.remove(anggota);
      }
      public Anggota getAnggota(int index){
          return data.get(index);
      }
      public  List<Anggota> getAllAnggota(){
          return data;
      }
}

