package com.example.android.studentportal;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class InfoActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private TextView name;
    NavigationView navigationView;
    DrawerLayout drawer;
    Toolbar toolbar;
    public static int navItemIndex = 0;
    private FirebaseAuth firebaseAuth;
    String email;

    // tags used to attach the fragments

    // toolbar titles respected to selected nav menu item
    private String[] activityTitles;

    // flag to load home fragment when user presses back key
    private boolean shouldLoadHomeFragOnBackPress = true;
    //private Handler mHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*mHandler = new Handler();
        navigationView = (NavigationView) findViewById(R.id.nav_view);

        View navHeader = navigationView.getHeaderView(0);
        //name = (TextView) navHeader.findViewById(R.id.name);
        // load toolbar titles from string resources
        activityTitles = getResources().getStringArray(R.array.nav_item_activity_titles);
        firebaseAuth=FirebaseAuth.getInstance();
        email = firebaseAuth.getCurrentUser().getEmail();
        // load nav menu header data
        //loadNavHeader();
        // initializing navigation menu
        setUpNavigationView();
        if (savedInstanceState == null) {
            navItemIndex = 0;
            CURRENT_TAG = TAG_SAD;
            loadHomeFragment();
        }


        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setNavigationItemSelectedListener(this);
        displaySelectedScreen(1);
    }

    private void displaySelectedScreen(int itemId)
    {
        //creating fragment object
        Fragment fragment = null;

        switch (itemId)
        {
            case R.id.ayur:
                fragment = new Ayurvedic();
                break;

            case R.id.dent:
                fragment=new Dentist();
                break;

            case R.id.card:
                fragment = new Cardiologists();
                break;


            case R.id.chest:
                fragment=new Chest();
                break;


            case R.id.cosmo:
                fragment=new Cosmetic();
                break;

            case R.id.derm:
                fragment=new Dermatologists();
                break;

            case R.id.help:
                break;

            case R.id.gwl:
                break;
            case 1:
                fragment = new starting();
                break;
            default:
                break;

        }
        if (fragment != null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.content_frame, fragment);
            ft.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
    }

    /*private void loadNavHeader() {

        name.setText(email);
    }

    private void loadHomeFragment() {
        // selecting appropriate nav menu item
        selectNavMenu();

        // set toolbar title
        setToolbarTitle();

        // if user select the current navigation menu again, don't do anything
        // just close the navigation drawer
        if (getSupportFragmentManager().findFragmentByTag(CURRENT_TAG) != null) {
            drawer.closeDrawers();


            return;
        }

        }*/


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.info, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        /*if (id == R.id.buttonLogout) {
            firebaseAuth.signOut();
            //closing activity
            finish();
            //starting login activity
            startActivity(new Intent(this,LoginActivity.class));

        }
        noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }*/


        return super.onOptionsItemSelected(item);
    }

    /*private void setToolbarTitle() {
        getSupportActionBar().setTitle(activityTitles[navItemIndex]);
    }

    /*private void selectNavMenu() {
        navigationView.getMenu().getItem(navItemIndex).setChecked(true);
    }*/


    /*@SuppressWarnings("StatementWithEmptyBody")

    private void setUpNavigationView() {
        //Setting Navigation View Item Selected Listener to handle the item click of the navigation menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                // Handle navigation view item clicks here.
                switch (item.getItemId()){


                case R.id.ayur :
                    break;

                    case R.id.dent:
                    break;

                    case R.id.card :
                        break;


                    case R.id.ent :
                    navItemIndex = 3;
                    CURRENT_TAG = TAG_CN;
                        break;


                    case R.id.paedic:
                        break;

                    case R.id.help :
                        break;

                    case R.id.gwl:
                        break;
                    default:
                        break;

                }

                //Checking if the item is in checked state or not, if not make it in checked state
                if (item.isChecked()) {
                    item.setChecked(false);
                } else {
                    item.setChecked(true);
                }
                item.setChecked(true);



                return true;
            }


        });*/
/*    ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.openDrawer, R.string.closeDrawer) {

        @Override
        public void onDrawerClosed(View drawerView) {
            // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
            super.onDrawerClosed(drawerView);
        }

        @Override
        public void onDrawerOpened(View drawerView) {
            // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank
            super.onDrawerOpened(drawerView);
        }
    };*/


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        displaySelectedScreen(item.getItemId());


        //Checking if the item is in checked state or not, if not make it in checked state
        return true;

    }

}