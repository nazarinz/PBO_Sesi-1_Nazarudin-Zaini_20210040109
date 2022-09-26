# PBO_Sesi-1_Nazarudin-Zaini_20210040109
MataKuliah Pemrograman Berorientasi Objek - Sesi 1
Kelas : TI21E

Versi terbaru dari Java(JDK) adalah versi 19, yang dimana versi tersebut memiliki beberapa fitur-fitur yang ditambahkan beserta kelebihan-kelebihannya yaitu : 
Fitur yang ditambahkan : 
•	JEP 405: Record Patterns (Preview) : Tingkatkan bahasa pemrograman Java dengan pola record untuk mendekonstruksi nilai record. Pola rekaman dan pola tipe dapat disarangkan untuk mengaktifkan bentuk navigasi dan pemrosesan data yang kuat, deklaratif, dan dapat disusun.
•	JEP 422: Linux/RISC-V Port : Port JDK ke Linux/RISC-V.
•	JEP 424: Foreign Function & Memory API (Preview) : Memperkenalkan API dimana program Java dapat beroperasi dengan kode dan data di luar runtime Java. Dengan menjalankan fungsi asing secara efisien (yaitu, kode di luar JVM), dan dengan mengakses memori asing dengan aman (yaitu, memori yang tidak dikelola oleh JVM), API memungkinkan program Java untuk memanggil pustaka asli dan memproses data asli tanpa kerapuhan dan bahaya dari JNI.
•	JEP 425: Virtual Threads (Preview) : Memperkenalkan utas virtual ke Platform Java. Utas virtual adalah utas ringan yang secara dramatis mengurangi upaya menulis, memelihara, dan mengamati aplikasi bersamaan dengan throughput tinggi.
•	JEP 426: Vector API (Fourth Incubator) : Memperkenalkan API untuk mengekspresikan komputasi vektor yang dikompilasi secara andal saat runtime ke instruksi vektor optimal pada arsitektur CPU yang didukung, sehingga mencapai kinerja yang lebih unggul daripada komputasi skalar yang setara.
•	JEP 427: Pattern Matching for switch (Third Preview) : Tingkatkan bahasa pemrograman Java dengan pencocokan pola untuk switch ekspresi dan pernyataan. Memperluas pencocokan pola untuk switchmemungkinkan ekspresi diuji terhadap sejumlah pola, masing-masing dengan tindakan tertentu, sehingga kueri berorientasi data yang kompleks dapat diekspresikan secara ringkas dan aman.
•	JEP 428: Structured Concurrency (Incubator) : Sederhanakan pemrograman multithread dengan memperkenalkan API untuk konkurensi terstruktur . Konkurensi terstruktur memperlakukan banyak tugas yang berjalan di utas yang berbeda sebagai satu unit kerja, sehingga merampingkan penanganan dan pembatalan kesalahan, meningkatkan keandalan, dan meningkatkan kemampuan pengamatan.

- Pratinjau utas virtual, yang merupakan utas ringan yang secara dramatis mengurangi upaya penulisan, pemeliharaan, dan pengamatan throughput tinggi, 
aplikasi bersamaan. Sasarannya termasuk mengaktifkan aplikasi server yang ditulis dalam gaya thread-per-request sederhana untuk diskalakan dengan penggunaan 
perangkat keras yang hampir optimal, mengaktifkan kode yang ada yang menggunakan Java.lang Thread API untuk mengadopsi thread virtual dengan perubahan minimal, 
dan mengaktifkan pemecahan masalah, debugging, dan pembuatan profil utas virtual dengan alat JDK yang ada. Proposal ini bukan bertujuan untuk mengubah model 
konkurensi dasar di Java atau menawarkan konstruksi paralelisme data baru dalam bahasa Java atau pustaka Java. Juga bukan tujuan untuk menghapus implementasi 
tradisional dari utas atau memigrasikan aplikasi yang ada secara diam-diam untuk menggunakan utas virtual. Fitur ini juga merupakan bagian dari Project Loom.

- Konkurensi terstruktur, dalam fase inkubator, dimaksudkan untuk menyederhanakan pemrograman multithread melalui API konkurensi terstruktur. 
Konkurensi ini memperlakukan beberapa tugas yang berjalan di utas yang berbeda sebagai satu unit kerja, untuk merampingkan penanganan dan pembatalan kesalahan. 
Keandalan dan observabilitas ditingkatkan. Fitur ini berasal dari Project Loom, yang memperkenalkan model konkurensi ringan baru.

- Pratinjau pola rekaman, untuk mendekonstruksi nilai rekaman. Pola rekaman dan pola tipe dapat disarangkan untuk mengaktifkan bentuk navigasi dan pemrosesan data 
yang deklaratif, kuat, dan dapat disusun. Sasaran proposal mencakup perluasan pencocokan pola untuk mengekspresikan kueri data yang lebih canggih dan dapat 
dikomposisi tanpa mengubah sintaks atau semantik pola tipe. Proposal ini dibuat berdasarkan pencocokan pola untuk instanceof, yang dikirimkan dalam JDK 16 pada 
Maret 2021. Rencana di masa mendatang mungkin memerlukan pola rekaman untuk diperluas dengan kemampuan seperti pola larik dan pola vararg. Pola rekaman adalah 
bagian dari Project Amber, upaya untuk mengeksplorasi dan menginkubasi fitur Java yang lebih kecil dan berorientasi pada produktivitas.
