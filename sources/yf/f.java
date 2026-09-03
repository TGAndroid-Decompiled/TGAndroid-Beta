package yf;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public class f {
    public final xf.a f50958a;
    public final Paint f50959b;
    public final Paint f50960c;
    public final Paint d;
    public final Path f50961e;
    public final Path f50962f;
    public final Path f50963g;
    public ValueAnimator h;
    public ValueAnimator f50964i;
    public int f50965j;
    public final float[] f50966k;
    public final float[] f50967l;
    public int f50968m;
    public boolean f50969n;
    public float f50970o;
    public final g6 f50971p;

    public f(xf.a aVar, boolean z4, g6 g6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f50959b = paint;
        Paint paint2 = new Paint(1);
        this.f50960c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f50961e = new Path();
        this.f50962f = new Path();
        this.f50963g = new Path();
        this.f50969n = true;
        this.f50970o = 1.0f;
        this.f50971p = g6Var;
        this.f50958a = aVar;
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!wf.g.f49575x1) {
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
        long[] jArr = aVar.f50576a;
        if (z4) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f50966k = new float[length];
        long[] jArr2 = aVar.f50576a;
        if (z4) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f50967l = new float[length2];
    }

    public void a() {
        int i10;
        xf.a aVar = this.f50958a;
        int i11 = aVar.f50581g;
        g6 g6Var = this.f50971p;
        if (i11 >= 0 && k6.c1(i11)) {
            this.f50968m = k6.v0(aVar.f50581g, g6Var);
        } else {
            if (i0.a.f(k6.v0(k6.f21661d6, g6Var)) < 0.5d) {
                i10 = aVar.f50582i;
            } else {
                i10 = aVar.h;
            }
            this.f50968m = i10;
        }
        this.f50960c.setColor(this.f50968m);
        this.f50959b.setColor(this.f50968m);
        this.d.setColor(this.f50968m);
    }
}
