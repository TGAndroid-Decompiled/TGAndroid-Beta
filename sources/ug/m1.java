package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class m1 {
    public float f56612a;
    public float f56613b;
    public float f56614c;
    public float d;
    public long f56615e;
    public float f56616f;
    public final n1 f56617g;

    public m1(n1 n1Var) {
        this.f56617g = n1Var;
    }

    public final void a(long j3, boolean z9) {
        RectF rectF;
        n1 n1Var = this.f56617g;
        RectF rectF2 = n1Var.f56626a;
        long j10 = j3 + n1Var.h;
        g5.a aVar = Utilities.f21332c;
        this.f56615e = j10 + aVar.nextInt(1000);
        if (z9) {
            rectF = n1Var.f56627b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f56612a = abs;
        this.f56613b = Math.abs(((int) aVar.nextLong()) % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f56613b - rectF2.centerY());
        this.f56614c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f56616f = 0.0f;
    }
}
