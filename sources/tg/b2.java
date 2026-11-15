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
public final class b2 {
    public boolean f57160b;
    public int f57161c;
    public Bitmap d;
    public Bitmap f57162e;
    public Bitmap f57163f;
    public Bitmap f57164g;
    public float f57166j;
    public float f57167k;
    public int f57170n;
    public float[] f57171o;
    public final Paint f57174r;
    public final Paint f57175s;
    public final e2 f57176t;
    public final u5 f57159a = new u5(0.0f, (View) null, 0, 320, er.h);
    public final RectF h = new RectF();
    public final RectF f57165i = new RectF();
    public final Path f57168l = new Path();
    public final Path f57169m = new Path();
    public final Paint f57172p = new Paint(1);
    public final Paint f57173q = new Paint(1);

    public b2(e2 e2Var) {
        this.f57176t = e2Var;
        new Paint(1);
        this.f57174r = new Paint(1);
        this.f57175s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f57164g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f57163f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f57162e;
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
