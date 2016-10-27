package gun0912.tedpalettesample;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import butterknife.OnClick;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }

    @OnClick(R.id.btnSingle)
    public void onNormalClick(View view){
        Intent intent = new Intent(this,NormalPaletteActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btnGlide)
    public void onGlideClick(View view){
        Intent intent = new Intent(this,GlidePaletteActivity.class);
        startActivity(intent);
    }

}
