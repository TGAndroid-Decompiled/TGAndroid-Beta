package sg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class v1 {
    public float f46300a;
    public float f46301b;
    public float f46302c;
    public float d;
    public long f46303e;
    public float f46304f;
    public final w1 f46305g;

    public v1(w1 w1Var) {
        this.f46305g = w1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        w1 w1Var = this.f46305g;
        RectF rectF2 = w1Var.f46309a;
        this.f46303e = j3 + w1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = w1Var.f46310b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f46300a = abs;
        this.f46301b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f46301b - rectF2.centerY());
        this.f46302c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f46304f = 0.0f;
    }
}
