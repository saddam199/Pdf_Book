package code.route.pdfbook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Taxi_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_taxi);

        PDFView pdfView = findViewById(R.id.pdf_view);
        pdfView.fromAsset("taxi.pdf").load();
    }
}