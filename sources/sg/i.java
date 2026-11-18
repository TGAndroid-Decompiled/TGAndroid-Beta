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
        this.f58072b = paint;
        Paint paint2 = new Paint(1);
        this.f58073c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f58074e = 0.5f;
        this.f58075f = 0.5f;
        this.h = new Path();
        this.f58076n = new Rect();
        this.f58077r = new RectF();
        this.f58071a = bitmap;
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
