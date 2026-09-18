package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.qr;
public final class j2 {
    public boolean f41680b;
    public int f41681c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f41682f;
    public Bitmap f41683g;
    public float f41685j;
    public float f41686k;
    public int f41689n;
    public float[] f41690o;
    public final Paint f41693r;
    public final Paint f41694s;
    public final m2 f41695t;
    public final e6 f41679a = new e6(0.0f, (View) null, 0, 320, qr.h);
    public final RectF h = new RectF();
    public final RectF f41684i = new RectF();
    public final Path f41687l = new Path();
    public final Path f41688m = new Path();
    public final Paint f41691p = new Paint(1);
    public final Paint f41692q = new Paint(1);

    public j2(m2 m2Var) {
        this.f41695t = m2Var;
        new Paint(1);
        this.f41693r = new Paint(1);
        this.f41694s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f41683g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f41682f;
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
