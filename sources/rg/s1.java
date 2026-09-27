package rg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class s1 {
    public float f42793a;
    public float f42794b;
    public float f42795c;
    public float d;
    public long e;
    public float f42796f;
    public final t1 f42797g;

    public s1(t1 t1Var) {
        this.f42797g = t1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        t1 t1Var = this.f42797g;
        RectF rectF2 = t1Var.f42799a;
        this.e = j3 + t1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = t1Var.f42800b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f42793a = abs;
        this.f42794b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f42794b - rectF2.centerY());
        this.f42795c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f42796f = 0.0f;
    }
}
