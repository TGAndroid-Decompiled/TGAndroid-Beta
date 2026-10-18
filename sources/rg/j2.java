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
public final class j2 {
    public boolean f45409b;
    public int f45410c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f45411f;
    public Bitmap f45412g;
    public float f45414j;
    public float f45415k;
    public int f45418n;
    public float[] f45419o;
    public final Paint f45422r;
    public final Paint f45423s;
    public final m2 f45424t;
    public final f6 f45408a = new f6(0.0f, (View) null, 0, 320, bs.h);
    public final RectF h = new RectF();
    public final RectF f45413i = new RectF();
    public final Path f45416l = new Path();
    public final Path f45417m = new Path();
    public final Paint f45420p = new Paint(1);
    public final Paint f45421q = new Paint(1);

    public j2(m2 m2Var) {
        this.f45424t = m2Var;
        new Paint(1);
        this.f45422r = new Paint(1);
        this.f45423s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f45412g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f45411f;
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
