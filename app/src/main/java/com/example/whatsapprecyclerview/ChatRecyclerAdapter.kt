package com.example.whatsapprecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ChatRecyclerAdapter(val context: Context, val arrChat: ArrayList<ChatModel>) :
    RecyclerView.Adapter<ChatRecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgProfileImage = itemView.findViewById<ImageView>(R.id.imgProfileImage)
        val txtUsername = itemView.findViewById<TextView>(R.id.txtUserName)
        val txtChatDescription = itemView.findViewById<TextView>(R.id.txtChatDescription)
        val txtChatTime = itemView.findViewById<TextView>(R.id.txtChatTime)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.chat_row, parent, false))
    }

    override fun getItemCount(): Int {
        return arrChat.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgProfileImage.setImageResource(arrChat[position].profileImage)
        holder.txtUsername.text = arrChat[position].userName
        holder.txtChatDescription.text = arrChat[position].chatDescription
        holder.txtChatTime.text = arrChat[position].chatTime
    }

}