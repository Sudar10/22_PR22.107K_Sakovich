package com.example.pr22;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public class MemoriaActivity extends Activity {

        private GridView mGrid;
        private GridAdapter mAdapter;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            mGrid = (GridView)findViewById(R.id.field);
            mGrid.setNumColumns(6);
            mGrid.setEnabled(true);

            mAdapter = new GridAdapter(this, 6, 6);
            mGrid.setAdapter(mAdapter);
        }
    }


}