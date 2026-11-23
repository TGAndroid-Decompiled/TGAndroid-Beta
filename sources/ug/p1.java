package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class p1 {
    public float f58868a;
    public float f58869b;
    public float f58870c;
    public float d;
    public long f58871e;
    public float f58872f;
    public final q1 f58873g;

    public p1(q1 q1Var) {
        this.f58873g = q1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        q1 q1Var = this.f58873g;
        RectF rectF2 = q1Var.f58881a;
        long j10 = j3 + q1Var.h;
        g5.a aVar = Utilities.f22809c;
        this.f58871e = j10 + aVar.nextInt(1000);
        if (z10) {
            rectF = q1Var.f58882b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f58868a = abs;
        this.f58869b = Math.abs(((int) aVar.nextLong()) % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f58869b - rectF2.centerY());
        this.f58870c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f58872f = 0.0f;
    }
}
