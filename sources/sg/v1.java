package sg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class v1 {
    public float f46328a;
    public float f46329b;
    public float f46330c;
    public float d;
    public long f46331e;
    public float f46332f;
    public final w1 f46333g;

    public v1(w1 w1Var) {
        this.f46333g = w1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        w1 w1Var = this.f46333g;
        RectF rectF2 = w1Var.f46337a;
        this.f46331e = j3 + w1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = w1Var.f46338b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f46328a = abs;
        this.f46329b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f46329b - rectF2.centerY());
        this.f46330c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f46332f = 0.0f;
    }
}
