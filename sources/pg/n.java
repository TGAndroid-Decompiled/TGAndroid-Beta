package pg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import qg.z1;
public final class n extends z1 {
    public final x f45592y;

    public n(x xVar, Context context, Bitmap bitmap) {
        super(context);
        this.f45592y = xVar;
        Paint paint = new Paint(1);
        this.f46590b = paint;
        Paint paint2 = new Paint(1);
        this.f46591c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f46592e = 0.5f;
        this.f46593f = 0.5f;
        this.h = new Path();
        this.f46594n = new Rect();
        this.f46595r = new RectF();
        this.f46589a = bitmap;
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
