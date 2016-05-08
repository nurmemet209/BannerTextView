package com.example.nurmemet.bannertextviewexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.nurmemet.library.BannerTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BannerTextView bannerTextView = (BannerTextView) findViewById(R.id.banner);
        bannerTextView.addItem("邵阳新闻网讯（通讯员关杨博刘泽荣）“奇鱼，生平第一次见过，太有意思了！”5月4日，武冈小学教师邱");
        bannerTextView.addItem("4月30日，邱先生在龙田三口塘水库钓到起一条鲤鱼，长约36厘米、重一斤六两，浑身呈暗褐色，背略带金黄");
        bannerTextView.addItem("钓了这么多年的鱼，头部长得像人面的鱼他还是头一次钓到，估计是什么珍稀物种。同时");
        bannerTextView.addItem("背略带金黄。从正上方看，该鱼面部特征极像人脸，有嘴巴、鼻子、眼睛，而且都清晰可见。据悉");
        bannerTextView.addItem("钓龄近20年的邱先生介绍，钓了这么多年的鱼，头部长得像人面的鱼他还是头一次钓");
        bannerTextView.addItem("据悉，人面鲤鱼在全球极其稀有，英国一拥有人面鲤鱼的主人曾给他的鱼报价4万");
        bannerTextView.play();

    }
}
