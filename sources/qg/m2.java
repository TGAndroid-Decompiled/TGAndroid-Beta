package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.qr;
public final class m2 {
    public boolean f41480b;
    public int f41481c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f41482f;
    public Bitmap f41483g;
    public float f41485j;
    public float f41486k;
    public int f41489n;
    public float[] f41490o;
    public final Paint f41493r;
    public final Paint f41494s;
    public final p2 f41495t;
    public final c6 f41479a = new c6(0.0f, (View) null, 0, 320, qr.h);
    public final RectF h = new RectF();
    public final RectF f41484i = new RectF();
    public final Path f41487l = new Path();
    public final Path f41488m = new Path();
    public final Paint f41491p = new Paint(1);
    public final Paint f41492q = new Paint(1);

    public m2(p2 p2Var) {
        this.f41495t = p2Var;
        new Paint(1);
        this.f41493r = new Paint(1);
        this.f41494s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f41483g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f41482f;
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
