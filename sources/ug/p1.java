package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class p1 {
    public float f58948a;
    public float f58949b;
    public float f58950c;
    public float d;
    public long f58951e;
    public float f58952f;
    public final q1 f58953g;

    public p1(q1 q1Var) {
        this.f58953g = q1Var;
    }

    public final void a(long j3, boolean z10) {
        RectF rectF;
        q1 q1Var = this.f58953g;
        RectF rectF2 = q1Var.f58961a;
        long j10 = j3 + q1Var.h;
        g5.a aVar = Utilities.f22876c;
        this.f58951e = j10 + aVar.nextInt(1000);
        if (z10) {
            rectF = q1Var.f58962b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f58948a = abs;
        this.f58949b = Math.abs(((int) aVar.nextLong()) % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f58949b - rectF2.centerY());
        this.f58950c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f58952f = 0.0f;
    }
}
