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
import org.telegram.ui.Components.is;
public final class l2 {
    public boolean f46385b;
    public int f46386c;
    public Bitmap d;
    public Bitmap f46387e;
    public Bitmap f46388f;
    public Bitmap f46389g;
    public float f46391j;
    public float f46392k;
    public int f46395n;
    public float[] f46396o;
    public final Paint f46399r;
    public final Paint f46400s;
    public final o2 f46401t;
    public final g6 f46384a = new g6(0.0f, (View) null, 0, 320, is.h);
    public final RectF h = new RectF();
    public final RectF f46390i = new RectF();
    public final Path f46393l = new Path();
    public final Path f46394m = new Path();
    public final Paint f46397p = new Paint(1);
    public final Paint f46398q = new Paint(1);

    public l2(o2 o2Var) {
        this.f46401t = o2Var;
        new Paint(1);
        this.f46399r = new Paint(1);
        this.f46400s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f46389g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f46388f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f46387e;
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
