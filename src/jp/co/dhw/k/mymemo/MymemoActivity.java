package jp.co.dhw.k.mymemo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MymemoActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymemo);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_mymemo, menu);
        return true;
    }
}
