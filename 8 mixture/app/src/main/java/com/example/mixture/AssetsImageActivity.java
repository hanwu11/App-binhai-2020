package com.example.mixture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;
import android.graphics.Bitmap;
import com.example.mixture.util.AssetsUtil;

public class AssetsImageActivity extends AppCompatActivity {
    private String mFilePath = "file/water.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assets_image);

        TextView tv_image_path = findViewById(R.id.tv_image_path);
        ImageView iv_assets_image = findViewById(R.id.iv_assets_image);
        tv_image_path.setText("下面图像来源于资产文件：" + mFilePath);
        // 从资产文件中读取出位图数据
        Bitmap bitmap = AssetsUtil.getImgFromAssets(this, mFilePath);
        iv_assets_image.setImageBitmap(bitmap);
    }
}