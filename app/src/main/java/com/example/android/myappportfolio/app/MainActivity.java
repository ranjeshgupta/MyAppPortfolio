package com.example.android.myappportfolio.app;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            return inflater.inflate(R.layout.fragment_main, container, false);
        }
   }

    public void showToast(View v) {
        //Toast.makeText(MainActivity.this, "This button will launch Spotify Streamer App!"+v.getId(), Toast.LENGTH_SHORT).show();
        switch(v.getId()) {
            case R.id.btn_spotify_streamer:
                Toast.makeText(MainActivity.this, "This button will launch Spotify Streamer App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_scores_app:
                Toast.makeText(MainActivity.this, "This button will launch Scores App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_libray_app:
                Toast.makeText(MainActivity.this, "This button will launch Library App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_build_it_bigger:
                Toast.makeText(MainActivity.this, "This button will launch Build it Bigger App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_xyz_reader:
                Toast.makeText(MainActivity.this, "This button will launch Xyz Reader App!", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_capstone_my_own_app:
                Toast.makeText(MainActivity.this, "This button will launch My Capstone App!", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(MainActivity.this, "Some other button clicked!", Toast.LENGTH_SHORT).show();
        }
    }
}
