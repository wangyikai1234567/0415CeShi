package wangyikai.bwie.com.a0415ceshi.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import wangyikai.bwie.com.a0415ceshi.R;
import wangyikai.bwie.com.a0415ceshi.bean.Bean;

/**
 * date: 2017/4/15.
 * author: 王艺凯 (lenovo )
 * function:
 */

public class MyCEAdapteer extends BaseAdapter {
        private Bean bean ;
    private Context mContext;

    public MyCEAdapteer(Bean bean, Context context) {
        this.bean = bean;
        mContext = context;
    }

    @Override
    public int getCount() {

        return bean.getData().size();
    }

    @Override
    public Object getItem(int position) {
        return bean.getData().get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder vh;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.lf_lv_nr, null);
            vh = new ViewHolder();
            vh.title = (TextView) convertView.findViewById(R.id.ce_t);
            vh.apply = (TextView) convertView.findViewById(R.id.apply);
            vh.price = (TextView) convertView.findViewById(R.id.price);
            convertView.setTag(vh);
        } else {
            vh = (ViewHolder) convertView.getTag();
        }
        vh.title.setText(bean.getData().get(position).getTitle());
        vh.price.setText(bean.getData().get(position).getBuy_price());
        vh.apply.setText(bean.getData().get(position).getApply());

        return convertView;
    }

    class ViewHolder {
        TextView title,price,apply;
    }
}
