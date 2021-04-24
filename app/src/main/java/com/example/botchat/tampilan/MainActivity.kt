package com.example.botchat.tampilan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.botchat.R
import com.example.botchat.data.Pesan

class MainActivity : AppCompatActivity() {
    var MessageList= mutableListOf<Pesan>()
    lateinit var adapter: PesanAdapter
    val BotList= listOf("Qiqi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        recyclerView()
        
        clickEvent()
        
        val random=(0..3).random()
        customBotMessage("Hai hari ini anda berbicara dengan ${BotList[random]}, ada yang bisa saya bantu?")
    }

    private fun customBotMessage(s: String) {

    }

    private fun clickEvent() {
        TODO("Not yet implemented")
    }

    private fun recyclerView() {
        TODO("Not yet implemented")
    }
}