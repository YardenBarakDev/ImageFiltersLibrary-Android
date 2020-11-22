package com.bawp.filterslibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.YBdev.imagefilterslibrary.ColorFilters;
import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    private ImageView main_IMG_image;
    private MaterialButton main_BTN_blue;
    private MaterialButton main_BTN_green;
    private MaterialButton main_BTN_red;
    private MaterialButton main_BTN_grey;
    private MaterialButton main_BTN_greyBlue;
    private MaterialButton main_BTN_greyRed;
    private MaterialButton main_BTN_greyGreen;
    private MaterialButton main_BTN_inverting;
    private MaterialButton main_BTN_colorSwap;
    private MaterialButton main_BTN_colorSwap2;
    private MaterialButton main_BTN_reset;
    private MaterialButton main_BTN_show;

    //library
    private ColorFilters colorFilters;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();

        //set listener to buttons
        main_BTN_blue.setOnClickListener(mainClickListener);
        main_BTN_green.setOnClickListener(mainClickListener);
        main_BTN_red.setOnClickListener(mainClickListener);
        main_BTN_grey.setOnClickListener(mainClickListener);
        main_BTN_greyBlue.setOnClickListener(mainClickListener);
        main_BTN_greyRed.setOnClickListener(mainClickListener);
        main_BTN_greyGreen.setOnClickListener(mainClickListener);
        main_BTN_inverting.setOnClickListener(mainClickListener);
        main_BTN_reset.setOnClickListener(mainClickListener);
        main_BTN_colorSwap.setOnClickListener(mainClickListener);
        main_BTN_colorSwap2.setOnClickListener(mainClickListener);
        main_BTN_show.setOnClickListener(mainClickListener);

        colorFilters = new ColorFilters();
    }


    View.OnClickListener mainClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch ((String)view.getTag()){
                case "main_BTN_blue":
                    colorFilters.setFilter(main_IMG_image, ColorFilters.filters.BLUE);
                    break;
                case "main_BTN_green":
                    colorFilters.setFilter(main_IMG_image, ColorFilters.filters.GREEN);
                    break;
                case "main_BTN_red":
                    colorFilters.setFilter(main_IMG_image, ColorFilters.filters.RED);
                    break;
                case "main_BTN_grey":
                    colorFilters.setFilter(main_IMG_image, ColorFilters.filters.GREY);
                    break;
                case "main_BTN_greyBlue":
                    colorFilters.setFilter(main_IMG_image, ColorFilters.filters.GREY_ON_BLUE);
                    break;
                case "main_BTN_greyRed":
                    colorFilters.setFilter(main_IMG_image, ColorFilters.filters.GREY_ON_RED);
                    break;
                case "main_BTN_greyGreen":
                    colorFilters.setFilter(main_IMG_image, ColorFilters.filters.GREY_ON_GREEN);
                    break;
                case "main_BTN_inverting":
                    colorFilters.setFilter(main_IMG_image, ColorFilters.filters.INVERT);
                    break;
                case "main_BTN_colorSwap":
                    colorFilters.setFilter(main_IMG_image, ColorFilters.filters.COLOR_SWAP);
                    break;
                case "main_BTN_colorSwap2":
                    colorFilters.setFilter(main_IMG_image, ColorFilters.filters.COLOR_SWAP2);
                    break;
                case "main_BTN_reset":
                    colorFilters.setFilter(main_IMG_image, ColorFilters.filters.ORIGINAL);
                    break;
                case "main_BTN_show":
                    colorFilters.uploadImage(MainActivity.this, main_IMG_image, R.drawable.image);
                    break;
            }
        }
    };

    private void findViews() {
        main_IMG_image = findViewById(R.id.main_IMG_image);
        main_BTN_blue = findViewById(R.id.main_BTN_blue);
        main_BTN_green = findViewById(R.id.main_BTN_green);
        main_BTN_red = findViewById(R.id.main_BTN_red);
        main_BTN_grey = findViewById(R.id.main_BTN_grey);
        main_BTN_greyBlue = findViewById(R.id.main_BTN_greyBlue);
        main_BTN_greyRed = findViewById(R.id.main_BTN_greyRed);
        main_BTN_greyGreen = findViewById(R.id.main_BTN_greyGreen);
        main_BTN_inverting = findViewById(R.id.main_BTN_inverting);
        main_BTN_colorSwap = findViewById(R.id.main_BTN_colorSwap);
        main_BTN_colorSwap2 = findViewById(R.id.main_BTN_colorSwap2);
        main_BTN_reset = findViewById(R.id.main_BTN_reset);
        main_BTN_show = findViewById(R.id.main_BTN_show);

    }
}