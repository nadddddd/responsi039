/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC PRAKTIKUM
 */
public class JenisHewan {
    package  model;
    import javax.util.List;
    import javax.swing.table,AbstracTableModel;
    public class ModelTabelDataHewan extends
            AbstractTableModel{
        
        List<DataHewan> dh;
        public
 ModelTableDataHewan(List<DataHewan> dh) {
     this.dh = dh;
 }
     public int getRowCount() {
         return dh.size() {
 }
          public int getRowColumnCount() {
         return 7;
     }
           public String getcolumnName(int column) {
         switch(column) {
             case 0:
                 return "ïd";
                 
                  case 1:
                 return "nama"
                         
                  case 2:
                 return "kelas"
                         
                  case 3:
                 return "jenismakanan"
                         default:
                             return null;
                
         }
              )
        
    }
            
    
}

    
}
