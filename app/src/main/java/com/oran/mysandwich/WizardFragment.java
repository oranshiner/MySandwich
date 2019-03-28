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

	public WizardFragment(int position) {
		this.wizard_page_position = position;
	}


	@Override
	public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

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
			bread_btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v){
					bread_btn.setImageResource(R.drawable.s_w_bread_icon);
				}
			});
		}
		if (inflate.findViewById (R.id.cheese_icon) !=null ){
			final ImageView cheese_btn = (ImageView) inflate.findViewById(R.id.cheese_icon);
			cheese_btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v){
					cheese_btn.setImageResource(R.drawable.s_cheese_icon);
				}
			});
		}
		if (inflate.findViewById (R.id.lettuce_icon) !=null ){
			final ImageView lettuce_btn = (ImageView) inflate.findViewById(R.id.lettuce_icon);
			lettuce_btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v){
					lettuce_btn.setImageResource(R.drawable.s_lettuce_icon);
				}
			});
		}

		if (inflate.findViewById (R.id.tomato_icon) !=null ){
			final ImageView tomato_btn = (ImageView) inflate.findViewById(R.id.tomato_icon);
			tomato_btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v){
					tomato_btn.setImageResource(R.drawable.s_tomato_icon);
				}
			});
		}

		if (inflate.findViewById (R.id.cucumber_icon) !=null ){
			final ImageView cucumber_btn = (ImageView) inflate.findViewById(R.id.cucumber_icon);
			cucumber_btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v){
					cucumber_btn.setImageResource(R.drawable.s_cucumber_icon);
				}
			});
		}
		if (inflate.findViewById (R.id.mayo_icon) !=null ){
			final ImageView mayo_btn = (ImageView) inflate.findViewById(R.id.mayo_icon);
			mayo_btn.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v){
					mayo_btn.setImageResource(R.drawable.s_mayo_icon);
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
