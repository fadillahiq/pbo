package excl1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maend
 */
public class Excl1 {

    /**
     * @param args the command line arguments
     */
    // SALAh
    public static void main(String[] args) {
        int n = 0;
        n = System.in.read();
        System.out.println("Hasil " + (char) n);
        // Jika di Run akan error karena belum menambakan try-catch
    }

    // BENAR
    public static void main(String[] args) {
        try {
            int n = 0;
            n = System.in.read();
            System.out.println("Hasil " + (char) n);
        } catch (IOException ex) {
            Logger.getLogger(Excl1.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Jika di Run dan menginput ada maka hasilnya adalah a (huruf pertama)
    }
}