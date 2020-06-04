public class Excll2 {

    /**
     * @param args the command line arguments
     */

     //SALAH
    public static void main(String[] args) {
        byte[] b = new byte [5];
        try { 
            System.in.read(b);
        } 
        catch (java.io.IOException e); // Seharusnya Menggunakan {} Bukan ;
            System.out.println("Hasil : "+(char) b[0] + (char) b[1] +(char) b[2]);
        }

    // BENAR
    public static void main(String[] args) {
        byte[] b = new byte[5];
        System.out.print("Input Kata : ");
        try {
            System.in.read(b);
            System.out.println("Hasil : " + (char) b[0] + (char) b[1] + (char) b[2]);
        } catch (java.io.IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
        // Jika Menginput Kata Ngulik Maka Hasil nya adalah Ngu Karena Hanya Mengambil 3 Huruf Awal
    }

}
