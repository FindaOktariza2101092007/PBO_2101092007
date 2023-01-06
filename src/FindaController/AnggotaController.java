/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FindaController;
import Finda.view.FormAnggota;
import Finda.Dao.AnggotaDao;
import Finda.Dao.AnggotaDaoImp1;
import Finda.model.Anggota;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class AnggotaController {
    private FormAnggota formAnggota;
    private AnggotaDao anggotaDao;
    private Anggota anggota;
    
    public AnggotaController(FormAnggota formAnggota){
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDaoImp1();
    }
    public void bersihForm(){
        formAnggota.getTxtnobp().setText("");
        formAnggota.getTxtNama().setText("");
        formAnggota.getTxtAlamat().setText("");
    }
    public void save(){
        anggota = new Anggota();
        anggota.setNobp(formAnggota.getTxtnobp().getText());
        anggota.setNama(formAnggota.getTxtNama().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggotaDao.save(anggota);
        JOptionPane.showMessageDialog(formAnggota, "Entri Data Ok");
        
    }
    public void TampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Anggota> ListAnggota = anggotaDao.getAllAnggota();
        for(Anggota anggota : ListAnggota){
            Object[] data={
                anggota.getNobp(),
                anggota.getNama(),
                anggota.getAlamat()
            };
            tabelModel.addRow(data);
        }
    }
}
