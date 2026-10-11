package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.g6;
import org.telegram.ui.Components.is;
public final class k2 {
    public boolean f46439b;
    public int f46440c;
    public Bitmap d;
    public Bitmap f46441e;
    public Bitmap f46442f;
    public Bitmap f46443g;
    public float f46445j;
    public float f46446k;
    public int f46449n;
    public float[] f46450o;
    public final Paint f46453r;
    public final Paint f46454s;
    public final n2 f46455t;
    public final g6 f46438a = new g6(0.0f, (View) null, 0, 320, is.h);
    public final RectF h = new RectF();
    public final RectF f46444i = new RectF();
    public final Path f46447l = new Path();
    public final Path f46448m = new Path();
    public final Paint f46451p = new Paint(1);
    public final Paint f46452q = new Paint(1);

    public k2(n2 n2Var) {
        this.f46455t = n2Var;
        new Paint(1);
        this.f46453r = new Paint(1);
        this.f46454s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f46443g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f46442f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f46441e;
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
