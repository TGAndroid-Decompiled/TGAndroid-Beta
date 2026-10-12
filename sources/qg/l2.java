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
import org.telegram.ui.Components.js;
public final class l2 {
    public boolean f46278b;
    public int f46279c;
    public Bitmap d;
    public Bitmap f46280e;
    public Bitmap f46281f;
    public Bitmap f46282g;
    public float f46284j;
    public float f46285k;
    public int f46288n;
    public float[] f46289o;
    public final Paint f46292r;
    public final Paint f46293s;
    public final o2 f46294t;
    public final g6 f46277a = new g6(0.0f, (View) null, 0, 320, js.h);
    public final RectF h = new RectF();
    public final RectF f46283i = new RectF();
    public final Path f46286l = new Path();
    public final Path f46287m = new Path();
    public final Paint f46290p = new Paint(1);
    public final Paint f46291q = new Paint(1);

    public l2(o2 o2Var) {
        this.f46294t = o2Var;
        new Paint(1);
        this.f46292r = new Paint(1);
        this.f46293s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f46282g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f46281f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f46280e;
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
