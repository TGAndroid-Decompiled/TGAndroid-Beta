package sg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class s1 {
    public float f46430a;
    public float f46431b;
    public float f46432c;
    public float d;
    public long e;
    public float f46433f;
    public final t1 f46434g;

    public s1(t1 t1Var) {
        this.f46434g = t1Var;
    }

    public final void a(long j10, boolean z10) {
        RectF rectF;
        t1 t1Var = this.f46434g;
        RectF rectF2 = t1Var.f46436a;
        this.e = j10 + t1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = t1Var.f46437b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f46430a = abs;
        this.f46431b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f46431b - rectF2.centerY());
        this.f46432c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f46433f = 0.0f;
    }
}
