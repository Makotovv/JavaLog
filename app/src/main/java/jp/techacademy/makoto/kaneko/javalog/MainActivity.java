package jp.techacademy.makoto.kaneko.javalog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            Human human = new Human("田中",30,"旅行");     // 田中さん３０歳旅行好き
            human.think();
            human.say();
        }

    }



