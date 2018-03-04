package WorkFlow;


public class BelajarDecision {
    public static void main(String[]args){
        /*If
        * ketika kita udah belajar tentang tipe data angka, kali ini kita akan gunakan tipe data decision
        * knp? karena if digunakan ketika kita dihadapkan pada sebuah kondisi
        * contoh case pada kehidupan kita adl kondisi hujan atau tidak hujan, ketika hujan maka kita perlu
        * mantol ketika tidak hujan maka kita tidak perlu mantol
        * implementasi program*/
        // declare and inisialize
        boolean hujan = false;

        if (hujan){
            // jika variable hujan true ini akan dicetak
            System.out.println("Hari ini hujan, aku perlu mantol");
        }else {
            //jika false maka ini yg keluar
            /*jadi gunanya else ini digunakan ketika kondisi if sudah tidak terpenuhi
            * kalau kondisi di if tak terpenuhi maka akan di lewati dan mengeksekusi apa yg ada di else*/
            System.out.println("Hari ini cerah, aku tak butuh mantol");
        }

        /* Variable scope
        * cangkupan variable, setiap variable punya cangkupannya sendiri2 tergantung
        * dimana kita mendeklarasikan / inisialisasi
        * nanti kita akan kenal dengan lokal variable, instance variable, global variable
        * contoh program*/

        if (hujan){
            int suhu = 23; //cangkupan variable suhu cuman di statement if aja ya.
            System.out.println("Suhu sekarang adalah "+suhu);
        }else {
           /* suhu = suhu+1; kalau mau pake variable suhu disini gk bisa
           * karena emang cangkupannya gk sampai sini
           */
           System.out.println("tak hujan tak apa");
        }

        /* boolean expression
        boolean expression gini: perbandingan antar dua angka bisa pake >,<,>=,<=,==,
        contoh
        * */
        boolean a = 3 > 4;
        /*ini yang dinamakan boolean ekspresion, bisa dipake untuk value dari tipe data boolean
        * bisa digunakan untuk statement if pastinya
         */
        System.out.println(a);

        /* else if
        * diawal kita sudah pake else, sementara ini kita pake else if, bedanya apa sih?
        * jika else itu akan dijalankan jika kondisi if tidak memenuhi, sementara else if
        * kita bisa menambahkan kondisi layaknya if
        * contoh */

        int ukm = 80;
        int nilai = 80;
        int bonus;

        if (nilai > ukm){
            bonus = 1000;
        }else if (nilai == ukm){
            bonus = 500;
        }else {
            bonus = 0;
        }
        System.out.println("Nilai aku : "+nilai+", aku dapat bonus "+bonus);

        /* operator logika
        paling tidak kamu tahu 3 ini
        1. AND (&&) ini akan bernilai true jika semua true
        2. OR (||) ini akan bernilai false jika semua false
        3. NOT (!) ini ingkaran, misal jika A itu true maka !A adl false dan sebaliknya
        * contoh*/
        a = 3 > 4 || 4 < 5;
        boolean b = !a;
        System.out.println(a +" "+b);

        /*nested if
        * sering dikenal juga dengan sebuta if bersarang
        * kita menginginkan if di dalam if
        * contoh*/
        int rating = 2;
        if (rating >= 0 && rating <= 5) {
            if (rating <= 2) {
                System.out.println("apa alasanmu memberikan rating rendah?");
            }
            System.out.println("Terimakasih atas feedbacknya :)");
        }
        /*Switch
        * digunakan untuk menyederhanakan statement if else
        * jika kita gunakan if else terlalu panjang maka switch lah solusinya
        * karena code itu jauh lebih pendek jika dibandingkan dengan if else
        * contoh*/
        int pascode = 123;
        String pesan;
        switch (pascode){
            case 123: pesan="kamu pesan nasi goreng";
            break;
            case 111: pesan="kamu pesan es teh";
            break;
            case 122 : pesan ="kamu pesan nasi uduk";
            break;
            default: pesan="kami tak menemukan pascode anda";
            //jadi ini dari switch itu mencocokan value apa yg ada di () dengan value yang ada di case, jika tidak ada
                // maka akan eksekusi default
        }
        System.out.println(pesan);
    }
}
