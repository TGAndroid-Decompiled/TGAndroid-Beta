package rg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class s1 {
    public float f47479a;
    public float f47480b;
    public float f47481c;
    public float d;
    public long f47482e;
    public float f47483f;
    public final t1 f47484g;

    public s1(t1 t1Var) {
        this.f47484g = t1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        t1 t1Var = this.f47484g;
        RectF rectF2 = t1Var.f47487a;
        this.f47482e = j3 + t1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = t1Var.f47488b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f47479a = abs;
        this.f47480b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f47480b - rectF2.centerY());
        this.f47481c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f47483f = 0.0f;
    }
}
