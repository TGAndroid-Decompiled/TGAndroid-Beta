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
    public boolean f55900b;
    public int f55901c;
    public Bitmap d;
    public Bitmap f55902e;
    public Bitmap f55903f;
    public Bitmap f55904g;
    public float f55906j;
    public float f55907k;
    public int f55910n;
    public float[] f55911o;
    public final Paint f55914r;
    public final Paint f55915s;
    public final c2 f55916t;
    public final w5 f55899a = new w5(0.0f, (View) null, 0, 320, xq.h);
    public final RectF h = new RectF();
    public final RectF f55905i = new RectF();
    public final Path f55908l = new Path();
    public final Path f55909m = new Path();
    public final Paint f55912p = new Paint(1);
    public final Paint f55913q = new Paint(1);

    public z1(c2 c2Var) {
        this.f55916t = c2Var;
        new Paint(1);
        this.f55914r = new Paint(1);
        this.f55915s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f55904g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f55903f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f55902e;
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
