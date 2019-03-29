package com.oran.mysandwich;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class WizardFragment extends Fragment {

	int wizard_page_position;
	boolean bread;
	boolean cheese;
	boolean lettuce;
	boolean tomato;
	boolean cucumber;
	boolean mayo;



	public WizardFragment(int position) {
		this.wizard_page_position = position;
	}


	@Override
	public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

		bread = false;
		cheese = false;
		lettuce = false;
		tomato = false;
		cucumber = false;
		mayo = false;

		int layout_id = R.layout.page1;
		switch (wizard_page_position) {
		case 0:
			layout_id = R.layout.page1;
			break;

		case 1:
			layout_id = R.layout.page2;
			break;
			
		case 2:
			layout_id = R.layout.page3;
			break;
			
		case 3:
			layout_id = R.layout.page4;
			break;

			case 4:
				layout_id = R.layout.page5;
				break;
		}

		View inflate = inflater.inflate(layout_id, container, false);
		if (inflate.findViewById (R.id.home_btn) !=null ){
			ImageView home_btn = (ImageView) inflate.findViewById(R.id.home_btn);
			home_btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v){
					startActivity(new Intent(getContext(), MainActivity.class));
				}
			});
		}
		if (inflate.findViewById (R.id.two) !=null ){
			final ImageView bread_btn = (ImageView) inflate.findViewById(R.id.two);
			final ImageView bread_img = (ImageView) inflate.findViewById(R.id.bread_img);
			bread_btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v){
					bread = !bread;
					if(bread){
						bread_btn.setImageResource(R.drawable.s_w_bread_icon);
						bread_img.setAlpha(1.0f);
					} else{
						bread_btn.setImageResource(R.drawable.bread_w_icon);
						bread_img.setAlpha(0f);
					}


				}
			});
		}

		if (inflate.findViewById (R.id.cheese_icon) !=null ){
			final ImageView cheese_btn = (ImageView) inflate.findViewById(R.id.cheese_icon);
			final ImageView cheese_img = (ImageView) inflate.findViewById(R.id.cheese_img);
			cheese_btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v){
					cheese = !cheese;
					if(cheese) {
						cheese_btn.setImageResource(R.drawable.s_cheese_icon);
						cheese_img.setAlpha(1.0f);
					}else {
						cheese_btn.setImageResource(R.drawable.cheese_icon);
						cheese_img.setAlpha(0.0f);
					}
				}
			});
		}
		if (inflate.findViewById (R.id.lettuce_icon) !=null ){
			final ImageView lettuce_btn = (ImageView) inflate.findViewById(R.id.lettuce_icon);
			final ImageView lettuce_img = (ImageView) inflate.findViewById(R.id.lettuce_icon_hidden);
			lettuce_btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v){
					lettuce = !lettuce;
					if(lettuce) {
					lettuce_btn.setImageResource(R.drawable.s_lettuce_icon);
					lettuce_img.setAlpha(1.0f);
					}else {
						lettuce_btn.setImageResource(R.drawable.lettuce_icon);
						lettuce_img.setAlpha(0.0f);
					}
				}
			});
		}

		if (inflate.findViewById (R.id.tomato_icon) !=null ){
			final ImageView tomato_btn = (ImageView) inflate.findViewById(R.id.tomato_icon);
			final ImageView tomato_img = (ImageView) inflate.findViewById(R.id.tomato_icon_hidden);
			tomato_btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v){
					tomato = !tomato;
					if(tomato) {
					tomato_btn.setImageResource(R.drawable.s_tomato_icon);
					tomato_img.setAlpha(1.0f);
					}else {
						tomato_btn.setImageResource(R.drawable.tomato_icon);
						tomato_img.setAlpha(0.0f);
					}
				}
			});
		}

		if (inflate.findViewById (R.id.cucumber_icon) !=null ){
			final ImageView cucumber_btn = (ImageView) inflate.findViewById(R.id.cucumber_icon);
			final ImageView cucumber_img = (ImageView) inflate.findViewById(R.id.cucumber_icon_hidden);
			cucumber_btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v){
					cucumber = !cucumber;
					if(cucumber) {
						cucumber_btn.setImageResource(R.drawable.s_cucumber_icon);
					    cucumber_img.setAlpha(1.0f);
					}else {
						cucumber_btn.setImageResource(R.drawable.cucumber_icon);
						cucumber_img.setAlpha(0.0f);
					}

				}
			});
		}
		if (inflate.findViewById (R.id.mayo_icon) !=null ){
			final ImageView mayo_btn = (ImageView) inflate.findViewById(R.id.mayo_icon);
			final ImageView mayo_img = (ImageView) inflate.findViewById(R.id.mayo_icon_hidden);
			mayo_btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v){
					mayo = !mayo;
					if(mayo) {
						mayo_btn.setImageResource(R.drawable.s_mayo_icon);
						mayo_img.setAlpha(1.0f);
					}else {
						mayo_btn.setImageResource(R.drawable.mayo_icon);
						mayo_img.setAlpha(0.0f);
					}
					}
			});
		}

		if (inflate.findViewById (R.id.action_btn) !=null ){
			final ImageView action_btn = (ImageView) inflate.findViewById(R.id.action_btn);
			action_btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v){
					startActivity(new Intent(getContext(), Order.class));
				}
			});
		}


		return inflate;
	}

}
