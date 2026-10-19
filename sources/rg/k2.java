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
public final class k2 {
    public boolean f45416b;
    public int f45417c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f45418f;
    public Bitmap f45419g;
    public float f45421j;
    public float f45422k;
    public int f45425n;
    public float[] f45426o;
    public final Paint f45429r;
    public final Paint f45430s;
    public final n2 f45431t;
    public final f6 f45415a = new f6(0.0f, (View) null, 0, 320, bs.h);
    public final RectF h = new RectF();
    public final RectF f45420i = new RectF();
    public final Path f45423l = new Path();
    public final Path f45424m = new Path();
    public final Paint f45427p = new Paint(1);
    public final Paint f45428q = new Paint(1);

    public k2(n2 n2Var) {
        this.f45431t = n2Var;
        new Paint(1);
        this.f45429r = new Paint(1);
        this.f45430s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f45419g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f45418f;
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
