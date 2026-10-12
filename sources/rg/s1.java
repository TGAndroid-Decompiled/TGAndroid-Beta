package rg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class s1 {
    public float f47651a;
    public float f47652b;
    public float f47653c;
    public float d;
    public long f47654e;
    public float f47655f;
    public final t1 f47656g;

    public s1(t1 t1Var) {
        this.f47656g = t1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        t1 t1Var = this.f47656g;
        RectF rectF2 = t1Var.f47657a;
        this.f47654e = j3 + t1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = t1Var.f47658b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f47651a = abs;
        this.f47652b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f47652b - rectF2.centerY());
        this.f47653c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f47655f = 0.0f;
    }
}
