package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.zr;
public final class l2 {
    public boolean f45864b;
    public int f45865c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f45866f;
    public Bitmap f45867g;
    public float f45869j;
    public float f45870k;
    public int f45873n;
    public float[] f45874o;
    public final Paint f45877r;
    public final Paint f45878s;
    public final o2 f45879t;
    public final d6 f45863a = new d6(0.0f, (View) null, 0, 320, zr.h);
    public final RectF h = new RectF();
    public final RectF f45868i = new RectF();
    public final Path f45871l = new Path();
    public final Path f45872m = new Path();
    public final Paint f45875p = new Paint(1);
    public final Paint f45876q = new Paint(1);

    public l2(o2 o2Var) {
        this.f45879t = o2Var;
        new Paint(1);
        this.f45877r = new Paint(1);
        this.f45878s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f45867g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f45866f;
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
