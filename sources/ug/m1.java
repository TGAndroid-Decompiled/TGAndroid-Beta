package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class m1 {
    public float f56613a;
    public float f56614b;
    public float f56615c;
    public float d;
    public long f56616e;
    public float f56617f;
    public final n1 f56618g;

    public m1(n1 n1Var) {
        this.f56618g = n1Var;
    }

    public final void a(long j3, boolean z9) {
        RectF rectF;
        n1 n1Var = this.f56618g;
        RectF rectF2 = n1Var.f56627a;
        long j10 = j3 + n1Var.h;
        g5.a aVar = Utilities.f21332c;
        this.f56616e = j10 + aVar.nextInt(1000);
        if (z9) {
            rectF = n1Var.f56628b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f56613a = abs;
        this.f56614b = Math.abs(((int) aVar.nextLong()) % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f56614b - rectF2.centerY());
        this.f56615c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f56617f = 0.0f;
    }
}
