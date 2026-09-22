package rg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class r1 {
    public float f42448a;
    public float f42449b;
    public float f42450c;
    public float d;
    public long e;
    public float f42451f;
    public final s1 f42452g;

    public r1(s1 s1Var) {
        this.f42452g = s1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        s1 s1Var = this.f42452g;
        RectF rectF2 = s1Var.f42463a;
        this.e = j3 + s1Var.h + Utilities.fastRandom.nextInt(1000);
        if (z10) {
            rectF = s1Var.f42464b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(Utilities.fastRandom.nextInt() % rectF.width()) + rectF.left;
        float f7 = rectF.top;
        this.f42448a = abs;
        this.f42449b = Math.abs(Utilities.fastRandom.nextInt() % rectF.height()) + f7;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f42449b - rectF2.centerY());
        this.f42450c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        Utilities.fastRandom.nextInt(50);
        this.f42451f = 0.0f;
    }
}
