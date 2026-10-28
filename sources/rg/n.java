package rg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import sg.z1;
public final class n extends z1 {
    public final y f47506y;

    public n(y yVar, Context context, Bitmap bitmap) {
        super(context);
        this.f47506y = yVar;
        Paint paint = new Paint(1);
        this.f48637b = paint;
        Paint paint2 = new Paint(1);
        this.f48638c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = 0.5f;
        this.f48639f = 0.5f;
        this.h = new Path();
        this.f48640n = new Rect();
        this.f48641r = new RectF();
        this.f48636a = bitmap;
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
