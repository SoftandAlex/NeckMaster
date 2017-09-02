package com.example.guaguale;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener{
    private TextView textView,reward_text;
    private Button lingjiang;
    private String reward_string;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textView1);
        initView();
        initData();
    }

    private void initView(){
        lingjiang = (Button) findViewById(R.id.lingjiang);
        lingjiang.setOnClickListener(this);
        reward_text = findViewById(R.id.reward);
        reward_string = reward_text.getText().toString();
    }
    private void initData() {
        List<String> rewards=new ArrayList<String>();
        rewards.add("程序员小哥哥一个:-P");
        rewards.add("程序员小哥哥一个:-P");
        rewards.add("程序员小哥哥一个:-P");
        rewards.add("程序员小哥哥一个:-P");
        rewards.add("程序员小哥哥一个:-P");
        rewards.add("程序员小姐姐一个:-)");
        rewards.add("U型枕一个:D");
        rewards.add("优衣库试衣间代金券(･ ･)");
        rewards.add("优衣库试衣间代金券(･ ･)");
        rewards.add("优衣库试衣间代金券(･ ･)");
        rewards.add("U型枕一个:D");
        rewards.add("很遗憾，什么都没有:-(");
        rewards.add("很遗憾，什么都没有:-(");
        rewards.add("很遗憾，什么都没有:-(");
        rewards.add("陈医生代言的按摩椅一把:-D");

        //生成随机数
        int max=14;
        int min=0;
        Random random = new Random();

        int s = random.nextInt(max)%(max-min+1) + min;
        textView.setText(rewards.get(s));
        reward_string = rewards.get(s);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.lingjiang:
                reward_text.setText("您抽到了\n"+reward_string+
                        "\n请保存截图，并联系18867100790领取您的礼品");
                reward_text.setVisibility(View.VISIBLE);
                /*Toast.makeText(MainActivity.this, "礼品领取成功", Toast.LENGTH_SHORT).show();*/
                break;
            default:
                break;
        }
    }
}
