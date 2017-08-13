package com.zhangpeng.textzmd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text;
    private LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (TextView) findViewById(R.id.textView);
        //layout = (LinearLayout) findViewById(R.id.my_layout);
        text.setSelected(true);
    }
    /*public void stop(View v) {
        text.stopScroll();
        layout.setVisibility(View.GONE);
    }
    <com.zhangpeng.textzmd.MarqueeTextView
            android:id="@+id/test"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            android:layout_weight="1.0"
            android:background="#e5e2e2"
            android:ellipsize="marquee"
            android:focusable="true"
            android:focusableInTouchMode="true"
            android:marqueeRepeatLimit="marquee_forever"

            android:singleLine="true"
            android:text="这才是真正的文字跑马灯效果这才是真正的字跑马灯效果这才是真正的"
            android:textColor="#000000"
            android:textSize="16sp" >
        </com.zhangpeng.textzmd.MarqueeTextView>

        <Button
            android:id="@+id/button2"
            android:layout_width="wrap_content"
            android:layout_height="20dp"
            android:background="#e5e2e2"
            android:onClick="stop"
            android:text="停止"
            android:layout_marginLeft="5dp"
            android:textSize="16sp" />*/
}
