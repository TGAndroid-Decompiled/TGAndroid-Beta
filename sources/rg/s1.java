package rg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class s1 {
    public float f47433a;
    public float f47434b;
    public float f47435c;
    public float d;
    public long f47436e;
    public float f47437f;
    public final t1 f47438g;

    public s1(t1 t1Var) {
        this.f47438g = t1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        t1 t1Var = this.f47438g;
        RectF rectF2 = t1Var.f47441a;
        this.f47436e = j3 + t1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = t1Var.f47442b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f47433a = abs;
        this.f47434b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f47434b - rectF2.centerY());
        this.f47435c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f47437f = 0.0f;
    }
}
