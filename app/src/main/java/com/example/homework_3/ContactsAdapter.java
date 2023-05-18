package com.example.homework_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;


public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder> {
    ArrayList<Contact> arrayList;
    public ContactsAdapter(ArrayList<Contact> arrayList) {
        this.arrayList = arrayList;
    }
    @NonNull
    @Override
    public ContactsAdapter.ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContactViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact, parent, false));
    }
    @Override
    public void onBindViewHolder(@NonNull ContactsAdapter.ContactViewHolder holder, int position) {
        holder.onBind(arrayList.get(position));
    }
    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    static class ContactViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        TextView surname;
        TextView age;
        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
        }
        public void onBind(Contact contact) {
            name = itemView.findViewById(R.id.textViewName);
            surname = itemView.findViewById(R.id.tv_surname);
            age = itemView.findViewById(R.id.textViewAge);
            name.setText(contact.getName());
            surname.setText(contact.getSurname());
            age.setText(contact.getAge());
        }
    }
}