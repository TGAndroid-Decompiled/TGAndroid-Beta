package yf;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
public class f {
    public final xf.a f50922a;
    public final Paint f50923b;
    public final Paint f50924c;
    public final Paint d;
    public final Path f50925e;
    public final Path f50926f;
    public final Path f50927g;
    public ValueAnimator h;
    public ValueAnimator f50928i;
    public int f50929j;
    public final float[] f50930k;
    public final float[] f50931l;
    public int f50932m;
    public boolean f50933n;
    public float f50934o;
    public final g6 f50935p;

    public f(xf.a aVar, boolean z4, g6 g6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f50923b = paint;
        Paint paint2 = new Paint(1);
        this.f50924c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f50925e = new Path();
        this.f50926f = new Path();
        this.f50927g = new Path();
        this.f50933n = true;
        this.f50934o = 1.0f;
        this.f50935p = g6Var;
        this.f50922a = aVar;
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!wf.g.f49539x1) {
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
        long[] jArr = aVar.f50540a;
        if (z4) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f50930k = new float[length];
        long[] jArr2 = aVar.f50540a;
        if (z4) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f50931l = new float[length2];
    }

    public void a() {
        int i10;
        xf.a aVar = this.f50922a;
        int i11 = aVar.f50545g;
        g6 g6Var = this.f50935p;
        if (i11 >= 0 && k6.c1(i11)) {
            this.f50932m = k6.v0(aVar.f50545g, g6Var);
        } else {
            if (i0.a.f(k6.v0(k6.f21659d6, g6Var)) < 0.5d) {
                i10 = aVar.f50546i;
            } else {
                i10 = aVar.h;
            }
            this.f50932m = i10;
        }
        this.f50924c.setColor(this.f50932m);
        this.f50923b.setColor(this.f50932m);
        this.d.setColor(this.f50932m);
    }
}
