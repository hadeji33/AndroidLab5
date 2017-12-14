package com.example.lairg.lab5;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Individual extends AppCompatActivity {

    Path path;
    Paint paint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new IndividualDraw(this));
    }

    class IndividualDraw extends View {

        Path path;
        Paint paint;

        public IndividualDraw(Context context) {
            super(context);
            path = new Path();
            paint = new Paint();

        }
        @Override
        protected void onDraw(Canvas canvas) {
            int n = 6;
            int R = 100;
            float mid = getWidth() / 2;
            float min = Math.min(getWidth(), getHeight());
            float half = min / 2;
            //mid = mid - half;
            float x[] = new float[n];
            float y[] = new float[n];

            double z = 0 ;  int i = 0; double angle = 360.0 / n ;

            while(i < n){
                x[i] = (float) (mid + (Math.sin( z/180*Math.PI) * R));
                y[i] = (float) (half - (Math.cos( z/180*Math.PI) * R));
                z = z + angle;
                i++;
            }
            path.reset();
            // top left
            path.moveTo(x[0], y[0]);

            for (int j=1; j < 6; j++) {
                path.lineTo(x[j], y[j]);
            }

            path.close();
            canvas.drawPath(path, paint);
        }
    }
}
