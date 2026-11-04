package vg;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class p1 {
    public float f56778a;
    public float f56779b;
    public float f56780c;
    public float d;
    public long f56781e;
    public float f56782f;
    public final q1 f56783g;

    public p1(q1 q1Var) {
        this.f56783g = q1Var;
    }

    public final void a(long j10, boolean z10) {
        RectF rectF;
        q1 q1Var = this.f56783g;
        RectF rectF2 = q1Var.f56791a;
        long j11 = j10 + q1Var.h;
        f5.a aVar = Utilities.f21386c;
        this.f56781e = j11 + aVar.nextInt(1000);
        if (z10) {
            rectF = q1Var.f56792b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f56778a = abs;
        this.f56779b = Math.abs(((int) aVar.nextLong()) % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f56779b - rectF2.centerY());
        this.f56780c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f56782f = 0.0f;
    }
}
