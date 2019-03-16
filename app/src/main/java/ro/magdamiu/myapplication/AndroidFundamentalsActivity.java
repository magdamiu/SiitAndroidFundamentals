package ro.magdamiu.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import ro.magdamiu.myapplication.module2.RatingBarActivity;
import ro.magdamiu.myapplication.module4.complex.ComplexRecyclerView;
import ro.magdamiu.myapplication.module5.Activity1;
import ro.magdamiu.myapplication.module5.Activity2;
import ro.magdamiu.myapplication.module5.SaveInstanceStateActivity;
import ro.magdamiu.myapplication.module6.DynamicFragmentActivity;
import ro.magdamiu.myapplication.module6.FragmentActivity;
import ro.magdamiu.myapplication.module6.ListenerFragment;
import ro.magdamiu.myapplication.module6.ListenerFragmentActivity;
import ro.magdamiu.myapplication.module6.MethodFragmentActivity;
import ro.magdamiu.myapplication.module6.NavigationDrawerActivity;
import ro.magdamiu.myapplication.module6.ancestralnavigation.FirstActivity;
import ro.magdamiu.myapplication.module6.tabs.TabsActivity;
import ro.magdamiu.myapplication.module7.CardViewActivity;
import ro.magdamiu.myapplication.module8.github.GithubActivity;

public class AndroidFundamentalsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_fundamentals);
    }

    public void ratingBarOnClick(View view) {
        startActivity(new Intent(AndroidFundamentalsActivity.this, RatingBarActivity.class));
    }

    public void activitiesOnClick(View view) {
        startActivity(new Intent(AndroidFundamentalsActivity.this, Activity1.class));
    }

    public void recyclerViewListenerOnClick(View view) {
        startActivity(new Intent(AndroidFundamentalsActivity.this, ComplexRecyclerView.class));
    }

    public void saveInstanceStateOnClick(View view) {
        startActivity(new Intent(AndroidFundamentalsActivity.this, SaveInstanceStateActivity.class));
    }

    public void staticFragmentOnClick(View view) {
        startActivity(new Intent(AndroidFundamentalsActivity.this, FragmentActivity.class));
    }

    public void dynamicFragmentOnClick(View view) {
        startActivity(new Intent(AndroidFundamentalsActivity.this, DynamicFragmentActivity.class));
    }

    public void methodFragmentOnClick(View view) {
        startActivity(new Intent(AndroidFundamentalsActivity.this, MethodFragmentActivity.class));
    }

    public void listenerFragmentOnClick(View view) {
        startActivity(new Intent(AndroidFundamentalsActivity.this, ListenerFragmentActivity.class));
    }


    public void navigationDrawerOnClick(View view) {
        startActivity(new Intent(AndroidFundamentalsActivity.this, NavigationDrawerActivity.class));
    }

    public void tabsOnClick(View view) {
        startActivity(new Intent(AndroidFundamentalsActivity.this, TabsActivity.class));
    }

    public void ancenstralNavigationOnClick(View view) {
        startActivity(new Intent(AndroidFundamentalsActivity.this, FirstActivity.class));
    }

    public void cardViewOnClick(View view) {
        startActivity(new Intent(AndroidFundamentalsActivity.this, CardViewActivity.class));
    }

    public void githubApiOnClick(View view) {
        startActivity(new Intent(AndroidFundamentalsActivity.this, GithubActivity.class));
    }
}
