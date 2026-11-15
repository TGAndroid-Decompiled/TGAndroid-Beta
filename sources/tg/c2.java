package tg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.u5;
public final class c2 {
    public boolean f57162b;
    public int f57163c;
    public Bitmap d;
    public Bitmap f57164e;
    public Bitmap f57165f;
    public Bitmap f57166g;
    public float f57168j;
    public float f57169k;
    public int f57172n;
    public float[] f57173o;
    public final Paint f57176r;
    public final Paint f57177s;
    public final f2 f57178t;
    public final u5 f57161a = new u5(0.0f, (View) null, 0, 320, er.h);
    public final RectF h = new RectF();
    public final RectF f57167i = new RectF();
    public final Path f57170l = new Path();
    public final Path f57171m = new Path();
    public final Paint f57174p = new Paint(1);
    public final Paint f57175q = new Paint(1);

    public c2(f2 f2Var) {
        this.f57178t = f2Var;
        new Paint(1);
        this.f57176r = new Paint(1);
        this.f57177s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f57166g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f57165f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f57164e;
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
