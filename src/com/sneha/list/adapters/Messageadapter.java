package com.sneha.list.adapters;
import java.util.List;

import com.sneha.list.MainActivity;
import com.sneha.list.R;
import com.sneha.list.R.drawable;
import com.sneha.list.R.id;
import com.sneha.list.R.layout;

import android.content.Context;
import android.content.Intent;
import android.sax.StartElementListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class Messageadapter extends ArrayAdapter<String>{
	
	protected Context mContext;
	protected String[] value1,value2;
	
	public Messageadapter(Context context, String[] v1, String[] v2){
		super(context,R.layout.list,v1);
		mContext = context;
		value1 = v1;
		value2 = v2;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if(convertView == null){
		convertView = LayoutInflater.from(mContext).inflate(R.layout.list, null);
		holder = new ViewHolder();
		holder.simage = (ImageView)convertView.findViewById(R.id.image);
		holder.text1 = (TextView)convertView.findViewById(R.id.text1);
		holder.text2 = (TextView)convertView.findViewById(R.id.text2);
		convertView.setTag(holder);
		}else{
			holder = (ViewHolder)convertView.getTag();
		}
	
		holder.simage.setImageResource(R.drawable.sneha);
		holder.text1.setText(value1[position]);
		holder.text1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(mContext, MainActivity.class);
				mContext.startActivity(intent);
			}
		});
		holder.text2.setText(value2[position]);
		return convertView;
	}
	
	private static class ViewHolder{
		ImageView simage;
		
		
		TextView text1;
		TextView text2;
		
	}

}
