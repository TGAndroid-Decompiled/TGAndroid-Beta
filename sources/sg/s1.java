package sg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class s1 {
    public float f46450a;
    public float f46451b;
    public float f46452c;
    public float d;
    public long e;
    public float f46453f;
    public final t1 f46454g;

    public s1(t1 t1Var) {
        this.f46454g = t1Var;
    }

    public final void a(long j10, boolean z10) {
        RectF rectF;
        t1 t1Var = this.f46454g;
        RectF rectF2 = t1Var.f46456a;
        this.e = j10 + t1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = t1Var.f46457b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f46450a = abs;
        this.f46451b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f46451b - rectF2.centerY());
        this.f46452c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f46453f = 0.0f;
    }
}
