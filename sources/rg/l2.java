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
    public boolean f45277b;
    public int f45278c;
    public Bitmap d;
    public Bitmap f45279e;
    public Bitmap f45280f;
    public Bitmap f45281g;
    public float f45283j;
    public float f45284k;
    public int f45287n;
    public float[] f45288o;
    public final Paint f45291r;
    public final Paint f45292s;
    public final o2 f45293t;
    public final e6 f45276a = new e6(0.0f, (View) null, 0, 320, pr.h);
    public final RectF h = new RectF();
    public final RectF f45282i = new RectF();
    public final Path f45285l = new Path();
    public final Path f45286m = new Path();
    public final Paint f45289p = new Paint(1);
    public final Paint f45290q = new Paint(1);

    public l2(o2 o2Var) {
        this.f45293t = o2Var;
        new Paint(1);
        this.f45291r = new Paint(1);
        this.f45292s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f45281g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f45280f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f45279e;
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
