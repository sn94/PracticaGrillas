package com.example.sonia.practicagrillas;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.ImageView;

public class GrillaAdapter extends BaseAdapter {

    
    private Context mContext;

    int[] iconos= {
            R.drawable.banana, R.drawable.banana1, R.drawable.cereza,
            R.drawable.durazno,  R.drawable.manzana,  R.drawable.naranja,
            R.drawable.naranja1,  R.drawable.naranja2,  R.drawable.pera,
            R.drawable.pera1,  R.drawable.tomate,  R.drawable.tomate1,
            R.drawable.tomate2,  R.drawable.uva,  R.drawable.zanahoria,
            R.drawable.zanahoria1
    };
    
    
    public GrillaAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return this.iconos.length;
    }

    @Override
    public Object getItem(int position) {
        ImageView imgv= new ImageView( this.mContext );
        imgv.setImageResource( position);
        return  imgv;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgv;
        
        if(  convertView == null){
            imgv=  new ImageView( this.mContext );
            imgv.setLayoutParams( new GridLayout.LayoutParams( ));
            imgv.setScaleType( ImageView.ScaleType.CENTER_CROP);
            imgv.setPadding( 8,8,8,8 );
        }else{
            imgv=  (ImageView) convertView;
        }
        imgv.setImageResource( iconos[position]);
        return imgv;
    }
}
