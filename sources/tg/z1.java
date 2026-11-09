package tg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;
public final class z1 {
    public boolean f56029b;
    public int f56030c;
    public Bitmap d;
    public Bitmap f56031e;
    public Bitmap f56032f;
    public Bitmap f56033g;
    public float f56035j;
    public float f56036k;
    public int f56039n;
    public float[] f56040o;
    public final Paint f56043r;
    public final Paint f56044s;
    public final c2 f56045t;
    public final w5 f56028a = new w5(0.0f, (View) null, 0, 320, xq.h);
    public final RectF h = new RectF();
    public final RectF f56034i = new RectF();
    public final Path f56037l = new Path();
    public final Path f56038m = new Path();
    public final Paint f56041p = new Paint(1);
    public final Paint f56042q = new Paint(1);

    public z1(c2 c2Var) {
        this.f56045t = c2Var;
        new Paint(1);
        this.f56043r = new Paint(1);
        this.f56044s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f56033g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f56032f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f56031e;
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
