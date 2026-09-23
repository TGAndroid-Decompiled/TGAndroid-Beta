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
public final class m2 {
    public boolean f41410b;
    public int f41411c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f41412f;
    public Bitmap f41413g;
    public float f41415j;
    public float f41416k;
    public int f41419n;
    public float[] f41420o;
    public final Paint f41423r;
    public final Paint f41424s;
    public final p2 f41425t;
    public final e6 f41409a = new e6(0.0f, (View) null, 0, 320, rr.h);
    public final RectF h = new RectF();
    public final RectF f41414i = new RectF();
    public final Path f41417l = new Path();
    public final Path f41418m = new Path();
    public final Paint f41421p = new Paint(1);
    public final Paint f41422q = new Paint(1);

    public m2(p2 p2Var) {
        this.f41425t = p2Var;
        new Paint(1);
        this.f41423r = new Paint(1);
        this.f41424s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f41413g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f41412f;
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
