package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class q1 {
    public float f58832a;
    public float f58833b;
    public float f58834c;
    public float d;
    public long f58835e;
    public float f58836f;
    public final r1 f58837g;

    public q1(r1 r1Var) {
        this.f58837g = r1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        r1 r1Var = this.f58837g;
        RectF rectF2 = r1Var.f58851a;
        long j10 = j3 + r1Var.h;
        g5.a aVar = Utilities.f22781c;
        this.f58835e = j10 + aVar.nextInt(1000);
        if (z10) {
            rectF = r1Var.f58852b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f58832a = abs;
        this.f58833b = Math.abs(((int) aVar.nextLong()) % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f58833b - rectF2.centerY());
        this.f58834c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f58836f = 0.0f;
    }
}
