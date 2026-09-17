package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.pr;
public final class l2 {
    public boolean f45278b;
    public int f45279c;
    public Bitmap d;
    public Bitmap f45280e;
    public Bitmap f45281f;
    public Bitmap f45282g;
    public float f45284j;
    public float f45285k;
    public int f45288n;
    public float[] f45289o;
    public final Paint f45292r;
    public final Paint f45293s;
    public final o2 f45294t;
    public final e6 f45277a = new e6(0.0f, (View) null, 0, 320, pr.h);
    public final RectF h = new RectF();
    public final RectF f45283i = new RectF();
    public final Path f45286l = new Path();
    public final Path f45287m = new Path();
    public final Paint f45290p = new Paint(1);
    public final Paint f45291q = new Paint(1);

    public l2(o2 o2Var) {
        this.f45294t = o2Var;
        new Paint(1);
        this.f45292r = new Paint(1);
        this.f45293s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f45282g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f45281f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f45280e;
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
