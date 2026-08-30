package xf;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
public class f {
    public final wf.a f46949a;
    public final Paint f46950b;
    public final Paint f46951c;
    public final Paint d;
    public final Path e;
    public final Path f46952f;
    public final Path f46953g;
    public ValueAnimator h;
    public ValueAnimator f46954i;
    public int f46955j;
    public final float[] f46956k;
    public final float[] f46957l;
    public int f46958m;
    public boolean f46959n;
    public float f46960o;
    public final f6 f46961p;

    public f(wf.a aVar, boolean z4, f6 f6Var) {
        int length;
        int length2;
        Paint paint = new Paint(1);
        this.f46950b = paint;
        Paint paint2 = new Paint(1);
        this.f46951c = paint2;
        Paint paint3 = new Paint(1);
        this.d = paint3;
        this.e = new Path();
        this.f46952f = new Path();
        this.f46953g = new Path();
        this.f46959n = true;
        this.f46960o = 1.0f;
        this.f46961p = f6Var;
        this.f46949a = aVar;
        paint2.setStrokeWidth(AndroidUtilities.dpf2(2.0f));
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        if (!vf.g.f45701x1) {
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
        long[] jArr = aVar.f46531a;
        if (z4) {
            length = jArr.length * 8;
        } else {
            length = jArr.length << 2;
        }
        this.f46956k = new float[length];
        long[] jArr2 = aVar.f46531a;
        if (z4) {
            length2 = jArr2.length * 8;
        } else {
            length2 = jArr2.length << 2;
        }
        this.f46957l = new float[length2];
    }

    public void a() {
        int i10;
        wf.a aVar = this.f46949a;
        int i11 = aVar.f46535g;
        f6 f6Var = this.f46961p;
        if (i11 >= 0 && j6.c1(i11)) {
            this.f46958m = j6.v0(aVar.f46535g, f6Var);
        } else {
            if (i0.a.f(j6.v0(j6.f19906d6, f6Var)) < 0.5d) {
                i10 = aVar.f46536i;
            } else {
                i10 = aVar.h;
            }
            this.f46958m = i10;
        }
        this.f46951c.setColor(this.f46958m);
        this.f46950b.setColor(this.f46958m);
        this.d.setColor(this.f46958m);
    }
}
