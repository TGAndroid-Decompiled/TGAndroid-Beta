package yf;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public class f {
    public final xf.a f50921a;
    public final Paint f50922b;
    public final Paint f50923c;
    public final Paint d;
    public final Path f50924e;
    public final Path f50925f;
    public final Path f50926g;
    public ValueAnimator h;
    public ValueAnimator f50927i;
    public int f50928j;
    public final float[] f50929k;
    public final float[] f50930l;
    public int f50931m;
    public boolean f50932n;
    public float f50933o;
    public final g6 f50934p;

    public f(xf.a aVar, boolean z4, g6 g6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f50922b = paint;
        Paint paint2 = new Paint(1);
        this.f50923c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f50924e = new Path();
        this.f50925f = new Path();
        this.f50926g = new Path();
        this.f50932n = true;
        this.f50933o = 1.0f;
        this.f50934p = g6Var;
        this.f50921a = aVar;
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!wf.g.f49538x1) {
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
        long[] jArr = aVar.f50539a;
        if (z4) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f50929k = new float[length];
        long[] jArr2 = aVar.f50539a;
        if (z4) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f50930l = new float[length2];
    }

    public void a() {
        int i10;
        xf.a aVar = this.f50921a;
        int i11 = aVar.f50544g;
        g6 g6Var = this.f50934p;
        if (i11 >= 0 && k6.c1(i11)) {
            this.f50931m = k6.v0(aVar.f50544g, g6Var);
        } else {
            if (i0.a.f(k6.v0(k6.f21659d6, g6Var)) < 0.5d) {
                i10 = aVar.f50545i;
            } else {
                i10 = aVar.h;
            }
            this.f50931m = i10;
        }
        this.f50923c.setColor(this.f50931m);
        this.f50922b.setColor(this.f50931m);
        this.d.setColor(this.f50931m);
    }
}
