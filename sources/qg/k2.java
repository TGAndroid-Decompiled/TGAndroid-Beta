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
    public boolean f45106b;
    public int f45107c;
    public Bitmap d;
    public Bitmap f45108e;
    public Bitmap f45109f;
    public Bitmap f45110g;
    public float f45112j;
    public float f45113k;
    public int f45116n;
    public float[] f45117o;
    public final Paint f45120r;
    public final Paint f45121s;
    public final n2 f45122t;
    public final e6 f45105a = new e6(0.0f, (View) null, 0, 320, tr.h);
    public final RectF h = new RectF();
    public final RectF f45111i = new RectF();
    public final Path f45114l = new Path();
    public final Path f45115m = new Path();
    public final Paint f45118p = new Paint(1);
    public final Paint f45119q = new Paint(1);

    public k2(n2 n2Var) {
        this.f45122t = n2Var;
        new Paint(1);
        this.f45120r = new Paint(1);
        this.f45121s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f45110g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f45109f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f45108e;
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
