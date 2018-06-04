package com.imaze2k18.imazeapp.Activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;


import com.imaze2k18.imazeapp.Extras.CustomTypefaceSpan;
import com.imaze2k18.imazeapp.R;
import com.imaze2k18.imazeapp.fragment.EventFragment;
import com.imaze2k18.imazeapp.fragment.HomeFragment;
import com.imaze2k18.imazeapp.fragment.NightsFragment;
import com.imaze2k18.imazeapp.fragment.ProjectsFragment;
import com.imaze2k18.imazeapp.fragment.TeamFragment;
import com.imaze2k18.imazeapp.fragment.WorkshopFragment;

/**
 * Created by ranjit on 24-05-2017.
 */

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    private String title;
    private TextView texttoolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //insert_data();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);


        texttoolbar= (TextView) findViewById(R.id.toolbar_title);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        //font apply
        Menu m = navigationView.getMenu();
        for (int i=0;i<m.size();i++) {
            MenuItem mi = m.getItem(i);
            applyFontToMenuItem(mi);
        }
        navigationView.setNavigationItemSelectedListener(this);
        displaySelectedScreen(R.id.home);
    }



    //font slider method
    private void applyFontToMenuItem(MenuItem mi) {
        Typeface font = Typeface.createFromAsset(getAssets(), "fonts/f.ttf");
        SpannableString mNewTitle = new SpannableString(mi.getTitle());
        mNewTitle.setSpan(new CustomTypefaceSpan("" , font), 0 , mNewTitle.length(),  Spannable.SPAN_INCLUSIVE_INCLUSIVE);
        mi.setTitle(mNewTitle);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }





    private void displaySelectedScreen(int itemId) {
        //creating fragment object
        Fragment fragment = null;
        //initializing the fragment object which is selected
        switch (itemId) {
            case R.id.home:
                title=getString(R.string.home);
                fragment = new HomeFragment();
                break;
            case R.id.events:
                title=getString(R.string.events);
                fragment = new EventFragment();
                break;
            case R.id.workshop:
                title=getString(R.string.workshops);
                fragment = new WorkshopFragment();
                break;
            case R.id.project:
                title=getString(R.string.projects);
                fragment = new ProjectsFragment();
                break;
            case R.id.nights:
                title=getString(R.string.nights);
                fragment = new NightsFragment();
                break;
            case R.id.team:
                title=getString(R.string.team);
                fragment = new TeamFragment();
                break;
            case R.id.register:
                try {
                    Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.imaze2k18.com/imaze_login/index.php"));
                    startActivity(myIntent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(this, "No application can handle this request."
                            + " Please install a webbrowser",  Toast.LENGTH_LONG).show();
                    e.printStackTrace();
                }
                break;

            case R.id.nav_RateIt:
                Uri uri = Uri.parse("market://details?id=" + getApplicationContext().getPackageName());
                Intent goToMarket = new Intent(Intent.ACTION_VIEW, uri);
                goToMarket.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY |
                        Intent.FLAG_ACTIVITY_NEW_DOCUMENT |
                        Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
                try {
                    startActivity(goToMarket);
                } catch (ActivityNotFoundException e) {
                    startActivity(new Intent(Intent.ACTION_VIEW,
                            Uri.parse("http://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName())));
                }

                break;
            case R.id.nav_ShareApp:
                try {
                    Intent i = new Intent(Intent.ACTION_SEND);
                    i.setType("text/plain");
                    i.putExtra(Intent.EXTRA_SUBJECT, "Imaze/'18");
                    String sAux = "\nCheck Out Imaze 2k18 App:\nGCET/'s biggest technical festival of the year\n\n ";
                    sAux = sAux + "https://play.google.com/store/apps/details?id=" + getApplicationContext().getPackageName()+" \n\n";
                    i.putExtra(Intent.EXTRA_TEXT, sAux);
                    startActivity(Intent.createChooser(i, "choose one"));
                } catch(Exception e) {
                }
                break;

        }

        //replacing the fragment
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();

            Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/f.ttf");
            texttoolbar.setTypeface(typeface);
            if (getString(R.string.home) != null && findViewById(R.id.toolbar)!= null ) texttoolbar.setText(title);
        }

        drawer= (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }




    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        //calling the method displayselectedscreen and passing the id of selected menu
        displaySelectedScreen(item.getItemId());
        //make this method blank
        return true;
    }
}
