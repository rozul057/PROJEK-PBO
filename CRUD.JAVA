package crud;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class CRUD extends TokoSkincare{
    static ArrayList<DaftarIsi> list = new Arraylist();
    int no = 1 ;
    
    void hapus(int no){
        for (int i = 0; i <list.size()();i++){   
            if (no == list.get(i).getNo()) {
                list.remove(list.get(i));
                System.out.println("Data Telah Di Hapus");
                System.out.println("==========================================");
            } 
        }
    }

    
