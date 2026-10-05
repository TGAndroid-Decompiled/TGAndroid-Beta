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
    public boolean f45120b;
    public int f45121c;
    public Bitmap d;
    public Bitmap f45122e;
    public Bitmap f45123f;
    public Bitmap f45124g;
    public float f45126j;
    public float f45127k;
    public int f45130n;
    public float[] f45131o;
    public final Paint f45134r;
    public final Paint f45135s;
    public final n2 f45136t;
    public final e6 f45119a = new e6(0.0f, (View) null, 0, 320, tr.h);
    public final RectF h = new RectF();
    public final RectF f45125i = new RectF();
    public final Path f45128l = new Path();
    public final Path f45129m = new Path();
    public final Paint f45132p = new Paint(1);
    public final Paint f45133q = new Paint(1);

    public k2(n2 n2Var) {
        this.f45136t = n2Var;
        new Paint(1);
        this.f45134r = new Paint(1);
        this.f45135s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f45124g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f45123f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f45122e;
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
