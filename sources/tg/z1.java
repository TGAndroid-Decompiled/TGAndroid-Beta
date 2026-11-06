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
    public boolean f55925b;
    public int f55926c;
    public Bitmap d;
    public Bitmap f55927e;
    public Bitmap f55928f;
    public Bitmap f55929g;
    public float f55931j;
    public float f55932k;
    public int f55935n;
    public float[] f55936o;
    public final Paint f55939r;
    public final Paint f55940s;
    public final c2 f55941t;
    public final w5 f55924a = new w5(0.0f, (View) null, 0, 320, xq.h);
    public final RectF h = new RectF();
    public final RectF f55930i = new RectF();
    public final Path f55933l = new Path();
    public final Path f55934m = new Path();
    public final Paint f55937p = new Paint(1);
    public final Paint f55938q = new Paint(1);

    public z1(c2 c2Var) {
        this.f55941t = c2Var;
        new Paint(1);
        this.f55939r = new Paint(1);
        this.f55940s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f55929g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f55928f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f55927e;
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
