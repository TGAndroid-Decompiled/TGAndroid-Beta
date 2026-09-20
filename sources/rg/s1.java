package rg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class s1 {
    public float f42762a;
    public float f42763b;
    public float f42764c;
    public float d;
    public long e;
    public float f42765f;
    public final t1 f42766g;

    public s1(t1 t1Var) {
        this.f42766g = t1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        t1 t1Var = this.f42766g;
        RectF rectF2 = t1Var.f42768a;
        this.e = j3 + t1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = t1Var.f42769b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f42762a = abs;
        this.f42763b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f42763b - rectF2.centerY());
        this.f42764c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f42765f = 0.0f;
    }
}
