package qg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class t1 {
    public float f40921a;
    public float f40922b;
    public float f40923c;
    public float d;
    public long e;
    public float f40924f;
    public final u1 f40925g;

    public t1(u1 u1Var) {
        this.f40925g = u1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        u1 u1Var = this.f40925g;
        RectF rectF2 = u1Var.f40928a;
        this.e = j3 + u1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = u1Var.f40929b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f40921a = abs;
        this.f40922b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f40922b - rectF2.centerY());
        this.f40923c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f40924f = 0.0f;
    }
}
