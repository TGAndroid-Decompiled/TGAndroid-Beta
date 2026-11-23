package tg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.c6;
import org.telegram.ui.Components.kr;
public final class f2 {
    public boolean f57899b;
    public int f57900c;
    public Bitmap d;
    public Bitmap f57901e;
    public Bitmap f57902f;
    public Bitmap f57903g;
    public float f57905j;
    public float f57906k;
    public int f57909n;
    public float[] f57910o;
    public final Paint f57913r;
    public final Paint f57914s;
    public final i2 f57915t;
    public final c6 f57898a = new c6(0.0f, (View) null, 0, 320, kr.h);
    public final RectF h = new RectF();
    public final RectF f57904i = new RectF();
    public final Path f57907l = new Path();
    public final Path f57908m = new Path();
    public final Paint f57911p = new Paint(1);
    public final Paint f57912q = new Paint(1);

    public f2(i2 i2Var) {
        this.f57915t = i2Var;
        new Paint(1);
        this.f57913r = new Paint(1);
        this.f57914s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f57903g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f57902f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f57901e;
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
