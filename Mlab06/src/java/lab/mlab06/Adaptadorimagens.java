package java.lab.mlab06;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class Adaptadorimagens extends BaseAdapter {
	
	int itensMinhaGaleria;
	Context contexto;
	
	
	private integer[] minhasIdsImagens = {
			R.drawable.moto_01,
			R.drawable.moto_02,
			R.drawable.moto_03
	};
	
	public AdaptadorImagens(Context contextoParam){
		contexto= contextoParam;
		TypedArray atributos = contexto.obtainStyledAttributes(R.styleable.MinhaGaleria);
		itensMinhaGaleria = atributos.getResourceId(
				R.styleable.MinhaGaleria_android_galleryItemBackground, 0);
		atributos.recycle();
	}
	
	
	

	@Override
	public int getCount() {
		
		return minhasIdsImagens.length;
	}

	@Override
	public Object getItem(int position) {
	
		return position;
	}

	@Override
	public long getItemId(int position) {
		
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView ImageView = new ImageView(contexto);
		
		ImageView.setImageResource(minhasIdsImagens[position]);
		ImageView.setLayoutParams(new Gallery.LayoutParams(150,100));
		ImageView.setScaleType(ImageView.ScaleType.FIT_XY);
		ImageView.setBackgroundResource(itensMinhaGaleria);
		return ImageView;
	}

}
