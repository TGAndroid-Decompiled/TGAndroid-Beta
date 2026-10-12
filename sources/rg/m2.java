package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g6;
public final class m2 {
    public boolean f44353b;
    public int f44354c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f44355f;
    public Bitmap f44356g;
    public float f44358j;
    public float f44359k;
    public int f44362n;
    public float[] f44363o;
    public final Paint f44366r;
    public final Paint f44367s;
    public final p2 f44368t;
    public final g6 f44352a = new g6(0.0f, (View) null, 0, 320, es.h);
    public final RectF h = new RectF();
    public final RectF f44357i = new RectF();
    public final Path f44360l = new Path();
    public final Path f44361m = new Path();
    public final Paint f44364p = new Paint(1);
    public final Paint f44365q = new Paint(1);

    public m2(p2 p2Var) {
        this.f44368t = p2Var;
        new Paint(1);
        this.f44366r = new Paint(1);
        this.f44367s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f44356g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f44355f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.e;
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
