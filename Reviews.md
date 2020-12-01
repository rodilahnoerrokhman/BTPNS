# Reviews

**Ceritakan apa itu OOP, object oriented programming**

***Object Oriented Programming** (OOP) dalam bahasa Indonesia diartikan sebagai **Pemograman Berorientasi Object** merupakan metode pemrograman yang berorientasi pada objek. Beberapa objek tersebut akan saling berinteraksi untuk menyelesaikan masalah yang rumit.*

**Remark**

Jawaban terlalu dangkal. OOP mempunyai beberapa komponen penting. Hal ini tidak diterangkan.

**Score**

**2/4**

---

**Di java 8 ada dua komponen untuk implementasi abstraksi lebih baik, yaitu stream dan lambda. 
Ceritakan apa itu. Pada saat apakah kita membutuhkan stream atau lambda.**

***Stream** adalah dasar dari operasi input-output (IO) di java yang ada di dalam package java.io sebagai package utama. Stream digunakan untuk menangkap input dari device ataupun mengeluarkan output untuk device.*

***Lambda** adalah fungsi yang didefinisikan tanpa menggunakan identifier. Lambda digunakan untuk menyederhanakan kode program saat ingin menggunakan method dalam class interface, sedangkan class interface tersebut hanya memiliki 1 method.*

**Remark**

Jawaban untuk stream salah.

**Score**

**2/4**

---

**Apa perbedaan antara interface, abstract kelas.**

| Abstract Class | Interface |
| -------------- | --------- |
| Bisa berisi abstract dan non-abstract method. | Hanya boleh berisi abstract method. |
| Kita harus menuliskan sendiri modifiernya. | Kita tidak perlu susah2 menulis public abstract di depan nama method. Karena secara implisit, modifier untuk method di interface adalah public dan abstract. |
| Bisa mendeklarasikan constant dan instance variable. | Hanya bisa mendeklarasikan constant. Secara implisit variable yang dideklarasikan di interface bersifat public, static dan final. |
| Method boleh bersifat static. | Method tidak boleh bersifat static. |
| Method boleh bersifat final. | Method tidak boleh bersifat final. |
| Suatu abstact class hanya bisa mengextend satu abstract class lainnya. | Suatu interface bisa meng-extend satu atau lebih interface lainnya. |
| Suatu abstract class hanya bisa mengextend satu abstract class dan mengimplement beberapa interface. | Suatu interface hanya bisa mengextend interface lainnya. Dan tidak bisa mengimplement class atau interface lainnya.
 
 **Remark**

"Method tidak boleh bersifat static": Hubungannya karena static method harus memiliki definisi body. Bagian ini kurang tepat.
 
 **Score**
 
 **3.5/4**

___

**Apa itu functional interface, dibutuhkan pada saat apakah?**

***Functional Interface** adalah sebuah interface yang hanya mempunyai satu method abstract saja.*
 
**Remark**

Hanya menjawab satu bagian saja.

**Score**

**2/4**

---

**Terangkan apa itu SOLID principle. Apakah berguna?**

***SOLID** principle merupakan singkatan dari 5 buah prinsip yang sangat berhubungan dengan OOP. SOLID principle akan sangat berguna apabila diimplementasikan ke dalam sebuah program skala besar, alasannya dengan SOLID principle membuat class yang ada didalam program bisa dimaintenance tanpa banyak melibatkan class yang lainnya.*

 
**Remark**

Jawaban terlalu dangkal. Tidak menjawab pertanyaan kedua

**Score**

**1/4**

---

**Jika saya mempunyai integer : 1234567 , buat lah fungsi yang keluarannya 7654321 tanpa
  menggunakan library, atau string prosesing.**
  
**Remark**

Sesuai

**Score**

**2/2**

---

**Saya memiliki matrix sebagai berikut:**
  
 **Buat matrix class yang mempunya behavior untuk perkalian matrix. Coba untuk
  menyelesaikan perkalian matrix diatas.**
  
 **Remark**
 
Hasill perkalian sudah benar, namun yang dimaksud membuat kelas matrix dengan behavior / method perkalian matrix.
 
 **Score**
 
 **1.5/2**
 
 ---
 
**Apa itu unit testing. Bedakah dengan integration testing? Apa bedanya?**
 
 ***Unit Test**: pengujian bagian terkecil dari sebuah code, bagian terkecil ini adalah bisa
 sebuah fungsi, module atau class dari sistem tersebut.*
 
 ***Integration Test**: pengujian apakah gabungan dari bagian (fungsi) dari sebuah aplikasi atau system dapat bekerja sama dengan benar.*
 
 ***Perbedaannya**: lebih kepada jumlah fungsi yang ditest, Unit Test hanya fokus kepada 1 fungsi, sedangkan Integration Test fokus ke benyak fungsi yang berkaitan.*
 
 **Remark**
 
 Jawaban kurang tepat
 
 **Score**
 
 **1/4**
 
 ---
 
 **Terangkan apa itu TDD.**
 
 ***Test-driven development (TDD)** adalah proses pengembangan perangkat lunak yang bergantung pada pengulangan siklus pengembangan yang sangat singkat. Persyaratan untuk melakukan sebuah perubahan menjadi kasus uji yang sangat spesifik, maka software yang sedang dikembangkan diharuskan memenuhi test baru.*
 
 **Remark**
 
 Jawaban kurang jelas, kurang tepat. Bagian pengulangan siklusnya tepat, tapi yang lainnya kurang tepat dan jelas.
 
 **Score**
 
 **2/4**
 
 ___
 ___
 
 **Total Score**
 
 (2 + 2 + 3.5 + 2 + 1 + 2 + 1.5 + 1 + 2) / (4 + 4 + 4 + 4 + 4 + 2 + 2 + 4 + 4) =
17 / 30 = 0.57 * 100% = 57%
 
 **Nilai yang dicari**
 
 **80%**
