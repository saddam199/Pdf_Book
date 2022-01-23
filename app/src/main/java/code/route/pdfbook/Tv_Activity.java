package code.route.pdfbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Tv_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv);

        PDFView pdfView = findViewById(R.id.pdf_view);
        pdfView.fromAsset("tv.pdf").load();
    }
}