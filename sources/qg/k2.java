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
    public boolean f41715b;
    public int f41716c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f41717f;
    public Bitmap f41718g;
    public float f41720j;
    public float f41721k;
    public int f41724n;
    public float[] f41725o;
    public final Paint f41728r;
    public final Paint f41729s;
    public final n2 f41730t;
    public final e6 f41714a = new e6(0.0f, (View) null, 0, 320, sr.h);
    public final RectF h = new RectF();
    public final RectF f41719i = new RectF();
    public final Path f41722l = new Path();
    public final Path f41723m = new Path();
    public final Paint f41726p = new Paint(1);
    public final Paint f41727q = new Paint(1);

    public k2(n2 n2Var) {
        this.f41730t = n2Var;
        new Paint(1);
        this.f41728r = new Paint(1);
        this.f41729s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f41718g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f41717f;
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
