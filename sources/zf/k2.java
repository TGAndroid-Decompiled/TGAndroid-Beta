package zf;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.y5;

public final class k2 {

    public boolean f50486b;

    public int f50487c;
    public Bitmap d;

    public Bitmap f50488e;

    public Bitmap f50489f;

    public Bitmap f50490g;

    public float f50492j;

    public float f50493k;

    public int f50496n;

    public float[] f50497o;

    public final Paint f50500r;

    public final Paint f50501s;

    public final n2 f50502t;

    public final y5 f50485a = new y5(0.0f, (View) null, 0, 320, er.h);
    public final RectF h = new RectF();

    public final RectF f50491i = new RectF();

    public final Path f50494l = new Path();

    public final Path f50495m = new Path();

    public final Paint f50498p = new Paint(1);

    public final Paint f50499q = new Paint(1);

    public k2(n2 n2Var) {
        this.f50502t = n2Var;
        new Paint(1);
        this.f50500r = new Paint(1);
        this.f50501s = new Paint(1);
    }

    public final Bitmap a() {
        Bitmap bitmap = this.f50490g;
        return bitmap != null ? bitmap : this.f50489f;
    }

    public final Bitmap b() {
        Bitmap bitmap = this.f50488e;
        return bitmap != null ? bitmap : this.d;
    }

    public final Bitmap c() {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(b().getWidth(), b().getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-16777216);
        Paint paint = new Paint(3);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        canvas.drawBitmap(b(), 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }
}
