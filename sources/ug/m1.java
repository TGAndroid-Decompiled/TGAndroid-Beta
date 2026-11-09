package ug;

import android.graphics.RectF;
import org.telegram.messenger.Utilities;
public final class m1 {
    public float f56717a;
    public float f56718b;
    public float f56719c;
    public float d;
    public long f56720e;
    public float f56721f;
    public final n1 f56722g;

    public m1(n1 n1Var) {
        this.f56722g = n1Var;
    }

    public final void a(long j3, boolean z9) {
        RectF rectF;
        n1 n1Var = this.f56722g;
        RectF rectF2 = n1Var.f56731a;
        long j10 = j3 + n1Var.h;
        g5.a aVar = Utilities.f21335c;
        this.f56720e = j10 + aVar.nextInt(1000);
        if (z9) {
            rectF = n1Var.f56732b;
        } else {
            rectF = rectF2;
        }
        float abs = Math.abs(((int) aVar.nextLong()) % rectF.width()) + rectF.left;
        float f10 = rectF.top;
        this.f56717a = abs;
        this.f56718b = Math.abs(((int) aVar.nextLong()) % rectF.height()) + f10;
        double atan2 = Math.atan2(abs - rectF2.centerX(), this.f56718b - rectF2.centerY());
        this.f56719c = (float) Math.sin(atan2);
        this.d = (float) Math.cos(atan2);
        aVar.nextInt(50);
        this.f56721f = 0.0f;
    }
}
