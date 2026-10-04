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
import org.telegram.ui.Components.tr;
public final class k2 {
    public boolean f45113b;
    public int f45114c;
    public Bitmap d;
    public Bitmap f45115e;
    public Bitmap f45116f;
    public Bitmap f45117g;
    public float f45119j;
    public float f45120k;
    public int f45123n;
    public float[] f45124o;
    public final Paint f45127r;
    public final Paint f45128s;
    public final n2 f45129t;
    public final e6 f45112a = new e6(0.0f, (View) null, 0, 320, tr.h);
    public final RectF h = new RectF();
    public final RectF f45118i = new RectF();
    public final Path f45121l = new Path();
    public final Path f45122m = new Path();
    public final Paint f45125p = new Paint(1);
    public final Paint f45126q = new Paint(1);

    public k2(n2 n2Var) {
        this.f45129t = n2Var;
        new Paint(1);
        this.f45127r = new Paint(1);
        this.f45128s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f45117g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f45116f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f45115e;
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
