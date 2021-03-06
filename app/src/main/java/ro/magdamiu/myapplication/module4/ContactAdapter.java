package ro.magdamiu.myapplication.module4;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

import ro.magdamiu.myapplication.R;

public class ContactAdapter extends RecyclerView.Adapter<ContactViewHolder> {

    private List<Contact> mContacts;
    private Context mContext;

    public ContactAdapter(List<Contact> contacts, Context context) {
        mContacts = contacts;
        mContext = context;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_item
                , viewGroup, false);
        return new ContactViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder contactViewHolder, int i) {
        Contact currentContact = mContacts.get(i);
        contactViewHolder.getTextViewFullName().setText(currentContact.getFullName());
        contactViewHolder.getTextViewAddres().setText(currentContact.getAddresse());
        contactViewHolder.getTextViewGroup().setText(currentContact.getGroup());

        Picasso.get().load(currentContact.getImageUrl())
                .placeholder(R.drawable.android)
                .error(R.drawable.android)
                .into(contactViewHolder.getImageViewProfilePicture());
    }

    @Override
    public int getItemCount() {
        return mContacts.size();
    }
}
