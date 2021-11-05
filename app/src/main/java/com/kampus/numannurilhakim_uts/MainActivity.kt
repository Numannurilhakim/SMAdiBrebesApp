package com.kampus.numannurilhakim_uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        //set actionbar title
        actionbar!!.title = "sekolah menengah atas di kecamatan brebes"
        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable. sma1," SMA NEGRI 1 BREBES","Jl. Dr. Setiabudi No. 11, Brebes 52212, Jawa Tengah.",
            "SMA Negeri 1 Brebes merupakan satu satunya sekolah rujukan di kabupaten Brebes " +
                    "dan juga salah satu Rintisan Sekolah Kategori Mandiri (RSKM) di mana kurikulum yang " +
                    "digunakan kurikulum tingkat satuan pendidikan (KTSP). Dengan RSKM berarti SMA Negeri 1 Brebes " +
                    "menuju ke SKM yaitu Sekolah Kategori Mandiri. SMA Negeri 1 Brebes merupakan SMA " +
                    "yang pertama kali ada di Kabupaten Brebes dan beralamat " +
                    "di Jl. Dr. Setiabudi No. 11, Brebes 52212, Jawa Tengah."))

        data?.add(DataModel(R.drawable.sma2,"SMA NEGRI 2 BREBES","Jl. Ahmad Yani No. 77, Brebes",
            "Sekolah Menengah Atas Negeri 2 Brebes atau dikenal juga dengan nama SMANDABES" +
                    " adalah salah satu Sekolah Menengah Atas Negeri yang berada di bilangan" +
                    " Jl. Ahmad Yani No. 77, Brebes, Kabupaten Brebes, Jawa Tengah." +
                    " Sekolah ini adalah sekolah favorit dan unggulan yang ada di Kabupaten Brebes " +
                    "dan dianugerahi serta dipercaya oleh pemerintah sebagai Rintisan Sekolah Bertaraf" +
                    " Internasional (RSBI). Seperti sekolah pada umumnya, pendidikan di SMA Negeri 2 Brebes " +
                    "ditempuh dalam waktu 3 tahun dengan pilihan program MIPA dan program IPS"))

        data?.add(DataModel(R.drawable.sma3,"SMA NEGRI 3 BREBES","Jl. MT Haryono No 78 Brebes",
            "SMA Negeri 3 Brebes adalah satu sekolah menengah atas negeri di Kabupaten Brebes, " +
                    "Indonesia. Sekolah ini terletak di Jl. MT Haryono No 78 Brebes, Kecamatan Brebes," +
                    " Kabupaten Brebes, pada awalnya sekolah ini merupakan sekolah swasta yang " +
                    "bernama SMA Pusponegoro 1 Brebes. SMA Pusponegoro 1 Brebes berdiri pada " +
                    "tanggal 9 Januari 1978. Pada hari Juma’at jam 14.00, telah resmi didirikan" +
                    " SMA Pusponegoro 1 Brebes oleh Bupati Brebes Bapak Sartono Gondho Suwandito, " +
                    "SH. Pada awal berdirinya sekolah ini, jumlah siswa tahun pelajaran 1978/1979" +
                    " sebanyak 147 siswa dengan kegiatan pembelajaran bertempat di SDN 1 Brebes. " +
                    "Sebagai kepala sekolah telah dipilih oleh Bapak Drs. Hadi Kusmanto yaitu bapak " +
                    "Drs.Sunardi sebagai putra terbaik pada jajaran Kandepdikbud Brebes dan dia" +
                    " telah berpengalaman menjadi kepala salah satu sekolah swasta di Brebes, sedangkan" +
                    " para guru sebagian besar diampu dari SMA Negeri 1 Brebes maupun pemerintah daerah " +
                    "dan jajaran Kandepdikbud Brebes."))

        data?.add(DataModel(R.drawable.smk1,"SMK NEGRI 1 BREBES","JL. Setiabudi Brebes",
            "SMK Negeri 01 Brebes didirikan oleh Bapak SUWARDI ( Sekarang Ketua Dewan Pendidikan " +
                    "Kab. Brebes ) dan berdiri sejak tahun 1967 dengan nama SMEA (Sekolah Menengah Ekonomi Atas)" +
                    " BREBES dan kepala sekoalah pertama Bapak ACHMAD HASAN MASRI, BA. dengan jurusan" +
                    " kependidikan untuk pertama kalinya Tata Niaga ( TN ) atau yang sekarang dikenal dengan" +
                    " Bisnis Managemen ( Penjualan ). SMEA BREBES untuk pertama kalinya nempati Gedung " +
                    "Nasional yang letaknya di Jl. Pangeran Dipenogoro Brebes .Selang waktu 1 tahun setelah" +
                    " didirikan SMEA BREBES menjadi sekolah negeri berdasarkan SK " +
                    "Penegrian No. : 38/PP/IV/_67.Tgl.12-02-1967 yang mulai berlaku per Januari 1968."))

        data?.add(DataModel(R.drawable.smkkaryabakti,"SMK KARYABAKTI BREBES","JL. TAMAN SISWA NO. 1 BREBES",
              "SMKS KARYA BHAKTI BREBES adalah salah satu satuan pendidikan dengan jenjang " +
                      "SMK di Brebes, Kec. Brebes, Kab. Brebes, Jawa Tengah. Dalam menjalankan kegiatannya," +
                      " SMKS KARYA BHAKTI BREBES berada di bawah naungan Kementerian Pendidikan dan Kebudayaan," +
                      " SMKS KARYA BHAKTI BREBES beralamat di JL. TAMAN SISWA NO. 1 BREBES, Brebes, " +
                      "Kec. Brebes, Kab. Brebes, Jawa Tengah, dengan kode pos 52212, " +
                      "SMKS KARYA BHAKTI BREBES memiliki akreditasi A, berdasarkan sertifikat " +
                      "047/BANSM-JTG/SK/XII/2018."))

        data?.add(DataModel(R.drawable.smkpgri,"SMK PGRI BREBES","Jl. Taman Siswa No.7 Brebes. ",
            "SMK PGRI BREBES adalah sekolah kejuruan swasta yang ada di kota Kabupaten Brebes, " +
                    "letaknya di Jl. Taman Siswa No.7 Brebes. Sekolah kejuruan didirikan pada tahun 2013 " +
                    "dengan 3 program studi andalannya yaitu Otomotif Teknik Bisnis & Sepeda Motor," +
                    " Elektronika Teknik Audio Video, dan Keuangan Akuntansi. Sekolah yang pada tahun " +
                    "2018 sudah terakreditasi B (Baik) dengan sarana dan prasarana yang memadai serta " +
                    "fasilitas lain yang sangat mendukung.\n" +
                    "Semoga kedepannya sekolah SMK PGRI Brebes menjadi sekolah kebanggaan masyarakat " +
                    "Brebes yang berprestasi dan berkarya menciptakan peserta didik yang kompeten dan" +
                    " berdaya saing tinggi, sehingga tidak kalah dengan perkembangan zaman yang semakin" +
                    " komplek. Terimakasih atas semua dukungannya sehingga sekolah SMK PGRI Brebes dapat " +
                    "menjadi sekolah unggul dan andalan masyarakat Brebes.\n"))

        data?.add(DataModel(R.drawable.smkfarmasi,"SMK FARMASI YPIB","JL TAMAN SISWA NO 3 ",
            "SMK Farmasi YPIB Brebes  adalah sekolah kejuruan swasta yang ada di kota Kabupaten" +
                    " Brebes , Sekolah kejuruan ini ada beberapa jurusan yaitu ada analis Kesehatan, " +
                    "perawat kesehatan, farmasi dan sekola ini memiliki 2 gedung yang berbeda , " +
                    "Gedung yang pertama tepatnya di jalan taman siswa dan untuk Gedung yang ke dua" +
                    " yaitu di jalan raya jatibarang , terlangu."))


        data?.add(DataModel(R.drawable.puspo,"SMK PUSPONEGORO BREBES"," JL. LETJEN SUPRAPTO NO. 176 PASARBATANG BREBES, Pasar Batang, Kec. Brebes",
            "SMK Pusponegoro 01 Brebes merupakan salah satu Sekolah Menengah Kejuruan swasta " +
                    "yang ada di kabupaten Brebes. pada awal berdiri, SMK Pusponegoro 01 Brebes memiliki " +
                    "nama STM Pemda Brebes dibawah naungan Yayasan Pendidikan Pusponegoro 01. semakin banyaknya" +
                    " kebutuhan sumber daya manusia dibidang industri menjadi dasar pendirian Sekolah Menengah " +
                    "Kejuruan ini sehingga pada tanggal 2 Januari 1974 didirikan Badan Pembina STM Pemda yang " +
                    "dirintis oleh YayasanPendidikan Pusponegoro Brebes.\n" +
                    "SMK Pusponegoro 01 brebes memiliki tiga program studi keahlian yaitu Teknik Bangunan," +
                    " Teknik Kendaraan Ringan, Teknik Audio Video, Dan Akuntansi.\n"))
        data?.add(DataModel(R.drawable.man1,"MAN 1 BREBES"," di JL.YOS SUDARSO (KOMPLEK ISLAMIC CENTER) BREBES, Pasar Batang, Kec. Brebes, Kab. Brebes, Jawa Tengah",
            "MAN 1 BREBES adalah salah satu satuan pendidikan dengan jenjang MA di Pasar Batang, Kec. Brebes, Kab. Brebes, Jawa Tengah. Dalam menjalankan" +
                    " kegiatannya, MAN 1 BREBES berada di bawah naungan Kementerian Agama," +
                    " MAN 1 BREBES beralamat di JL.YOS SUDARSO (KOMPLEK ISLAMIC CENTER) BREBES, " +
                    "Pasar Batang, Kec. Brebes, Kab. Brebes, Jawa Tengah, AN 1 BREBES memiliki " +
                    "akreditasi A, berdasarkan sertifikat 047/BANSM-JTG/SK/XII/2018."))

        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("nama", item?.nama)
                intent.putExtra("alamat", item?.alamat)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
            }

        })


    }
}