package Method;

public class BelajarMethod {
    public static void main(String[]args){
        /*pengenalan method
        * method ini berguna untuk mengelompokkan kumpulan kode yang dapat digunakan berulang2 (regroup and reuse it)
        * struktur penulisan method adl sbb :
        * [access modifier] [return type] [nama method]
        * contoh public void main
        * public : access modifier
        * void : tipe data
        * main : nama method
        * # calling method
        * namaMethod() atau bisa dengan object
        * contoh*/
        //bisa pake ini jika method nya static krn method dalam main static
        //playMusic();
        //kalau method tidak static calling methodnya bisa pake object seperti ini
        BelajarMethod iniObject = new BelajarMethod();
        iniObject.playMusic();
    }
   /* static boolean btnPlay = true;
    private static void playMusic(){
        if (btnPlay){
            System.out.println("Music is playing");
        }else{
            System.out.println("Music is pause");
        }
    }*/
    boolean btnPlay = true;
    private void playMusic(){
        if (btnPlay){
            System.out.println("Music is playing");
        }else{
            System.out.println("Music is pause");
        }
    }
}
