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
    public boolean f41699b;
    public int f41700c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f41701f;
    public Bitmap f41702g;
    public float f41704j;
    public float f41705k;
    public int f41708n;
    public float[] f41709o;
    public final Paint f41712r;
    public final Paint f41713s;
    public final n2 f41714t;
    public final e6 f41698a = new e6(0.0f, (View) null, 0, 320, rr.h);
    public final RectF h = new RectF();
    public final RectF f41703i = new RectF();
    public final Path f41706l = new Path();
    public final Path f41707m = new Path();
    public final Paint f41710p = new Paint(1);
    public final Paint f41711q = new Paint(1);

    public k2(n2 n2Var) {
        this.f41714t = n2Var;
        new Paint(1);
        this.f41712r = new Paint(1);
        this.f41713s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f41702g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f41701f;
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
