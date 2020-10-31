/*
@author 
NAMA   : MUHAMMAD AZRAQI SAPUTRA
KELAS  : PBO2
NIM    : 10116397
Deskripsi Program : Program Saldo Tabungan
 */

package pbo210116397latihan19saldotabungan;

/**
 *
 * @author Zetro
 */
public class PBO210116397Latihan19SaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int bulan = 6;
        int i = 1;
        int  saldoTab = 2500000;
        double bunga = 0.15;
        double saldoBul;
      
        while (i <= bulan) {
           
            saldoBul = saldoTab * bunga;
            
            saldoTab = (int)(saldoTab + saldoBul);

            System.out.println("Saldo dibulan ke-" + i + " Rp."
            + (int) saldoTab);
            i++;
        }
    }
    
}
