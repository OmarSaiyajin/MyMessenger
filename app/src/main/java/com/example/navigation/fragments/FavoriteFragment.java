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

public class FavoriteFragment extends Fragment {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Nullable

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_favorite, container, false);

        ArrayList<ItemExample> itemExamples = new ArrayList<>();

        recyclerView = rootview.findViewById(R.id.recylerview);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this.getActivity());
        adapter = new AdapterExample(itemExamples);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        User martin = new User();
        martin.setId(1);
        martin.setName("Martin");

        User laura = new User();
        laura.setId(2);
        laura.setName("Laura");


        ChatService chatService = new ChatService();
        List<User> users = new ArrayList<>();
        users.add(martin);
        users.add(laura);


        chatService.createNewChat(users, "Chat " + getString(R.string.with) + " Laura");
        List<Chat> myChats = chatService.getAllChatsForUser(martin);
        chatService.sendChatMessage(myChats.get(0).getId(), new Message("Hallo", martin, true));

        itemExamples.add((new ItemExample(R.drawable.ic_android, myChats.get(0).getName(), myChats.get(0).getMessages().get(0).getMessage())));
        return rootview;
    }
}
