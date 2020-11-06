package com.example.contactlist_demo

import android.annotation.SuppressLint
import android.app.SearchManager
import android.content.Context
import android.content.Intent
import android.content.pm.ActivityInfo
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.provider.ContactsContract
import android.provider.MediaStore
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.Display
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.SearchView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager

import kotlinx.android.synthetic.main.fragment_contact_list.*
import java.util.Locale.filter


class MainActivity : AppCompatActivity(),OnContactClickListener{

    var cont = ArrayList<Model>()
    lateinit var etsearh : EditText
    private lateinit var myAdapter: MyAdapter

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        myAdapter = MyAdapter(cont,this,this)
        rcvcontactlist.layoutManager = LinearLayoutManager(this)
        rcvcontactlist.adapter = myAdapter
        myAdapter.notifyDataSetChanged()

        val contact = contentResolver.query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,null)
        while (contact!!.moveToNext()){
            var name = contact.getString(contact.getColumnIndex(ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME))
            var number = contact.getString(contact.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER))
            var obj = Model("bnb","njm",image = null)
            obj.name = name
            obj.number = number

            var photo = contact.getString(contact.getColumnIndex(ContactsContract.CommonDataKinds.Phone.PHOTO_URI))
            if (photo != null){
                obj.image = MediaStore.Images.Media.getBitmap(contentResolver, Uri.parse(photo))
            }

            cont.add(obj)
        }
        contact.close()



        etsearh =findViewById<EditText>(R.id.etsearch)

       etsearh.addTextChangedListener(object  : TextWatcher{
           override fun afterTextChanged(p0: Editable?) {
               filterList(p0.toString())
           }

           override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

           }

           override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

           }
       })

    }

    private fun filterList(filterItem: String) {

        var templist:MutableList<Model> = ArrayList()
        for (i in cont){
            if (filterItem in i.name.toLowerCase()){
                templist.add(i)
            }
        }
        myAdapter.updateList(templist)
    }

    override fun OnIteamClock(position: Int) {
        var intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("number",cont[position].number)
        startActivity(intent)
    }

}
