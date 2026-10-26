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
    public boolean f48314b;
    public int f48315c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f48316f;
    public Bitmap f48317g;
    public float f48319j;
    public float f48320k;
    public int f48323n;
    public float[] f48324o;
    public final Paint f48327r;
    public final Paint f48328s;
    public final p2 f48329t;
    public final h6 f48313a = new h6(0.0f, (View) null, 0, 320, ds.h);
    public final RectF h = new RectF();
    public final RectF f48318i = new RectF();
    public final Path f48321l = new Path();
    public final Path f48322m = new Path();
    public final Paint f48325p = new Paint(1);
    public final Paint f48326q = new Paint(1);

    public m2(p2 p2Var) {
        this.f48329t = p2Var;
        new Paint(1);
        this.f48327r = new Paint(1);
        this.f48328s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f48317g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f48316f;
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
