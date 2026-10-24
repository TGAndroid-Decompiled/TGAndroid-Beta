package sg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class t1 {
    public float f46867a;
    public float f46868b;
    public float f46869c;
    public float d;
    public long e;
    public float f46870f;
    public final u1 f46871g;

    public t1(u1 u1Var) {
        this.f46871g = u1Var;
    }

    public final void a(long j10, boolean z10) {
        RectF rectF;
        u1 u1Var = this.f46871g;
        RectF rectF2 = u1Var.f46875a;
        this.e = j10 + u1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = u1Var.f46876b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f46867a = abs;
        this.f46868b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f46868b - rectF2.centerY());
        this.f46869c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f46870f = 0.0f;
    }
}
