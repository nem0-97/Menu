package com.example.neoman.menu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_item_info.*

class ItemInfo : AppCompatActivity() {

    var index:Int?=null
    var pic:Int?=null
    var name:String?=null
    var desc:String?=null
    var pred:Boolean?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_info)
        val b:Bundle=intent.extras
        name=b.get("name") as String
        desc=b.get("desc") as String
        pic=b.get("pic") as Int
        //index=b.get("index") as Int
        Pic.setImageResource(pic!!)
        Name.text=name
        Desc.text=desc
    }
}
