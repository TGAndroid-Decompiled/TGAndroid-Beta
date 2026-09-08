package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.pr;
public final class l2 {
    public boolean f45305b;
    public int f45306c;
    public Bitmap d;
    public Bitmap f45307e;
    public Bitmap f45308f;
    public Bitmap f45309g;
    public float f45311j;
    public float f45312k;
    public int f45315n;
    public float[] f45316o;
    public final Paint f45319r;
    public final Paint f45320s;
    public final o2 f45321t;
    public final e6 f45304a = new e6(0.0f, (View) null, 0, 320, pr.h);
    public final RectF h = new RectF();
    public final RectF f45310i = new RectF();
    public final Path f45313l = new Path();
    public final Path f45314m = new Path();
    public final Paint f45317p = new Paint(1);
    public final Paint f45318q = new Paint(1);

    public l2(o2 o2Var) {
        this.f45321t = o2Var;
        new Paint(1);
        this.f45319r = new Paint(1);
        this.f45320s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f45309g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f45308f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f45307e;
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
