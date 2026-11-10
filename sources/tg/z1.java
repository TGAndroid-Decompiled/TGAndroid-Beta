package tg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.v5;
import org.telegram.ui.Components.wq;
public final class z1 {
    public boolean f56028b;
    public int f56029c;
    public Bitmap d;
    public Bitmap f56030e;
    public Bitmap f56031f;
    public Bitmap f56032g;
    public float f56034j;
    public float f56035k;
    public int f56038n;
    public float[] f56039o;
    public final Paint f56042r;
    public final Paint f56043s;
    public final c2 f56044t;
    public final v5 f56027a = new v5(0.0f, (View) null, 0, 320, wq.h);
    public final RectF h = new RectF();
    public final RectF f56033i = new RectF();
    public final Path f56036l = new Path();
    public final Path f56037m = new Path();
    public final Paint f56040p = new Paint(1);
    public final Paint f56041q = new Paint(1);

    public z1(c2 c2Var) {
        this.f56044t = c2Var;
        new Paint(1);
        this.f56042r = new Paint(1);
        this.f56043s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f56032g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f56031f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f56030e;
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
