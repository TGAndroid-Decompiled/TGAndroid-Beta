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
import org.telegram.ui.Components.tr;
public final class k2 {
    public boolean f41814b;
    public int f41815c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f41816f;
    public Bitmap f41817g;
    public float f41819j;
    public float f41820k;
    public int f41823n;
    public float[] f41824o;
    public final Paint f41827r;
    public final Paint f41828s;
    public final n2 f41829t;
    public final e6 f41813a = new e6(0.0f, (View) null, 0, 320, tr.h);
    public final RectF h = new RectF();
    public final RectF f41818i = new RectF();
    public final Path f41821l = new Path();
    public final Path f41822m = new Path();
    public final Paint f41825p = new Paint(1);
    public final Paint f41826q = new Paint(1);

    public k2(n2 n2Var) {
        this.f41829t = n2Var;
        new Paint(1);
        this.f41827r = new Paint(1);
        this.f41828s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f41817g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f41816f;
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
