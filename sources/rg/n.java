package rg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import sg.a2;
public final class n extends a2 {
    public final y f47468y;

    public n(y yVar, Context context, Bitmap bitmap) {
        super(context);
        this.f47468y = yVar;
        Paint paint = new Paint(1);
        this.f48138b = paint;
        Paint paint2 = new Paint(1);
        this.f48139c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = 0.5f;
        this.f48140f = 0.5f;
        this.h = new Path();
        this.f48141n = new Rect();
        this.f48142r = new RectF();
        this.f48137a = bitmap;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        paint.setColor(-1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(AndroidUtilities.dp(1.0f));
        paint2.setColor(-1711276033);
        paint3.setStyle(style);
        paint3.setStrokeWidth(AndroidUtilities.dp(12.0f));
    }
}
