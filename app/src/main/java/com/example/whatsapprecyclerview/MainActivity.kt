package com.example.whatsapprecyclerview

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.whatsapprecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var chatAdapter: ChatRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val arrChats = ArrayList<ChatModel>().apply {
            add(ChatModel(R.drawable.avatar_1, "Dipesh", "Hello", "11:00 AM"))
            add(ChatModel(R.drawable.avatar_2, "Sachin", "Hi", "11:02 AM"))
            add(ChatModel(R.drawable.avatar_3, "Sapna", "Hiiii", "10:03 AM"))
            add(ChatModel(R.drawable.avatar_4, "Deepak", "How are you?", "10:30 AM"))
            add(ChatModel(R.drawable.avatar_5, "Kushboo", "Where are you?", "11:30 AM"))
            add(ChatModel(R.drawable.avatar_6, "Manish", "Are you coming?", "01:30 M"))
            add(ChatModel(R.drawable.avatar_7, "Pawan", "I'm on the way.", "01:32 AM"))
            add(ChatModel(R.drawable.avatar_8, "Navin", "I am also there.", "02:20 AM"))

            add(ChatModel(R.drawable.avatar_1, "Dipesh", "Hello", "11:00 AM"))
            add(ChatModel(R.drawable.avatar_2, "Sachin", "Hi", "11:02 AM"))
            add(ChatModel(R.drawable.avatar_3, "Sapna", "Hiiii", "10:03 AM"))
            add(ChatModel(R.drawable.avatar_4, "Deepak", "How are you?", "10:30 AM"))
            add(ChatModel(R.drawable.avatar_5, "Kushboo", "Where are you?", "11:30 AM"))
            add(ChatModel(R.drawable.avatar_6, "Manish", "Are you coming?", "01:30 M"))
            add(ChatModel(R.drawable.avatar_7, "Pawan", "I'm on the way.", "01:32 AM"))
            add(ChatModel(R.drawable.avatar_8, "Navin", "I am also there.", "02:20 AM"))

            add(ChatModel(R.drawable.avatar_1, "Dipesh", "Hello", "11:00 AM"))
            add(ChatModel(R.drawable.avatar_2, "Sachin", "Hi", "11:02 AM"))
            add(ChatModel(R.drawable.avatar_3, "Sapna", "Hiiii", "10:03 AM"))
            add(ChatModel(R.drawable.avatar_4, "Deepak", "How are you?", "10:30 AM"))
            add(ChatModel(R.drawable.avatar_5, "Kushboo", "Where are you?", "11:30 AM"))
            add(ChatModel(R.drawable.avatar_6, "Manish", "Are you coming?", "01:30 M"))
            add(ChatModel(R.drawable.avatar_7, "Pawan", "I'm on the way.", "01:32 AM"))
            add(ChatModel(R.drawable.avatar_8, "Navin", "I am also there.", "02:20 AM"))

            add(ChatModel(R.drawable.avatar_1, "Dipesh", "Hello", "11:00 AM"))
            add(ChatModel(R.drawable.avatar_2, "Sachin", "Hi", "11:02 AM"))
            add(ChatModel(R.drawable.avatar_3, "Sapna", "Hiiii", "10:03 AM"))
            add(ChatModel(R.drawable.avatar_4, "Deepak", "How are you?", "10:30 AM"))
            add(ChatModel(R.drawable.avatar_5, "Kushboo", "Where are you?", "11:30 AM"))
            add(ChatModel(R.drawable.avatar_6, "Manish", "Are you coming?", "01:30 M"))
            add(ChatModel(R.drawable.avatar_7, "Pawan", "I'm on the way.", "01:32 AM"))
            add(ChatModel(R.drawable.avatar_8, "Navin", "I am also there.", "02:20 AM"))
        }

        binding.rcView.layoutManager = LinearLayoutManager(this@MainActivity)

        chatAdapter = ChatRecyclerAdapter(this, arrChats)

        binding.rcView.adapter = chatAdapter

        binding.fabAdd.setOnClickListener {

            val addDialog = Dialog(this@MainActivity)
            addDialog.setContentView(R.layout.chat_update_dialog)

            val edtChatName = addDialog.findViewById<TextView>(R.id.edtChatName)
            val btnAdd = addDialog.findViewById<Button>(R.id.btnAdd)
            val btnCancel = addDialog.findViewById<Button>(R.id.btnCancel)


            btnAdd.setOnClickListener {
                val chatName = edtChatName.text.toString()

                if (chatName.isNotBlank()) {
                    arrChats.add(
                        ChatModel(
                            R.drawable.ic_launcher_background,
                            chatName,
                            "Happy",
                            "00:00 AM"
                        )
                    )

                    chatAdapter.notifyItemInserted(arrChats.size - 1)
                    binding.rcView.scrollToPosition(arrChats.size - 1)
                }
                addDialog.dismiss()

            }

            btnCancel.setOnClickListener {
                addDialog.dismiss()
            }


            addDialog.show()

        }

    }
}