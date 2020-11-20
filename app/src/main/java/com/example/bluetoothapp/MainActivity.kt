package com.example.bluetoothapp

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothManager
import android.content.Context
import android.content.Intent
import android.icu.number.IntegerWidth
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // Initializes Bluetooth adapter.
//    val bluetoothManager = getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
//    val bluetoothAdapter = bluetoothManager.adapter
    lateinit var bAdapter: BluetoothAdapter

    var b:String?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bAdapter = BluetoothAdapter.getDefaultAdapter()
        if(bAdapter==null){
            bluetoothStatusTv.text="Bluetooth not available"
            // No more findViewById in Kotlin
        }else {
            bluetoothStatusTv.text = "Bluetooth available"
        }

        //
        val intent = Intent(this, SecondActivity::class.java)


    }

}