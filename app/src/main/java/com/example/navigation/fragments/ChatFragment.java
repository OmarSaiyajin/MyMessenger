package com.example.navigation.fragments;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.navigation.AdapterExample;
import com.example.navigation.ItemExample;
import com.example.navigation.R;
import com.example.navigation.server.Chat;
import com.example.navigation.server.Message;
import com.example.navigation.server.User;
import com.example.navigation.services.ChatService;

import java.util.ArrayList;
import java.util.List;

public class ChatFragment extends Fragment {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    @RequiresApi(api = Build.VERSION_CODES.N)
    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview =  inflater.inflate(R.layout.fragment_chat, container, false);

        ArrayList<ItemExample> itemExamples = new ArrayList<>();

        recyclerView = rootview.findViewById(R.id.recylerview);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this.getActivity());
        adapter = new AdapterExample(itemExamples);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

//        User martin = new User();
//        martin.setId(1);
//        martin.setName("Martin");

//        User laura = new User();
//        laura.setId(2);
//        laura.setName("Laura");

//        User lisa = new User();
//        laura.setId(3);
//        laura.setName("Lisa");
//
//        User lana = new User();
//        laura.setId(4);
//        laura.setName("Lana");

//        ChatService chatService = new ChatService();
//        List<User> users = new ArrayList<>();
//        users.add(martin);
//        users.add(laura);
//        users.add(lisa);
//        users.add(lana);
//
//
//
//
//       // chatService.createNewChat(users, "Chat mit Laura");
//        chatService.createNewChat(users, "Chat "+ getString(R.string.with) + " " + users.get(0).getName());
//       // chatService.createNewChat(users, "Chat "+ R.string.with + " " + users.get(1).getName());
//       // chatService.createNewChat(users, "Chat "+ R.string.with + " " + users.get(2).getName());
//      //  chatService.createNewChat(users, "Chat "+ R.string.with + " " + users.get(3).getName());
//        List<Chat> myChats = chatService.getAllChatsForUser(martin);
//        chatService.sendChatMessage(myChats.get(0).getId(), new Message("Hallo", martin, true));
//        chatService.sendChatMessage(myChats.get(0).getId(), new Message("Was", martin, true));

        itemExamples.add(new ItemExample(R.drawable.ic_android, "Chat " + getString(R.string.with) + " Cristiano","Hey"));
        itemExamples.add(new ItemExample(R.drawable.ic_accessible, "Chat " + getString(R.string.with) + " Max", "Was geht?"));
        itemExamples.add(new ItemExample(R.drawable.ic_child_care, "Chat " + getString(R.string.with) + " Robin", "wow..."));
        itemExamples.add(new ItemExample(R.drawable.ic_accessible, "Chat " + getString(R.string.with) + " Lucy", "Ich verstehe nichts."));
        itemExamples.add(new ItemExample(R.drawable.ic_child_care, "Chat " + getString(R.string.with) + " Anna", "Ruf mich an"));
        itemExamples.add(new ItemExample(R.drawable.ic_accessible, "Chat " + getString(R.string.with) + " Chris", "Hallo???"));
        itemExamples.add(new ItemExample(R.drawable.ic_child_care, "Chat " + getString(R.string.with) + " Justin", "Warum antwortest du nicht mehr?"));
        itemExamples.add(new ItemExample(R.drawable.ic_accessible, "Chat " + getString(R.string.with) + " Thomas", "Too."));
        itemExamples.add(new ItemExample(R.drawable.ic_child_care, "Chat " + getString(R.string.with) + " Alex", ":)"));
        itemExamples.add(new ItemExample(R.drawable.ic_accessible, "Chat " + getString(R.string.with) + " Flo", "ok"));
        itemExamples.add(new ItemExample(R.drawable.ic_child_care, "Chat " + getString(R.string.with) + " Ralf", "Whats's up Homeboy?"));
        itemExamples.add(new ItemExample(R.drawable.ic_accessible, "Chat " + getString(R.string.with) + " Barbara", "Ciao"));
        itemExamples.add(new ItemExample(R.drawable.ic_child_care, "Chat " + getString(R.string.with) + " Laura", "Ruf mich nicht mehr an"));
        itemExamples.add(new ItemExample(R.drawable.ic_accessible, "Chat " + getString(R.string.with) + " Samuel", "Alles klar"));
        itemExamples.add(new ItemExample(R.drawable.ic_child_care, "Chat " + getString(R.string.with) + " Jenny", "!"));

        return rootview;
    }
}
