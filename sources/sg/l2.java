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
public final class l2 {
    public boolean f48340b;
    public int f48341c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f48342f;
    public Bitmap f48343g;
    public float f48345j;
    public float f48346k;
    public int f48349n;
    public float[] f48350o;
    public final Paint f48353r;
    public final Paint f48354s;
    public final o2 f48355t;
    public final h6 f48339a = new h6(0.0f, (View) null, 0, 320, ds.h);
    public final RectF h = new RectF();
    public final RectF f48344i = new RectF();
    public final Path f48347l = new Path();
    public final Path f48348m = new Path();
    public final Paint f48351p = new Paint(1);
    public final Paint f48352q = new Paint(1);

    public l2(o2 o2Var) {
        this.f48355t = o2Var;
        new Paint(1);
        this.f48353r = new Paint(1);
        this.f48354s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f48343g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f48342f;
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
