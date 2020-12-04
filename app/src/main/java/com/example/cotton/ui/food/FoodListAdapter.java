package com.example.cotton.ui.food;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cotton.R;

import java.util.ArrayList;

public class FoodListAdapter extends BaseAdapter {

    //listview items
    private ImageView productIcon;
    private TextView productType;
    private TextView price;
    private Button btn_buy;

    private ArrayList<FoodListItem> foodItemsList=new ArrayList<FoodListItem>();

    //constructor
    public FoodListAdapter(){

    }

    //Adapter에 사용되는 데이터의 개수를 리턴
    @Override
    public int getCount() {
        return foodItemsList.size();
    }

    //position에 위치한 데이터를 화면에 출력하는데 사용될 View를 리턴
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       final Context context=parent.getContext();

        //"food_listview_item" Layout을 inflate하여 convertView 참조 획득
        if(convertView==null){
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(R.layout.food_listview_item,parent,false);
        }

        //화면에 표시될 View(Layout이 inflate된)으로부터 위젯에 대한 참조 획득
        productIcon=convertView.findViewById(R.id.iv_search);
        productType=convertView.findViewById(R.id.tv_productType);
        price=convertView.findViewById(R.id.tv_price);
        btn_buy=convertView.findViewById(R.id.btn_buy);

        FoodListItem foodListItem=foodItemsList.get(position);
        //아이템 내 각 위젯에 데이터 반영
        productIcon.setImageResource(foodListItem.getProductIcon());
        productType.setText(foodListItem.getProductType());
        price.setText(foodListItem.getPrice());

        return convertView;
    }

    //저장할 위치(position)에 있는 데이터와 관계된 아이템(row)의 ID를 리턴
    @Override
    public long getItemId(int position) {
        return position;
    }

    //지정한 위치(position)에 있는 데이터 리턴
    @Override
    public Object getItem(int position) {
        return foodItemsList.get(position);
    }

    //아이템 데이터 추가를 위한 함수
    public void addItem(int icon,String type,String price){
        FoodListItem item=new FoodListItem();

        item.setProductIcon(icon);
        item.setProductType(type);
        item.setPrice(price);

        foodItemsList.add(item);
    }
    //buy event
    public void buyEvent(){
        btn_buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
