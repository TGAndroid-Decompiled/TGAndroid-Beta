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
    public boolean f55924b;
    public int f55925c;
    public Bitmap d;
    public Bitmap f55926e;
    public Bitmap f55927f;
    public Bitmap f55928g;
    public float f55930j;
    public float f55931k;
    public int f55934n;
    public float[] f55935o;
    public final Paint f55938r;
    public final Paint f55939s;
    public final c2 f55940t;
    public final w5 f55923a = new w5(0.0f, (View) null, 0, 320, xq.h);
    public final RectF h = new RectF();
    public final RectF f55929i = new RectF();
    public final Path f55932l = new Path();
    public final Path f55933m = new Path();
    public final Paint f55936p = new Paint(1);
    public final Paint f55937q = new Paint(1);

    public z1(c2 c2Var) {
        this.f55940t = c2Var;
        new Paint(1);
        this.f55938r = new Paint(1);
        this.f55939s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f55928g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f55927f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f55926e;
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
