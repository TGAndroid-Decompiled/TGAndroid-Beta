package pg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import qg.y1;
public final class n extends y1 {
    public final x f44548y;

    public n(x xVar, Context context, Bitmap bitmap) {
        super(context);
        this.f44548y = xVar;
        Paint paint = new Paint(1);
        this.f45438b = paint;
        Paint paint2 = new Paint(1);
        this.f45439c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f45440e = 0.5f;
        this.f45441f = 0.5f;
        this.h = new Path();
        this.f45442n = new Rect();
        this.f45443r = new RectF();
        this.f45437a = bitmap;
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
