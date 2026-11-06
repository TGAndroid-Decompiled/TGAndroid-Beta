package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class m1 {
    public float f56588a;
    public float f56589b;
    public float f56590c;
    public float d;
    public long f56591e;
    public float f56592f;
    public final n1 f56593g;

    public m1(n1 n1Var) {
        this.f56593g = n1Var;
    }

    public final void a(long j3, boolean z9) {
        RectF rectF;
        n1 n1Var = this.f56593g;
        RectF rectF2 = n1Var.f56602a;
        long j10 = j3 + n1Var.h;
        g5.a aVar = Utilities.f21332c;
        this.f56591e = j10 + aVar.nextInt(1000);
        if (z9) {
            rectF = n1Var.f56603b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f56588a = abs;
        this.f56589b = Math.abs(((int) aVar.nextLong()) % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f56589b - rectF2.centerY());
        this.f56590c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f56592f = 0.0f;
    }
}
