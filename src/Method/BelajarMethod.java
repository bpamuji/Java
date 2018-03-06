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
        /*tentang parameter dan argument
        * paramater adl variable yang digunakan pada suatu method yang berada di (), sedangkan
        * argument merupakan value yg di berikan pada saat memanggil method tsb
        * dalam pemberian argument juga tidak boleh sembarangan.
        * 1. sesuai dengan tipe data
        * 2. sesuai dengan urutan dari paramater (tidak boleh dibolak balik)
        * contoh*/
        iniObject.nilaiSiswa(80,80,"Aji Santoso"); //80,80 dan aji santoso merupakan argument,
        //harus urut dan tidak boleh dibolak balik serta sesuai dengan tipe data paramaternya
        /*tentang return value
        * return value adl nilai kembali dari suatu method, kita bisa gambarkan bahwa  parameter itu inputan,
        * return value merupakan output
        * jika kita dari tadi sudah bikin method dengan return value void maka semua operasi habis berhenti di dalam method
        * jika kita menginginkan operasi di luar method maka kita harus menggunakan return value
        * return value sudah kita senggol2 diawal, dia memiliki tipe data bisa int, double, String
        * contoh*/
        int like1 = iniObject.jmlLike(0,"Oke punya",true);
        int unlike1 = iniObject.jmlLike(like1,"very bad i think",false);
        int like2 = iniObject.jmlLike(unlike1,"just great dude",true);
        //akan terlihat lebih dinamis bukan? inilah keuntungan menggunakan return value
        //jadi variable sebelumnyaakan digunakan untuk argument variable current like
        //(misal like1 digunakan pada calling method ke dua)
        //shg kita gk perlu input manual 1,2,3 dst
        int trans1 = iniObject.makeChange(2000,5000);
        int trans2 = iniObject.makeChange(1000, trans1);
        int trans3 = iniObject.makeChange(5000, trans2);
        /*Random function
        * digunakan untuk mengacak suatu range contoh kasus pada saat kita
        * bermain dadu, pada saat kita melempar dadu maka akan terjadi random angka disana
        * dari angka 1 hingga 6
        * penulisan fungsi random dalam java adl sbb :
        * Math.random()
        * fungsi ini memiliki return value decimal (double) antara 0 hingga 1, rangnya antara 0 - 0.99
        * contoh*/
        double randNumber = Math.random(); //range : 0 - 0.99
        randNumber = randNumber * 10; // range : 0 - 9.99

        int randomInt = (int) randNumber;// casting diubah ke tipe data int
        System.out.println(randomInt);
        //calling method Dadu
        int lemparanDadu6 = Dadu(6);
        int lemparanDadu8 = Dadu(8);
        System.out.println("lemparan demgam mata dadu 6 = "+lemparanDadu6);
        System.out.println("lemparan dengan mata dadu 8 = "+lemparanDadu8);
    }
   /* static boolean btnPlay = true;
    private static void playMusic(){
        if (btnPlay){
            System.out.println("Music is playing");
        }else{
            System.out.println("Music is pause");
        }
    }*/
    //first method
    boolean btnPlay = true;
    private void playMusic(){
        if (btnPlay){
            System.out.println("Music is playing");
        }else{
            System.out.println("Music is pause");
        }
    }
    //method with paramater
    private void nilaiSiswa(int matika, int bindo, String nama){ //variable matika bindo dan nama merupakan paramater
        if (matika > bindo){
            System.out.println(nama+", kamu lebih jago di pelajaran matematika");
        }else if (matika == bindo){
            System.out.println(nama+", pengetahuan kamu di matematika dan bahasa indon sama");
        }
        else{
            System.out.println(nama+", kamu lebih jago di pelajaran bahasa indon");
        }
        System.out.println("=========Detail nilai===========");
        System.out.println("Matematika :"+matika);
        System.out.println("bahasa Indon :"+bindo);
        System.out.println("=========*************==========");
    }
    //method dengan return value
    private int jmlLike(int currentLikes, String comments, boolean likes){
        System.out.println("Komentar: "+comments);
        if (likes){
            currentLikes = currentLikes + 1;
        }
        System.out.println("Likes: "+currentLikes);
        return currentLikes;
    }
    //sistem kasir
    private int makeChange(int itemCost, int dolarProvided){
        int change = dolarProvided - itemCost;
        if (change < 0){
            System.out.println("Duit anda sekarang "+dolarProvided);
            System.out.println("Tambahan belanja anda "+itemCost);
            System.out.println("sehingga kurang Rp "+change);
            change = 0;
        }
        System.out.println("uang kembali Rp"+change);
        return change;
    }
    //dadu
    private static int Dadu(int mataDadu){//supaya lebih dinamais maka kita kasih parameter untuk berapa jml maksimal mata dadu
        double acak = Math.random();
        acak = acak * mataDadu;
        acak = acak + 1;
        return (int) acak;
    }
}
