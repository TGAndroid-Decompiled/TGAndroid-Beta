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
import org.telegram.ui.Components.rr;
public final class k2 {
    public boolean f41713b;
    public int f41714c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f41715f;
    public Bitmap f41716g;
    public float f41718j;
    public float f41719k;
    public int f41722n;
    public float[] f41723o;
    public final Paint f41726r;
    public final Paint f41727s;
    public final n2 f41728t;
    public final e6 f41712a = new e6(0.0f, (View) null, 0, 320, rr.h);
    public final RectF h = new RectF();
    public final RectF f41717i = new RectF();
    public final Path f41720l = new Path();
    public final Path f41721m = new Path();
    public final Paint f41724p = new Paint(1);
    public final Paint f41725q = new Paint(1);

    public k2(n2 n2Var) {
        this.f41728t = n2Var;
        new Paint(1);
        this.f41726r = new Paint(1);
        this.f41727s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f41716g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f41715f;
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
