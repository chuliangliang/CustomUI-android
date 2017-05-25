package com.customui.chuliangliang.customui;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.net.URL;
import java.util.List;

/**
 * Created by chuliangliang on 2017/5/24.
 */

public class DataModelAdapter extends ArrayAdapter {
    private int resourceID;
    public DataModelAdapter(Context ctx, int textViewResourceId, List<DataModel> objects)
    {
        super(ctx,textViewResourceId,objects);
        resourceID = textViewResourceId;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
/*
        //获取DataModel 数据模型对象
        DataModel dataModel = (DataModel)getItem(position);
        //获取显示的view
        View view = LayoutInflater.from(getContext()).inflate(resourceID,parent,false);
        //获取View (类似于中的cell) 上的 图片视图
        ImageView imgView = (ImageView)view.findViewById(R.id.data_list_item_img);
        //获取View (类似于中的cell) 上的 文字控件
        TextView textView = (TextView)view.findViewById(R.id.data_list_item_name);

        //为控件赋值
        imgView.setImageResource(dataModel.getPid());
        textView.setText(dataModel.getName());
        return view;
*/

        /*
        * 1. 复用布局 view (也就是oc中的cell) convertView 如果存在即为已经初始化过
        * 2. 避免频繁获取控件 如 从 view中获取 ImageView 和 TextView
        * */

        //获取DataModel 数据模型对象
        DataModel dataModel = (DataModel)getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null)
        {
            //此种布局从未创建或者不存在可复用的布局
            //创建布局
            view = LayoutInflater.from(getContext()).inflate(resourceID,parent,false);
            //初始化内部类
            viewHolder = new ViewHolder();
            //获取View (类似于中的cell) 上的 图片控件 保存近内部类中
            viewHolder.imgView = (ImageView)view.findViewById(R.id.data_list_item_img);
            //获取View (类似于中的cell) 上的 文字控件 保存近内部类中
            viewHolder.textView = (TextView)view.findViewById(R.id.data_list_item_name);
            //将内部类 保存进 布局中 (oc中的cell)
            view.setTag(viewHolder);
        }else {
            //存在可复用的布局(oc中的cell)
            view = convertView;
            viewHolder = (ViewHolder)convertView.getTag();
        }

        //为布局填充数据源 (oc中的cell 填充数据源)
        viewHolder.textView.setText(dataModel.getName());
        viewHolder.imgView.setImageResource(dataModel.getPid());

        return view;
    }

    private class ViewHolder {
        ImageView imgView;
        TextView textView;
    }
}
