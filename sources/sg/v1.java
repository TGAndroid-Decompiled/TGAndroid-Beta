package sg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class v1 {
    public float f46329a;
    public float f46330b;
    public float f46331c;
    public float d;
    public long f46332e;
    public float f46333f;
    public final w1 f46334g;

    public v1(w1 w1Var) {
        this.f46334g = w1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        w1 w1Var = this.f46334g;
        RectF rectF2 = w1Var.f46338a;
        this.f46332e = j3 + w1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = w1Var.f46339b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f46329a = abs;
        this.f46330b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f46330b - rectF2.centerY());
        this.f46331c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f46333f = 0.0f;
    }
}
