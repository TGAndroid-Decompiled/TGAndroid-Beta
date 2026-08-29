package vf;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
public class f {
    public final uf.a f49572a;
    public final Paint f49573b;
    public final Paint f49574c;
    public final Paint d;
    public final Path f49575e;
    public final Path f49576f;
    public final Path f49577g;
    public ValueAnimator h;
    public ValueAnimator f49578i;
    public int f49579j;
    public final float[] f49580k;
    public final float[] f49581l;
    public int f49582m;
    public boolean f49583n;
    public float f49584o;
    public final c6 f49585p;

    public f(uf.a aVar, boolean z10, c6 c6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f49573b = paint;
        Paint paint2 = new Paint(1);
        this.f49574c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f49575e = new Path();
        this.f49576f = new Path();
        this.f49577g = new Path();
        this.f49583n = true;
        this.f49584o = 1.0f;
        this.f49585p = c6Var;
        this.f49572a = aVar;
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!tf.g.f48249w1) {
            paint2.setStrokeJoin(Paint.Join.ROUND);
        }
        paint2.setColor(aVar.h);
        paint.setStrokeWidth(AndroidUtilities.dpf2(1.0f));
        paint.setStyle(style);
        paint.setColor(aVar.h);
        paint3.setStrokeWidth(AndroidUtilities.dpf2(10.0f));
        paint3.setStyle(style);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(aVar.h);
        long[] jArr = aVar.f49190a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f49580k = new float[length];
        long[] jArr2 = aVar.f49190a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f49581l = new float[length2];
    }

    public void a() {
        int i10;
        uf.a aVar = this.f49572a;
        int i11 = aVar.f49195g;
        c6 c6Var = this.f49585p;
        if (i11 >= 0 && g6.c1(i11)) {
            this.f49582m = g6.v0(aVar.f49195g, c6Var);
        } else {
            if (i0.a.f(g6.v0(g6.f23062d6, c6Var)) < 0.5d) {
                i10 = aVar.f49196i;
            } else {
                i10 = aVar.h;
            }
            this.f49582m = i10;
        }
        this.f49574c.setColor(this.f49582m);
        this.f49573b.setColor(this.f49582m);
        this.d.setColor(this.f49582m);
    }
}
