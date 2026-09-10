package pg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.wr;
public final class k2 {
    public boolean f40076b;
    public int f40077c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f40078f;
    public Bitmap f40079g;
    public float f40081j;
    public float f40082k;
    public int f40085n;
    public float[] f40086o;
    public final Paint f40089r;
    public final Paint f40090s;
    public final n2 f40091t;
    public final d6 f40075a = new d6(0.0f, (View) null, 0, 320, wr.h);
    public final RectF h = new RectF();
    public final RectF f40080i = new RectF();
    public final Path f40083l = new Path();
    public final Path f40084m = new Path();
    public final Paint f40087p = new Paint(1);
    public final Paint f40088q = new Paint(1);

    public k2(n2 n2Var) {
        this.f40091t = n2Var;
        new Paint(1);
        this.f40089r = new Paint(1);
        this.f40090s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f40079g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f40078f;
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
