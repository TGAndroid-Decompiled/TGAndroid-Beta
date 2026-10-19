package qg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import rg.z1;
public final class o extends z1 {
    public final y f44580y;

    public o(y yVar, Context context, Bitmap bitmap) {
        super(context);
        this.f44580y = yVar;
        Paint paint = new Paint(1);
        this.f45718b = paint;
        Paint paint2 = new Paint(1);
        this.f45719c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = 0.5f;
        this.f45720f = 0.5f;
        this.h = new Path();
        this.f45721n = new Rect();
        this.f45722r = new RectF();
        this.f45717a = bitmap;
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
