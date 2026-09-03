package xf;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class f {
    public final wf.a f47045a;
    public final Paint f47046b;
    public final Paint f47047c;
    public final Paint d;
    public final Path e;
    public final Path f47048f;
    public final Path f47049g;
    public ValueAnimator h;
    public ValueAnimator f47050i;
    public int f47051j;
    public final float[] f47052k;
    public final float[] f47053l;
    public int f47054m;
    public boolean f47055n;
    public float f47056o;
    public final f6 f47057p;

    public f(wf.a aVar, boolean z4, f6 f6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f47046b = paint;
        Paint paint2 = new Paint(1);
        this.f47047c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f47048f = new Path();
        this.f47049g = new Path();
        this.f47055n = true;
        this.f47056o = 1.0f;
        this.f47057p = f6Var;
        this.f47045a = aVar;
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!vf.g.f45779x1) {
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
        long[] jArr = aVar.f46600a;
        if (z4) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f47052k = new float[length];
        long[] jArr2 = aVar.f46600a;
        if (z4) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f47053l = new float[length2];
    }

    public void a() {
        int i10;
        wf.a aVar = this.f47045a;
        int i11 = aVar.f46604g;
        f6 f6Var = this.f47057p;
        if (i11 >= 0 && j6.c1(i11)) {
            this.f47054m = j6.v0(aVar.f46604g, f6Var);
        } else {
            if (i0.a.f(j6.v0(j6.f19881d6, f6Var)) < 0.5d) {
                i10 = aVar.f46605i;
            } else {
                i10 = aVar.h;
            }
            this.f47054m = i10;
        }
        this.f47047c.setColor(this.f47054m);
        this.f47046b.setColor(this.f47054m);
        this.d.setColor(this.f47054m);
    }
}
