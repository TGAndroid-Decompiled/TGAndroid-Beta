package qg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.qr;
public final class k2 {
    public boolean f41727b;
    public int f41728c;
    public Bitmap d;
    public Bitmap e;
    public Bitmap f41729f;
    public Bitmap f41730g;
    public float f41732j;
    public float f41733k;
    public int f41736n;
    public float[] f41737o;
    public final Paint f41740r;
    public final Paint f41741s;
    public final n2 f41742t;
    public final d6 f41726a = new d6(0.0f, (View) null, 0, 320, qr.h);
    public final RectF h = new RectF();
    public final RectF f41731i = new RectF();
    public final Path f41734l = new Path();
    public final Path f41735m = new Path();
    public final Paint f41738p = new Paint(1);
    public final Paint f41739q = new Paint(1);

    public k2(n2 n2Var) {
        this.f41742t = n2Var;
        new Paint(1);
        this.f41740r = new Paint(1);
        this.f41741s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f41730g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f41729f;
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
