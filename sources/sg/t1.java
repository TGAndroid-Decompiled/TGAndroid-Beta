package sg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class t1 {
    public float f46437a;
    public float f46438b;
    public float f46439c;
    public float d;
    public long e;
    public float f46440f;
    public final u1 f46441g;

    public t1(u1 u1Var) {
        this.f46441g = u1Var;
    }

    public final void a(long j10, boolean z10) {
        RectF rectF;
        u1 u1Var = this.f46441g;
        RectF rectF2 = u1Var.f46445a;
        this.e = j10 + u1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = u1Var.f46446b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f46437a = abs;
        this.f46438b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f46438b - rectF2.centerY());
        this.f46439c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f46440f = 0.0f;
    }
}
