package rg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class s1 {
    public float f47559a;
    public float f47560b;
    public float f47561c;
    public float d;
    public long f47562e;
    public float f47563f;
    public final t1 f47564g;

    public s1(t1 t1Var) {
        this.f47564g = t1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        t1 t1Var = this.f47564g;
        RectF rectF2 = t1Var.f47567a;
        this.f47562e = j3 + t1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = t1Var.f47568b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f47559a = abs;
        this.f47560b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f47560b - rectF2.centerY());
        this.f47561c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f47563f = 0.0f;
    }
}
