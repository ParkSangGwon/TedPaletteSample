package gun0912.tedpalettesample;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.graphics.Palette;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;

/**
 * Created by TedPark on 2016. 10. 27..
 */

public class NormalPaletteActivity extends BaseActivity {

    @Bind(R.id.ivImage)
    ImageView ivImage;


    @Bind(R.id.viewVibrant)
    View viewVibrant;
    @Bind(R.id.tvVibrantTitle)
    TextView tvVibrantTitle;
    @Bind(R.id.tvVibrantBody)
    TextView tvVibrantBody;

    @Bind(R.id.viewDarkVibrant)
    View viewDarkVibrant;
    @Bind(R.id.tvDarkVibrantTitle)
    TextView tvDarkVibrantTitle;
    @Bind(R.id.tvDarkVibrantBody)
    TextView tvDarkVibrantBody;

    @Bind(R.id.viewLightVibrant)
    View viewLightVibrant;
    @Bind(R.id.tvLightVibrantTitle)
    TextView tvLightVibrantTitle;
    @Bind(R.id.tvLightVibrantBody)
    TextView tvLightVibrantBody;


    @Bind(R.id.viewMuted)
    View viewMuted;
    @Bind(R.id.tvMutedTitle)
    TextView tvMutedTitle;
    @Bind(R.id.tvMutedBody)
    TextView tvMutedBody;

    @Bind(R.id.viewDarkMuted)
    View viewDarkMuted;
    @Bind(R.id.tvDarkMutedTitle)
    TextView tvDarkMutedTitle;
    @Bind(R.id.tvDarkMutedBody)
    TextView tvDarkMutedBody;

    @Bind(R.id.viewLightMuted)
    View viewLightMuted;
    @Bind(R.id.tvLightMutedTitle)
    TextView tvLightMutedTitle;
    @Bind(R.id.tvLightMutedBody)
    TextView tvLightMutedBody;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);


        Bitmap bitmap = ((BitmapDrawable)ivImage.getDrawable()).getBitmap();


        // 비동기
        Palette.from(bitmap).maximumColorCount(24).generate(new Palette.PaletteAsyncListener() {
            @Override
            public void onGenerated(Palette palette) {
                setPalette(palette);
            }
        });





    }


    private void setPalette(Palette palette){

        if(palette==null){
            return;
        }




        Palette.Swatch vibrantSwatch = palette.getVibrantSwatch();

        if(vibrantSwatch!=null){
            viewVibrant.setBackgroundColor(vibrantSwatch.getRgb());
            tvVibrantTitle.setTextColor(vibrantSwatch.getTitleTextColor());
            tvVibrantBody.setTextColor(vibrantSwatch.getBodyTextColor());
        }



        Palette.Swatch darkVibrantSwatch = palette.getDarkVibrantSwatch();
        if(darkVibrantSwatch!=null){
            viewDarkVibrant.setBackgroundColor(darkVibrantSwatch.getRgb());
            tvDarkVibrantTitle.setTextColor(darkVibrantSwatch.getTitleTextColor());
            tvDarkVibrantBody.setTextColor(darkVibrantSwatch.getBodyTextColor());
        }


        Palette.Swatch lightVibrantSwatch = palette.getLightVibrantSwatch();
        if(lightVibrantSwatch!=null){
            viewLightVibrant.setBackgroundColor(lightVibrantSwatch.getRgb());
            tvLightVibrantTitle.setTextColor(lightVibrantSwatch.getTitleTextColor());
            tvLightVibrantBody.setTextColor(lightVibrantSwatch.getBodyTextColor());
        }





        Palette.Swatch mutedSwatch = palette.getMutedSwatch();
        if(mutedSwatch!=null){
            viewMuted.setBackgroundColor(mutedSwatch.getRgb());
            tvMutedTitle.setTextColor(mutedSwatch.getTitleTextColor());
            tvMutedBody.setTextColor(mutedSwatch.getBodyTextColor());
        }



        Palette.Swatch darkMutedSwatch = palette.getDarkMutedSwatch();
        if(darkMutedSwatch!=null){
            viewDarkMuted.setBackgroundColor(darkMutedSwatch.getRgb());
            tvDarkMutedTitle.setTextColor(darkMutedSwatch.getTitleTextColor());
            tvDarkMutedBody.setTextColor(darkMutedSwatch.getBodyTextColor());

        }

        Palette.Swatch lightMutedSwatch = palette.getLightMutedSwatch();
        if(lightMutedSwatch!=null){
            viewLightMuted.setBackgroundColor(lightMutedSwatch.getRgb());
            tvLightMutedTitle.setTextColor(lightMutedSwatch.getTitleTextColor());
            tvLightMutedBody.setTextColor(lightMutedSwatch.getBodyTextColor());
        }



    }
}
