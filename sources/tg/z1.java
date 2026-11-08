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
    public boolean f56016b;
    public int f56017c;
    public Bitmap d;
    public Bitmap f56018e;
    public Bitmap f56019f;
    public Bitmap f56020g;
    public float f56022j;
    public float f56023k;
    public int f56026n;
    public float[] f56027o;
    public final Paint f56030r;
    public final Paint f56031s;
    public final c2 f56032t;
    public final w5 f56015a = new w5(0.0f, (View) null, 0, 320, xq.h);
    public final RectF h = new RectF();
    public final RectF f56021i = new RectF();
    public final Path f56024l = new Path();
    public final Path f56025m = new Path();
    public final Paint f56028p = new Paint(1);
    public final Paint f56029q = new Paint(1);

    public z1(c2 c2Var) {
        this.f56032t = c2Var;
        new Paint(1);
        this.f56030r = new Paint(1);
        this.f56031s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f56020g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f56019f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f56018e;
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
