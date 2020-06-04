import java.net.Socket;

public class Excl3 {

    /**
     * @param args the command line arguments
     */

     //SALAH
     public static void main(String[] args) {
        byte[] b = new byte[5];
        System.out.println("Input Bilangan Bulat : ");
        try {System.in.read(b);
            } catch  (java.io.IOException e);
            int N = Integer.valueOf(b).intValue();
            System.out.println("Hasil : "+(N+2));
            //Seharus nya menggunakan {} bukan ;
            //valueOf tidak bisa bertipe byte
            
    }

    // BENAR
    public static void main(String[] args) {
        byte[] b = new byte[5];
        char[] d = new char[5];

        System.out.print("Input Bilangan Bulat : ");
        try {
            System.in.read(b);
            for (int n = 0; n < b.length; n++) {
                d[n] = (char) b[n];
            }
            String v = new String(d).trim();
            System.out.println("Hasil : " + (Integer.valueOf(v) + 2));

        } catch (NumberFormatException e) {
            System.err.print("Hanya Bisa Angka !");
        } catch (Exception e) {
            System.err.print(e);
        }

        // Jika di isi huruf maka akan keluar message error

    }
}