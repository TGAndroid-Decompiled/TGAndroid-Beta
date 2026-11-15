package sg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import tg.o1;
public final class i extends o1 {
    public final q E;

    public i(q qVar, Context context, Bitmap bitmap) {
        super(context);
        this.E = qVar;
        Paint paint = new Paint(1);
        this.f57486b = paint;
        Paint paint2 = new Paint(1);
        this.f57487c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f57488e = 0.5f;
        this.f57489f = 0.5f;
        this.h = new Path();
        this.f57490n = new Rect();
        this.f57491r = new RectF();
        this.f57485a = bitmap;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(4.0f));
        paint.setColor(-1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        paint2.setColor(-1711276033);
        paint3.setStyle(style);
        paint3.setStrokeWidth(org.telegram.messenger.g0.L(12.0f));
    }
}
