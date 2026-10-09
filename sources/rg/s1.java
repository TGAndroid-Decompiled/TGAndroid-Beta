package rg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class s1 {
    public float f47435a;
    public float f47436b;
    public float f47437c;
    public float d;
    public long f47438e;
    public float f47439f;
    public final t1 f47440g;

    public s1(t1 t1Var) {
        this.f47440g = t1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        t1 t1Var = this.f47440g;
        RectF rectF2 = t1Var.f47443a;
        this.f47438e = j3 + t1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = t1Var.f47444b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f47435a = abs;
        this.f47436b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f47436b - rectF2.centerY());
        this.f47437c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f47439f = 0.0f;
    }
}
