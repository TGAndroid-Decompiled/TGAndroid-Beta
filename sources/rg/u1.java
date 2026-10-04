package rg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class u1 {
    public float f46316a;
    public float f46317b;
    public float f46318c;
    public float d;
    public long f46319e;
    public float f46320f;
    public final v1 f46321g;

    public u1(v1 v1Var) {
        this.f46321g = v1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        v1 v1Var = this.f46321g;
        RectF rectF2 = v1Var.f46328a;
        this.f46319e = j3 + v1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = v1Var.f46329b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f46316a = abs;
        this.f46317b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f46317b - rectF2.centerY());
        this.f46318c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f46320f = 0.0f;
    }
}
