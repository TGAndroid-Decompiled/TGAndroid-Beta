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
    public boolean f45435b;
    public int f45436c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f45437f;
    public Bitmap f45438g;
    public float f45440j;
    public float f45441k;
    public int f45444n;
    public float[] f45445o;
    public final Paint f45448r;
    public final Paint f45449s;
    public final m2 f45450t;
    public final f6 f45434a = new f6(0.0f, (View) null, 0, 320, bs.h);
    public final RectF h = new RectF();
    public final RectF f45439i = new RectF();
    public final Path f45442l = new Path();
    public final Path f45443m = new Path();
    public final Paint f45446p = new Paint(1);
    public final Paint f45447q = new Paint(1);

    public j2(m2 m2Var) {
        this.f45450t = m2Var;
        new Paint(1);
        this.f45448r = new Paint(1);
        this.f45449s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f45438g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f45437f;
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
