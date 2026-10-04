package rg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class u1 {
    public float f46309a;
    public float f46310b;
    public float f46311c;
    public float d;
    public long f46312e;
    public float f46313f;
    public final v1 f46314g;

    public u1(v1 v1Var) {
        this.f46314g = v1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        v1 v1Var = this.f46314g;
        RectF rectF2 = v1Var.f46321a;
        this.f46312e = j3 + v1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = v1Var.f46322b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f46309a = abs;
        this.f46310b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f46310b - rectF2.centerY());
        this.f46311c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f46313f = 0.0f;
    }
}
