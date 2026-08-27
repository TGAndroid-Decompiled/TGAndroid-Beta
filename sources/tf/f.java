package tf;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

public class f {

    public final sf.a f48195a;

    public final Paint f48196b;

    public final Paint f48197c;
    public final Paint d;

    public final Path f48198e;

    public final Path f48199f;

    public final Path f48200g;
    public ValueAnimator h;

    public ValueAnimator f48201i;

    public int f48202j;

    public final float[] f48203k;

    public final float[] f48204l;

    public int f48205m;

    public boolean f48206n;

    public float f48207o;

    public final c6 f48208p;

    public f(sf.a aVar, boolean z10, c6 c6Var) {
        Paint paint = new Paint(1);
        this.f48196b = paint;
        Paint paint2 = new Paint(1);
        this.f48197c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f48198e = new Path();
        this.f48199f = new Path();
        this.f48200g = new Path();
        this.f48206n = true;
        this.f48207o = 1.0f;
        this.f48208p = c6Var;
        this.f48195a = aVar;
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!rf.g.f46949w1) {
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
        long[] jArr = aVar.f47874a;
        this.f48203k = new float[z10 ? jArr.length * 8 : jArr.length << 2];
        long[] jArr2 = aVar.f47874a;
        this.f48204l = new float[z10 ? jArr2.length * 8 : jArr2.length << 2];
    }

    public void a() {
        sf.a aVar = this.f48195a;
        int i10 = aVar.f47879g;
        c6 c6Var = this.f48208p;
        if (i10 < 0 || !g6.c1(i10)) {
            this.f48205m = i0.b.f(g6.v0(g6.f23053d6, c6Var)) < 0.5d ? aVar.f47880i : aVar.h;
        } else {
            this.f48205m = g6.v0(aVar.f47879g, c6Var);
        }
        this.f48197c.setColor(this.f48205m);
        this.f48196b.setColor(this.f48205m);
        this.d.setColor(this.f48205m);
    }
}
