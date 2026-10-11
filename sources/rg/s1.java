package rg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class s1 {
    public float f47525a;
    public float f47526b;
    public float f47527c;
    public float d;
    public long f47528e;
    public float f47529f;
    public final t1 f47530g;

    public s1(t1 t1Var) {
        this.f47530g = t1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        t1 t1Var = this.f47530g;
        RectF rectF2 = t1Var.f47533a;
        this.f47528e = j3 + t1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = t1Var.f47534b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f47525a = abs;
        this.f47526b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f47526b - rectF2.centerY());
        this.f47527c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f47529f = 0.0f;
    }
}
