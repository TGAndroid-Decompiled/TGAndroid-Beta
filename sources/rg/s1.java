package rg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class s1 {
    public float f42749a;
    public float f42750b;
    public float f42751c;
    public float d;
    public long e;
    public float f42752f;
    public final t1 f42753g;

    public s1(t1 t1Var) {
        this.f42753g = t1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        t1 t1Var = this.f42753g;
        RectF rectF2 = t1Var.f42755a;
        this.e = j3 + t1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = t1Var.f42756b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f42749a = abs;
        this.f42750b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f42750b - rectF2.centerY());
        this.f42751c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f42752f = 0.0f;
    }
}
