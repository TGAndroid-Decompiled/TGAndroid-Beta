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
    public boolean f45306b;
    public int f45307c;
    public Bitmap d;
    public Bitmap f45308e;
    public Bitmap f45309f;
    public Bitmap f45310g;
    public float f45312j;
    public float f45313k;
    public int f45316n;
    public float[] f45317o;
    public final Paint f45320r;
    public final Paint f45321s;
    public final o2 f45322t;
    public final e6 f45305a = new e6(0.0f, (View) null, 0, 320, pr.h);
    public final RectF h = new RectF();
    public final RectF f45311i = new RectF();
    public final Path f45314l = new Path();
    public final Path f45315m = new Path();
    public final Paint f45318p = new Paint(1);
    public final Paint f45319q = new Paint(1);

    public l2(o2 o2Var) {
        this.f45322t = o2Var;
        new Paint(1);
        this.f45320r = new Paint(1);
        this.f45321s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f45310g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f45309f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f45308e;
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
