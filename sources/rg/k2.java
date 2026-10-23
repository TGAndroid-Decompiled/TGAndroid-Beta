package rg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f6;
public final class k2 {
    public boolean f45430b;
    public int f45431c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f45432f;
    public Bitmap f45433g;
    public float f45435j;
    public float f45436k;
    public int f45439n;
    public float[] f45440o;
    public final Paint f45443r;
    public final Paint f45444s;
    public final n2 f45445t;
    public final f6 f45429a = new f6(0.0f, (View) null, 0, 320, bs.h);
    public final RectF h = new RectF();
    public final RectF f45434i = new RectF();
    public final Path f45437l = new Path();
    public final Path f45438m = new Path();
    public final Paint f45441p = new Paint(1);
    public final Paint f45442q = new Paint(1);

    public k2(n2 n2Var) {
        this.f45445t = n2Var;
        new Paint(1);
        this.f45443r = new Paint(1);
        this.f45444s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f45433g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f45432f;
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
