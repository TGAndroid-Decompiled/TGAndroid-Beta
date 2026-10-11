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
    public boolean f46405b;
    public int f46406c;
    public Bitmap d;
    public Bitmap f46407e;
    public Bitmap f46408f;
    public Bitmap f46409g;
    public float f46411j;
    public float f46412k;
    public int f46415n;
    public float[] f46416o;
    public final Paint f46419r;
    public final Paint f46420s;
    public final n2 f46421t;
    public final g6 f46404a = new g6(0.0f, (View) null, 0, 320, is.h);
    public final RectF h = new RectF();
    public final RectF f46410i = new RectF();
    public final Path f46413l = new Path();
    public final Path f46414m = new Path();
    public final Paint f46417p = new Paint(1);
    public final Paint f46418q = new Paint(1);

    public k2(n2 n2Var) {
        this.f46421t = n2Var;
        new Paint(1);
        this.f46419r = new Paint(1);
        this.f46420s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f46409g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f46408f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f46407e;
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
