package tg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.nr;
public final class c2 {
    public boolean f57755b;
    public int f57756c;
    public Bitmap d;
    public Bitmap f57757e;
    public Bitmap f57758f;
    public Bitmap f57759g;
    public float f57761j;
    public float f57762k;
    public int f57765n;
    public float[] f57766o;
    public final Paint f57769r;
    public final Paint f57770s;
    public final f2 f57771t;
    public final d6 f57754a = new d6(0.0f, (View) null, 0, 320, nr.h);
    public final RectF h = new RectF();
    public final RectF f57760i = new RectF();
    public final Path f57763l = new Path();
    public final Path f57764m = new Path();
    public final Paint f57767p = new Paint(1);
    public final Paint f57768q = new Paint(1);

    public c2(f2 f2Var) {
        this.f57771t = f2Var;
        new Paint(1);
        this.f57769r = new Paint(1);
        this.f57770s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f57759g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f57758f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f57757e;
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
