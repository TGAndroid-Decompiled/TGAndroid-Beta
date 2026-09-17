package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import rg.a2;
public final class n extends a2 {
    public final x f44515y;

    public n(x xVar, Context context, Bitmap bitmap) {
        super(context);
        this.f44515y = xVar;
        Paint paint = new Paint(1);
        this.f45145b = paint;
        Paint paint2 = new Paint(1);
        this.f45146c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f45147e = 0.5f;
        this.f45148f = 0.5f;
        this.h = new Path();
        this.f45149n = new Rect();
        this.f45150r = new RectF();
        this.f45144a = bitmap;
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
