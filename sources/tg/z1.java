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
    public boolean f56017b;
    public int f56018c;
    public Bitmap d;
    public Bitmap f56019e;
    public Bitmap f56020f;
    public Bitmap f56021g;
    public float f56023j;
    public float f56024k;
    public int f56027n;
    public float[] f56028o;
    public final Paint f56031r;
    public final Paint f56032s;
    public final c2 f56033t;
    public final w5 f56016a = new w5(0.0f, (View) null, 0, 320, xq.h);
    public final RectF h = new RectF();
    public final RectF f56022i = new RectF();
    public final Path f56025l = new Path();
    public final Path f56026m = new Path();
    public final Paint f56029p = new Paint(1);
    public final Paint f56030q = new Paint(1);

    public z1(c2 c2Var) {
        this.f56033t = c2Var;
        new Paint(1);
        this.f56031r = new Paint(1);
        this.f56032s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f56021g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f56020f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f56019e;
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
