package yf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import zf.y1;

public final class n extends y1 {

    public final x f49985y;

    public n(x xVar, Context context, Bitmap bitmap) {
        super(context);
        this.f49985y = xVar;
        Paint paint = new Paint(1);
        this.f50781b = paint;
        Paint paint2 = new Paint(1);
        this.f50782c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f50783e = 0.5f;
        this.f50784f = 0.5f;
        this.h = new Path();
        this.f50785n = new Rect();
        this.f50786r = new RectF();
        this.f50780a = bitmap;
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
