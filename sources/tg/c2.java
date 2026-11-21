package tg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
public final class c2 {
    public boolean f57786b;
    public int f57787c;
    public Bitmap d;
    public Bitmap f57788e;
    public Bitmap f57789f;
    public Bitmap f57790g;
    public float f57792j;
    public float f57793k;
    public int f57796n;
    public float[] f57797o;
    public final Paint f57800r;
    public final Paint f57801s;
    public final f2 f57802t;
    public final d6 f57785a = new d6(0.0f, (View) null, 0, 320, nr.h);
    public final RectF h = new RectF();
    public final RectF f57791i = new RectF();
    public final Path f57794l = new Path();
    public final Path f57795m = new Path();
    public final Paint f57798p = new Paint(1);
    public final Paint f57799q = new Paint(1);

    public c2(f2 f2Var) {
        this.f57802t = f2Var;
        new Paint(1);
        this.f57800r = new Paint(1);
        this.f57801s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f57790g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f57789f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f57788e;
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
