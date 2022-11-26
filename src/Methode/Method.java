package Methode;

public class Method {
    //Method 3
    // non void , tanda parameter
    public static int[] inputAngka(){
        int [] number = new int[]{1,2,3,4,5,6,7};
        return number;
    }
    public static String _Message(){

        return null;
    }

    //contoh
    public static String _Muhith(){
        return "Hello Method 3";//tidak ada void maka harus ada yg dikembalikan
    }

    public static void main(String[] args) {
        String msg=_Muhith(); // untuk menanggil method
        System.out.println(msg); // untuk memanggil return

        int[] angkaSaya = inputAngka();
        for (int n : angkaSaya) {           //for ringkas
            System.out.println("angka saya =" + n);
        }

        for (int i=0; i<angkaSaya.length; i++){ //for biasa
            System.out.println("menggunakan for biasa = " + angkaSaya[i]);
        }
    }

}
