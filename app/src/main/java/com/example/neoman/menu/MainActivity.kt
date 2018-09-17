package com.example.neoman.menu

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.menu_item.view.*

class MainActivity : AppCompatActivity() {

    var gridItems=ArrayList<item>()
    var adapter:gridAdapter?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridItems.add(item("Fennec", "cute",R.drawable.fennec))
        gridItems.add(item("Owl", "wise",R.drawable.owl))
        gridItems.add(item("Lion", "fierce",R.drawable.lion))
        gridItems.add(item("Fennec", "cute",R.drawable.fennec))
        gridItems.add(item("Owl", "wise",R.drawable.owl))
        gridItems.add(item("Lion", "fierce",R.drawable.lion))
        gridItems.add(item("Fennec", "cute",R.drawable.fennec))
        gridItems.add(item("Owl", "wise",R.drawable.owl))
        gridItems.add(item("Lion", "fierce",R.drawable.lion))
        gridItems.add(item("Fennec", "cute",R.drawable.fennec))
        gridItems.add(item("Owl", "wise",R.drawable.owl))
        gridItems.add(item("Lion", "fierce",R.drawable.lion))
        gridItems.add(item("Fennec", "cute",R.drawable.fennec))
        gridItems.add(item("Owl", "wise",R.drawable.owl))
        gridItems.add(item("Lion", "fierce",R.drawable.lion))
        gridItems.add(item("Fennec", "cute",R.drawable.fennec))
        gridItems.add(item("Owl", "wise",R.drawable.owl))
        gridItems.add(item("Lion", "fierce",R.drawable.lion))
        gridItems.add(item("Fennec", "cute",R.drawable.fennec))
        gridItems.add(item("Owl", "wise",R.drawable.owl))
        gridItems.add(item("Lion", "fierce",R.drawable.lion))

        adapter=gridAdapter(this,gridItems)
        Grid.adapter=adapter
    }

    class gridAdapter:BaseAdapter{
        var gridItems=ArrayList<item>()
        var context: Context?=null
        constructor(context: Context, gridItems:ArrayList<item>):super(){
            this.context=context
            this.gridItems=gridItems
        }
        override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
            val gridItem=gridItems[p0]
            var inflator=context!!.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            var view:View
            view=inflator.inflate(R.layout.menu_item,null)
            view.Pic.setImageResource(gridItem.img!!)
            view.Cap.text=gridItem.name
            view.setOnClickListener{
                val intent= Intent(context,ItemInfo::class.java)
                intent.putExtra("name",gridItem.name)
                intent.putExtra("desc",gridItem.desc)
                intent.putExtra("pic",gridItem.img!!)
                //intent.putExtra("index",p0)
                context!!.startActivity(intent)
            }
            return view
        }

        override fun getItem(p0: Int): Any {
            return gridItems[p0]
        }

        override fun getItemId(p0: Int): Long {
            return p0.toLong()
        }

        override fun getCount(): Int {
            return gridItems.size
        }

    }
}
