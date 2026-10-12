package rg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class s1 {
    public float f47659a;
    public float f47660b;
    public float f47661c;
    public float d;
    public long f47662e;
    public float f47663f;
    public final t1 f47664g;

    public s1(t1 t1Var) {
        this.f47664g = t1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        t1 t1Var = this.f47664g;
        RectF rectF2 = t1Var.f47665a;
        this.f47662e = j3 + t1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = t1Var.f47666b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f47659a = abs;
        this.f47660b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f47660b - rectF2.centerY());
        this.f47661c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f47663f = 0.0f;
    }
}
