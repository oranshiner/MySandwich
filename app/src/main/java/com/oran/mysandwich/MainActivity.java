package com.oran.mysandwich;

import android.content.res.ColorStateList;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatImageView;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {


    private ViewPager viewPager;
    private AppCompatImageView indicator1;
    private AppCompatImageView indicator2;
    private AppCompatImageView indicator3;
    private AppCompatImageView indicator4;
    private AppCompatImageView indicator5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        indicator1 = findViewById(R.id.indicator1);
        indicator2 = findViewById(R.id.indicator2);
        indicator3 = findViewById(R.id.indicator3);
        indicator4 = findViewById(R.id.indicator4);
        indicator5 = findViewById(R.id.indicator5);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new MainActivity.ViewPagerAdapter(getSupportFragmentManager()));
        viewPager.setOnPageChangeListener(new MainActivity.WizardPageChangeListener());
        updateIndicators(0);
    }

    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the
            // system to handle the
            // Back button. This calls finish() on this activity and pops the
            // back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    public void setPage(int position) {
        viewPager.setCurrentItem(position);
    }

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        private int WIZARD_PAGES_COUNT = 5;

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new WizardFragment(position);
        }

        @Override
        public int getCount() {
            return WIZARD_PAGES_COUNT;
        }

    }

    private class WizardPageChangeListener implements ViewPager.OnPageChangeListener {

        @Override
        public void onPageScrollStateChanged(int position) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onPageScrolled(int position, float positionOffset,
                                   int positionOffsetPixels) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onPageSelected(int position) {
            updateIndicators(position);
        }

    }

    public void updateIndicators(int position) {
        DisplayMetrics metrics = getResources().getDisplayMetrics();
        int resizeValue = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 10, metrics);
        int defaultValue = (int) TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, 10, metrics);
        switch (position) {
            case 0:
                indicator1.getLayoutParams().height = resizeValue;
                indicator1.getLayoutParams().width = resizeValue;
                indicator1.requestLayout();
                indicator1.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorPrimary)));

                indicator2.getLayoutParams().height = defaultValue;
                indicator2.getLayoutParams().width = defaultValue;
                indicator2.requestLayout();
                indicator2.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                indicator3.getLayoutParams().height = defaultValue;
                indicator3.getLayoutParams().width = defaultValue;
                indicator3.requestLayout();

                indicator4.getLayoutParams().height = defaultValue;
                indicator4.getLayoutParams().width = defaultValue;
                indicator4.requestLayout();
                indicator4.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                indicator5.getLayoutParams().height = defaultValue;
                indicator5.getLayoutParams().width = defaultValue;
                indicator5.requestLayout();
                indicator5.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                break;

            case 1:
                indicator1.getLayoutParams().height = defaultValue;
                indicator1.getLayoutParams().width = defaultValue;
                indicator1.requestLayout();
                indicator1.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                indicator2.getLayoutParams().height = resizeValue;
                indicator2.getLayoutParams().width = resizeValue;
                indicator2.requestLayout();
                indicator2.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorPrimary)));

                indicator3.getLayoutParams().height = defaultValue;
                indicator3.getLayoutParams().width = defaultValue;
                indicator3.requestLayout();
                indicator3.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                indicator4.getLayoutParams().height = defaultValue;
                indicator4.getLayoutParams().width = defaultValue;
                indicator4.requestLayout();
                indicator4.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                indicator5.getLayoutParams().height = defaultValue;
                indicator5.getLayoutParams().width = defaultValue;
                indicator5.requestLayout();
                indicator5.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));
                break;

            case 2:
                indicator1.getLayoutParams().height = defaultValue;
                indicator1.getLayoutParams().width = defaultValue;
                indicator1.requestLayout();
                indicator1.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                indicator2.getLayoutParams().height = defaultValue;
                indicator2.getLayoutParams().width = defaultValue;
                indicator2.requestLayout();
                indicator2.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                indicator3.getLayoutParams().height = resizeValue;
                indicator3.getLayoutParams().width = resizeValue;
                indicator3.requestLayout();
                indicator3.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorPrimary)));

                indicator4.getLayoutParams().height = defaultValue;
                indicator4.getLayoutParams().width = defaultValue;
                indicator4.requestLayout();
                indicator4.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                indicator5.getLayoutParams().height = defaultValue;
                indicator5.getLayoutParams().width = defaultValue;
                indicator5.requestLayout();
                indicator5.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                break;

            case 3:
                indicator1.getLayoutParams().height = defaultValue;
                indicator1.getLayoutParams().width = defaultValue;
                indicator1.requestLayout();
                indicator1.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                indicator2.getLayoutParams().height = defaultValue;
                indicator2.getLayoutParams().width = defaultValue;
                indicator2.requestLayout();
                indicator2.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                indicator3.getLayoutParams().height = defaultValue;
                indicator3.getLayoutParams().width = defaultValue;
                indicator3.requestLayout();
                indicator3.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                indicator4.getLayoutParams().height = resizeValue;
                indicator4.getLayoutParams().width = resizeValue;
                indicator4.requestLayout();
                indicator4.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorPrimary)));

                indicator5.getLayoutParams().height = defaultValue;
                indicator5.getLayoutParams().width = defaultValue;
                indicator5.requestLayout();
                indicator5.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                break;


            case 4:
                indicator1.getLayoutParams().height = defaultValue;
                indicator1.getLayoutParams().width = defaultValue;
                indicator1.requestLayout();
                indicator1.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                indicator2.getLayoutParams().height = defaultValue;
                indicator2.getLayoutParams().width = defaultValue;
                indicator2.requestLayout();
                indicator2.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                indicator3.getLayoutParams().height = defaultValue;
                indicator3.getLayoutParams().width = defaultValue;
                indicator3.requestLayout();
                indicator3.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                indicator4.getLayoutParams().height = defaultValue;
                indicator4.getLayoutParams().width = defaultValue;
                indicator4.requestLayout();
                indicator4.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorWhite)));

                indicator5.getLayoutParams().height = resizeValue;
                indicator5.getLayoutParams().width = resizeValue;
                indicator5.requestLayout();
                indicator5.setImageTintList(ColorStateList.valueOf(getResources().getColor(R.color.colorPrimary)));
                break;
        }

    }
}
