package tg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.lr;
public final class b2 {
    public boolean f57732b;
    public int f57733c;
    public Bitmap d;
    public Bitmap f57734e;
    public Bitmap f57735f;
    public Bitmap f57736g;
    public float f57738j;
    public float f57739k;
    public int f57742n;
    public float[] f57743o;
    public final Paint f57746r;
    public final Paint f57747s;
    public final e2 f57748t;
    public final c6 f57731a = new c6(0.0f, (View) null, 0, 320, lr.h);
    public final RectF h = new RectF();
    public final RectF f57737i = new RectF();
    public final Path f57740l = new Path();
    public final Path f57741m = new Path();
    public final Paint f57744p = new Paint(1);
    public final Paint f57745q = new Paint(1);

    public b2(e2 e2Var) {
        this.f57748t = e2Var;
        new Paint(1);
        this.f57746r = new Paint(1);
        this.f57747s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f57736g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f57735f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f57734e;
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
