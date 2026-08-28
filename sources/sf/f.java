package sf;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
public class f {
    public final rf.a f47546a;
    public final Paint f47547b;
    public final Paint f47548c;
    public final Paint d;
    public final Path f47549e;
    public final Path f47550f;
    public final Path f47551g;
    public ValueAnimator h;
    public ValueAnimator f47552i;
    public int f47553j;
    public final float[] f47554k;
    public final float[] f47555l;
    public int f47556m;
    public boolean f47557n;
    public float f47558o;
    public final b6 f47559p;

    public f(rf.a aVar, boolean z10, b6 b6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f47547b = paint;
        Paint paint2 = new Paint(1);
        this.f47548c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.f47549e = new Path();
        this.f47550f = new Path();
        this.f47551g = new Path();
        this.f47557n = true;
        this.f47558o = 1.0f;
        this.f47559p = b6Var;
        this.f47546a = aVar;
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!qf.g.f46190w1) {
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
        long[] jArr = aVar.f47153a;
        if (z10) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f47554k = new float[length];
        long[] jArr2 = aVar.f47153a;
        if (z10) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f47555l = new float[length2];
    }

    public void a() {
        int i9;
        rf.a aVar = this.f47546a;
        int i10 = aVar.f47158g;
        b6 b6Var = this.f47559p;
        if (i10 >= 0 && f6.c1(i10)) {
            this.f47556m = f6.v0(aVar.f47158g, b6Var);
        } else {
            if (i0.a.f(f6.v0(f6.f23001d6, b6Var)) < 0.5d) {
                i9 = aVar.f47159i;
            } else {
                i9 = aVar.h;
            }
            this.f47556m = i9;
        }
        this.f47548c.setColor(this.f47556m);
        this.f47547b.setColor(this.f47556m);
        this.d.setColor(this.f47556m);
    }
}
