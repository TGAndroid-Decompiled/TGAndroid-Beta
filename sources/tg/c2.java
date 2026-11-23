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
    public boolean f57790b;
    public int f57791c;
    public Bitmap d;
    public Bitmap f57792e;
    public Bitmap f57793f;
    public Bitmap f57794g;
    public float f57796j;
    public float f57797k;
    public int f57800n;
    public float[] f57801o;
    public final Paint f57804r;
    public final Paint f57805s;
    public final f2 f57806t;
    public final d6 f57789a = new d6(0.0f, (View) null, 0, 320, nr.h);
    public final RectF h = new RectF();
    public final RectF f57795i = new RectF();
    public final Path f57798l = new Path();
    public final Path f57799m = new Path();
    public final Paint f57802p = new Paint(1);
    public final Paint f57803q = new Paint(1);

    public c2(f2 f2Var) {
        this.f57806t = f2Var;
        new Paint(1);
        this.f57804r = new Paint(1);
        this.f57805s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f57794g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f57793f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f57792e;
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
