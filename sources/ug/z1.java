package ug;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;
public final class z1 {
    public boolean f56321b;
    public int f56322c;
    public Bitmap d;
    public Bitmap f56323e;
    public Bitmap f56324f;
    public Bitmap f56325g;
    public float f56327j;
    public float f56328k;
    public int f56331n;
    public float[] f56332o;
    public final Paint f56335r;
    public final Paint f56336s;
    public final c2 f56337t;
    public final u5 f56320a = new u5(0.0f, (View) null, 0, 320, xq.h);
    public final RectF h = new RectF();
    public final RectF f56326i = new RectF();
    public final Path f56329l = new Path();
    public final Path f56330m = new Path();
    public final Paint f56333p = new Paint(1);
    public final Paint f56334q = new Paint(1);

    public z1(c2 c2Var) {
        this.f56337t = c2Var;
        new Paint(1);
        this.f56335r = new Paint(1);
        this.f56336s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f56325g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f56324f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f56323e;
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
