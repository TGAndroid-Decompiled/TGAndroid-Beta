package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class p1 {
    public float f58864a;
    public float f58865b;
    public float f58866c;
    public float d;
    public long f58867e;
    public float f58868f;
    public final q1 f58869g;

    public p1(q1 q1Var) {
        this.f58869g = q1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        q1 q1Var = this.f58869g;
        RectF rectF2 = q1Var.f58877a;
        long j10 = j3 + q1Var.h;
        g5.a aVar = Utilities.f22806c;
        this.f58867e = j10 + aVar.nextInt(1000);
        if (z10) {
            rectF = q1Var.f58878b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f58864a = abs;
        this.f58865b = Math.abs(((int) aVar.nextLong()) % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f58865b - rectF2.centerY());
        this.f58866c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f58868f = 0.0f;
    }
}
