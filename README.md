# ProjectUASMobile

Nama              : Nadya Khairunnisa

NIM               : 312210133

Kelas             : TI.22 A.1

Mata Kuliah       : Pemrograman Mobile 1

Dosen Pengampu    : Donny Maulana, S.Kom., M.M.S.I.

# Perintah Tugas

Perintah tugas kali ini adalah mengumpulkan semua hasil yang sudah dibuat dari pertemuan pertama sampai akhir, hasil - hasil tersebut digabungkan dalam satu Aplikasi. Berikut ini semua code yang telah saya buat.

# Penjelasan Aplikasi

Sebelumnya saya akan menjelaskan terlebih dahulu, ada apa saja didalam aplikasi ini. Berikut ini adalah daftarnya :

- Activity Hello World , di activity ini adalah awal dari pengenalan terhadap software Android studio. Didalam activity ini hanya terdapat kalimat yang bertuliskan "Hello_World"
- Activity Count ,  activity ini berisi program penghitungan bilangan fibonnaci yang sebelumnya telah diperintahkan untuk dibuat,
- Activity Scroll Movie , activity ini berisi sinopsis film dokumenter ICE COLD, sinopsis yang banyak digunakan untuk pembelajaran fungsi scroll didalam aplikasi android ini.
- Activity TwoActivity ,  twoactivity ini adalah sebuah program perpesanan atau chatting, yang menggunakan dua activity.
- Program Open Alarm , nah program ini berbeda dari sebelumnya, disini tidak menggunakan layout activity.xml karena program ini hanya berfungsi sebagai pembuka dan pengatur alarm dalam sebuah smartphone android.
- Program Open Map ,  sama seperti program alarm, program open map ini hanya berupa sebuah tombol yang berfungsi sebagai pembuka aplikasi google maps yang tersedia di dalam smartphone Android.
- Activity Fragment , activity ini adalah sebuah activity yang terdiri dari beberapa fragment. Disini fragmentnya berperan sebagai penampil film dengan genre yang berbeda, seperti action, comedy, dan romance.

# Source Code

Disini saya tidak akan menampilkan source codenya disini, karena akan terlalu banyak dan memakan tempat dan hanya membuat pusing melihatnya. Saya sudah push semua file dari project yang sudah saya buat dan jika menginginkan bisa mendownload beberapa file yang dibutuhkan saja atau clone repository ini sepenuhnya. Sebagai gantinya, saya hanya akan menjelaskan sedikit dari apa saja yang sudah saya kerjakan.

a. Source Code Splash Launcher

- SplashScreen.java

Didalamnya berisi code java, untuk menjalankan fungsi splash launcher. Lebih jelasnya splash launcher ini adalah menampilkan gambar/logo/icon ketika kita pertama kali membuka aplikasi, atau sebelum menuju kehalaman utama.

- backgroundlauncher.xml

Ini adalah logo yang saya gunakan, saya menggunakan logo dari android studio nya

b. Source Code Utama

- MainActivity.java

Di MainActivity ini berisi program java yang memiliki fungsi penghubung dari semua activity yang disebut intent dan fungsi tombol open alarm dan open map. Saya beri nama file ini Main karena disinilah fungsi paling awal dari halaman awal.

- activity_main.xml

Ini adalah layout dari halaman awal aplikasi ini. Layout ini terhubung dengan MainActivity.java tadi. Dilayout ini menampilkan semua tombol tombol dari berbagai activity dan program yang sudah dijelaskan diatas. Beginilah tampilan dari layoutnya :

![WhatsApp Image 2024-01-13 at 17 42 33_2be7876e](https://github.com/nadyakhorun/ProjectUASMobile/assets/115801823/d25b08b3-171b-4acc-8174-8ab2a7581ca5)

> Iconnya disini sudah Saya usahakan agar sesuai dengan identitas dari activitynya.

- AndroidManifest.xml

Di AndroidManifest.xml ini berfungsi untuk mengaktifkan permission yang dibutuhkan dibeberapa activity. Selain itu, AndroidManifest.xml ini juga harus dilakukan pengeditan jika kita menambah sebuah tombol atau activity baru yang berhubungan dengan intent, agar activity tersebut dapat dibuka nantinya.

- string.xml

String.xml ini adalah sebuah values, values ini berisi teks-teks dari tombol - isi - atau apapun itu yang berhubungan dengan teks.

- color.xml

Sama seperti string, colors.xml ini juga merupakan sebuah values, tapi bedanya values ini berisi code-code warna yang sudah dibuat menjadi ID atau identitas yang bertujuan untuk memudahkan dalam pemanggilan warnanya di dalam coding.

c. Source Code Activity Hello World

- HelloActivity.java

Disini saya tidak mengubah apapun isi dari javanya, dengan kata lain saya buat default dari awal dibuat.

- activity_hello.xml

Seperti yang sudah diketahui ini merupakan layout yang terhubung dengan java nya. Saya hanya menambahkan textview untuk menampilkan android:text "hello_world" nya (text sudah ada di string.xml), selain itu saya juga mengubah warna text dan menambahkan background agar terlihat lebih menarik.

- Hasil Run Hello World

![WhatsApp Image 2024-01-13 at 17 47 44_4cded5ba](https://github.com/nadyakhorun/ProjectUASMobile/assets/115801823/df14391a-26dc-4d55-9609-ce01e8392698)

d. Source Code Activity Count

- CountActivity.java

Tentunya disini berisi code java untuk menjalankan fungsi perhitungan dari rumus fibonnaci. Bilangan fibonnaci adalah bilangan yang rumusnya adalah menambah sebuah bilangan dengan bilangan sebelumnya. Contohnya 1, 1, 2, 3, 5, 8... 

- activity_count.xml

Ini adalah layout dari activity count, ada beberapa tombol disini seperti set limit, count, dan reset. Angka yang ditampilkan juga sudah menggunakan code warna, agar setiap angka yang ditampilkan memiliki warna yang berbeda dengan angka sebelumnya.

- Hasil Run Count

https://github.com/nadyakhorun/ProjectUASMobile/assets/115801823/09ba0be8-96a6-4694-a9e2-a1e83e4f04b2

e. Source Code Activity Scroll Movie

- SianidaActivity.java

Disini saya tidak mengubah apapun isi dari javanya, dengan kata lain saya buat default sedari awal dibuat.

- activity_sianida.xml

Layout inilah yang mempengaruhi dan memberikan alasan kenapa di javanya tidak ada perubahan. Disini, digunakan sebuah scrollview yang bisa menjadikan text yang begitu panjang dan tidak muat dalam satu layar penuh, maka dengan ini kita bisa membaca semua isi kontennya hanya dengan cara scroll layar.

- Hasil Run Sianida

https://github.com/nadyakhorun/ProjectUASMobile/assets/115801823/fd95674c-788f-4931-a18d-0ca977ef728c

f. Source Code Activity TwoActivity

- TwoActivity.java & TwoAct2Activity.java

Kedua java berisi fungsi untuk menjalankan program perpesanan. Kedua java tersebut memiliki peran masing-masing, yang pertama untuk pengirim dan yang kedua untuk fungsi ketika pesan berhasil terkirim.

- activity_twoact.xml & activity_twoact2.xml

Kedua layout ini merupakan tampilannya, yang pertama berfungsi menampilkan saat mengirim pesan dan yang kedua menampilkan saat pesan berhasil terkirim.

- Hasil Run TwoActivity

https://github.com/nadyakhorun/ProjectUASMobile/assets/115801823/7c96daf0-cc86-4570-950c-b9f6353c9be2

g. Source Code Alarm

- Karena program ini hanya merupakan tombol, maka hanya tinggal menambahkan baris code berikut:

        # Tambahkan code ini didalam protected void OnCreate :
              findViewById(R.id.btnSetAlarm).setOnClickListener(v -> {
                  // Panggil metode untuk mengatur alarm
                  setAlarm();
              });
          }
        
        # Lalu code tambahkan fungsi intent untuk tombolnya :
          private void setAlarm() {
              Intent alarm = new Intent(AlarmClock.ACTION_SET_ALARM);
              startActivity(alarm);
          }

- Tidak hanya itu, perlu ditambahkan juga beberapa baris code di AndroidManifest.xml, seperti 
ini: 

          <uses-permission
                android:name="com.android.alarm.permission.SET_ALARM" />
          
          dan
              <action android:name="android.intent.action.SET_ALARM" />
  
- Hasil Run Alarm

https://github.com/nadyakhorun/ProjectUASMobile/assets/115801823/98fb01b5-5acc-49cb-8788-60618229ee00

h. Source Code Open Map

- Sama halnya seperti program alarm yang hanya menggunakan fungsi sebuah tombol, maka hanya code inilah yang diperlukan untuk dapat menjalankan dan membuka maps nya.

      # Tambahkan code ini didalam protected void OnCreate :
      ImageButton btnshowMap = findViewById(R.id.btnshowMap);
          btnshowMap.setOnClickListener(v -> {
              Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:-6.324307,107.169273"));
              map.setPackage("com.google.android.apps.maps");
              startActivity(map);
          });

- Hasil Run Open Map

https://github.com/nadyakhorun/ProjectUASMobile/assets/115801823/2c95bd32-409f-4c0c-9d25-94ab2d3a4174

i. Source Code Activity Fragment

Berbeda dari activity sebelumnya, di activity ini memerlukan banyak java dan layout, karena activity ini terdiri dari beberapa halaman. Perintah tugas dari activity ini adalah, membuat sebuah program atau aplikasi menampilkan daftar film sesuai dengan genre nya. Dan genre yang diperintahkan untuk dibuat ada tiga buah, yakni Action, Comedy, dan Romance.

- FragmentActivity.java

Java yang ini berfungsi sebagai fungsi dari halaman utamanya. Didalamnya terdapat code untuk switch atau berpindah antar fragment dari action/comedy/romance. Nah agar code fragment tersebut dapat berjalan, perlu ditambahkan sebuah depedencies baru di build.gradlenya, berikut dependenciesnya :

      implementation("androidx.fragment:fragment:$fragmentVersion")

> Perlu diingat jika menambahkan dependencies baru, perlu dilakukan sync terlebih dahulu.

- activity_fragment.xml

Inilah layout yang terhubung dengan FragmentActivity.java, layout ini adalah tampilan basic atau tampilan utama yang masih kosong, didalamnya terdapat 3 tombol untuk berpindah antar fragment nya.

- FirstFragment.java, SecondFragment.java, ThirdFragment.java

Nah ketiga java ini didalamnya terdapat fungsi untuk menampilkan list film yang ada, dan fungsi memutar trailer video ketika poster atau gambar filmnya ditekan. Video tersebut berasal dari link youtube yang saya tambahkan sesuai dengan film apa yang ada di masing masing fragment nya. Untuk menggunakan fungsi ini perlu ditambahkan depedencies di build.gradle nya. Saya menggunakan library yang bernama youtube player dari pierfrancescosoffritti, berikut dependenciesnya :

      implementation("com.pierfrancescosoffritti.androidyoutubeplayer:core:11.0.1")

> Perlu diingat jika menambahkan dependencies baru, perlu dilakukan sync terlebih dahulu.

- fragment_first.xml, fragment_second.xml, fragment_third.xml

Ketiga xml ini merupakan layout atau tampilan dari masing-masing fragment, didalamnya menampilkan daftar film sesuai dengan genrenya. Layout ini terhubung dengan ketiga java diatas.

- Hasil Run Fragment

https://github.com/nadyakhorun/ProjectUASMobile/assets/115801823/2b053015-00cd-4568-819b-02346b3d550c

# Hasil Akhir dari semua Activity

https://github.com/nadyakhorun/ProjectUASMobile/assets/115801823/19afb2b3-189c-46d2-87f4-f4a1f3569bd6

# Sekian Terima Kasih
