package ro.magdamiu.myapplication.module10;

import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ro.magdamiu.myapplication.R;
import ro.magdamiu.myapplication.module4.complex.Contact;
import ro.magdamiu.myapplication.module4.complex.ContactAdapter;
import ro.magdamiu.myapplication.module4.complex.ContactClickListener;
import ro.magdamiu.myapplication.module4.complex.RecyclerTouchListener;

public class ExtraRecyclerViewActivity extends AppCompatActivity {
    private static final int CONTACTS_COUNT = 25;

    private RecyclerView mRecyclerViewContacts;
    private SwipeRefreshLayout mSwipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra_recycler_view);

        initView();
        setupSwipeRefreshLayout();
    }

    private void setupSwipeRefreshLayout() {
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                Toast.makeText(getApplicationContext(), "Works!", Toast.LENGTH_LONG).show();
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mSwipeRefreshLayout.setRefreshing(false);
                    }
                }, 4000);
            }
        });

        mSwipeRefreshLayout.setColorSchemeColors(
                getResources().getColor(android.R.color.holo_blue_bright),
                getResources().getColor(android.R.color.holo_green_light),
                getResources().getColor(android.R.color.holo_orange_light),
                getResources().getColor(android.R.color.holo_red_light)
        );
    }

    private void initView() {
        mSwipeRefreshLayout = findViewById(R.id.swipe_container);
        mRecyclerViewContacts = findViewById(R.id.recycler_view_extra);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerViewContacts.setLayoutManager(layoutManager);

        ContactAdapter contactAdapter = new ContactAdapter(getContacts(),
                ExtraRecyclerViewActivity.this);
        mRecyclerViewContacts.setAdapter(contactAdapter);

        mRecyclerViewContacts.addOnItemTouchListener(new RecyclerTouchListener(this,
                mRecyclerViewContacts, new ContactClickListener() {
            @Override
            public void onClick(View view, final int position) {
                Toast.makeText(ExtraRecyclerViewActivity.this,
                        getString(R.string.single_click) + position,
                        Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongClick(View view, int position) {
                Toast.makeText(ExtraRecyclerViewActivity.this,
                        getString(R.string.long_click) + position,
                        Toast.LENGTH_LONG).show();
            }
        }));
        setDivider();
    }

    private void setDivider() {
        mRecyclerViewContacts
                .addItemDecoration(new SimpleBlueDivider(ExtraRecyclerViewActivity.this));
    }

    private List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();
        Contact contact;
        for (int i = 0; i < CONTACTS_COUNT; i++) {
            contact = new Contact();
            contact.setFullName("Android Name " + i);
            contact.setAddresse("Address " + i);
            contact.setGroup("Family " + i);
            contact.setImageUrl("https://cdn.guidingtech.com/media/assets/WordPress-Import/2012" +
                    "/10/Smiley-Thumbnail.png");
            contacts.add(contact);
        }
        return contacts;
    }
}