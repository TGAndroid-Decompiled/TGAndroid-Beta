package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
public final class l2 {
    public boolean f45865b;
    public int f45866c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f45867f;
    public Bitmap f45868g;
    public float f45870j;
    public float f45871k;
    public int f45874n;
    public float[] f45875o;
    public final Paint f45878r;
    public final Paint f45879s;
    public final o2 f45880t;
    public final f6 f45864a = new f6(0.0f, (View) null, 0, 320, bs.h);
    public final RectF h = new RectF();
    public final RectF f45869i = new RectF();
    public final Path f45872l = new Path();
    public final Path f45873m = new Path();
    public final Paint f45876p = new Paint(1);
    public final Paint f45877q = new Paint(1);

    public l2(o2 o2Var) {
        this.f45880t = o2Var;
        new Paint(1);
        this.f45878r = new Paint(1);
        this.f45879s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f45868g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f45867f;
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
