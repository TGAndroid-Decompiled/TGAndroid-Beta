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
import org.telegram.ui.Components.hs;
public final class l2 {
    public boolean f46339b;
    public int f46340c;
    public Bitmap d;
    public Bitmap f46341e;
    public Bitmap f46342f;
    public Bitmap f46343g;
    public float f46345j;
    public float f46346k;
    public int f46349n;
    public float[] f46350o;
    public final Paint f46353r;
    public final Paint f46354s;
    public final o2 f46355t;
    public final g6 f46338a = new g6(0.0f, (View) null, 0, 320, hs.h);
    public final RectF h = new RectF();
    public final RectF f46344i = new RectF();
    public final Path f46347l = new Path();
    public final Path f46348m = new Path();
    public final Paint f46351p = new Paint(1);
    public final Paint f46352q = new Paint(1);

    public l2(o2 o2Var) {
        this.f46355t = o2Var;
        new Paint(1);
        this.f46353r = new Paint(1);
        this.f46354s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f46343g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f46342f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f46341e;
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
