package crud;

/**
 *
 * @author acer
 */
public class Konsumen extends TokoSkincare {
    private String namapembeli;
    
    @Override
    public void Namapembeli(String konsumen) {
        this.namapembeli = konsumen;
    }
    
    @Override
    public String getNamapembeli() {
        return namapembeli;
    }
    
}
