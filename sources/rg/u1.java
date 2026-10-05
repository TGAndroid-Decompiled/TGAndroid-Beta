package rg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class u1 {
    public float f46323a;
    public float f46324b;
    public float f46325c;
    public float d;
    public long f46326e;
    public float f46327f;
    public final v1 f46328g;

    public u1(v1 v1Var) {
        this.f46328g = v1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        v1 v1Var = this.f46328g;
        RectF rectF2 = v1Var.f46335a;
        this.f46326e = j3 + v1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = v1Var.f46336b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f46323a = abs;
        this.f46324b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f46324b - rectF2.centerY());
        this.f46325c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f46327f = 0.0f;
    }
}
