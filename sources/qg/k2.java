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
import org.telegram.ui.Components.sr;
public final class k2 {
    public boolean f41712b;
    public int f41713c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f41714f;
    public Bitmap f41715g;
    public float f41717j;
    public float f41718k;
    public int f41721n;
    public float[] f41722o;
    public final Paint f41725r;
    public final Paint f41726s;
    public final n2 f41727t;
    public final e6 f41711a = new e6(0.0f, (View) null, 0, 320, sr.h);
    public final RectF h = new RectF();
    public final RectF f41716i = new RectF();
    public final Path f41719l = new Path();
    public final Path f41720m = new Path();
    public final Paint f41723p = new Paint(1);
    public final Paint f41724q = new Paint(1);

    public k2(n2 n2Var) {
        this.f41727t = n2Var;
        new Paint(1);
        this.f41725r = new Paint(1);
        this.f41726s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f41715g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f41714f;
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
