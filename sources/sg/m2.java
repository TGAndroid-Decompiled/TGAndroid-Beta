package sg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.h6;
public final class m2 {
    public boolean f48311b;
    public int f48312c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f48313f;
    public Bitmap f48314g;
    public float f48316j;
    public float f48317k;
    public int f48320n;
    public float[] f48321o;
    public final Paint f48324r;
    public final Paint f48325s;
    public final p2 f48326t;
    public final h6 f48310a = new h6(0.0f, (View) null, 0, 320, ds.h);
    public final RectF h = new RectF();
    public final RectF f48315i = new RectF();
    public final Path f48318l = new Path();
    public final Path f48319m = new Path();
    public final Paint f48322p = new Paint(1);
    public final Paint f48323q = new Paint(1);

    public m2(p2 p2Var) {
        this.f48326t = p2Var;
        new Paint(1);
        this.f48324r = new Paint(1);
        this.f48325s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f48314g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f48313f;
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
