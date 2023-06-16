package com.cem.lambdaproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("-----Lambda-----")
        // satır içi fonksiyon tanımlamak için kullanıyoruz
        yazdir("Normal Fonksiyon")//normal bir fonksiyon çağırdık

        //Lambda ile fonksiyon
        val yazdirLambda={verilenString:String->println(verilenString)}
        yazdirLambda("Lambda Fonksiyon")

        //Lambda ile geriye değer döndürmek
        val degerLambda={a:Int,b:Int-> a*b }
        println(degerLambda(4,3))

        val carpmaLambda:(Int,Int)->Int={a,b->a*b}//bu şekilde de tanımlanabilir
        println(carpmaLambda(5,3))
    }

    fun yazdir(string: String){
        println(string)
    }
}