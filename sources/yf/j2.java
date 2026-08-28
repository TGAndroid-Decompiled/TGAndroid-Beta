package yf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y5;
public final class j2 {
    public boolean f49878b;
    public int f49879c;
    public Bitmap d;
    public Bitmap f49880e;
    public Bitmap f49881f;
    public Bitmap f49882g;
    public float f49884j;
    public float f49885k;
    public int f49888n;
    public float[] f49889o;
    public final Paint f49892r;
    public final Paint f49893s;
    public final m2 f49894t;
    public final y5 f49877a = new y5(0.0f, (View) null, 0, 320, gr.h);
    public final RectF h = new RectF();
    public final RectF f49883i = new RectF();
    public final Path f49886l = new Path();
    public final Path f49887m = new Path();
    public final Paint f49890p = new Paint(1);
    public final Paint f49891q = new Paint(1);

    public j2(m2 m2Var) {
        this.f49894t = m2Var;
        new Paint(1);
        this.f49892r = new Paint(1);
        this.f49893s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f49882g;
        if (bitmap != null) {
            return bitmap;
        }
        return this.f49881f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f49880e;
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
