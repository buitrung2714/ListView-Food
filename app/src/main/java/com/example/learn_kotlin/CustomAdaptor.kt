package com.example.learn_kotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdaptor (var context: Context, var mangmonan: ArrayList<Food>) : BaseAdapter() {
    class ViewHolder(row: View){
        var textviewFood : TextView
        var imageviewFood: ImageView

        init {
            textviewFood = row.findViewById(R.id.nameFood)
            imageviewFood = row.findViewById(R.id.imageFood)
        }
    }
    override fun getCount(): Int {
        return mangmonan.size
    }

    override fun getItem(position: Int): Any {
        return mangmonan.get(position)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertview: View?, p2: ViewGroup?): View {
        var view: View?
        var viewHolder: ViewHolder

        if(convertview == null){
            var layoutInflater: LayoutInflater = LayoutInflater.from(context)
            view = layoutInflater.inflate(R.layout.line_food, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertview
            viewHolder = convertview.tag as ViewHolder
        }
        var food : Food = getItem(position) as Food
        viewHolder.textviewFood.text = food.name
        viewHolder.imageviewFood.setImageResource(food.image)

        return view as View
    }
}