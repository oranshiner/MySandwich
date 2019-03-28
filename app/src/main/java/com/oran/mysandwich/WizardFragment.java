package com.oran.mysandwich;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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


		return inflate;
	}

}
