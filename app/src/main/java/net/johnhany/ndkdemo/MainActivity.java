package net.johnhany.ndkdemo;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView)findViewById(R.id.textview);
        tv.setText( stringFromJNI() );
    }

    public native String  stringFromJNI();

    static {
        System.loadLibrary("hello-jni");
    }
}
