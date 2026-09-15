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
    public boolean f41458b;
    public int f41459c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f41460f;
    public Bitmap f41461g;
    public float f41463j;
    public float f41464k;
    public int f41467n;
    public float[] f41468o;
    public final Paint f41471r;
    public final Paint f41472s;
    public final p2 f41473t;
    public final c6 f41457a = new c6(0.0f, (View) null, 0, 320, qr.h);
    public final RectF h = new RectF();
    public final RectF f41462i = new RectF();
    public final Path f41465l = new Path();
    public final Path f41466m = new Path();
    public final Paint f41469p = new Paint(1);
    public final Paint f41470q = new Paint(1);

    public m2(p2 p2Var) {
        this.f41473t = p2Var;
        new Paint(1);
        this.f41471r = new Paint(1);
        this.f41472s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f41461g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f41460f;
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
