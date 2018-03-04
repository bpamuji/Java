package LearnVariable;

public class Main {
    public static void main(String[]args){
        /*
        * Belajar tipe data
        * 1. tipe data untuk angka(byte,short, int, long, float, double)
        * 2. tipe data untuk teks (String,char)
        * 3. tipe data decision (boolean)
        *
        * contoh program tipe data
        * */
        /*
        * deklarasi variable
        * pemberian nama dan menentukan tipe data
        * rule pemberian nama :
        * 1. di java itu case sensitive jd meskipun karakter sama, kapital dan nonkapital dianggap beda
        * 2. harus diawali dengan huruf tidak boleh pake angka
        * 3. tidak boleh pake spasi*/
        int panjang;
        int lebar;
        int luas;
        /*
        * inisialisasi variable
        * pemberian value
        * */
        panjang = 10;
        lebar = 5;

        /*update value
        * kita bisa pake operator*/
        panjang = panjang + 4;
        lebar = lebar - 2;

        /*operator aritmatika
        * 1. penjumlahan menggunakan (+)
        * 2. pengurangan (-)
        * 3. perkalian (*)
        * 4. pembagian(/)
        *
        * yang perlu diperhatikan adl level eksekusi di java adl sebagai berikut:
        * 1. perkalian dan pembagian
        * 2. penjumahan dan pengurangan
        *
        * maka dari itu kita harus menggunakan () jika suatu operasi di perlukan
        * contoh
        * int hasil = (10+2)*50*/
        luas = panjang * lebar;

        /*Mencetak hasil operasi
        * */
        System.out.println("===========Luas Persegi Panjang=========");
        /*penggabungan karakter atau variable dijava dinamakan concatnation yakni menggunakan tanda (+) sebagai penghubung
        * contohnya kek gini*/
        System.out.println("panjang : "+panjang+" cm");
        System.out.println("lebar : "+lebar+" cm");
        System.out.println("================************============");
        System.out.println("Hasil luas persegi = "+luas+" cm");

        /*Another operation on java
        *
        * dalam hal pembagian, ini wajib pake tipe data double
        * dan pembaginya juga pake double misalnya gini 4/3 akan berbeda dengan 4/3.0, hasilnya akan beda ini dinaman truncation
        * contoh*/

        //declaration and inisialisasi
        double b = 4/3;
        double c = 4/3.0;

        //cetak
        System.out.println(b);
        System.out.println(c);

        /*untuk menangani kasus b kita juga bisa pake yang namanya casting yaitu mengubah tipe data,
        * yang pasti tipe data dari si 4 tadi ya*/

        double B = (double)4/3;

        //cetak
        System.out.println("B = "+B); //casting can be solved this

    }
}
