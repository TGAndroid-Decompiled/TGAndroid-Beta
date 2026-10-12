package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.js;
public final class l2 {
    public boolean f46286b;
    public int f46287c;
    public Bitmap d;
    public Bitmap f46288e;
    public Bitmap f46289f;
    public Bitmap f46290g;
    public float f46292j;
    public float f46293k;
    public int f46296n;
    public float[] f46297o;
    public final Paint f46300r;
    public final Paint f46301s;
    public final o2 f46302t;
    public final g6 f46285a = new g6(0.0f, (View) null, 0, 320, js.h);
    public final RectF h = new RectF();
    public final RectF f46291i = new RectF();
    public final Path f46294l = new Path();
    public final Path f46295m = new Path();
    public final Paint f46298p = new Paint(1);
    public final Paint f46299q = new Paint(1);

    public l2(o2 o2Var) {
        this.f46302t = o2Var;
        new Paint(1);
        this.f46300r = new Paint(1);
        this.f46301s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f46290g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f46289f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f46288e;
        if (bitmap != null) {
            return bitmap;
        }
        return this.d;
    }

    public final Bitmap c() {
        Bitmap createBitmap = Bitmap.createBitmap(b().getWidth(), b().getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-16777216);
        Paint paint = new Paint(3);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawBitmap(b(), 0.0f, 0.0f, paint);
        return createBitmap;
    }
}
