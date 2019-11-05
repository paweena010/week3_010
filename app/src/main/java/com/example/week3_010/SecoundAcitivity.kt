package com.example.week3_010

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.acitivity_second.*

class SecoundAcitivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.acitivity_second)
        setTitle("หน้าแรก")

        var fname = intent.extras?.getString(MainActivity().TAG_FNAME)
        var lname = intent.extras?.getString(MainActivity().TAG_LNAME)
        var age = intent.extras?.getString(MainActivity().TAG_AGE)
        var add = intent.extras?.getString(MainActivity().TAG_ADD)
        var phone = intent.extras?.getString(MainActivity().TAG_PHONE)


        tv_res_fname.setText(fname)
        tv_res_lname.setText(lname)
        tv_res_age.setText(age)
        tv_res_add.setText(add)
        tv_res_phone.setText(phone)

        btn_back.setOnClickListener {
            finish()

        }
    }
}