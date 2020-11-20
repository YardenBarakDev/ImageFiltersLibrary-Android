package com.YBdev.imagefilterslibrary;

import android.content.Context;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.widget.ImageView;
import com.bumptech.glide.Glide;

public class ColorFilters {

    public interface filters{
        String BLUE = "BLUE";
        String RED = "RED";
        String GREEN = "GREEN";
        String GREY = "GREY";
        String GREY_ON_BLUE = "GREY_ON_BLUE";
        String GREY_ON_RED = "GREY_ON_RED";
        String GREY_ON_GREEN = "GREY_ON_GREEN";
        String INVERT = "INVERT";
        String COLOR_SWAP = "COLOR_SWAP";
        String COLOR_SWAP2 = "COLOR_SWAP2";
        String ORIGINAL = "ORIGINAL";
    }

    /**
     * this method set the filter on the Imageview "myImageView.setColorFilter"
     * @param imageView the Image view you want to apply the filter
     * @param color the filter's name. please use the filters interface "ColorFilters.filters.****"
     */
    public void setFilter(ImageView imageView, String color) {
        ColorMatrix matrix = new ColorMatrix();

        switch (color){
            case filters.BLUE:
                matrix.set(blueImage());
                break;
            case filters.GREEN:
                matrix.set(greenImage());
                break;
            case filters.RED:
                matrix.set(redImage());
                break;
            case filters.GREY:
                matrix.set(greyImage());
                break;
            case filters.GREY_ON_BLUE:
                matrix.set(greyOnBlueImage());
                break;
            case filters.GREY_ON_RED:
                matrix.set(greyOnRedImage());
                break;
            case filters.GREY_ON_GREEN:
                matrix.set(greyOnGreenImage());
                break;
            case filters.INVERT:
                matrix.set(invertedImage());
                break;
            case filters.COLOR_SWAP:
                matrix.set(colorSwapImage());
                break;
            case filters.COLOR_SWAP2:
                matrix.set(colorSwapImage2());
                break;
            default:
                matrix.set(originalImage());

        }
        ColorMatrixColorFilter filter = new ColorMatrixColorFilter(matrix);
        imageView.setColorFilter(filter);
    }

    private float [] blueImage() {
        return new float [] {
                0, 0, 0, 0, 0,
                0, 0, 0, 0, 0,
                1, 1, 1, 0, 0,
                0, 0, 0, 1, 0};
    }

    private float [] greenImage() {
        return new float[]{
                0, 0, 0, 0, 0,
                1, 1, 1, 0, 0,
                0, 0, 0, 0, 0,
                0, 0, 0, 1, 0};
    }

    private float [] redImage() {
        return new float []{
                1, 1, 1, 0, 0,
                0, 0, 0, 0, 0,
                0, 0, 0, 0, 0,
                0, 0, 0, 1, 0};

    }

    private float [] greyImage() {
        return new float []{
                0.33f, 0.33f, 0.33f, 0, 0,
                0.33f, 0.33f, 0.33f, 0, 0,
                0.33f, 0.33f, 0.33f, 0, 0,
                0, 0, 0, 1, 0};
    }

    private float [] greyOnBlueImage() {
        return new float []{
                0, 0, 1, 0, 0,
                0, 0, 1, 0, 0,
                0, 0, 1, 0, 0,
                0, 0, 0, 1, 0 };
    }

    private float [] greyOnRedImage() {
        return new float []{
                1, 0, 0, 0, 0,
                1, 0, 0, 0, 0,
                1, 0, 0, 0, 0,
                0, 0, 0, 1, 0};
    }

    private float [] greyOnGreenImage() {
        return new float []{
                0, 1, 0, 0, 0,
                0, 1, 0, 0, 0,
                0, 1, 0, 0, 0,
                0, 0, 0, 1, 0};
    }

    private float [] invertedImage() {
        return new float []{
                -1, 0, 0, 0, 255,
                0, -1, 0, 0, 255,
                0, 0, -1, 0, 255,
                0, 0, 0, 1, 0};
    }

    private float [] colorSwapImage() {
        return new float []{
                0, 0, 1, 0, 0,
                1, 0, 0, 0, 0,
                0, 1, 0, 0, 0,
                0, 0, 0, 1, 0};
    }

    private float [] colorSwapImage2() {
        return new float []{
                0, 1, 0, 0, 0,
                0, 0, 1, 0, 0,
                1, 0, 0, 0, 0,
                0, 0, 0, 1, 0 };
    }

    private float [] originalImage(){
        return new float[]{
                1, 0, 0, 0, 0,
                0, 1, 0, 0, 0,
                0, 0, 1, 0, 0,
                0, 0, 0, 1, 0
        };
    }

    /**
     * This method will present the selected image using Glide library
     * @param context the Activity's context
     * @param imageView the Imageview which you want to present on
     * @param image Image source "R.drawable.****"
     */
    public void uploadImage(Context context, ImageView imageView, int image) {
        Glide
                .with(context)
                .load(image)
                .into(imageView);
    }
}
