package com.example.botchat.tampilan


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.example.botchat.R
import com.example.botchat.data.Pesan
import com.example.botchat.utility.konstanta.KIRIM_ID
import com.example.botchat.utility.konstanta.TERIMA_ID
import kotlinx.android.synthetic.main.message_item.view.*

class PesanAdapter: RecyclerView.Adapter<PesanAdapter.PesanViewHolder>(){

    var MessageList= mutableListOf<Pesan>()
    inner class PesanViewHolder(itemView :View):RecyclerView.ViewHolder(itemView){
        init {
            itemView.setOnClickListener{
            MessageList.removeAt(adapterPosition)
            notifyItemRemoved(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PesanViewHolder {
        return PesanViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.message_item,parent,false))
    }
    override fun getItemCount(): Int {
        return MessageList.size
    }
    override fun onBindViewHolder(holder: PesanViewHolder, position: Int) {
        val currentMessage=MessageList[position]

        when(currentMessage.id ){
            KIRIM_ID ->{
                holder.itemView.tv_message.apply{
                    text=currentMessage.pesan
                    visibility=View.VISIBLE
                }
                holder.itemView.tv_bot_message.visibility = View.GONE
            }
            TERIMA_ID -> {
                holder.itemView.tv_bot_message.apply {
                    text = currentMessage.pesan
                    visibility = View.VISIBLE
                }
                holder.itemView.tv_bot_message.visibility = View.GONE
            }
        }
    }
    fun insertMessage(pesan: Pesan) {
        this.MessageList.add(pesan)
        notifyItemInserted(MessageList.size)
    }


}