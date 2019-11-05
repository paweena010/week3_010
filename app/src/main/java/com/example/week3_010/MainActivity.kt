package com.example.week3_010

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    public final var TAG_FNAME = "FNAME"
    public final var TAG_LNAME = "LNAME"
    public final var TAG_AGE = "AGE"
    public final var TAG_ADD = "ADD"
    public final var TAG_PHONE = "PHONE"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("หน้าแรก")

        btn_sender.setOnClickListener {
            //ดึงค่าจาก edittext
            var fname = et_fname.text.toString()
            var lname = et_lname.text.toString()
            var age = et_age.text.toString()
            var add = et_add.text.toString()
            var phone = et_phone.text.toString()
            //เรียกใช้ met
            senderFun(fname,lname,age,add,phone)

        }
        btn_clear.setOnClickListener {
            //ล้างข้อมูล
            et_fname.setText("")
            et_lname.setText("")
            et_age.setText("")
            et_add.setText("")
            et_phone.setText("")

        }
        btn_close_app.setOnClickListener {
            //ปิด
            finish()

        }
    }
    fun senderFun(str1 : String ,str2 : String,str3 : String,str4 : String,str5 : String){

        var  goPageSecond = Intent( this,SecoundAcitivity ::class.java)

        goPageSecond.putExtra(TAG_FNAME,str1)
        goPageSecond.putExtra(TAG_LNAME,str2)
        goPageSecond.putExtra(TAG_AGE,str3)
        goPageSecond.putExtra(TAG_ADD,str4)
        goPageSecond.putExtra(TAG_PHONE,str5)


        startActivity(goPageSecond)
    }
}
