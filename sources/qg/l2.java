package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.hs;
public final class l2 {
    public boolean f46341b;
    public int f46342c;
    public Bitmap d;
    public Bitmap f46343e;
    public Bitmap f46344f;
    public Bitmap f46345g;
    public float f46347j;
    public float f46348k;
    public int f46351n;
    public float[] f46352o;
    public final Paint f46355r;
    public final Paint f46356s;
    public final o2 f46357t;
    public final g6 f46340a = new g6(0.0f, (View) null, 0, 320, hs.h);
    public final RectF h = new RectF();
    public final RectF f46346i = new RectF();
    public final Path f46349l = new Path();
    public final Path f46350m = new Path();
    public final Paint f46353p = new Paint(1);
    public final Paint f46354q = new Paint(1);

    public l2(o2 o2Var) {
        this.f46357t = o2Var;
        new Paint(1);
        this.f46355r = new Paint(1);
        this.f46356s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f46345g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f46344f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f46343e;
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
