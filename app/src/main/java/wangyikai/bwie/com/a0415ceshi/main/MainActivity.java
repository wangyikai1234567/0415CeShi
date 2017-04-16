package wangyikai.bwie.com.a0415ceshi.main;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import com.google.gson.Gson;
import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import cz.msebera.android.httpclient.HttpEntity;
import cz.msebera.android.httpclient.HttpResponse;
import cz.msebera.android.httpclient.HttpStatus;
import cz.msebera.android.httpclient.client.HttpClient;
import cz.msebera.android.httpclient.client.methods.HttpGet;
import cz.msebera.android.httpclient.impl.client.DefaultHttpClient;
import wangyikai.bwie.com.a0415ceshi.R;
import wangyikai.bwie.com.a0415ceshi.adapter.MyCEAdapteer;
import wangyikai.bwie.com.a0415ceshi.bean.Bean;
import wangyikai.bwie.com.a0415ceshi.bean.CeHuaBean;
import wangyikai.bwie.com.a0415ceshi.helpr.MyUrls;

import static wangyikai.bwie.com.a0415ceshi.R.id.lv;

public class MainActivity extends AppCompatActivity {
    private ListView mLv;
    private List<String> ls = new ArrayList<>();
    private List<String> content = new ArrayList<>();

    private Handler mHandler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 0) {
                List<String> lls = (List<String>) msg.obj;
                mLv.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, lls));
            }
        }
    };
    private SlidingMenu mSlidingMenu;
    private ListView mLift;
    private Button mBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化数据
        initView();

        //子线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                List<String> ceHuaBean = getBean();
                if (ceHuaBean != null) {
                    Message message = new Message();
                    message.what = 0;
                    message.obj = ceHuaBean;
                    mHandler.sendMessage(message);
                }
            }
        }).start();
        //设置侧滑
        setSlidingMenu();
            //向集合中添加uri
        initData();
        //监听
        mLv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, long id) {
                //点击侧滑
                mSlidingMenu.showMenu();
                    //网络请求数据设置到listview'中
                MyTask myTask = new MyTask();
                myTask.execute(content.get(position));
            }
        });
    }

    private void initView() {
        mLv = (ListView) findViewById(lv);
    }

    private void initData() {
        content.add(MyUrls.QBYP);
        content.add(MyUrls.ZYJK);
        content.add(MyUrls.XYJK);
    }



    public class MyTask extends AsyncTask<String, Integer, Bean> {
        //进行耗时操作
        @Override
        protected Bean doInBackground(String... params) {
            try {
                HttpClient httpClient = new DefaultHttpClient();
                HttpGet httpGet = new HttpGet(params[0]);
                HttpResponse hr = httpClient.execute(httpGet);
                if (hr.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                    HttpEntity entity = hr.getEntity();
                    InputStream inputStream = entity.getContent();
                    byte[] b = new byte[1024];
                    int len = 0;
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    while ((len = inputStream.read(b)) != -1) {
                        bos.write(b, 0, len);
                    }
                    String s = bos.toString("utf-8");
                    Gson gson = new Gson();
                    Bean bean = gson.fromJson(s, Bean.class);
                    return bean;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Bean bean) {
            mLift.setAdapter(new MyCEAdapteer(bean, MainActivity.this));
        }
    }
    //httpurlconnection请求网络数据
    private List<String> getBean() {
        try {
            URL url = new URL(MyUrls.TITLE);
            HttpURLConnection huc = (HttpURLConnection) url.openConnection();
            huc.setReadTimeout(5000);
            huc.setConnectTimeout(5000);
            huc.setRequestMethod("GET");
            if (huc.getResponseCode() == 200) {
                InputStream inputStream = huc.getInputStream();
                byte[] b = new byte[1024];
                int len = 0;
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                while ((len = inputStream.read(b)) != -1) {

                    bos.write(b, 0, len);
                }

                String json = bos.toString("utf-8");

                Gson gson = new Gson();
                CeHuaBean cehua = gson.fromJson(json, CeHuaBean.class);
                List<CeHuaBean.DataBean> title = cehua.getData();
                for (int i = 0; i < title.size(); i++) {
                    String ti = title.get(i).getName();
                    ls.add(ti);
                }
                return ls;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
//设置slidingmenu
    private void setSlidingMenu() {
        mSlidingMenu = new SlidingMenu(this);
        mSlidingMenu.setMode(SlidingMenu.RIGHT);
        //设置触摸屏幕模式
        mSlidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
        mSlidingMenu.setShadowWidthRes(R.dimen.shadow_width);
        mSlidingMenu.setShadowDrawable(R.color.blue);

        //设置滑动屏幕的宽度
        mSlidingMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        //设置渐入渐出效果
        mSlidingMenu.setFadeDegree(0.35f);
        mSlidingMenu.attachToActivity(this, SlidingMenu.SLIDING_CONTENT);
        mSlidingMenu.setMenu(R.layout.left);

        mLift = (ListView) findViewById(R.id.lift_lv);
        mBut = (Button) findViewById(R.id.dianji);
        mBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mSlidingMenu.toggle();
            }
        });
    }

}
