//package com.arc.s.activity;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.ImageView;
//import com.arc.s.R;
//
///**
// * 活动1
// *
// * @author 叶超
// * @since 2020/2/9 12:22
// */
//public class WelcomeActivityTestImage extends Activity implements View.OnClickListener {
//
//    private ImageView imageView;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_first);
//        findViewById(R.id.testBtn1).setOnClickListener(this);
//        imageView = findViewById(R.id.testImageView1);
//
//    }
//
//    @Override
//    public void onClick(View v) {
//
//        if (v.getId() == R.id.testBtn1) {
//            int level = imageView.getDrawable().getLevel();
//            level += 1000;
//            if (level > 10000) {
//                level = 1000;
//            }
//            imageView.getDrawable().setLevel(level);
//        }
//
//    }
//
//}
//
//
